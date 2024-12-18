package com.google.android.gms.deviceperformance;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class MediaPerformanceClassResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(62);
    public final int A00;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }

    public MediaPerformanceClassResult(int i) {
        this.A00 = i;
    }
}
