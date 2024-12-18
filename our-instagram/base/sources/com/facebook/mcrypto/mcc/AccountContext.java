package com.facebook.mcrypto.mcc;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public class AccountContext {
    public final NativeHolder mNativeHolder;

    public native String getFacebookUserID();

    static {
        C09170dP.A0C("mcryptojni");
    }

    public AccountContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
