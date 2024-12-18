package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(37);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final zzf A04;
    public final zzf A05;
    public final zzf A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final zzr[] A0A;

    public zzl(zzf zzfVar, zzf zzfVar2, zzf zzfVar3, String str, String str2, zzr[] zzrVarArr, float f, int i, int i2, int i3, boolean z) {
        this.A0A = zzrVarArr;
        this.A04 = zzfVar;
        this.A05 = zzfVar2;
        this.A06 = zzfVar3;
        this.A07 = str;
        this.A00 = f;
        this.A08 = str2;
        this.A01 = i;
        this.A09 = z;
        this.A02 = i2;
        this.A03 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0G(parcel, this.A0A, 2, i);
        AbstractC128825rw.A0A(parcel, this.A04, 3, i, false);
        AbstractC128825rw.A0A(parcel, this.A05, 4, i, false);
        AbstractC128825rw.A0A(parcel, this.A06, 5, i, false);
        AbstractC128825rw.A0C(parcel, this.A07, 6, false);
        AbstractC128825rw.A04(parcel, this.A00, 7);
        AbstractC128825rw.A0C(parcel, this.A08, 8, false);
        AbstractC128825rw.A07(parcel, 9, this.A01);
        AbstractC128825rw.A09(parcel, 10, this.A09);
        AbstractC128825rw.A07(parcel, 11, this.A02);
        AbstractC128825rw.A07(parcel, 12, this.A03);
        AbstractC128825rw.A06(parcel, A04);
    }
}
