package com.facebook.privacy.acs;

import X.C09170dP;
import X.InterfaceC50488MQq;

/* loaded from: classes8.dex */
public class VoprfEd25519 implements InterfaceC50488MQq {
    public static native int sodiumInit();

    @Override // X.InterfaceC50488MQq
    public native int blind(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // X.InterfaceC50488MQq
    public native int computeSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // X.InterfaceC50488MQq
    public native int getCurveBytes();

    public native int getCurveScalarBytes();

    @Override // X.InterfaceC50488MQq
    public native int unblind(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, byte[] bArr5, byte[] bArr6, byte[] bArr7);

    static {
        C09170dP.A0C("voprf-ed25519");
        if (sodiumInit() == -1) {
            System.err.println("sodiumInit() failed.");
        }
    }
}
