package com.shopify.checkout.models.errors;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.X50;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = UnrecoverableErrorCodeSerializer.class)
/* loaded from: classes11.dex */
public final class UnrecoverableErrorCode {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UnrecoverableErrorCode[] A03;
    public static final UnrecoverableErrorCode A04;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) UnrecoverableErrorCode.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.shopify.checkout.models.errors.UnrecoverableErrorCode$Companion] */
    static {
        UnrecoverableErrorCode unrecoverableErrorCode = new UnrecoverableErrorCode("SdkNotEnabled", 0, "sdk_not_enabled");
        A04 = unrecoverableErrorCode;
        UnrecoverableErrorCode[] unrecoverableErrorCodeArr = {unrecoverableErrorCode, new UnrecoverableErrorCode("InvalidCheckoutUrl", 1, "invalid_checkout_url")};
        A03 = unrecoverableErrorCodeArr;
        A02 = AbstractC12190kN.A00(unrecoverableErrorCodeArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, X50.A00);
    }

    public static UnrecoverableErrorCode valueOf(String str) {
        return (UnrecoverableErrorCode) Enum.valueOf(UnrecoverableErrorCode.class, str);
    }

    public static UnrecoverableErrorCode[] values() {
        return (UnrecoverableErrorCode[]) A03.clone();
    }

    public UnrecoverableErrorCode(String str, int i, String str2) {
        this.A00 = str2;
    }
}
