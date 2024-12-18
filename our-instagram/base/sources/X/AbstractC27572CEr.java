package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CEr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27572CEr {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-250935523);
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
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1030931451, "com.instagram.barcelona.sponsored.ui.SponsoredLabelInHeader (SponsoredLabel.kt:40)");
            }
            C5WR.A0E(c5Tl, AbstractC25227BEk.A0K(modifier2, 4.0f), AbstractC25226BEj.A0c(c5Tl), str, 1, i3 & 14, 15352, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-1419379234);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT2(modifier2, str, i2, i, 5);
        }
    }
}
