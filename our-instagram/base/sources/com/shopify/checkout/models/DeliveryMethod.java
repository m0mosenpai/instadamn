package com.shopify.checkout.models;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71790X4r;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = DeliveryMethodSerializer.class)
/* loaded from: classes11.dex */
public final class DeliveryMethod {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DeliveryMethod[] A03;
    public static final DeliveryMethod A04;
    public static final DeliveryMethod A05;
    public static final DeliveryMethod A06;
    public static final DeliveryMethod A07;
    public static final DeliveryMethod A08;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) DeliveryMethod.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.shopify.checkout.models.DeliveryMethod$Companion, java.lang.Object] */
    static {
        DeliveryMethod deliveryMethod = new DeliveryMethod("Shipping", 0, "SHIPPING");
        A08 = deliveryMethod;
        DeliveryMethod deliveryMethod2 = new DeliveryMethod("Pickup", 1, "PICK_UP");
        A05 = deliveryMethod2;
        DeliveryMethod deliveryMethod3 = new DeliveryMethod("Local", 2, "LOCAL");
        A04 = deliveryMethod3;
        DeliveryMethod deliveryMethod4 = new DeliveryMethod("PickupPoint", 3, "PICKUP_POINT");
        A06 = deliveryMethod4;
        DeliveryMethod deliveryMethod5 = new DeliveryMethod("Retail", 4, "RETAIL");
        A07 = deliveryMethod5;
        DeliveryMethod[] deliveryMethodArr = {deliveryMethod, deliveryMethod2, deliveryMethod3, deliveryMethod4, deliveryMethod5, new DeliveryMethod("None", 5, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)};
        A03 = deliveryMethodArr;
        A02 = AbstractC12190kN.A00(deliveryMethodArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, C71790X4r.A00);
    }

    public static DeliveryMethod valueOf(String str) {
        return (DeliveryMethod) Enum.valueOf(DeliveryMethod.class, str);
    }

    public static DeliveryMethod[] values() {
        return (DeliveryMethod[]) A03.clone();
    }

    public DeliveryMethod(String str, int i, String str2) {
        this.A00 = str2;
    }
}
