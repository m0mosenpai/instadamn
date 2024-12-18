package com.instagram.debug.devoptions.direct.burner;

import X.C00O;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16660sJ;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig;

/* loaded from: classes6.dex */
public final class BurnerSendSettingsFragment$onViewCreated$4 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ BurnerSendSettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BurnerSendSettingsFragment$onViewCreated$4(BurnerSendSettingsFragment burnerSendSettingsFragment) {
        super(1);
        this.this$0 = burnerSendSettingsFragment;
    }

    public final void invoke(BurnerSendSettingsConfig.MessageType messageType) {
        C14360o3.A0B(messageType, 0);
        BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
        if (burnerSendSettingsConfig == null) {
            C14360o3.A0F("sendSettingsConfig");
            throw C00O.createAndThrow();
        }
        burnerSendSettingsConfig.messageType = messageType;
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BurnerSendSettingsConfig.MessageType) obj);
        return C0eB.A00;
    }
}
