package com.google.android.gms.internal.vision;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(51);
    public final zzab A00;
    public final String A01;
    public final String A02;
    public final float A03;
    public final zzab A04;
    public final boolean A05;
    public final zzal[] A06;

    public zzao(zzab zzabVar, zzab zzabVar2, String str, String str2, zzal[] zzalVarArr, float f, boolean z) {
        this.A06 = zzalVarArr;
        this.A00 = zzabVar;
        this.A04 = zzabVar2;
        this.A01 = str;
        this.A03 = f;
        this.A02 = str2;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0G(parcel, this.A06, 2, i);
        AbstractC128825rw.A0A(parcel, this.A00, 3, i, false);
        AbstractC128825rw.A0A(parcel, this.A04, 4, i, false);
        AbstractC128825rw.A0C(parcel, this.A01, 5, false);
        AbstractC128825rw.A04(parcel, this.A03, 6);
        AbstractC128825rw.A0C(parcel, this.A02, 7, false);
        AbstractC128825rw.A09(parcel, 8, this.A05);
        AbstractC128825rw.A06(parcel, A04);
    }
}
