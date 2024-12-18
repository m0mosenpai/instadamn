package com.facebook.cipher.jni;

import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public abstract class MacEncoderHybrid {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2);

    public native byte[] end();

    public native byte[] start();

    public native void write(byte[] bArr, int i, int i2);
}
