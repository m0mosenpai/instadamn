package com.fbpay.hub.paymentmethods.api;

import X.AbstractC58321PtD;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FbPayBankAccount implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(33);
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FbPayBankAccount) && C14360o3.A0K(this.A00, ((FbPayBankAccount) obj).A00));
    }

    public final int hashCode() {
        return AbstractC63311ShH.A02(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    public FbPayBankAccount(Parcel parcel) {
        AbstractC58321PtD.A1O(this);
        this.A00 = parcel.readString();
    }

    public FbPayBankAccount(String str) {
        this.A00 = str;
    }
}
