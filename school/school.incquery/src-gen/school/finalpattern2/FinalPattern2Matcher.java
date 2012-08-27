package school.finalpattern2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.EngineManager;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;
import school.finalpattern2.FinalPattern2Match;
import school.finalpattern2.FinalPattern2MatcherFactory;

/**
 * Generated pattern matcher API of the finalPattern2 pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}PatternUI(message="The busiest teacher $TName$ taught the most sociable student $SName$ in $YDate$")
 *     {@literal @}ObservableValue(name = "Year", expression="YDate")
 *     {@literal @}ObservableValue(name = "Teacher", expression="TName")
 *     {@literal @}ObservableValue(name = "Student", expression="SName")
 *     {@literal @}Handler(fileExtension = "school")
 *     pattern finalPattern2(YDate, CSub, TName, SName) = {
 *     	Year.schoolClasses.courses(Y,C);
 *     	Course.teacher(C,T);
 *     	Student.schoolClass.courses(S,C);
 *     	
 *     	find theOnesWithTheBiggestCircle(S);
 *     	find teachesTheMostCourses(T);
 *     	
 *     	Year.startingDate(Y, YDate);
 *     	Course.subject(C, CSub);
 *     	Teacher.name(T, TName);
 *     	Student.name(S, SName);
 *     }
 * </pre></code>
 * 
 * @see FinalPattern2Match
 * @see FinalPattern2MatcherFactory
 * @see FinalPattern2Processor
 * 
 */
public class FinalPattern2Matcher extends BaseGeneratedMatcher<FinalPattern2Match> implements IncQueryMatcher<FinalPattern2Match> {
  private final static int POSITION_YDATE = 0;
  
  private final static int POSITION_CSUB = 1;
  
  private final static int POSITION_TNAME = 2;
  
  private final static int POSITION_SNAME = 3;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public FinalPattern2Matcher(final Notifier emfRoot) throws IncQueryException {
    this(EngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public FinalPattern2Matcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pYDate the fixed value of pattern parameter YDate, or null if not bound.
   * @param pCSub the fixed value of pattern parameter CSub, or null if not bound.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return matches represented as a FinalPattern2Match object.
   * 
   */
  public Collection<FinalPattern2Match> getAllMatches(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
    return rawGetAllMatches(new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pYDate the fixed value of pattern parameter YDate, or null if not bound.
   * @param pCSub the fixed value of pattern parameter CSub, or null if not bound.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return a match represented as a FinalPattern2Match object, or null if no match is found.
   * 
   */
  public FinalPattern2Match getOneArbitraryMatch(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
    return rawGetOneArbitraryMatch(new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pYDate the fixed value of pattern parameter YDate, or null if not bound.
   * @param pCSub the fixed value of pattern parameter CSub, or null if not bound.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
    return rawHasMatch(new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pYDate the fixed value of pattern parameter YDate, or null if not bound.
   * @param pCSub the fixed value of pattern parameter CSub, or null if not bound.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
    return rawCountMatches(new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pYDate the fixed value of pattern parameter YDate, or null if not bound.
   * @param pCSub the fixed value of pattern parameter CSub, or null if not bound.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Integer pYDate, final String pCSub, final String pTName, final String pSName, final IMatchProcessor<? super FinalPattern2Match> processor) {
    rawForEachMatch(new Object[]{pYDate, pCSub, pTName, pSName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pYDate the fixed value of pattern parameter YDate, or null if not bound.
   * @param pCSub the fixed value of pattern parameter CSub, or null if not bound.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Integer pYDate, final String pCSub, final String pTName, final String pSName, final IMatchProcessor<? super FinalPattern2Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pYDate, pCSub, pTName, pSName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pYDate the fixed value of pattern parameter YDate, or null if not bound.
   * @param pCSub the fixed value of pattern parameter CSub, or null if not bound.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<FinalPattern2Match> newFilteredDeltaMonitor(final boolean fillAtStart, final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pYDate the fixed value of pattern parameter YDate, or null if not bound.
   * @param pCSub the fixed value of pattern parameter CSub, or null if not bound.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public FinalPattern2Match newMatch(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
    return new FinalPattern2Match(pYDate, pCSub, pTName, pSName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for YDate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> rawAccumulateAllValuesOfYDate(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_YDATE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for YDate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfYDate() {
    return rawAccumulateAllValuesOfYDate(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for YDate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfYDate(final FinalPattern2Match partialMatch) {
    return rawAccumulateAllValuesOfYDate(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for YDate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfYDate(final String pCSub, final String pTName, final String pSName) {
    Integer pYDate = null;
    return rawAccumulateAllValuesOfYDate(new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for CSub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfCSub(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_CSUB, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for CSub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCSub() {
    return rawAccumulateAllValuesOfCSub(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for CSub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCSub(final FinalPattern2Match partialMatch) {
    return rawAccumulateAllValuesOfCSub(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for CSub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCSub(final Integer pYDate, final String pTName, final String pSName) {
    String pCSub = null;
    return rawAccumulateAllValuesOfCSub(new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfTName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_TNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName() {
    return rawAccumulateAllValuesOfTName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName(final FinalPattern2Match partialMatch) {
    return rawAccumulateAllValuesOfTName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName(final Integer pYDate, final String pCSub, final String pSName) {
    String pTName = null;
    return rawAccumulateAllValuesOfTName(new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for SName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfSName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSName() {
    return rawAccumulateAllValuesOfSName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSName(final FinalPattern2Match partialMatch) {
    return rawAccumulateAllValuesOfSName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSName(final Integer pYDate, final String pCSub, final String pTName) {
    String pSName = null;
    return rawAccumulateAllValuesOfSName(new Object[]{pYDate, pCSub, pTName, pSName});
  }
  
  @Override
  public FinalPattern2Match tupleToMatch(final Tuple t) {
    try {
    	return new FinalPattern2Match((java.lang.Integer) t.get(POSITION_YDATE), (java.lang.String) t.get(POSITION_CSUB), (java.lang.String) t.get(POSITION_TNAME), (java.lang.String) t.get(POSITION_SNAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public FinalPattern2Match arrayToMatch(final Object[] match) {
    try {
    	return new FinalPattern2Match((java.lang.Integer) match[POSITION_YDATE], (java.lang.String) match[POSITION_CSUB], (java.lang.String) match[POSITION_TNAME], (java.lang.String) match[POSITION_SNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<FinalPattern2Matcher> factory() throws IncQueryException {
    return FinalPattern2MatcherFactory.instance();
  }
}