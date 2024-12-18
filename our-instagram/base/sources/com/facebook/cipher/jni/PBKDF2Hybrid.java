package com.facebook.cipher.jni;

import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class PBKDF2Hybrid {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native byte[] generate();

    public native byte[] getKey();

    public native byte[] getSalt();

    public native void setIterations(int i);

    public native void setKeyLengthInBytes(int i);

    public native void setPassword(byte[] bArr, int i, int i2);

    public native void setSalt(byte[] bArr, int i, int i2);
}
