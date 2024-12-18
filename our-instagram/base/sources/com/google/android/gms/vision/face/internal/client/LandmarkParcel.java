package com.google.android.gms.vision.face.internal.client;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(2);
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A03);
        AbstractC128825rw.A04(parcel, this.A00, 2);
        AbstractC128825rw.A04(parcel, this.A01, 3);
        AbstractC58322PtE.A1B(parcel, this.A02, A04);
    }
}
