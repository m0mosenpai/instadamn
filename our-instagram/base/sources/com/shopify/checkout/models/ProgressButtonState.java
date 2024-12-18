package com.shopify.checkout.models;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71793X4u;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;
import org.webrtc.PeerConnectionFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = ProgressButtonStateSerializer.class)
/* loaded from: classes11.dex */
public final class ProgressButtonState {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProgressButtonState[] A03;
    public static final ProgressButtonState A04;
    public static final ProgressButtonState A05;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) ProgressButtonState.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.shopify.checkout.models.ProgressButtonState$Companion, java.lang.Object] */
    static {
        ProgressButtonState progressButtonState = new ProgressButtonState("Loading", 0, "loading");
        A05 = progressButtonState;
        ProgressButtonState progressButtonState2 = new ProgressButtonState("Disabled", 1, "disabled");
        A04 = progressButtonState2;
        ProgressButtonState[] progressButtonStateArr = {progressButtonState, progressButtonState2, new ProgressButtonState(PeerConnectionFactory.TRIAL_ENABLED, 2, "enabled")};
        A03 = progressButtonStateArr;
        A02 = AbstractC12190kN.A00(progressButtonStateArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, C71793X4u.A00);
    }

    public static ProgressButtonState valueOf(String str) {
        return (ProgressButtonState) Enum.valueOf(ProgressButtonState.class, str);
    }

    public static ProgressButtonState[] values() {
        return (ProgressButtonState[]) A03.clone();
    }

    public ProgressButtonState(String str, int i, String str2) {
        this.A00 = str2;
    }
}
