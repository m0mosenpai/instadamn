package com.facebook.tigon.observers;

import X.C09170dP;
import X.C1EG;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public abstract class TigonXplatObserversHolder {
    public static final C1EG Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native HybridData initHybrid();

    public final native void registerObserver(TigonObserver tigonObserver);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1EG, java.lang.Object] */
    static {
        C09170dP.A0C("tigonxplatobserversholder");
    }
}
