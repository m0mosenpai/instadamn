package com.fbpay.w3c;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class AutofillKeyFetchServiceCallback$Stub$Proxy implements AutofillKeyFetchServiceCallback {
    public IBinder A00;

    @Override // com.fbpay.w3c.AutofillKeyFetchServiceCallback
    public final void DOG(String str) {
        int A03 = C0f9.A03(996782361);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
            obtain.writeString(str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1231397051, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(115435972, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(590248331);
        IBinder iBinder = this.A00;
        C0f9.A0A(212583117, A03);
        return iBinder;
    }
}
