package com.google.android.gms.signin.internal;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;

/* loaded from: classes10.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(84);
    public final int A00;
    public final zat A01;

    public zai(zat zatVar, int i) {
        this.A00 = i;
        this.A01 = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A0A(parcel, this.A01, 2, i, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
