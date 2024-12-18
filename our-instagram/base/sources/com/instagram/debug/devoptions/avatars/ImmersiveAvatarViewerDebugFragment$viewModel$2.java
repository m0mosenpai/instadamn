package com.instagram.debug.devoptions.avatars;

import X.AbstractC166987dD;
import X.C0YY;
import X.InterfaceC16820sZ;
import X.InterfaceC52932ba;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel;

/* loaded from: classes8.dex */
public final class ImmersiveAvatarViewerDebugFragment$viewModel$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ImmersiveAvatarViewerDebugFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmersiveAvatarViewerDebugFragment$viewModel$2(ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment) {
        super(0);
        this.this$0 = immersiveAvatarViewerDebugFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final InterfaceC52932ba invoke() {
        return new ImmersiveAvatarViewerEffectConfigViewModel.Factory(AbstractC166987dD.A0r(this.this$0.session$delegate));
    }
}
