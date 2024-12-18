package com.google.android.gms.internal.fido;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class zza implements IInterface {
    public final String A00;
    public final IBinder A01;

    public zza(IBinder iBinder) {
        int A03 = C0f9.A03(1141805010);
        this.A01 = iBinder;
        this.A00 = "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
        C0f9.A0A(332168626, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(9426838);
        IBinder iBinder = this.A01;
        C0f9.A0A(-950449876, A03);
        return iBinder;
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = C0f9.A03(-691077886);
        Parcel obtain = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(this.A01, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(-526081574, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(1844929344, A03);
            throw th;
        }
    }
}
