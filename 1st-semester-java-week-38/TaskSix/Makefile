JC = javac
JR = java

BIN = bin
JFLAGS = -d ./$(BIN)
CP = -cp ./
SRC = src
Main = ./src/Oops.java
#SRC = ./src/Main.java

default:
	make build && make run

build:
	$(JC) $(JFLAGS) $(CP)$(SRC): $(Main)

run:
	$(JR) $(CP)$(BIN): Oops

clear:
	rm $(BIN)/*
