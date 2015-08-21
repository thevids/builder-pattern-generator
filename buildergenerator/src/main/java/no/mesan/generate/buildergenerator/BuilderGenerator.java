package no.mesan.generate.buildergenerator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.jboss.forge.roaster.model.source.ParameterSource;
import org.xml.sax.SAXException;

public class BuilderGenerator {

    // Init with filepaths etc
    final private String filePathToOldCode;
    final private String newPackage;

    // Produces these source-files
    private JavaClassSource bean;
    private List<JavaClassSource> builders;

    /** Constructor that also does the job of generating the code. Fetch the generated code
     *  by calling the getters. Throws any exception, we want to fail fast as the end-user
     *  is a developer that needs to know if something is going wrong.
     *
     * @param filePathToOldCode
     * @param newPackage
     * @param filePathToOldXmi
     * @throws IOException
     * @throws SAXException
     */
    public BuilderGenerator(String filePathToOldCode,
                            String newPackage,
                            String className) throws IOException, SAXException {
        this.filePathToOldCode = filePathToOldCode;
        this.newPackage = newPackage;

        builders = new ArrayList<>();
        generate(className);
    }

    /**
     * Does the real work of generating domain and mapper classes.
     *
     * @param className Existing base class for entity
     *
     * @throws IOException
     * @throws SAXException
     */
    private void generate(String className) throws IOException {
        // Read existing bean, and make domain-object out of it
        bean = Roaster.parse(JavaClassSource.class, new File(filePathToOldCode + className + ".java"));

        generateBuilder(className);
    }

    private void generateBuilder(final String className)
            throws IOException {

        bean.getMethods().stream().filter(m -> m.isConstructor())
            .forEach(m -> builders.add(makeBuilder(m, className)));
    }


    private JavaClassSource makeBuilder(MethodSource<JavaClassSource> constructor, String className) {
        JavaClassSource builder = Roaster.create(JavaClassSource.class);

        bean.getImports().forEach(imp -> builder.addImport(imp));

        builder.setName(className + "Builder")
                .setPackage(newPackage)
                .getJavaDoc().setText("Builder for " + className);

        for (ParameterSource<JavaClassSource> parm: constructor.getParameters()) {

            builder.addField()
                    .setType(parm.getType().toString())
                    .setName(parm.getName());

            builder.addMethod()
                .setName(parm.getName())
                .setParameters(parm.getType().toString() + " " + parm.getName())
                .setReturnType(builder)
                .setPublic()
                .setBody("this." + parm.getName() +" = " + parm.getName() + "; return this;");
        }

        builder.addMethod()
                .setName("build")
                .setReturnType(bean)
                .setPublic()
                .setBody(bodyOfBuildMethod(constructor));
        return builder;
    }

    private String bodyOfBuildMethod(MethodSource<JavaClassSource> constructor) {
        StringBuilder body = new StringBuilder();
        body.append("return new ")
            .append(constructor.getName())
            .append("(")
            .append(
                constructor.getParameters().stream()
                    .map(p -> p.getName())
                    .collect(Collectors.joining(", \n"))
            )
            .append(");");
        return body.toString();
    }

    public List<JavaClassSource> getBuilders() {
        return builders;
    }
}

