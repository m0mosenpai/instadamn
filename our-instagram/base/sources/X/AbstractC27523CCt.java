package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CCt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27523CCt {
    public static final void A00(C5Tl c5Tl, ImageUrl imageUrl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        ImageUrl imageUrl2 = imageUrl;
        String str3 = str2;
        boolean z2 = z;
        AbstractC167007dF.A1F(str, 1, interfaceC16820sZ);
        c5Tl.Enr(-2133355088);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, imageUrl2);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            boolean z3 = true;
            z2 = AbstractC25226BEj.A1V(i4, z2);
            if (i5 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                imageUrl2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(-607300373, "com.instagram.aistudio.editor.ChatThemeRow (ChatThemeRow.kt:39)");
            }
            Modifier modifier = Modifier.A00;
            Modifier A00 = CB8.A00(AbstractC118175Wb.A0A(modifier, C5XT.A00(c5Tl), 0.0f), AbstractC25230BEn.A00(z2 ? 1 : 0));
            c5Tl.Eno(-154762530);
            if ((57344 & i3) != 16384) {
                z3 = false;
            }
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == C5UI.A00) {
                EEc = DGX.A00(interfaceC16820sZ, 8);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A00, null, null, (InterfaceC16820sZ) EEc, z2);
            InterfaceC1127857k A0S = AbstractC25231BEo.A0S(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0S, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            Modifier A0X = AbstractC25228BEl.A0X(AbstractC118185Wd.A0D(AbstractC118185Wd.A08(modifier, 48.0f), 24.0f), 4.0f);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6LQ.A0A(c5Tl, null, AbstractC25226BEj.A0w(c5Tl, imageUrl2, i3 >> 9), C5YJ.A02, 24624, 108);
            c5Tl.ASW();
            Modifier FE5 = c6l0.FE5(AbstractC118175Wb.A0E(modifier, C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap), C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap), 0.0f, C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap)), 1.0f, true);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, FE5);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C5WR.A0q(c5Tl, AbstractC25226BEj.A0g(c5Tl), str, (i3 >> 3) & 14, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(-1372082057);
            if (str3 != null) {
                C5WR.A0q(c5Tl, AbstractC25226BEj.A0c(c5Tl), str3, (i3 >> 6) & 14, AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            C2DC A005 = C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_outline_16, 0);
            long A0L = AbstractC25226BEj.A0L(c5Tl);
            if (AbstractC13620mo.A02(AbstractC25228BEl.A0K(c5Tl))) {
                modifier = CBB.A00(modifier, -1.0f, 1.0f);
            }
            C5YS.A06(c5Tl, modifier, A005, A0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1253572832);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVG(imageUrl2, interfaceC16820sZ, str3, str, i2, i, 0, z2);
        }
    }
}
