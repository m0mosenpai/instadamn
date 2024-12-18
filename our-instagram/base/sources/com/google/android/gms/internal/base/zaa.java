package com.google.android.gms.internal.base;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class zaa implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zaa(String str, IBinder iBinder) {
        int A03 = C0f9.A03(-1643773090);
        this.A00 = iBinder;
        this.A01 = str;
        C0f9.A0A(-1832426573, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1832304334);
        IBinder iBinder = this.A00;
        C0f9.A0A(-176232273, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = C0f9.A03(209746410);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C0f9.A0A(1497862639, A03);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = C0f9.A03(-1691246703);
        Parcel obtain = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(-1601516113, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(-353042594, A03);
            throw th;
        }
    }
}
