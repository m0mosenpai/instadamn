package com.instagram.debug.devoptions.section.xme;

import X.AbstractC166987dD;
import X.C0YY;
import X.InterfaceC16820sZ;
import X.InterfaceC52932ba;
import com.instagram.debug.devoptions.section.xme.Xme3dViewModel;

/* loaded from: classes5.dex */
public final class Xme3dViewerFragment$viewModel$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Xme3dViewerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xme3dViewerFragment$viewModel$2(Xme3dViewerFragment xme3dViewerFragment) {
        super(0);
        this.this$0 = xme3dViewerFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC52932ba invoke() {
        return new Xme3dViewModel.Factory(AbstractC166987dD.A0r(this.this$0.session$delegate));
    }
}
