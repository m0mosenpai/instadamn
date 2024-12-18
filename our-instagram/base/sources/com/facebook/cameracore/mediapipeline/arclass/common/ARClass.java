package com.facebook.cameracore.mediapipeline.arclass.common;

import X.C09170dP;
import X.C224699vu;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class ARClass {
    public static final C224699vu Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(int i);

    public final native int getValue();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9vu] */
    static {
        C09170dP.A0C("arclass");
    }

    public ARClass(int i) {
        this.mHybridData = initHybrid(i);
    }

    public ARClass(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
