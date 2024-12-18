package com.instagram.debug.devoptions.sandboxselector;

import X.C06840Yb;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;

/* loaded from: classes11.dex */
public final /* synthetic */ class SandboxRepository$observeHealthyConnection$2 extends C06840Yb implements InterfaceC16620sF {
    public SandboxRepository$observeHealthyConnection$2(Object obj) {
        super(2, obj, SandboxPreferences.class, "updateServerHealthStatus", "updateServerHealthStatus(Lcom/instagram/debug/devoptions/sandboxselector/IgServerHealth;)V", 4);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(IgServerHealth igServerHealth, InterfaceC23621Ds interfaceC23621Ds) {
        ((SandboxPreferences) this.receiver).updateServerHealthStatus(igServerHealth);
        return C0eB.A00;
    }
}
