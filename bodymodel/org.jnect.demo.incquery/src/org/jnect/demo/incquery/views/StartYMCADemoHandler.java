package org.jnect.demo.incquery.views;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.jnect.bodymodel.PositionedElement;
import org.jnect.core.KinectManager;

import bodymodel.ymca.a.AMatcher;
import bodymodel.ymca.c.CMatcher;
import bodymodel.ymca.i.IMatcher;
import bodymodel.ymca.m.MMatcher;
import bodymodel.ymca.q.QMatcher;
import bodymodel.ymca.y.YMatcher;
//import bodymodel.jump.JumpMatcher;

/**
 * 
 * @author istvanrath
 *
 */
public class StartYMCADemoHandler extends AbstractHandler {

    class YMCAMatcherHelper {
        
        IncQueryMatcher<? extends IPatternMatch> matcher;
        DeltaMonitor<? extends IPatternMatch> dm;
        YMCADemoView v;
        
        public YMCAMatcherHelper(IncQueryMatcher<? extends IPatternMatch> m, YMCADemoView view) {
        	v = view;
            matcher = m;
            dm = matcher.newDeltaMonitor(true);
            matcher.addCallbackAfterUpdates(new Runnable(){
               @Override
                public void run() {
                    for (IPatternMatch pm : dm.matchFoundEvents) {
                        System.out.println("New match found:" + pm.toString());
                        v.appendString(pm.patternName());
                        for (Object _pe: pm.toArray()) {
                        	((PositionedElement)_pe).setColor_r(255);
                        }
                    }
                    for (IPatternMatch pm : dm.matchLostEvents) {
                        System.out.println("Lost match found:" + pm.toString());
                        // v.appendString(pm.patternName());
                        for (Object _pe: pm.toArray()) {
                        	((PositionedElement)_pe).setColor_r(0);
                        }
                    }
                    dm.clear();
                } 
            });
        }
        
        
    }
    
    
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {
			
			try {
			    Notifier km = KinectManager.INSTANCE.getSkeletonModel();
			    
			    PlatformUI.getWorkbench().getActiveWorkbenchWindow().
			    		getActivePage().showView(YMCADemoView.ID);
			    YMCADemoView v = (YMCADemoView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().
			    		getActivePage().getActivePart();
			    
				new YMCAMatcherHelper(YMatcher.factory().getMatcher(km),v);
				new YMCAMatcherHelper(MMatcher.factory().getMatcher(km),v);
				new YMCAMatcherHelper(CMatcher.factory().getMatcher(km),v);
				new YMCAMatcherHelper(AMatcher.factory().getMatcher(km),v);
				new YMCAMatcherHelper(IMatcher.factory().getMatcher(km),v);
				new YMCAMatcherHelper(QMatcher.factory().getMatcher(km),v);
			} catch (IncQueryException e) {
				e.printStackTrace();
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}

	
}
