package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(68);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GoogleThirdPartyPaymentExtension) || this.A00 != ((GoogleThirdPartyPaymentExtension) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(Boolean.valueOf(this.A00));
    }

    public GoogleThirdPartyPaymentExtension(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58320PtC.A1F(parcel, AbstractC58319PtB.A04(parcel), this.A00);
    }
}
