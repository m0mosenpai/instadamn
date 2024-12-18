package com.shopify.checkout.models.errors;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71796X4x;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = ErrorGroupSerializer.class)
/* loaded from: classes11.dex */
public final class ErrorGroup {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ErrorGroup[] A03;
    public static final ErrorGroup A04;
    public static final ErrorGroup A05;
    public static final ErrorGroup A06;
    public static final ErrorGroup A07;
    public static final ErrorGroup A08;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) ErrorGroup.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.shopify.checkout.models.errors.ErrorGroup$Companion, java.lang.Object] */
    static {
        ErrorGroup errorGroup = new ErrorGroup("Violation", 0, "violation");
        A08 = errorGroup;
        ErrorGroup errorGroup2 = new ErrorGroup("Checkout", 1, "checkout");
        A04 = errorGroup2;
        ErrorGroup errorGroup3 = new ErrorGroup("Internal", 2, "internal");
        A06 = errorGroup3;
        ErrorGroup errorGroup4 = new ErrorGroup("VaultedPayment", 3, "vaulted_payment");
        A07 = errorGroup4;
        ErrorGroup errorGroup5 = new ErrorGroup("Defaults", 4, "defaults");
        A05 = errorGroup5;
        ErrorGroup[] errorGroupArr = {errorGroup, errorGroup2, errorGroup3, errorGroup4, errorGroup5, new ErrorGroup("Unrecoverable", 5, "unrecoverable")};
        A03 = errorGroupArr;
        A02 = AbstractC12190kN.A00(errorGroupArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, C71796X4x.A00);
    }

    public static ErrorGroup valueOf(String str) {
        return (ErrorGroup) Enum.valueOf(ErrorGroup.class, str);
    }

    public static ErrorGroup[] values() {
        return (ErrorGroup[]) A03.clone();
    }

    public ErrorGroup(String str, int i, String str2) {
        this.A00 = str2;
    }
}
