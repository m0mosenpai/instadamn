package com.facebookpay.offsite.models.message;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PaymentUXFlags {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ PaymentUXFlags[] $VALUES;
    public static final PaymentUXFlags DISABLE_PROACTIVE_CHECKOUT = new PaymentUXFlags("DISABLE_PROACTIVE_CHECKOUT", 0);
    public static final PaymentUXFlags PIXEL_COOKIE_DETECTED = new PaymentUXFlags("PIXEL_COOKIE_DETECTED", 1);
    public static final PaymentUXFlags META_CHECKOUT = new PaymentUXFlags("META_CHECKOUT", 2);

    public static final /* synthetic */ PaymentUXFlags[] $values() {
        return new PaymentUXFlags[]{DISABLE_PROACTIVE_CHECKOUT, PIXEL_COOKIE_DETECTED, META_CHECKOUT};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        PaymentUXFlags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static PaymentUXFlags valueOf(String str) {
        return (PaymentUXFlags) Enum.valueOf(PaymentUXFlags.class, str);
    }

    public static PaymentUXFlags[] values() {
        return (PaymentUXFlags[]) $VALUES.clone();
    }

    public PaymentUXFlags(String str, int i) {
    }
}
