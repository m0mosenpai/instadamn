package com.google.ar.core;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class PointCloud implements Closeable {
    private native ByteBuffer nativeGetData(long j, long j2);

    private native ByteBuffer nativeGetIds(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native void nativeReleasePointCloud(long j, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        nativeReleasePointCloud(0L, 0L);
    }

    public final void finalize() {
    }
}
