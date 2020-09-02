SRC= ./src
CLASS= ./class
JFLAGS = -d "$(CLASS)" -g -sourcepath "$(SRC)" -classpath "$(CLASS)"
JC = javac

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java


CLASSES = \
	src/Couleur.java \
	src/Valeur.java \
	src/Carte.java \
	src/Paquet.java\
	src/Tas.java \
	src/Main.java 

default: classes

classes: $(CLASSES:.java=.class)

run: default
	java -cp $(CLASS) Main

clean:
	$(RM) $(CLASS)/*.class