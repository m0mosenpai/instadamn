package com.google.ar.core;

/* loaded from: classes4.dex */
public abstract class GeospatialPose {
    public static native void nativeDestroy(long j, long j2);

    private native float[] nativeEastUpSouthQuaternion(long j, long j2);

    private native double nativeGetAltitude(long j, long j2);

    private native double nativeGetHeading(long j, long j2);

    private native double nativeGetHeadingAccuracy(long j, long j2);

    private native double nativeGetHorizontalAccuracy(long j, long j2);

    private native double nativeGetLatitude(long j, long j2);

    private native double nativeGetLongitude(long j, long j2);

    private native double nativeGetOrientationYawAccuracy(long j, long j2);

    private native double nativeGetVerticalAccuracy(long j, long j2);
}
