package com.fbpay.w3c.client;

import X.C0f9;
import X.C14360o3;
import X.C2GP;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class W3CClient$fbPaymentServiceCardDetailsCallback$1 extends Binder implements FBPaymentServiceCardDetailsCallback {
    public final /* synthetic */ C2GP A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3CClient$fbPaymentServiceCardDetailsCallback$1(C2GP c2gp) {
        this();
        this.A00 = c2gp;
        C0f9.A0A(-501834097, C0f9.A03(-1431082756));
    }

    @Override // com.fbpay.w3c.FBPaymentServiceCardDetailsCallback
    public final void Dx1(List list) {
        int A03 = C0f9.A03(1009832864);
        C14360o3.A0B(list, 0);
        this.A00.A07.A0A(list);
        C0f9.A0A(-765680577, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1730063349, C0f9.A03(1804295469));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(-2085153601);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
                if (i == 1) {
                    ArrayList arrayList = new ArrayList();
                    Dx1(arrayList);
                    parcel2.writeNoException();
                    int size = arrayList.size();
                    parcel2.writeInt(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        Parcelable parcelable = (Parcelable) arrayList.get(i4);
                        if (parcelable != null) {
                            parcel2.writeInt(1);
                            parcelable.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                    }
                    i3 = 1746836669;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
                i3 = 350388303;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(1423870877, A03);
        return onTransact;
    }

    public W3CClient$fbPaymentServiceCardDetailsCallback$1() {
        int A03 = C0f9.A03(629012965);
        attachInterface(this, "com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
        C0f9.A0A(-1131318937, A03);
    }
}
