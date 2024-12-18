package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CCv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27525CCv {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 1);
        c5Tl.Enr(1709400248);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(854958472, "com.instagram.aistudio.editor.InputFieldShimmer (InputFieldShimmer.kt:31)");
            }
            float A00 = C118135Vx.A00(((C118125Vw) c5Tl.AJX(C5WR.A00)).A00.A04);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118175Wb.A0E(AbstractC25228BEl.A0Y(AbstractC118175Wb.A0A(AbstractC25225BEi.A0Q(modifier2), C5XT.A00(c5Tl), 0.0f), 12.0f, 1.5f, C5XL.A00(c5Tl).A0H), C5XT.A00(c5Tl), 18.0f, C5XT.A00(c5Tl), C5XT.A01(c5Tl)), 54.0f - 1.5f);
            InterfaceC1127857k A01 = AbstractC119595bH.A01(interfaceC118305Ws, c5Tl, interfaceC118245Wl);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A08);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A01, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            C1130158n c1130158n = Modifier.A00;
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1752242789);
            if (A0q2 == C5UI.A00) {
                A0q2 = new DHG(0.75f, 6);
                c5Tl.FBy(A0q2);
            }
            C5WR.A0B(c5Tl, AbstractC25233BEq.A09(c117505Tk, c1130158n, A0q2), AbstractC25226BEj.A0g(c5Tl), str, 5, 1, 2, AbstractC25225BEi.A03(i3), 390, 11128, AbstractC25226BEj.A0M(c5Tl));
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC118185Wd.A08(c1130158n, A00), 0.0f, 5.0f, 0.0f, 0.0f);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            AbstractC28487Chf.A06(c5Tl, AbstractC118185Wd.A0D(c1130158n, 113.0f), 11.0f);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-756038862);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT2(modifier2, str, i2, i, 0);
        }
    }
}
