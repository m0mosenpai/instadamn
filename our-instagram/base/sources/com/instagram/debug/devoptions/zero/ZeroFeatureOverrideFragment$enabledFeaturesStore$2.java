package com.instagram.debug.devoptions.zero;

import X.C0YY;
import X.InterfaceC16820sZ;
import com.instagram.debug.devoptions.zero.ZeroFeatureOverrideFragment;

/* loaded from: classes11.dex */
public final class ZeroFeatureOverrideFragment$enabledFeaturesStore$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ZeroFeatureOverrideFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroFeatureOverrideFragment$enabledFeaturesStore$2(ZeroFeatureOverrideFragment zeroFeatureOverrideFragment) {
        super(0);
        this.this$0 = zeroFeatureOverrideFragment;
    }

    @Override // X.InterfaceC16820sZ
    public final ZeroFeatureOverrideFragment.EnabledFeaturesStore invoke() {
        return new ZeroFeatureOverrideFragment.EnabledFeaturesStore(this.this$0.getSession());
    }
}
