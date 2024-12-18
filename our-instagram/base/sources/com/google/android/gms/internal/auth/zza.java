package com.google.android.gms.internal.auth;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(String str, IBinder iBinder) {
        int A03 = C0f9.A03(843359090);
        this.A00 = iBinder;
        this.A01 = str;
        C0f9.A0A(-215572543, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(749514481);
        IBinder iBinder = this.A00;
        C0f9.A0A(-497050468, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = C0f9.A03(-817965754);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C0f9.A0A(-2014512701, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = C0f9.A03(1888362964);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
                parcel.recycle();
                C0f9.A0A(665393575, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                C0f9.A0A(-1502654559, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            C0f9.A0A(503531119, A03);
            throw th;
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = C0f9.A03(986014495);
        Parcel obtain = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(-1763914463, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(693487009, A03);
            throw th;
        }
    }
}
