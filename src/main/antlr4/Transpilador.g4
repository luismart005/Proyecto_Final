grammar Transpilador;

programa
    : packageDecl? importDecl* classDef EOF
    ;

packageDecl
    : 'package' qualifiedName ';'
    ;

importDecl
    : 'import' 'static'? qualifiedName ('.' '*')? ';'
    ;

qualifiedName
    : anyName ('.' anyName)*
    ;

anyName
    : IDENTIFIER
    | 'assertEquals'
    | 'driver'
    | 'Duration'
    | 'By'
    ;

classDef
    : 'public' 'class' IDENTIFIER '{' miembro* '}'
    ;

miembro
    : campoDecl
    | metodoDef
    ;

campoDecl
    : anyName anyName ';'
    ;

tipo
    : anyName
    ;

metodoDef
    : anotacion
      ('public' | 'private' | 'protected')? 'final'?
      ('void' | tipo) IDENTIFIER '(' params? ')'
      '{' sentencia* '}'
    ;

anotacion
    : '@Test'
    | '@BeforeEach'
    | '@AfterEach'
    ;

params
    : param (',' param)*
    ;

param
    : tipo IDENTIFIER
    ;

sentencia
    : assertSentencia ';'
    | varDecl
    | ifSentencia
    | exprSentencia ';'
    ;

varDecl
    : tipo IDENTIFIER '=' expr ';'
    ;

ifSentencia
    : 'if' '(' ifCond ')' '{' sentencia* '}'
    ;


ifCond
    : anyName '!=' 'null'
    | anyName '==' 'null'
    | expr
    ;

assertSentencia
    : 'assertEquals' '(' expr ',' expr ')'
    ;

exprSentencia
    : asignacion
    | llamada
    ;

asignacion
    : anyName '=' expr
    ;

expr
    : llamada
    | 'new' IDENTIFIER '(' argList? ')'
    | STRING
    | IDENTIFIER
    | 'null'
    ;

llamada
    : receptor accion+
    ;

receptor
    : 'driver'
    | IDENTIFIER
    ;

accion
    : '.' IDENTIFIER '(' argList? ')'
    ;

argList
    : arg (',' arg)*
    ;

arg
    : expr
    | byExpr
    | 'Duration' '.' IDENTIFIER '(' NUMBER ')'
    ;

byExpr
    : 'By' '.' ('id' | 'name' | 'cssSelector') '(' STRING ')'
    ;

STRING        : '"' (~["\r\n])* '"' ;
NUMBER        : [0-9]+ ;
IDENTIFIER    : [a-zA-Z_][a-zA-Z_0-9]* ;
WS            : [ \t\r\n]+ -> skip ;
COMMENT       : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
NEQ           : '!=' ;