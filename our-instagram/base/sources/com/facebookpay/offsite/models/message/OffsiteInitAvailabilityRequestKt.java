package com.facebookpay.offsite.models.message;

import X.C14360o3;

/* loaded from: classes11.dex */
public abstract class OffsiteInitAvailabilityRequestKt {
    public static final String DEFAULT_PARTNER_ID = "UNKNOWN";

    public static final String isIAWAvailabilityRequest(PaymentRequest paymentRequest) {
        C14360o3.A0B(paymentRequest, 0);
        PaymentConfiguration paymentConfiguration = paymentRequest.content.paymentConfiguration;
        if (C14360o3.A0K(paymentConfiguration.partnerId, "UNKNOWN") && C14360o3.A0K(paymentConfiguration.partnerMerchantId, "UNKNOWN")) {
            return AvailabilityInitiator$Companion.INITIATOR_IAW;
        }
        return AvailabilityInitiator$Companion.INITIATOR_JS_SDK;
    }

    public static /* synthetic */ void isIAWAvailabilityRequest$annotations(PaymentRequest paymentRequest) {
    }
}
