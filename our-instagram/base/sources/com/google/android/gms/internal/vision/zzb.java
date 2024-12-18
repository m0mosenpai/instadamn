package com.google.android.gms.internal.vision;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class zzb implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = C0f9.A03(-1638587878);
        this.A00 = iBinder;
        this.A01 = str;
        C0f9.A0A(-1751965058, A03);
    }

    public final Parcel A00() {
        int A03 = C0f9.A03(-2046101151);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C0f9.A0A(-2105106140, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = C0f9.A03(1649271168);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
                parcel.recycle();
                C0f9.A0A(1353686002, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                C0f9.A0A(2091642152, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            C0f9.A0A(1060249796, A03);
            throw th;
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = C0f9.A03(-752308422);
        Parcel obtain = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(1264079373, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(-60744900, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(1029853520);
        IBinder iBinder = this.A00;
        C0f9.A0A(1436259827, A03);
        return iBinder;
    }
}
