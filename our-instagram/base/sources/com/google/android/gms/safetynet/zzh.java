package com.google.android.gms.safetynet;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(80);
    public final int A00;
    public final boolean A01;

    public zzh(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A09(parcel, 3, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
