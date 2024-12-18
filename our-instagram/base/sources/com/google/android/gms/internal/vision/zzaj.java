package com.google.android.gms.internal.vision;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(48);
    public final Rect A00;

    public zzaj(Rect rect) {
        this.A00 = rect;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A00, 2, i, false);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzaj() {
        this.A00 = AbstractC166987dD.A0U();
    }
}
