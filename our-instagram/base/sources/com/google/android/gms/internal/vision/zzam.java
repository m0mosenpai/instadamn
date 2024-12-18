package com.google.android.gms.internal.vision;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(50);
    public final String A00;

    public zzam(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzam() {
        this(null);
    }
}
