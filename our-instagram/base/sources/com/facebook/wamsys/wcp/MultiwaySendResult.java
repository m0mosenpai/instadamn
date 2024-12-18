package com.facebook.wamsys.wcp;

import X.C09170dP;
import com.facebook.msys.mcf.MsysError;
import com.facebook.simplejni.NativeHolder;
import com.facebook.wamsys.wcc.TransferStats;

/* loaded from: classes9.dex */
public class MultiwaySendResult {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(byte[] bArr, MsysError msysError, TransferStats transferStats, TransferStats transferStats2);

    private native boolean nativeEquals(Object obj);

    public native byte[] getData();

    public native MsysError getError();

    public native TransferStats getIncomingStats();

    public native TransferStats getOutgoingStats();

    public native int hashCode();

    public native String toString();

    static {
        C09170dP.A0C("wamsysjni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MultiwaySendResult)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public MultiwaySendResult(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
