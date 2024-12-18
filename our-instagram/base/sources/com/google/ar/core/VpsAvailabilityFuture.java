package com.google.ar.core;

/* loaded from: classes12.dex */
public abstract class VpsAvailabilityFuture {

    /* loaded from: classes12.dex */
    public abstract class CallbackWrapper {
        public abstract void accept(int i);
    }

    public static native void nativeReleaseFuture(long j, long j2);

    public native boolean nativeCancel(long j, long j2, long j3);

    public native int nativeGetResult(long j, long j2);

    public native int nativeGetState(long j, long j2);
}
