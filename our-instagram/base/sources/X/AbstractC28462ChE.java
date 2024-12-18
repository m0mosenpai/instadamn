package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.ChE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28462ChE {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(androidx.compose.foundation.lazy.LazyListState r34, X.C5Tl r35, androidx.compose.ui.Modifier r36, X.C25314BIj r37, X.C166047bW r38, X.InterfaceC166277bw r39, X.C25814BbV r40, X.InterfaceC16820sZ r41, X.InterfaceC16660sJ r42, X.C5Hc r43, int r44, int r45, long r46) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28462ChE.A00(androidx.compose.foundation.lazy.LazyListState, X.5Tl, androidx.compose.ui.Modifier, X.BIj, X.7bW, X.7bw, X.BbV, X.0sZ, X.0sJ, X.5Hc, int, int, long):void");
    }

    public static final void A01(LazyListState lazyListState, C5Tl c5Tl, Modifier modifier, C25814BbV c25814BbV, InterfaceC166347c3 interfaceC166347c3, int i, int i2, long j) {
        int i3;
        C117505Tk A0K;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC166347c3, lazyListState);
        C14360o3.A0B(c25814BbV, 2);
        c5Tl.Enr(-2073126272);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, interfaceC166347c3) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, lazyListState);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, c25814BbV);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0G(c5Tl, j);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & 57344) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, modifier2);
        }
        if ((46811 & i3) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1230389153, "com.instagram.comments.mvvm.view.compose.CommentList (CommentList.kt:50)");
            }
            boolean z = false;
            if (interfaceC166347c3 instanceof C166337c2) {
                c5Tl.Eno(-1585739074);
                C166337c2 c166337c2 = (C166337c2) interfaceC166347c3;
                C5Hc A00 = AbstractC133095zb.A00(c166337c2.A08);
                c5Tl.Eno(1472873242);
                int i5 = i3 & 896;
                boolean A1P = AbstractC167007dF.A1P(i5, 256);
                Object EEc = c5Tl.EEc();
                if (A1P || EEc == C5UI.A00) {
                    EEc = new D5Y(c25814BbV, 0);
                    c5Tl.FBy(EEc);
                }
                C0YS c0ys = (C0YS) EEc;
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
                c5Tl.Eno(1472875777);
                if (i5 == 256) {
                    z = true;
                }
                Object EEc2 = c5Tl.EEc();
                if (z || EEc2 == C5UI.A00) {
                    EEc2 = AbstractC25230BEn.A0t(c5Tl, c25814BbV, 35);
                }
                C0YS A1G = AbstractC25225BEi.A1G(A0K, EEc2, false);
                int i6 = i3 << 6;
                Modifier modifier3 = modifier2;
                A00(lazyListState, c5Tl, modifier3, c166337c2.A00, c166337c2.A02, c166337c2.A03, c25814BbV, (InterfaceC16820sZ) c0ys, (InterfaceC16660sJ) A1G, A00, AbstractC25229BEm.A06(i3 & 112, 57344 & i6, i6) | ((i3 << 18) & 1879048192), 0, j);
            } else if (interfaceC166347c3 instanceof C26165Bhq) {
                c5Tl.Eno(1472890547);
                c5Tl.Eno(1472894142);
                if ((i3 & 896) == 256) {
                    z = true;
                }
                Object EEc3 = c5Tl.EEc();
                if (z || EEc3 == C5UI.A00) {
                    EEc3 = AbstractC25229BEm.A0u(c5Tl, c25814BbV, A1R ? 1 : 0);
                }
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
                AbstractC27593CFm.A00(c5Tl, modifier2, (InterfaceC16820sZ) ((C0YS) EEc3), ((i3 >> 12) & 14) | 48, 0, false);
            } else if (interfaceC166347c3 instanceof C29125Csq) {
                c5Tl.Eno(1472897554);
                c5Tl.Eno(1472901118);
                if ((i3 & 896) == 256) {
                    z = true;
                }
                Object EEc4 = c5Tl.EEc();
                if (z || EEc4 == C5UI.A00) {
                    EEc4 = AbstractC25229BEm.A0u(c5Tl, c25814BbV, 2);
                }
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
                AbstractC27593CFm.A00(c5Tl, modifier2, (InterfaceC16820sZ) ((C0YS) EEc4), ((i3 >> 12) & 14) | 48, 0, A1R);
            } else {
                throw AbstractC25233BEq.A0r(c5Tl, 1472866279);
            }
            if (AbstractC25227BEk.A1b(A0K, false)) {
                C0fH.A00(1424338838);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV3(lazyListState, interfaceC166347c3, c25814BbV, modifier2, i, i2, 2, j);
        }
    }

    public static final void A02(C5Tl c5Tl, int i) {
        c5Tl.Enr(-1225265453);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1201626468, "com.instagram.comments.mvvm.view.compose.CommentsLoading (CommentList.kt:287)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A09, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            BIR.A01(c5Tl, AbstractC118185Wd.A0B(c1130158n, 50.0f));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1006891922);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 17);
        }
    }

    public static final void A03(C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(993509886);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1117253512, "com.instagram.comments.mvvm.view.compose.InitialCommentsLoading (CommentList.kt:282)");
            }
            AbstractC28044CXw.A00(c5Tl, i, i3 & 14);
            if (C0fH.A02()) {
                C0fH.A00(-1431580280);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30483DbS.A00(ASZ, i, i2, 2);
        }
    }

    public static final void A04(C5Tl c5Tl, C25314BIj c25314BIj, int i, boolean z) {
        int i2;
        Integer num;
        c5Tl.Enr(347855343);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c25314BIj);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-515451892, "com.instagram.comments.mvvm.view.compose.ParentCommentsLoading (CommentList.kt:262)");
            }
            if (z) {
                if (c25314BIj != null) {
                    num = Integer.valueOf(c25314BIj.A01);
                } else {
                    num = null;
                }
                if (num != null) {
                    c5Tl.Eno(835582138);
                    A03(c5Tl, c25314BIj.A01, 0);
                } else {
                    c5Tl.Eno(835667853);
                    A02(c5Tl, 0);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(-694028387);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, c25314BIj, i, 4, z);
        }
    }

    public static final void A05(boolean z, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(2076461237);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-497180259, "com.instagram.comments.mvvm.view.compose.HiddenCommentsLoading (CommentList.kt:275)");
            }
            if (z) {
                A02(c5Tl, 0);
            }
            if (C0fH.A02()) {
                C0fH.A00(1483945476);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DS6(z, i, 0);
        }
    }
}
