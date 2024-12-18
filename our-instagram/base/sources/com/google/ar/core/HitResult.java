package com.google.ar.core;

import X.AbstractC167007dF;

/* loaded from: classes5.dex */
public class HitResult {
    private native long nativeCreateAnchor(long j, long j2);

    public static native void nativeDestroyHitResult(long j, long j2);

    private native float nativeGetDistance(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    public final void finalize() {
    }

    public native long nativeAcquireTrackable(long j, long j2);

    public final boolean equals(Object obj) {
        if (!(obj instanceof HitResult)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0d().hashCode();
    }
}
