package com.facebook.gputimer;

import X.C09170dP;
import X.C0K8;
import X.C225069wV;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class GPUTimerImpl {
    public static final C225069wV Companion = new Object();
    public static final Class TAG = GPUTimerImpl.class;
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public native void beginFrame();

    public native void beginMarker(int i);

    public native int createTimerHandle(String str);

    public native void endFrame();

    public native void endMarker();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9wV] */
    static {
        try {
            C09170dP.A0C("gputimer-jni");
        } catch (UnsatisfiedLinkError e) {
            C0K8.A07(GPUTimerImpl.class, "Failed to load: %s", e, "gputimer-jni");
        }
    }
}
