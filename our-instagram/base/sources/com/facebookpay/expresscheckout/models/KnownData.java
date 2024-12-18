package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class KnownData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(55);

    @SerializedName("knownShippingAddress")
    public final ShippingAddress A00;

    @SerializedName("knownEmail")
    public final String A01;

    @SerializedName("knownFullName")
    public final String A02;

    @SerializedName("knownPhoneNumber")
    public final String A03;

    @SerializedName("knownDataSource")
    public final String A04;

    public KnownData(ShippingAddress shippingAddress, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str4, 5);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = shippingAddress;
        this.A04 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
    }
}
