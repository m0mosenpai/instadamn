package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.comments.mvvm.view.compose.CommentRowKt$colorTransition$1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.CXv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28043CXv {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C167297di c167297di, C166047bW c166047bW, C27961CUg c27961CUg, int i, int i2) {
        int i3;
        List list;
        Integer num;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, c167297di, c27961CUg);
        c5Tl.Enr(1525692589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c167297di) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, c27961CUg);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, c166047bW);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        if ((i3 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(670409253, "com.instagram.comments.mvvm.view.compose.CommentRow (CommentRow.kt:59)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1332152923);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1332150972);
            if (A0q2 == obj) {
                InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
                A0q2 = new ParcelableSnapshotMutableIntState(0);
                c5Tl.FBy(A0q2);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-1332148159);
            int i5 = i3 & 14;
            int i6 = i3 & 112;
            boolean A1P = AbstractC167007dF.A1P(i5, 4) | AbstractC167007dF.A1P(i6, 32);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = new D8L(19, c27961CUg, c167297di);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0L(A0K, false);
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, EEc);
            c5Tl.Eno(-1332128115);
            c5Tl.Eno(-1332133178);
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -1332134968);
            if (A0q3 == obj) {
                A0q3 = new C50368MLv(A0q2, 28);
                c5Tl.FBy(A0q3);
            }
            Modifier A002 = C5YF.A00(modifier2, AbstractC25225BEi.A1B(A0K, A0q3, false));
            boolean z = c167297di.A0W;
            if (z) {
                A002 = A002.Eq3(AbstractC25226BEj.A0X(Modifier.A00, C5XL.A00(c5Tl).A12));
            }
            C117505Tk.A0L(A0K, false);
            if (c167297di.A04 instanceof C170317ik) {
                C1130158n c1130158n = Modifier.A00;
                long j = C5XL.A00(c5Tl).A12;
                long j2 = C5XL.A00(c5Tl).A01;
                if (AbstractC25227BEk.A1U(c5Tl, 1341631837)) {
                    C0fH.A01(610416274, "com.instagram.comments.mvvm.view.compose.colorTransition (CommentRow.kt:242)");
                }
                Object A0q4 = AbstractC25227BEk.A0q(c5Tl, 655886355);
                if (A0q4 == obj) {
                    A0q4 = new C5Y1((InterfaceC118485Xk) AbstractC27736CLd.A00.invoke(AbstractC1132459m.A0K[(int) (j & 63)]), AbstractC25225BEi.A0S(j), null);
                    c5Tl.FBy(A0q4);
                }
                C5Y1 c5y1 = (C5Y1) A0q4;
                C117505Tk.A0L(A0K, false);
                C5UX.A04(c5Tl, C0eB.A00, new CommentRowKt$colorTransition$1(c5y1, null, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, j2));
                Modifier Eq3 = c1130158n.Eq3(AbstractC25226BEj.A0X(c1130158n, ((C1132359l) c5y1.A04.getValue()).A00));
                if (C0fH.A02()) {
                    C0fH.A00(-1570355900);
                }
                A002 = AbstractC25227BEk.A0G(A0K, A002, Eq3);
            }
            C117505Tk.A0L(A0K, false);
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Z(c5Tl, obj, -1332110166);
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-1332100277);
            boolean A1P2 = AbstractC167007dF.A1P(i5, 4) | AbstractC167007dF.A1P(i6, 32);
            Object EEc2 = c5Tl.EEc();
            if (A1P2 || EEc2 == obj) {
                EEc2 = new ME5(0, c27961CUg, c167297di, interfaceC74953Yl);
                c5Tl.FBy(EEc2);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc2, false);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A00, -1332092900);
            Object EEc3 = c5Tl.EEc();
            if (A1Y || EEc3 == obj) {
                EEc3 = new C29906DGu(A00, 16);
                c5Tl.FBy(EEc3);
            }
            InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(A0K, EEc3, false);
            boolean A1P3 = AbstractC167007dF.A1P(i5, 4) | AbstractC25232BEp.A1U(c5Tl, -1332107796, i6, 32);
            Object EEc4 = c5Tl.EEc();
            if (A1P3 || EEc4 == obj) {
                EEc4 = new ME5(A1R ? 1 : 0, c27961CUg, c167297di, interfaceC74953Yl);
                c5Tl.FBy(EEc4);
            }
            Modifier A003 = AbstractC118655Yf.A00(c5xo, A002, null, null, A1A, A1A2, AbstractC25225BEi.A1A(A0K, EEc4, false), A1R);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A004 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A003);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q5 = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A05;
            C6ID A012 = AbstractC118255Wn.A01(12.0f);
            C1130158n c1130158n2 = Modifier.A00;
            InterfaceC1127857k A005 = AbstractC118375Wz.A00(A012, c5Tl, interfaceC118225Wj);
            int A006 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, c1130158n2);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q5) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C6L0 c6l0 = C6L0.A00;
            Modifier FE5 = c6l0.FE5(c1130158n2, 0.84f, A1R);
            boolean z2 = c167297di.A0V;
            float f = 12.0f;
            if (z2) {
                f = 54.0f;
            }
            Modifier A0E = AbstractC118175Wb.A0E(FE5, f, 0.0f, 0.0f, 0.0f);
            InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A01;
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A007 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A014 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q5) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            Modifier A0E2 = AbstractC118175Wb.A0E(c6l0.FE5(c1130158n2, 0.167f, A1R), 0.0f, 9.0f, 0.0f, 0.0f);
            String str = c167297di.A0K;
            User user = c167297di.A0C;
            boolean A2N = user.A2N();
            String id = user.getId();
            ImageUrl Bhu = user.Bhu();
            boolean A1U = AbstractC25232BEp.A1U(c5Tl, 1001366721, i6, 32);
            Object EEc5 = c5Tl.EEc();
            if (A1U || EEc5 == obj) {
                EEc5 = new BGK(c27961CUg, 44);
                c5Tl.FBy(EEc5);
            }
            C0YS A1G = AbstractC25225BEi.A1G(A0K, EEc5, false);
            boolean A1U2 = AbstractC25232BEp.A1U(c5Tl, 1001369226, i6, 32);
            Object EEc6 = c5Tl.EEc();
            if (A1U2 || EEc6 == obj) {
                EEc6 = new BV8(c27961CUg, 3);
                c5Tl.FBy(EEc6);
            }
            AbstractC27585CFe.A00(c5Tl, A0E2, c167297di.A00, Bhu, str, id, (InterfaceC16660sJ) A1G, new C50369MLw(30, A11, c27961CUg), (InterfaceC16600sD) AbstractC25225BEi.A1G(A0K, EEc6, false), 0, 0, A2N, z2);
            AbstractC28300Cdm.A00(c5Tl, AbstractC118175Wb.A0E(c6l0.FE5(c1130158n2, 0.833f, A1R), 12.0f, 0.0f, 0.0f, 0.0f), c167297di, c166047bW, c27961CUg, i5 | i6 | (i3 & 896), 0);
            c5Tl.ASW();
            Modifier FE52 = c6l0.FE5(c1130158n2, 0.16f, A1R);
            String str2 = c167297di.A0N;
            boolean z3 = c167297di.A0S;
            int A0K2 = AbstractC167017dG.A0K(c167297di.A0G);
            boolean A1U3 = AbstractC25232BEp.A1U(c5Tl, -709946077, i6, 32);
            Object EEc7 = c5Tl.EEc();
            if (A1U3 || EEc7 == obj) {
                EEc7 = new C29642D5f(c27961CUg, 5);
                c5Tl.FBy(EEc7);
            }
            C0YS A1G2 = AbstractC25225BEi.A1G(A0K, EEc7, false);
            boolean A1U4 = AbstractC25232BEp.A1U(c5Tl, -709943737, i6, 32);
            Object EEc8 = c5Tl.EEc();
            if (A1U4 || EEc8 == obj) {
                EEc8 = AbstractC25229BEm.A0s(c5Tl, c27961CUg, 19);
            }
            AbstractC27590CFj.A00(c5Tl, FE52, c167297di.A03, c166047bW, c167297di.A07, c167297di.A08, str, str2, (InterfaceC16620sF) AbstractC25225BEi.A1G(A0K, EEc8, false), (InterfaceC16610sE) A1G2, A0K2, 1090519040, (i3 >> 6) & 14, 0, z3);
            c5Tl.ASW();
            C169287h2 c169287h2 = c167297di.A0B;
            C169297h3 c169297h3 = c167297di.A0D;
            c5Tl.Eno(-496709605);
            if (c169287h2 != null && (num = c169287h2.A01) != null && C05F.A00 == num && c169297h3 != null) {
                Modifier A0T = AbstractC25226BEj.A0T(c1130158n2);
                InterfaceC1127857k A022 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
                int A008 = C5X2.A00(c5Tl);
                C59P A044 = C117505Tk.A04(A0K);
                Modifier A015 = C5X3.A01(c5Tl, A0T);
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                C5XJ.A00(c5Tl, A022, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q5) || !AbstractC25231BEo.A1O(c5Tl, A008)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A008);
                }
                C5XJ.A00(c5Tl, A015, A1K);
                String str3 = c167297di.A0J;
                boolean A1U5 = AbstractC25232BEp.A1U(c5Tl, -709922909, i6, 32);
                Object EEc9 = c5Tl.EEc();
                if (A1U5 || EEc9 == obj) {
                    EEc9 = new D5g(c27961CUg, 2);
                    c5Tl.FBy(EEc9);
                }
                InterfaceC16590sC interfaceC16590sC = (InterfaceC16590sC) AbstractC25225BEi.A1G(A0K, EEc9, false);
                boolean A1U6 = AbstractC25232BEp.A1U(c5Tl, -709921372, i6, 32);
                Object EEc10 = c5Tl.EEc();
                if (A1U6 || EEc10 == obj) {
                    EEc10 = AbstractC25230BEn.A0t(c5Tl, c27961CUg, 45);
                }
                A01(c5Tl, c169287h2, c169297h3, str, str3, AbstractC25228BEl.A1E(A0K, EEc10, false), interfaceC16590sC, 262656);
                c5Tl.ASW();
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            if (z && (list = c167297di.A0Q) != null) {
                Object A0q6 = AbstractC25227BEk.A0q(c5Tl, -496689067);
                if (A0q6 == obj) {
                    A0q6 = new C50368MLv(A0q2, 29);
                    c5Tl.FBy(A0q6);
                }
                Modifier A016 = AbstractC28010CWi.A01(c1130158n2, AbstractC25225BEi.A1B(A0K, A0q6, false));
                boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
                C30172DRc c30172DRc = new C30172DRc(10, c27961CUg, c167297di, list);
                boolean A1U7 = AbstractC25232BEp.A1U(c5Tl, -496675077, i6, 32) | AbstractC167007dF.A1P(i5, 4);
                Object EEc11 = c5Tl.EEc();
                if (A1U7 || EEc11 == obj) {
                    EEc11 = new ME5(2, c27961CUg, c167297di, interfaceC74953Yl);
                    c5Tl.FBy(EEc11);
                }
                CY0.A00(null, c5Tl, A016, null, AbstractC25225BEi.A1A(A0K, EEc11, false), c30172DRc, C30480DbP.A00(list, 40), 0, 240, 0L, A1X, false);
                C2UY.A01.A06();
            }
            if (C0fH.A02()) {
                C0fH.A00(815019401);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(modifier2, c167297di, c166047bW, c27961CUg, i, i2, 10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0035, code lost:
    
        if ((r23 & com.facebook.common.dextricks.DalvikInternals.IOPRIO_BACKGROUND) == 16384) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r16, X.C169287h2 r17, X.C169297h3 r18, java.lang.String r19, java.lang.String r20, X.InterfaceC16660sJ r21, X.InterfaceC16590sC r22, int r23) {
        /*
            r0 = -1338750332(0xffffffffb0344a84, float:-6.558951E-10)
            r10 = r16
            boolean r0 = X.AbstractC25235BEs.A1W(r10, r0)
            if (r0 == 0) goto L13
            r1 = 1947361513(0x741260e9, float:4.6389216E31)
            java.lang.String r0 = "com.instagram.comments.mvvm.view.compose.OffensiveWarningPostingProgress (CommentRow.kt:224)"
            X.C0fH.A01(r1, r0)
        L13:
            X.DMS r12 = X.DMS.A00
            r11 = 0
            r0 = -1638709234(0xffffffff9e53480e, float:-1.11851476E-20)
            r10.Eno(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r8 = r23
            r0 = r0 & r23
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r3 = 0
            r1 = 16384(0x4000, float:2.2959E-41)
            r4 = r21
            if (r0 <= r1) goto L32
            boolean r0 = r10.AH4(r4)
            if (r0 != 0) goto L37
        L32:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            r2 = 0
            if (r0 != r1) goto L38
        L37:
            r2 = 1
        L38:
            r0 = r23 & 14
            r0 = r0 ^ 6
            r1 = 4
            r6 = r19
            if (r0 <= r1) goto L47
            boolean r0 = r10.AH4(r6)
            if (r0 != 0) goto L4b
        L47:
            r0 = r23 & 6
            if (r0 != r1) goto L4c
        L4b:
            r3 = 1
        L4c:
            r2 = r2 | r3
            java.lang.Object r0 = r10.EEc()
            if (r2 != 0) goto L57
            java.lang.Object r1 = X.C5UI.A00
            if (r0 != r1) goto L61
        L57:
            r1 = 26
            X.MHy r0 = new X.MHy
            r0.<init>(r6, r4, r1)
            r10.FBy(r0)
        L61:
            X.0sJ r0 = (X.InterfaceC16660sJ) r0
            boolean r9 = X.AbstractC25228BEl.A1W(r10)
            r21 = 1
            X.MIP r15 = new X.MIP
            r2 = r17
            r5 = r18
            r7 = r20
            r3 = r22
            r16 = r5
            r18 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r16 = 6
            r13 = r11
            r14 = r0
            r17 = r16
            X.AbstractC28450Cgz.A03(r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L8f
            r0 = 1843400960(0x6de01100, float:8.668149E27)
            X.C0fH.A00(r0)
        L8f:
            X.5UU r0 = r10.ASZ()
            if (r0 == 0) goto L9c
            X.DVI r1 = new X.DVI
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.A06 = r1
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28043CXv.A01(X.5Tl, X.7h2, X.7h3, java.lang.String, java.lang.String, X.0sJ, X.0sC, int):void");
    }
}
