package com.instagram.debug.devoptions.direct.burner;

import X.C00O;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16660sJ;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig;

/* loaded from: classes6.dex */
public final class BurnerSendThreadDetailsFragment$onViewCreated$2 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ BurnerSendThreadDetailsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BurnerSendThreadDetailsFragment$onViewCreated$2(BurnerSendThreadDetailsFragment burnerSendThreadDetailsFragment) {
        super(1);
        this.this$0 = burnerSendThreadDetailsFragment;
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
