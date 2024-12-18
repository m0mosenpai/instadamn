package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CHI {
    public static final void A00(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-1707846391);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1632653269, "com.instagram.creation.genai.magicmod.common.ui.MagicModRetryFooterButton (MagicModRetryButton.kt:20)");
            }
            Alignment alignment = C118195Wf.A09;
            Modifier A0G = AbstractC25236BEt.A0G(c5Tl, Modifier.A00);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 356504384, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = DH4.A01(c5Tl, interfaceC16820sZ, 37);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0V = AbstractC25226BEj.A0V(AbstractC25227BEk.A0M(AbstractC25235BEs.A0I(c5Tl, c117505Tk, A0G, (InterfaceC16820sZ) EEc), 24.0f));
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0V);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0w(c5Tl, AbstractC25226BEj.A0h(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131972568), AbstractC25226BEj.A08(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1307332227);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 46);
        }
    }
}
