package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CD3 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-394932365);
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
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1897534156, "com.instagram.aistudio.home.view.section.AiHomeCreateCardFooterSection (AiHomeCreateCardFooterSection.kt:30)");
            }
            FillElement fillElement = AbstractC118185Wd.A02;
            Modifier A0D = AbstractC118185Wd.A0D(AbstractC118175Wb.A08(modifier2.Eq3(fillElement), 32.0f), 318.0f);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 48);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0D);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C1130158n c1130158n = Modifier.A00;
            Modifier Eq3 = c1130158n.Eq3(fillElement);
            InterfaceC1127857k A022 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A04, 48);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6L0 c6l0 = C6L0.A00;
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC118185Wd.A0D(c1130158n, 214.0f), 0.0f, 0.0f, 12.0f, 0.0f);
            InterfaceC1127857k A023 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A02, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A023, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            String A004 = C5YD.A00(c5Tl, 2131952650);
            C5WR.A0Q(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 2.0f), AbstractC25226BEj.A0h(c5Tl), A004, 1, AbstractC25226BEj.A0G(c5Tl));
            C5WR.A0o(c5Tl, AbstractC25225BEi.A0Y(c5Tl), C5YD.A00(c5Tl, 2131952649), 1, 16250, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.ASW();
            C6LQ.A03(c5Tl, c6l0.A00(AbstractC118185Wd.A0C(c1130158n, 96.0f)), C5Y7.A00(c5Tl, R.drawable.ig_illustrations_illo_ai_studio_refresh, 0));
            c5Tl.ASW();
            String A005 = C5YD.A00(c5Tl, 2131952632);
            C6GE.A01(c5Tl, AbstractC118175Wb.A0E(Eq3, 0.0f, 16.0f, 0.0f, 0.0f), C6GD.A03, AbstractC25225BEi.A0u(c5Tl), A005, interfaceC16820sZ, (i3 & 14) | 1573248, 408, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-295836414);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, interfaceC16820sZ, i2, i, 9);
        }
    }
}
