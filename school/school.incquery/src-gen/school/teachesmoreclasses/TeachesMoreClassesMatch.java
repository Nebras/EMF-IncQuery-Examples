package school.teachesmoreclasses;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.teachesMoreClasses pattern, 
 * to be used in conjunction with TeachesMoreClassesMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachesMoreClassesMatcher
 * @see TeachesMoreClassesProcessor
 * 
 */
public final class TeachesMoreClassesMatch extends BasePatternMatch {
  private Object fT1;
  
  private Object fT2;
  
  private static String[] parameterNames = {"T1", "T2"};
  
  TeachesMoreClassesMatch(final Object pT1, final Object pT2) {
    this.fT1 = pT1;
    this.fT2 = pT2;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T1".equals(parameterName)) return this.fT1;
    if ("T2".equals(parameterName)) return this.fT2;
    return null;
    
  }
  
  public Object getT1() {
    return this.fT1;
    
  }
  
  public Object getT2() {
    return this.fT2;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("T1".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fT1 = (java.lang.Object) newValue;
    	return true;
    }
    if ("T2".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fT2 = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setT1(final Object pT1) {
    this.fT1 = pT1;
    
  }
  
  public void setT2(final Object pT2) {
    this.fT2 = pT2;
    
  }
  
  @Override
  public String patternName() {
    return "school.teachesMoreClasses";
    
  }
  
  @Override
  public String[] parameterNames() {
    return TeachesMoreClassesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT1, fT2};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T1\"=" + prettyPrintValue(fT1) + ", ");
    result.append("\"T2\"=" + prettyPrintValue(fT2));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT1 == null) ? 0 : fT1.hashCode()); 
    result = prime * result + ((fT2 == null) ? 0 : fT2.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!TeachesMoreClassesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    TeachesMoreClassesMatch other = (TeachesMoreClassesMatch) obj;
    if (fT1 == null) {if (other.fT1 != null) return false;}
    else if (!fT1.equals(other.fT1)) return false;
    if (fT2 == null) {if (other.fT2 != null) return false;}
    else if (!fT2.equals(other.fT2)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TeachesMoreClassesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
