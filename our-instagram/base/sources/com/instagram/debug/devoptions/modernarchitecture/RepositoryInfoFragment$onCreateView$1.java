package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC118175Wb;
import X.AbstractC118255Wn;
import X.AbstractC119595bH;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC25235BEs;
import X.AbstractC28389Cfs;
import X.C0YY;
import X.C0eB;
import X.C0fH;
import X.C1130158n;
import X.C117505Tk;
import X.C118195Wf;
import X.C59P;
import X.C5Tl;
import X.C5X2;
import X.C5X3;
import X.C5X8;
import X.C6IB;
import X.InterfaceC1127857k;
import X.InterfaceC16620sF;
import X.InterfaceC74963Ym;
import androidx.compose.ui.Modifier;
import java.util.List;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragment$onCreateView$1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* renamed from: com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoFragment$onCreateView$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends C0YY implements InterfaceC16620sF {
        public final /* synthetic */ InterfaceC74963Ym $repositoriesInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC74963Ym interfaceC74963Ym) {
            super(2);
            this.$repositoriesInfo = interfaceC74963Ym;
        }

        public final void invoke(C5Tl c5Tl, int i) {
            if ((i & 3) == 2 && c5Tl.Bxj()) {
                c5Tl.Em9();
                return;
            }
            if (C0fH.A02()) {
                C0fH.A01(-877867505, "com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoFragment.onCreateView.<anonymous>.<anonymous> (RepositoryInfoFragment.kt:64)");
            }
            InterfaceC74963Ym interfaceC74963Ym = this.$repositoriesInfo;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            RepositoryInfoFragmentKt.Header(AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 0.0f, 12.0f, 0.0f, 12.0f), c5Tl, 6, 0);
            AbstractC28389Cfs.A02(c5Tl, null, 1.0f, 384, 1, AbstractC25225BEi.A0D(c5Tl));
            RepositoryInfoFragmentKt.RepositoryList((List) interfaceC74963Ym.getValue(), null, c5Tl, 0, 2);
            if (!AbstractC25227BEk.A1R(c5Tl)) {
                return;
            }
            C0fH.A00(-852885310);
        }

        @Override // X.InterfaceC16620sF
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C5Tl) obj, AbstractC166987dD.A0H(obj2));
            return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$onCreateView$1(RepositoryInfoFragment repositoryInfoFragment) {
        super(2);
        this.this$0 = repositoryInfoFragment;
    }

    public final void invoke(C5Tl c5Tl, int i) {
        RepositoryInfoViewModel viewModel;
        if ((i & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
            return;
        }
        if (C0fH.A02()) {
            C0fH.A01(1811619311, "com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoFragment.onCreateView.<anonymous> (RepositoryInfoFragment.kt:62)");
        }
        viewModel = this.this$0.getViewModel();
        if (!AbstractC25235BEs.A1Z(c5Tl, new AnonymousClass1(C6IB.A02(c5Tl, viewModel.repositories, 0)), -1002835833)) {
            return;
        }
        C0fH.A00(1276607497);
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C5Tl) obj, AbstractC166987dD.A0H(obj2));
        return C0eB.A00;
    }
}
