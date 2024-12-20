package com.google.ar.core;

/* loaded from: classes12.dex */
public class CameraConfig {
    public long A00;
    public final long A01;
    public final Session A02;

    public CameraConfig() {
        this.A02 = null;
        this.A00 = 0L;
        this.A01 = 0L;
    }

    public static native void nativeDestroyCameraConfig(long j, long j2);

    private native String nativeGetCameraId(long j, long j2);

    private native int nativeGetDepthSensorUsage(long j, long j2);

    private native int nativeGetFacingDirection(long j, long j2);

    private native void nativeGetFpsRange(long j, long j2, int[] iArr);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr);

    private native int nativeGetStereoCameraUsage(long j, long j2);

    private native void nativeGetTextureDimensions(long j, long j2, int[] iArr);

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeDestroyCameraConfig(this.A01, j);
            this.A00 = 0L;
        }
    }

    public CameraConfig(Session session, long j) {
        this.A02 = session;
        this.A00 = j;
        this.A01 = session.nativeSymbolTableHandle;
    }
}
