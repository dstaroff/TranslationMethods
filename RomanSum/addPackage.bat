ECHO OFF

SET SOURCE=.\src\main\java\
SET UTIL=%SOURCE%util\

SET GRAMMARNAME=*.g4
FOR %%f IN (*.g4) DO SET GRAMMARNAME=%%~nf

FOR %%f IN (%UTIL%%GRAMMARNAME%*.java) DO (
    (ECHO package util;) >%%f.new
    TYPE %%f >>%%f.new
    MOVE /y %%f.new %%f
)