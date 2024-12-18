package com.facebook.mcrypto.mem;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public class PlaintextApplicationPayload {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(byte[] bArr, Number number);

    private native boolean nativeEquals(Object obj);

    public native Number getPlaintextApplicationVersion();

    public native byte[] getPlaintextPayload();

    public native int hashCode();

    public native String toString();

    static {
        C09170dP.A0C("mcryptojni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof PlaintextApplicationPayload)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public PlaintextApplicationPayload(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public PlaintextApplicationPayload(byte[] bArr, Number number) {
        this.mNativeHolder = initNativeHolder(bArr, number);
    }
}
