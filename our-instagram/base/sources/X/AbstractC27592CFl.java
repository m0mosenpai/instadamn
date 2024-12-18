package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CFl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27592CFl {
    public static final void A00(C5Tl c5Tl, EnumC27402C7f enumC27402C7f, C27961CUg c27961CUg, int i) {
        int i2;
        int i3;
        long j;
        boolean A1R = AbstractC167007dF.A1R(0, enumC27402C7f, c27961CUg);
        c5Tl.Enr(207753);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, enumC27402C7f) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c27961CUg);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(29606356, "com.instagram.comments.mvvm.view.compose.CommentSortOrderSelector (CommentSortOrderSelector.kt:45)");
            }
            if (enumC27402C7f != EnumC27402C7f.A09) {
                i3 = enumC27402C7f.A00;
            } else {
                i3 = 2131962784;
            }
            String A00 = C5YD.A00(c5Tl, i3);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1795351960);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, A00);
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, AbstractC25234BEr.A0a(c5Tl, obj, -1795349766, false), false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A06 = AbstractC118175Wb.A06(AbstractC118185Wd.A07(c1130158n, 0.5f));
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1795341587);
            if (A0q2 == obj) {
                A0q2 = C29906DGu.A01(c5Tl, A0M, 18);
            }
            Modifier A05 = C5XR.A05(A06, null, null, AbstractC25225BEi.A1A(A0K, A0q2, false), A1R);
            if (AbstractC25230BEn.A1X(A0M)) {
                j = AbstractC25227BEk.A0g(c5Tl, -1795337461).A0S;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -1795335479).A0k;
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC25226BEj.A0X(A05, j), 0.0f, 14.0f);
            InterfaceC1127857k A002 = AbstractC118375Wz.A00(AbstractC118255Wn.A04, c5Tl, C118195Wf.A04);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q3 = AbstractC25229BEm.A0q(c5Tl, A002, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q3) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5WR.A0T(c5Tl, AbstractC118175Wb.A0A(c1130158n, 12.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), AbstractC25226BEj.A1D(interfaceC74953Yl), AbstractC25226BEj.A0G(c5Tl));
            boolean A1X = AbstractC25230BEn.A1X(A0M);
            long A005 = AbstractC27485CBg.A00(10.0f, 10.0f);
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 1263935977, i2);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == obj) {
                EEc = new C30172DRc(11, c27961CUg, A0M, interfaceC74953Yl);
                c5Tl.FBy(EEc);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc, false);
            Object A0q4 = AbstractC25227BEk.A0q(c5Tl, 1263941676);
            if (A0q4 == obj) {
                A0q4 = C29906DGu.A01(c5Tl, A0M, 19);
            }
            CY0.A01(c5Tl, AbstractC25225BEi.A1A(A0K, A0q4, false), A1B, C30480DbP.A00(interfaceC74953Yl, 41), 196992, A005, A1X);
            c5Tl.ASW();
            C5XX.A02(c5Tl, C6L3.A01(AbstractC118185Wd.A0G(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 12.0f, 0.0f), 10.0f, 5.0f), new C28807Cnd(!AbstractC25230BEn.A1X(A0M)), AbstractC25226BEj.A0L(c5Tl)), 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(544080454);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, enumC27402C7f, c27961CUg, i, 30);
        }
    }
}
