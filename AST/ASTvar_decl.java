/* Generated By:JJTree: Do not edit this line. ASTvar_decl.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTvar_decl extends SimpleNode {
  public ASTvar_decl(int id) {
    super(id);
  }

  public ASTvar_decl(HL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HLVisitor visitor, Object data) throws Exception {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ec148e15490dbdf40d8d84697aee32cb (do not edit this line) */