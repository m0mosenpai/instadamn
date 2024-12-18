package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeSandboxes$1", f = "SandboxRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class SandboxRepository$observeSandboxes$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public SandboxRepository$observeSandboxes$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16610sE
    public final Object invoke(List list, String str, InterfaceC23621Ds interfaceC23621Ds) {
        SandboxRepository$observeSandboxes$1 sandboxRepository$observeSandboxes$1 = new SandboxRepository$observeSandboxes$1(interfaceC23621Ds);
        sandboxRepository$observeSandboxes$1.L$0 = list;
        sandboxRepository$observeSandboxes$1.L$1 = str;
        return sandboxRepository$observeSandboxes$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            return SandboxDataModelConverterKt.toSandboxes((List) this.L$0, (String) this.L$1, "i.instagram.com");
        }
        throw AbstractC166987dD.A13();
    }
}
