package com.instagram.debug.devoptions.direct.burner;

import X.AbstractC31232DoF;
import X.C0YY;
import X.C16930sl;
import X.InterfaceC16820sZ;
import X.InterfaceC83703oF;
import X.InterfaceC83713oG;

/* loaded from: classes6.dex */
public final class BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC83703oF $threadTarget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$1(InterfaceC83703oF interfaceC83703oF) {
        super(0);
        this.$threadTarget = interfaceC83703oF;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC83713oG invoke() {
        InterfaceC83703oF interfaceC83703oF = this.$threadTarget;
        if (interfaceC83703oF == null) {
            return AbstractC31232DoF.A00(null, C16930sl.A00);
        }
        return interfaceC83703oF;
    }
}
