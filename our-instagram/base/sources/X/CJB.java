package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CJB {
    public static final void A00(C5Tl c5Tl, Modifier modifier, BI3 bi3, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(bi3, 1);
        c5Tl.Enr(712739241);
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
            i3 |= AbstractC25232BEp.A0S(c5Tl, bi3);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1076136368, "com.instagram.invite.view.loading.ContactLoading (ContactLoading.kt:27)");
            }
            Modifier A09 = AbstractC118185Wd.A09(AbstractC118175Wb.A00(bi3.A01, AbstractC25225BEi.A0Q(modifier2)), bi3.A00);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A09);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0d, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            CUC A03 = AbstractC28487Chf.A03(c5Tl, null, 0.0f, 0.0f, 0, 1572864, 63, 0L);
            Modifier A0R = AbstractC25231BEo.A0R(modifier2, bi3.A02.Aea());
            long j = C5XL.A00(c5Tl).A0C;
            C5AH c5ah = C5AF.A00;
            C5XX.A02(c5Tl, AbstractC28487Chf.A01(c5Tl, C6L3.A01(A0R, c5ah, j), A03, 0), 0);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0A = AbstractC118175Wb.A0A(c6l0.A00(c1130158n), 12.0f, 0.0f);
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(AbstractC118255Wn.A00(), c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5XX.A02(c5Tl, AbstractC28487Chf.A01(c5Tl, C6L3.A01(AbstractC25228BEl.A0X(AbstractC118185Wd.A08(AbstractC118185Wd.A07(c1130158n, 0.5f), 12.0f), 7.0f), c5ah, C5XL.A00(c5Tl).A0C), A03, 0), 0);
            C5XX.A02(c5Tl, AbstractC28487Chf.A01(c5Tl, C6L3.A01(AbstractC25228BEl.A0X(AbstractC118185Wd.A08(AbstractC118185Wd.A07(c1130158n, 0.4f), 12.0f), 7.0f), c5ah, C5XL.A00(c5Tl).A0C), A03, 0), 0);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-116224925);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, bi3, i2, i, 36);
        }
    }
}
