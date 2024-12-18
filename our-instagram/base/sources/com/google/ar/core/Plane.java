package com.google.ar.core;

/* loaded from: classes5.dex */
public class Plane extends TrackableBase {
    private native long nativeAcquireSubsumedBy(long j, long j2);

    private native Pose nativeGetCenterPose(long j, long j2);

    private native float nativeGetExtentX(long j, long j2);

    private native float nativeGetExtentZ(long j, long j2);

    private native float[] nativeGetPolygon(long j, long j2);

    private native int nativeGetType(long j, long j2);

    private native boolean nativeIsPoseInExtents(long j, long j2, Pose pose);

    private native boolean nativeIsPoseInPolygon(long j, long j2, Pose pose);
}
