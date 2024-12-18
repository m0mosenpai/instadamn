package com.instagram.debug.devoptions.metadata.view;

import X.C07N;
import X.C0YY;
import X.InterfaceC018407e;
import X.InterfaceC09390do;
import X.InterfaceC16820sZ;
import X.InterfaceC52932ba;
import androidx.fragment.app.Fragment;

/* loaded from: classes5.dex */
public final class ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$5 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC09390do $owner$delegate;
    public final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$5(Fragment fragment, InterfaceC09390do interfaceC09390do) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC52932ba invoke() {
        C07N c07n;
        InterfaceC52932ba defaultViewModelProviderFactory;
        InterfaceC018407e interfaceC018407e = (InterfaceC018407e) this.$owner$delegate.getValue();
        if (!(interfaceC018407e instanceof C07N) || (c07n = (C07N) interfaceC018407e) == null || (defaultViewModelProviderFactory = c07n.getDefaultViewModelProviderFactory()) == null) {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        return defaultViewModelProviderFactory;
    }
}
