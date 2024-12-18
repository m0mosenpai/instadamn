package com.instagram.leadgen.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import X.EnumC53274NhC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class LeadGenTrustSignal extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(19);
    public final int A00;
    public final EnumC53274NhC A01;
    public final String A02;

    public LeadGenTrustSignal(EnumC53274NhC enumC53274NhC, String str, int i) {
        C14360o3.A0B(enumC53274NhC, 1);
        this.A01 = enumC53274NhC;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenTrustSignal) {
                LeadGenTrustSignal leadGenTrustSignal = (LeadGenTrustSignal) obj;
                if (this.A01 != leadGenTrustSignal.A01 || this.A00 != leadGenTrustSignal.A00 || !C14360o3.A0K(this.A02, leadGenTrustSignal.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + this.A00) * 31) + AbstractC167017dG.A0O(this.A02);
    }
}
