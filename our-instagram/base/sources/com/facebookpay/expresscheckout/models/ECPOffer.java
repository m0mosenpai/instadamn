package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class ECPOffer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(45);

    @SerializedName("discountCode")
    public final String A00;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_ID)
    public final String A01;

    @SerializedName("expirationDateText")
    public final String A02;

    @SerializedName("subtitle")
    public final String A03;

    @SerializedName(DialogModule.KEY_TITLE)
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public ECPOffer(String str, String str2, String str3, String str4, String str5) {
        JQ0.A1O(str, str2, str3, str4, str5);
        this.A01 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = str4;
        this.A02 = str5;
    }
}
