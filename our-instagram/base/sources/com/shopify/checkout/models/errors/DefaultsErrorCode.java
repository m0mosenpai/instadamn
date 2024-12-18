package com.shopify.checkout.models.errors;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71795X4w;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = DefaultsErrorCodeSerializer.class)
/* loaded from: classes11.dex */
public final class DefaultsErrorCode {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DefaultsErrorCode[] A03;
    public static final DefaultsErrorCode A04;
    public static final DefaultsErrorCode A05;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) DefaultsErrorCode.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.shopify.checkout.models.errors.DefaultsErrorCode$Companion] */
    static {
        DefaultsErrorCode defaultsErrorCode = new DefaultsErrorCode("EmptyDefaults", 0, "empty_defaults");
        A04 = defaultsErrorCode;
        DefaultsErrorCode defaultsErrorCode2 = new DefaultsErrorCode("NonUniqueAddressReferenceIds", 1, "non_unique_address_reference_ids");
        A05 = defaultsErrorCode2;
        DefaultsErrorCode[] defaultsErrorCodeArr = {defaultsErrorCode, defaultsErrorCode2, new DefaultsErrorCode("AddressMissingCountry", 2, "partial_address_missing_country_code")};
        A03 = defaultsErrorCodeArr;
        A02 = AbstractC12190kN.A00(defaultsErrorCodeArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, C71795X4w.A00);
    }

    public static DefaultsErrorCode valueOf(String str) {
        return (DefaultsErrorCode) Enum.valueOf(DefaultsErrorCode.class, str);
    }

    public static DefaultsErrorCode[] values() {
        return (DefaultsErrorCode[]) A03.clone();
    }

    public DefaultsErrorCode(String str, int i, String str2) {
        this.A00 = str2;
    }
}
