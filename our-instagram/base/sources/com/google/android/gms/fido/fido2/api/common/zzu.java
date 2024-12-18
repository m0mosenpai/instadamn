package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC166997dE;
import X.AbstractC25230BEn;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(3);

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    public final boolean equals(Object obj) {
        return AbstractC25230BEn.A1Q(obj instanceof zzu ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(AbstractC166997dE.A0a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A09(parcel, 1, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
