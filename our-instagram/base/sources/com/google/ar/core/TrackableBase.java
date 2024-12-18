package com.google.ar.core;

import X.AbstractC167007dF;

/* loaded from: classes5.dex */
public class TrackableBase {
    private native long nativeCreateAnchor(long j, long j2, Pose pose);

    private native long[] nativeGetAnchors(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    public static native int nativeGetType(long j, long j2);

    public static native void nativeReleaseTrackable(long j, long j2);

    public final void finalize() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TrackableBase)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0d().hashCode();
    }
}
