Guesser.class: Guesser.java
	javac -g Guesser.java
Clean:
	rm *.class
run: Guesser.class
	java Guesser
debug: Guesser.class
	jdb Guesser
