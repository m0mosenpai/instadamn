package com.fbpay.w3c.client;

import X.AbstractC167017dG;
import X.C0f9;
import X.C2GP;
import X.SED;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.fbpay.w3c.AutofillKeyFetchServiceCallback;

/* loaded from: classes10.dex */
public final class W3CClient$AutofillKeyFetchServiceCallbackImpl extends Binder implements AutofillKeyFetchServiceCallback {
    public final /* synthetic */ C2GP A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3CClient$AutofillKeyFetchServiceCallbackImpl(C2GP c2gp) {
        this();
        this.A00 = c2gp;
        C0f9.A0A(-740512437, C0f9.A03(-1788740951));
    }

    @Override // com.fbpay.w3c.AutofillKeyFetchServiceCallback
    public final void DOG(String str) {
        int A0N = AbstractC167017dG.A0N(str, -778260113);
        this.A00.A05.A0A(new SED(str, null));
        C0f9.A0A(-658241482, A0N);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-2097102086, C0f9.A03(2124261914));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(355360402);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
                if (i == 1) {
                    DOG(parcel.readString());
                    parcel2.writeNoException();
                    i3 = -194203271;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
                i3 = -936323531;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-1874112196, A03);
        return onTransact;
    }

    public W3CClient$AutofillKeyFetchServiceCallbackImpl() {
        int A03 = C0f9.A03(-125617242);
        attachInterface(this, "com.fbpay.w3c.AutofillKeyFetchServiceCallback");
        C0f9.A0A(-1535947328, A03);
    }
}
