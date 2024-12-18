package com.facebook.tigon.observers;

import X.C00O;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public abstract class TigonObserver {
    public boolean disabled;
    public HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public abstract boolean getDisabled();

    public abstract HybridData getMHybridData();

    public abstract void setDisabled(boolean z);

    public abstract void setMHybridData(HybridData hybridData);

    public TigonObserver() {
        throw C00O.createAndThrow();
    }
}
