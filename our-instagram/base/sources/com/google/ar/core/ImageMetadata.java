package com.google.ar.core;

import android.util.Rational;

/* loaded from: classes12.dex */
public class ImageMetadata {
    private native void nativeDestroyMetadataEntry(long j, long j2);

    private native long[] nativeGetAllKeys(long j, long j2);

    private native byte[] nativeGetByteArrayFromMetadataEntry(long j, long j2);

    private native byte nativeGetByteFromMetadataEntry(long j, long j2);

    private native double[] nativeGetDoubleArrayFromMetadataEntry(long j, long j2);

    private native double nativeGetDoubleFromMetadataEntry(long j, long j2);

    private native float[] nativeGetFloatArrayFromMetadataEntry(long j, long j2);

    private native float nativeGetFloatFromMetadataEntry(long j, long j2);

    private native int[] nativeGetIntArrayFromMetadataEntry(long j, long j2);

    private native int nativeGetIntFromMetadataEntry(long j, long j2);

    private native long[] nativeGetLongArrayFromMetadataEntry(long j, long j2);

    private native long nativeGetLongFromMetadataEntry(long j, long j2);

    private native long nativeGetMetadataEntry(long j, long j2, int i);

    private native int nativeGetMetadataEntryValueCount(long j, long j2);

    private native int nativeGetMetadataEntryValueType(long j, long j2);

    private native Rational[] nativeGetRationalArrayFromMetadataEntry(long j, long j2);

    private native Rational nativeGetRationalFromMetadataEntry(long j, long j2);

    public static native void nativeLoadSymbols();

    public static native void nativeReleaseImageMetadata(long j, long j2);

    public final void finalize() {
    }
}
