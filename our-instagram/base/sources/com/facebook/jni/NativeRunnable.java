package com.facebook.jni;

/* loaded from: classes.dex */
public class NativeRunnable implements Runnable {
    public final HybridData mHybridData;

    @Override // java.lang.Runnable
    public native void run();

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
