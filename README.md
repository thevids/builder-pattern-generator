# builder-pattern-generator
Takes a domain-class as input and generates code for a builder.

<h2>Install into IDE</h2>
Import into your IDE and update libraries from Maven.

<h2>Test it out</h2>
Test it out by running the BuilderGeneratorRunner class.

In test/java there is an example domain-class called: ReallyLargeDomainThing
The Runner is configured to make a builder for it in the same package. This is all for demonstration purposes.


<h2>Use it</2>
<h3>The easy way</h3>
Modify the BuilderGeneratorRunner to point to your code, the two constants and the "classToGenerateFor" variable. The last one can also be looped through to generate for a whole directory, some code to do that already lies there commented out.

<h3>Use it differently</h3>
Make a rest-service out of it, or a command-line tool. Or maybe a GIU or a IDE plug-in?
All the logic is done in the class BuilderGenerator, and you instansiate one generator per domain-class. Just follow the example from the BuilderGeneratorRunne.
