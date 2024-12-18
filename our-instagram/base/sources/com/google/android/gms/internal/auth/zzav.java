package com.google.android.gms.internal.auth;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(22);
    public final int A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, 1);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A07(parcel, 3, this.A00);
        AbstractC128825rw.A06(parcel, A06);
    }

    public zzav(String str, int i) {
        C3U5.A02(str);
        this.A01 = str;
        this.A00 = i;
    }
}
