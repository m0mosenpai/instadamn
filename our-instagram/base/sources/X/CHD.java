package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CHD {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C61 c61, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1D(interfaceC16660sJ, 0, interfaceC16820sZ);
        c5Tl.Enr(1166477740);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, c61);
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
                C0fH.A01(1198213503, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageMoreMenuButton (MagicModGeneratedImageMoreMenuButton.kt:35)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1963708611);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -1963706413, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = AbstractC25229BEm.A0Q(c5Tl, new DH4(c61, 32));
            }
            InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) EEc;
            C117505Tk.A0L(A0K, false);
            Alignment alignment = C118195Wf.A09;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0V = AbstractC25226BEj.A0V(modifier2);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, -1963699281, i3);
            Object EEc2 = c5Tl.EEc();
            if (A1Q || EEc2 == obj) {
                EEc2 = DH0.A01(c5Tl, interfaceC16820sZ, interfaceC74953Yl, 9);
            }
            Modifier A0H = AbstractC25235BEs.A0H(c5Tl, A0K, A0V, EEc2);
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0H);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5YS.A07(c5Tl, null, C5Y7.A00(c5Tl, R.drawable.instagram_more_horizontal_pano_outline_24, 0), null, AbstractC136736Hc.A00(c5Tl, 2131965955), 8, 20, AbstractC25225BEi.A0C(c5Tl));
            AbstractC28388Cfr.A03(c5Tl, C72.A07, null, AbstractC136736Hc.A00(c5Tl, 2131965946), interfaceC16820sZ, ((i3 << 3) & 7168) | 384, 2032, 0L, AbstractC25231BEo.A1U(interfaceC74963Ym));
            c5Tl.ASW();
            boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
            EnumC27361C5q enumC27361C5q = EnumC27361C5q.A03;
            long A004 = AbstractC27485CBg.A00(10.0f, 10.0f);
            boolean A1X2 = AbstractC25234BEr.A1X(c5Tl, -273473861, i3);
            Object EEc3 = c5Tl.EEc();
            if (A1X2 || EEc3 == obj) {
                EEc3 = new C30183DRo(9, interfaceC74953Yl, interfaceC16660sJ);
                c5Tl.FBy(EEc3);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc3, false);
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -273466918);
            if (A0q3 == obj) {
                A0q3 = DH4.A02(c5Tl, interfaceC74953Yl, 31);
            }
            CY0.A00(null, c5Tl, null, enumC27361C5q, AbstractC25225BEi.A1A(A0K, A0q3, false), A1B, C30428DaZ.A00, 221568, 193, A004, A1X, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-902053705);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(c61, interfaceC16820sZ, interfaceC16660sJ, modifier2, i, i2, 14);
        }
    }
}
