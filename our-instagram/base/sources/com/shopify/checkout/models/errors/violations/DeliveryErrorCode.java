package com.shopify.checkout.models.errors.violations;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.X52;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = DeliveryErrorCodeSerializer.class)
/* loaded from: classes11.dex */
public final class DeliveryErrorCode {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DeliveryErrorCode[] A03;
    public static final Companion Companion;
    public final String A00 = "unshippable_product";

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) DeliveryErrorCode.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.shopify.checkout.models.errors.violations.DeliveryErrorCode$Companion, java.lang.Object] */
    static {
        DeliveryErrorCode[] deliveryErrorCodeArr = {new DeliveryErrorCode()};
        A03 = deliveryErrorCodeArr;
        A02 = AbstractC12190kN.A00(deliveryErrorCodeArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, X52.A00);
    }

    public static DeliveryErrorCode valueOf(String str) {
        return (DeliveryErrorCode) Enum.valueOf(DeliveryErrorCode.class, str);
    }

    public static DeliveryErrorCode[] values() {
        return (DeliveryErrorCode[]) A03.clone();
    }
}
