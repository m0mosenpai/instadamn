package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(81);
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaw)) {
            return false;
        }
        return SSI.A01(this.A00, ((zzaw) obj).A00);
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC58322PtE.A1D(parcel, str);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzaw(String str) {
        this.A00 = str;
    }
}
