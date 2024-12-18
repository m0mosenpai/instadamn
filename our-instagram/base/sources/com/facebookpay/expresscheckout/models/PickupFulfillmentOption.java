package com.facebookpay.expresscheckout.models;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

/* loaded from: classes11.dex */
public final class PickupFulfillmentOption extends FulfillmentOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(59);
    public final CurrencyAmount A00;

    @SerializedName("pickupStoreDistance")
    public final Distance A01;

    @SerializedName("pickupLocationAddress")
    public final ShippingAddress A02;
    public final String A03;
    public final String A04;
    public final Date A05;
    public final Date A06;

    @SerializedName("pickupStoreAvailability")
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFulfillmentOption(CurrencyAmount currencyAmount, Distance distance, ShippingAddress shippingAddress, String str, String str2, Date date, Date date2, boolean z) {
        super(currencyAmount, str, str2, date, date2);
        AbstractC167027dH.A13(str, str2, currencyAmount);
        C14360o3.A0B(shippingAddress, 6);
        this.A03 = str;
        this.A04 = str2;
        this.A00 = currencyAmount;
        this.A06 = date;
        this.A05 = date2;
        this.A02 = shippingAddress;
        this.A07 = z;
        this.A01 = distance;
    }
}
