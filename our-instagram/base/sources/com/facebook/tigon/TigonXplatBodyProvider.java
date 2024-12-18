package com.facebook.tigon;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public abstract class TigonXplatBodyProvider extends TigonBodyProvider {
    private native HybridData initHybrid();

    static {
        C09170dP.A0C("tigonjni");
    }

    public TigonXplatBodyProvider() {
        this.mHybridData = initHybrid();
    }
}
