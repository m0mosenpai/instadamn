package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CYx {
    public static final void A01(C5Tl c5Tl, String str, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i, boolean z, boolean z2) {
        int i2;
        int A06 = AbstractC167007dF.A06(0, interfaceC16660sJ, str);
        c5Tl.Enr(405454400);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c5Hc);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0f(c5Tl, z2);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2120474132, "com.instagram.schools.management.badge.EditBadgeComposeView (EditBadgeComposeView.kt:29)");
            }
            if (AbstractC25235BEs.A1Z(c5Tl, new DTN(AbstractC25230BEn.A0P(c5Tl), str, interfaceC16660sJ, c5Hc, z, z2), -244604862)) {
                C0fH.A00(-1809971764);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUQ(interfaceC16660sJ, c5Hc, str, i, A06, z, z2);
        }
    }

    public static final void A00(C5Tl c5Tl, String str, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i) {
        int i2;
        c5Tl.Enr(480890691);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1332824529, "com.instagram.schools.management.badge.BadgeNamesList (EditBadgeComposeView.kt:58)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 1182643292, i2) | AbstractC25231BEo.A1K(i2) | AbstractC167007dF.A1P(i2 & 896, 256);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A11(c5Tl, interfaceC16660sJ, c5Hc, str, 35);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A05(A00, c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(-518801583);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(interfaceC16660sJ, c5Hc, str, i, 13);
        }
    }
}
