package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CHe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27633CHe {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C27829COs c27829COs, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c27829COs, 1);
        c5Tl.Enr(863979025);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, c27829COs);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1301564847, "com.instagram.creation.genai.themes.ui.AiThemesMoreMenuButton (AiThemesMoreMenuButton.kt:40)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -351708308);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5YS.A08(c5Tl, AbstractC118635Yc.A03(c5Tl, Modifier.A00, C5YD.A00(c5Tl, 2131975451), new DH0(46, c27829COs, interfaceC74953Yl)), C5Y7.A00(c5Tl, R.drawable.instagram_more_horizontal_pano_outline_24, 0), C5YD.A00(c5Tl, 2131975450), 8, AbstractC25226BEj.A0H(c5Tl));
            boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
            EnumC27361C5q enumC27361C5q = EnumC27361C5q.A02;
            long A002 = AbstractC27485CBg.A00(-50.0f, 8.0f);
            C30183DRo c30183DRo = new C30183DRo(27, interfaceC74953Yl, c27829COs);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1937970327);
            if (A0q2 == obj) {
                A0q2 = new C57242PbQ(interfaceC74953Yl, 13);
                c5Tl.FBy(A0q2);
            }
            CY0.A00(null, c5Tl, null, enumC27361C5q, AbstractC25225BEi.A1A(A0K, A0q2, false), c30183DRo, C30434Daf.A00, 221568, 193, A002, A1X, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-302803551);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(c27829COs, modifier2, i2, i, 31);
        }
    }
}
