grammar Car;

@parser::members {

private Car car;

public CarParser(TokenStream input, Car car) {
    this(input);
    this.car = car;
}
}

start
:
	'hello' 'world'
;

//Palabras clave
PROGRAM: 'program';
VAR: 'var';
FUNCTION: 'procedure';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
RF: 'run_foward';
RB: 'run_backwards';
TF: 'turn_left';
TR: 'turn_right';
SET_COLOR: 'set_color';
WRITELN: 'writeln';

//Operadores Aritmeticos
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '<>';

ASSIGN: '=';

//Operadores logicos
AND: '&&';
OR: '||';
NOT: '!';

//otros
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
PAR_OPEN: '(';
PAR_CLOSE: ')';
COMMA: ',';

//Constantes
TRUE: 'true';
FALSE: 'false';

STRING: '"'[.^"]*'"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: ('-')?[0-9]+(['.'][0-9]+)?;

WS
:
	[ \t\r\n]+ -> skip
;