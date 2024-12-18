package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CYU {
    public static final void A00(C5Tl c5Tl, C26065Bft c26065Bft, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(c26065Bft, interfaceC16660sJ, interfaceC16820sZ);
        int A08 = AbstractC25230BEn.A08(3, interfaceC16660sJ2, interfaceC16820sZ2);
        c5Tl.Enr(682067778);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26065Bft) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2046110821, "com.instagram.creator.agent.settings.summary.BioSummary (BioSummaryFragment.kt:127)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A00 = C30711Df9.A00(c1130158n, C5XU.A00, 0);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Modifier A003 = C6GM.A00.A00(c1130158n, A1b);
            C1333560c A0P = AbstractC25229BEm.A0P(16.0f);
            c5Tl.Eno(393932659);
            int i3 = i2 & 14;
            boolean A1I = AbstractC25233BEq.A1I(i2) | AbstractC167007dF.A1P(i3, A08) | AbstractC25232BEp.A1R(57344 & i2) | AbstractC25233BEq.A1J(i2);
            Object EEc = c5Tl.EEc();
            if (A1I || EEc == C5UI.A00) {
                EEc = new C50372MLz(34, interfaceC16820sZ, c26065Bft, interfaceC16820sZ2, interfaceC16660sJ);
                c5Tl.FBy(EEc);
            }
            boolean z = false;
            C6IS.A03(A0P, null, c5Tl, A003, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 12583296, 122, A1b);
            String A004 = C5YD.A00(c5Tl, 2131972699);
            boolean z2 = c26065Bft.A07;
            boolean z3 = c26065Bft.A06;
            boolean A1a = AbstractC25234BEr.A1a(c5Tl, 393959283, i2);
            if (i3 == A08) {
                z = true;
            }
            boolean z4 = z | A1a;
            Object EEc2 = c5Tl.EEc();
            if (z4 || EEc2 == C5UI.A00) {
                EEc2 = new C50169MDw(8, c26065Bft, interfaceC16660sJ2);
                c5Tl.FBy(EEc2);
            }
            AbstractC28506Chz.A0B(c5Tl, A004, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), z3, z2);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-52246266);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUL(i, 3, c26065Bft, interfaceC16660sJ, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (X.AbstractC25230BEn.A1X(r13) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r35, java.lang.String r36, X.InterfaceC16820sZ r37, X.InterfaceC16660sJ r38, int r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYU.A01(X.5Tl, java.lang.String, X.0sZ, X.0sJ, int, boolean, boolean):void");
    }
}
