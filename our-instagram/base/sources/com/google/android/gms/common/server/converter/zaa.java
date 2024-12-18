package com.google.android.gms.common.server.converter;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(49);
    public final int A00;
    public final StringToIntConverter A01;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A0A(parcel, this.A01, 2, i, false);
        AbstractC128825rw.A06(parcel, A06);
    }

    public zaa(StringToIntConverter stringToIntConverter, int i) {
        this.A00 = i;
        this.A01 = stringToIntConverter;
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.A00 = 1;
        this.A01 = stringToIntConverter;
    }
}
