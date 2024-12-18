package com.shopify.checkout.models.errors.violations;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.X54;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = ViolationErrorTypeSerializer.class)
/* loaded from: classes11.dex */
public final class ViolationErrorType {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ViolationErrorType[] A03;
    public static final ViolationErrorType A04;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) ViolationErrorType.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.shopify.checkout.models.errors.violations.ViolationErrorType$Companion] */
    static {
        ViolationErrorType violationErrorType = new ViolationErrorType("Delivery", 0, "delivery");
        A04 = violationErrorType;
        ViolationErrorType[] violationErrorTypeArr = {violationErrorType, new ViolationErrorType("Inventory", 1, "inventory")};
        A03 = violationErrorTypeArr;
        A02 = AbstractC12190kN.A00(violationErrorTypeArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, X54.A00);
    }

    public static ViolationErrorType valueOf(String str) {
        return (ViolationErrorType) Enum.valueOf(ViolationErrorType.class, str);
    }

    public static ViolationErrorType[] values() {
        return (ViolationErrorType[]) A03.clone();
    }

    public ViolationErrorType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
