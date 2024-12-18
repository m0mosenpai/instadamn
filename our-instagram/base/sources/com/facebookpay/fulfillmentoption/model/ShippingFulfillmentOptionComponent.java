package com.facebookpay.fulfillmentoption.model;

import X.AbstractC167017dG;
import X.C63470SlB;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import java.util.Date;

/* loaded from: classes11.dex */
public final class ShippingFulfillmentOptionComponent extends FulfillmentOptionComponent {
    public static final Parcelable.Creator CREATOR = new C63470SlB(5);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Date A04;
    public final Date A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingFulfillmentOptionComponent(CurrencyAmount currencyAmount, String str, String str2, String str3, Date date, Date date2) {
        super(currencyAmount, str, str2, str3);
        AbstractC167017dG.A1P(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = currencyAmount;
        this.A01 = str3;
        this.A05 = date;
        this.A04 = date2;
    }
}
