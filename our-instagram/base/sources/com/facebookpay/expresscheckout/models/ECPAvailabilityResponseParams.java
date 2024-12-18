package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class ECPAvailabilityResponseParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(43);

    @SerializedName("apiVersion")
    public final int A00;

    @SerializedName("defaultPaymentMethodFields")
    public final DefaultPaymentMethodFields A01;

    @SerializedName("isCacheAvailable")
    public final boolean A02;

    @SerializedName("isNUX")
    public final boolean A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        DefaultPaymentMethodFields defaultPaymentMethodFields = this.A01;
        if (defaultPaymentMethodFields == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultPaymentMethodFields.writeToParcel(parcel, i);
        }
    }

    public ECPAvailabilityResponseParams(DefaultPaymentMethodFields defaultPaymentMethodFields, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = defaultPaymentMethodFields;
    }
}
