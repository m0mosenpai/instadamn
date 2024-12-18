package com.facebook.cryptopub;

import X.C09170dP;

/* loaded from: classes11.dex */
public class CryptoPubNative {
    private native String decryptNative(int i, String str, String str2, String str3, String str4);

    private native byte[] encryptNative(int i, String str, String str2, String str3);

    static {
        C09170dP.A0C("cryptopub-jni");
    }

    public byte[] encrypt(int i, String str, String str2, String str3) {
        return encryptNative(i, str, str2, str3);
    }
}
