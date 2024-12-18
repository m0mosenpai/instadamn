package X;

import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes5.dex */
public abstract class CYz {
    public static final void A00(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i, boolean z, boolean z2) {
        int i2;
        C14360o3.A0B(interfaceC16660sJ, 0);
        c5Tl.Enr(-738731530);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c5Hc);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1017508094, "com.instagram.schools.management.visibility.EditVisibilityComposeView (EditVisibilityComposeView.kt:29)");
            }
            if (AbstractC25235BEs.A1Z(c5Tl, new DTZ(1, AbstractC25226BEj.A19(c5Tl), interfaceC16660sJ, c5Hc, z, z2), -4220424)) {
                C0fH.A00(-1873687418);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTW(interfaceC16660sJ, c5Hc, i, 1, z, z2);
        }
    }

    public static final void A01(C5Hc c5Hc, InterfaceC16660sJ interfaceC16660sJ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-350465505);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1076324732, "com.instagram.schools.management.visibility.VisibilityOptionsList (EditVisibilityComposeView.kt:55)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c5Hc, 376581985) | AbstractC25228BEl.A1T(i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new C57750Pjd(39, interfaceC16660sJ, c5Hc);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1O(c5Tl);
            C6IS.A05(A00, c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(1578186560);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, interfaceC16660sJ, c5Hc, i, 14);
        }
    }
}
