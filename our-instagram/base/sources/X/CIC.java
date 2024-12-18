package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CIC {
    public static final void A00(C5Tl c5Tl, C26084BgD c26084BgD, C26045BfY c26045BfY, String str, String str2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, int i2) {
        int i3;
        boolean z;
        c5Tl.Enr(219739289);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF2);
        }
        if ((196608 & i2) == 0) {
            i3 |= AbstractC25229BEm.A02(AbstractC25233BEq.A1V(c5Tl, c26045BfY, i2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) ? 1 : 0);
        }
        if ((1572864 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0X(c5Tl, c26084BgD);
        }
        if ((i3 & 599187) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1620574942, "com.instagram.creator.agent.settings.facts.fragment.AddFact (AddFactFragment.kt:182)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1382870791);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, str);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1382868841);
            if (A0q2 == obj) {
                A0q2 = AbstractC25232BEp.A0w(c5Tl, str2);
            }
            C117505Tk.A0L(c117505Tk, false);
            Object A0V = AbstractC25236BEt.A0V(c5Tl, obj, -1382866518);
            C1130158n A0O = AbstractC25225BEi.A0O(c117505Tk);
            Modifier A00 = C30711Df9.A00(A0O, C5XU.A00, 0);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Modifier A003 = C6GM.A00.A00(A0O, true);
            C1333560c c1333560c = new C1333560c(0.0f, 16.0f, 0.0f, 24.0f);
            c5Tl.Eno(-237004769);
            int i4 = i3 & 458752;
            if (i4 == 131072 || ((i3 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && c5Tl.AH6(c26045BfY))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1H = z | AbstractC25233BEq.A1H(i3) | AbstractC25233BEq.A1K(i3) | AbstractC25233BEq.A1L(i3);
            Object EEc = c5Tl.EEc();
            if (A1H || EEc == obj) {
                EEc = new DIE(c26045BfY, c26084BgD, interfaceC16620sF, A0q, A0q2, A0V, i, 0);
                c5Tl.FBy(EEc);
            }
            C6IS.A03(c1333560c, null, c5Tl, A003, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 12583296, 122, true);
            boolean z2 = false;
            String A004 = AbstractC136736Hc.A00(c5Tl, 2131972699);
            boolean A1X = AbstractC167007dF.A1X(c26045BfY.A02, C6R.A03);
            boolean z3 = c26045BfY.A06;
            c5Tl.Eno(-236953364);
            boolean A1R = AbstractC25232BEp.A1R(i3 & 57344);
            Object EEc2 = c5Tl.EEc();
            if (A1R || EEc2 == obj) {
                EEc2 = new ME5(33, A0q2, A0q, interfaceC16620sF2);
                c5Tl.FBy(EEc2);
            }
            AbstractC28506Chz.A0B(c5Tl, A004, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), z3, A1X);
            c5Tl.ASW();
            c5Tl.Eno(-1382804364);
            if (i4 == 131072 || ((i3 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && c5Tl.AH6(c26045BfY))) {
                z2 = true;
            }
            Object EEc3 = c5Tl.EEc();
            if (z2 || EEc3 == obj) {
                EEc3 = new D53(A0V, c26045BfY, null, 22);
                c5Tl.FBy(EEc3);
            }
            if (AbstractC25232BEp.A1V(c5Tl, c117505Tk, EEc3, A0V, false)) {
                C0fH.A00(1383934101);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30295DVw(interfaceC16620sF, interfaceC16620sF2, c26045BfY, c26084BgD, str, str2, i, i2, 2);
        }
    }
}
