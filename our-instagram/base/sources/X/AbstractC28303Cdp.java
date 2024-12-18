package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.Cdp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28303Cdp {
    public static final void A02(C5Tl c5Tl, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-1499458369);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1110168010, "com.instagram.compose.igds.components.textcell.IgdsFooter (IgdsFooter.kt:24)");
            }
            C5WR.A09(c5Tl, AbstractC118175Wb.A0E(modifier2, C5XT.A00(c5Tl), C5XT.A01(c5Tl), C5XT.A00(c5Tl), C5XT.A00(c5Tl)), A00(c5Tl), str, i3 & 14);
            if (C0fH.A02()) {
                C0fH.A00(1208942205);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT2(modifier2, str, i2, i, 6);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, C5C8 c5c8, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1D(c5c8, 0, interfaceC16660sJ);
        c5Tl.Enr(328979171);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c5c8) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1506042761, "com.instagram.compose.igds.components.textcell.IgdsFooterWithClickableText (IgdsFooter.kt:43)");
            }
            IgClickableTextKt.A02(c5Tl, AbstractC118175Wb.A0E(modifier2, C5XT.A00(c5Tl), C5XT.A01(c5Tl), C5XT.A00(c5Tl), C5XT.A00(c5Tl)), c5c8, A00(c5Tl), interfaceC16660sJ, 0, i3 & 14, (i3 << 6) & 57344, 112636, 0L);
            if (C0fH.A02()) {
                C0fH.A00(-2121738058);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 22, c5c8, interfaceC16660sJ, modifier2);
        }
    }

    public static final C118125Vw A00(C5Tl c5Tl) {
        C118125Vw A00;
        if (AbstractC25227BEk.A1U(c5Tl, 2057586684)) {
            C0fH.A01(1121024972, "com.instagram.compose.igds.components.textcell.<get-footerStyle> (IgdsFooter.kt:60)");
        }
        A00 = C118125Vw.A00(null, null, AbstractC25225BEi.A0Y(c5Tl), null, null, null, 0, 0, 0, 6291454, AbstractC25226BEj.A0M(c5Tl), 0L, 0L, 0L);
        if (C0fH.A02()) {
            C0fH.A00(525813645);
        }
        AbstractC25225BEi.A1V(c5Tl, false);
        return A00;
    }
}
