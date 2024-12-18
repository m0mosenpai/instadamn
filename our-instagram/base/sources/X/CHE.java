package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CHE {
    public static final void A00(C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(2049351823);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(817310420, "com.instagram.creation.genai.magicmod.common.ui.MagicModInstructionFooter (MagicModInstructionFooter.kt:18)");
            }
            Alignment alignment = C118195Wf.A09;
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC25228BEl.A0W(), 12.0f, 4.0f);
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0D(c5Tl, null, AbstractC25226BEj.A0h(c5Tl), AbstractC136736Hc.A00(c5Tl, i), 3, 2, 390, 11130, AbstractC25226BEj.A08(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1948639625);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30483DbS.A00(ASZ, i, i2, 5);
        }
    }
}
