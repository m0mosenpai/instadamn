package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Cgp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28441Cgp {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0150, code lost:
    
        if (r14 == r0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C5Tl r32, X.EnumC27380C6j r33, java.lang.String r34, java.lang.String r35, X.C0s9 r36, int r37) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28441Cgp.A03(X.5Tl, X.C6j, java.lang.String, java.lang.String, X.0s9, int):void");
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(882084401);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-119116024, "com.instagram.creator.agent.settings.facts.fragment.LoadingSpinner (FactListScreen.kt:171)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            BIR.A03(c5Tl, c1130158n, A01);
            if (C0fH.A02()) {
                C0fH.A00(1557444827);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 41);
        }
    }

    public static final void A01(C5Tl c5Tl, C26064Bfs c26064Bfs, EnumC27380C6j enumC27380C6j, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE, int i) {
        int i2;
        c5Tl.Enr(-72763311);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, enumC27380C6j) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c26064Bfs);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16610sE);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 74899) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-916810212, "com.instagram.creator.agent.settings.facts.fragment.FactListLayout (FactListScreen.kt:113)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 1862638692, i2);
            Object EEc = c5Tl.EEc();
            if (A1Q || EEc == C5UI.A00) {
                EEc = C29908DGw.A01(c5Tl, interfaceC16820sZ, 20);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            BGP.A00(A00, c5Tl, (InterfaceC16820sZ) EEc);
            C1333560c A0P = AbstractC25229BEm.A0P(16.0f);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 1862643899, i2) | AbstractC25233BEq.A1K(i2) | AbstractC25233BEq.A1H(i2) | AbstractC25234BEr.A1W(i2) | AbstractC25234BEr.A1U(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1P || EEc2 == C5UI.A00) {
                EEc2 = new MIL(8, interfaceC16820sZ2, c26064Bfs, interfaceC16660sJ, enumC27380C6j, interfaceC16610sE);
                c5Tl.FBy(EEc2);
            }
            C6IS.A03(A0P, A00, c5Tl, null, AbstractC25225BEi.A1B(A0K, EEc2, false), 12583296, 121, true);
            if (C0fH.A02()) {
                C0fH.A00(11624423);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV8(enumC27380C6j, c26064Bfs, interfaceC16820sZ, interfaceC16610sE, interfaceC16660sJ, interfaceC16820sZ2, i, 5);
        }
    }

    public static final void A02(C5Tl c5Tl, EnumC27380C6j enumC27380C6j, C25984BeY c25984BeY, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE, int i) {
        int i2;
        c5Tl.Enr(-186973778);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, enumC27380C6j) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c25984BeY);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16610sE);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(442911814, "com.instagram.creator.agent.settings.facts.fragment.FactRow (FactListScreen.kt:181)");
            }
            CIJ.A00(c5Tl, null, null, C30485DbU.A00(c5Tl, c25984BeY, interfaceC16660sJ, 48, -1080213661), C5UA.A01(c5Tl, C30487DbW.A00(c25984BeY, enumC27380C6j, interfaceC16610sE, 18), -1964949468), 3456, 3);
            if (C0fH.A02()) {
                C0fH.A00(-1774725914);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(enumC27380C6j, interfaceC16610sE, c25984BeY, interfaceC16660sJ, i, 8);
        }
    }

    public static final void A04(C5Tl c5Tl, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        int i4;
        C29195Cu0 c29195Cu0;
        c5Tl.Enr(782190452);
        if ((i3 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, num) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0T(c5Tl, num2);
        }
        if ((i3 & 3072) == 0) {
            i4 |= AbstractC25232BEp.A0A(c5Tl, i2);
        }
        if ((i3 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i4 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((i4 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-11214654, "com.instagram.creator.agent.settings.facts.fragment.FactsListHeader (FactListScreen.kt:149)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(262674065);
            if (num != null) {
                C5WR.A0R(c5Tl, AbstractC118175Wb.A0D(c1130158n, 16.0f, 20.0f, 16.0f), AbstractC25225BEi.A0Y(c5Tl), AbstractC25228BEl.A16(c5Tl, num), AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            boolean z = true;
            String A17 = AbstractC25228BEl.A17(c5Tl, Integer.valueOf(i2), i);
            c5Tl.Eno(262687150);
            if (num2 == null) {
                c29195Cu0 = null;
            } else {
                String A16 = AbstractC25228BEl.A16(c5Tl, num2);
                c5Tl.Eno(-1277385406);
                if ((i4 & 57344) != 16384) {
                    z = false;
                }
                Object EEc = c5Tl.EEc();
                if (z || EEc == C5UI.A00) {
                    EEc = new C29908DGw(interfaceC16820sZ, 21);
                    c5Tl.FBy(EEc);
                }
                c29195Cu0 = new C29195Cu0(A16, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true);
            }
            C117505Tk.A0L(c117505Tk, false);
            BY1.A00(c5Tl, null, c29195Cu0, null, A17, 0, 46);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1518596732);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUH(num, interfaceC16820sZ, num2, i, i3, i2, 2);
        }
    }
}
