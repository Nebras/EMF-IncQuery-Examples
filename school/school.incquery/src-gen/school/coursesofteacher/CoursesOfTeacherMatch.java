package school.coursesofteacher;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;
import school.Course;
import school.Teacher;

/**
 * Pattern-specific match representation of the coursesOfTeacher pattern, 
 * to be used in conjunction with CoursesOfTeacherMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CoursesOfTeacherMatcher
 * @see CoursesOfTeacherProcessor
 * 
 */
public final class CoursesOfTeacherMatch extends BasePatternMatch implements IPatternMatch {
  private Teacher fT;
  
  private Course fC;
  
  private static String[] parameterNames = {"T", "C"};
  
  CoursesOfTeacherMatch(final Teacher pT, final Course pC) {
    this.fT = pT;
    this.fC = pC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("C".equals(parameterName)) return this.fC;
    return null;
    
  }
  
  public Teacher getT() {
    return this.fT;
    
  }
  
  public Course getC() {
    return this.fC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("T".equals(parameterName) && newValue instanceof school.Teacher) {
    	this.fT = (school.Teacher) newValue;
    	return true;
    }
    if ("C".equals(parameterName) && newValue instanceof school.Course) {
    	this.fC = (school.Course) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setT(final Teacher pT) {
    this.fT = pT;
    
  }
  
  public void setC(final Course pC) {
    this.fC = pC;
    
  }
  
  @Override
  public String patternName() {
    return "coursesOfTeacher";
    
  }
  
  @Override
  public String[] parameterNames() {
    return CoursesOfTeacherMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fC};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    result.append("\"C\"=" + prettyPrintValue(fC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode()); 
    result = prime * result + ((fC == null) ? 0 : fC.hashCode()); 
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
    if (!CoursesOfTeacherMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    CoursesOfTeacherMatch other = (CoursesOfTeacherMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return CoursesOfTeacherMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}