package com.facebookpay.offsite.models.message;

import X.AbstractC167027dH;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class PaymentRequestContent {

    @SerializedName("paymentConfiguration")
    public final PaymentConfiguration paymentConfiguration;

    @SerializedName("paymentDetails")
    public final PaymentDetails paymentDetails;

    @SerializedName("paymentOptions")
    public final PaymentOptions paymentOptions;

    public static /* synthetic */ PaymentRequestContent createCopy$default(PaymentRequestContent paymentRequestContent, PaymentDetails paymentDetails, PaymentOptions paymentOptions, PaymentConfiguration paymentConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentDetails = paymentRequestContent.paymentDetails;
        }
        if ((i & 2) != 0) {
            paymentOptions = paymentRequestContent.paymentOptions;
        }
        if ((i & 4) != 0) {
            paymentConfiguration = paymentRequestContent.paymentConfiguration;
        }
        return paymentRequestContent.createCopy(paymentDetails, paymentOptions, paymentConfiguration);
    }

    public final PaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public final PaymentOptions getPaymentOptions() {
        return this.paymentOptions;
    }

    public PaymentRequestContent(PaymentDetails paymentDetails, PaymentOptions paymentOptions, PaymentConfiguration paymentConfiguration) {
        AbstractC167027dH.A13(paymentDetails, paymentOptions, paymentConfiguration);
        this.paymentDetails = paymentDetails;
        this.paymentOptions = paymentOptions;
        this.paymentConfiguration = paymentConfiguration;
    }

    public final PaymentRequestContent createCopy(PaymentDetails paymentDetails, PaymentOptions paymentOptions, PaymentConfiguration paymentConfiguration) {
        AbstractC167027dH.A12(paymentDetails, paymentOptions, paymentConfiguration);
        return new PaymentRequestContent(paymentDetails, paymentOptions, paymentConfiguration);
    }
}
