
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package alexico;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\005\000\002\002" +
    "\006\000\002\002\003\000\002\003\004\000\002\003\003" +
    "\000\002\003\004\000\002\003\003\000\002\003\004\000" +
    "\002\003\003\000\002\003\004\000\002\003\003\000\002" +
    "\004\004\000\002\005\004\000\002\006\007\000\002\007" +
    "\005\000\002\007\005\000\002\010\011\000\002\012\007" +
    "\000\002\011\007\000\002\011\007\000\002\011\007\000" +
    "\002\011\007\000\002\011\007\000\002\011\007\000\002" +
    "\011\007\000\002\011\007\000\002\011\007\000\002\011" +
    "\007\000\002\011\007\000\002\011\007\000\002\013\005" +
    "\000\002\013\005\000\002\013\005\000\002\013\005\000" +
    "\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\010\011\004\013\010\033\006\001\002\000" +
    "\006\011\004\033\006\001\002\000\012\002\ufffe\004\055" +
    "\005\053\006\054\001\002\000\014\002\uffde\004\uffde\005" +
    "\uffde\006\uffde\012\uffde\001\002\000\004\002\052\001\002" +
    "\000\014\015\020\016\011\017\012\022\013\026\017\001" +
    "\002\000\004\026\051\001\002\000\012\015\020\016\011" +
    "\017\012\022\013\001\002\000\004\011\033\001\002\000" +
    "\020\014\ufffa\015\ufffa\016\ufffa\017\ufffa\020\ufffa\022\ufffa" +
    "\024\ufffa\001\002\000\014\014\032\015\020\016\011\017" +
    "\012\022\013\001\002\000\020\014\ufffc\015\ufffc\016\ufffc" +
    "\017\ufffc\020\ufffc\022\ufffc\024\ufffc\001\002\000\012\015" +
    "\020\016\011\017\012\022\013\001\002\000\004\027\023" +
    "\001\002\000\020\014\ufff6\015\ufff6\016\ufff6\017\ufff6\020" +
    "\ufff6\022\ufff6\024\ufff6\001\002\000\020\014\ufff8\015\ufff8" +
    "\016\ufff8\017\ufff8\020\ufff8\022\ufff8\024\ufff8\001\002\000" +
    "\020\014\ufff5\015\ufff5\016\ufff5\017\ufff5\020\ufff5\022\ufff5" +
    "\024\ufff5\001\002\000\014\014\026\015\020\016\011\017" +
    "\012\022\013\001\002\000\020\014\ufffb\015\ufffb\016\ufffb" +
    "\017\ufffb\020\ufffb\022\ufffb\024\ufffb\001\002\000\004\002" +
    "\uffff\001\002\000\020\014\ufffd\015\ufffd\016\ufffd\017\ufffd" +
    "\020\ufffd\022\ufffd\024\ufffd\001\002\000\020\014\ufff7\015" +
    "\ufff7\016\ufff7\017\ufff7\020\ufff7\022\ufff7\024\ufff7\001\002" +
    "\000\020\014\ufff9\015\ufff9\016\ufff9\017\ufff9\020\ufff9\022" +
    "\ufff9\024\ufff9\001\002\000\004\002\000\001\002\000\004" +
    "\026\035\001\002\000\004\012\041\001\002\000\004\007" +
    "\036\001\002\000\006\025\037\027\040\001\002\000\022" +
    "\012\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2\020\ufff2\022" +
    "\ufff2\024\ufff2\001\002\000\022\012\ufff1\014\ufff1\015\ufff1" +
    "\016\ufff1\017\ufff1\020\ufff1\022\ufff1\024\ufff1\001\002\000" +
    "\004\023\042\001\002\000\012\015\020\016\011\017\012" +
    "\022\013\001\002\000\014\015\020\016\011\017\012\022" +
    "\013\024\044\001\002\000\020\014\ufff0\015\ufff0\016\ufff0" +
    "\017\ufff0\020\ufff0\022\ufff0\024\ufff0\001\002\000\014\015" +
    "\020\016\011\017\012\020\046\022\013\001\002\000\004" +
    "\021\047\001\002\000\004\026\035\001\002\000\020\014" +
    "\ufff3\015\ufff3\016\ufff3\017\ufff3\020\ufff3\022\ufff3\024\ufff3" +
    "\001\002\000\020\014\ufff4\015\ufff4\016\ufff4\017\ufff4\020" +
    "\ufff4\022\ufff4\024\ufff4\001\002\000\004\002\001\001\002" +
    "\000\006\011\004\033\006\001\002\000\006\011\004\033" +
    "\006\001\002\000\006\011\004\033\006\001\002\000\014" +
    "\002\uffe2\004\uffe2\005\uffe2\006\054\012\uffe2\001\002\000" +
    "\014\002\uffe0\004\uffe0\005\uffe0\006\uffe0\012\uffe0\001\002" +
    "\000\014\002\uffe1\004\uffe1\005\uffe1\006\054\012\uffe1\001" +
    "\002\000\012\004\055\005\053\006\054\012\062\001\002" +
    "\000\014\002\uffdf\004\uffdf\005\uffdf\006\uffdf\012\uffdf\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\006\002\006\013\004\001\001\000\004\013" +
    "\060\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\003\014\004\013\005\015\006\021\010" +
    "\020\001\001\000\002\001\001\000\014\003\044\004\013" +
    "\005\015\006\021\010\020\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\004\024\005\026\006\030\010\027" +
    "\001\001\000\002\001\001\000\014\003\023\004\013\005" +
    "\015\006\021\010\020\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\004" +
    "\024\005\026\006\030\010\027\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\007\033\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\003\042\004\013\005\015\006\021\010\020\001\001\000" +
    "\012\004\024\005\026\006\030\010\027\001\001\000\002" +
    "\001\001\000\012\004\024\005\026\006\030\010\027\001" +
    "\001\000\002\001\001\000\004\007\047\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\013" +
    "\057\001\001\000\004\013\056\001\001\000\004\013\055" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public String resultado="";
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Proceso SENTENCIA FinProceso 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Proceso Identificador SENTENCIA FinProceso 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= EXPR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 resultado=a; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= SENTENCIA LEER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= LEER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= SENTENCIA ESCRIBIR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= ESCRIBIR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= SENTENCIA REPETIR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= REPETIR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= SENTENCIA MIENTRAS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= MIENTRAS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ESCRIBIR ::= Escribir Cadena 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ESCRIBIR",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // LEER ::= Leer Identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LEER",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // REPETIR ::= Repetir SENTENCIA Hasta Que SENT_BOOL 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("REPETIR",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SENT_BOOL ::= Identificador Operador_Relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENT_BOOL",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SENT_BOOL ::= Identificador Operador_Relacional Cadena 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENT_BOOL",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // MIENTRAS ::= Mientras Parentesis_A SENT_BOOL Parentesis_C Hacer SENTENCIA FinMientras 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("MIENTRAS",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ASIG ::= Identificador Operador_Asignacion Identificador Suma Numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ASIG",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Identificador Suma Identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Identificador Menos Identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Identificador Por Identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Numero Suma Numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Numero Menos Numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Numero Por Numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Identificador Suma Numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Identificador Menos Numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Identificador Por Numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Numero Suma Identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Numero Menos Identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_ASIGNACION ::= Identificador Operador_Asignacion Numero Por Identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA_ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // EXPR ::= EXPR Suma EXPR 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 int val1= Integer.parseInt(e1);
											 int val2= Integer.parseInt(e2);
											 int r=val1+val2;
											 RESULT = String.valueOf(r); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPR",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // EXPR ::= EXPR Menos EXPR 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 int val1= Integer.parseInt(e1);
											 int val2= Integer.parseInt(e2);
											 int r=val1-val2;
											 RESULT = String.valueOf(r);       
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPR",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // EXPR ::= EXPR Por EXPR 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 int val1= Integer.parseInt(e1);
											 int val2= Integer.parseInt(e2);
											 int r=val1*val2;
											 RESULT = String.valueOf(r);      
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPR",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // EXPR ::= Parentesis_A EXPR Parentesis_C 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT = a;           
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPR",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // EXPR ::= Number 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = a;           
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPR",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
