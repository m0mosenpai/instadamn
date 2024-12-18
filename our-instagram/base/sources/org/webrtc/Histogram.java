package org.webrtc;

/* loaded from: classes12.dex */
public class Histogram {
    public final long handle;

    public static native void nativeAddSample(long j, int i);

    public static native long nativeCreateCounts(String str, int i, int i2, int i3);

    public static native long nativeCreateEnumeration(String str, int i);

    public void addSample(int i) {
        nativeAddSample(this.handle, i);
    }

    public Histogram(long j) {
        this.handle = j;
    }

    public static Histogram createCounts(String str, int i, int i2, int i3) {
        return new Histogram(nativeCreateCounts(str, i, i2, i3));
    }

    public static Histogram createEnumeration(String str, int i) {
        return new Histogram(nativeCreateEnumeration(str, i));
    }
}
