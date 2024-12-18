package X;

import androidx.compose.ui.Modifier;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class CXM {
    public static final void A00(C5Tl c5Tl, C51756Mtf c51756Mtf, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        AbstractC167007dF.A1K(c51756Mtf, interfaceC16660sJ);
        c5Tl.Enr(1176577105);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51756Mtf) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-306520380, "com.instagram.aistudio.editor.EditChatThemeScreen (EditChatThemeScreen.kt:33)");
            }
            Modifier A0J = AbstractC25227BEk.A0J(AbstractC25228BEl.A0W(), 12.0f);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0J);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(1750958747);
            Iterator A1J = AbstractC25226BEj.A1J(c51756Mtf.A00);
            while (A1J.hasNext()) {
                A01(c5Tl, (C26087BgG) A1J.next(), interfaceC16660sJ, i2 & 112);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-982696969);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c51756Mtf, interfaceC16660sJ, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r16, X.C26087BgG r17, X.InterfaceC16660sJ r18, int r19) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXM.A01(X.5Tl, X.BgG, X.0sJ, int):void");
    }
}
