package school.morefriendsthan;

import java.util.Map;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the moreFriendsThan pattern.
 */
public class MoreFriendsThanEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer M, final Integer N) {
    Integer _N = N;
    Integer _M = M;
    boolean _greaterThan = (_N.compareTo(_M) > 0);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int MPosition = tupleNameMap.get("M");
    java.lang.Integer M = (java.lang.Integer) tuple.get(MPosition);
    int NPosition = tupleNameMap.get("N");
    java.lang.Integer N = (java.lang.Integer) tuple.get(NPosition);
    return evaluateXExpressionGenerated(M, N);
  }
}
