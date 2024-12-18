package com.facebook.tigon.interceptors;

import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public abstract class Interceptor {
    public boolean disabled;
    public HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final void setDisabled(boolean z) {
        this.disabled = z;
    }

    public final void setMHybridData(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
