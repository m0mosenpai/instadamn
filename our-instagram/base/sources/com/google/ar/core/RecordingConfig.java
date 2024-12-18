package com.google.ar.core;

/* loaded from: classes12.dex */
public class RecordingConfig {
    private native void nativeAddTrack(long j, long j2, long j3);

    public static native long nativeCreateRecordingConfig(long j);

    public static native void nativeDestroyRecordingConfig(long j, long j2);

    private native boolean nativeGetAutoStopOnPause(long j, long j2);

    private native String nativeGetMp4DatasetFilePath(long j, long j2);

    private native String nativeGetMp4DatasetUri(long j, long j2);

    private native int nativeGetRecordingRotation(long j, long j2);

    private native void nativeSetAutoStopOnPause(long j, long j2, boolean z);

    private native void nativeSetMp4DatasetFilePath(long j, long j2, String str);

    private native void nativeSetMp4DatasetUri(long j, long j2, String str);

    private native void nativeSetRecordingRotation(long j, long j2, int i);

    public final void finalize() {
    }
}
