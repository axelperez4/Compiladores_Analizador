/* paquetes que se utilizan*/
package alexico;
import java.io.*;
import static alexico.tokens.*;

%%
%class Lexema
%type tokens
%line
%column
/* Expresiones regulares  */
DIGITO=[0-9]+
LETRAS=[A-Za-z_]+
CADENA="\""[^*]~"\"" | "\"" + "\""
ESPACIO =[ ,\t,\r]+

/* Metodo que tomara cada token  */
%{
public String lexemas;
RecuperarCodigo rc= new RecuperarCodigo();
%}
%%
/* Reglas y Acciones */
/* cuando sea un espacio que lo ignore */
{ESPACIO} {/*Ignore*/}

("\n") {rc.lineas=yyline;lexemas=yytext(); return Linea;}

/* Operadores Aritmeticos */
("+") {rc.lineas=yyline;lexemas=yytext(); return Suma;}
("-") {rc.lineas=yyline;lexemas=yytext(); return Menos;}
("*") {rc.lineas=yyline;lexemas=yytext(); return Por;}
/*Operadores relacionales*/
("=" | "<" | ">" | "<=" | ">=" | "<>") {rc.lineas=yyline;lexemas=yytext(); return Operador_Relacional;}

/*Operadores asignacion*/
("<-") {rc.lineas=yyline;lexemas=yytext(); return Operador_Asignacion;}

/* Palabras reservadas */
("(") {rc.lineas=yyline;lexemas=yytext(); return Parentesis_A;}
(")") {rc.lineas=yyline;lexemas=yytext(); return Parentesis_C;}
("proceso") {rc.lineas=yyline;lexemas=yytext(); return Proceso;}
("finproceso") {rc.lineas=yyline;lexemas=yytext(); return FinProceso;}
("escribir") {rc.lineas=yyline;lexemas=yytext(); return Escribir;}
("leer") {rc.lineas=yyline;lexemas=yytext(); return Leer;}
("repetir") {rc.lineas=yyline;lexemas=yytext(); return Repetir;}
("hasta") {rc.lineas=yyline;lexemas=yytext(); return Hasta;}
("que") {rc.lineas=yyline;lexemas=yytext(); return Que;}
("mientras") {rc.lineas=yyline;lexemas=yytext(); return Mientras;}
("hacer") {rc.lineas=yyline;lexemas=yytext(); return Hacer;}
("finmientras") {rc.lineas=yyline;lexemas=yytext(); return FinMientras;}

/* Constantes */
("pi") {rc.lineas=yyline;lexemas=yytext(); return Pi;}
("metro" | "mt") {rc.lineas=yyline;lexemas=yytext(); return Metro;}
("kilogramo" | "kg") {rc.lineas=yyline;lexemas=yytext(); return Kilogramo;}

/* Digito */
("(-"{DIGITO}+")") | {DIGITO}+ {rc.lineas=yyline;lexemas=yytext(); return Numero;}
/*Variables que contencas letras seguido de letras o numeros*/
{LETRAS}({LETRAS}|{DIGITO})* {rc.lineas=yyline;lexemas=yytext(); return Identificador;}

/* verifica las cadenas */
{CADENA}+ {rc.lineas=yyline;lexemas=yytext(); return Cadena;}

/* indica error cuando no exista algo no declarada antes*/
. {rc.lineas=yyline;lexemas=yytext(); return error;}
