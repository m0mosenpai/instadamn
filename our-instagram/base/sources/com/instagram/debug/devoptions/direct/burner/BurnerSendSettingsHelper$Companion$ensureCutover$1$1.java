package com.instagram.debug.devoptions.direct.burner;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.C0YY;
import X.C0eB;
import X.C161867Mw;
import X.C2EC;
import X.InterfaceC16660sJ;

/* loaded from: classes6.dex */
public final class BurnerSendSettingsHelper$Companion$ensureCutover$1$1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ InterfaceC16660sJ $callback;
    public final /* synthetic */ C2EC $directThread;
    public final /* synthetic */ boolean $isTLC;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BurnerSendSettingsHelper$Companion$ensureCutover$1$1(InterfaceC16660sJ interfaceC16660sJ, C2EC c2ec, boolean z) {
        super(1);
        this.$callback = interfaceC16660sJ;
        this.$directThread = c2ec;
        this.$isTLC = z;
    }

    public final void invoke(boolean z) {
        AbstractC25227BEk.A1Q(this.$callback, AbstractC167007dF.A1P(C161867Mw.A02(this.$directThread.Aic()) ? 1 : 0, this.$isTLC ? 1 : 0));
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(AbstractC166987dD.A1a(obj));
        return C0eB.A00;
    }
}
