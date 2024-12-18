package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CXw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28044CXw {
    public static final void A00(C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(-931653645);
        int i4 = 4;
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1931137856, "com.instagram.comments.mvvm.view.compose.CommentShimmer (CommentShimmer.kt:25)");
            }
            if (i > 0) {
                i4 = i;
            }
            int min = Math.min(10, i4);
            CUC A03 = AbstractC28487Chf.A03(c5Tl, null, 0.0f, 0.0f, 0, 1572864, 63, 0L);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(-1621376088);
            for (int i5 = 0; i5 < min; i5++) {
                A01(c5Tl, A03, 0);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(516252736);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30483DbS.A00(ASZ, i, i2, 3);
        }
    }

    public static final void A01(C5Tl c5Tl, CUC cuc, int i) {
        int i2;
        c5Tl.Enr(1721229984);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, cuc) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1748195238, "com.instagram.comments.mvvm.view.compose.ShimmerCommentRow (CommentShimmer.kt:36)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 12.0f, 12.0f, 0.0f, 28.0f);
            int i3 = ((i2 << 3) & 112) | 6;
            AbstractC167007dF.A1K(A0E, cuc);
            if (AbstractC25227BEk.A1U(c5Tl, -1967563413)) {
                C0fH.A01(-1939772385, "com.instagram.compose.ui.shimmer.shimmerContent (Shimmer.kt:35)");
            }
            boolean z = false;
            AbstractC28487Chf.A04(c5Tl, 0);
            Modifier A0Y = AbstractC25230BEn.A0Y(A0E, C30060DMu.A00);
            c5Tl.Eno(-1338123810);
            if ((((i3 & 112) ^ 48) > 32 && c5Tl.AH4(cuc)) || (i3 & 48) == 32) {
                z = true;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == C5UI.A00) {
                EEc = C30185DRq.A02(cuc, 46);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A01 = AbstractC119675bQ.A01(A0Y, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(-825658818);
            }
            C117505Tk.A0L(A0K, false);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0f, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            Modifier A0C = AbstractC118185Wd.A0C(c1130158n, 36.0f);
            long j = C1132359l.A01;
            C5XX.A02(c5Tl, C6L3.A01(A0C, C5WF.A00, j), 0);
            Modifier A0E2 = AbstractC118175Wb.A0E(c1130158n, 12.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A01(6.0f), c5Tl, C118195Wf.A02, 6);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0E2);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C5XX.A02(c5Tl, AbstractC25228BEl.A0Z(AbstractC118185Wd.A08(AbstractC118185Wd.A07(c1130158n, 0.4f), 12.0f), 7.0f, j), 0);
            C5XX.A02(c5Tl, AbstractC25228BEl.A0Z(AbstractC118185Wd.A08(AbstractC118185Wd.A07(c1130158n, 0.8f), 12.0f), 7.0f, j), 0);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-629068236);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, cuc, i, 24);
        }
    }
}
