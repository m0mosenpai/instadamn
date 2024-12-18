package com.google.android.gms.common.internal;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(41);
    public final int A00;
    public final int A01;
    public final int A02;

    @Deprecated
    public final Scope[] A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A07(parcel, 3, this.A02);
        AbstractC128825rw.A0G(parcel, this.A03, 4, i);
        AbstractC128825rw.A06(parcel, A06);
    }

    public zax(Scope[] scopeArr, int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = scopeArr;
    }
}
