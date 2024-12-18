package com.facebook.mobileconfig.troubleshooting;

import X.C09170dP;
import X.XE7;
import com.facebook.jni.HybridData;

/* loaded from: classes11.dex */
public class BisectHelperHolder implements XE7 {
    public final HybridData mHybridData;

    public native BisectStateHolder getCurrentState();

    @Override // X.XE7
    public native boolean goBackOneStep();

    public native void setBisectPath(String str);

    public native void startBisection(String str, BisectCallback bisectCallback);

    @Override // X.XE7
    public native void startUsingExistingFile(String str);

    @Override // X.XE7
    public native boolean stopBisection();

    @Override // X.XE7
    public native boolean userDidNotReproduceBug();

    @Override // X.XE7
    public native boolean userDidReproduceBug();

    static {
        C09170dP.A0C("mobileconfigtroubleshooting-jni");
    }

    public BisectHelperHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
