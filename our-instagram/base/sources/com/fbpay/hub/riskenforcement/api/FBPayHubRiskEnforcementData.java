package com.fbpay.hub.riskenforcement.api;

import X.AbstractC167027dH;
import X.AbstractC25235BEs;
import X.AbstractC58322PtE;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FBPayHubRiskEnforcementData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(41);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayHubRiskEnforcementData) {
                FBPayHubRiskEnforcementData fBPayHubRiskEnforcementData = (FBPayHubRiskEnforcementData) obj;
                if (this.A00 != fBPayHubRiskEnforcementData.A00 || this.A01 != fBPayHubRiskEnforcementData.A01 || !C14360o3.A0K(this.A02, fBPayHubRiskEnforcementData.A02) || !C14360o3.A0K(this.A03, fBPayHubRiskEnforcementData.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int intValue;
        Integer num = this.A00;
        int i = -1;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i2 = intValue + 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i = num2.intValue();
        }
        return (((((i2 * 31) + i) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
    }

    public FBPayHubRiskEnforcementData(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = AbstractC58322PtE.A0i(parcel, 5);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = AbstractC58322PtE.A0i(parcel, 7);
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A03 = AbstractC58322PtE.A0n(parcel);
    }
}
