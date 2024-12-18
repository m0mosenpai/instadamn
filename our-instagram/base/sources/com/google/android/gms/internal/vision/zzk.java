package com.google.android.gms.internal.vision;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(53);
    public int A00;
    public boolean A01;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A09(parcel, 3, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
