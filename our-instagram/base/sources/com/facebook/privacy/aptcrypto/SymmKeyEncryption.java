package com.facebook.privacy.aptcrypto;

import X.C09170dP;

/* loaded from: classes8.dex */
public class SymmKeyEncryption {
    public static native int cryptoSecretBoxDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native int cryptoSecretBoxEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native int generateCryptoSecretBoxKey(byte[] bArr);

    public static native int sodiumInit();

    static {
        C09170dP.A0C("symmkeycrypto");
        if (sodiumInit() == -1) {
            System.err.println("sodiumInit() failed.");
        }
    }
}
