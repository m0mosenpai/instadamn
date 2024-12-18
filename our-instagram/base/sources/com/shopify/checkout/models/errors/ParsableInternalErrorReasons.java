package com.shopify.checkout.models.errors;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71798X4z;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes11.dex */
public final class ParsableInternalErrorReasons {
    public static final InterfaceC09390do A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ParsableInternalErrorReasons[] A02;
    public static final ParsableInternalErrorReasons A03;
    public static final Companion Companion;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) ParsableInternalErrorReasons.A00.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.shopify.checkout.models.errors.ParsableInternalErrorReasons$Companion, java.lang.Object] */
    static {
        ParsableInternalErrorReasons parsableInternalErrorReasons = new ParsableInternalErrorReasons();
        A03 = parsableInternalErrorReasons;
        ParsableInternalErrorReasons[] parsableInternalErrorReasonsArr = {parsableInternalErrorReasons};
        A02 = parsableInternalErrorReasonsArr;
        A01 = AbstractC12190kN.A00(parsableInternalErrorReasonsArr);
        Companion = new Object();
        A00 = AbstractC09440dt.A00(EnumC09460dv.A03, C71798X4z.A00);
    }

    public static ParsableInternalErrorReasons valueOf(String str) {
        return (ParsableInternalErrorReasons) Enum.valueOf(ParsableInternalErrorReasons.class, str);
    }

    public static ParsableInternalErrorReasons[] values() {
        return (ParsableInternalErrorReasons[]) A02.clone();
    }
}
