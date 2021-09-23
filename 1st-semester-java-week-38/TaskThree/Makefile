JC = javac
JR = java

BIN = bin
JFLAGS = -d ./$(BIN)
CP = -cp ./
SRC = src

Main = Datamatik
#SRC = ./src/Main.java

default:
	make build && make run

build:
	$(JC) $(JFLAGS) $(CP)$(SRC): ./$(SRC)/$(Main).java

run:
	$(JR) $(CP)$(BIN): $(Main)

clear:
	rm $(BIN)/*
