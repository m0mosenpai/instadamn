package com.facebookpay.offsite.models.message;

import X.AbstractC06930Yk;
import X.C14360o3;
import X.C16920sk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes11.dex */
public final class OffsiteInitAvailabilityRequest {
    public static final OffsiteInitAvailabilityRequest INSTANCE = new Object();

    public final PaymentRequest buildInitAvailabilityRequest() {
        PaymentDetails paymentDetails = new PaymentDetails(null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, null, null, null, null, null, null);
        PaymentOptions paymentOptions = new PaymentOptions(true, true, true, true, true, null, null, null, true, false, null, null, null, null, null, null);
        C16920sk A0E = AbstractC06930Yk.A0E();
        Set singleton = Collections.singleton(PaymentUXFlags.META_CHECKOUT);
        C14360o3.A07(singleton);
        return new PaymentRequest("", new PaymentRequestContent(paymentDetails, paymentOptions, new PaymentConfiguration("", "UNKNOWN", "UNKNOWN", A0E, null, null, null, "", "", singleton, null, null, null, null)), System.currentTimeMillis(), null, MessageType$Companion.AVAILABLE_INIT_REQUEST, null);
    }
}
