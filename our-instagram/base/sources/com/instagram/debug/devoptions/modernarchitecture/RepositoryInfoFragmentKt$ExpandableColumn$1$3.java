package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC118255Wn;
import X.AbstractC119595bH;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
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
import X.InterfaceC1127857k;
import X.InterfaceC16610sE;
import X.InterfaceC16620sF;
import X.InterfaceC30761Dfy;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragmentKt$ExpandableColumn$1$3 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ InterfaceC16620sF $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$ExpandableColumn$1$3(InterfaceC16620sF interfaceC16620sF) {
        super(3);
        this.$content = interfaceC16620sF;
    }

    public final void invoke(InterfaceC30761Dfy interfaceC30761Dfy, C5Tl c5Tl, int i) {
        if (C0fH.A02()) {
            C0fH.A01(174100680, "com.instagram.debug.devoptions.modernarchitecture.ExpandableColumn.<anonymous>.<anonymous> (RepositoryInfoFragment.kt:160)");
        }
        InterfaceC16620sF interfaceC16620sF = this.$content;
        C1130158n c1130158n = Modifier.A00;
        InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, c1130158n);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A02, A04);
        InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        AbstractC25227BEk.A1P(c5Tl, interfaceC16620sF, 0);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(-2126073222);
        }
    }

    @Override // X.InterfaceC16610sE
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((InterfaceC30761Dfy) obj, (C5Tl) obj2, AbstractC166987dD.A0H(obj3));
        return C0eB.A00;
    }
}
