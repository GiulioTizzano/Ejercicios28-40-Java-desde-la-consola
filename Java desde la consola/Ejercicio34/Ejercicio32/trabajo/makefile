run: jar
	java -jar hCalculo.jar
jar: compile
	jar cfm hCalculo.jar manifest.txt -C lib . -C bin .
compile:
	javac -cp "lib/*" src/hojasCalculo/HojaCalculo.java -d
	bin
	javac -cp "bin:lib/*" src/aplicacion/Principal.java -d
	bin
