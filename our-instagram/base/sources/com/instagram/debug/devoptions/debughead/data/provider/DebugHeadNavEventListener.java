package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC167007dF;
import X.C3NU;
import com.instagram.debug.devoptions.apiperf.NavEventProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.NavEventDelegate;

/* loaded from: classes12.dex */
public class DebugHeadNavEventListener implements NavEventProvider {
    public static DebugHeadNavEventListener sInstance;
    public NavEventDelegate mDelegate;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.instagram.debug.devoptions.debughead.data.provider.DebugHeadNavEventListener] */
    public static synchronized DebugHeadNavEventListener getInstance() {
        DebugHeadNavEventListener debugHeadNavEventListener;
        synchronized (DebugHeadNavEventListener.class) {
            DebugHeadNavEventListener debugHeadNavEventListener2 = sInstance;
            debugHeadNavEventListener = debugHeadNavEventListener2;
            if (debugHeadNavEventListener2 == null) {
                ?? obj = new Object();
                sInstance = obj;
                debugHeadNavEventListener = obj;
            }
        }
        return debugHeadNavEventListener;
    }

    public static synchronized boolean isEnabled() {
        boolean A1W;
        synchronized (DebugHeadNavEventListener.class) {
            A1W = AbstractC167007dF.A1W(sInstance);
        }
        return A1W;
    }

    @Override // com.instagram.debug.devoptions.apiperf.NavEventProvider
    public void onNavEvent(Object obj) {
        NavEventDelegate navEventDelegate = this.mDelegate;
        if (navEventDelegate != null) {
            navEventDelegate.onNavEvent((C3NU) obj);
        }
    }

    public void setDelegate(NavEventDelegate navEventDelegate) {
        this.mDelegate = navEventDelegate;
    }
}
