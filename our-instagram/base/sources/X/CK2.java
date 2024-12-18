package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CK2 {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        int A06 = AbstractC167007dF.A06(0, str, interfaceC16820sZ);
        c5Tl.Enr(-1001944161);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(340089186, "com.instagram.rtc.presentation.aistatus.RtcCallAiStatusLayout (RtcCallAiStatusLayout.kt:25)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A0E = AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 48.0f);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A06, c5Tl, C118195Wf.A02, 6);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            c5Tl.Eno(1701114259);
            if (str.length() > 0 && !z) {
                C118125Vw A0h = AbstractC25226BEj.A0h(c5Tl);
                long A0H = AbstractC25226BEj.A0H(c5Tl);
                long A012 = AbstractC118155Vz.A01(14);
                Modifier A0A = AbstractC118175Wb.A0A(AbstractC25228BEl.A0Z(AbstractC118175Wb.A0E(AbstractC25235BEs.A0G(c6gm, c1130158n), 0.0f, 0.0f, 0.0f, 38.0f), 8.0f, C5XL.A00(c5Tl).A0r), 10.0f, 4.0f);
                boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, 1701135471, i2);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = new C57753Pjg(interfaceC16820sZ, 18);
                    c5Tl.FBy(EEc);
                }
                C5WR.A03(c5Tl, A0A, A0h, null, null, null, str, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 3, 0, A06, 0, (i2 & 14) | 3072, 6, 7024, A0H, A012, 0L, false);
            }
            C117505Tk.A0L(c117505Tk, false);
            CYw.A01(c5Tl, AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 48.0f), 26.0f, 6.0f, (i2 & 112) | 3462, z);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(958428463);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT3(interfaceC16820sZ, str, i, 5, z);
        }
    }
}
