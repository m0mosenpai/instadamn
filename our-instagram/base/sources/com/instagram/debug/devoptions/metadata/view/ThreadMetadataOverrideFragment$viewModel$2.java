package com.instagram.debug.devoptions.metadata.view;

import X.AbstractC166987dD;
import X.AbstractC2054897w;
import X.C0YY;
import X.InterfaceC16820sZ;
import X.InterfaceC52932ba;
import X.InterfaceC83713oG;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.viewmodel.ThreadMetadataOverrideViewModel;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideFragment$viewModel$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ThreadMetadataOverrideFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideFragment$viewModel$2(ThreadMetadataOverrideFragment threadMetadataOverrideFragment) {
        super(0);
        this.this$0 = threadMetadataOverrideFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC52932ba invoke() {
        InterfaceC83713oG interfaceC83713oG;
        UserSession A0r = AbstractC166987dD.A0r(this.this$0.session$delegate);
        Bundle bundle = this.this$0.mArguments;
        if (bundle != null) {
            interfaceC83713oG = AbstractC2054897w.A00(bundle, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        } else {
            interfaceC83713oG = null;
        }
        return new ThreadMetadataOverrideViewModel.Factory(A0r, interfaceC83713oG);
    }
}
