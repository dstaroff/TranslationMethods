grammar JavaGrammar;

code : line*;

number : num=NUMBER | var=VARIABLE;
atom: number | '(' expression ')';
unary: '-'? atom;
expression: multiplication | expression ('+' | '-') multiplication;
multiplication: unary | multiplication ('*' | '/' | '%') unary;

boolNumber: boolConst=BOOLCONST | boolVar=VARIABLE;
boolAtom: boolNumber | boolComparison | '(' boolExpression ')';
boolUnary: '!'? boolAtom;
boolExpression: boolMultiplication | boolExpression ('||' | '^') boolMultiplication;
boolMultiplication: boolUnary | boolMultiplication ('&&') boolUnary;
boolComparison: expression BOOLOPERATION expression;

line: assign | declaration | iff | whileLoop | forLoop | print | read;

assign: expressionAssign ';'? | rightIncrement ';'? | leftIncrement ';'? |  operationAssign ';'?;
expressionAssign: VARIABLE '=' (expression | assign);
operationAssign: VARIABLE OPERATION (expression | assign);

leftIncrement: '++'VARIABLE | '--'VARIABLE;
rightIncrement: VARIABLE'++' | VARIABLE'--';

declaration: INT VARIABLE ';'? | INT VARIABLE '=' (expression | assign) ';'?;

forLoop: FOR '(' (assign | declaration)? ';' condition? ';' forAssign? ')' body;
forAssign: assign;
whileLoop: WHILE '(' condition ')' body;
condition: boolExpression;
body: '{' line* '}';

iff: IF '(' boolExpression ')' ifTrue ifFalse?;
ifTrue: '{' line* '}';
ifFalse: (ELSE '{' line* '}');

print: PRINT '(' expression ')' ';';
read: READ '(' VARIABLE ')' ';';

BOOLCONST: 'true' | 'false';
NUMBER : '-'?DIGIT+;
DIGIT: [0-9];

BOOLOPERATION: '==' | '!=' | '<' | '>' | '<=' | '>=';
OPERATION: '+=' | '-=' | '*=' | '/=' | '%=';

INT: 'int';

FOR: 'for';
WHILE: 'while';

IF: 'if';
ELSE: 'else';

PRINT: 'print';
READ: 'read';

VARIABLE: [a-zA-Z][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip ;