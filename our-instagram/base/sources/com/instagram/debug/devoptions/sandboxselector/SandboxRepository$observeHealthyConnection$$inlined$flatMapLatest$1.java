package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC18560vj;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.InterfaceC16610sE;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1", f = "SandboxRepository.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ SandboxRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1(InterfaceC23621Ds interfaceC23621Ds, SandboxRepository sandboxRepository) {
        super(3, interfaceC23621Ds);
        this.this$0 = sandboxRepository;
    }

    @Override // X.InterfaceC16610sE
    public final Object invoke(InterfaceC19960yQ interfaceC19960yQ, Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1 sandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1 = new SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1(interfaceC23621Ds, this.this$0);
        sandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1.L$0 = interfaceC19960yQ;
        sandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1.L$1 = obj;
        return sandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19390xP observeServerHealth;
        C1JX c1jx = C1JX.A02;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.L$0;
            observeServerHealth = this.this$0.observeServerHealth();
            this.label = 1;
            if (AbstractC18560vj.A02(this, observeServerHealth, interfaceC19960yQ) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
