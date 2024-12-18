package com.google.android.gms.internal.ads_identifier;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class zzg implements IInterface, zze {
    public final IBinder A00;
    public final String A01;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1432473586);
        IBinder iBinder = this.A00;
        C0f9.A0A(-1748524563, A03);
        return iBinder;
    }

    public zzg(IBinder iBinder) {
        int A03 = C0f9.A03(-1565293878);
        this.A00 = iBinder;
        this.A01 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        C0f9.A0A(-1848817682, A03);
        C0f9.A0A(666617611, C0f9.A03(44314466));
    }

    public final Parcel A00(Parcel parcel, int i) {
        int A03 = C0f9.A03(121677159);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
                parcel.recycle();
                C0f9.A0A(2120833112, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                C0f9.A0A(847764278, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            C0f9.A0A(-141453190, A03);
            throw th;
        }
    }
}
