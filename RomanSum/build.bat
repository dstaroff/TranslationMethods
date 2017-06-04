ECHO OFF

SET SOURCE=./src/main/java/
SET UTIL=%SOURCE%util/

antlr4 *.g4 -o %UTIL%