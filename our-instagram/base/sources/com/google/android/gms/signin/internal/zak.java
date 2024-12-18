package com.google.android.gms.signin.internal;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

/* loaded from: classes10.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(85);
    public final int A00;
    public final ConnectionResult A01;
    public final zav A02;

    public zak(ConnectionResult connectionResult, zav zavVar, int i) {
        this.A00 = i;
        this.A01 = connectionResult;
        this.A02 = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A0A(parcel, this.A02, 3, i, AbstractC58322PtE.A1U(parcel, this.A01, i));
        AbstractC128825rw.A06(parcel, A04);
    }
}
