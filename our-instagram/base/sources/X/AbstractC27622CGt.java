package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CGt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27622CGt {
    public static final void A00(C5Tl c5Tl, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        AbstractC25234BEr.A0j(1, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3);
        c5Tl.Enr(-1907256422);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ2);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ3);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(176293321, "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetContent (CreationGenAIAttributionBottomSheetContent.kt:26)");
            }
            C0eB c0eB = C0eB.A00;
            c5Tl.Eno(-691635091);
            boolean A1N = AbstractC25231BEo.A1N(458752, i2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            Object EEc = c5Tl.EEc();
            if (A1N || EEc == C5UI.A00) {
                EEc = new PYX(interfaceC16820sZ3, null, 34);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0E = AbstractC25235BEs.A0E(c5Tl, EEc, c0eB);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E2 = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, C5XT.A00(c5Tl));
            InterfaceC1127857k A0Z = AbstractC25226BEj.A0Z(c5Tl, interfaceC118245Wl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0E);
            Modifier A01 = C5X3.A01(c5Tl, A0E2);
            AbstractC25233BEq.A11(c5Tl, A0E);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0E.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0P(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, C5XT.A00(c5Tl)), AbstractC25226BEj.A0d(c5Tl), str, i2 & 14, A0G);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C5WR.A0P(c5Tl, AbstractC118185Wd.A07(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, C5XT.A00(c5Tl)), 0.75f), AbstractC25226BEj.A0c(c5Tl), str2, (i2 >> 3) & 14, A0M);
            c5Tl.Eno(-164340283);
            if (str3 != null) {
                boolean A1a = AbstractC25234BEr.A1a(c5Tl, -164336183, i2);
                Object EEc2 = c5Tl.EEc();
                if (A1a || EEc2 == C5UI.A00) {
                    EEc2 = new C50166MDt(interfaceC16820sZ, 39);
                    c5Tl.FBy(EEc2);
                }
                AbstractC28506Chz.A0D(AbstractC25225BEi.A1A(A0E, EEc2, false), str3, c5Tl, (i2 >> 6) & 14);
            }
            C117505Tk.A0L(A0E, false);
            AbstractC27626CGx.A00(interfaceC16820sZ2, c5Tl, (i2 >> 12) & 14);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1894440490);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVJ(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, str, str2, str3, i, 1);
        }
    }
}
