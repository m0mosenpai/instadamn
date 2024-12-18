package com.fbpay.w3c;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes10.dex */
public final class FBPaymentServiceAddressCallback$Stub$Proxy implements FBPaymentServiceAddressCallback {
    public IBinder A00;

    @Override // com.fbpay.w3c.FBPaymentServiceAddressCallback
    public final void Dx1(List list) {
        int A03 = C0f9.A03(1880098880);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceAddressCallback");
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            obtain2.readTypedList(list, Address.CREATOR);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1138166115, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(2034643464, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1232462984);
        IBinder iBinder = this.A00;
        C0f9.A0A(-1356085874, A03);
        return iBinder;
    }
}
