package com.instagram.debug.devoptions.sandboxselector;

import X.C06840Yb;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;

/* loaded from: classes11.dex */
public final /* synthetic */ class SandboxSelectorViewModel$viewState$2 extends C06840Yb implements InterfaceC16590sC {
    public static final SandboxSelectorViewModel$viewState$2 INSTANCE = new SandboxSelectorViewModel$viewState$2();

    public SandboxSelectorViewModel$viewState$2() {
        super(5, SandboxSelectorViewModel.ViewState.class, "<init>", "<init>(Lcom/instagram/debug/devoptions/sandboxselector/SandboxSelectorViewModel$ViewState$Sandboxes;Lcom/instagram/debug/devoptions/sandboxselector/SandboxSelectorViewModel$ViewState$ConnectionHealth;ZLcom/instagram/debug/devoptions/sandboxselector/SandboxErrorInfo;)V", 4);
    }

    @Override // X.InterfaceC16590sC
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new SandboxSelectorViewModel.ViewState((SandboxSelectorViewModel.ViewState.Sandboxes) obj, (SandboxSelectorViewModel.ViewState.ConnectionHealth) obj2, ((Boolean) obj3).booleanValue(), (SandboxErrorInfo) obj4);
    }

    public final Object invoke(SandboxSelectorViewModel.ViewState.Sandboxes sandboxes, SandboxSelectorViewModel.ViewState.ConnectionHealth connectionHealth, boolean z, SandboxErrorInfo sandboxErrorInfo, InterfaceC23621Ds interfaceC23621Ds) {
        return new SandboxSelectorViewModel.ViewState(sandboxes, connectionHealth, z, sandboxErrorInfo);
    }
}
