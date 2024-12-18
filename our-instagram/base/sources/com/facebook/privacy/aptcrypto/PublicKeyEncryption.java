package com.facebook.privacy.aptcrypto;

import X.C09170dP;

/* loaded from: classes8.dex */
public class PublicKeyEncryption {
    public static native int cryptoBoxDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native int cryptoBoxEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public static native int generateCryptoBoxKeypair(byte[] bArr, byte[] bArr2);

    public static native int sodiumInit();

    static {
        C09170dP.A0C("publickeycrypto");
        if (sodiumInit() == -1) {
            System.err.println("sodiumInit() failed.");
        }
    }
}
