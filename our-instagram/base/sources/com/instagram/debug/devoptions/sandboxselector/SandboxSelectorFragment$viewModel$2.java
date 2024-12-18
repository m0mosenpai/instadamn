package com.instagram.debug.devoptions.sandboxselector;

import X.C00O;
import X.C0YY;
import X.C14360o3;
import X.InterfaceC16820sZ;
import X.InterfaceC52932ba;
import X.MTJ;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;

/* loaded from: classes11.dex */
public final class SandboxSelectorFragment$viewModel$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ SandboxSelectorFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxSelectorFragment$viewModel$2(SandboxSelectorFragment sandboxSelectorFragment) {
        super(0);
        this.this$0 = sandboxSelectorFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC52932ba invoke() {
        UserSession session = this.this$0.getSession();
        MTJ mtj = this.this$0.navigationPerfLogger;
        if (mtj == null) {
            C14360o3.A0F("navigationPerfLogger");
            throw C00O.createAndThrow();
        }
        return new SandboxSelectorViewModel.Factory(session, "sandbox_selector", mtj);
    }
}
