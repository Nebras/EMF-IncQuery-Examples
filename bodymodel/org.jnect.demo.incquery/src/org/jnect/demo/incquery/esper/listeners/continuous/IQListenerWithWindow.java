package org.jnect.demo.incquery.esper.listeners.continuous;

import org.jnect.demo.incquery.esper.AbstractListener;

public class IQListenerWithWindow extends AbstractListener {

	public IQListenerWithWindow() {
		super("ESPER: IQ complex pattern with time window recognized.", "[IQ]");
	}
}