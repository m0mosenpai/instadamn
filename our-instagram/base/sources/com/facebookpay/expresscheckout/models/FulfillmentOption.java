package com.facebookpay.expresscheckout.models;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

/* loaded from: classes11.dex */
public class FulfillmentOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(52);

    @SerializedName("amount")
    public final CurrencyAmount A00;

    @SerializedName("label")
    public final String A01;

    @SerializedName("dateTimeRangeEnd")
    public final Date A02;

    @SerializedName("dateTimeRangeStart")
    public final Date A03;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_ID)
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        if (this instanceof PickupFulfillmentOption) {
            return ((PickupFulfillmentOption) this).A03;
        }
        return this.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this instanceof PickupFulfillmentOption) {
            PickupFulfillmentOption pickupFulfillmentOption = (PickupFulfillmentOption) this;
            C14360o3.A0B(parcel, 0);
            parcel.writeString(pickupFulfillmentOption.A03);
            parcel.writeString(pickupFulfillmentOption.A04);
            parcel.writeParcelable(pickupFulfillmentOption.A00, i);
            parcel.writeSerializable(pickupFulfillmentOption.A06);
            parcel.writeSerializable(pickupFulfillmentOption.A05);
            parcel.writeParcelable(pickupFulfillmentOption.A02, i);
            parcel.writeInt(pickupFulfillmentOption.A07 ? 1 : 0);
            parcel.writeParcelable(pickupFulfillmentOption.A01, i);
            return;
        }
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeSerializable(this.A03);
        parcel.writeSerializable(this.A02);
    }

    public FulfillmentOption(CurrencyAmount currencyAmount, String str, String str2, Date date, Date date2) {
        AbstractC167027dH.A13(str, str2, currencyAmount);
        this.A04 = str;
        this.A01 = str2;
        this.A00 = currencyAmount;
        this.A03 = date;
        this.A02 = date2;
    }
}
