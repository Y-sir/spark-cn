// Generated from /Users/PowerYang/Documents/GitHub/spark-cn/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser/SqlBase.g4 by ANTLR 4.7.1
package org.apache.spark.sql.catalyst.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ADD=11, AFTER=12, ALL=13, ALTER=14, ANALYZE=15, AND=16, ANTI=17, 
		ANY=18, ARCHIVE=19, ARRAY=20, AS=21, ASC=22, AT=23, AUTHORIZATION=24, 
		BETWEEN=25, BOTH=26, BUCKET=27, BUCKETS=28, BY=29, CACHE=30, CASCADE=31, 
		CASE=32, CAST=33, CHANGE=34, CHECK=35, CLEAR=36, CLUSTER=37, CLUSTERED=38, 
		CODEGEN=39, COLLATE=40, COLLECTION=41, COLUMN=42, COLUMNS=43, COMMENT=44, 
		COMMIT=45, COMPACT=46, COMPACTIONS=47, COMPUTE=48, CONCATENATE=49, CONSTRAINT=50, 
		COST=51, CREATE=52, CROSS=53, CUBE=54, CURRENT=55, CURRENT_DATE=56, CURRENT_TIME=57, 
		CURRENT_TIMESTAMP=58, CURRENT_USER=59, DATA=60, DATABASE=61, DATABASES=62, 
		DAY=63, DAYS=64, DBPROPERTIES=65, DEFINED=66, DELETE=67, DELIMITED=68, 
		DESC=69, DESCRIBE=70, DFS=71, DIRECTORIES=72, DIRECTORY=73, DISTINCT=74, 
		DISTRIBUTE=75, DROP=76, ELSE=77, END=78, ESCAPED=79, EXCEPT=80, EXCHANGE=81, 
		EXISTS=82, EXPLAIN=83, EXPORT=84, EXTENDED=85, EXTERNAL=86, EXTRACT=87, 
		FALSE=88, FETCH=89, FIELDS=90, FILEFORMAT=91, FIRST=92, FIRST_VALUE=93, 
		FOLLOWING=94, FOR=95, FOREIGN=96, FORMAT=97, FORMATTED=98, FROM=99, FULL=100, 
		FUNCTION=101, FUNCTIONS=102, GLOBAL=103, GRANT=104, GROUP=105, GROUPING=106, 
		HAVING=107, HOUR=108, HOURS=109, IF=110, IGNORE=111, IMPORT=112, IN=113, 
		INDEX=114, INDEXES=115, INNER=116, INPATH=117, INPUTFORMAT=118, INSERT=119, 
		INTERSECT=120, INTERVAL=121, INTO=122, IS=123, ITEMS=124, JOIN=125, KEYS=126, 
		LAST=127, LAST_VALUE=128, LATERAL=129, LAZY=130, LEADING=131, LEFT=132, 
		LIKE=133, LIMIT=134, LINES=135, LIST=136, LOAD=137, LOCAL=138, LOCATION=139, 
		LOCK=140, LOCKS=141, LOGICAL=142, MACRO=143, MAP=144, MICROSECOND=145, 
		MICROSECONDS=146, MILLISECOND=147, MILLISECONDS=148, MINUTE=149, MINUTES=150, 
		MONTH=151, MONTHS=152, MSCK=153, NAMESPACE=154, NAMESPACES=155, NATURAL=156, 
		NO=157, NOT=158, NULL=159, NULLS=160, OF=161, ON=162, ONLY=163, OPTION=164, 
		OPTIONS=165, OR=166, ORDER=167, OUT=168, OUTER=169, OUTPUTFORMAT=170, 
		OVER=171, OVERLAPS=172, OVERLAY=173, OVERWRITE=174, PARTITION=175, PARTITIONED=176, 
		PARTITIONS=177, PERCENTLIT=178, PIVOT=179, PLACING=180, POSITION=181, 
		PRECEDING=182, PRIMARY=183, PRINCIPALS=184, PROPERTIES=185, PURGE=186, 
		QUERY=187, RANGE=188, RECORDREADER=189, RECORDWRITER=190, RECOVER=191, 
		REDUCE=192, REFERENCES=193, REFRESH=194, RENAME=195, REPAIR=196, REPLACE=197, 
		RESET=198, RESPECT=199, RESTRICT=200, REVOKE=201, RIGHT=202, RLIKE=203, 
		ROLE=204, ROLES=205, ROLLBACK=206, ROLLUP=207, ROW=208, ROWS=209, SCHEMA=210, 
		SECOND=211, SECONDS=212, SELECT=213, SEMI=214, SEPARATED=215, SERDE=216, 
		SERDEPROPERTIES=217, SESSION_USER=218, SET=219, SETMINUS=220, SETS=221, 
		SHOW=222, SKEWED=223, SOME=224, SORT=225, SORTED=226, START=227, STATISTICS=228, 
		STORED=229, STRATIFY=230, STRUCT=231, SUBSTR=232, SUBSTRING=233, TABLE=234, 
		TABLES=235, TABLESAMPLE=236, TBLPROPERTIES=237, TEMPORARY=238, TERMINATED=239, 
		THEN=240, TO=241, TOUCH=242, TRAILING=243, TRANSACTION=244, TRANSACTIONS=245, 
		TRANSFORM=246, TRIM=247, TRUE=248, TRUNCATE=249, TYPE=250, UNARCHIVE=251, 
		UNBOUNDED=252, UNCACHE=253, UNION=254, UNIQUE=255, UNKNOWN=256, UNLOCK=257, 
		UNSET=258, UPDATE=259, USE=260, USER=261, USING=262, VALUES=263, VIEW=264, 
		WEEK=265, WEEKS=266, WHEN=267, WHERE=268, WINDOW=269, WITH=270, YEAR=271, 
		YEARS=272, EQ=273, NSEQ=274, NEQ=275, NEQJ=276, LT=277, LTE=278, GT=279, 
		GTE=280, PLUS=281, MINUS=282, ASTERISK=283, SLASH=284, PERCENT=285, DIV=286, 
		TILDE=287, AMPERSAND=288, PIPE=289, CONCAT_PIPE=290, HAT=291, STRING=292, 
		BIGINT_LITERAL=293, SMALLINT_LITERAL=294, TINYINT_LITERAL=295, INTEGER_VALUE=296, 
		DECIMAL_VALUE=297, DOUBLE_LITERAL=298, BIGDECIMAL_LITERAL=299, IDENTIFIER=300, 
		BACKQUOTED_IDENTIFIER=301, SIMPLE_COMMENT=302, BRACKETED_EMPTY_COMMENT=303, 
		BRACKETED_COMMENT=304, WS=305, UNRECOGNIZED=306;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", 
		"ARCHIVE", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", 
		"BUCKET", "BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", 
		"CHECK", "CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
		"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
		"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
		"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", 
		"DATABASE", "DATABASES", "DAY", "DAYS", "DBPROPERTIES", "DEFINED", "DELETE", 
		"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
		"DISTRIBUTE", "DROP", "ELSE", "END", "ESCAPED", "EXCEPT", "EXCHANGE", 
		"EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", 
		"FETCH", "FIELDS", "FILEFORMAT", "FIRST", "FIRST_VALUE", "FOLLOWING", 
		"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", 
		"GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", "HOURS", "IF", 
		"IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
		"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
		"LAST", "LAST_VALUE", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", 
		"LINES", "LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", 
		"MACRO", "MAP", "MICROSECOND", "MICROSECONDS", "MILLISECOND", "MILLISECONDS", 
		"MINUTE", "MINUTES", "MONTH", "MONTHS", "MSCK", "NAMESPACE", "NAMESPACES", 
		"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", 
		"OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", 
		"OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", 
		"PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", 
		"PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", 
		"RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", 
		"RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", 
		"ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", "SECOND", "SECONDS", "SELECT", 
		"SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", 
		"SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", 
		"STATISTICS", "STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", 
		"TABLES", "TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", 
		"TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", 
		"TRIM", "TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", 
		"UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", 
		"USING", "VALUES", "VIEW", "WEEK", "WEEKS", "WHEN", "WHERE", "WINDOW", 
		"WITH", "YEAR", "YEARS", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", 
		"GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", 
		"AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", 
		"SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", 
		"DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
		"DECIMAL_DIGITS", "EXPONENT", "DIGIT", "LETTER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
		"':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", 
		"'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
		"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
		"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
		"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
		"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
		"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
		"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
		"'DATA'", "'DATABASE'", null, "'DAY'", "'DAYS'", "'DBPROPERTIES'", "'DEFINED'", 
		"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
		"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DROP'", "'ELSE'", "'END'", 
		"'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", 
		"'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", 
		"'FILEFORMAT'", "'FIRST'", "'FIRST_VALUE'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", 
		"'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
		"'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", 
		"'HOURS'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
		"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
		"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LAST_VALUE'", 
		"'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", 
		"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
		"'MACRO'", "'MAP'", "'MICROSECOND'", "'MICROSECONDS'", "'MILLISECOND'", 
		"'MILLISECONDS'", "'MINUTE'", "'MINUTES'", "'MONTH'", "'MONTHS'", "'MSCK'", 
		"'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", 
		"'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", 
		"'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", 
		"'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", 
		"'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
		"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
		"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
		"'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", 
		null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
		"'SCHEMA'", "'SECOND'", "'SECONDS'", "'SELECT'", "'SEMI'", "'SEPARATED'", 
		"'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", 
		"'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", 
		"'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", 
		"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
		"'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", 
		"'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", 
		"'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", 
		"'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VIEW'", 
		"'WEEK'", "'WEEKS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'YEAR'", 
		"'YEARS'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", 
		null, null, null, null, null, null, null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ADD", 
		"AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", "ARRAY", 
		"AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", "BUCKETS", 
		"BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", "CLEAR", 
		"CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", 
		"COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", 
		"CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", 
		"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATABASE", 
		"DATABASES", "DAY", "DAYS", "DBPROPERTIES", "DEFINED", "DELETE", "DELIMITED", 
		"DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", "DISTRIBUTE", 
		"DROP", "ELSE", "END", "ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", 
		"EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIELDS", 
		"FILEFORMAT", "FIRST", "FIRST_VALUE", "FOLLOWING", "FOR", "FOREIGN", "FORMAT", 
		"FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", 
		"GROUP", "GROUPING", "HAVING", "HOUR", "HOURS", "IF", "IGNORE", "IMPORT", 
		"IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", "INSERT", 
		"INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", "LAST", 
		"LAST_VALUE", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
		"LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", 
		"MAP", "MICROSECOND", "MICROSECONDS", "MILLISECOND", "MILLISECONDS", "MINUTE", 
		"MINUTES", "MONTH", "MONTHS", "MSCK", "NAMESPACE", "NAMESPACES", "NATURAL", 
		"NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", "OPTIONS", 
		"OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", 
		"OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", "PIVOT", 
		"PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", "PROPERTIES", 
		"PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", "RECOVER", 
		"REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", "RESET", 
		"RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", 
		"ROLLUP", "ROW", "ROWS", "SCHEMA", "SECOND", "SECONDS", "SELECT", "SEMI", 
		"SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", 
		"SETS", "SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", 
		"STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", 
		"TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TO", 
		"TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", 
		"TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", 
		"UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", 
		"VALUES", "VIEW", "WEEK", "WEEKS", "WHEN", "WHERE", "WINDOW", "WITH", 
		"YEAR", "YEARS", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", 
		"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", 
		"PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
		"TINYINT_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	  /**
	   * When true, ANSI SQL parsing mode is enabled.
	   */
	  public boolean ansi = false;


	public SqlBaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 296:
			return DECIMAL_VALUE_sempred((RuleContext)_localctx, predIndex);
		case 297:
			return DOUBLE_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 298:
			return BIGDECIMAL_LITERAL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean DECIMAL_VALUE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isValidDecimal();
		}
		return true;
	}
	private boolean DOUBLE_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return isValidDecimal();
		}
		return true;
	}
	private boolean BIGDECIMAL_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return isValidDecimal();
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0134\u0b2d\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6"+
		"\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba"+
		"\4\u00bb\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf"+
		"\t\u00bf\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3"+
		"\4\u00c4\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8"+
		"\t\u00c8\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc"+
		"\4\u00cd\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1"+
		"\t\u00d1\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5"+
		"\4\u00d6\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da"+
		"\t\u00da\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de"+
		"\4\u00df\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3"+
		"\t\u00e3\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7"+
		"\4\u00e8\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec"+
		"\t\u00ec\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0"+
		"\4\u00f1\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5"+
		"\t\u00f5\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9"+
		"\4\u00fa\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe"+
		"\t\u00fe\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102"+
		"\4\u0103\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107"+
		"\t\u0107\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b"+
		"\4\u010c\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110"+
		"\t\u0110\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114"+
		"\4\u0115\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\4\u0119"+
		"\t\u0119\4\u011a\t\u011a\4\u011b\t\u011b\4\u011c\t\u011c\4\u011d\t\u011d"+
		"\4\u011e\t\u011e\4\u011f\t\u011f\4\u0120\t\u0120\4\u0121\t\u0121\4\u0122"+
		"\t\u0122\4\u0123\t\u0123\4\u0124\t\u0124\4\u0125\t\u0125\4\u0126\t\u0126"+
		"\4\u0127\t\u0127\4\u0128\t\u0128\4\u0129\t\u0129\4\u012a\t\u012a\4\u012b"+
		"\t\u012b\4\u012c\t\u012c\4\u012d\t\u012d\4\u012e\t\u012e\4\u012f\t\u012f"+
		"\4\u0130\t\u0130\4\u0131\t\u0131\4\u0132\t\u0132\4\u0133\t\u0133\4\u0134"+
		"\t\u0134\4\u0135\t\u0135\4\u0136\t\u0136\4\u0137\t\u0137\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0415\n?\3@\3@\3@\3@\3A"+
		"\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F"+
		"\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O"+
		"\3O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U"+
		"\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3["+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3"+
		"`\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3j\3"+
		"j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3m\3m\3"+
		"m\3m\3m\3n\3n\3n\3n\3n\3n\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3"+
		"q\3q\3q\3r\3r\3r\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3u\3u\3u\3"+
		"u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3x\3"+
		"x\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3"+
		"z\3z\3{\3{\3{\3{\3{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3~\3~\3~\3~\3~\3\177\3"+
		"\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\5\u009f\u06cf\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0831\n\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u093f\n\u00ef"+
		"\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd"+
		"\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00fe\3\u00fe"+
		"\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff"+
		"\3\u00ff\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0101"+
		"\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0102\3\u0102"+
		"\3\u0102\3\u0102\3\u0102\3\u0102\3\u0102\3\u0103\3\u0103\3\u0103\3\u0103"+
		"\3\u0103\3\u0103\3\u0104\3\u0104\3\u0104\3\u0104\3\u0104\3\u0104\3\u0104"+
		"\3\u0105\3\u0105\3\u0105\3\u0105\3\u0106\3\u0106\3\u0106\3\u0106\3\u0106"+
		"\3\u0107\3\u0107\3\u0107\3\u0107\3\u0107\3\u0107\3\u0108\3\u0108\3\u0108"+
		"\3\u0108\3\u0108\3\u0108\3\u0108\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109"+
		"\3\u010a\3\u010a\3\u010a\3\u010a\3\u010a\3\u010b\3\u010b\3\u010b\3\u010b"+
		"\3\u010b\3\u010b\3\u010c\3\u010c\3\u010c\3\u010c\3\u010c\3\u010d\3\u010d"+
		"\3\u010d\3\u010d\3\u010d\3\u010d\3\u010e\3\u010e\3\u010e\3\u010e\3\u010e"+
		"\3\u010e\3\u010e\3\u010f\3\u010f\3\u010f\3\u010f\3\u010f\3\u0110\3\u0110"+
		"\3\u0110\3\u0110\3\u0110\3\u0111\3\u0111\3\u0111\3\u0111\3\u0111\3\u0111"+
		"\3\u0112\3\u0112\3\u0112\5\u0112\u0a2e\n\u0112\3\u0113\3\u0113\3\u0113"+
		"\3\u0113\3\u0114\3\u0114\3\u0114\3\u0115\3\u0115\3\u0115\3\u0116\3\u0116"+
		"\3\u0117\3\u0117\3\u0117\3\u0117\5\u0117\u0a40\n\u0117\3\u0118\3\u0118"+
		"\3\u0119\3\u0119\3\u0119\3\u0119\5\u0119\u0a48\n\u0119\3\u011a\3\u011a"+
		"\3\u011b\3\u011b\3\u011c\3\u011c\3\u011d\3\u011d\3\u011e\3\u011e\3\u011f"+
		"\3\u011f\3\u011f\3\u011f\3\u0120\3\u0120\3\u0121\3\u0121\3\u0122\3\u0122"+
		"\3\u0123\3\u0123\3\u0123\3\u0124\3\u0124\3\u0125\3\u0125\3\u0125\3\u0125"+
		"\7\u0125\u0a67\n\u0125\f\u0125\16\u0125\u0a6a\13\u0125\3\u0125\3\u0125"+
		"\3\u0125\3\u0125\3\u0125\7\u0125\u0a71\n\u0125\f\u0125\16\u0125\u0a74"+
		"\13\u0125\3\u0125\5\u0125\u0a77\n\u0125\3\u0126\6\u0126\u0a7a\n\u0126"+
		"\r\u0126\16\u0126\u0a7b\3\u0126\3\u0126\3\u0127\6\u0127\u0a81\n\u0127"+
		"\r\u0127\16\u0127\u0a82\3\u0127\3\u0127\3\u0128\6\u0128\u0a88\n\u0128"+
		"\r\u0128\16\u0128\u0a89\3\u0128\3\u0128\3\u0129\6\u0129\u0a8f\n\u0129"+
		"\r\u0129\16\u0129\u0a90\3\u012a\6\u012a\u0a94\n\u012a\r\u012a\16\u012a"+
		"\u0a95\3\u012a\3\u012a\3\u012a\3\u012a\5\u012a\u0a9c\n\u012a\3\u012a\3"+
		"\u012a\5\u012a\u0aa0\n\u012a\3\u012b\6\u012b\u0aa3\n\u012b\r\u012b\16"+
		"\u012b\u0aa4\3\u012b\5\u012b\u0aa8\n\u012b\3\u012b\3\u012b\3\u012b\3\u012b"+
		"\5\u012b\u0aae\n\u012b\3\u012b\3\u012b\3\u012b\5\u012b\u0ab3\n\u012b\3"+
		"\u012c\6\u012c\u0ab6\n\u012c\r\u012c\16\u012c\u0ab7\3\u012c\5\u012c\u0abb"+
		"\n\u012c\3\u012c\3\u012c\3\u012c\3\u012c\3\u012c\5\u012c\u0ac2\n\u012c"+
		"\3\u012c\3\u012c\3\u012c\3\u012c\3\u012c\5\u012c\u0ac9\n\u012c\3\u012d"+
		"\3\u012d\3\u012d\6\u012d\u0ace\n\u012d\r\u012d\16\u012d\u0acf\3\u012e"+
		"\3\u012e\3\u012e\3\u012e\7\u012e\u0ad6\n\u012e\f\u012e\16\u012e\u0ad9"+
		"\13\u012e\3\u012e\3\u012e\3\u012f\6\u012f\u0ade\n\u012f\r\u012f\16\u012f"+
		"\u0adf\3\u012f\3\u012f\7\u012f\u0ae4\n\u012f\f\u012f\16\u012f\u0ae7\13"+
		"\u012f\3\u012f\3\u012f\6\u012f\u0aeb\n\u012f\r\u012f\16\u012f\u0aec\5"+
		"\u012f\u0aef\n\u012f\3\u0130\3\u0130\5\u0130\u0af3\n\u0130\3\u0130\6\u0130"+
		"\u0af6\n\u0130\r\u0130\16\u0130\u0af7\3\u0131\3\u0131\3\u0132\3\u0132"+
		"\3\u0133\3\u0133\3\u0133\3\u0133\7\u0133\u0b02\n\u0133\f\u0133\16\u0133"+
		"\u0b05\13\u0133\3\u0133\5\u0133\u0b08\n\u0133\3\u0133\5\u0133\u0b0b\n"+
		"\u0133\3\u0133\3\u0133\3\u0134\3\u0134\3\u0134\3\u0134\3\u0134\3\u0134"+
		"\3\u0134\3\u0135\3\u0135\3\u0135\3\u0135\3\u0135\7\u0135\u0b1b\n\u0135"+
		"\f\u0135\16\u0135\u0b1e\13\u0135\3\u0135\3\u0135\3\u0135\3\u0135\3\u0135"+
		"\3\u0136\6\u0136\u0b26\n\u0136\r\u0136\16\u0136\u0b27\3\u0136\3\u0136"+
		"\3\u0137\3\u0137\3\u0b1c\2\u0138\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad"+
		"X\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1"+
		"b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5"+
		"l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5t\u00e7u\u00e9"+
		"v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\u00f7}\u00f9~\u00fb\177\u00fd"+
		"\u0080\u00ff\u0081\u0101\u0082\u0103\u0083\u0105\u0084\u0107\u0085\u0109"+
		"\u0086\u010b\u0087\u010d\u0088\u010f\u0089\u0111\u008a\u0113\u008b\u0115"+
		"\u008c\u0117\u008d\u0119\u008e\u011b\u008f\u011d\u0090\u011f\u0091\u0121"+
		"\u0092\u0123\u0093\u0125\u0094\u0127\u0095\u0129\u0096\u012b\u0097\u012d"+
		"\u0098\u012f\u0099\u0131\u009a\u0133\u009b\u0135\u009c\u0137\u009d\u0139"+
		"\u009e\u013b\u009f\u013d\u00a0\u013f\u00a1\u0141\u00a2\u0143\u00a3\u0145"+
		"\u00a4\u0147\u00a5\u0149\u00a6\u014b\u00a7\u014d\u00a8\u014f\u00a9\u0151"+
		"\u00aa\u0153\u00ab\u0155\u00ac\u0157\u00ad\u0159\u00ae\u015b\u00af\u015d"+
		"\u00b0\u015f\u00b1\u0161\u00b2\u0163\u00b3\u0165\u00b4\u0167\u00b5\u0169"+
		"\u00b6\u016b\u00b7\u016d\u00b8\u016f\u00b9\u0171\u00ba\u0173\u00bb\u0175"+
		"\u00bc\u0177\u00bd\u0179\u00be\u017b\u00bf\u017d\u00c0\u017f\u00c1\u0181"+
		"\u00c2\u0183\u00c3\u0185\u00c4\u0187\u00c5\u0189\u00c6\u018b\u00c7\u018d"+
		"\u00c8\u018f\u00c9\u0191\u00ca\u0193\u00cb\u0195\u00cc\u0197\u00cd\u0199"+
		"\u00ce\u019b\u00cf\u019d\u00d0\u019f\u00d1\u01a1\u00d2\u01a3\u00d3\u01a5"+
		"\u00d4\u01a7\u00d5\u01a9\u00d6\u01ab\u00d7\u01ad\u00d8\u01af\u00d9\u01b1"+
		"\u00da\u01b3\u00db\u01b5\u00dc\u01b7\u00dd\u01b9\u00de\u01bb\u00df\u01bd"+
		"\u00e0\u01bf\u00e1\u01c1\u00e2\u01c3\u00e3\u01c5\u00e4\u01c7\u00e5\u01c9"+
		"\u00e6\u01cb\u00e7\u01cd\u00e8\u01cf\u00e9\u01d1\u00ea\u01d3\u00eb\u01d5"+
		"\u00ec\u01d7\u00ed\u01d9\u00ee\u01db\u00ef\u01dd\u00f0\u01df\u00f1\u01e1"+
		"\u00f2\u01e3\u00f3\u01e5\u00f4\u01e7\u00f5\u01e9\u00f6\u01eb\u00f7\u01ed"+
		"\u00f8\u01ef\u00f9\u01f1\u00fa\u01f3\u00fb\u01f5\u00fc\u01f7\u00fd\u01f9"+
		"\u00fe\u01fb\u00ff\u01fd\u0100\u01ff\u0101\u0201\u0102\u0203\u0103\u0205"+
		"\u0104\u0207\u0105\u0209\u0106\u020b\u0107\u020d\u0108\u020f\u0109\u0211"+
		"\u010a\u0213\u010b\u0215\u010c\u0217\u010d\u0219\u010e\u021b\u010f\u021d"+
		"\u0110\u021f\u0111\u0221\u0112\u0223\u0113\u0225\u0114\u0227\u0115\u0229"+
		"\u0116\u022b\u0117\u022d\u0118\u022f\u0119\u0231\u011a\u0233\u011b\u0235"+
		"\u011c\u0237\u011d\u0239\u011e\u023b\u011f\u023d\u0120\u023f\u0121\u0241"+
		"\u0122\u0243\u0123\u0245\u0124\u0247\u0125\u0249\u0126\u024b\u0127\u024d"+
		"\u0128\u024f\u0129\u0251\u012a\u0253\u012b\u0255\u012c\u0257\u012d\u0259"+
		"\u012e\u025b\u012f\u025d\2\u025f\2\u0261\2\u0263\2\u0265\u0130\u0267\u0131"+
		"\u0269\u0132\u026b\u0133\u026d\u0134\3\2\13\4\2))^^\4\2$$^^\3\2bb\4\2"+
		"--//\3\2\62;\3\2C\\\4\2\f\f\17\17\3\2--\5\2\13\f\17\17\"\"\2\u0b53\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
		"\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2"+
		"\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1"+
		"\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2"+
		"\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103"+
		"\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2"+
		"\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115"+
		"\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\2\u011d\3\2\2"+
		"\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125\3\2\2\2\2\u0127"+
		"\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2\2\2\u012f\3\2\2"+
		"\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\2\u0137\3\2\2\2\2\u0139"+
		"\3\2\2\2\2\u013b\3\2\2\2\2\u013d\3\2\2\2\2\u013f\3\2\2\2\2\u0141\3\2\2"+
		"\2\2\u0143\3\2\2\2\2\u0145\3\2\2\2\2\u0147\3\2\2\2\2\u0149\3\2\2\2\2\u014b"+
		"\3\2\2\2\2\u014d\3\2\2\2\2\u014f\3\2\2\2\2\u0151\3\2\2\2\2\u0153\3\2\2"+
		"\2\2\u0155\3\2\2\2\2\u0157\3\2\2\2\2\u0159\3\2\2\2\2\u015b\3\2\2\2\2\u015d"+
		"\3\2\2\2\2\u015f\3\2\2\2\2\u0161\3\2\2\2\2\u0163\3\2\2\2\2\u0165\3\2\2"+
		"\2\2\u0167\3\2\2\2\2\u0169\3\2\2\2\2\u016b\3\2\2\2\2\u016d\3\2\2\2\2\u016f"+
		"\3\2\2\2\2\u0171\3\2\2\2\2\u0173\3\2\2\2\2\u0175\3\2\2\2\2\u0177\3\2\2"+
		"\2\2\u0179\3\2\2\2\2\u017b\3\2\2\2\2\u017d\3\2\2\2\2\u017f\3\2\2\2\2\u0181"+
		"\3\2\2\2\2\u0183\3\2\2\2\2\u0185\3\2\2\2\2\u0187\3\2\2\2\2\u0189\3\2\2"+
		"\2\2\u018b\3\2\2\2\2\u018d\3\2\2\2\2\u018f\3\2\2\2\2\u0191\3\2\2\2\2\u0193"+
		"\3\2\2\2\2\u0195\3\2\2\2\2\u0197\3\2\2\2\2\u0199\3\2\2\2\2\u019b\3\2\2"+
		"\2\2\u019d\3\2\2\2\2\u019f\3\2\2\2\2\u01a1\3\2\2\2\2\u01a3\3\2\2\2\2\u01a5"+
		"\3\2\2\2\2\u01a7\3\2\2\2\2\u01a9\3\2\2\2\2\u01ab\3\2\2\2\2\u01ad\3\2\2"+
		"\2\2\u01af\3\2\2\2\2\u01b1\3\2\2\2\2\u01b3\3\2\2\2\2\u01b5\3\2\2\2\2\u01b7"+
		"\3\2\2\2\2\u01b9\3\2\2\2\2\u01bb\3\2\2\2\2\u01bd\3\2\2\2\2\u01bf\3\2\2"+
		"\2\2\u01c1\3\2\2\2\2\u01c3\3\2\2\2\2\u01c5\3\2\2\2\2\u01c7\3\2\2\2\2\u01c9"+
		"\3\2\2\2\2\u01cb\3\2\2\2\2\u01cd\3\2\2\2\2\u01cf\3\2\2\2\2\u01d1\3\2\2"+
		"\2\2\u01d3\3\2\2\2\2\u01d5\3\2\2\2\2\u01d7\3\2\2\2\2\u01d9\3\2\2\2\2\u01db"+
		"\3\2\2\2\2\u01dd\3\2\2\2\2\u01df\3\2\2\2\2\u01e1\3\2\2\2\2\u01e3\3\2\2"+
		"\2\2\u01e5\3\2\2\2\2\u01e7\3\2\2\2\2\u01e9\3\2\2\2\2\u01eb\3\2\2\2\2\u01ed"+
		"\3\2\2\2\2\u01ef\3\2\2\2\2\u01f1\3\2\2\2\2\u01f3\3\2\2\2\2\u01f5\3\2\2"+
		"\2\2\u01f7\3\2\2\2\2\u01f9\3\2\2\2\2\u01fb\3\2\2\2\2\u01fd\3\2\2\2\2\u01ff"+
		"\3\2\2\2\2\u0201\3\2\2\2\2\u0203\3\2\2\2\2\u0205\3\2\2\2\2\u0207\3\2\2"+
		"\2\2\u0209\3\2\2\2\2\u020b\3\2\2\2\2\u020d\3\2\2\2\2\u020f\3\2\2\2\2\u0211"+
		"\3\2\2\2\2\u0213\3\2\2\2\2\u0215\3\2\2\2\2\u0217\3\2\2\2\2\u0219\3\2\2"+
		"\2\2\u021b\3\2\2\2\2\u021d\3\2\2\2\2\u021f\3\2\2\2\2\u0221\3\2\2\2\2\u0223"+
		"\3\2\2\2\2\u0225\3\2\2\2\2\u0227\3\2\2\2\2\u0229\3\2\2\2\2\u022b\3\2\2"+
		"\2\2\u022d\3\2\2\2\2\u022f\3\2\2\2\2\u0231\3\2\2\2\2\u0233\3\2\2\2\2\u0235"+
		"\3\2\2\2\2\u0237\3\2\2\2\2\u0239\3\2\2\2\2\u023b\3\2\2\2\2\u023d\3\2\2"+
		"\2\2\u023f\3\2\2\2\2\u0241\3\2\2\2\2\u0243\3\2\2\2\2\u0245\3\2\2\2\2\u0247"+
		"\3\2\2\2\2\u0249\3\2\2\2\2\u024b\3\2\2\2\2\u024d\3\2\2\2\2\u024f\3\2\2"+
		"\2\2\u0251\3\2\2\2\2\u0253\3\2\2\2\2\u0255\3\2\2\2\2\u0257\3\2\2\2\2\u0259"+
		"\3\2\2\2\2\u025b\3\2\2\2\2\u0265\3\2\2\2\2\u0267\3\2\2\2\2\u0269\3\2\2"+
		"\2\2\u026b\3\2\2\2\2\u026d\3\2\2\2\3\u026f\3\2\2\2\5\u0271\3\2\2\2\7\u0273"+
		"\3\2\2\2\t\u0275\3\2\2\2\13\u0277\3\2\2\2\r\u027b\3\2\2\2\17\u027e\3\2"+
		"\2\2\21\u0281\3\2\2\2\23\u0283\3\2\2\2\25\u0285\3\2\2\2\27\u0287\3\2\2"+
		"\2\31\u028b\3\2\2\2\33\u0291\3\2\2\2\35\u0295\3\2\2\2\37\u029b\3\2\2\2"+
		"!\u02a3\3\2\2\2#\u02a7\3\2\2\2%\u02ac\3\2\2\2\'\u02b0\3\2\2\2)\u02b8\3"+
		"\2\2\2+\u02be\3\2\2\2-\u02c1\3\2\2\2/\u02c5\3\2\2\2\61\u02c8\3\2\2\2\63"+
		"\u02d6\3\2\2\2\65\u02de\3\2\2\2\67\u02e3\3\2\2\29\u02ea\3\2\2\2;\u02f2"+
		"\3\2\2\2=\u02f5\3\2\2\2?\u02fb\3\2\2\2A\u0303\3\2\2\2C\u0308\3\2\2\2E"+
		"\u030d\3\2\2\2G\u0314\3\2\2\2I\u031a\3\2\2\2K\u0320\3\2\2\2M\u0328\3\2"+
		"\2\2O\u0332\3\2\2\2Q\u033a\3\2\2\2S\u0342\3\2\2\2U\u034d\3\2\2\2W\u0354"+
		"\3\2\2\2Y\u035c\3\2\2\2[\u0364\3\2\2\2]\u036b\3\2\2\2_\u0373\3\2\2\2a"+
		"\u037f\3\2\2\2c\u0387\3\2\2\2e\u0393\3\2\2\2g\u039e\3\2\2\2i\u03a3\3\2"+
		"\2\2k\u03aa\3\2\2\2m\u03b0\3\2\2\2o\u03b5\3\2\2\2q\u03bd\3\2\2\2s\u03ca"+
		"\3\2\2\2u\u03d7\3\2\2\2w\u03e9\3\2\2\2y\u03f6\3\2\2\2{\u03fb\3\2\2\2}"+
		"\u0414\3\2\2\2\177\u0416\3\2\2\2\u0081\u041a\3\2\2\2\u0083\u041f\3\2\2"+
		"\2\u0085\u042c\3\2\2\2\u0087\u0434\3\2\2\2\u0089\u043b\3\2\2\2\u008b\u0445"+
		"\3\2\2\2\u008d\u044a\3\2\2\2\u008f\u0453\3\2\2\2\u0091\u0457\3\2\2\2\u0093"+
		"\u0463\3\2\2\2\u0095\u046d\3\2\2\2\u0097\u0476\3\2\2\2\u0099\u0481\3\2"+
		"\2\2\u009b\u0486\3\2\2\2\u009d\u048b\3\2\2\2\u009f\u048f\3\2\2\2\u00a1"+
		"\u0497\3\2\2\2\u00a3\u049e\3\2\2\2\u00a5\u04a7\3\2\2\2\u00a7\u04ae\3\2"+
		"\2\2\u00a9\u04b6\3\2\2\2\u00ab\u04bd\3\2\2\2\u00ad\u04c6\3\2\2\2\u00af"+
		"\u04cf\3\2\2\2\u00b1\u04d7\3\2\2\2\u00b3\u04dd\3\2\2\2\u00b5\u04e3\3\2"+
		"\2\2\u00b7\u04ea\3\2\2\2\u00b9\u04f5\3\2\2\2\u00bb\u04fb\3\2\2\2\u00bd"+
		"\u0507\3\2\2\2\u00bf\u0511\3\2\2\2\u00c1\u0515\3\2\2\2\u00c3\u051d\3\2"+
		"\2\2\u00c5\u0524\3\2\2\2\u00c7\u052e\3\2\2\2\u00c9\u0533\3\2\2\2\u00cb"+
		"\u0538\3\2\2\2\u00cd\u0541\3\2\2\2\u00cf\u054b\3\2\2\2\u00d1\u0552\3\2"+
		"\2\2\u00d3\u0558\3\2\2\2\u00d5\u055e\3\2\2\2\u00d7\u0567\3\2\2\2\u00d9"+
		"\u056e\3\2\2\2\u00db\u0573\3\2\2\2\u00dd\u0579\3\2\2\2\u00df\u057c\3\2"+
		"\2\2\u00e1\u0583\3\2\2\2\u00e3\u058a\3\2\2\2\u00e5\u058d\3\2\2\2\u00e7"+
		"\u0593\3\2\2\2\u00e9\u059b\3\2\2\2\u00eb\u05a1\3\2\2\2\u00ed\u05a8\3\2"+
		"\2\2\u00ef\u05b4\3\2\2\2\u00f1\u05bb\3\2\2\2\u00f3\u05c5\3\2\2\2\u00f5"+
		"\u05ce\3\2\2\2\u00f7\u05d3\3\2\2\2\u00f9\u05d6\3\2\2\2\u00fb\u05dc\3\2"+
		"\2\2\u00fd\u05e1\3\2\2\2\u00ff\u05e6\3\2\2\2\u0101\u05eb\3\2\2\2\u0103"+
		"\u05f6\3\2\2\2\u0105\u05fe\3\2\2\2\u0107\u0603\3\2\2\2\u0109\u060b\3\2"+
		"\2\2\u010b\u0610\3\2\2\2\u010d\u0615\3\2\2\2\u010f\u061b\3\2\2\2\u0111"+
		"\u0621\3\2\2\2\u0113\u0626\3\2\2\2\u0115\u062b\3\2\2\2\u0117\u0631\3\2"+
		"\2\2\u0119\u063a\3\2\2\2\u011b\u063f\3\2\2\2\u011d\u0645\3\2\2\2\u011f"+
		"\u064d\3\2\2\2\u0121\u0653\3\2\2\2\u0123\u0657\3\2\2\2\u0125\u0663\3\2"+
		"\2\2\u0127\u0670\3\2\2\2\u0129\u067c\3\2\2\2\u012b\u0689\3\2\2\2\u012d"+
		"\u0690\3\2\2\2\u012f\u0698\3\2\2\2\u0131\u069e\3\2\2\2\u0133\u06a5\3\2"+
		"\2\2\u0135\u06aa\3\2\2\2\u0137\u06b4\3\2\2\2\u0139\u06bf\3\2\2\2\u013b"+
		"\u06c7\3\2\2\2\u013d\u06ce\3\2\2\2\u013f\u06d0\3\2\2\2\u0141\u06d5\3\2"+
		"\2\2\u0143\u06db\3\2\2\2\u0145\u06de\3\2\2\2\u0147\u06e1\3\2\2\2\u0149"+
		"\u06e6\3\2\2\2\u014b\u06ed\3\2\2\2\u014d\u06f5\3\2\2\2\u014f\u06f8\3\2"+
		"\2\2\u0151\u06fe\3\2\2\2\u0153\u0702\3\2\2\2\u0155\u0708\3\2\2\2\u0157"+
		"\u0715\3\2\2\2\u0159\u071a\3\2\2\2\u015b\u0723\3\2\2\2\u015d\u072b\3\2"+
		"\2\2\u015f\u0735\3\2\2\2\u0161\u073f\3\2\2\2\u0163\u074b\3\2\2\2\u0165"+
		"\u0756\3\2\2\2\u0167\u075e\3\2\2\2\u0169\u0764\3\2\2\2\u016b\u076c\3\2"+
		"\2\2\u016d\u0775\3\2\2\2\u016f\u077f\3\2\2\2\u0171\u0787\3\2\2\2\u0173"+
		"\u0792\3\2\2\2\u0175\u079d\3\2\2\2\u0177\u07a3\3\2\2\2\u0179\u07a9\3\2"+
		"\2\2\u017b\u07af\3\2\2\2\u017d\u07bc\3\2\2\2\u017f\u07c9\3\2\2\2\u0181"+
		"\u07d1\3\2\2\2\u0183\u07d8\3\2\2\2\u0185\u07e3\3\2\2\2\u0187\u07eb\3\2"+
		"\2\2\u0189\u07f2\3\2\2\2\u018b\u07f9\3\2\2\2\u018d\u0801\3\2\2\2\u018f"+
		"\u0807\3\2\2\2\u0191\u080f\3\2\2\2\u0193\u0818\3\2\2\2\u0195\u081f\3\2"+
		"\2\2\u0197\u0830\3\2\2\2\u0199\u0832\3\2\2\2\u019b\u0837\3\2\2\2\u019d"+
		"\u083d\3\2\2\2\u019f\u0846\3\2\2\2\u01a1\u084d\3\2\2\2\u01a3\u0851\3\2"+
		"\2\2\u01a5\u0856\3\2\2\2\u01a7\u085d\3\2\2\2\u01a9\u0864\3\2\2\2\u01ab"+
		"\u086c\3\2\2\2\u01ad\u0873\3\2\2\2\u01af\u0878\3\2\2\2\u01b1\u0882\3\2"+
		"\2\2\u01b3\u0888\3\2\2\2\u01b5\u0898\3\2\2\2\u01b7\u08a5\3\2\2\2\u01b9"+
		"\u08a9\3\2\2\2\u01bb\u08af\3\2\2\2\u01bd\u08b4\3\2\2\2\u01bf\u08b9\3\2"+
		"\2\2\u01c1\u08c0\3\2\2\2\u01c3\u08c5\3\2\2\2\u01c5\u08ca\3\2\2\2\u01c7"+
		"\u08d1\3\2\2\2\u01c9\u08d7\3\2\2\2\u01cb\u08e2\3\2\2\2\u01cd\u08e9\3\2"+
		"\2\2\u01cf\u08f2\3\2\2\2\u01d1\u08f9\3\2\2\2\u01d3\u0900\3\2\2\2\u01d5"+
		"\u090a\3\2\2\2\u01d7\u0910\3\2\2\2\u01d9\u0917\3\2\2\2\u01db\u0923\3\2"+
		"\2\2\u01dd\u093e\3\2\2\2\u01df\u0940\3\2\2\2\u01e1\u094b\3\2\2\2\u01e3"+
		"\u0950\3\2\2\2\u01e5\u0953\3\2\2\2\u01e7\u0959\3\2\2\2\u01e9\u0962\3\2"+
		"\2\2\u01eb\u096e\3\2\2\2\u01ed\u097b\3\2\2\2\u01ef\u0985\3\2\2\2\u01f1"+
		"\u098a\3\2\2\2\u01f3\u098f\3\2\2\2\u01f5\u0998\3\2\2\2\u01f7\u099d\3\2"+
		"\2\2\u01f9\u09a7\3\2\2\2\u01fb\u09b1\3\2\2\2\u01fd\u09b9\3\2\2\2\u01ff"+
		"\u09bf\3\2\2\2\u0201\u09c6\3\2\2\2\u0203\u09ce\3\2\2\2\u0205\u09d5\3\2"+
		"\2\2\u0207\u09db\3\2\2\2\u0209\u09e2\3\2\2\2\u020b\u09e6\3\2\2\2\u020d"+
		"\u09eb\3\2\2\2\u020f\u09f1\3\2\2\2\u0211\u09f8\3\2\2\2\u0213\u09fd\3\2"+
		"\2\2\u0215\u0a02\3\2\2\2\u0217\u0a08\3\2\2\2\u0219\u0a0d\3\2\2\2\u021b"+
		"\u0a13\3\2\2\2\u021d\u0a1a\3\2\2\2\u021f\u0a1f\3\2\2\2\u0221\u0a24\3\2"+
		"\2\2\u0223\u0a2d\3\2\2\2\u0225\u0a2f\3\2\2\2\u0227\u0a33\3\2\2\2\u0229"+
		"\u0a36\3\2\2\2\u022b\u0a39\3\2\2\2\u022d\u0a3f\3\2\2\2\u022f\u0a41\3\2"+
		"\2\2\u0231\u0a47\3\2\2\2\u0233\u0a49\3\2\2\2\u0235\u0a4b\3\2\2\2\u0237"+
		"\u0a4d\3\2\2\2\u0239\u0a4f\3\2\2\2\u023b\u0a51\3\2\2\2\u023d\u0a53\3\2"+
		"\2\2\u023f\u0a57\3\2\2\2\u0241\u0a59\3\2\2\2\u0243\u0a5b\3\2\2\2\u0245"+
		"\u0a5d\3\2\2\2\u0247\u0a60\3\2\2\2\u0249\u0a76\3\2\2\2\u024b\u0a79\3\2"+
		"\2\2\u024d\u0a80\3\2\2\2\u024f\u0a87\3\2\2\2\u0251\u0a8e\3\2\2\2\u0253"+
		"\u0a9f\3\2\2\2\u0255\u0ab2\3\2\2\2\u0257\u0ac8\3\2\2\2\u0259\u0acd\3\2"+
		"\2\2\u025b\u0ad1\3\2\2\2\u025d\u0aee\3\2\2\2\u025f\u0af0\3\2\2\2\u0261"+
		"\u0af9\3\2\2\2\u0263\u0afb\3\2\2\2\u0265\u0afd\3\2\2\2\u0267\u0b0e\3\2"+
		"\2\2\u0269\u0b15\3\2\2\2\u026b\u0b25\3\2\2\2\u026d\u0b2b\3\2\2\2\u026f"+
		"\u0270\7*\2\2\u0270\4\3\2\2\2\u0271\u0272\7+\2\2\u0272\6\3\2\2\2\u0273"+
		"\u0274\7.\2\2\u0274\b\3\2\2\2\u0275\u0276\7\60\2\2\u0276\n\3\2\2\2\u0277"+
		"\u0278\7\61\2\2\u0278\u0279\7,\2\2\u0279\u027a\7-\2\2\u027a\f\3\2\2\2"+
		"\u027b\u027c\7,\2\2\u027c\u027d\7\61\2\2\u027d\16\3\2\2\2\u027e\u027f"+
		"\7/\2\2\u027f\u0280\7@\2\2\u0280\20\3\2\2\2\u0281\u0282\7]\2\2\u0282\22"+
		"\3\2\2\2\u0283\u0284\7_\2\2\u0284\24\3\2\2\2\u0285\u0286\7<\2\2\u0286"+
		"\26\3\2\2\2\u0287\u0288\7C\2\2\u0288\u0289\7F\2\2\u0289\u028a\7F\2\2\u028a"+
		"\30\3\2\2\2\u028b\u028c\7C\2\2\u028c\u028d\7H\2\2\u028d\u028e\7V\2\2\u028e"+
		"\u028f\7G\2\2\u028f\u0290\7T\2\2\u0290\32\3\2\2\2\u0291\u0292\7C\2\2\u0292"+
		"\u0293\7N\2\2\u0293\u0294\7N\2\2\u0294\34\3\2\2\2\u0295\u0296\7C\2\2\u0296"+
		"\u0297\7N\2\2\u0297\u0298\7V\2\2\u0298\u0299\7G\2\2\u0299\u029a\7T\2\2"+
		"\u029a\36\3\2\2\2\u029b\u029c\7C\2\2\u029c\u029d\7P\2\2\u029d\u029e\7"+
		"C\2\2\u029e\u029f\7N\2\2\u029f\u02a0\7[\2\2\u02a0\u02a1\7\\\2\2\u02a1"+
		"\u02a2\7G\2\2\u02a2 \3\2\2\2\u02a3\u02a4\7C\2\2\u02a4\u02a5\7P\2\2\u02a5"+
		"\u02a6\7F\2\2\u02a6\"\3\2\2\2\u02a7\u02a8\7C\2\2\u02a8\u02a9\7P\2\2\u02a9"+
		"\u02aa\7V\2\2\u02aa\u02ab\7K\2\2\u02ab$\3\2\2\2\u02ac\u02ad\7C\2\2\u02ad"+
		"\u02ae\7P\2\2\u02ae\u02af\7[\2\2\u02af&\3\2\2\2\u02b0\u02b1\7C\2\2\u02b1"+
		"\u02b2\7T\2\2\u02b2\u02b3\7E\2\2\u02b3\u02b4\7J\2\2\u02b4\u02b5\7K\2\2"+
		"\u02b5\u02b6\7X\2\2\u02b6\u02b7\7G\2\2\u02b7(\3\2\2\2\u02b8\u02b9\7C\2"+
		"\2\u02b9\u02ba\7T\2\2\u02ba\u02bb\7T\2\2\u02bb\u02bc\7C\2\2\u02bc\u02bd"+
		"\7[\2\2\u02bd*\3\2\2\2\u02be\u02bf\7C\2\2\u02bf\u02c0\7U\2\2\u02c0,\3"+
		"\2\2\2\u02c1\u02c2\7C\2\2\u02c2\u02c3\7U\2\2\u02c3\u02c4\7E\2\2\u02c4"+
		".\3\2\2\2\u02c5\u02c6\7C\2\2\u02c6\u02c7\7V\2\2\u02c7\60\3\2\2\2\u02c8"+
		"\u02c9\7C\2\2\u02c9\u02ca\7W\2\2\u02ca\u02cb\7V\2\2\u02cb\u02cc\7J\2\2"+
		"\u02cc\u02cd\7Q\2\2\u02cd\u02ce\7T\2\2\u02ce\u02cf\7K\2\2\u02cf\u02d0"+
		"\7\\\2\2\u02d0\u02d1\7C\2\2\u02d1\u02d2\7V\2\2\u02d2\u02d3\7K\2\2\u02d3"+
		"\u02d4\7Q\2\2\u02d4\u02d5\7P\2\2\u02d5\62\3\2\2\2\u02d6\u02d7\7D\2\2\u02d7"+
		"\u02d8\7G\2\2\u02d8\u02d9\7V\2\2\u02d9\u02da\7Y\2\2\u02da\u02db\7G\2\2"+
		"\u02db\u02dc\7G\2\2\u02dc\u02dd\7P\2\2\u02dd\64\3\2\2\2\u02de\u02df\7"+
		"D\2\2\u02df\u02e0\7Q\2\2\u02e0\u02e1\7V\2\2\u02e1\u02e2\7J\2\2\u02e2\66"+
		"\3\2\2\2\u02e3\u02e4\7D\2\2\u02e4\u02e5\7W\2\2\u02e5\u02e6\7E\2\2\u02e6"+
		"\u02e7\7M\2\2\u02e7\u02e8\7G\2\2\u02e8\u02e9\7V\2\2\u02e98\3\2\2\2\u02ea"+
		"\u02eb\7D\2\2\u02eb\u02ec\7W\2\2\u02ec\u02ed\7E\2\2\u02ed\u02ee\7M\2\2"+
		"\u02ee\u02ef\7G\2\2\u02ef\u02f0\7V\2\2\u02f0\u02f1\7U\2\2\u02f1:\3\2\2"+
		"\2\u02f2\u02f3\7D\2\2\u02f3\u02f4\7[\2\2\u02f4<\3\2\2\2\u02f5\u02f6\7"+
		"E\2\2\u02f6\u02f7\7C\2\2\u02f7\u02f8\7E\2\2\u02f8\u02f9\7J\2\2\u02f9\u02fa"+
		"\7G\2\2\u02fa>\3\2\2\2\u02fb\u02fc\7E\2\2\u02fc\u02fd\7C\2\2\u02fd\u02fe"+
		"\7U\2\2\u02fe\u02ff\7E\2\2\u02ff\u0300\7C\2\2\u0300\u0301\7F\2\2\u0301"+
		"\u0302\7G\2\2\u0302@\3\2\2\2\u0303\u0304\7E\2\2\u0304\u0305\7C\2\2\u0305"+
		"\u0306\7U\2\2\u0306\u0307\7G\2\2\u0307B\3\2\2\2\u0308\u0309\7E\2\2\u0309"+
		"\u030a\7C\2\2\u030a\u030b\7U\2\2\u030b\u030c\7V\2\2\u030cD\3\2\2\2\u030d"+
		"\u030e\7E\2\2\u030e\u030f\7J\2\2\u030f\u0310\7C\2\2\u0310\u0311\7P\2\2"+
		"\u0311\u0312\7I\2\2\u0312\u0313\7G\2\2\u0313F\3\2\2\2\u0314\u0315\7E\2"+
		"\2\u0315\u0316\7J\2\2\u0316\u0317\7G\2\2\u0317\u0318\7E\2\2\u0318\u0319"+
		"\7M\2\2\u0319H\3\2\2\2\u031a\u031b\7E\2\2\u031b\u031c\7N\2\2\u031c\u031d"+
		"\7G\2\2\u031d\u031e\7C\2\2\u031e\u031f\7T\2\2\u031fJ\3\2\2\2\u0320\u0321"+
		"\7E\2\2\u0321\u0322\7N\2\2\u0322\u0323\7W\2\2\u0323\u0324\7U\2\2\u0324"+
		"\u0325\7V\2\2\u0325\u0326\7G\2\2\u0326\u0327\7T\2\2\u0327L\3\2\2\2\u0328"+
		"\u0329\7E\2\2\u0329\u032a\7N\2\2\u032a\u032b\7W\2\2\u032b\u032c\7U\2\2"+
		"\u032c\u032d\7V\2\2\u032d\u032e\7G\2\2\u032e\u032f\7T\2\2\u032f\u0330"+
		"\7G\2\2\u0330\u0331\7F\2\2\u0331N\3\2\2\2\u0332\u0333\7E\2\2\u0333\u0334"+
		"\7Q\2\2\u0334\u0335\7F\2\2\u0335\u0336\7G\2\2\u0336\u0337\7I\2\2\u0337"+
		"\u0338\7G\2\2\u0338\u0339\7P\2\2\u0339P\3\2\2\2\u033a\u033b\7E\2\2\u033b"+
		"\u033c\7Q\2\2\u033c\u033d\7N\2\2\u033d\u033e\7N\2\2\u033e\u033f\7C\2\2"+
		"\u033f\u0340\7V\2\2\u0340\u0341\7G\2\2\u0341R\3\2\2\2\u0342\u0343\7E\2"+
		"\2\u0343\u0344\7Q\2\2\u0344\u0345\7N\2\2\u0345\u0346\7N\2\2\u0346\u0347"+
		"\7G\2\2\u0347\u0348\7E\2\2\u0348\u0349\7V\2\2\u0349\u034a\7K\2\2\u034a"+
		"\u034b\7Q\2\2\u034b\u034c\7P\2\2\u034cT\3\2\2\2\u034d\u034e\7E\2\2\u034e"+
		"\u034f\7Q\2\2\u034f\u0350\7N\2\2\u0350\u0351\7W\2\2\u0351\u0352\7O\2\2"+
		"\u0352\u0353\7P\2\2\u0353V\3\2\2\2\u0354\u0355\7E\2\2\u0355\u0356\7Q\2"+
		"\2\u0356\u0357\7N\2\2\u0357\u0358\7W\2\2\u0358\u0359\7O\2\2\u0359\u035a"+
		"\7P\2\2\u035a\u035b\7U\2\2\u035bX\3\2\2\2\u035c\u035d\7E\2\2\u035d\u035e"+
		"\7Q\2\2\u035e\u035f\7O\2\2\u035f\u0360\7O\2\2\u0360\u0361\7G\2\2\u0361"+
		"\u0362\7P\2\2\u0362\u0363\7V\2\2\u0363Z\3\2\2\2\u0364\u0365\7E\2\2\u0365"+
		"\u0366\7Q\2\2\u0366\u0367\7O\2\2\u0367\u0368\7O\2\2\u0368\u0369\7K\2\2"+
		"\u0369\u036a\7V\2\2\u036a\\\3\2\2\2\u036b\u036c\7E\2\2\u036c\u036d\7Q"+
		"\2\2\u036d\u036e\7O\2\2\u036e\u036f\7R\2\2\u036f\u0370\7C\2\2\u0370\u0371"+
		"\7E\2\2\u0371\u0372\7V\2\2\u0372^\3\2\2\2\u0373\u0374\7E\2\2\u0374\u0375"+
		"\7Q\2\2\u0375\u0376\7O\2\2\u0376\u0377\7R\2\2\u0377\u0378\7C\2\2\u0378"+
		"\u0379\7E\2\2\u0379\u037a\7V\2\2\u037a\u037b\7K\2\2\u037b\u037c\7Q\2\2"+
		"\u037c\u037d\7P\2\2\u037d\u037e\7U\2\2\u037e`\3\2\2\2\u037f\u0380\7E\2"+
		"\2\u0380\u0381\7Q\2\2\u0381\u0382\7O\2\2\u0382\u0383\7R\2\2\u0383\u0384"+
		"\7W\2\2\u0384\u0385\7V\2\2\u0385\u0386\7G\2\2\u0386b\3\2\2\2\u0387\u0388"+
		"\7E\2\2\u0388\u0389\7Q\2\2\u0389\u038a\7P\2\2\u038a\u038b\7E\2\2\u038b"+
		"\u038c\7C\2\2\u038c\u038d\7V\2\2\u038d\u038e\7G\2\2\u038e\u038f\7P\2\2"+
		"\u038f\u0390\7C\2\2\u0390\u0391\7V\2\2\u0391\u0392\7G\2\2\u0392d\3\2\2"+
		"\2\u0393\u0394\7E\2\2\u0394\u0395\7Q\2\2\u0395\u0396\7P\2\2\u0396\u0397"+
		"\7U\2\2\u0397\u0398\7V\2\2\u0398\u0399\7T\2\2\u0399\u039a\7C\2\2\u039a"+
		"\u039b\7K\2\2\u039b\u039c\7P\2\2\u039c\u039d\7V\2\2\u039df\3\2\2\2\u039e"+
		"\u039f\7E\2\2\u039f\u03a0\7Q\2\2\u03a0\u03a1\7U\2\2\u03a1\u03a2\7V\2\2"+
		"\u03a2h\3\2\2\2\u03a3\u03a4\7E\2\2\u03a4\u03a5\7T\2\2\u03a5\u03a6\7G\2"+
		"\2\u03a6\u03a7\7C\2\2\u03a7\u03a8\7V\2\2\u03a8\u03a9\7G\2\2\u03a9j\3\2"+
		"\2\2\u03aa\u03ab\7E\2\2\u03ab\u03ac\7T\2\2\u03ac\u03ad\7Q\2\2\u03ad\u03ae"+
		"\7U\2\2\u03ae\u03af\7U\2\2\u03afl\3\2\2\2\u03b0\u03b1\7E\2\2\u03b1\u03b2"+
		"\7W\2\2\u03b2\u03b3\7D\2\2\u03b3\u03b4\7G\2\2\u03b4n\3\2\2\2\u03b5\u03b6"+
		"\7E\2\2\u03b6\u03b7\7W\2\2\u03b7\u03b8\7T\2\2\u03b8\u03b9\7T\2\2\u03b9"+
		"\u03ba\7G\2\2\u03ba\u03bb\7P\2\2\u03bb\u03bc\7V\2\2\u03bcp\3\2\2\2\u03bd"+
		"\u03be\7E\2\2\u03be\u03bf\7W\2\2\u03bf\u03c0\7T\2\2\u03c0\u03c1\7T\2\2"+
		"\u03c1\u03c2\7G\2\2\u03c2\u03c3\7P\2\2\u03c3\u03c4\7V\2\2\u03c4\u03c5"+
		"\7a\2\2\u03c5\u03c6\7F\2\2\u03c6\u03c7\7C\2\2\u03c7\u03c8\7V\2\2\u03c8"+
		"\u03c9\7G\2\2\u03c9r\3\2\2\2\u03ca\u03cb\7E\2\2\u03cb\u03cc\7W\2\2\u03cc"+
		"\u03cd\7T\2\2\u03cd\u03ce\7T\2\2\u03ce\u03cf\7G\2\2\u03cf\u03d0\7P\2\2"+
		"\u03d0\u03d1\7V\2\2\u03d1\u03d2\7a\2\2\u03d2\u03d3\7V\2\2\u03d3\u03d4"+
		"\7K\2\2\u03d4\u03d5\7O\2\2\u03d5\u03d6\7G\2\2\u03d6t\3\2\2\2\u03d7\u03d8"+
		"\7E\2\2\u03d8\u03d9\7W\2\2\u03d9\u03da\7T\2\2\u03da\u03db\7T\2\2\u03db"+
		"\u03dc\7G\2\2\u03dc\u03dd\7P\2\2\u03dd\u03de\7V\2\2\u03de\u03df\7a\2\2"+
		"\u03df\u03e0\7V\2\2\u03e0\u03e1\7K\2\2\u03e1\u03e2\7O\2\2\u03e2\u03e3"+
		"\7G\2\2\u03e3\u03e4\7U\2\2\u03e4\u03e5\7V\2\2\u03e5\u03e6\7C\2\2\u03e6"+
		"\u03e7\7O\2\2\u03e7\u03e8\7R\2\2\u03e8v\3\2\2\2\u03e9\u03ea\7E\2\2\u03ea"+
		"\u03eb\7W\2\2\u03eb\u03ec\7T\2\2\u03ec\u03ed\7T\2\2\u03ed\u03ee\7G\2\2"+
		"\u03ee\u03ef\7P\2\2\u03ef\u03f0\7V\2\2\u03f0\u03f1\7a\2\2\u03f1\u03f2"+
		"\7W\2\2\u03f2\u03f3\7U\2\2\u03f3\u03f4\7G\2\2\u03f4\u03f5\7T\2\2\u03f5"+
		"x\3\2\2\2\u03f6\u03f7\7F\2\2\u03f7\u03f8\7C\2\2\u03f8\u03f9\7V\2\2\u03f9"+
		"\u03fa\7C\2\2\u03faz\3\2\2\2\u03fb\u03fc\7F\2\2\u03fc\u03fd\7C\2\2\u03fd"+
		"\u03fe\7V\2\2\u03fe\u03ff\7C\2\2\u03ff\u0400\7D\2\2\u0400\u0401\7C\2\2"+
		"\u0401\u0402\7U\2\2\u0402\u0403\7G\2\2\u0403|\3\2\2\2\u0404\u0405\7F\2"+
		"\2\u0405\u0406\7C\2\2\u0406\u0407\7V\2\2\u0407\u0408\7C\2\2\u0408\u0409"+
		"\7D\2\2\u0409\u040a\7C\2\2\u040a\u040b\7U\2\2\u040b\u040c\7G\2\2\u040c"+
		"\u0415\7U\2\2\u040d\u040e\7U\2\2\u040e\u040f\7E\2\2\u040f\u0410\7J\2\2"+
		"\u0410\u0411\7G\2\2\u0411\u0412\7O\2\2\u0412\u0413\7C\2\2\u0413\u0415"+
		"\7U\2\2\u0414\u0404\3\2\2\2\u0414\u040d\3\2\2\2\u0415~\3\2\2\2\u0416\u0417"+
		"\7F\2\2\u0417\u0418\7C\2\2\u0418\u0419\7[\2\2\u0419\u0080\3\2\2\2\u041a"+
		"\u041b\7F\2\2\u041b\u041c\7C\2\2\u041c\u041d\7[\2\2\u041d\u041e\7U\2\2"+
		"\u041e\u0082\3\2\2\2\u041f\u0420\7F\2\2\u0420\u0421\7D\2\2\u0421\u0422"+
		"\7R\2\2\u0422\u0423\7T\2\2\u0423\u0424\7Q\2\2\u0424\u0425\7R\2\2\u0425"+
		"\u0426\7G\2\2\u0426\u0427\7T\2\2\u0427\u0428\7V\2\2\u0428\u0429\7K\2\2"+
		"\u0429\u042a\7G\2\2\u042a\u042b\7U\2\2\u042b\u0084\3\2\2\2\u042c\u042d"+
		"\7F\2\2\u042d\u042e\7G\2\2\u042e\u042f\7H\2\2\u042f\u0430\7K\2\2\u0430"+
		"\u0431\7P\2\2\u0431\u0432\7G\2\2\u0432\u0433\7F\2\2\u0433\u0086\3\2\2"+
		"\2\u0434\u0435\7F\2\2\u0435\u0436\7G\2\2\u0436\u0437\7N\2\2\u0437\u0438"+
		"\7G\2\2\u0438\u0439\7V\2\2\u0439\u043a\7G\2\2\u043a\u0088\3\2\2\2\u043b"+
		"\u043c\7F\2\2\u043c\u043d\7G\2\2\u043d\u043e\7N\2\2\u043e\u043f\7K\2\2"+
		"\u043f\u0440\7O\2\2\u0440\u0441\7K\2\2\u0441\u0442\7V\2\2\u0442\u0443"+
		"\7G\2\2\u0443\u0444\7F\2\2\u0444\u008a\3\2\2\2\u0445\u0446\7F\2\2\u0446"+
		"\u0447\7G\2\2\u0447\u0448\7U\2\2\u0448\u0449\7E\2\2\u0449\u008c\3\2\2"+
		"\2\u044a\u044b\7F\2\2\u044b\u044c\7G\2\2\u044c\u044d\7U\2\2\u044d\u044e"+
		"\7E\2\2\u044e\u044f\7T\2\2\u044f\u0450\7K\2\2\u0450\u0451\7D\2\2\u0451"+
		"\u0452\7G\2\2\u0452\u008e\3\2\2\2\u0453\u0454\7F\2\2\u0454\u0455\7H\2"+
		"\2\u0455\u0456\7U\2\2\u0456\u0090\3\2\2\2\u0457\u0458\7F\2\2\u0458\u0459"+
		"\7K\2\2\u0459\u045a\7T\2\2\u045a\u045b\7G\2\2\u045b\u045c\7E\2\2\u045c"+
		"\u045d\7V\2\2\u045d\u045e\7Q\2\2\u045e\u045f\7T\2\2\u045f\u0460\7K\2\2"+
		"\u0460\u0461\7G\2\2\u0461\u0462\7U\2\2\u0462\u0092\3\2\2\2\u0463\u0464"+
		"\7F\2\2\u0464\u0465\7K\2\2\u0465\u0466\7T\2\2\u0466\u0467\7G\2\2\u0467"+
		"\u0468\7E\2\2\u0468\u0469\7V\2\2\u0469\u046a\7Q\2\2\u046a\u046b\7T\2\2"+
		"\u046b\u046c\7[\2\2\u046c\u0094\3\2\2\2\u046d\u046e\7F\2\2\u046e\u046f"+
		"\7K\2\2\u046f\u0470\7U\2\2\u0470\u0471\7V\2\2\u0471\u0472\7K\2\2\u0472"+
		"\u0473\7P\2\2\u0473\u0474\7E\2\2\u0474\u0475\7V\2\2\u0475\u0096\3\2\2"+
		"\2\u0476\u0477\7F\2\2\u0477\u0478\7K\2\2\u0478\u0479\7U\2\2\u0479\u047a"+
		"\7V\2\2\u047a\u047b\7T\2\2\u047b\u047c\7K\2\2\u047c\u047d\7D\2\2\u047d"+
		"\u047e\7W\2\2\u047e\u047f\7V\2\2\u047f\u0480\7G\2\2\u0480\u0098\3\2\2"+
		"\2\u0481\u0482\7F\2\2\u0482\u0483\7T\2\2\u0483\u0484\7Q\2\2\u0484\u0485"+
		"\7R\2\2\u0485\u009a\3\2\2\2\u0486\u0487\7G\2\2\u0487\u0488\7N\2\2\u0488"+
		"\u0489\7U\2\2\u0489\u048a\7G\2\2\u048a\u009c\3\2\2\2\u048b\u048c\7G\2"+
		"\2\u048c\u048d\7P\2\2\u048d\u048e\7F\2\2\u048e\u009e\3\2\2\2\u048f\u0490"+
		"\7G\2\2\u0490\u0491\7U\2\2\u0491\u0492\7E\2\2\u0492\u0493\7C\2\2\u0493"+
		"\u0494\7R\2\2\u0494\u0495\7G\2\2\u0495\u0496\7F\2\2\u0496\u00a0\3\2\2"+
		"\2\u0497\u0498\7G\2\2\u0498\u0499\7Z\2\2\u0499\u049a\7E\2\2\u049a\u049b"+
		"\7G\2\2\u049b\u049c\7R\2\2\u049c\u049d\7V\2\2\u049d\u00a2\3\2\2\2\u049e"+
		"\u049f\7G\2\2\u049f\u04a0\7Z\2\2\u04a0\u04a1\7E\2\2\u04a1\u04a2\7J\2\2"+
		"\u04a2\u04a3\7C\2\2\u04a3\u04a4\7P\2\2\u04a4\u04a5\7I\2\2\u04a5\u04a6"+
		"\7G\2\2\u04a6\u00a4\3\2\2\2\u04a7\u04a8\7G\2\2\u04a8\u04a9\7Z\2\2\u04a9"+
		"\u04aa\7K\2\2\u04aa\u04ab\7U\2\2\u04ab\u04ac\7V\2\2\u04ac\u04ad\7U\2\2"+
		"\u04ad\u00a6\3\2\2\2\u04ae\u04af\7G\2\2\u04af\u04b0\7Z\2\2\u04b0\u04b1"+
		"\7R\2\2\u04b1\u04b2\7N\2\2\u04b2\u04b3\7C\2\2\u04b3\u04b4\7K\2\2\u04b4"+
		"\u04b5\7P\2\2\u04b5\u00a8\3\2\2\2\u04b6\u04b7\7G\2\2\u04b7\u04b8\7Z\2"+
		"\2\u04b8\u04b9\7R\2\2\u04b9\u04ba\7Q\2\2\u04ba\u04bb\7T\2\2\u04bb\u04bc"+
		"\7V\2\2\u04bc\u00aa\3\2\2\2\u04bd\u04be\7G\2\2\u04be\u04bf\7Z\2\2\u04bf"+
		"\u04c0\7V\2\2\u04c0\u04c1\7G\2\2\u04c1\u04c2\7P\2\2\u04c2\u04c3\7F\2\2"+
		"\u04c3\u04c4\7G\2\2\u04c4\u04c5\7F\2\2\u04c5\u00ac\3\2\2\2\u04c6\u04c7"+
		"\7G\2\2\u04c7\u04c8\7Z\2\2\u04c8\u04c9\7V\2\2\u04c9\u04ca\7G\2\2\u04ca"+
		"\u04cb\7T\2\2\u04cb\u04cc\7P\2\2\u04cc\u04cd\7C\2\2\u04cd\u04ce\7N\2\2"+
		"\u04ce\u00ae\3\2\2\2\u04cf\u04d0\7G\2\2\u04d0\u04d1\7Z\2\2\u04d1\u04d2"+
		"\7V\2\2\u04d2\u04d3\7T\2\2\u04d3\u04d4\7C\2\2\u04d4\u04d5\7E\2\2\u04d5"+
		"\u04d6\7V\2\2\u04d6\u00b0\3\2\2\2\u04d7\u04d8\7H\2\2\u04d8\u04d9\7C\2"+
		"\2\u04d9\u04da\7N\2\2\u04da\u04db\7U\2\2\u04db\u04dc\7G\2\2\u04dc\u00b2"+
		"\3\2\2\2\u04dd\u04de\7H\2\2\u04de\u04df\7G\2\2\u04df\u04e0\7V\2\2\u04e0"+
		"\u04e1\7E\2\2\u04e1\u04e2\7J\2\2\u04e2\u00b4\3\2\2\2\u04e3\u04e4\7H\2"+
		"\2\u04e4\u04e5\7K\2\2\u04e5\u04e6\7G\2\2\u04e6\u04e7\7N\2\2\u04e7\u04e8"+
		"\7F\2\2\u04e8\u04e9\7U\2\2\u04e9\u00b6\3\2\2\2\u04ea\u04eb\7H\2\2\u04eb"+
		"\u04ec\7K\2\2\u04ec\u04ed\7N\2\2\u04ed\u04ee\7G\2\2\u04ee\u04ef\7H\2\2"+
		"\u04ef\u04f0\7Q\2\2\u04f0\u04f1\7T\2\2\u04f1\u04f2\7O\2\2\u04f2\u04f3"+
		"\7C\2\2\u04f3\u04f4\7V\2\2\u04f4\u00b8\3\2\2\2\u04f5\u04f6\7H\2\2\u04f6"+
		"\u04f7\7K\2\2\u04f7\u04f8\7T\2\2\u04f8\u04f9\7U\2\2\u04f9\u04fa\7V\2\2"+
		"\u04fa\u00ba\3\2\2\2\u04fb\u04fc\7H\2\2\u04fc\u04fd\7K\2\2\u04fd\u04fe"+
		"\7T\2\2\u04fe\u04ff\7U\2\2\u04ff\u0500\7V\2\2\u0500\u0501\7a\2\2\u0501"+
		"\u0502\7X\2\2\u0502\u0503\7C\2\2\u0503\u0504\7N\2\2\u0504\u0505\7W\2\2"+
		"\u0505\u0506\7G\2\2\u0506\u00bc\3\2\2\2\u0507\u0508\7H\2\2\u0508\u0509"+
		"\7Q\2\2\u0509\u050a\7N\2\2\u050a\u050b\7N\2\2\u050b\u050c\7Q\2\2\u050c"+
		"\u050d\7Y\2\2\u050d\u050e\7K\2\2\u050e\u050f\7P\2\2\u050f\u0510\7I\2\2"+
		"\u0510\u00be\3\2\2\2\u0511\u0512\7H\2\2\u0512\u0513\7Q\2\2\u0513\u0514"+
		"\7T\2\2\u0514\u00c0\3\2\2\2\u0515\u0516\7H\2\2\u0516\u0517\7Q\2\2\u0517"+
		"\u0518\7T\2\2\u0518\u0519\7G\2\2\u0519\u051a\7K\2\2\u051a\u051b\7I\2\2"+
		"\u051b\u051c\7P\2\2\u051c\u00c2\3\2\2\2\u051d\u051e\7H\2\2\u051e\u051f"+
		"\7Q\2\2\u051f\u0520\7T\2\2\u0520\u0521\7O\2\2\u0521\u0522\7C\2\2\u0522"+
		"\u0523\7V\2\2\u0523\u00c4\3\2\2\2\u0524\u0525\7H\2\2\u0525\u0526\7Q\2"+
		"\2\u0526\u0527\7T\2\2\u0527\u0528\7O\2\2\u0528\u0529\7C\2\2\u0529\u052a"+
		"\7V\2\2\u052a\u052b\7V\2\2\u052b\u052c\7G\2\2\u052c\u052d\7F\2\2\u052d"+
		"\u00c6\3\2\2\2\u052e\u052f\7H\2\2\u052f\u0530\7T\2\2\u0530\u0531\7Q\2"+
		"\2\u0531\u0532\7O\2\2\u0532\u00c8\3\2\2\2\u0533\u0534\7H\2\2\u0534\u0535"+
		"\7W\2\2\u0535\u0536\7N\2\2\u0536\u0537\7N\2\2\u0537\u00ca\3\2\2\2\u0538"+
		"\u0539\7H\2\2\u0539\u053a\7W\2\2\u053a\u053b\7P\2\2\u053b\u053c\7E\2\2"+
		"\u053c\u053d\7V\2\2\u053d\u053e\7K\2\2\u053e\u053f\7Q\2\2\u053f\u0540"+
		"\7P\2\2\u0540\u00cc\3\2\2\2\u0541\u0542\7H\2\2\u0542\u0543\7W\2\2\u0543"+
		"\u0544\7P\2\2\u0544\u0545\7E\2\2\u0545\u0546\7V\2\2\u0546\u0547\7K\2\2"+
		"\u0547\u0548\7Q\2\2\u0548\u0549\7P\2\2\u0549\u054a\7U\2\2\u054a\u00ce"+
		"\3\2\2\2\u054b\u054c\7I\2\2\u054c\u054d\7N\2\2\u054d\u054e\7Q\2\2\u054e"+
		"\u054f\7D\2\2\u054f\u0550\7C\2\2\u0550\u0551\7N\2\2\u0551\u00d0\3\2\2"+
		"\2\u0552\u0553\7I\2\2\u0553\u0554\7T\2\2\u0554\u0555\7C\2\2\u0555\u0556"+
		"\7P\2\2\u0556\u0557\7V\2\2\u0557\u00d2\3\2\2\2\u0558\u0559\7I\2\2\u0559"+
		"\u055a\7T\2\2\u055a\u055b\7Q\2\2\u055b\u055c\7W\2\2\u055c\u055d\7R\2\2"+
		"\u055d\u00d4\3\2\2\2\u055e\u055f\7I\2\2\u055f\u0560\7T\2\2\u0560\u0561"+
		"\7Q\2\2\u0561\u0562\7W\2\2\u0562\u0563\7R\2\2\u0563\u0564\7K\2\2\u0564"+
		"\u0565\7P\2\2\u0565\u0566\7I\2\2\u0566\u00d6\3\2\2\2\u0567\u0568\7J\2"+
		"\2\u0568\u0569\7C\2\2\u0569\u056a\7X\2\2\u056a\u056b\7K\2\2\u056b\u056c"+
		"\7P\2\2\u056c\u056d\7I\2\2\u056d\u00d8\3\2\2\2\u056e\u056f\7J\2\2\u056f"+
		"\u0570\7Q\2\2\u0570\u0571\7W\2\2\u0571\u0572\7T\2\2\u0572\u00da\3\2\2"+
		"\2\u0573\u0574\7J\2\2\u0574\u0575\7Q\2\2\u0575\u0576\7W\2\2\u0576\u0577"+
		"\7T\2\2\u0577\u0578\7U\2\2\u0578\u00dc\3\2\2\2\u0579\u057a\7K\2\2\u057a"+
		"\u057b\7H\2\2\u057b\u00de\3\2\2\2\u057c\u057d\7K\2\2\u057d\u057e\7I\2"+
		"\2\u057e\u057f\7P\2\2\u057f\u0580\7Q\2\2\u0580\u0581\7T\2\2\u0581\u0582"+
		"\7G\2\2\u0582\u00e0\3\2\2\2\u0583\u0584\7K\2\2\u0584\u0585\7O\2\2\u0585"+
		"\u0586\7R\2\2\u0586\u0587\7Q\2\2\u0587\u0588\7T\2\2\u0588\u0589\7V\2\2"+
		"\u0589\u00e2\3\2\2\2\u058a\u058b\7K\2\2\u058b\u058c\7P\2\2\u058c\u00e4"+
		"\3\2\2\2\u058d\u058e\7K\2\2\u058e\u058f\7P\2\2\u058f\u0590\7F\2\2\u0590"+
		"\u0591\7G\2\2\u0591\u0592\7Z\2\2\u0592\u00e6\3\2\2\2\u0593\u0594\7K\2"+
		"\2\u0594\u0595\7P\2\2\u0595\u0596\7F\2\2\u0596\u0597\7G\2\2\u0597\u0598"+
		"\7Z\2\2\u0598\u0599\7G\2\2\u0599\u059a\7U\2\2\u059a\u00e8\3\2\2\2\u059b"+
		"\u059c\7K\2\2\u059c\u059d\7P\2\2\u059d\u059e\7P\2\2\u059e\u059f\7G\2\2"+
		"\u059f\u05a0\7T\2\2\u05a0\u00ea\3\2\2\2\u05a1\u05a2\7K\2\2\u05a2\u05a3"+
		"\7P\2\2\u05a3\u05a4\7R\2\2\u05a4\u05a5\7C\2\2\u05a5\u05a6\7V\2\2\u05a6"+
		"\u05a7\7J\2\2\u05a7\u00ec\3\2\2\2\u05a8\u05a9\7K\2\2\u05a9\u05aa\7P\2"+
		"\2\u05aa\u05ab\7R\2\2\u05ab\u05ac\7W\2\2\u05ac\u05ad\7V\2\2\u05ad\u05ae"+
		"\7H\2\2\u05ae\u05af\7Q\2\2\u05af\u05b0\7T\2\2\u05b0\u05b1\7O\2\2\u05b1"+
		"\u05b2\7C\2\2\u05b2\u05b3\7V\2\2\u05b3\u00ee\3\2\2\2\u05b4\u05b5\7K\2"+
		"\2\u05b5\u05b6\7P\2\2\u05b6\u05b7\7U\2\2\u05b7\u05b8\7G\2\2\u05b8\u05b9"+
		"\7T\2\2\u05b9\u05ba\7V\2\2\u05ba\u00f0\3\2\2\2\u05bb\u05bc\7K\2\2\u05bc"+
		"\u05bd\7P\2\2\u05bd\u05be\7V\2\2\u05be\u05bf\7G\2\2\u05bf\u05c0\7T\2\2"+
		"\u05c0\u05c1\7U\2\2\u05c1\u05c2\7G\2\2\u05c2\u05c3\7E\2\2\u05c3\u05c4"+
		"\7V\2\2\u05c4\u00f2\3\2\2\2\u05c5\u05c6\7K\2\2\u05c6\u05c7\7P\2\2\u05c7"+
		"\u05c8\7V\2\2\u05c8\u05c9\7G\2\2\u05c9\u05ca\7T\2\2\u05ca\u05cb\7X\2\2"+
		"\u05cb\u05cc\7C\2\2\u05cc\u05cd\7N\2\2\u05cd\u00f4\3\2\2\2\u05ce\u05cf"+
		"\7K\2\2\u05cf\u05d0\7P\2\2\u05d0\u05d1\7V\2\2\u05d1\u05d2\7Q\2\2\u05d2"+
		"\u00f6\3\2\2\2\u05d3\u05d4\7K\2\2\u05d4\u05d5\7U\2\2\u05d5\u00f8\3\2\2"+
		"\2\u05d6\u05d7\7K\2\2\u05d7\u05d8\7V\2\2\u05d8\u05d9\7G\2\2\u05d9\u05da"+
		"\7O\2\2\u05da\u05db\7U\2\2\u05db\u00fa\3\2\2\2\u05dc\u05dd\7L\2\2\u05dd"+
		"\u05de\7Q\2\2\u05de\u05df\7K\2\2\u05df\u05e0\7P\2\2\u05e0\u00fc\3\2\2"+
		"\2\u05e1\u05e2\7M\2\2\u05e2\u05e3\7G\2\2\u05e3\u05e4\7[\2\2\u05e4\u05e5"+
		"\7U\2\2\u05e5\u00fe\3\2\2\2\u05e6\u05e7\7N\2\2\u05e7\u05e8\7C\2\2\u05e8"+
		"\u05e9\7U\2\2\u05e9\u05ea\7V\2\2\u05ea\u0100\3\2\2\2\u05eb\u05ec\7N\2"+
		"\2\u05ec\u05ed\7C\2\2\u05ed\u05ee\7U\2\2\u05ee\u05ef\7V\2\2\u05ef\u05f0"+
		"\7a\2\2\u05f0\u05f1\7X\2\2\u05f1\u05f2\7C\2\2\u05f2\u05f3\7N\2\2\u05f3"+
		"\u05f4\7W\2\2\u05f4\u05f5\7G\2\2\u05f5\u0102\3\2\2\2\u05f6\u05f7\7N\2"+
		"\2\u05f7\u05f8\7C\2\2\u05f8\u05f9\7V\2\2\u05f9\u05fa\7G\2\2\u05fa\u05fb"+
		"\7T\2\2\u05fb\u05fc\7C\2\2\u05fc\u05fd\7N\2\2\u05fd\u0104\3\2\2\2\u05fe"+
		"\u05ff\7N\2\2\u05ff\u0600\7C\2\2\u0600\u0601\7\\\2\2\u0601\u0602\7[\2"+
		"\2\u0602\u0106\3\2\2\2\u0603\u0604\7N\2\2\u0604\u0605\7G\2\2\u0605\u0606"+
		"\7C\2\2\u0606\u0607\7F\2\2\u0607\u0608\7K\2\2\u0608\u0609\7P\2\2\u0609"+
		"\u060a\7I\2\2\u060a\u0108\3\2\2\2\u060b\u060c\7N\2\2\u060c\u060d\7G\2"+
		"\2\u060d\u060e\7H\2\2\u060e\u060f\7V\2\2\u060f\u010a\3\2\2\2\u0610\u0611"+
		"\7N\2\2\u0611\u0612\7K\2\2\u0612\u0613\7M\2\2\u0613\u0614\7G\2\2\u0614"+
		"\u010c\3\2\2\2\u0615\u0616\7N\2\2\u0616\u0617\7K\2\2\u0617\u0618\7O\2"+
		"\2\u0618\u0619\7K\2\2\u0619\u061a\7V\2\2\u061a\u010e\3\2\2\2\u061b\u061c"+
		"\7N\2\2\u061c\u061d\7K\2\2\u061d\u061e\7P\2\2\u061e\u061f\7G\2\2\u061f"+
		"\u0620\7U\2\2\u0620\u0110\3\2\2\2\u0621\u0622\7N\2\2\u0622\u0623\7K\2"+
		"\2\u0623\u0624\7U\2\2\u0624\u0625\7V\2\2\u0625\u0112\3\2\2\2\u0626\u0627"+
		"\7N\2\2\u0627\u0628\7Q\2\2\u0628\u0629\7C\2\2\u0629\u062a\7F\2\2\u062a"+
		"\u0114\3\2\2\2\u062b\u062c\7N\2\2\u062c\u062d\7Q\2\2\u062d\u062e\7E\2"+
		"\2\u062e\u062f\7C\2\2\u062f\u0630\7N\2\2\u0630\u0116\3\2\2\2\u0631\u0632"+
		"\7N\2\2\u0632\u0633\7Q\2\2\u0633\u0634\7E\2\2\u0634\u0635\7C\2\2\u0635"+
		"\u0636\7V\2\2\u0636\u0637\7K\2\2\u0637\u0638\7Q\2\2\u0638\u0639\7P\2\2"+
		"\u0639\u0118\3\2\2\2\u063a\u063b\7N\2\2\u063b\u063c\7Q\2\2\u063c\u063d"+
		"\7E\2\2\u063d\u063e\7M\2\2\u063e\u011a\3\2\2\2\u063f\u0640\7N\2\2\u0640"+
		"\u0641\7Q\2\2\u0641\u0642\7E\2\2\u0642\u0643\7M\2\2\u0643\u0644\7U\2\2"+
		"\u0644\u011c\3\2\2\2\u0645\u0646\7N\2\2\u0646\u0647\7Q\2\2\u0647\u0648"+
		"\7I\2\2\u0648\u0649\7K\2\2\u0649\u064a\7E\2\2\u064a\u064b\7C\2\2\u064b"+
		"\u064c\7N\2\2\u064c\u011e\3\2\2\2\u064d\u064e\7O\2\2\u064e\u064f\7C\2"+
		"\2\u064f\u0650\7E\2\2\u0650\u0651\7T\2\2\u0651\u0652\7Q\2\2\u0652\u0120"+
		"\3\2\2\2\u0653\u0654\7O\2\2\u0654\u0655\7C\2\2\u0655\u0656\7R\2\2\u0656"+
		"\u0122\3\2\2\2\u0657\u0658\7O\2\2\u0658\u0659\7K\2\2\u0659\u065a\7E\2"+
		"\2\u065a\u065b\7T\2\2\u065b\u065c\7Q\2\2\u065c\u065d\7U\2\2\u065d\u065e"+
		"\7G\2\2\u065e\u065f\7E\2\2\u065f\u0660\7Q\2\2\u0660\u0661\7P\2\2\u0661"+
		"\u0662\7F\2\2\u0662\u0124\3\2\2\2\u0663\u0664\7O\2\2\u0664\u0665\7K\2"+
		"\2\u0665\u0666\7E\2\2\u0666\u0667\7T\2\2\u0667\u0668\7Q\2\2\u0668\u0669"+
		"\7U\2\2\u0669\u066a\7G\2\2\u066a\u066b\7E\2\2\u066b\u066c\7Q\2\2\u066c"+
		"\u066d\7P\2\2\u066d\u066e\7F\2\2\u066e\u066f\7U\2\2\u066f\u0126\3\2\2"+
		"\2\u0670\u0671\7O\2\2\u0671\u0672\7K\2\2\u0672\u0673\7N\2\2\u0673\u0674"+
		"\7N\2\2\u0674\u0675\7K\2\2\u0675\u0676\7U\2\2\u0676\u0677\7G\2\2\u0677"+
		"\u0678\7E\2\2\u0678\u0679\7Q\2\2\u0679\u067a\7P\2\2\u067a\u067b\7F\2\2"+
		"\u067b\u0128\3\2\2\2\u067c\u067d\7O\2\2\u067d\u067e\7K\2\2\u067e\u067f"+
		"\7N\2\2\u067f\u0680\7N\2\2\u0680\u0681\7K\2\2\u0681\u0682\7U\2\2\u0682"+
		"\u0683\7G\2\2\u0683\u0684\7E\2\2\u0684\u0685\7Q\2\2\u0685\u0686\7P\2\2"+
		"\u0686\u0687\7F\2\2\u0687\u0688\7U\2\2\u0688\u012a\3\2\2\2\u0689\u068a"+
		"\7O\2\2\u068a\u068b\7K\2\2\u068b\u068c\7P\2\2\u068c\u068d\7W\2\2\u068d"+
		"\u068e\7V\2\2\u068e\u068f\7G\2\2\u068f\u012c\3\2\2\2\u0690\u0691\7O\2"+
		"\2\u0691\u0692\7K\2\2\u0692\u0693\7P\2\2\u0693\u0694\7W\2\2\u0694\u0695"+
		"\7V\2\2\u0695\u0696\7G\2\2\u0696\u0697\7U\2\2\u0697\u012e\3\2\2\2\u0698"+
		"\u0699\7O\2\2\u0699\u069a\7Q\2\2\u069a\u069b\7P\2\2\u069b\u069c\7V\2\2"+
		"\u069c\u069d\7J\2\2\u069d\u0130\3\2\2\2\u069e\u069f\7O\2\2\u069f\u06a0"+
		"\7Q\2\2\u06a0\u06a1\7P\2\2\u06a1\u06a2\7V\2\2\u06a2\u06a3\7J\2\2\u06a3"+
		"\u06a4\7U\2\2\u06a4\u0132\3\2\2\2\u06a5\u06a6\7O\2\2\u06a6\u06a7\7U\2"+
		"\2\u06a7\u06a8\7E\2\2\u06a8\u06a9\7M\2\2\u06a9\u0134\3\2\2\2\u06aa\u06ab"+
		"\7P\2\2\u06ab\u06ac\7C\2\2\u06ac\u06ad\7O\2\2\u06ad\u06ae\7G\2\2\u06ae"+
		"\u06af\7U\2\2\u06af\u06b0\7R\2\2\u06b0\u06b1\7C\2\2\u06b1\u06b2\7E\2\2"+
		"\u06b2\u06b3\7G\2\2\u06b3\u0136\3\2\2\2\u06b4\u06b5\7P\2\2\u06b5\u06b6"+
		"\7C\2\2\u06b6\u06b7\7O\2\2\u06b7\u06b8\7G\2\2\u06b8\u06b9\7U\2\2\u06b9"+
		"\u06ba\7R\2\2\u06ba\u06bb\7C\2\2\u06bb\u06bc\7E\2\2\u06bc\u06bd\7G\2\2"+
		"\u06bd\u06be\7U\2\2\u06be\u0138\3\2\2\2\u06bf\u06c0\7P\2\2\u06c0\u06c1"+
		"\7C\2\2\u06c1\u06c2\7V\2\2\u06c2\u06c3\7W\2\2\u06c3\u06c4\7T\2\2\u06c4"+
		"\u06c5\7C\2\2\u06c5\u06c6\7N\2\2\u06c6\u013a\3\2\2\2\u06c7\u06c8\7P\2"+
		"\2\u06c8\u06c9\7Q\2\2\u06c9\u013c\3\2\2\2\u06ca\u06cb\7P\2\2\u06cb\u06cc"+
		"\7Q\2\2\u06cc\u06cf\7V\2\2\u06cd\u06cf\7#\2\2\u06ce\u06ca\3\2\2\2\u06ce"+
		"\u06cd\3\2\2\2\u06cf\u013e\3\2\2\2\u06d0\u06d1\7P\2\2\u06d1\u06d2\7W\2"+
		"\2\u06d2\u06d3\7N\2\2\u06d3\u06d4\7N\2\2\u06d4\u0140\3\2\2\2\u06d5\u06d6"+
		"\7P\2\2\u06d6\u06d7\7W\2\2\u06d7\u06d8\7N\2\2\u06d8\u06d9\7N\2\2\u06d9"+
		"\u06da\7U\2\2\u06da\u0142\3\2\2\2\u06db\u06dc\7Q\2\2\u06dc\u06dd\7H\2"+
		"\2\u06dd\u0144\3\2\2\2\u06de\u06df\7Q\2\2\u06df\u06e0\7P\2\2\u06e0\u0146"+
		"\3\2\2\2\u06e1\u06e2\7Q\2\2\u06e2\u06e3\7P\2\2\u06e3\u06e4\7N\2\2\u06e4"+
		"\u06e5\7[\2\2\u06e5\u0148\3\2\2\2\u06e6\u06e7\7Q\2\2\u06e7\u06e8\7R\2"+
		"\2\u06e8\u06e9\7V\2\2\u06e9\u06ea\7K\2\2\u06ea\u06eb\7Q\2\2\u06eb\u06ec"+
		"\7P\2\2\u06ec\u014a\3\2\2\2\u06ed\u06ee\7Q\2\2\u06ee\u06ef\7R\2\2\u06ef"+
		"\u06f0\7V\2\2\u06f0\u06f1\7K\2\2\u06f1\u06f2\7Q\2\2\u06f2\u06f3\7P\2\2"+
		"\u06f3\u06f4\7U\2\2\u06f4\u014c\3\2\2\2\u06f5\u06f6\7Q\2\2\u06f6\u06f7"+
		"\7T\2\2\u06f7\u014e\3\2\2\2\u06f8\u06f9\7Q\2\2\u06f9\u06fa\7T\2\2\u06fa"+
		"\u06fb\7F\2\2\u06fb\u06fc\7G\2\2\u06fc\u06fd\7T\2\2\u06fd\u0150\3\2\2"+
		"\2\u06fe\u06ff\7Q\2\2\u06ff\u0700\7W\2\2\u0700\u0701\7V\2\2\u0701\u0152"+
		"\3\2\2\2\u0702\u0703\7Q\2\2\u0703\u0704\7W\2\2\u0704\u0705\7V\2\2\u0705"+
		"\u0706\7G\2\2\u0706\u0707\7T\2\2\u0707\u0154\3\2\2\2\u0708\u0709\7Q\2"+
		"\2\u0709\u070a\7W\2\2\u070a\u070b\7V\2\2\u070b\u070c\7R\2\2\u070c\u070d"+
		"\7W\2\2\u070d\u070e\7V\2\2\u070e\u070f\7H\2\2\u070f\u0710\7Q\2\2\u0710"+
		"\u0711\7T\2\2\u0711\u0712\7O\2\2\u0712\u0713\7C\2\2\u0713\u0714\7V\2\2"+
		"\u0714\u0156\3\2\2\2\u0715\u0716\7Q\2\2\u0716\u0717\7X\2\2\u0717\u0718"+
		"\7G\2\2\u0718\u0719\7T\2\2\u0719\u0158\3\2\2\2\u071a\u071b\7Q\2\2\u071b"+
		"\u071c\7X\2\2\u071c\u071d\7G\2\2\u071d\u071e\7T\2\2\u071e\u071f\7N\2\2"+
		"\u071f\u0720\7C\2\2\u0720\u0721\7R\2\2\u0721\u0722\7U\2\2\u0722\u015a"+
		"\3\2\2\2\u0723\u0724\7Q\2\2\u0724\u0725\7X\2\2\u0725\u0726\7G\2\2\u0726"+
		"\u0727\7T\2\2\u0727\u0728\7N\2\2\u0728\u0729\7C\2\2\u0729\u072a\7[\2\2"+
		"\u072a\u015c\3\2\2\2\u072b\u072c\7Q\2\2\u072c\u072d\7X\2\2\u072d\u072e"+
		"\7G\2\2\u072e\u072f\7T\2\2\u072f\u0730\7Y\2\2\u0730\u0731\7T\2\2\u0731"+
		"\u0732\7K\2\2\u0732\u0733\7V\2\2\u0733\u0734\7G\2\2\u0734\u015e\3\2\2"+
		"\2\u0735\u0736\7R\2\2\u0736\u0737\7C\2\2\u0737\u0738\7T\2\2\u0738\u0739"+
		"\7V\2\2\u0739\u073a\7K\2\2\u073a\u073b\7V\2\2\u073b\u073c\7K\2\2\u073c"+
		"\u073d\7Q\2\2\u073d\u073e\7P\2\2\u073e\u0160\3\2\2\2\u073f\u0740\7R\2"+
		"\2\u0740\u0741\7C\2\2\u0741\u0742\7T\2\2\u0742\u0743\7V\2\2\u0743\u0744"+
		"\7K\2\2\u0744\u0745\7V\2\2\u0745\u0746\7K\2\2\u0746\u0747\7Q\2\2\u0747"+
		"\u0748\7P\2\2\u0748\u0749\7G\2\2\u0749\u074a\7F\2\2\u074a\u0162\3\2\2"+
		"\2\u074b\u074c\7R\2\2\u074c\u074d\7C\2\2\u074d\u074e\7T\2\2\u074e\u074f"+
		"\7V\2\2\u074f\u0750\7K\2\2\u0750\u0751\7V\2\2\u0751\u0752\7K\2\2\u0752"+
		"\u0753\7Q\2\2\u0753\u0754\7P\2\2\u0754\u0755\7U\2\2\u0755\u0164\3\2\2"+
		"\2\u0756\u0757\7R\2\2\u0757\u0758\7G\2\2\u0758\u0759\7T\2\2\u0759\u075a"+
		"\7E\2\2\u075a\u075b\7G\2\2\u075b\u075c\7P\2\2\u075c\u075d\7V\2\2\u075d"+
		"\u0166\3\2\2\2\u075e\u075f\7R\2\2\u075f\u0760\7K\2\2\u0760\u0761\7X\2"+
		"\2\u0761\u0762\7Q\2\2\u0762\u0763\7V\2\2\u0763\u0168\3\2\2\2\u0764\u0765"+
		"\7R\2\2\u0765\u0766\7N\2\2\u0766\u0767\7C\2\2\u0767\u0768\7E\2\2\u0768"+
		"\u0769\7K\2\2\u0769\u076a\7P\2\2\u076a\u076b\7I\2\2\u076b\u016a\3\2\2"+
		"\2\u076c\u076d\7R\2\2\u076d\u076e\7Q\2\2\u076e\u076f\7U\2\2\u076f\u0770"+
		"\7K\2\2\u0770\u0771\7V\2\2\u0771\u0772\7K\2\2\u0772\u0773\7Q\2\2\u0773"+
		"\u0774\7P\2\2\u0774\u016c\3\2\2\2\u0775\u0776\7R\2\2\u0776\u0777\7T\2"+
		"\2\u0777\u0778\7G\2\2\u0778\u0779\7E\2\2\u0779\u077a\7G\2\2\u077a\u077b"+
		"\7F\2\2\u077b\u077c\7K\2\2\u077c\u077d\7P\2\2\u077d\u077e\7I\2\2\u077e"+
		"\u016e\3\2\2\2\u077f\u0780\7R\2\2\u0780\u0781\7T\2\2\u0781\u0782\7K\2"+
		"\2\u0782\u0783\7O\2\2\u0783\u0784\7C\2\2\u0784\u0785\7T\2\2\u0785\u0786"+
		"\7[\2\2\u0786\u0170\3\2\2\2\u0787\u0788\7R\2\2\u0788\u0789\7T\2\2\u0789"+
		"\u078a\7K\2\2\u078a\u078b\7P\2\2\u078b\u078c\7E\2\2\u078c\u078d\7K\2\2"+
		"\u078d\u078e\7R\2\2\u078e\u078f\7C\2\2\u078f\u0790\7N\2\2\u0790\u0791"+
		"\7U\2\2\u0791\u0172\3\2\2\2\u0792\u0793\7R\2\2\u0793\u0794\7T\2\2\u0794"+
		"\u0795\7Q\2\2\u0795\u0796\7R\2\2\u0796\u0797\7G\2\2\u0797\u0798\7T\2\2"+
		"\u0798\u0799\7V\2\2\u0799\u079a\7K\2\2\u079a\u079b\7G\2\2\u079b\u079c"+
		"\7U\2\2\u079c\u0174\3\2\2\2\u079d\u079e\7R\2\2\u079e\u079f\7W\2\2\u079f"+
		"\u07a0\7T\2\2\u07a0\u07a1\7I\2\2\u07a1\u07a2\7G\2\2\u07a2\u0176\3\2\2"+
		"\2\u07a3\u07a4\7S\2\2\u07a4\u07a5\7W\2\2\u07a5\u07a6\7G\2\2\u07a6\u07a7"+
		"\7T\2\2\u07a7\u07a8\7[\2\2\u07a8\u0178\3\2\2\2\u07a9\u07aa\7T\2\2\u07aa"+
		"\u07ab\7C\2\2\u07ab\u07ac\7P\2\2\u07ac\u07ad\7I\2\2\u07ad\u07ae\7G\2\2"+
		"\u07ae\u017a\3\2\2\2\u07af\u07b0\7T\2\2\u07b0\u07b1\7G\2\2\u07b1\u07b2"+
		"\7E\2\2\u07b2\u07b3\7Q\2\2\u07b3\u07b4\7T\2\2\u07b4\u07b5\7F\2\2\u07b5"+
		"\u07b6\7T\2\2\u07b6\u07b7\7G\2\2\u07b7\u07b8\7C\2\2\u07b8\u07b9\7F\2\2"+
		"\u07b9\u07ba\7G\2\2\u07ba\u07bb\7T\2\2\u07bb\u017c\3\2\2\2\u07bc\u07bd"+
		"\7T\2\2\u07bd\u07be\7G\2\2\u07be\u07bf\7E\2\2\u07bf\u07c0\7Q\2\2\u07c0"+
		"\u07c1\7T\2\2\u07c1\u07c2\7F\2\2\u07c2\u07c3\7Y\2\2\u07c3\u07c4\7T\2\2"+
		"\u07c4\u07c5\7K\2\2\u07c5\u07c6\7V\2\2\u07c6\u07c7\7G\2\2\u07c7\u07c8"+
		"\7T\2\2\u07c8\u017e\3\2\2\2\u07c9\u07ca\7T\2\2\u07ca\u07cb\7G\2\2\u07cb"+
		"\u07cc\7E\2\2\u07cc\u07cd\7Q\2\2\u07cd\u07ce\7X\2\2\u07ce\u07cf\7G\2\2"+
		"\u07cf\u07d0\7T\2\2\u07d0\u0180\3\2\2\2\u07d1\u07d2\7T\2\2\u07d2\u07d3"+
		"\7G\2\2\u07d3\u07d4\7F\2\2\u07d4\u07d5\7W\2\2\u07d5\u07d6\7E\2\2\u07d6"+
		"\u07d7\7G\2\2\u07d7\u0182\3\2\2\2\u07d8\u07d9\7T\2\2\u07d9\u07da\7G\2"+
		"\2\u07da\u07db\7H\2\2\u07db\u07dc\7G\2\2\u07dc\u07dd\7T\2\2\u07dd\u07de"+
		"\7G\2\2\u07de\u07df\7P\2\2\u07df\u07e0\7E\2\2\u07e0\u07e1\7G\2\2\u07e1"+
		"\u07e2\7U\2\2\u07e2\u0184\3\2\2\2\u07e3\u07e4\7T\2\2\u07e4\u07e5\7G\2"+
		"\2\u07e5\u07e6\7H\2\2\u07e6\u07e7\7T\2\2\u07e7\u07e8\7G\2\2\u07e8\u07e9"+
		"\7U\2\2\u07e9\u07ea\7J\2\2\u07ea\u0186\3\2\2\2\u07eb\u07ec\7T\2\2\u07ec"+
		"\u07ed\7G\2\2\u07ed\u07ee\7P\2\2\u07ee\u07ef\7C\2\2\u07ef\u07f0\7O\2\2"+
		"\u07f0\u07f1\7G\2\2\u07f1\u0188\3\2\2\2\u07f2\u07f3\7T\2\2\u07f3\u07f4"+
		"\7G\2\2\u07f4\u07f5\7R\2\2\u07f5\u07f6\7C\2\2\u07f6\u07f7\7K\2\2\u07f7"+
		"\u07f8\7T\2\2\u07f8\u018a\3\2\2\2\u07f9\u07fa\7T\2\2\u07fa\u07fb\7G\2"+
		"\2\u07fb\u07fc\7R\2\2\u07fc\u07fd\7N\2\2\u07fd\u07fe\7C\2\2\u07fe\u07ff"+
		"\7E\2\2\u07ff\u0800\7G\2\2\u0800\u018c\3\2\2\2\u0801\u0802\7T\2\2\u0802"+
		"\u0803\7G\2\2\u0803\u0804\7U\2\2\u0804\u0805\7G\2\2\u0805\u0806\7V\2\2"+
		"\u0806\u018e\3\2\2\2\u0807\u0808\7T\2\2\u0808\u0809\7G\2\2\u0809\u080a"+
		"\7U\2\2\u080a\u080b\7R\2\2\u080b\u080c\7G\2\2\u080c\u080d\7E\2\2\u080d"+
		"\u080e\7V\2\2\u080e\u0190\3\2\2\2\u080f\u0810\7T\2\2\u0810\u0811\7G\2"+
		"\2\u0811\u0812\7U\2\2\u0812\u0813\7V\2\2\u0813\u0814\7T\2\2\u0814\u0815"+
		"\7K\2\2\u0815\u0816\7E\2\2\u0816\u0817\7V\2\2\u0817\u0192\3\2\2\2\u0818"+
		"\u0819\7T\2\2\u0819\u081a\7G\2\2\u081a\u081b\7X\2\2\u081b\u081c\7Q\2\2"+
		"\u081c\u081d\7M\2\2\u081d\u081e\7G\2\2\u081e\u0194\3\2\2\2\u081f\u0820"+
		"\7T\2\2\u0820\u0821\7K\2\2\u0821\u0822\7I\2\2\u0822\u0823\7J\2\2\u0823"+
		"\u0824\7V\2\2\u0824\u0196\3\2\2\2\u0825\u0826\7T\2\2\u0826\u0827\7N\2"+
		"\2\u0827\u0828\7K\2\2\u0828\u0829\7M\2\2\u0829\u0831\7G\2\2\u082a\u082b"+
		"\7T\2\2\u082b\u082c\7G\2\2\u082c\u082d\7I\2\2\u082d\u082e\7G\2\2\u082e"+
		"\u082f\7Z\2\2\u082f\u0831\7R\2\2\u0830\u0825\3\2\2\2\u0830\u082a\3\2\2"+
		"\2\u0831\u0198\3\2\2\2\u0832\u0833\7T\2\2\u0833\u0834\7Q\2\2\u0834\u0835"+
		"\7N\2\2\u0835\u0836\7G\2\2\u0836\u019a\3\2\2\2\u0837\u0838\7T\2\2\u0838"+
		"\u0839\7Q\2\2\u0839\u083a\7N\2\2\u083a\u083b\7G\2\2\u083b\u083c\7U\2\2"+
		"\u083c\u019c\3\2\2\2\u083d\u083e\7T\2\2\u083e\u083f\7Q\2\2\u083f\u0840"+
		"\7N\2\2\u0840\u0841\7N\2\2\u0841\u0842\7D\2\2\u0842\u0843\7C\2\2\u0843"+
		"\u0844\7E\2\2\u0844\u0845\7M\2\2\u0845\u019e\3\2\2\2\u0846\u0847\7T\2"+
		"\2\u0847\u0848\7Q\2\2\u0848\u0849\7N\2\2\u0849\u084a\7N\2\2\u084a\u084b"+
		"\7W\2\2\u084b\u084c\7R\2\2\u084c\u01a0\3\2\2\2\u084d\u084e\7T\2\2\u084e"+
		"\u084f\7Q\2\2\u084f\u0850\7Y\2\2\u0850\u01a2\3\2\2\2\u0851\u0852\7T\2"+
		"\2\u0852\u0853\7Q\2\2\u0853\u0854\7Y\2\2\u0854\u0855\7U\2\2\u0855\u01a4"+
		"\3\2\2\2\u0856\u0857\7U\2\2\u0857\u0858\7E\2\2\u0858\u0859\7J\2\2\u0859"+
		"\u085a\7G\2\2\u085a\u085b\7O\2\2\u085b\u085c\7C\2\2\u085c\u01a6\3\2\2"+
		"\2\u085d\u085e\7U\2\2\u085e\u085f\7G\2\2\u085f\u0860\7E\2\2\u0860\u0861"+
		"\7Q\2\2\u0861\u0862\7P\2\2\u0862\u0863\7F\2\2\u0863\u01a8\3\2\2\2\u0864"+
		"\u0865\7U\2\2\u0865\u0866\7G\2\2\u0866\u0867\7E\2\2\u0867\u0868\7Q\2\2"+
		"\u0868\u0869\7P\2\2\u0869\u086a\7F\2\2\u086a\u086b\7U\2\2\u086b\u01aa"+
		"\3\2\2\2\u086c\u086d\7U\2\2\u086d\u086e\7G\2\2\u086e\u086f\7N\2\2\u086f"+
		"\u0870\7G\2\2\u0870\u0871\7E\2\2\u0871\u0872\7V\2\2\u0872\u01ac\3\2\2"+
		"\2\u0873\u0874\7U\2\2\u0874\u0875\7G\2\2\u0875\u0876\7O\2\2\u0876\u0877"+
		"\7K\2\2\u0877\u01ae\3\2\2\2\u0878\u0879\7U\2\2\u0879\u087a\7G\2\2\u087a"+
		"\u087b\7R\2\2\u087b\u087c\7C\2\2\u087c\u087d\7T\2\2\u087d\u087e\7C\2\2"+
		"\u087e\u087f\7V\2\2\u087f\u0880\7G\2\2\u0880\u0881\7F\2\2\u0881\u01b0"+
		"\3\2\2\2\u0882\u0883\7U\2\2\u0883\u0884\7G\2\2\u0884\u0885\7T\2\2\u0885"+
		"\u0886\7F\2\2\u0886\u0887\7G\2\2\u0887\u01b2\3\2\2\2\u0888\u0889\7U\2"+
		"\2\u0889\u088a\7G\2\2\u088a\u088b\7T\2\2\u088b\u088c\7F\2\2\u088c\u088d"+
		"\7G\2\2\u088d\u088e\7R\2\2\u088e\u088f\7T\2\2\u088f\u0890\7Q\2\2\u0890"+
		"\u0891\7R\2\2\u0891\u0892\7G\2\2\u0892\u0893\7T\2\2\u0893\u0894\7V\2\2"+
		"\u0894\u0895\7K\2\2\u0895\u0896\7G\2\2\u0896\u0897\7U\2\2\u0897\u01b4"+
		"\3\2\2\2\u0898\u0899\7U\2\2\u0899\u089a\7G\2\2\u089a\u089b\7U\2\2\u089b"+
		"\u089c\7U\2\2\u089c\u089d\7K\2\2\u089d\u089e\7Q\2\2\u089e\u089f\7P\2\2"+
		"\u089f\u08a0\7a\2\2\u08a0\u08a1\7W\2\2\u08a1\u08a2\7U\2\2\u08a2\u08a3"+
		"\7G\2\2\u08a3\u08a4\7T\2\2\u08a4\u01b6\3\2\2\2\u08a5\u08a6\7U\2\2\u08a6"+
		"\u08a7\7G\2\2\u08a7\u08a8\7V\2\2\u08a8\u01b8\3\2\2\2\u08a9\u08aa\7O\2"+
		"\2\u08aa\u08ab\7K\2\2\u08ab\u08ac\7P\2\2\u08ac\u08ad\7W\2\2\u08ad\u08ae"+
		"\7U\2\2\u08ae\u01ba\3\2\2\2\u08af\u08b0\7U\2\2\u08b0\u08b1\7G\2\2\u08b1"+
		"\u08b2\7V\2\2\u08b2\u08b3\7U\2\2\u08b3\u01bc\3\2\2\2\u08b4\u08b5\7U\2"+
		"\2\u08b5\u08b6\7J\2\2\u08b6\u08b7\7Q\2\2\u08b7\u08b8\7Y\2\2\u08b8\u01be"+
		"\3\2\2\2\u08b9\u08ba\7U\2\2\u08ba\u08bb\7M\2\2\u08bb\u08bc\7G\2\2\u08bc"+
		"\u08bd\7Y\2\2\u08bd\u08be\7G\2\2\u08be\u08bf\7F\2\2\u08bf\u01c0\3\2\2"+
		"\2\u08c0\u08c1\7U\2\2\u08c1\u08c2\7Q\2\2\u08c2\u08c3\7O\2\2\u08c3\u08c4"+
		"\7G\2\2\u08c4\u01c2\3\2\2\2\u08c5\u08c6\7U\2\2\u08c6\u08c7\7Q\2\2\u08c7"+
		"\u08c8\7T\2\2\u08c8\u08c9\7V\2\2\u08c9\u01c4\3\2\2\2\u08ca\u08cb\7U\2"+
		"\2\u08cb\u08cc\7Q\2\2\u08cc\u08cd\7T\2\2\u08cd\u08ce\7V\2\2\u08ce\u08cf"+
		"\7G\2\2\u08cf\u08d0\7F\2\2\u08d0\u01c6\3\2\2\2\u08d1\u08d2\7U\2\2\u08d2"+
		"\u08d3\7V\2\2\u08d3\u08d4\7C\2\2\u08d4\u08d5\7T\2\2\u08d5\u08d6\7V\2\2"+
		"\u08d6\u01c8\3\2\2\2\u08d7\u08d8\7U\2\2\u08d8\u08d9\7V\2\2\u08d9\u08da"+
		"\7C\2\2\u08da\u08db\7V\2\2\u08db\u08dc\7K\2\2\u08dc\u08dd\7U\2\2\u08dd"+
		"\u08de\7V\2\2\u08de\u08df\7K\2\2\u08df\u08e0\7E\2\2\u08e0\u08e1\7U\2\2"+
		"\u08e1\u01ca\3\2\2\2\u08e2\u08e3\7U\2\2\u08e3\u08e4\7V\2\2\u08e4\u08e5"+
		"\7Q\2\2\u08e5\u08e6\7T\2\2\u08e6\u08e7\7G\2\2\u08e7\u08e8\7F\2\2\u08e8"+
		"\u01cc\3\2\2\2\u08e9\u08ea\7U\2\2\u08ea\u08eb\7V\2\2\u08eb\u08ec\7T\2"+
		"\2\u08ec\u08ed\7C\2\2\u08ed\u08ee\7V\2\2\u08ee\u08ef\7K\2\2\u08ef\u08f0"+
		"\7H\2\2\u08f0\u08f1\7[\2\2\u08f1\u01ce\3\2\2\2\u08f2\u08f3\7U\2\2\u08f3"+
		"\u08f4\7V\2\2\u08f4\u08f5\7T\2\2\u08f5\u08f6\7W\2\2\u08f6\u08f7\7E\2\2"+
		"\u08f7\u08f8\7V\2\2\u08f8\u01d0\3\2\2\2\u08f9\u08fa\7U\2\2\u08fa\u08fb"+
		"\7W\2\2\u08fb\u08fc\7D\2\2\u08fc\u08fd\7U\2\2\u08fd\u08fe\7V\2\2\u08fe"+
		"\u08ff\7T\2\2\u08ff\u01d2\3\2\2\2\u0900\u0901\7U\2\2\u0901\u0902\7W\2"+
		"\2\u0902\u0903\7D\2\2\u0903\u0904\7U\2\2\u0904\u0905\7V\2\2\u0905\u0906"+
		"\7T\2\2\u0906\u0907\7K\2\2\u0907\u0908\7P\2\2\u0908\u0909\7I\2\2\u0909"+
		"\u01d4\3\2\2\2\u090a\u090b\7V\2\2\u090b\u090c\7C\2\2\u090c\u090d\7D\2"+
		"\2\u090d\u090e\7N\2\2\u090e\u090f\7G\2\2\u090f\u01d6\3\2\2\2\u0910\u0911"+
		"\7V\2\2\u0911\u0912\7C\2\2\u0912\u0913\7D\2\2\u0913\u0914\7N\2\2\u0914"+
		"\u0915\7G\2\2\u0915\u0916\7U\2\2\u0916\u01d8\3\2\2\2\u0917\u0918\7V\2"+
		"\2\u0918\u0919\7C\2\2\u0919\u091a\7D\2\2\u091a\u091b\7N\2\2\u091b\u091c"+
		"\7G\2\2\u091c\u091d\7U\2\2\u091d\u091e\7C\2\2\u091e\u091f\7O\2\2\u091f"+
		"\u0920\7R\2\2\u0920\u0921\7N\2\2\u0921\u0922\7G\2\2\u0922\u01da\3\2\2"+
		"\2\u0923\u0924\7V\2\2\u0924\u0925\7D\2\2\u0925\u0926\7N\2\2\u0926\u0927"+
		"\7R\2\2\u0927\u0928\7T\2\2\u0928\u0929\7Q\2\2\u0929\u092a\7R\2\2\u092a"+
		"\u092b\7G\2\2\u092b\u092c\7T\2\2\u092c\u092d\7V\2\2\u092d\u092e\7K\2\2"+
		"\u092e\u092f\7G\2\2\u092f\u0930\7U\2\2\u0930\u01dc\3\2\2\2\u0931\u0932"+
		"\7V\2\2\u0932\u0933\7G\2\2\u0933\u0934\7O\2\2\u0934\u0935\7R\2\2\u0935"+
		"\u0936\7Q\2\2\u0936\u0937\7T\2\2\u0937\u0938\7C\2\2\u0938\u0939\7T\2\2"+
		"\u0939\u093f\7[\2\2\u093a\u093b\7V\2\2\u093b\u093c\7G\2\2\u093c\u093d"+
		"\7O\2\2\u093d\u093f\7R\2\2\u093e\u0931\3\2\2\2\u093e\u093a\3\2\2\2\u093f"+
		"\u01de\3\2\2\2\u0940\u0941\7V\2\2\u0941\u0942\7G\2\2\u0942\u0943\7T\2"+
		"\2\u0943\u0944\7O\2\2\u0944\u0945\7K\2\2\u0945\u0946\7P\2\2\u0946\u0947"+
		"\7C\2\2\u0947\u0948\7V\2\2\u0948\u0949\7G\2\2\u0949\u094a\7F\2\2\u094a"+
		"\u01e0\3\2\2\2\u094b\u094c\7V\2\2\u094c\u094d\7J\2\2\u094d\u094e\7G\2"+
		"\2\u094e\u094f\7P\2\2\u094f\u01e2\3\2\2\2\u0950\u0951\7V\2\2\u0951\u0952"+
		"\7Q\2\2\u0952\u01e4\3\2\2\2\u0953\u0954\7V\2\2\u0954\u0955\7Q\2\2\u0955"+
		"\u0956\7W\2\2\u0956\u0957\7E\2\2\u0957\u0958\7J\2\2\u0958\u01e6\3\2\2"+
		"\2\u0959\u095a\7V\2\2\u095a\u095b\7T\2\2\u095b\u095c\7C\2\2\u095c\u095d"+
		"\7K\2\2\u095d\u095e\7N\2\2\u095e\u095f\7K\2\2\u095f\u0960\7P\2\2\u0960"+
		"\u0961\7I\2\2\u0961\u01e8\3\2\2\2\u0962\u0963\7V\2\2\u0963\u0964\7T\2"+
		"\2\u0964\u0965\7C\2\2\u0965\u0966\7P\2\2\u0966\u0967\7U\2\2\u0967\u0968"+
		"\7C\2\2\u0968\u0969\7E\2\2\u0969\u096a\7V\2\2\u096a\u096b\7K\2\2\u096b"+
		"\u096c\7Q\2\2\u096c\u096d\7P\2\2\u096d\u01ea\3\2\2\2\u096e\u096f\7V\2"+
		"\2\u096f\u0970\7T\2\2\u0970\u0971\7C\2\2\u0971\u0972\7P\2\2\u0972\u0973"+
		"\7U\2\2\u0973\u0974\7C\2\2\u0974\u0975\7E\2\2\u0975\u0976\7V\2\2\u0976"+
		"\u0977\7K\2\2\u0977\u0978\7Q\2\2\u0978\u0979\7P\2\2\u0979\u097a\7U\2\2"+
		"\u097a\u01ec\3\2\2\2\u097b\u097c\7V\2\2\u097c\u097d\7T\2\2\u097d\u097e"+
		"\7C\2\2\u097e\u097f\7P\2\2\u097f\u0980\7U\2\2\u0980\u0981\7H\2\2\u0981"+
		"\u0982\7Q\2\2\u0982\u0983\7T\2\2\u0983\u0984\7O\2\2\u0984\u01ee\3\2\2"+
		"\2\u0985\u0986\7V\2\2\u0986\u0987\7T\2\2\u0987\u0988\7K\2\2\u0988\u0989"+
		"\7O\2\2\u0989\u01f0\3\2\2\2\u098a\u098b\7V\2\2\u098b\u098c\7T\2\2\u098c"+
		"\u098d\7W\2\2\u098d\u098e\7G\2\2\u098e\u01f2\3\2\2\2\u098f\u0990\7V\2"+
		"\2\u0990\u0991\7T\2\2\u0991\u0992\7W\2\2\u0992\u0993\7P\2\2\u0993\u0994"+
		"\7E\2\2\u0994\u0995\7C\2\2\u0995\u0996\7V\2\2\u0996\u0997\7G\2\2\u0997"+
		"\u01f4\3\2\2\2\u0998\u0999\7V\2\2\u0999\u099a\7[\2\2\u099a\u099b\7R\2"+
		"\2\u099b\u099c\7G\2\2\u099c\u01f6\3\2\2\2\u099d\u099e\7W\2\2\u099e\u099f"+
		"\7P\2\2\u099f\u09a0\7C\2\2\u09a0\u09a1\7T\2\2\u09a1\u09a2\7E\2\2\u09a2"+
		"\u09a3\7J\2\2\u09a3\u09a4\7K\2\2\u09a4\u09a5\7X\2\2\u09a5\u09a6\7G\2\2"+
		"\u09a6\u01f8\3\2\2\2\u09a7\u09a8\7W\2\2\u09a8\u09a9\7P\2\2\u09a9\u09aa"+
		"\7D\2\2\u09aa\u09ab\7Q\2\2\u09ab\u09ac\7W\2\2\u09ac\u09ad\7P\2\2\u09ad"+
		"\u09ae\7F\2\2\u09ae\u09af\7G\2\2\u09af\u09b0\7F\2\2\u09b0\u01fa\3\2\2"+
		"\2\u09b1\u09b2\7W\2\2\u09b2\u09b3\7P\2\2\u09b3\u09b4\7E\2\2\u09b4\u09b5"+
		"\7C\2\2\u09b5\u09b6\7E\2\2\u09b6\u09b7\7J\2\2\u09b7\u09b8\7G\2\2\u09b8"+
		"\u01fc\3\2\2\2\u09b9\u09ba\7W\2\2\u09ba\u09bb\7P\2\2\u09bb\u09bc\7K\2"+
		"\2\u09bc\u09bd\7Q\2\2\u09bd\u09be\7P\2\2\u09be\u01fe\3\2\2\2\u09bf\u09c0"+
		"\7W\2\2\u09c0\u09c1\7P\2\2\u09c1\u09c2\7K\2\2\u09c2\u09c3\7S\2\2\u09c3"+
		"\u09c4\7W\2\2\u09c4\u09c5\7G\2\2\u09c5\u0200\3\2\2\2\u09c6\u09c7\7W\2"+
		"\2\u09c7\u09c8\7P\2\2\u09c8\u09c9\7M\2\2\u09c9\u09ca\7P\2\2\u09ca\u09cb"+
		"\7Q\2\2\u09cb\u09cc\7Y\2\2\u09cc\u09cd\7P\2\2\u09cd\u0202\3\2\2\2\u09ce"+
		"\u09cf\7W\2\2\u09cf\u09d0\7P\2\2\u09d0\u09d1\7N\2\2\u09d1\u09d2\7Q\2\2"+
		"\u09d2\u09d3\7E\2\2\u09d3\u09d4\7M\2\2\u09d4\u0204\3\2\2\2\u09d5\u09d6"+
		"\7W\2\2\u09d6\u09d7\7P\2\2\u09d7\u09d8\7U\2\2\u09d8\u09d9\7G\2\2\u09d9"+
		"\u09da\7V\2\2\u09da\u0206\3\2\2\2\u09db\u09dc\7W\2\2\u09dc\u09dd\7R\2"+
		"\2\u09dd\u09de\7F\2\2\u09de\u09df\7C\2\2\u09df\u09e0\7V\2\2\u09e0\u09e1"+
		"\7G\2\2\u09e1\u0208\3\2\2\2\u09e2\u09e3\7W\2\2\u09e3\u09e4\7U\2\2\u09e4"+
		"\u09e5\7G\2\2\u09e5\u020a\3\2\2\2\u09e6\u09e7\7W\2\2\u09e7\u09e8\7U\2"+
		"\2\u09e8\u09e9\7G\2\2\u09e9\u09ea\7T\2\2\u09ea\u020c\3\2\2\2\u09eb\u09ec"+
		"\7W\2\2\u09ec\u09ed\7U\2\2\u09ed\u09ee\7K\2\2\u09ee\u09ef\7P\2\2\u09ef"+
		"\u09f0\7I\2\2\u09f0\u020e\3\2\2\2\u09f1\u09f2\7X\2\2\u09f2\u09f3\7C\2"+
		"\2\u09f3\u09f4\7N\2\2\u09f4\u09f5\7W\2\2\u09f5\u09f6\7G\2\2\u09f6\u09f7"+
		"\7U\2\2\u09f7\u0210\3\2\2\2\u09f8\u09f9\7X\2\2\u09f9\u09fa\7K\2\2\u09fa"+
		"\u09fb\7G\2\2\u09fb\u09fc\7Y\2\2\u09fc\u0212\3\2\2\2\u09fd\u09fe\7Y\2"+
		"\2\u09fe\u09ff\7G\2\2\u09ff\u0a00\7G\2\2\u0a00\u0a01\7M\2\2\u0a01\u0214"+
		"\3\2\2\2\u0a02\u0a03\7Y\2\2\u0a03\u0a04\7G\2\2\u0a04\u0a05\7G\2\2\u0a05"+
		"\u0a06\7M\2\2\u0a06\u0a07\7U";
	private static final String _serializedATNSegment1 =
		"\2\2\u0a07\u0216\3\2\2\2\u0a08\u0a09\7Y\2\2\u0a09\u0a0a\7J\2\2\u0a0a\u0a0b"+
		"\7G\2\2\u0a0b\u0a0c\7P\2\2\u0a0c\u0218\3\2\2\2\u0a0d\u0a0e\7Y\2\2\u0a0e"+
		"\u0a0f\7J\2\2\u0a0f\u0a10\7G\2\2\u0a10\u0a11\7T\2\2\u0a11\u0a12\7G\2\2"+
		"\u0a12\u021a\3\2\2\2\u0a13\u0a14\7Y\2\2\u0a14\u0a15\7K\2\2\u0a15\u0a16"+
		"\7P\2\2\u0a16\u0a17\7F\2\2\u0a17\u0a18\7Q\2\2\u0a18\u0a19\7Y\2\2\u0a19"+
		"\u021c\3\2\2\2\u0a1a\u0a1b\7Y\2\2\u0a1b\u0a1c\7K\2\2\u0a1c\u0a1d\7V\2"+
		"\2\u0a1d\u0a1e\7J\2\2\u0a1e\u021e\3\2\2\2\u0a1f\u0a20\7[\2\2\u0a20\u0a21"+
		"\7G\2\2\u0a21\u0a22\7C\2\2\u0a22\u0a23\7T\2\2\u0a23\u0220\3\2\2\2\u0a24"+
		"\u0a25\7[\2\2\u0a25\u0a26\7G\2\2\u0a26\u0a27\7C\2\2\u0a27\u0a28\7T\2\2"+
		"\u0a28\u0a29\7U\2\2\u0a29\u0222\3\2\2\2\u0a2a\u0a2e\7?\2\2\u0a2b\u0a2c"+
		"\7?\2\2\u0a2c\u0a2e\7?\2\2\u0a2d\u0a2a\3\2\2\2\u0a2d\u0a2b\3\2\2\2\u0a2e"+
		"\u0224\3\2\2\2\u0a2f\u0a30\7>\2\2\u0a30\u0a31\7?\2\2\u0a31\u0a32\7@\2"+
		"\2\u0a32\u0226\3\2\2\2\u0a33\u0a34\7>\2\2\u0a34\u0a35\7@\2\2\u0a35\u0228"+
		"\3\2\2\2\u0a36\u0a37\7#\2\2\u0a37\u0a38\7?\2\2\u0a38\u022a\3\2\2\2\u0a39"+
		"\u0a3a\7>\2\2\u0a3a\u022c\3\2\2\2\u0a3b\u0a3c\7>\2\2\u0a3c\u0a40\7?\2"+
		"\2\u0a3d\u0a3e\7#\2\2\u0a3e\u0a40\7@\2\2\u0a3f\u0a3b\3\2\2\2\u0a3f\u0a3d"+
		"\3\2\2\2\u0a40\u022e\3\2\2\2\u0a41\u0a42\7@\2\2\u0a42\u0230\3\2\2\2\u0a43"+
		"\u0a44\7@\2\2\u0a44\u0a48\7?\2\2\u0a45\u0a46\7#\2\2\u0a46\u0a48\7>\2\2"+
		"\u0a47\u0a43\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a48\u0232\3\2\2\2\u0a49\u0a4a"+
		"\7-\2\2\u0a4a\u0234\3\2\2\2\u0a4b\u0a4c\7/\2\2\u0a4c\u0236\3\2\2\2\u0a4d"+
		"\u0a4e\7,\2\2\u0a4e\u0238\3\2\2\2\u0a4f\u0a50\7\61\2\2\u0a50\u023a\3\2"+
		"\2\2\u0a51\u0a52\7\'\2\2\u0a52\u023c\3\2\2\2\u0a53\u0a54\7F\2\2\u0a54"+
		"\u0a55\7K\2\2\u0a55\u0a56\7X\2\2\u0a56\u023e\3\2\2\2\u0a57\u0a58\7\u0080"+
		"\2\2\u0a58\u0240\3\2\2\2\u0a59\u0a5a\7(\2\2\u0a5a\u0242\3\2\2\2\u0a5b"+
		"\u0a5c\7~\2\2\u0a5c\u0244\3\2\2\2\u0a5d\u0a5e\7~\2\2\u0a5e\u0a5f\7~\2"+
		"\2\u0a5f\u0246\3\2\2\2\u0a60\u0a61\7`\2\2\u0a61\u0248\3\2\2\2\u0a62\u0a68"+
		"\7)\2\2\u0a63\u0a67\n\2\2\2\u0a64\u0a65\7^\2\2\u0a65\u0a67\13\2\2\2\u0a66"+
		"\u0a63\3\2\2\2\u0a66\u0a64\3\2\2\2\u0a67\u0a6a\3\2\2\2\u0a68\u0a66\3\2"+
		"\2\2\u0a68\u0a69\3\2\2\2\u0a69\u0a6b\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6b"+
		"\u0a77\7)\2\2\u0a6c\u0a72\7$\2\2\u0a6d\u0a71\n\3\2\2\u0a6e\u0a6f\7^\2"+
		"\2\u0a6f\u0a71\13\2\2\2\u0a70\u0a6d\3\2\2\2\u0a70\u0a6e\3\2\2\2\u0a71"+
		"\u0a74\3\2\2\2\u0a72\u0a70\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73\u0a75\3\2"+
		"\2\2\u0a74\u0a72\3\2\2\2\u0a75\u0a77\7$\2\2\u0a76\u0a62\3\2\2\2\u0a76"+
		"\u0a6c\3\2\2\2\u0a77\u024a\3\2\2\2\u0a78\u0a7a\5\u0261\u0131\2\u0a79\u0a78"+
		"\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a79\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c"+
		"\u0a7d\3\2\2\2\u0a7d\u0a7e\7N\2\2\u0a7e\u024c\3\2\2\2\u0a7f\u0a81\5\u0261"+
		"\u0131\2\u0a80\u0a7f\3\2\2\2\u0a81\u0a82\3\2\2\2\u0a82\u0a80\3\2\2\2\u0a82"+
		"\u0a83\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a85\7U\2\2\u0a85\u024e\3\2"+
		"\2\2\u0a86\u0a88\5\u0261\u0131\2\u0a87\u0a86\3\2\2\2\u0a88\u0a89\3\2\2"+
		"\2\u0a89\u0a87\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b\u0a8c"+
		"\7[\2\2\u0a8c\u0250\3\2\2\2\u0a8d\u0a8f\5\u0261\u0131\2\u0a8e\u0a8d\3"+
		"\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a8e\3\2\2\2\u0a90\u0a91\3\2\2\2\u0a91"+
		"\u0252\3\2\2\2\u0a92\u0a94\5\u0261\u0131\2\u0a93\u0a92\3\2\2\2\u0a94\u0a95"+
		"\3\2\2\2\u0a95\u0a93\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97"+
		"\u0a98\5\u025f\u0130\2\u0a98\u0aa0\3\2\2\2\u0a99\u0a9b\5\u025d\u012f\2"+
		"\u0a9a\u0a9c\5\u025f\u0130\2\u0a9b\u0a9a\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c"+
		"\u0a9d\3\2\2\2\u0a9d\u0a9e\6\u012a\2\2\u0a9e\u0aa0\3\2\2\2\u0a9f\u0a93"+
		"\3\2\2\2\u0a9f\u0a99\3\2\2\2\u0aa0\u0254\3\2\2\2\u0aa1\u0aa3\5\u0261\u0131"+
		"\2\u0aa2\u0aa1\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa2\3\2\2\2\u0aa4\u0aa5"+
		"\3\2\2\2\u0aa5\u0aa7\3\2\2\2\u0aa6\u0aa8\5\u025f\u0130\2\u0aa7\u0aa6\3"+
		"\2\2\2\u0aa7\u0aa8\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0aaa\7F\2\2\u0aaa"+
		"\u0ab3\3\2\2\2\u0aab\u0aad\5\u025d\u012f\2\u0aac\u0aae\5\u025f\u0130\2"+
		"\u0aad\u0aac\3\2\2\2\u0aad\u0aae\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u0ab0"+
		"\7F\2\2\u0ab0\u0ab1\6\u012b\3\2\u0ab1\u0ab3\3\2\2\2\u0ab2\u0aa2\3\2\2"+
		"\2\u0ab2\u0aab\3\2\2\2\u0ab3\u0256\3\2\2\2\u0ab4\u0ab6\5\u0261\u0131\2"+
		"\u0ab5\u0ab4\3\2\2\2\u0ab6\u0ab7\3\2\2\2\u0ab7\u0ab5\3\2\2\2\u0ab7\u0ab8"+
		"\3\2\2\2\u0ab8\u0aba\3\2\2\2\u0ab9\u0abb\5\u025f\u0130\2\u0aba\u0ab9\3"+
		"\2\2\2\u0aba\u0abb\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u0abd\7D\2\2\u0abd"+
		"\u0abe\7F\2\2\u0abe\u0ac9\3\2\2\2\u0abf\u0ac1\5\u025d\u012f\2\u0ac0\u0ac2"+
		"\5\u025f\u0130\2\u0ac1\u0ac0\3\2\2\2\u0ac1\u0ac2\3\2\2\2\u0ac2\u0ac3\3"+
		"\2\2\2\u0ac3\u0ac4\7D\2\2\u0ac4\u0ac5\7F\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6"+
		"\u0ac7\6\u012c\4\2\u0ac7\u0ac9\3\2\2\2\u0ac8\u0ab5\3\2\2\2\u0ac8\u0abf"+
		"\3\2\2\2\u0ac9\u0258\3\2\2\2\u0aca\u0ace\5\u0263\u0132\2\u0acb\u0ace\5"+
		"\u0261\u0131\2\u0acc\u0ace\7a\2\2\u0acd\u0aca\3\2\2\2\u0acd\u0acb\3\2"+
		"\2\2\u0acd\u0acc\3\2\2\2\u0ace\u0acf\3\2\2\2\u0acf\u0acd\3\2\2\2\u0acf"+
		"\u0ad0\3\2\2\2\u0ad0\u025a\3\2\2\2\u0ad1\u0ad7\7b\2\2\u0ad2\u0ad6\n\4"+
		"\2\2\u0ad3\u0ad4\7b\2\2\u0ad4\u0ad6\7b\2\2\u0ad5\u0ad2\3\2\2\2\u0ad5\u0ad3"+
		"\3\2\2\2\u0ad6\u0ad9\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8"+
		"\u0ada\3\2\2\2\u0ad9\u0ad7\3\2\2\2\u0ada\u0adb\7b\2\2\u0adb\u025c\3\2"+
		"\2\2\u0adc\u0ade\5\u0261\u0131\2\u0add\u0adc\3\2\2\2\u0ade\u0adf\3\2\2"+
		"\2\u0adf\u0add\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u0ae5"+
		"\7\60\2\2\u0ae2\u0ae4\5\u0261\u0131\2\u0ae3\u0ae2\3\2\2\2\u0ae4\u0ae7"+
		"\3\2\2\2\u0ae5\u0ae3\3\2\2\2\u0ae5\u0ae6\3\2\2\2\u0ae6\u0aef\3\2\2\2\u0ae7"+
		"\u0ae5\3\2\2\2\u0ae8\u0aea\7\60\2\2\u0ae9\u0aeb\5\u0261\u0131\2\u0aea"+
		"\u0ae9\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aea\3\2\2\2\u0aec\u0aed\3\2"+
		"\2\2\u0aed\u0aef\3\2\2\2\u0aee\u0add\3\2\2\2\u0aee\u0ae8\3\2\2\2\u0aef"+
		"\u025e\3\2\2\2\u0af0\u0af2\7G\2\2\u0af1\u0af3\t\5\2\2\u0af2\u0af1\3\2"+
		"\2\2\u0af2\u0af3\3\2\2\2\u0af3\u0af5\3\2\2\2\u0af4\u0af6\5\u0261\u0131"+
		"\2\u0af5\u0af4\3\2\2\2\u0af6\u0af7\3\2\2\2\u0af7\u0af5\3\2\2\2\u0af7\u0af8"+
		"\3\2\2\2\u0af8\u0260\3\2\2\2\u0af9\u0afa\t\6\2\2\u0afa\u0262\3\2\2\2\u0afb"+
		"\u0afc\t\7\2\2\u0afc\u0264\3\2\2\2\u0afd\u0afe\7/\2\2\u0afe\u0aff\7/\2"+
		"\2\u0aff\u0b03\3\2\2\2\u0b00\u0b02\n\b\2\2\u0b01\u0b00\3\2\2\2\u0b02\u0b05"+
		"\3\2\2\2\u0b03\u0b01\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u0b07\3\2\2\2\u0b05"+
		"\u0b03\3\2\2\2\u0b06\u0b08\7\17\2\2\u0b07\u0b06\3\2\2\2\u0b07\u0b08\3"+
		"\2\2\2\u0b08\u0b0a\3\2\2\2\u0b09\u0b0b\7\f\2\2\u0b0a\u0b09\3\2\2\2\u0b0a"+
		"\u0b0b\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u0b0d\b\u0133\2\2\u0b0d\u0266"+
		"\3\2\2\2\u0b0e\u0b0f\7\61\2\2\u0b0f\u0b10\7,\2\2\u0b10\u0b11\7,\2\2\u0b11"+
		"\u0b12\7\61\2\2\u0b12\u0b13\3\2\2\2\u0b13\u0b14\b\u0134\2\2\u0b14\u0268"+
		"\3\2\2\2\u0b15\u0b16\7\61\2\2\u0b16\u0b17\7,\2\2\u0b17\u0b18\3\2\2\2\u0b18"+
		"\u0b1c\n\t\2\2\u0b19\u0b1b\13\2\2\2\u0b1a\u0b19\3\2\2\2\u0b1b\u0b1e\3"+
		"\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1c\u0b1a\3\2\2\2\u0b1d\u0b1f\3\2\2\2\u0b1e"+
		"\u0b1c\3\2\2\2\u0b1f\u0b20\7,\2\2\u0b20\u0b21\7\61\2\2\u0b21\u0b22\3\2"+
		"\2\2\u0b22\u0b23\b\u0135\2\2\u0b23\u026a\3\2\2\2\u0b24\u0b26\t\n\2\2\u0b25"+
		"\u0b24\3\2\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0b25\3\2\2\2\u0b27\u0b28\3\2"+
		"\2\2\u0b28\u0b29\3\2\2\2\u0b29\u0b2a\b\u0136\2\2\u0b2a\u026c\3\2\2\2\u0b2b"+
		"\u0b2c\13\2\2\2\u0b2c\u026e\3\2\2\2-\2\u0414\u06ce\u0830\u093e\u0a2d\u0a3f"+
		"\u0a47\u0a66\u0a68\u0a70\u0a72\u0a76\u0a7b\u0a82\u0a89\u0a90\u0a95\u0a9b"+
		"\u0a9f\u0aa4\u0aa7\u0aad\u0ab2\u0ab7\u0aba\u0ac1\u0ac8\u0acd\u0acf\u0ad5"+
		"\u0ad7\u0adf\u0ae5\u0aec\u0aee\u0af2\u0af7\u0b03\u0b07\u0b0a\u0b1c\u0b27"+
		"\3\2\3\2";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}