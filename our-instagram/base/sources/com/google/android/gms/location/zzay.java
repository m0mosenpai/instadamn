package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes10.dex */
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(60);
    public final String A00;
    public final String A01;
    public final String A02;

    public zzay(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1Q = AbstractC58319PtB.A1Q(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A0C(parcel, this.A02, 5, A1Q);
        AbstractC128825rw.A06(parcel, A04);
    }
}
