package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(45);
    public final float A00;
    public final zzf A01;
    public final zzf A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final zzn[] A06;

    public zzr(zzf zzfVar, zzf zzfVar2, String str, String str2, zzn[] zznVarArr, float f, boolean z) {
        this.A06 = zznVarArr;
        this.A01 = zzfVar;
        this.A02 = zzfVar2;
        this.A03 = str;
        this.A00 = f;
        this.A04 = str2;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0G(parcel, this.A06, 2, i);
        AbstractC128825rw.A0A(parcel, this.A01, 3, i, false);
        AbstractC128825rw.A0A(parcel, this.A02, 4, i, false);
        AbstractC128825rw.A0C(parcel, this.A03, 5, false);
        AbstractC128825rw.A04(parcel, this.A00, 6);
        AbstractC128825rw.A0C(parcel, this.A04, 7, false);
        AbstractC128825rw.A09(parcel, 8, this.A05);
        AbstractC128825rw.A06(parcel, A04);
    }
}
