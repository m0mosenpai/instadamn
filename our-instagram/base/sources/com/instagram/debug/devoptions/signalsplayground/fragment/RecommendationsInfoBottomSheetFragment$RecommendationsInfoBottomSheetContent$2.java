package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C0YY;
import X.C0eB;
import X.C5Tl;
import X.InterfaceC16620sF;

/* loaded from: classes5.dex */
public final class RecommendationsInfoBottomSheetFragment$RecommendationsInfoBottomSheetContent$2 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ RecommendationsInfoBottomSheetFragment $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsInfoBottomSheetFragment$RecommendationsInfoBottomSheetContent$2(RecommendationsInfoBottomSheetFragment recommendationsInfoBottomSheetFragment, int i) {
        super(2);
        this.$tmp0_rcvr = recommendationsInfoBottomSheetFragment;
        this.$$changed = i;
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C5Tl) obj, AbstractC166987dD.A0H(obj2));
        return C0eB.A00;
    }

    public final void invoke(C5Tl c5Tl, int i) {
        this.$tmp0_rcvr.RecommendationsInfoBottomSheetContent(c5Tl, AbstractC25225BEi.A04(this.$$changed));
    }
}
