package com.google.android.gms.internal.location;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class zzb implements IInterface {
    public final String A00;
    public final IBinder A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = C0f9.A03(335478558);
        this.A01 = iBinder;
        this.A00 = str;
        C0f9.A0A(658887038, A03);
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = C0f9.A03(-1066251307);
        Parcel obtain = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(this.A01, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(-351708126, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(-493153613, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-856015257);
        IBinder iBinder = this.A01;
        C0f9.A0A(440586488, A03);
        return iBinder;
    }
}
