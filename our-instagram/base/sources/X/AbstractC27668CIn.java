package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.CIn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27668CIn {
    public static final void A00(C5Tl c5Tl, ImageUrl imageUrl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(str, str2, imageUrl);
        C14360o3.A0B(interfaceC16820sZ, 4);
        c5Tl.Enr(-1888862545);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, imageUrl);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((57344 & i) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((46811 & i2) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1250114040, "com.instagram.fanclub.view.GuidanceRecommendationRow (GuidanceRecommendationRow.kt:38)");
            }
            C6C7 A0U = AbstractC25231BEo.A0U(str);
            if (AbstractC001900j.A0a(str, str2, false)) {
                int A0E = AbstractC25230BEn.A0E(str, str2);
                int A04 = AbstractC25226BEj.A04(str2, A0E);
                A0U.A06(new C5W3(null, null, null, C5W5.A01, null, 65531, 0L, 0L, 0L), A0E, A04);
                A0U.A0A(str2, "Bold username", A0E, A04);
            }
            C5C8 A02 = A0U.A02();
            C1130158n c1130158n = Modifier.A00;
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC25227BEk.A0N(C5XR.A05(c1130158n, null, null, interfaceC16820sZ, A1b), 16.0f));
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0Q);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0d, A042, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            C6LQ.A09(c5Tl, AbstractC25228BEl.A0X(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 62.0f), 72.0f), 4.0f), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 6), C5YJ.A00);
            IgClickableTextKt.A02(c5Tl, c6l0.A00(AbstractC118175Wb.A0B(c1130158n, 0.0f, 0.0f, 0.0f)), A02, AbstractC25226BEj.A0c(c5Tl), DO4.A00, 0, 0, DalvikInternals.IOPRIO_BACKGROUND, 112632, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(1624595742);
            if (z) {
                Modifier A0B = AbstractC118175Wb.A0B(c1130158n, 0.0f, 0.0f, 0.0f);
                InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                int A002 = C5X2.A00(c5Tl);
                C59P A043 = C117505Tk.A04(c117505Tk);
                Modifier A012 = C5X3.A01(c5Tl, A0B);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                }
                C5XJ.A00(c5Tl, A012, A1K);
                C5YS.A05(c5Tl, AbstractC118185Wd.A0C(c1130158n, 16.0f), C5Y7.A00(c5Tl, R.drawable.instagram_circle_check_pano_filled_16, 0), C5XL.A00(c5Tl).A10);
                c5Tl.ASW();
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-32735367);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUV(interfaceC16820sZ, imageUrl, str, str2, i, A1b ? 1 : 0, z);
        }
    }
}
