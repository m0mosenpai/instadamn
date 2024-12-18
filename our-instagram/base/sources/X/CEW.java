package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CEW {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, c5Hc, interfaceC16660sJ);
        c5Tl.Enr(1757043678);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-462134330, "com.instagram.barcelona.feed.post.ui.RelevantTagsRow (RelevantTagsRow.kt:30)");
            }
            LazyListState A0E = AbstractC25227BEk.A0E(c5Tl);
            C6ID A01 = AbstractC118255Wn.A01(12.0f);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            Modifier A09 = AbstractC118185Wd.A09(AbstractC118175Wb.A0D(C6HP.A00(modifier2, 0.0f, false), 12.0f, 11.0f, 11.0f), 28.0f);
            boolean A1X = AbstractC25234BEr.A1X(c5Tl, 1110230314, i3) | AbstractC25233BEq.A1I(i3);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A0y(c5Tl, c5Hc, interfaceC16660sJ, 5);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            CG9.A00(null, A01, null, A0E, c5Tl, interfaceC118225Wj, A09, null, "relevant_tags_row", (InterfaceC16660sJ) EEc, null, 102432774, 0, 1688, false, A1R);
            if (C0fH.A02()) {
                C0fH.A00(-944752368);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 15, modifier2, c5Hc, interfaceC16660sJ);
        }
    }
}
