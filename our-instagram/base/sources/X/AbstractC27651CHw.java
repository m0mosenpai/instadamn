package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CHw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27651CHw {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 2);
        c5Tl.Enr(248027749);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
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
                C0fH.A01(-1691603085, "com.instagram.creator.achievements.modules.views.EarnedOnMediaRowV2 (EarnedOnMediaRowV2.kt:43)");
            }
            if (str != null) {
                InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
                C5XQ A0W = AbstractC25225BEi.A0W(0);
                c5Tl.Eno(-806945275);
                int i5 = i3 & 896;
                boolean A1P = AbstractC167007dF.A1P(i5, 256);
                Object EEc = c5Tl.EEc();
                if (A1P || EEc == C5UI.A00) {
                    EEc = C29911DGz.A01(interfaceC16820sZ, 9);
                    c5Tl.FBy(EEc);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                Modifier A04 = AbstractC118175Wb.A04(AbstractC25228BEl.A0Z(C5XR.A05(modifier2, A0W, null, (InterfaceC16820sZ) EEc, true), 8.0f, AbstractC25226BEj.A0B(c5Tl)));
                InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
                int A00 = C5X2.A00(c5Tl);
                C59P A042 = C117505Tk.A04(A0K);
                Modifier A01 = C5X3.A01(c5Tl, A04);
                AbstractC25233BEq.A11(c5Tl, A0K);
                AbstractC25231BEo.A12(c5Tl, A0V, A042);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C6L0 c6l0 = C6L0.A00;
                C2DB A0d = AbstractC25235BEs.A0d(c5Tl, str);
                C1130158n c1130158n = Modifier.A00;
                Modifier A0X = AbstractC25228BEl.A0X(C6L7.A01(C6G9.A00(1.0f, AbstractC25226BEj.A0E(c5Tl)), AbstractC118185Wd.A0C(c1130158n, 32.0f), C5WF.A01(4.0f)), 4.0f);
                boolean A1S = AbstractC25229BEm.A1S(c5Tl, 847999044, i5, 256);
                Object EEc2 = c5Tl.EEc();
                if (A1S || EEc2 == C5UI.A00) {
                    EEc2 = C29911DGz.A01(interfaceC16820sZ, 10);
                    c5Tl.FBy(EEc2);
                }
                C6LQ.A04(c5Tl, C5XR.A05(A0X, null, null, AbstractC25225BEi.A1A(A0K, EEc2, false), true), A0d);
                c5Tl.Eno(848002137);
                if (str2 != null) {
                    C5WR.A0R(c5Tl, AbstractC118175Wb.A0E(c6l0.FE5(c1130158n, 1.0f, true), 16.0f, 0.0f, 0.0f, 0.0f), AbstractC25225BEi.A0Y(c5Tl), str2, AbstractC25226BEj.A0G(c5Tl));
                }
                C117505Tk.A0L(A0K, false);
                C5YS.A08(c5Tl, AbstractC118175Wb.A0E(c6l0.AB7(interfaceC118225Wj, c1130158n), 16.0f, 0.0f, 0.0f, 0.0f), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_filled_12, 0), "", 56, AbstractC25226BEj.A0L(c5Tl));
                c5Tl.ASW();
            }
            if (C0fH.A02()) {
                C0fH.A00(172545682);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUU(modifier2, interfaceC16820sZ, str2, str, i, i2, 5);
        }
    }
}
