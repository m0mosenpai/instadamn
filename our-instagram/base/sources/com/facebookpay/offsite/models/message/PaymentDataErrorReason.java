package com.facebookpay.offsite.models.message;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PaymentDataErrorReason {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ PaymentDataErrorReason[] $VALUES;
    public static final PaymentDataErrorReason INVALID_PAYMENT_DATA = new PaymentDataErrorReason("INVALID_PAYMENT_DATA", 0);
    public static final PaymentDataErrorReason INVALID_SHIPPING_ADDRESS = new PaymentDataErrorReason("INVALID_SHIPPING_ADDRESS", 1);
    public static final PaymentDataErrorReason OUT_OF_SERVICE_AREA = new PaymentDataErrorReason("OUT_OF_SERVICE_AREA", 2);
    public static final PaymentDataErrorReason GENERIC_FAILURE = new PaymentDataErrorReason("GENERIC_FAILURE", 3);
    public static final PaymentDataErrorReason TIMEOUT = new PaymentDataErrorReason("TIMEOUT", 4);
    public static final PaymentDataErrorReason OTHER_ERROR = new PaymentDataErrorReason("OTHER_ERROR", 5);
    public static final PaymentDataErrorReason INVALID_SHIPPING_OPTION = new PaymentDataErrorReason("INVALID_SHIPPING_OPTION", 6);
    public static final PaymentDataErrorReason INVALID_FULFILLMENT_OPTION = new PaymentDataErrorReason("INVALID_FULFILLMENT_OPTION", 7);
    public static final PaymentDataErrorReason INVALID_BILLING_ADDRESS = new PaymentDataErrorReason("INVALID_BILLING_ADDRESS", 8);
    public static final PaymentDataErrorReason INVALID_OFFER_CODE = new PaymentDataErrorReason("INVALID_OFFER_CODE", 9);
    public static final PaymentDataErrorReason PAYPAL_AUTHORIZATION_ERROR = new PaymentDataErrorReason("PAYPAL_AUTHORIZATION_ERROR", 10);

    public static final /* synthetic */ PaymentDataErrorReason[] $values() {
        return new PaymentDataErrorReason[]{INVALID_PAYMENT_DATA, INVALID_SHIPPING_ADDRESS, OUT_OF_SERVICE_AREA, GENERIC_FAILURE, TIMEOUT, OTHER_ERROR, INVALID_SHIPPING_OPTION, INVALID_FULFILLMENT_OPTION, INVALID_BILLING_ADDRESS, INVALID_OFFER_CODE, PAYPAL_AUTHORIZATION_ERROR};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        PaymentDataErrorReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static PaymentDataErrorReason valueOf(String str) {
        return (PaymentDataErrorReason) Enum.valueOf(PaymentDataErrorReason.class, str);
    }

    public static PaymentDataErrorReason[] values() {
        return (PaymentDataErrorReason[]) $VALUES.clone();
    }

    public PaymentDataErrorReason(String str, int i) {
    }
}
