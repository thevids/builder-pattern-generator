# builder-pattern-generator
Takes a domain-class as input and generates code for a builder.
<p>
It will make one builder per constructor in the domain-class. Use your IDE to make the constructors you need.
<p>
For compilation purposes, only the first builder will get a ".java" suffix, the others will get a ".java.nr.txt" suffix. Which means you have to give them meaningful names maually, but the code is all there.

<h2>Install into IDE</h2>
Import into your IDE and update libraries from Maven.

<h2>Test it out</h2>
Test it out by running the BuilderGeneratorRunner class.

In test/java there is an example domain-class called: ReallyLargeDomainThing.
<br>
The Runner is configured to make a builder for it in the same package. This is all just for demonstration purposes.


<h2>Use it</2>
<h3>The easy way</h3>
Modify the BuilderGeneratorRunner to point to your code, the two constants and the "classToGenerateFor" variable. The last one can also be looped through to generate for a whole directory, some code to do that already lies there commented out.

<h3>Use it differently</h3>
Make a rest-service out of it, or a command-line tool. Or maybe a GUI or a IDE plug-in?
All the logic is done in the class BuilderGenerator, and you have one instance of the generator per domain-class. Just follow the example from the BuilderGeneratorRunner.
