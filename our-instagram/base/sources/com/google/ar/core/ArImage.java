package com.google.ar.core;

import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public abstract class ArImage extends Image {
    private native void nativeClose(long j, long j2);

    private native ByteBuffer nativeGetBuffer(long j, long j2, int i);

    private native int nativeGetFormat(long j, long j2);

    private native int nativeGetHeight(long j, long j2);

    private native int nativeGetNumberOfPlanes(long j, long j2);

    private native int nativeGetPixelStride(long j, long j2, int i);

    private native int nativeGetRowStride(long j, long j2, int i);

    private native long nativeGetTimestamp(long j, long j2);

    private native int nativeGetWidth(long j, long j2);

    public static native void nativeLoadSymbols();
}
