package com.google.mlkit.vision.common.internal;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(20);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    public VisionImageMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A04 = j;
        this.A01 = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A02);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A07(parcel, 3, this.A03);
        AbstractC128825rw.A08(parcel, 4, this.A04);
        AbstractC128825rw.A07(parcel, 5, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
