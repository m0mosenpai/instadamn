package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes11.dex */
public final class PaymentDetailsChangedContent {

    @SerializedName("changeTypes")
    public final List<String> changeTypes;

    @SerializedName("paymentDetails")
    public final PaymentDetails paymentDetails;

    public final List getChangeTypes() {
        return this.changeTypes;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public PaymentDetailsChangedContent(PaymentDetails paymentDetails, List list) {
        AbstractC167017dG.A1P(paymentDetails, list);
        this.paymentDetails = paymentDetails;
        this.changeTypes = list;
    }
}
