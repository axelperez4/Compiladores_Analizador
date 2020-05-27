/* paquetes que se utilizan*/
package alexico;
import java_cup.runtime.Symbol;

%%
%class LexemaCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
/* Expresiones regulares  */
DIGITO=[0-9]+
LENGUAJE=[A-Za-z_]+
CADENA="\""[^*]~"\"" | "\"" + "\""
ESPACIO =[ ,\t,\r,\n]+

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Reglas y Acciones */
/* cuando sea un espacio que lo ignore */
{ESPACIO} {/*Ignore*/}

/* Operadores mas y menos */
("+") {return new Symbol(sym.Suma, yychar, yyline, yytext());}
("-") {return new Symbol(sym.Menos, yychar, yyline, yytext());}
("*") {return new Symbol(sym.Por, yychar, yyline, yytext());}

/*Operadores relacionales*/
("=" | "<" | ">" | "<=" | ">=" | "<>") {return new Symbol(sym.Operador_Relacional, yychar, yyline, yytext());} 

/* Operador de asignacion */
("<-") {return new Symbol(sym.Operador_Asignacion, yychar, yyline, yytext());}

/* Palabras reservadas */
("(") {return new Symbol(sym.Parentesis_A, yychar, yyline, yytext());}
(")") {return new Symbol(sym.Parentesis_C, yychar, yyline, yytext());}
("proceso") {return new Symbol(sym.Proceso, yychar, yyline, yytext());}
("finproceso") {return new Symbol(sym.FinProceso, yychar, yyline, yytext());}
("escribir") {return new Symbol(sym.Escribir, yychar, yyline, yytext());}
("leer") {return new Symbol(sym.Leer, yychar, yyline, yytext());}
("repetir") {return new Symbol(sym.Repetir, yychar, yyline, yytext());}
("hasta") {return new Symbol(sym.Hasta, yychar, yyline, yytext());}
("que") {return new Symbol(sym.Que, yychar, yyline, yytext());}
("mientras") {return new Symbol(sym.Mientras, yychar, yyline, yytext());}
("hacer") {return new Symbol(sym.Hacer, yychar, yyline, yytext());}
("finmientras") {return new Symbol(sym.FinMientras, yychar, yyline, yytext());}

/* Constantes */
("pi") {return new Symbol(sym.Pi, yychar, yyline, yytext());}
("metro" | "mt") {return new Symbol(sym.Metro, yychar, yyline, yytext());}
("kilogramo" | "kg") {return new Symbol(sym.Kilogramo, yychar, yyline, yytext());}

/* Digito */
("(-"{DIGITO}+")") | {DIGITO}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
/*Variables que contencas letras seguido de letras o numeros*/
{LENGUAJE}({LENGUAJE}|{DIGITO})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* verifica las cadenas */
{CADENA}+ {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* indica error cuando no exista algo no declarada antes*/
. {return new Symbol(sym.error, yychar, yyline, yytext());}