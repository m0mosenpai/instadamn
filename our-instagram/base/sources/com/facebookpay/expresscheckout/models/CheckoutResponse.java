package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import X.W6X;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class CheckoutResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(38);

    @SerializedName("checkoutStatus")
    public final String A00;

    @SerializedName("paymentResponseParams")
    public final ECPPaymentResponseParams A01;

    @SerializedName("checkoutErrorReason")
    public final Integer A02;

    @SerializedName("checkoutErrorMessage")
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(W6X.A02(num));
        }
        parcel.writeString(this.A03);
        ECPPaymentResponseParams eCPPaymentResponseParams = this.A01;
        if (eCPPaymentResponseParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCPPaymentResponseParams.writeToParcel(parcel, i);
        }
    }

    public CheckoutResponse(ECPPaymentResponseParams eCPPaymentResponseParams, Integer num, String str, String str2) {
        this.A00 = str;
        this.A02 = num;
        this.A03 = str2;
        this.A01 = eCPPaymentResponseParams;
    }

    public CheckoutResponse() {
        this(null, null, null, null);
    }
}
