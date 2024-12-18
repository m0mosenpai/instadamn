package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CYS {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C26074Bg3 c26074Bg3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        boolean z;
        c5Tl.Enr(-79656142);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c26074Bg3, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ3);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16620sF);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-382556569, "com.instagram.creator.agent.settings.keyword.AddKeywordSection (AddKeywordFragment.kt:192)");
            }
            Long l = c26074Bg3.A06;
            c5Tl.Eno(-844980281);
            boolean z2 = false;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && c5Tl.AH6(c26074Bg3))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1V = AbstractC25228BEl.A1V(c5Tl, l, z | AbstractC167007dF.A1P(i2 & 896, 256) | AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED), AbstractC25234BEr.A1W(i2));
            if ((458752 & i2) == 131072) {
                z2 = true;
            }
            boolean z3 = A1V | z2;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == C5UI.A00) {
                EEc = new C43752JWo(8, c26074Bg3, interfaceC16620sF, interfaceC16660sJ, interfaceC16660sJ2, l, interfaceC16660sJ3);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1O(c5Tl);
            C6IS.A07(c5Tl, modifier, (InterfaceC16660sJ) EEc, i2 & 14);
            if (C0fH.A02()) {
                C0fH.A00(-1264186496);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV8(interfaceC16660sJ2, c26074Bg3, interfaceC16660sJ, interfaceC16660sJ3, interfaceC16620sF, modifier, i, 7);
        }
    }

    public static final void A01(C5Tl c5Tl, C26074Bg3 c26074Bg3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        String str;
        int i3;
        c5Tl.Enr(1989795282);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c26074Bg3, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1471644906, "com.instagram.creator.agent.settings.keyword.AddKeywordLayout (AddKeywordFragment.kt:159)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A00 = C30711Df9.A00(c1130158n, C5XU.A00, 0);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            C25707BXs c25707BXs = new C25707BXs(null, 7, 0);
            c5Tl.Eno(-1018451786);
            if (c26074Bg3.A0A) {
                str = C5YD.A00(c5Tl, 2131952310);
            } else {
                str = c26074Bg3.A08;
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC25708BXt.A04(c5Tl, c25707BXs, str);
            Modifier A003 = c6gm.A00(c1130158n, true);
            int i4 = i2 << 3;
            A00(c5Tl, A003, c26074Bg3, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16620sF, AbstractC25229BEm.A05(i4, i4 & 112) | (57344 & i4) | (i4 & 458752));
            if (c26074Bg3.A0C) {
                c5Tl.Eno(-1018438086);
                i3 = 2131964730;
            } else {
                c5Tl.Eno(-1018436084);
                i3 = 2131972699;
            }
            String A004 = C5YD.A00(c5Tl, i3);
            C117505Tk.A0L(c117505Tk, false);
            boolean A1X = AbstractC167007dF.A1X(c26074Bg3.A02, C6R.A03);
            boolean z = true;
            if (c26074Bg3.A08.length() <= 0 || c26074Bg3.A07.length() <= 0 || !(c26074Bg3.A04 instanceof C29248Cur) || !(c26074Bg3.A05 instanceof C29248Cur)) {
                z = false;
            }
            c5Tl.Eno(-1018429792);
            boolean A1N = AbstractC25231BEo.A1N(i2, 458752, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            Object EEc = c5Tl.EEc();
            if (A1N || EEc == C5UI.A00) {
                EEc = C29887DGb.A00(interfaceC16820sZ, 7);
                c5Tl.FBy(EEc);
            }
            AbstractC28506Chz.A0B(c5Tl, A004, AbstractC25225BEi.A1A(c117505Tk, EEc, false), z, A1X);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(573597325);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV8(interfaceC16660sJ2, c26074Bg3, interfaceC16660sJ, interfaceC16620sF, interfaceC16820sZ, interfaceC16660sJ3, i, 6);
        }
    }
}
