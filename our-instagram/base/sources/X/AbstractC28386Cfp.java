package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Cfp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28386Cfp {
    public static final void A01(C6GN c6gn, C5Tl c5Tl, C25814BbV c25814BbV, InterfaceC166367c5 interfaceC166367c5, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, c6gn, interfaceC166367c5);
        C14360o3.A0B(c25814BbV, 2);
        c5Tl.Enr(1817912629);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6gn) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, interfaceC166367c5);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c25814BbV);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(421510177, "com.instagram.comments.mvvm.view.compose.composer.AboveCommentComposer (AboveCommentComposer.kt:48)");
            }
            if (interfaceC166367c5 instanceof C167637eJ) {
                c5Tl.Eno(1220184763);
                C167637eJ c167637eJ = (C167637eJ) interfaceC166367c5;
                C167607eG c167607eG = c167637eJ.A00;
                C167627eI c167627eI = c167637eJ.A01;
                c5Tl.Eno(316461081);
                int i3 = i2 & 896;
                boolean A1P = AbstractC167007dF.A1P(i3, 256);
                Object EEc = c5Tl.EEc();
                if (A1P || EEc == C5UI.A00) {
                    EEc = new C9GQ(c25814BbV, A1R ? 1 : 0);
                    c5Tl.FBy(EEc);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) ((C0YS) EEc);
                boolean A1S = AbstractC25229BEm.A1S(c5Tl, 316463497, i3, 256);
                Object EEc2 = c5Tl.EEc();
                if (A1S || EEc2 == C5UI.A00) {
                    EEc2 = new C207959Ic(c25814BbV, 2);
                    c5Tl.FBy(EEc2);
                }
                A00(c6gn, c5Tl, c167607eG, c167627eI, interfaceC16820sZ, AbstractC25228BEl.A1E(A0K, EEc2, false), AbstractC133095zb.A00(c167637eJ.A07), i2 & 14, c167637eJ.A0G);
            } else if (interfaceC166367c5 instanceof C26164Bhp) {
                c5Tl.Eno(1220655963);
                boolean z = ((C26164Bhp) interfaceC166367c5).A00;
                c5Tl.Eno(316474758);
                int i4 = i2 & 896;
                boolean A1P2 = AbstractC167007dF.A1P(i4, 256);
                Object EEc3 = c5Tl.EEc();
                if (A1P2 || EEc3 == C5UI.A00) {
                    EEc3 = AbstractC25229BEm.A0u(c5Tl, c25814BbV, 16);
                }
                C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) ((C0YS) EEc3);
                boolean A1U = AbstractC25232BEp.A1U(c5Tl, 316476552, i4, 256);
                Object EEc4 = c5Tl.EEc();
                if (A1U || EEc4 == C5UI.A00) {
                    EEc4 = AbstractC25229BEm.A0u(c5Tl, c25814BbV, 17);
                }
                InterfaceC16820sZ A1D = AbstractC25228BEl.A1D(A0K2, EEc4, false);
                boolean A1S2 = AbstractC25229BEm.A1S(c5Tl, 316478309, i4, 256);
                Object EEc5 = c5Tl.EEc();
                if (A1S2 || EEc5 == C5UI.A00) {
                    EEc5 = new D5Y(c25814BbV, 18);
                    c5Tl.FBy(EEc5);
                }
                AbstractC28045CXx.A01(c5Tl, interfaceC16820sZ2, A1D, AbstractC25228BEl.A1D(A0K2, EEc5, false), 0, z);
            } else {
                c5Tl.Eno(1220931770);
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(-1775032019);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c25814BbV, c6gn, interfaceC166367c5, i, 17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r38.A02 != true) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C6GN r35, X.C5Tl r36, X.C167607eG r37, X.C167627eI r38, X.InterfaceC16820sZ r39, X.InterfaceC16660sJ r40, X.C5Hc r41, int r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28386Cfp.A00(X.6GN, X.5Tl, X.7eG, X.7eI, X.0sZ, X.0sJ, X.5Hc, int, boolean):void");
    }

    public static final void A02(C5Tl c5Tl, ImageUrl imageUrl, String str, InterfaceC16820sZ interfaceC16820sZ, int i, long j, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        c5Tl.Enr(1413983036);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0G(c5Tl, j);
        }
        if ((57344 & i) == 0) {
            i2 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((458752 & i) == 0) {
            i2 |= AbstractC25232BEp.A0g(c5Tl, z2);
        }
        if ((374491 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1309384216, "com.instagram.comments.mvvm.view.compose.composer.ReplyingToIndicatorRow (AboveCommentComposer.kt:134)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC118185Wd.A08(AbstractC25226BEj.A0T(c1130158n), 48.0f), j);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC1127857k A00 = AbstractC118375Wz.A00(AbstractC118255Wn.A04, c5Tl, interfaceC118225Wj);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0X);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0V, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            c5Tl.Eno(460084697);
            if (z2) {
                Modifier A0E = AbstractC118175Wb.A0E(AbstractC118185Wd.A02(C118195Wf.A09, c1130158n), 16.0f, 0.0f, 10.0f, 0.0f);
                InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                int A004 = C5X2.A00(c5Tl);
                C59P A043 = C117505Tk.A04(c117505Tk);
                Modifier A013 = C5X3.A01(c5Tl, A0E);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
                }
                C5XJ.A00(c5Tl, A013, A1K);
                BGD.A01(c5Tl, null, AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 3), null, new BI2(28.0f, 33.0f, 2.0f, 1.0f), null, 56, 6, 1020, false);
                c5Tl.ASW();
            }
            C117505Tk.A0L(c117505Tk, false);
            if (z) {
                c5Tl.Eno(460112352);
                i4 = 2131956497;
                i3 = 1;
            } else {
                i3 = 1;
                c5Tl.Eno(460114846);
                i4 = 2131972367;
            }
            String A17 = AbstractC25228BEl.A17(c5Tl, str, i4);
            C117505Tk.A0L(c117505Tk, false);
            Modifier modifier = c1130158n;
            if (!z2) {
                modifier = AbstractC118175Wb.A0E(c1130158n, 16.0f, 0.0f, 32.0f, 0.0f);
            }
            C5WR.A0D(c5Tl, modifier, AbstractC25226BEj.A0c(c5Tl), A17, 5, i3, 390, 11128, AbstractC25226BEj.A0M(c5Tl));
            c5Tl.ASW();
            Modifier A02 = AbstractC118185Wd.A02(C118195Wf.A09, c1130158n);
            InterfaceC1127857k A0b2 = AbstractC25226BEj.A0b(false);
            int A005 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0b2, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            A03(interfaceC16820sZ, c5Tl, (i2 >> 6) & 14);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(384032215);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30235DTo(imageUrl, str, interfaceC16820sZ, i, j, z, z2);
        }
    }

    public static final void A03(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-993507776);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1914899802, "com.instagram.comments.mvvm.view.compose.composer.ReplyingToDismissIcon (AboveCommentComposer.kt:191)");
            }
            C2DC A00 = C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_outline_12, 0);
            String A002 = C5YD.A00(c5Tl, 2131972365);
            Modifier A0E = AbstractC118175Wb.A0E(Modifier.A00.Eq3(AbstractC118185Wd.A00), 14.0f, 0.0f, 22.0f, 0.0f);
            c5Tl.Eno(2037235694);
            boolean A1S = AbstractC25228BEl.A1S(i2);
            Object EEc = c5Tl.EEc();
            if (A1S || EEc == C5UI.A00) {
                EEc = C29906DGu.A01(c5Tl, interfaceC16820sZ, 22);
            }
            AbstractC25225BEi.A1T(c5Tl);
            C6LQ.A00(c5Tl, C118195Wf.A09, C5XR.A06(A0E, (InterfaceC16820sZ) EEc), AbstractC25228BEl.A0a(AbstractC25226BEj.A0F(c5Tl)), A00, null, A002, 0.0f, 3080, 48);
            if (C0fH.A02()) {
                C0fH.A00(1419983904);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 27);
        }
    }
}
