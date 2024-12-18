package com.fbpay.w3c;

import X.AbstractC58319PtB;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class FBPaymentService$Stub$Proxy implements FBPaymentService {
    public IBinder A00;

    @Override // com.fbpay.w3c.FBPaymentService
    public final void A7s(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback) {
        int A03 = C0f9.A03(-955696107);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
            obtain.writeStrongInterface(fBPaymentServiceAddressCallback);
            AbstractC58319PtB.A1B(this.A00, obtain, 5);
            obtain.recycle();
            C0f9.A0A(2120545172, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(-1973957525, A03);
            throw th;
        }
    }

    @Override // com.fbpay.w3c.FBPaymentService
    public final void A86(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback) {
        int A03 = C0f9.A03(-59338796);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
            obtain.writeStrongInterface(fBPaymentServiceCardDetailsCallback);
            AbstractC58319PtB.A1B(this.A00, obtain, 3);
            obtain.recycle();
            C0f9.A0A(442166915, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(-385348589, A03);
            throw th;
        }
    }

    @Override // com.fbpay.w3c.FBPaymentService
    public final void A8B(FBPaymentServiceContactCallback fBPaymentServiceContactCallback) {
        int A03 = C0f9.A03(562771180);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
            obtain.writeStrongInterface(fBPaymentServiceContactCallback);
            AbstractC58319PtB.A1B(this.A00, obtain, 4);
            obtain.recycle();
            C0f9.A0A(-724606634, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(-1841593028, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(1947392523);
        IBinder iBinder = this.A00;
        C0f9.A0A(-472117834, A03);
        return iBinder;
    }
}
