package com.facebookpay.expresscheckout.models;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC65703TsZ;
import X.C14360o3;
import X.C70221WIe;
import X.VDV;
import X.VE5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes11.dex */
public final class PriceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(61);

    @SerializedName("amount")
    public final CurrencyAmount A00;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)
    public final VE5 A01;

    @SerializedName("quantity")
    public final Integer A02;

    @SerializedName("iconUrl")
    public final String A03;

    @SerializedName("primaryLabel")
    public final String A04;

    @SerializedName("secondaryLabel")
    public final String A05;

    @SerializedName(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)
    public final VDV A06;

    @SerializedName("metadata")
    public final String A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        AbstractC65703TsZ.A1H(parcel, this.A01);
        AbstractC65703TsZ.A1H(parcel, this.A06);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }

    public PriceInfo(CurrencyAmount currencyAmount, VDV vdv, VE5 ve5, Integer num, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(currencyAmount, str);
        this.A00 = currencyAmount;
        this.A04 = str;
        this.A01 = ve5;
        this.A06 = vdv;
        this.A02 = num;
        this.A07 = str2;
        this.A05 = str3;
        this.A03 = str4;
    }
}
