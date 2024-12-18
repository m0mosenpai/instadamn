package com.fbpay.w3c.client;

import X.C0f9;
import X.C14360o3;
import X.C2GP;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class W3CClient$fbPaymentServiceAddressCallback$1 extends Binder implements FBPaymentServiceAddressCallback {
    public final /* synthetic */ C2GP A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3CClient$fbPaymentServiceAddressCallback$1(C2GP c2gp) {
        this();
        this.A00 = c2gp;
        C0f9.A0A(-1768932903, C0f9.A03(-2108105030));
    }

    @Override // com.fbpay.w3c.FBPaymentServiceAddressCallback
    public final void Dx1(List list) {
        int A03 = C0f9.A03(61812738);
        C14360o3.A0B(list, 0);
        this.A00.A06.A0A(list);
        C0f9.A0A(-864239752, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-200468075, C0f9.A03(1894100389));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(794397122);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceAddressCallback");
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
                    i3 = 2142510894;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.FBPaymentServiceAddressCallback");
                i3 = 2146588876;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-732583812, A03);
        return onTransact;
    }

    public W3CClient$fbPaymentServiceAddressCallback$1() {
        int A03 = C0f9.A03(-2017030353);
        attachInterface(this, "com.fbpay.w3c.FBPaymentServiceAddressCallback");
        C0f9.A0A(-881169151, A03);
    }
}
