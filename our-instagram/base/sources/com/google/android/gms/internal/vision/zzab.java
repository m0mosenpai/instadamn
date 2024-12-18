package com.google.android.gms.internal.vision;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(46);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public zzab(int i, int i2, int i3, int i4, float f) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A07(parcel, 3, this.A02);
        AbstractC128825rw.A07(parcel, 4, this.A03);
        AbstractC128825rw.A07(parcel, 5, this.A04);
        AbstractC128825rw.A04(parcel, this.A00, 6);
        AbstractC128825rw.A06(parcel, A04);
    }
}
