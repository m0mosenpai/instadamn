package com.facebookpay.offsite.models.message;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PaymentDataErrorField {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ PaymentDataErrorField[] $VALUES;
    public static final PaymentDataErrorField city = new PaymentDataErrorField(ServerW3CShippingAddressConstants.CITY, 0);
    public static final PaymentDataErrorField country = new PaymentDataErrorField("country", 1);
    public static final PaymentDataErrorField dependentLocality = new PaymentDataErrorField("dependentLocality", 2);
    public static final PaymentDataErrorField organization = new PaymentDataErrorField("organization", 3);
    public static final PaymentDataErrorField postalCode = new PaymentDataErrorField("postalCode", 4);
    public static final PaymentDataErrorField recipient = new PaymentDataErrorField("recipient", 5);
    public static final PaymentDataErrorField region = new PaymentDataErrorField(ServerW3CShippingAddressConstants.REGION, 6);
    public static final PaymentDataErrorField sortingCode = new PaymentDataErrorField("sortingCode", 7);
    public static final PaymentDataErrorField addressLine = new PaymentDataErrorField("addressLine", 8);
    public static final PaymentDataErrorField payerPhone = new PaymentDataErrorField("payerPhone", 9);
    public static final PaymentDataErrorField payerEmail = new PaymentDataErrorField("payerEmail", 10);
    public static final PaymentDataErrorField offers = new PaymentDataErrorField("offers", 11);
    public static final PaymentDataErrorField shippingOptionId = new PaymentDataErrorField("shippingOptionId", 12);
    public static final PaymentDataErrorField unknown = new PaymentDataErrorField("unknown", 13);

    public static final /* synthetic */ PaymentDataErrorField[] $values() {
        return new PaymentDataErrorField[]{city, country, dependentLocality, organization, postalCode, recipient, region, sortingCode, addressLine, payerPhone, payerEmail, offers, shippingOptionId, unknown};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        PaymentDataErrorField[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static PaymentDataErrorField valueOf(String str) {
        return (PaymentDataErrorField) Enum.valueOf(PaymentDataErrorField.class, str);
    }

    public static PaymentDataErrorField[] values() {
        return (PaymentDataErrorField[]) $VALUES.clone();
    }

    public PaymentDataErrorField(String str, int i) {
    }
}
