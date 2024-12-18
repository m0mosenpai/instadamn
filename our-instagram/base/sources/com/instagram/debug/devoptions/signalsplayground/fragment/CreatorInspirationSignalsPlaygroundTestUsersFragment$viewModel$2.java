package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC166987dD;
import X.C0YY;
import X.InterfaceC16820sZ;
import X.InterfaceC52932ba;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundTestUsersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2(CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment) {
        super(0);
        this.this$0 = creatorInspirationSignalsPlaygroundTestUsersFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC52932ba invoke() {
        return new CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.Factory(AbstractC166987dD.A0r(this.this$0.session$delegate));
    }
}
