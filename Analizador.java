/* Generated By:JavaCC: Do not edit this line. Analizador.java */
/** Analizador */
    public class Analizador implements AnalizadorConstants {
        public static void main(String[] args) throws ParseException{
            Analizador anLex = new Analizador (System.in);
            anLex.unaExpresion();
            }

  final public void unaExpresion() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        jj_consume_token(CLASS);
        break;
      case STATIC:
        jj_consume_token(STATIC);
        break;
      case VOID:
        jj_consume_token(VOID);
        break;
      case MAIN:
        jj_consume_token(MAIN);
        break;
      case STRING:
        jj_consume_token(STRING);
        break;
      case INT:
        jj_consume_token(INT);
        break;
      case CHAR:
        jj_consume_token(CHAR);
        break;
      case FLOAT:
        jj_consume_token(FLOAT);
        break;
      case INTEGER:
        jj_consume_token(INTEGER);
        break;
      case PARSEINT:
        jj_consume_token(PARSEINT);
        break;
      case IF:
        jj_consume_token(IF);
        break;
      case FOR:
        jj_consume_token(FOR);
        break;
      case TRUE:
        jj_consume_token(TRUE);
        break;
      case FALSE:
        jj_consume_token(FALSE);
        break;
      case BOOLEAN:
        jj_consume_token(BOOLEAN);
        break;
      case ELSE:
        jj_consume_token(ELSE);
        break;
      case WHILE:
        jj_consume_token(WHILE);
        break;
      case RETURN:
        jj_consume_token(RETURN);
        break;
      case IMPORT:
        jj_consume_token(IMPORT);
        break;
      case NULL:
        jj_consume_token(NULL);
        break;
      case LENGTH:
        jj_consume_token(LENGTH);
        break;
      case DO:
        jj_consume_token(DO);
        break;
      case SWITCH:
        jj_consume_token(SWITCH);
        break;
      case CASE:
        jj_consume_token(CASE);
        break;
      case BREAK:
        jj_consume_token(BREAK);
        break;
      case ID:
        jj_consume_token(ID);
        break;
      case NEGEX:
        jj_consume_token(NEGEX);
        break;
      case MODULO:
        jj_consume_token(MODULO);
        break;
      case DENTROCOMENTARIO:
        jj_consume_token(DENTROCOMENTARIO);
        break;
      case NUMERO:
        jj_consume_token(NUMERO);
        break;
      case FINLINEA:
        jj_consume_token(FINLINEA);
        break;
      case COMA:
        jj_consume_token(COMA);
        break;
      case GUIONES:
        jj_consume_token(GUIONES);
        break;
      case ABRIRLLA:
        jj_consume_token(ABRIRLLA);
        break;
      case CERRARLLA:
        jj_consume_token(CERRARLLA);
        break;
      case ABRIRCOR:
        jj_consume_token(ABRIRCOR);
        break;
      case ABRIRPAR:
        jj_consume_token(ABRIRPAR);
        break;
      case CERRARCOR:
        jj_consume_token(CERRARCOR);
        break;
      case CERRARPAR:
        jj_consume_token(CERRARPAR);
        break;
      case PUNTO:
        jj_consume_token(PUNTO);
        break;
      case DOSPUNTOS:
        jj_consume_token(DOSPUNTOS);
        break;
      case MAS:
        jj_consume_token(MAS);
        break;
      case MENOS:
        jj_consume_token(MENOS);
        break;
      case POR:
        jj_consume_token(POR);
        break;
      case ENTRE:
        jj_consume_token(ENTRE);
        break;
      case NEGAR:
        jj_consume_token(NEGAR);
        break;
      case COMILLAS:
        jj_consume_token(COMILLAS);
        break;
      case MAYORQUE:
        jj_consume_token(MAYORQUE);
        break;
      case MENORQUE:
        jj_consume_token(MENORQUE);
        break;
      case IGUAL:
        jj_consume_token(IGUAL);
        break;
      case OR:
        jj_consume_token(OR);
        break;
      case AND:
        jj_consume_token(AND);
        break;
      case ALGO:
        jj_consume_token(ALGO);
        break;
      case MENORIGUAL:
        jj_consume_token(MENORIGUAL);
        break;
      case MAYORIGUAL:
        jj_consume_token(MAYORIGUAL);
        break;
      case IGUALIGUAL:
        jj_consume_token(IGUALIGUAL);
        break;
      case ESPACIO:
        jj_consume_token(ESPACIO);
        break;
      case DIFERENTEDE:
        jj_consume_token(DIFERENTEDE);
        break;
      case NUMERODECIMAL:
        jj_consume_token(NUMERODECIMAL);
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
      case STATIC:
      case VOID:
      case MAIN:
      case STRING:
      case INT:
      case FLOAT:
      case CHAR:
      case INTEGER:
      case PARSEINT:
      case IF:
      case FOR:
      case TRUE:
      case FALSE:
      case BOOLEAN:
      case ELSE:
      case WHILE:
      case RETURN:
      case IMPORT:
      case NULL:
      case LENGTH:
      case DO:
      case SWITCH:
      case CASE:
      case BREAK:
      case ESPACIO:
      case NUMERODECIMAL:
      case ID:
      case NEGEX:
      case MODULO:
      case DENTROCOMENTARIO:
      case NUMERO:
      case FINLINEA:
      case COMA:
      case GUIONES:
      case ABRIRLLA:
      case CERRARLLA:
      case ABRIRPAR:
      case CERRARPAR:
      case ABRIRCOR:
      case CERRARCOR:
      case PUNTO:
      case DOSPUNTOS:
      case MAS:
      case MENOS:
      case POR:
      case ENTRE:
      case NEGAR:
      case COMILLAS:
      case MAYORQUE:
      case MENORQUE:
      case IGUAL:
      case OR:
      case AND:
      case ALGO:
      case MENORIGUAL:
      case MAYORIGUAL:
      case IGUALIGUAL:
      case DIFERENTEDE:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
    }
    jj_consume_token(0);
  }

  /** Generated Token Manager. */
  public AnalizadorTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xfffffffe,0xfffffffe,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0xfffffff,0xfffffff,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public Analizador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Analizador(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AnalizadorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Analizador(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AnalizadorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Analizador(AnalizadorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AnalizadorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List jj_expentries = new java.util.ArrayList();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[72];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 72; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

    }