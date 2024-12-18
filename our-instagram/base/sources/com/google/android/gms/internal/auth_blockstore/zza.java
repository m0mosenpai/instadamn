package com.google.android.gms.internal.auth_blockstore;

import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zza implements IInterface {
    public final IBinder A00;

    public zza(IBinder iBinder) {
        int A03 = C0f9.A03(-665896670);
        this.A00 = iBinder;
        C0f9.A0A(1822895881, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-354355501);
        IBinder iBinder = this.A00;
        C0f9.A0A(1941155577, A03);
        return iBinder;
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = C0f9.A03(1610818168);
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, obtain, 0);
            obtain.readException();
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(1024833074, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(2056383776, A03);
            throw th;
        }
    }
}
