package X;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CFx {
    public static final void A00(C5Hc c5Hc, InterfaceC16660sJ interfaceC16660sJ, C5Tl c5Tl, int i) {
        int i2;
        AbstractC167007dF.A1K(c5Hc, interfaceC16660sJ);
        c5Tl.Enr(-1995734045);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-80212420, "com.instagram.comments.mvvm.view.compose.composer.ComposerEmojiBar (ComposerEmojiBar.kt:31)");
            }
            Modifier A0T = AbstractC25226BEj.A0T(Modifier.A00);
            Modifier Eq3 = A0T.Eq3(new SizeElement(C5XU.A00, Float.NaN, Float.NaN, Float.NaN, Float.POSITIVE_INFINITY, false));
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC27469CAp.A00(c5Tl, null, A0T, C30716DfE.A00(c5Tl, c5Hc, interfaceC16660sJ, 24, -656441721), 3078, 6, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(187677324);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, interfaceC16660sJ, c5Hc, i, 31);
        }
    }
}
