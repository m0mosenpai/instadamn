package com.trusteddevice;

import android.os.IInterface;

/* loaded from: classes10.dex */
public interface TrustedDeviceFoundationService extends IInterface {
    void BZP(TdfCrossAppDeviceKeyCallback tdfCrossAppDeviceKeyCallback);

    void Ely(TdfTrustChainBindingSignPttPayloadCallback tdfTrustChainBindingSignPttPayloadCallback, byte[] bArr);
}
