package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CGT {
    public static final void A00(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(1363996702);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(142013120, "com.instagram.compose.ui.notificationbadge.ListBadgeDonut (ListBadgeDonut.kt:14)");
            }
            C6LQ.A03(c5Tl, AbstractC118185Wd.A0C(modifier, 20.0f), AbstractC25227BEk.A0P(c5Tl, R.drawable.list_badge_donut));
            if (C0fH.A02()) {
                C0fH.A00(74110501);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, modifier, i2, i, 10);
        }
    }
}
