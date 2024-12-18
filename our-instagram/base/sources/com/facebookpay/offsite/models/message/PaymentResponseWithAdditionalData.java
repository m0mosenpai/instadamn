package com.facebookpay.offsite.models.message;

import X.C14360o3;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* loaded from: classes11.dex */
public final class PaymentResponseWithAdditionalData {

    @SerializedName("additionalData")
    public final Map<String, String> additionalData;

    @SerializedName(MessageType$Companion.PAYMENT_RESPONSE)
    public final PaymentResponse paymentResponse;

    public PaymentResponseWithAdditionalData(PaymentResponse paymentResponse, Map map) {
        C14360o3.A0B(paymentResponse, 1);
        this.paymentResponse = paymentResponse;
        this.additionalData = map;
    }

    public final Map getAdditionalData() {
        return this.additionalData;
    }

    public final PaymentResponse getPaymentResponse() {
        return this.paymentResponse;
    }
}
