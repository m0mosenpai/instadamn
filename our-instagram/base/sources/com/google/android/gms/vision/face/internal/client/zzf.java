package com.google.android.gms.vision.face.internal.client;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(1);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A07(parcel, 3, this.A02);
        AbstractC128825rw.A07(parcel, 4, this.A03);
        AbstractC128825rw.A09(parcel, 5, this.A04);
        AbstractC128825rw.A09(parcel, 6, this.A05);
        AbstractC128825rw.A04(parcel, this.A00, 7);
        AbstractC128825rw.A06(parcel, A04);
    }
}
