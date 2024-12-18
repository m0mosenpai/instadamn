package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC166987dD;
import X.C0YY;
import X.InterfaceC16820sZ;
import X.InterfaceC52932ba;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragment$viewModel$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$viewModel$2(RepositoryInfoFragment repositoryInfoFragment) {
        super(0);
        this.this$0 = repositoryInfoFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC52932ba invoke() {
        return new RepositoryInfoViewModel.Factory(AbstractC166987dD.A0r(this.this$0.session$delegate));
    }
}
