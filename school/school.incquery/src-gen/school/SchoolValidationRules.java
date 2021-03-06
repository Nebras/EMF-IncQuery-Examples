package school;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.CourseWithTeacherMatcher;
import school.CourseWithoutTeacherMatcher;

/**
 * A pattern group formed of all patterns defined in schoolValidationRules.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare 
 * an EMF-IncQuery engine for matching all patterns originally defined in file schoolValidationRules.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package school, the group contains the definition of the following patterns: <ul>
 * <li>CourseWithTeacher</li>
 * <li>CourseWithoutTeacher</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
public final class SchoolValidationRules extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SchoolValidationRules instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new SchoolValidationRules();
    }
    return INSTANCE;
    
  }
  
  private static SchoolValidationRules INSTANCE;
  
  private SchoolValidationRules() throws IncQueryException {
    querySpecifications.add(CourseWithTeacherMatcher.querySpecification());
    querySpecifications.add(CourseWithoutTeacherMatcher.querySpecification());
    
  }
}
