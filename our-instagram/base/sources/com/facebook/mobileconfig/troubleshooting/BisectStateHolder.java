package com.facebook.mobileconfig.troubleshooting;

import X.C09170dP;
import X.XER;
import com.facebook.jni.HybridData;

/* loaded from: classes11.dex */
public class BisectStateHolder implements XER {
    public final HybridData mHybridData;

    public native boolean canContinue();

    @Override // X.XER
    public native String getCulprit();

    @Override // X.XER
    public native int getLeft();

    public native int getMiddle();

    @Override // X.XER
    public native int getNumberOfStepsMade();

    @Override // X.XER
    public native int getNumberOfStepsRemaining();

    @Override // X.XER
    public native int getRight();

    @Override // X.XER
    public native int getSize();

    public native String getTaskNumber();

    public native String getUniqueId();

    @Override // X.XER
    public native boolean isRunning();

    static {
        C09170dP.A0C("mobileconfigtroubleshooting-jni");
    }

    public BisectStateHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
