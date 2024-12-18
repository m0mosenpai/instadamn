package com.google.android.gms.internal.auth;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(26);
    public String A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A01);
        AbstractC128825rw.A0B(parcel, this.A00);
        AbstractC128825rw.A06(parcel, A06);
    }

    public zzbw(int i, String str) {
        this.A01 = i;
        this.A00 = str;
    }

    public zzbw() {
        this.A01 = 1;
    }
}
