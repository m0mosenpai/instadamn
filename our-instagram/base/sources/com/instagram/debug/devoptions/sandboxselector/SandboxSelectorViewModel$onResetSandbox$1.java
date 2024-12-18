package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C69749Vuj;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$onResetSandbox$1", f = "SandboxSelectorViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class SandboxSelectorViewModel$onResetSandbox$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ SandboxSelectorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxSelectorViewModel$onResetSandbox$1(SandboxSelectorViewModel sandboxSelectorViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = sandboxSelectorViewModel;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new SandboxSelectorViewModel$onResetSandbox$1(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new SandboxSelectorViewModel$onResetSandbox$1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i;
        C1JX c1jx = C1JX.A02;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            if (C14360o3.A0K(this.this$0.repository.getCurrentSandbox().url, "i.instagram.com")) {
                i = 2131958366;
            } else {
                this.this$0.repository.resetToDefaultSandbox();
                i = 2131958367;
            }
            InterfaceC24731Iq interfaceC24731Iq = this.this$0._toasts;
            C69749Vuj c69749Vuj = new C69749Vuj(new Object[0], i);
            this.label = 1;
            if (interfaceC24731Iq.EMz(c69749Vuj, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
