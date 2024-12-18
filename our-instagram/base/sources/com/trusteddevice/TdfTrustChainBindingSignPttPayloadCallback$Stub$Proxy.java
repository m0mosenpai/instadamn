package com.trusteddevice;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class TdfTrustChainBindingSignPttPayloadCallback$Stub$Proxy implements TdfTrustChainBindingSignPttPayloadCallback {
    public IBinder A00;

    @Override // com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback
    public final void DcM(String str) {
        int A03 = C0f9.A03(127949090);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
            obtain.writeString(str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 2);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1153629157, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-178473426, A03);
            throw th;
        }
    }

    @Override // com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback
    public final void DcN(String str) {
        int A03 = C0f9.A03(-771350381);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
            obtain.writeString(str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1593776621, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(147985978, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(1886455891);
        IBinder iBinder = this.A00;
        C0f9.A0A(1550586234, A03);
        return iBinder;
    }
}
