package com.facebook.cipher.jni;

import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public abstract class MacDecoderHybrid {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2);

    public native boolean end(byte[] bArr);

    public native void read(byte[] bArr, int i, int i2);

    public native void start(byte[] bArr);
}
