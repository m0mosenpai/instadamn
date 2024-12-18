package com.google.ar.core;

/* loaded from: classes12.dex */
public class Track {
    public static native long nativeCreateTrack(long j);

    public static native void nativeDestroyTrack(long j, long j2);

    private native void nativeSetId(long j, long j2, byte[] bArr);

    private native void nativeSetMetadata(long j, long j2, byte[] bArr);

    private native void nativeSetMimeType(long j, long j2, String str);

    public final void finalize() {
    }
}
