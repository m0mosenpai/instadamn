package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC166987dD;
import X.AbstractC25235BEs;
import X.C0YY;
import X.C0eB;
import X.C0fH;
import X.C5Tl;
import X.InterfaceC16620sF;

/* loaded from: classes5.dex */
public final class RecommendationsInfoBottomSheetFragment$onCreateView$1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ RecommendationsInfoBottomSheetFragment this$0;

    /* renamed from: com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment$onCreateView$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends C0YY implements InterfaceC16620sF {
        public final /* synthetic */ RecommendationsInfoBottomSheetFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RecommendationsInfoBottomSheetFragment recommendationsInfoBottomSheetFragment) {
            super(2);
            this.this$0 = recommendationsInfoBottomSheetFragment;
        }

        public final void invoke(C5Tl c5Tl, int i) {
            if ((i & 11) == 2 && c5Tl.Bxj()) {
                c5Tl.Em9();
                return;
            }
            if (C0fH.A02()) {
                C0fH.A01(-85497608, "com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (RecommendationsInfoBottomSheetFragment.kt:43)");
            }
            this.this$0.RecommendationsInfoBottomSheetContent(c5Tl, 8);
            if (!C0fH.A02()) {
                return;
            }
            C0fH.A00(-988504216);
        }

        @Override // X.InterfaceC16620sF
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C5Tl) obj, AbstractC166987dD.A0H(obj2));
            return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsInfoBottomSheetFragment$onCreateView$1(RecommendationsInfoBottomSheetFragment recommendationsInfoBottomSheetFragment) {
        super(2);
        this.this$0 = recommendationsInfoBottomSheetFragment;
    }

    public final void invoke(C5Tl c5Tl, int i) {
        if ((i & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
            return;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1217962845, "com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment.onCreateView.<anonymous> (RecommendationsInfoBottomSheetFragment.kt:43)");
        }
        if (!AbstractC25235BEs.A1Z(c5Tl, new AnonymousClass1(this.this$0), 1424641817)) {
            return;
        }
        C0fH.A00(356492207);
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C5Tl) obj, AbstractC166987dD.A0H(obj2));
        return C0eB.A00;
    }
}
