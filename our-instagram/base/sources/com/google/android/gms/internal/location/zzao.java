package com.google.android.gms.internal.location;

import X.C0f9;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class zzao extends zzb implements zzal {
    @Override // com.google.android.gms.internal.location.zzal
    public final void FFg(zzbe zzbeVar) {
        int A03 = C0f9.A03(-226271384);
        int A032 = C0f9.A03(489795492);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A00);
        C0f9.A0A(-1050705418, A032);
        obtain.writeInt(1);
        zzbeVar.writeToParcel(obtain, 0);
        A00(obtain, 59);
        C0f9.A0A(-1112872494, A03);
    }
}
