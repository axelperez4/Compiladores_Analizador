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
ESPACIO =[ ,\t,\r,\n]+

/* Metodo que tomara cada token  */
%{
public String lexemas;
RecuperarCodigo rc= new RecuperarCodigo();
%}
%%
/* Reglas y Acciones */
/* cuando sea un espacio que lo ignore */
{ESPACIO} {/*Ignore*/}
/* Operadores mas y menos */
<YYINITIAL> "+" {rc.lineas=yyline;lexemas=yytext(); return MAS;}
<YYINITIAL> "-" {rc.lineas=yyline;lexemas=yytext(); return MENOS;}
<YYINITIAL> "==" {rc.lineas=yyline;lexemas=yytext(); return IGUAL;}
/* Palabras reservadas */
<YYINITIAL> "proceso" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "finproceso" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "escribir" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "leer" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "repetir" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "hasta" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "que" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "mientras" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "hacer" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
<YYINITIAL> "finmientras" {rc.lineas=yyline;lexemas=yytext(); return RESERVADA;}
/* Constantes */
<YYINITIAL> "pi" {rc.lineas=yyline;lexemas=yytext(); return CONSTANTE;}
<YYINITIAL> "metro" {rc.lineas=yyline;lexemas=yytext(); return CONSTANTE;}
<YYINITIAL> "mt" {rc.lineas=yyline;lexemas=yytext(); return CONSTANTE;}
<YYINITIAL> "kilogramo" {rc.lineas=yyline;lexemas=yytext(); return CONSTANTE;}
<YYINITIAL> "kg" {rc.lineas=yyline;lexemas=yytext(); return CONSTANTE;}
/* Digito */
<YYINITIAL> {DIGITO}+ {rc.lineas=yyline;lexemas=yytext(); return NUMERO;}
/*Variables que contencas letras seguido de letras o numeros*/
<YYINITIAL> {LETRAS}({LETRAS}|{DIGITO})* {rc.lineas=yyline;lexemas=yytext(); return INDENTIFICADOR;}
/* verifica las cadenas */
<YYINITIAL> {CADENA}+ {rc.lineas=yyline;lexemas=yytext(); return CADENA;}
/* indica error cuando no exista algo no declarada antes*/
. {rc.lineas=yyline;lexemas=yytext(); return ERROR;}
