package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.CHo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27643CHo {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i) {
        float f;
        boolean A1b = AbstractC25233BEq.A1b(c5Hc, str, interfaceC16660sJ);
        if (AbstractC25235BEs.A1W(c5Tl, 1938582004)) {
            C0fH.A01(-1450875304, "com.instagram.creator.achievements.modules.views.ChallengeCardHScrollRow (ChallengeCardHScrollRow.kt:32)");
        }
        float A02 = AbstractC25231BEo.A02(c5Tl);
        if (c5Hc.size() == A1b) {
            f = A02 - 32.0f;
        } else {
            f = 290.0f;
        }
        C1130158n c1130158n = Modifier.A00;
        InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, c1130158n);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A0Y, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
        BY1.A00(c5Tl, A0T, null, null, str, AbstractC25225BEi.A03(i), 60);
        LazyListState A0E = AbstractC25227BEk.A0E(c5Tl);
        boolean A1S = AbstractC25230BEn.A1S(c5Hc.size(), A1b ? 1 : 0);
        InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
        C6IS.A00(C6GO.A00(A0E, c5Tl), AbstractC118255Wn.A00(), new C1333560c(16.0f, 0.0f, 16.0f, 0.0f), A0E, c5Tl, interfaceC118225Wj, A0T, new DHY(c5Hc, interfaceC16660sJ, f, 9), 221574, 8, false, A1S);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(193116069);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(interfaceC16660sJ, c5Hc, str, i, 10);
        }
    }
}
