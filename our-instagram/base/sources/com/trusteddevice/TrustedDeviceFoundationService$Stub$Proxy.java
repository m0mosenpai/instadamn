package com.trusteddevice;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class TrustedDeviceFoundationService$Stub$Proxy implements TrustedDeviceFoundationService {
    public IBinder A00;

    @Override // com.trusteddevice.TrustedDeviceFoundationService
    public final void BZP(TdfCrossAppDeviceKeyCallback tdfCrossAppDeviceKeyCallback) {
        int A03 = C0f9.A03(-1602253689);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TrustedDeviceFoundationService");
            obtain.writeStrongInterface(tdfCrossAppDeviceKeyCallback);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 2);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1949828635, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-601254360, A03);
            throw th;
        }
    }

    @Override // com.trusteddevice.TrustedDeviceFoundationService
    public final void Ely(TdfTrustChainBindingSignPttPayloadCallback tdfTrustChainBindingSignPttPayloadCallback, byte[] bArr) {
        int A03 = C0f9.A03(-1063273470);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TrustedDeviceFoundationService");
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(tdfTrustChainBindingSignPttPayloadCallback);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 3);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(196451719, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1430326307, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(452035007);
        IBinder iBinder = this.A00;
        C0f9.A0A(-1746639586, A03);
        return iBinder;
    }
}
