package com.instagram.debug.devoptions.sandboxselector;

import X.C06840Yb;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class SandboxSelectorViewModel$sandboxes$2 extends C06840Yb implements InterfaceC16610sE {
    public static final SandboxSelectorViewModel$sandboxes$2 INSTANCE = new SandboxSelectorViewModel$sandboxes$2();

    public SandboxSelectorViewModel$sandboxes$2() {
        super(3, SandboxSelectorViewModel.ViewState.Sandboxes.class, "<init>", "<init>(Lcom/instagram/debug/devoptions/sandboxselector/Sandbox;Ljava/util/List;)V", 4);
    }

    @Override // X.InterfaceC16610sE
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new SandboxSelectorViewModel.ViewState.Sandboxes((Sandbox) obj, (List) obj2);
    }

    public final Object invoke(Sandbox sandbox, List list, InterfaceC23621Ds interfaceC23621Ds) {
        return new SandboxSelectorViewModel.ViewState.Sandboxes(sandbox, list);
    }
}
