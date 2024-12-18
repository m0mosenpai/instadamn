package com.instagram.debug.devoptions.metadata.view;

import X.C0YY;
import X.C0eB;
import X.C16930sl;
import X.InterfaceC16660sJ;
import X.MXS;
import com.instagram.debug.devoptions.metadata.viewmodel.ThreadMetadataOverrideViewModel;
import java.util.List;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideFragment$onViewCreated$1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ ThreadMetadataOverrideFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideFragment$onViewCreated$1(ThreadMetadataOverrideFragment threadMetadataOverrideFragment) {
        super(1);
        this.this$0 = threadMetadataOverrideFragment;
    }

    public final void invoke(ThreadMetadataOverrideViewModel.ViewState viewState) {
        ThreadMetadataOverrideFragment threadMetadataOverrideFragment;
        MXS mxs;
        List list;
        if (viewState instanceof ThreadMetadataOverrideViewModel.ViewState.Loading) {
            threadMetadataOverrideFragment = this.this$0;
            mxs = MXS.A04;
        } else {
            boolean z = viewState instanceof ThreadMetadataOverrideViewModel.ViewState.Success;
            threadMetadataOverrideFragment = this.this$0;
            if (z) {
                mxs = MXS.A03;
                list = ((ThreadMetadataOverrideViewModel.ViewState.Success) viewState).items;
                threadMetadataOverrideFragment.updateUi(mxs, list);
            }
            mxs = MXS.A02;
        }
        list = C16930sl.A00;
        threadMetadataOverrideFragment.updateUi(mxs, list);
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ThreadMetadataOverrideViewModel.ViewState) obj);
        return C0eB.A00;
    }
}
