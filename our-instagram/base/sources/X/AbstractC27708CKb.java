package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CKb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27708CKb {
    public static final void A00(C5Tl c5Tl, ImageUrl imageUrl, String str, float f, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(878708003);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A05(c5Tl, f);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-874582703, "com.instagram.wonderwall.ui.compose.components.WallUserProfilePhoto (WallUserProfilePhoto.kt:21)");
            }
            C6LQ.A0C(c5Tl, AbstractC25231BEo.A0R(Modifier.A00, f), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 3), AbstractC25235BEs.A0p(c5Tl, str, 2131970226), 0);
            if (C0fH.A02()) {
                C0fH.A00(161046109);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT1(imageUrl, str, f, i, 1);
        }
    }
}
