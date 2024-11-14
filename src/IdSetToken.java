/**
 * Describes IDSET tokens
 */

public class IdSetToken extends Token {

  public String value;
  
  public String toString()
  {
  	return value.toString();
  }

  public Object getValue()
  {
	return value;
  }
 
  public IdSetToken(String image)
  {
    this.kind = HLConstants.IDSET  ;
    this.image = image;
   	value = image;
  }

}
