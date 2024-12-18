package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(35);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A07(parcel, 3, this.A01);
        AbstractC128825rw.A07(parcel, 4, this.A02);
        AbstractC128825rw.A08(parcel, 5, this.A04);
        AbstractC128825rw.A07(parcel, 6, this.A03);
        AbstractC128825rw.A06(parcel, A04);
    }
}
