package X;

import androidx.compose.ui.Modifier;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.CHl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27640CHl {
    public static final void A00(C5Tl c5Tl, Modifier modifier, Badge.ChallengeBadge challengeBadge, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        String A17;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1K(challengeBadge, interfaceC16660sJ);
        c5Tl.Enr(-912724762);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, challengeBadge) | i;
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
                C0fH.A01(-1567739949, "com.instagram.creator.achievements.modules.fragments.ChallengeTierRow (ChallengeTiersFragment.kt:97)");
            }
            String str = challengeBadge.A06;
            String str2 = challengeBadge.A0C;
            Integer num = challengeBadge.A03;
            c5Tl.Eno(655551243);
            if (num == null) {
                A17 = null;
            } else {
                A17 = AbstractC25228BEl.A17(c5Tl, AbstractC25235BEs.A0o(num.intValue()), 2131952129);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            String str3 = challengeBadge.A05;
            c5Tl.Eno(655560751);
            boolean AH6 = c5Tl.AH6(challengeBadge) | AbstractC25231BEo.A1L(i3);
            Object EEc = c5Tl.EEc();
            if (AH6 || EEc == C5UI.A00) {
                EEc = C29894DGi.A00(c5Tl, interfaceC16660sJ, challengeBadge, 5);
            }
            AbstractC27646CHr.A00(c5Tl, AbstractC25229BEm.A0T(A0K, modifier2, EEc), str, str2, A17, str3, 0, 0);
            if (C0fH.A02()) {
                C0fH.A00(-372250735);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 24, challengeBadge, interfaceC16660sJ, modifier2);
        }
    }
}
