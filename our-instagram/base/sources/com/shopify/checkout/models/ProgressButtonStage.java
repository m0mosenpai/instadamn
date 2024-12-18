package com.shopify.checkout.models;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71792X4t;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = ProgressButtonStageSerializer.class)
/* loaded from: classes11.dex */
public final class ProgressButtonStage {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProgressButtonStage[] A03;
    public static final ProgressButtonStage A04;
    public static final ProgressButtonStage A05;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) ProgressButtonStage.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.shopify.checkout.models.ProgressButtonStage$Companion, java.lang.Object] */
    static {
        ProgressButtonStage progressButtonStage = new ProgressButtonStage("ConfirmShipping", 0, "confirmShipping");
        A04 = progressButtonStage;
        ProgressButtonStage progressButtonStage2 = new ProgressButtonStage("Review", 1, "review");
        A05 = progressButtonStage2;
        ProgressButtonStage[] progressButtonStageArr = {progressButtonStage, progressButtonStage2, new ProgressButtonStage("Pay", 2, "pay")};
        A03 = progressButtonStageArr;
        A02 = AbstractC12190kN.A00(progressButtonStageArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, C71792X4t.A00);
    }

    public static ProgressButtonStage valueOf(String str) {
        return (ProgressButtonStage) Enum.valueOf(ProgressButtonStage.class, str);
    }

    public static ProgressButtonStage[] values() {
        return (ProgressButtonStage[]) A03.clone();
    }

    public ProgressButtonStage(String str, int i, String str2) {
        this.A00 = str2;
    }
}
