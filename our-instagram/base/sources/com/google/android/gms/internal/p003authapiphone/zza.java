package com.google.android.gms.internal.p003authapiphone;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class zza implements IInterface {
    public final IBinder A00;

    public zza(IBinder iBinder) {
        int A03 = C0f9.A03(-1128324677);
        this.A00 = iBinder;
        C0f9.A0A(531508785, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(976510229);
        IBinder iBinder = this.A00;
        C0f9.A0A(-848440143, A03);
        return iBinder;
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = C0f9.A03(-846835758);
        Parcel obtain = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(453442877, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(221639151, A03);
            throw th;
        }
    }
}
