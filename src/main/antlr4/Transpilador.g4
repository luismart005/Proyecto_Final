grammar Transpilador;


programa
    : classDef EOF
    ;

classDef
    : 'public' 'class' IDENTIFIER '{' metodoDef* '}'
    ;

metodoDef
    : '@Test'
      'public' 'void' IDENTIFIER '(' ')' (('throws' IDENTIFIER))?
      '{' sentencia* '}'
    ;

sentencia
    : navegar
    | clickPorId
    | clickPorCss
    | escribirPorId
    | asercion
    ;


navegar
    : 'driver' '.' 'get' '(' STRING ')' ';'
    ;


clickPorId
    : 'driver' '.' 'findElement' '(' 'By' '.' 'id' '(' STRING ')' ')' '.' 'click' '(' ')' ';'
    ;


clickPorCss
    : 'driver' '.' 'findElement' '(' 'By' '.' 'cssSelector' '(' STRING ')' ')' '.' 'click' '(' ')' ';'
    ;


escribirPorId
    : 'driver' '.' 'findElement' '(' 'By' '.' 'id' '(' STRING ')' ')' '.' 'sendKeys' '(' STRING ')' ';'
    ;


asercion
    : 'Assert' '.' 'assertEquals' '(' expr ',' expr ')' ';'
    ;

expr
    : STRING
    | IDENTIFIER
    ;


STRING      : '"' (~["\r\n])* '"' ;
IDENTIFIER  : [a-zA-Z_][a-zA-Z_0-9]* ;
WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;