package org.eclipse.viatra2.emf.incquery.base.test;

import org.eclipse.viatra2.emf.incquery.base.test.attribute.AttributeValueTest;
import org.eclipse.viatra2.emf.incquery.base.test.datatype.DataTypeTest;
import org.eclipse.viatra2.emf.incquery.base.test.feature.FeatureTest;
import org.eclipse.viatra2.emf.incquery.base.test.instance.InstanceTest;
import org.eclipse.viatra2.emf.incquery.base.test.inverseref.InverseReferenceTest;
import org.eclipse.viatra2.emf.incquery.base.test.listener.DataTypeListenerTest;
import org.eclipse.viatra2.emf.incquery.base.test.listener.FeatureListenerTest;
import org.eclipse.viatra2.emf.incquery.base.test.listener.InstanceListenerTest;
import org.eclipse.viatra2.emf.incquery.base.test.tc.TransitiveClosureHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	InverseReferenceTest.class,
	AttributeValueTest.class,
	InstanceTest.class,
	FeatureTest.class,
	DataTypeTest.class,
	FeatureListenerTest.class,
	DataTypeListenerTest.class,
	InstanceListenerTest.class,
	TransitiveClosureHelperTest.class
})
public class IncQueryBaseTestSuite {

}
