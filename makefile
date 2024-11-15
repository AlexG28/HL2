all: HL.class

without: without-jjt


HL.class: HL.jjt
	jjtree HL.jjt
	javacc AST/HL.jj
	javac -classpath .:./AST  AST/*.java
	javac -classpath .:./AST  *.java


without-jjt:
	javacc AST/HL.jj
	javac -classpath .:./AST  AST/*.java
	javac -classpath .:./AST  *.java


