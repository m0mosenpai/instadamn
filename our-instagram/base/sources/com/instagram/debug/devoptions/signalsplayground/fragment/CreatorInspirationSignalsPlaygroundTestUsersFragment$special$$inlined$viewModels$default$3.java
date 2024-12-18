package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.C018307d;
import X.C0YY;
import X.InterfaceC018407e;
import X.InterfaceC09390do;
import X.InterfaceC16820sZ;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$3 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC09390do $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$3(InterfaceC09390do interfaceC09390do) {
        super(0);
        this.$owner$delegate = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final C018307d invoke() {
        return ((InterfaceC018407e) this.$owner$delegate.getValue()).getViewModelStore();
    }
}
