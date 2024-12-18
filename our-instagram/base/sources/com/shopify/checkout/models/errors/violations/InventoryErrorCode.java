package com.shopify.checkout.models.errors.violations;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.X53;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = InventoryErrorCodeSerializer.class)
/* loaded from: classes11.dex */
public final class InventoryErrorCode {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ InventoryErrorCode[] A03;
    public static final InventoryErrorCode A04;
    public static final InventoryErrorCode A05;
    public static final InventoryErrorCode A06;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) InventoryErrorCode.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.shopify.checkout.models.errors.violations.InventoryErrorCode$Companion, java.lang.Object] */
    static {
        InventoryErrorCode inventoryErrorCode = new InventoryErrorCode("InsufficientQuantity", 0, "insufficient_quantity");
        A04 = inventoryErrorCode;
        InventoryErrorCode inventoryErrorCode2 = new InventoryErrorCode("OutOfStock", 1, "out_of_stock");
        A05 = inventoryErrorCode2;
        InventoryErrorCode inventoryErrorCode3 = new InventoryErrorCode("UnavailableProduct", 2, "unavailable_product");
        A06 = inventoryErrorCode3;
        InventoryErrorCode[] inventoryErrorCodeArr = {inventoryErrorCode, inventoryErrorCode2, inventoryErrorCode3, new InventoryErrorCode("UnpurchasableProduct", 3, "unpurchasable_product")};
        A03 = inventoryErrorCodeArr;
        A02 = AbstractC12190kN.A00(inventoryErrorCodeArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, X53.A00);
    }

    public static InventoryErrorCode valueOf(String str) {
        return (InventoryErrorCode) Enum.valueOf(InventoryErrorCode.class, str);
    }

    public static InventoryErrorCode[] values() {
        return (InventoryErrorCode[]) A03.clone();
    }

    public InventoryErrorCode(String str, int i, String str2) {
        this.A00 = str2;
    }
}
