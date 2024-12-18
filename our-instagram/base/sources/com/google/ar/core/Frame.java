package com.google.ar.core;

import X.AbstractC166987dD;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class Frame {
    public static final ArrayList A03 = AbstractC166987dD.A1E();
    public static final ArrayList A04 = AbstractC166987dD.A1E();
    public long A00;
    public final long A01;
    public final Session A02;

    public Frame() {
        this.A00 = 0L;
        this.A02 = null;
        this.A01 = 0L;
    }

    private native long nativeAcquireCameraImage(long j, long j2);

    private native long nativeAcquireDepthImage(long j, long j2);

    private native long nativeAcquireDepthImage16Bits(long j, long j2);

    private native long nativeAcquireDepthImagePrivate(long j, long j2);

    private native long nativeAcquireImageMetadata(long j, long j2);

    private native long nativeAcquireRawDepthConfidenceImage(long j, long j2);

    private native long nativeAcquireRawDepthImage(long j, long j2);

    private native long nativeAcquireRawDepthImage16Bits(long j, long j2);

    private native long[] nativeAcquireTrackData(long j, long j2, byte[] bArr);

    private native long[] nativeAcquireUpdatedAnchors(long j, long j2);

    public static native long nativeCreateFrame(long j);

    public static native void nativeDestroyFrame(long j, long j2);

    private native long nativeGetAndroidCameraTimestamp(long j, long j2);

    private native Pose nativeGetAndroidSensorPose(long j, long j2);

    private native int nativeGetCameraTextureName(long j, long j2);

    private native void nativeGetLightEstimate(long j, long j2, long j3);

    private native long nativeGetTimestamp(long j, long j2);

    private native boolean nativeHasDisplayGeometryChanged(long j, long j2);

    private native void nativeRecordTrackData(long j, long j2, byte[] bArr, byte[] bArr2);

    private native void nativeTransformCoordinates2dFloatArrayOrBuffer(long j, long j2, int i, Object obj, int i2, Object obj2);

    private native void nativeTransformDisplayUvCoords(long j, long j2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    public native long nativeAcquirePointCloud(long j, long j2);

    public native long[] nativeAcquireUpdatedTrackables(long j, long j2, int i);

    public native float nativeFrameGetDepthRegionConfidence(long j, long j2, int i, int i2, int i3, int i4);

    public native long[] nativeHitTest(long j, long j2, float f, float f2);

    public native long[] nativeHitTestInstantPlacement(long j, long j2, float f, float f2, float f3);

    public native long[] nativeHitTestRay(long j, long j2, float[] fArr, int i, float[] fArr2, int i2);

    public native long[] nativeInstantHitTest(long j, long j2, float f, float f2, float f3);

    public Frame(Session session) {
        long nativeCreateFrame = nativeCreateFrame(session.nativeWrapperHandle);
        this.A02 = session;
        this.A00 = nativeCreateFrame;
        this.A01 = session.nativeSymbolTableHandle;
    }

    public final long A00() {
        return nativeGetTimestamp(this.A02.nativeWrapperHandle, this.A00);
    }

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeDestroyFrame(this.A01, j);
            this.A00 = 0L;
        }
    }
}
