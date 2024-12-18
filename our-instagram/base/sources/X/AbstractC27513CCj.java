package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CCj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27513CCj {
    public static final void A00(C5Tl c5Tl, InterfaceC30795DgW interfaceC30795DgW, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        AbstractC167027dH.A0a(0, interfaceC30795DgW, str, interfaceC16660sJ, interfaceC16820sZ);
        c5Tl.Enr(-766917981);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, interfaceC30795DgW, i2) ? 1 : 0) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-38944468, "com.instagram.aistudio.editor.AiEditProfilePictureScreen (AiEditProfilePictureScreen.kt:33)");
            }
            C28729CmL A00 = AbstractC28285CdX.A00(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            if (C0fH.A02()) {
                C0fH.A01(-1744703664, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:280)");
            }
            C28745Cmd c28745Cmd = C28428Cga.A0N.A00(c5Tl).A08;
            if (C0fH.A02()) {
                C0fH.A00(2016669136);
            }
            InterfaceC16660sJ interfaceC16660sJ2 = C5XU.A00;
            Modifier A01 = AbstractC28285CdX.A01(A00, C30711Df9.A00(AbstractC25225BEi.A0Q(C5X3.A02(c1130158n, interfaceC16660sJ2, C30712DfA.A00(c28745Cmd, 6))), interfaceC16660sJ2, 0));
            InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0P, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            InterfaceC1127857k A003 = AbstractC118375Wz.A00(AbstractC118255Wn.A02, c5Tl, C118195Wf.A05);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            AbstractC27516CCm.A00(c5Tl, interfaceC30795DgW, null, null, null, 280, (i3 & 14) | 12586032, 116, false, false, false);
            c5Tl.ASW();
            c5Tl.Eno(-828146617);
            if (!interfaceC30795DgW.equals(C29087CsE.A00)) {
                C5WR.A0Y(c5Tl, AbstractC118175Wb.A0C(c1130158n, 0.0f, 0.0f, 8.0f), AbstractC25225BEi.A0Y(c5Tl), C5YD.A00(c5Tl, 2131952776), AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC27512CCi.A00(c5Tl, Integer.valueOf(i), str, interfaceC16820sZ, interfaceC16660sJ, AbstractC25229BEm.A05(i3 >> 3, ((i3 >> 6) & 14) | (i3 & 112)), !interfaceC30795DgW.equals(r7));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(792304063);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUR(interfaceC16660sJ, interfaceC16820sZ, interfaceC30795DgW, str, i2, i, 0);
        }
    }
}
