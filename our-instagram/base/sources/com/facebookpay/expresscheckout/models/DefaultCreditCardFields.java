package com.facebookpay.expresscheckout.models;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC61219RhJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class DefaultCreditCardFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(40);

    @SerializedName("cardType")
    public final EnumC61219RhJ A00;

    @SerializedName("last4Digits")
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        EnumC61219RhJ enumC61219RhJ = this.A00;
        if (enumC61219RhJ == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC61219RhJ);
        }
        parcel.writeString(this.A01);
    }

    public DefaultCreditCardFields(EnumC61219RhJ enumC61219RhJ, String str) {
        this.A00 = enumC61219RhJ;
        this.A01 = str;
    }

    public DefaultCreditCardFields() {
        this(null, null);
    }
}
