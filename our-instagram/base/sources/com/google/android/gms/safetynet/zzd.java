package com.google.android.gms.safetynet;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(78);
    public final int A00;
    public final long A01;
    public final HarmfulAppsData[] A02;
    public final boolean A03;

    public zzd(HarmfulAppsData[] harmfulAppsDataArr, int i, long j, boolean z) {
        this.A01 = j;
        this.A02 = harmfulAppsDataArr;
        this.A03 = z;
        this.A00 = z ? i : -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A08(parcel, 2, this.A01);
        AbstractC128825rw.A0G(parcel, this.A02, 3, i);
        AbstractC128825rw.A07(parcel, 4, this.A00);
        AbstractC128825rw.A09(parcel, 5, this.A03);
        AbstractC128825rw.A06(parcel, A04);
    }
}
