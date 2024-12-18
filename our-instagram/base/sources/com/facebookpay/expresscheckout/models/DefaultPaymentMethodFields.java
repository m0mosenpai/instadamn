package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class DefaultPaymentMethodFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(41);

    @SerializedName("creditCardFields")
    public final DefaultCreditCardFields A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        DefaultCreditCardFields defaultCreditCardFields = this.A00;
        if (defaultCreditCardFields == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultCreditCardFields.writeToParcel(parcel, i);
        }
    }

    public DefaultPaymentMethodFields(DefaultCreditCardFields defaultCreditCardFields) {
        this.A00 = defaultCreditCardFields;
    }

    public DefaultPaymentMethodFields() {
        this(null);
    }
}
