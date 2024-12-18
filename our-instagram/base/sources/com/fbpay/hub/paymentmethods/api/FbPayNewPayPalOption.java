package com.fbpay.hub.paymentmethods.api;

import X.AbstractC25235BEs;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FbPayNewPayPalOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(36);
    public final String A00;
    public final String A01;

    public FbPayNewPayPalOption(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayNewPayPalOption) {
                FbPayNewPayPalOption fbPayNewPayPalOption = (FbPayNewPayPalOption) obj;
                if (!C14360o3.A0K(this.A00, fbPayNewPayPalOption.A00) || !C14360o3.A0K(this.A01, fbPayNewPayPalOption.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A00, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A01, 0, 1);
    }

    public FbPayNewPayPalOption(Parcel parcel) {
        this.A00 = AbstractC58322PtE.A07(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = AbstractC58322PtE.A0n(parcel);
    }
}
