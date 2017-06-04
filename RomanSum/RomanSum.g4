grammar RomanSum;

sum returns [String result]: expr { $result = Translator.DecimalToRoman($expr.value); };

expr returns [Integer value]: num { $value = $num.value; }
                            | num ADD expr { $value = $num.value + $expr.value; }
                            ;

num returns [Integer value]: number=ROMAN { $value = Translator.RomanToDecimal($number.text); };

ROMAN: (ONETHOUSAND)* HUNDREDS? TENS? UNITS?;

// --- I, II, III, IV, IX or V VI, VII, VIII
UNITS : ONE ((ONE)* | FIVE  | TEN) | FIVE (ONE)*;

// --- X, XX, XXX, XL, XC or L, LX, LXX, LXXX
TENS  : TEN ((TEN)* | FIFTY | ONEHUNDRED) | FIFTY (TEN)*;

// --- C, CC, CCC, CD, CM or D, DC, DCC, DCCC
HUNDREDS : ONEHUNDRED ((ONEHUNDRED)* | FIVEHUNDRED | ONETHOUSAND) | FIVEHUNDRED (ONEHUNDRED)*;

// --- Atomic
ONE         : 'I';
FIVE        : 'V';
TEN         : 'X';
FIFTY       : 'L';
ONEHUNDRED  : 'C';
FIVEHUNDRED : 'D';
ONETHOUSAND : 'M';
ADD  : 'et';

WS   : [ \t\r\n]+ -> skip;