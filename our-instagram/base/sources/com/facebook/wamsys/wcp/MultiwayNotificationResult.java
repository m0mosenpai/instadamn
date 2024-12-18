package com.facebook.wamsys.wcp;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;
import com.facebook.wamsys.wcc.TransferStats;

/* loaded from: classes9.dex */
public class MultiwayNotificationResult {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, long j, String str2, long j2, TransferStats transferStats, byte[] bArr);

    private native boolean nativeEquals(Object obj);

    public native byte[] getData();

    public native TransferStats getIncomingStats();

    public native long getMultiwayNotificationBinaryVersion();

    public native String getMultiwayNotificationTransactionId();

    public native String getServerNotificationId();

    public native long getServerNotificationTimestamp();

    public native int hashCode();

    public native String toString();

    static {
        C09170dP.A0C("wamsysjni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MultiwayNotificationResult)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public MultiwayNotificationResult(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
