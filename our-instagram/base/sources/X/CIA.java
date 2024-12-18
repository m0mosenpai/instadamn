package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CIA {
    public static final void A00(C5Tl c5Tl, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(str, str2, str3);
        C14360o3.A0B(interfaceC16820sZ, 4);
        c5Tl.Enr(-546780930);
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
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1738655893, "com.instagram.creator.agent.onboarding.fragment.CreatorAiPreparationScreen (CreatorAiPreparationScreen.kt:33)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0U);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0P, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, A1b));
            C6LQ.A03(c5Tl, AbstractC25236BEt.A0H(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 44.0f), 140.0f), AbstractC43541zP.A00(c5Tl, AbstractC25234BEr.A0U(c5Tl)));
            C5WR.A08(c5Tl, AbstractC118175Wb.A0E(AbstractC118175Wb.A0A(c1130158n, 32.0f, 0.0f), 0.0f, 0.0f, 0.0f, 15.0f), C5XL.A01(c5Tl).A04, str, (i2 & 14) | 48);
            C5WR.A0P(c5Tl, AbstractC118175Wb.A0A(c1130158n, 32.0f, 0.0f), AbstractC25225BEi.A0Y(c5Tl), str2, AbstractC25225BEi.A03(i2), AbstractC25226BEj.A0M(c5Tl));
            boolean z2 = false;
            AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, A1b));
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            c5Tl.Eno(412779175);
            if ((i2 & 57344) == 16384) {
                z2 = true;
            }
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = C29911DGz.A01(interfaceC16820sZ, 34);
                c5Tl.FBy(EEc);
            }
            AbstractC28506Chz.A03(c5Tl, A0T, null, str3, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), null, null, ((i2 >> 6) & 14) | 384 | ((i2 << 3) & 57344), 3072, 24552, false, z, A1b);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-983885743);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTJ(str, str2, str3, interfaceC16820sZ, i, z);
        }
    }
}
