package com.facebookpay.expresscheckout.models;

import X.AbstractC69841VwR;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class TransactionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(65);

    @SerializedName("fulfillmentOptions")
    public final FulfillmentOptions A00;

    @SerializedName("pickupInfo")
    public final PickupInfo A01;

    @SerializedName("appliedPromoCodes")
    public final PromoCodeList A02;

    @SerializedName("shippingOptions")
    public final ShippingOptions A03;

    @SerializedName("shippingOptionType")
    public final Integer A04;

    @SerializedName("countryCode")
    public final String A05;

    @SerializedName("shippingAddressInlineErrorMessage")
    public final String A06;

    @SerializedName("lineItems")
    public final ArrayList<PriceInfo> A07;

    @SerializedName("priceItems")
    public final ArrayList<PriceInfo> A08;

    @SerializedName("appliedIncentiveCredentialIds")
    public final List<String> A09;

    @SerializedName("currencyCode")
    public final String A0A;

    public TransactionInfo(FulfillmentOptions fulfillmentOptions, PickupInfo pickupInfo, PromoCodeList promoCodeList, ShippingOptions shippingOptions, Integer num, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, List list) {
        C14360o3.A0B(str, 1);
        this.A0A = str;
        this.A05 = str2;
        this.A08 = arrayList;
        this.A07 = arrayList2;
        this.A03 = shippingOptions;
        this.A00 = fulfillmentOptions;
        this.A02 = promoCodeList;
        this.A09 = list;
        this.A06 = str3;
        this.A04 = num;
        this.A01 = pickupInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A05);
        ArrayList<PriceInfo> arrayList = this.A08;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<PriceInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<PriceInfo> arrayList2 = this.A07;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<PriceInfo> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ShippingOptions shippingOptions = this.A03;
        if (shippingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingOptions.writeToParcel(parcel, i);
        }
        FulfillmentOptions fulfillmentOptions = this.A00;
        if (fulfillmentOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fulfillmentOptions.writeToParcel(parcel, i);
        }
        PromoCodeList promoCodeList = this.A02;
        if (promoCodeList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoCodeList.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A06);
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AbstractC69841VwR.A01(num));
        }
        PickupInfo pickupInfo = this.A01;
        if (pickupInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pickupInfo.writeToParcel(parcel, i);
        }
    }
}
