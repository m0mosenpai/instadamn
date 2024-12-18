package com.fbpay.w3c;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes10.dex */
public final class FBPaymentServiceContactCallback$Stub$Proxy implements FBPaymentServiceContactCallback {
    public IBinder A00;

    @Override // com.fbpay.w3c.FBPaymentServiceContactCallback
    public final void Dx1(List list) {
        int A03 = C0f9.A03(-1950318686);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceContactCallback");
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            obtain2.readTypedList(list, Contact.CREATOR);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1883205857, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(917998291, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1135069581);
        IBinder iBinder = this.A00;
        C0f9.A0A(922465389, A03);
        return iBinder;
    }
}
