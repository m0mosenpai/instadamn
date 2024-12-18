package com.facebook.tigon.javaservice;

import X.C14360o3;
import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public abstract class AbstractRequestToken {
    public final HybridData mHybridData;

    public AbstractRequestToken(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void cancel();

    public abstract void changeHttpPriority(byte b, boolean z);
}
