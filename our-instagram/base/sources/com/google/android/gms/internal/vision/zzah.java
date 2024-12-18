package com.google.android.gms.internal.vision;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(47);
    public final int A00;
    public final int A01;
    public final zzab A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final zzao[] A06;
    public final float A07;
    public final int A08;
    public final zzab A09;
    public final zzab A0A;

    public zzah(zzab zzabVar, zzab zzabVar2, zzab zzabVar3, String str, String str2, zzao[] zzaoVarArr, float f, int i, int i2, int i3, boolean z) {
        this.A06 = zzaoVarArr;
        this.A02 = zzabVar;
        this.A09 = zzabVar2;
        this.A0A = zzabVar3;
        this.A03 = str;
        this.A07 = f;
        this.A04 = str2;
        this.A08 = i;
        this.A05 = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0G(parcel, this.A06, 2, i);
        AbstractC128825rw.A0A(parcel, this.A02, 3, i, false);
        AbstractC128825rw.A0A(parcel, this.A09, 4, i, false);
        AbstractC128825rw.A0A(parcel, this.A0A, 5, i, false);
        AbstractC128825rw.A0C(parcel, this.A03, 6, false);
        AbstractC128825rw.A04(parcel, this.A07, 7);
        AbstractC128825rw.A0C(parcel, this.A04, 8, false);
        AbstractC128825rw.A07(parcel, 9, this.A08);
        AbstractC128825rw.A09(parcel, 10, this.A05);
        AbstractC128825rw.A07(parcel, 11, this.A00);
        AbstractC128825rw.A07(parcel, 12, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
