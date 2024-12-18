package com.google.ar.core;

import X.AbstractC167007dF;

/* loaded from: classes5.dex */
public class Anchor {
    private native void nativeDetach(long j, long j2);

    private native String nativeGetCloudAnchorId(long j, long j2);

    private native int nativeGetCloudAnchorState(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTerrainAnchorState(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    public static native void nativeReleaseAnchor(long j, long j2);

    public final void finalize() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Anchor)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0d().hashCode();
    }
}
