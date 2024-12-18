package com.google.ar.core.dependencies;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class c implements IInterface {
    public final IBinder A00;
    public final String A01;

    public c(String str, IBinder iBinder) {
        int A03 = C0f9.A03(-79936279);
        this.A00 = iBinder;
        this.A01 = str;
        C0f9.A0A(351660420, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-2068705332);
        IBinder iBinder = this.A00;
        C0f9.A0A(-1729244673, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = C0f9.A03(-1602738171);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C0f9.A0A(452269711, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = C0f9.A03(143463957);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
                parcel.recycle();
                C0f9.A0A(1405767228, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                C0f9.A0A(-1247582650, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            C0f9.A0A(-347165406, A03);
            throw th;
        }
    }
}
