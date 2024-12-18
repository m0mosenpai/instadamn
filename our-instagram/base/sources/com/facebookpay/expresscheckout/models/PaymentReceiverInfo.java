package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class PaymentReceiverInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(58);

    @SerializedName("clientReceiverId")
    public final String A00;

    @SerializedName("receiverIconUrl")
    public final String A01;

    @SerializedName("receiverId")
    public final String A02;

    @SerializedName("receiverName")
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public PaymentReceiverInfo(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    public PaymentReceiverInfo() {
        this(null, null, null, null);
    }
}
