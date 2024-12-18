package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CYK {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r3 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r61, X.C3I9 r62, X.C28374Cfc r63, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r64, X.C25802BbJ r65, X.InterfaceC16820sZ r66, X.InterfaceC16660sJ r67, int r68, int r69) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYK.A01(X.5Tl, X.3I9, X.Cfc, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams, X.BbJ, X.0sZ, X.0sJ, int, int):void");
    }

    public static final void A00(C5Tl c5Tl, C5C3 c5c3, String str, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        c5Tl.Enr(-1708590080);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5c3) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1678775204, "com.instagram.creation.genai.magicmod.screen.ui.TopicTextFieldDecorationBox (MagicModTopicEditScreen.kt:227)");
            }
            c5Tl.Eno(2103752364);
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = DGV.A00(c5Tl, c5c3, 11);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C113775Bp A0L = AbstractC25225BEi.A0L(null, (InterfaceC16820sZ) EEc);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(-2010508367);
            if (!AbstractC166987dD.A1a(A0L.getValue())) {
                C5WR.A0B(c5Tl, null, AbstractC25226BEj.A0g(c5Tl), str, 3, 1, 2, (i2 >> 3) & 14, 390, 11130, AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i2 >> 6);
            if (C0fH.A02()) {
                C0fH.A00(52003873);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(c5c3, interfaceC16620sF, str, i, 8);
        }
    }
}
