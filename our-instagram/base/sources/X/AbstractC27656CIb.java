package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CIb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27656CIb {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0pO, java.lang.Object] */
    public static final void A00(C5Tl c5Tl, Modifier modifier, C7T7 c7t7, InterfaceC16660sJ interfaceC16660sJ, float f, int i) {
        int i2;
        String str;
        C5UU ASZ;
        DTX dtx;
        AbstractC167007dF.A1K(modifier, c7t7);
        C14360o3.A0B(interfaceC16660sJ, 3);
        c5Tl.Enr(1281357719);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c7t7);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A05(c5Tl, f);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2122812696, "com.instagram.direct.messagethread.compose.MetadataActionIcon (MetadataActionIcon.kt:39)");
            }
            C25312BIh c25312BIh = c7t7.A01;
            if (c25312BIh.A03 != 0) {
                if (C0fH.A02()) {
                    C0fH.A00(-278689846);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                dtx = new DTX(modifier, c7t7, interfaceC16660sJ, f, i, 2);
                ASZ.A06 = dtx;
            }
            C7ZX c7zx = (C7ZX) c5Tl.AJX(COE.A00);
            C55952hg c55952hg = (C55952hg) c5Tl.AJX(COE.A03);
            Object AJX = c5Tl.AJX(COE.A02);
            float f2 = c25312BIh.A00;
            boolean A1T = AbstractC25227BEk.A1T(c5Tl, f2, 1772318156);
            Object EEc = c5Tl.EEc();
            if (A1T || EEc == C5UI.A00) {
                EEc = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(f2));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            ?? obj = new Object();
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1772321346);
            Object obj2 = C5UI.A00;
            if (A0q == obj2) {
                A0q = AbstractC25227BEk.A0l();
                c5Tl.FBy(A0q);
            }
            float A09 = AbstractC166987dD.A09(A0q);
            C117505Tk.A0L(A0K, false);
            obj.A00 = A09;
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 1772322399);
            if (A0q2 == obj2) {
                A0q2 = AbstractC25232BEp.A0w(c5Tl, new C119235af(AbstractC25230BEn.A0G()));
            }
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, A0q2, false);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c55952hg, 1772325643);
            Object EEc2 = c5Tl.EEc();
            if (A1Y || EEc2 == obj2) {
                EEc2 = new C162987Rj(c55952hg, new C29272CvT(A0M, interfaceC74953Yl, c7zx, c7t7, interfaceC16660sJ, obj));
                c5Tl.FBy(EEc2);
            }
            C117505Tk.A0L(A0K, false);
            Boolean valueOf = Boolean.valueOf(c7t7.A06);
            int i3 = i2 & 112;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, AJX, EEc2, 1772355998) | AbstractC25233BEq.A1J(i2) | AbstractC167007dF.A1P(i3, 32);
            Object EEc3 = c5Tl.EEc();
            if (A1W || EEc3 == obj2) {
                EEc3 = new C30175DRf(AJX, c7t7, EEc2, f, 4);
                c5Tl.FBy(EEc3);
            }
            C5UX.A01(c5Tl, valueOf, AJX, AbstractC25225BEi.A1B(A0K, EEc3, false));
            boolean z = false;
            C2DC A00 = C5Y7.A00(c5Tl, c25312BIh.A02, 0);
            c5Tl.Eno(1772372904);
            int i4 = c25312BIh.A01;
            if (i4 != 0) {
                str = C5YD.A00(c5Tl, i4);
            } else {
                str = null;
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(1772380691);
            Modifier A0I = AbstractC25227BEk.A0I(modifier, 4.0f);
            if (c7t7.A09) {
                C1130158n c1130158n = Modifier.A00;
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c7zx, 1229588600);
                if (i3 == 32) {
                    z = true;
                }
                boolean z2 = A1Z | z;
                Object EEc4 = c5Tl.EEc();
                if (z2 || EEc4 == obj2) {
                    EEc4 = new MHU(7, c7zx, c7t7);
                    c5Tl.FBy(EEc4);
                }
                A0I = A0I.Eq3(AbstractC25235BEs.A0H(c5Tl, A0K, c1130158n, EEc4));
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0X = AbstractC25229BEm.A0X(A0I, new C50357MLj(obj, 40));
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, 1772394589);
            if (A0q3 == obj2) {
                A0q3 = new C50357MLj(A0M, 41);
                c5Tl.FBy(A0q3);
            }
            long j = C1132359l.A01;
            C5YS.A09(c5Tl, CBA.A00(AbstractC28010CWi.A01(A0X, AbstractC25225BEi.A1B(A0K, A0q3, false)), AbstractC25231BEo.A03(interfaceC74953Yl)), A00, str, c7t7.A00 << 32);
            if (C0fH.A02()) {
                C0fH.A00(-1373724803);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            dtx = new DTX(modifier, c7t7, interfaceC16660sJ, f, i, 3);
            ASZ.A06 = dtx;
        }
    }
}
