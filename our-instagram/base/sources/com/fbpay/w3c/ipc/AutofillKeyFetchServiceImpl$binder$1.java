package com.fbpay.w3c.ipc;

import X.AbstractC167017dG;
import X.C0f9;
import X.C49352Or;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.fbpay.w3c.AutofillKeyFetchService;
import com.fbpay.w3c.AutofillKeyFetchServiceCallback;

/* loaded from: classes10.dex */
public final class AutofillKeyFetchServiceImpl$binder$1 extends Binder implements AutofillKeyFetchService {
    public AutofillKeyFetchServiceImpl$binder$1() {
        int A03 = C0f9.A03(-2086826610);
        attachInterface(this, "com.fbpay.w3c.AutofillKeyFetchService");
        C0f9.A0A(-1626864496, A03);
        C0f9.A0A(1805563517, C0f9.A03(-1713676913));
    }

    @Override // com.fbpay.w3c.AutofillKeyFetchService
    public final void BZO(AutofillKeyFetchServiceCallback autofillKeyFetchServiceCallback) {
        int A0N = AbstractC167017dG.A0N(autofillKeyFetchServiceCallback, -681092645);
        autofillKeyFetchServiceCallback.DOG(new C49352Or("autofill_key").A00());
        C0f9.A0A(1418425937, A0N);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1775177058, C0f9.A03(-1135029640));
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.fbpay.w3c.AutofillKeyFetchServiceCallback$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        AutofillKeyFetchServiceCallback autofillKeyFetchServiceCallback;
        int A03 = C0f9.A03(-1395777180);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.AutofillKeyFetchService");
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        autofillKeyFetchServiceCallback = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof AutofillKeyFetchServiceCallback)) {
                            autofillKeyFetchServiceCallback = (AutofillKeyFetchServiceCallback) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            int A032 = C0f9.A03(628504447);
                            obj.A00 = readStrongBinder;
                            C0f9.A0A(-1903702369, A032);
                            autofillKeyFetchServiceCallback = obj;
                        }
                    }
                    BZO(autofillKeyFetchServiceCallback);
                    parcel2.writeNoException();
                    i3 = 1179263099;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.AutofillKeyFetchService");
                i3 = 2114756982;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-199218179, A03);
        return onTransact;
    }
}
