package com.facebookpay.expresscheckout.models;

import X.AbstractC69841VwR;
import X.C14360o3;
import X.C70221WIe;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import kotlin.Deprecated;

@Deprecated(message = "To be replaced with FulfillmentOption")
/* loaded from: classes11.dex */
public final class ShippingOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(63);

    @SerializedName("amount")
    public final CurrencyAmount A00;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)
    public final Integer A01;

    @SerializedName(DevServerEntity.COLUMN_DESCRIPTION)
    public final String A02;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_ID)
    public final String A03;

    @SerializedName("label")
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(AbstractC69841VwR.A01(this.A01));
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public ShippingOption(CurrencyAmount currencyAmount, Integer num, String str, String str2, String str3) {
        JQ0.A1O(str, num, str2, currencyAmount, str3);
        this.A03 = str;
        this.A01 = num;
        this.A04 = str2;
        this.A00 = currencyAmount;
        this.A02 = str3;
    }
}
