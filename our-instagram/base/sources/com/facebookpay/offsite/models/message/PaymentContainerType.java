package com.facebookpay.offsite.models.message;

import X.AbstractC12190kN;
import X.C14360o3;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PaymentContainerType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ PaymentContainerType[] $VALUES;
    public static final Companion Companion;
    public final String type;

    @SerializedName("basic-card-v1")
    public static final PaymentContainerType BASIC_CARD_V1 = new PaymentContainerType("BASIC_CARD_V1", 0, "basic-card-v1");

    @SerializedName("ecom-token-v1")
    public static final PaymentContainerType ECOM_TOKEN_V1 = new PaymentContainerType("ECOM_TOKEN_V1", 1, "ecom-token-v1");

    @SerializedName("paypal-otc-v1")
    public static final PaymentContainerType PAYPAL_OTC_V1 = new PaymentContainerType("PAYPAL_OTC_V1", 2, "paypal-otc-v1");

    @SerializedName("firmly-token-v1")
    public static final PaymentContainerType FIRMLY_TOKEN_V1 = new PaymentContainerType("FIRMLY_TOKEN_V1", 3, "firmly-token-v1");

    public static final /* synthetic */ PaymentContainerType[] $values() {
        return new PaymentContainerType[]{BASIC_CARD_V1, ECOM_TOKEN_V1, PAYPAL_OTC_V1, FIRMLY_TOKEN_V1};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public final PaymentContainerType fromString(String str) {
            C14360o3.A0B(str, 0);
            for (PaymentContainerType paymentContainerType : PaymentContainerType.values()) {
                if (str.equals(paymentContainerType.getType())) {
                    return paymentContainerType;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebookpay.offsite.models.message.PaymentContainerType$Companion, java.lang.Object] */
    static {
        PaymentContainerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
        Companion = new Object();
    }

    public static PaymentContainerType valueOf(String str) {
        return (PaymentContainerType) Enum.valueOf(PaymentContainerType.class, str);
    }

    public static PaymentContainerType[] values() {
        return (PaymentContainerType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public PaymentContainerType(String str, int i, String str2) {
        this.type = str2;
    }
}
