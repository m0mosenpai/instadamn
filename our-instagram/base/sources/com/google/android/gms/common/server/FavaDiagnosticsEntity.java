package com.google.android.gms.common.server;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(57);
    public final int A00;
    public final int A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A02);
        AbstractC128825rw.A07(parcel, 3, this.A01);
        AbstractC128825rw.A06(parcel, A06);
    }

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }
}
