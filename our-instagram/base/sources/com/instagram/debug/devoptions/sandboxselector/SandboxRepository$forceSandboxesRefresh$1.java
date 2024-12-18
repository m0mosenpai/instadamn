package com.instagram.debug.devoptions.sandboxselector;

import X.C1Dq;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxRepository", f = "SandboxRepository.kt", i = {0, 1, 1}, l = {60, 66}, m = "forceSandboxesRefresh", n = {"this", "this", "currentSandbox"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes11.dex */
public final class SandboxRepository$forceSandboxesRefresh$1 extends C1Dq {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SandboxRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxRepository$forceSandboxesRefresh$1(SandboxRepository sandboxRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.this$0 = sandboxRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.forceSandboxesRefresh(this);
    }
}
