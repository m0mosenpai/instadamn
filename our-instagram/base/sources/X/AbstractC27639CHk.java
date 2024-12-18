package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CHk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27639CHk {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C26042BfV c26042BfV, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, int i) {
        int i2;
        c5Tl.Enr(2113670161);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26042BfV) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ4);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, modifier);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1424028589, "com.instagram.creator.achievements.modules.fragments.AchievementsHubScreen (AchievementsHubFragment.kt:289)");
            }
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            boolean z = true;
            Modifier A0Q = AbstractC25225BEi.A0Q(modifier);
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, c26042BfV, A11, -1267904702) | AbstractC25231BEo.A1K(i2) | AbstractC167007dF.A1P(i2 & 896, 256) | AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED);
            if ((i2 & 57344) != 16384) {
                z = false;
            }
            boolean z2 = A1W | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = new C43752JWo(5, A11, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ4, c26042BfV, interfaceC16660sJ3);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1O(c5Tl);
            C6IS.A04(null, c5Tl, A0Q, (InterfaceC16660sJ) EEc, 12582912, 126, true);
            if (C0fH.A02()) {
                C0fH.A00(-987553807);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV8(interfaceC16660sJ2, interfaceC16660sJ4, interfaceC16660sJ, modifier, interfaceC16660sJ3, c26042BfV, i, 3);
        }
    }
}
