package com.google.ar.core;

/* loaded from: classes5.dex */
public abstract class Earth extends TrackableBase {
    private native long nativeCreateAnchor(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeGetCameraGeospatialPose(long j, long j2);

    private native int nativeGetEarthState(long j, long j2);

    private native long nativeGetGeospatialPose(long j, long j2, Pose pose);

    private native Pose nativeGetPose(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeReleaseEarth(long j, long j2);

    private native long nativeResolveAnchorOnTerrain(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);
}
