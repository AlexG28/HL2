/* Generated By:JavaCC: Do not edit this line. HLEval.java Version 7.0.9 */
public class HLEval implements HLVisitor{
  public Object defaultVisit(SimpleNode node, Object data) throws Exception{
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTbody node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTclause node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTvar_decl node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTfn_decl node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTident_list node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTfn_call node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTboolean_call node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTvalue_list node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTReturn node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTAssign node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTPrint node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTPrintln node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTprint_list node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTIf node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTNULL node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTFor node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTexp_list node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTWhile node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTor node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTand node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTnot node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTTRUE node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTFALSE node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTcomparison node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTLESS node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTLESSEQ node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTGREATER node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTGREATEQ node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTEQUAL node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTNOTEQ node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTISIN node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTNOTIN node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTsum node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTneg node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTpos node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTmul node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTdiv node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTmod node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTAbsolute_value node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTinterval node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTset_former node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTset node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTidentifier node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTtypenum node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTtypeset node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTtypebool node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTnumber node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
  public Object visit(ASTstring node, Object data) throws Exception{
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=5fed741071bb7da1c3cb2cfb13af7ff9 (do not edit this line) */