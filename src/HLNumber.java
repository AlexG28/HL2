import java.math.*;

/**
 * Implements HLNumber
 */

public class HLNumber extends HLObject  implements Comparable<HLNumber> {

//Instance Variables
// I have found it simpler to wrap HLNumber around a primitive int value
// but it could also be wrapped around an Integer value.

  int value;
  
// Class variables

  public static HLNumber zero = new HLNumber(0);

// Constructors
  
  public HLNumber(int value)
    {
    }                
  
  public HLNumber(Integer num)
    {
    }

//Overridden compareTo

  public int compareTo(HLNumber to)
    {
    }                
  
// Overridden  HLObject Methods

  public HLObject deepclone()
    {
    return null;
    }

  public String toString()
    {
    return null;
    }

  public Boolean isSame (HLObject other) 
    {
    return null;
    }

  public Boolean isLessThan (HLObject other) 
    {
    return null;
    }
    
  public HLNumber negate()
    {
    return null;
    }

  public HLNumber add(HLObject operand)
    {
    return null;
    }

  public HLNumber sub(HLObject operand)
    {
    return null;
    }

  public HLNumber mul(HLObject operand)
    {
    return null;
    }

  public HLNumber mod(HLObject operand)
    {
    return null;
    }

  public HLNumber div(HLObject operand)
    {
    return null;
    }

  public HLNumber card()
    {
    return null;
    }

// Other Methods  


// Helper Methods  
   
  
}
