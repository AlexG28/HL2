import java.util.*;
/**
 * Implements HLSet objects
 */

public class HLSet extends HLObject{

//Instance Variables

  private TreeSet value = null;
  private int len = 0;
  private Iterator iter;
  
// Class variables

  public static HLSet empty = new HLSet();

// Constructors
  
  public HLSet()
    {
    value = new TreeSet();
    }

  public HLSet(TreeSet lst)
    {
    value = new TreeSet(lst);
    len = value.size();
    }

  public HLSet(Collection lst)
    {
    value = new TreeSet(lst);
    len = value.size();
    }
    
  public HLSet(HLNumber firstelem, HLNumber lastelem)
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
