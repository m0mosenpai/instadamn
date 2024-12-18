package com.facebookpay.offsite.models.message;

import X.AbstractC167027dH;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class SummaryPaymentItem {

    @SerializedName("amount")
    public final PaymentCurrencyAmount amount;

    @SerializedName("label")
    public final String label;

    @SerializedName("summaryItemType")
    public final String summaryItemType;

    public final PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSummaryItemType() {
        return this.summaryItemType;
    }

    public SummaryPaymentItem(String str, PaymentCurrencyAmount paymentCurrencyAmount, String str2) {
        AbstractC167027dH.A13(str, paymentCurrencyAmount, str2);
        this.label = str;
        this.amount = paymentCurrencyAmount;
        this.summaryItemType = str2;
    }
}
