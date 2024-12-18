package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$viewState$3", f = "SandboxSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class SandboxSelectorViewModel$viewState$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ SandboxSelectorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxSelectorViewModel$viewState$3(SandboxSelectorViewModel sandboxSelectorViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = sandboxSelectorViewModel;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new SandboxSelectorViewModel$viewState$3(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return new SandboxSelectorViewModel$viewState$3(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            SandboxSelectorViewModel sandboxSelectorViewModel = this.this$0;
            sandboxSelectorViewModel.logger.enter(sandboxSelectorViewModel.repository.getCurrentSandbox());
            return C0eB.A00;
        }
        throw AbstractC166987dD.A13();
    }
}
