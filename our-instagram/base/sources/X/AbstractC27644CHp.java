package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CHp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27644CHp {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        InterfaceC16660sJ interfaceC16660sJ2 = interfaceC16660sJ;
        String str3 = str2;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(1506058392);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i3 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                interfaceC16660sJ2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(886898853, "com.instagram.creator.achievements.modules.views.CreatorTip (CreatorTip.kt:27)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            boolean z = true;
            boolean A1W = AbstractC167007dF.A1W(str3);
            C5XQ A0W = AbstractC25225BEi.A0W(0);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, -1162078676, i3);
            if ((i3 & 7168) != 2048) {
                z = false;
            }
            boolean z2 = A1Q | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A14(c5Tl, interfaceC16660sJ2, str3, 30);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A04 = AbstractC118175Wb.A04(AbstractC25228BEl.A0Z(C5XR.A05(modifier2, A0W, null, (InterfaceC16820sZ) EEc, A1W), 8.0f, AbstractC25226BEj.A0B(c5Tl)));
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
            C1130158n c1130158n = Modifier.A00;
            C5YS.A08(c5Tl, AbstractC118175Wb.A0E(c6l0.AB7(interfaceC118225Wj, c1130158n), 0.0f, 0.0f, 16.0f, 0.0f), C5Y7.A00(c5Tl, R.drawable.instagram_bulb_pano_outline_24, 0), "", 56, C5XL.A00(c5Tl).A0O);
            C5WR.A0N(c5Tl, c6l0.A00(c1130158n), AbstractC25225BEi.A0Y(c5Tl), str, i3 & 14, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(-106145238);
            if (str3 != null) {
                C5YS.A08(c5Tl, AbstractC118175Wb.A0E(c6l0.AB7(interfaceC118225Wj, c1130158n), 16.0f, 0.0f, 0.0f, 0.0f), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_filled_12, 0), "", 56, AbstractC25226BEj.A0L(c5Tl));
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(301069120);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUU(modifier2, interfaceC16660sJ2, str, str3, i, i2, 4);
        }
    }
}
