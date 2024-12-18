package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zznl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(38);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    public zznl(int i, int i2, int i3, long j, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A07(parcel, 3, this.A02);
        AbstractC128825rw.A07(parcel, 4, this.A03);
        AbstractC128825rw.A08(parcel, 5, this.A04);
        AbstractC128825rw.A06(parcel, A04);
    }
}
