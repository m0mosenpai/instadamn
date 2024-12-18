package com.shopify.checkout.models.errors;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71794X4v;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = CheckoutErrorTypeSerializer.class)
/* loaded from: classes11.dex */
public final class CheckoutErrorType {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CheckoutErrorType[] A03;
    public static final CheckoutErrorType A04;
    public static final CheckoutErrorType A05;
    public static final CheckoutErrorType A06;
    public static final CheckoutErrorType A07;
    public static final CheckoutErrorType A08;
    public static final CheckoutErrorType A09;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) CheckoutErrorType.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.shopify.checkout.models.errors.CheckoutErrorType$Companion] */
    static {
        CheckoutErrorType checkoutErrorType = new CheckoutErrorType("Inventory", 0, "inventory");
        A06 = checkoutErrorType;
        CheckoutErrorType checkoutErrorType2 = new CheckoutErrorType("Payment", 1, "payment");
        A09 = checkoutErrorType2;
        CheckoutErrorType checkoutErrorType3 = new CheckoutErrorType("Other", 2, "other");
        A08 = checkoutErrorType3;
        CheckoutErrorType checkoutErrorType4 = new CheckoutErrorType("Discount", 3, "discount");
        A05 = checkoutErrorType4;
        CheckoutErrorType checkoutErrorType5 = new CheckoutErrorType("Order", 4, "order");
        A07 = checkoutErrorType5;
        CheckoutErrorType checkoutErrorType6 = new CheckoutErrorType("CustomerPersistence", 5, "customer_persistence");
        A04 = checkoutErrorType6;
        CheckoutErrorType[] checkoutErrorTypeArr = {checkoutErrorType, checkoutErrorType2, checkoutErrorType3, checkoutErrorType4, checkoutErrorType5, checkoutErrorType6, new CheckoutErrorType("CheckoutBlocking", 6, "checkout_blocking")};
        A03 = checkoutErrorTypeArr;
        A02 = AbstractC12190kN.A00(checkoutErrorTypeArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, C71794X4v.A00);
    }

    public static CheckoutErrorType valueOf(String str) {
        return (CheckoutErrorType) Enum.valueOf(CheckoutErrorType.class, str);
    }

    public static CheckoutErrorType[] values() {
        return (CheckoutErrorType[]) A03.clone();
    }

    public CheckoutErrorType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
