package com.instagram.debug.devoptions.sandboxselector;

import X.C06840Yb;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;

/* loaded from: classes11.dex */
public final /* synthetic */ class SandboxSelectorViewModel$connectionHealth$2 extends C06840Yb implements InterfaceC16610sE {
    public static final SandboxSelectorViewModel$connectionHealth$2 INSTANCE = new SandboxSelectorViewModel$connectionHealth$2();

    public SandboxSelectorViewModel$connectionHealth$2() {
        super(3, SandboxSelectorViewModel.ViewState.ConnectionHealth.class, "<init>", "<init>(Lcom/instagram/debug/devoptions/sandboxselector/IgServerHealth;Lcom/instagram/debug/devoptions/sandboxselector/CorpnetStatus;)V", 4);
    }

    @Override // X.InterfaceC16610sE
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new SandboxSelectorViewModel.ViewState.ConnectionHealth((IgServerHealth) obj, (CorpnetStatus) obj2);
    }

    public final Object invoke(IgServerHealth igServerHealth, CorpnetStatus corpnetStatus, InterfaceC23621Ds interfaceC23621Ds) {
        return new SandboxSelectorViewModel.ViewState.ConnectionHealth(igServerHealth, corpnetStatus);
    }
}
