package com.facebook.msys.mci;

/* loaded from: classes3.dex */
public interface Crypto {
    byte[] computeMd5(byte[] bArr);

    byte[] computeMd5V2(byte[] bArr);

    String computeSHA256(String str, String str2);

    String computeSHA256(byte[] bArr, String str);
}
