package com.facebook.wamsys.wcc;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public class TransferStats {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(int i, int i2, XMPPStats xMPPStats, double d);

    private native boolean nativeEquals(Object obj);

    public native int getConnectionId();

    public native int getNetworkConnectionType();

    public native double getTimestamp();

    public native XMPPStats getXmppStats();

    public native int hashCode();

    public native String toString();

    static {
        C09170dP.A0C("wamsysjni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof TransferStats)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public TransferStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
