package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CEO {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167017dG.A1O(str, interfaceC16820sZ);
        c5Tl.Enr(1296179470);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(839486570, "com.instagram.barcelona.feed.post.ui.PostLoopsHeader (PostLoopsHeader.kt:22)");
            }
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 2000836514, i3);
            Object EEc = c5Tl.EEc();
            if (A1Q || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0y(c5Tl, interfaceC16820sZ, 10);
            }
            AbstractC25225BEi.A1T(c5Tl);
            CEM.A00(c5Tl, modifier2, str, null, (InterfaceC16820sZ) EEc, null, C5UA.A01(c5Tl, new DS9(4, interfaceC16820sZ, z), 1031982033), R.drawable.instagram_users_pano_outline_24, 1572864 | ((i3 << 3) & 112) | (i3 & 7168), 36);
            if (C0fH.A02()) {
                C0fH.A00(-2006691130);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUP(interfaceC16820sZ, modifier2, str, i, i2, 1, z);
        }
    }
}
