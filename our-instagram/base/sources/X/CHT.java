package X;

import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

/* loaded from: classes5.dex */
public abstract class CHT {
    public static final void A00(C5Tl c5Tl, C5C3 c5c3, MagicModPostCaptureTransform magicModPostCaptureTransform, C26195BiL c26195BiL, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, c26195BiL, c5c3);
        c5Tl.Enr(2024533407);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c26195BiL, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c5c3);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, magicModPostCaptureTransform);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1759241142, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.BackdropNonLinearSection (BackdropNonLinearSection.kt:46)");
            }
            C5Hc c5Hc = c26195BiL.A00;
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 299719064);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c5Hc, 299722126);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == obj) {
                EEc = DNF.A00;
                c5Tl.FBy(EEc);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc, false);
            CRT A00 = CYB.A00(c5Tl);
            float A02 = AbstractC25231BEo.A02(c5Tl) * 1.7777778f * 0.85f;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A003 = C6GM.A00.A00(c1130158n, A1R);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A003);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            CYB.A01(AbstractC118255Wn.A01(12.0f), c5Tl, AbstractC118185Wd.A0F(c1130158n, 0.0f, A02), A00, A1B, C5UA.A01(c5Tl, new C30750Dfn(magicModPostCaptureTransform, 13), 1815295029), c5Hc, 199680, 0);
            c5Tl.ASW();
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 0.0f, 16.0f);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A005 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0f, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            CHG.A00(c5Tl, c25338BJh, c5c3, EnumC193878i8.A09, C29756DBa.A00, C29757DBb.A00, DNE.A00, 2131961561, ((i2 >> 3) & 14) | 115040688, false, A1R);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1005544186);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c5c3, magicModPostCaptureTransform, c26195BiL, i, 26);
        }
    }
}
