package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CDr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27547CDr {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(1085670741);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(754436128, "com.instagram.barcelona.common.ui.errorview.ErrorWithRetryView (ErrorWithRetryView.kt:22)");
            }
            InterfaceC1127857k A0z = AbstractC25232BEp.A0z(AbstractC118255Wn.A01, c5Tl, C118195Wf.A04, ((i3 >> 3) & 14) | 384);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0z, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A0Z = AbstractC25226BEj.A0Z(c5Tl, interfaceC118245Wl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0Z, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            AbstractC25236BEt.A0l(c5Tl, C5YD.A00(c5Tl, 2131974298));
            Modifier A0J = AbstractC25227BEk.A0J(c1130158n, 4.0f);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -453099244, i3);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = AbstractC25228BEl.A1F(c5Tl, interfaceC16820sZ, 7);
            }
            C5WR.A0R(c5Tl, AbstractC25235BEs.A0H(c5Tl, c117505Tk, A0J, EEc), AbstractC25226BEj.A0h(c5Tl), C5YD.A00(c5Tl, 2131975766), AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(629766322);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, interfaceC16820sZ, i2, i, 11);
        }
    }
}
