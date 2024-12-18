package com.shopify.checkout.models;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71791X4s;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;
import org.webrtc.PeerConnectionFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = PayButtonStateSerializer.class)
/* loaded from: classes11.dex */
public final class PayButtonState {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PayButtonState[] A03;
    public static final PayButtonState A04;
    public static final PayButtonState A05;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) PayButtonState.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.shopify.checkout.models.PayButtonState$Companion, java.lang.Object] */
    static {
        PayButtonState payButtonState = new PayButtonState("Loading", 0, "loading");
        A05 = payButtonState;
        PayButtonState payButtonState2 = new PayButtonState("Disabled", 1, "disabled");
        A04 = payButtonState2;
        PayButtonState[] payButtonStateArr = {payButtonState, payButtonState2, new PayButtonState(PeerConnectionFactory.TRIAL_ENABLED, 2, "enabled")};
        A03 = payButtonStateArr;
        A02 = AbstractC12190kN.A00(payButtonStateArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, C71791X4s.A00);
    }

    public static PayButtonState valueOf(String str) {
        return (PayButtonState) Enum.valueOf(PayButtonState.class, str);
    }

    public static PayButtonState[] values() {
        return (PayButtonState[]) A03.clone();
    }

    public PayButtonState(String str, int i, String str2) {
        this.A00 = str2;
    }
}
