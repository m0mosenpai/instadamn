package com.facebook.crypto.keychain;

/* loaded from: classes12.dex */
public interface KeyChain {
    byte[] getCipherKey();

    byte[] getMacKey();

    byte[] getNewIV();
}
