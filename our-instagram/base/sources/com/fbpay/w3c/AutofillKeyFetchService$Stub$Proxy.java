package com.fbpay.w3c;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class AutofillKeyFetchService$Stub$Proxy implements AutofillKeyFetchService {
    public IBinder A00;

    @Override // com.fbpay.w3c.AutofillKeyFetchService
    public final void BZO(AutofillKeyFetchServiceCallback autofillKeyFetchServiceCallback) {
        int A03 = C0f9.A03(-907037063);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.AutofillKeyFetchService");
            obtain.writeStrongInterface(autofillKeyFetchServiceCallback);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(572030928, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(827527645, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(522582386);
        IBinder iBinder = this.A00;
        C0f9.A0A(-1005545242, A03);
        return iBinder;
    }
}
