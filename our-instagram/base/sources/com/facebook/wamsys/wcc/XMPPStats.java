package com.facebook.wamsys.wcc;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public class XMPPStats {
    public final NativeHolder mNativeHolder;

    public native int getCompressedBytes();

    public native int getEncodedBytes();

    public native int getEncryptedBytes();

    static {
        C09170dP.A0C("wamsysjni");
    }

    public XMPPStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
