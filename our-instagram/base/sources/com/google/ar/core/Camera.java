package com.google.ar.core;

/* loaded from: classes12.dex */
public class Camera {
    public long A00;
    public final long A01;
    public final Session A02;

    public Camera() {
        this.A02 = null;
        this.A00 = 0L;
        this.A01 = 0L;
    }

    public static native long nativeAcquireCamera(long j, long j2);

    private native long nativeCreateCameraIntrinsics(long j);

    private native Pose nativeDisplayOrientedPose(long j, long j2);

    private native void nativeGetImageIntrinsics(long j, long j2, long j3);

    private native Pose nativeGetPose(long j, long j2);

    private native void nativeGetProjectionMatrix(long j, long j2, float[] fArr, int i, float f, float f2);

    private native void nativeGetTextureIntrinsics(long j, long j2, long j3);

    private native int nativeGetTrackingFailureReason(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeGetViewMatrix(long j, long j2, float[] fArr, int i);

    public static native void nativeReleaseCamera(long j, long j2);

    public final boolean equals(Object obj) {
        if (!(obj instanceof Camera) || ((Camera) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeReleaseCamera(this.A01, j);
        }
    }

    public final int hashCode() {
        return Long.valueOf(this.A00).hashCode();
    }

    public Camera(Frame frame, Session session) {
        this.A02 = session;
        this.A00 = nativeAcquireCamera(session.nativeWrapperHandle, frame.A00);
        this.A01 = session.nativeSymbolTableHandle;
    }
}
