package com.shopify.checkout.models.errors;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71797X4y;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes11.dex */
public final class ParsableInternalErrorCode {
    public static final InterfaceC09390do A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ParsableInternalErrorCode[] A02;
    public static final ParsableInternalErrorCode A03;
    public static final Companion Companion;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) ParsableInternalErrorCode.A00.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.shopify.checkout.models.errors.ParsableInternalErrorCode$Companion] */
    static {
        ParsableInternalErrorCode parsableInternalErrorCode = new ParsableInternalErrorCode();
        A03 = parsableInternalErrorCode;
        ParsableInternalErrorCode[] parsableInternalErrorCodeArr = {parsableInternalErrorCode};
        A02 = parsableInternalErrorCodeArr;
        A01 = AbstractC12190kN.A00(parsableInternalErrorCodeArr);
        Companion = new Object();
        A00 = AbstractC09440dt.A00(EnumC09460dv.A03, C71797X4y.A00);
    }

    public static ParsableInternalErrorCode valueOf(String str) {
        return (ParsableInternalErrorCode) Enum.valueOf(ParsableInternalErrorCode.class, str);
    }

    public static ParsableInternalErrorCode[] values() {
        return (ParsableInternalErrorCode[]) A02.clone();
    }
}
