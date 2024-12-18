package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC31177DnL;
import X.C0eB;
import X.C69749Vuj;
import X.C9GR;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.VSL;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$onViewCreated$1$2", f = "SandboxSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class SandboxSelectorFragment$onViewCreated$1$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SandboxSelectorFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxSelectorFragment$onViewCreated$1$2(SandboxSelectorFragment sandboxSelectorFragment, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = sandboxSelectorFragment;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        SandboxSelectorFragment$onViewCreated$1$2 sandboxSelectorFragment$onViewCreated$1$2 = new SandboxSelectorFragment$onViewCreated$1$2(this.this$0, interfaceC23621Ds);
        sandboxSelectorFragment$onViewCreated$1$2.L$0 = obj;
        return sandboxSelectorFragment$onViewCreated$1$2;
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C69749Vuj c69749Vuj, InterfaceC23621Ds interfaceC23621Ds) {
        return ((SandboxSelectorFragment$onViewCreated$1$2) create(c69749Vuj, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            C69749Vuj c69749Vuj = (C69749Vuj) this.L$0;
            Context requireContext = this.this$0.requireContext();
            SandboxSelectorFragment sandboxSelectorFragment = this.this$0;
            AbstractC167017dG.A1N(sandboxSelectorFragment, c69749Vuj);
            C9GR.A09(requireContext, VSL.A00(AbstractC31177DnL.A09(sandboxSelectorFragment), c69749Vuj));
            return C0eB.A00;
        }
        throw AbstractC166987dD.A13();
    }
}
