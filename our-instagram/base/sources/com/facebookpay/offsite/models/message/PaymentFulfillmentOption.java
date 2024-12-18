package com.facebookpay.offsite.models.message;

import X.AbstractC167027dH;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

/* loaded from: classes11.dex */
public class PaymentFulfillmentOption {

    @SerializedName("amount")
    public final PaymentCurrencyAmount amount;

    @SerializedName("dateTimeRangeEnd")
    public final Date dateTimeRangeEnd;

    @SerializedName("dateTimeRangeStart")
    public final Date dateTimeRangeStart;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_ID)
    public final String id;

    @SerializedName("label")
    public final String label;

    public PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public Date getDateTimeRangeEnd() {
        return this.dateTimeRangeEnd;
    }

    public Date getDateTimeRangeStart() {
        return this.dateTimeRangeStart;
    }

    public String getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public PaymentFulfillmentOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2) {
        AbstractC167027dH.A13(str, str2, paymentCurrencyAmount);
        this.id = str;
        this.label = str2;
        this.amount = paymentCurrencyAmount;
        this.dateTimeRangeStart = date;
        this.dateTimeRangeEnd = date2;
    }
}
