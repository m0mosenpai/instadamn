package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC166987dD;
import X.C0YY;
import X.InterfaceC16820sZ;
import X.InterfaceC52932ba;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundSignalsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2(CreatorInspirationSignalsPlaygroundSignalsFragment creatorInspirationSignalsPlaygroundSignalsFragment) {
        super(0);
        this.this$0 = creatorInspirationSignalsPlaygroundSignalsFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC52932ba invoke() {
        return new CreatorInspirationSignalsPlaygroundSignalsViewModel.Factory(AbstractC166987dD.A0r(this.this$0.session$delegate));
    }
}
