package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.CKd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27710CKd {
    public static final void A00(C5Tl c5Tl, C25868BcP c25868BcP, int i) {
        int i2;
        String str;
        C14360o3.A0B(c25868BcP, 0);
        c5Tl.Enr(-1704292441);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c25868BcP) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1674130740, "com.instagram.wonderwall.ui.compose.screens.WallPostComposerScreen (WallPostComposerScreen.kt:32)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c25868BcP.A07, 0);
            AbstractC28136Caj.A00(c5Tl, C5UA.A01(c5Tl, new C30486DbV(5, c25868BcP, A02), -839040679), 6);
            if (((C26019Bf8) AbstractC25227BEk.A0r(c5Tl, A02, -1629227470)).A0A && (str = ((C26019Bf8) A02.getValue()).A05) != null) {
                Alignment alignment = C118195Wf.A06;
                C1130158n c1130158n = Modifier.A00;
                InterfaceC1127857k A00 = C5XX.A00(alignment, false);
                int A002 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A00, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                Modifier A003 = C30711Df9.A00(AbstractC25226BEj.A0T(c1130158n), C5XU.A00, 0);
                c5Tl.Eno(-1880601854);
                int i3 = i2 & 14;
                boolean A1P = AbstractC167007dF.A1P(i3, 4);
                Object EEc = c5Tl.EEc();
                if (A1P || EEc == C5UI.A00) {
                    EEc = DGU.A00(c5Tl, c25868BcP, 9);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc, false);
                boolean A1S = AbstractC25229BEm.A1S(c5Tl, -1880600195, i3, 4);
                Object EEc2 = c5Tl.EEc();
                if (A1S || EEc2 == C5UI.A00) {
                    EEc2 = C30179DRk.A00(c5Tl, c25868BcP, 19);
                }
                AbstractC28334CeM.A01(c5Tl, A003, null, str, A1A, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), 0, 4);
                c5Tl.ASW();
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C27915CSa c27915CSa = ((C26019Bf8) A02.getValue()).A02;
            if (c27915CSa != null) {
                AbstractC28470ChM.A04(c5Tl, c27915CSa, 8);
            }
            if (C0fH.A02()) {
                C0fH.A00(-618665738);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c25868BcP, i, 16);
        }
    }
}
