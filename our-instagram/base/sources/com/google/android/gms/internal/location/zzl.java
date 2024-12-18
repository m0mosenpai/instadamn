package com.google.android.gms.internal.location;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(34);
    public int A00;
    public zzai A01;
    public zzj A02;
    public com.google.android.gms.location.zzak A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A0A(parcel, this.A02, 2, i, false);
        com.google.android.gms.location.zzak zzakVar = this.A03;
        IBinder iBinder = null;
        if (zzakVar == null) {
            asBinder = null;
        } else {
            asBinder = zzakVar.asBinder();
        }
        AbstractC128825rw.A03(asBinder, parcel, 3);
        zzai zzaiVar = this.A01;
        if (zzaiVar != null) {
            iBinder = zzaiVar.asBinder();
        }
        AbstractC128825rw.A03(iBinder, parcel, 4);
        AbstractC128825rw.A06(parcel, A04);
    }
}
