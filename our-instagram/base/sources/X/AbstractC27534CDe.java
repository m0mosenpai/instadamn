package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CDe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27534CDe {
    public static final void A00(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        AbstractC167007dF.A1D(modifier, 0, interfaceC16660sJ);
        c5Tl.Enr(2095217660);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1116746264, "com.instagram.archive.updateshub.PreviewNuxPog (PreviewNuxPog.kt:28)");
            }
            if (imageUrl != null) {
                c5Tl.Eno(-1332593931);
                Object A0q = AbstractC25227BEk.A0q(c5Tl, -2121195546);
                Object obj = C5UI.A00;
                if (A0q == obj) {
                    A0q = AbstractC25232BEp.A0w(c5Tl, null);
                }
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                C2DB A01 = AbstractC43541zP.A01(c5Tl, imageUrl, (i2 >> 3) & 14);
                C29193Cty c29193Cty = C29193Cty.A00;
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -2121186220);
                if (A0q2 == obj) {
                    A0q2 = AbstractC25235BEs.A14(c5Tl, interfaceC74953Yl, 5);
                }
                Modifier A0B = AbstractC25233BEq.A0B(A0K, modifier, A0q2);
                boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, -2121183936, i2);
                Object EEc = c5Tl.EEc();
                if (A1Q || EEc == obj) {
                    EEc = new MHV(interfaceC74953Yl, interfaceC16660sJ, 6);
                    c5Tl.FBy(EEc);
                }
                BGD.A01(c5Tl, CY3.A01(c5Tl, A0B, AbstractC25225BEi.A1A(A0K, EEc, false)), A01, null, c29193Cty, null, 1572912, 0, 1976, true);
            } else {
                c5Tl.Eno(-1332063242);
                C6LQ.A03(c5Tl, AbstractC118185Wd.A0D(modifier, 110.0f), C5Y7.A00(c5Tl, R.drawable.ig_illustrations_illo_my_week_refresh, 0));
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(-1319142899);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(interfaceC16660sJ, imageUrl, modifier, i, 13);
        }
    }
}
