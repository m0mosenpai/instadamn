package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterElement;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CGV {
    public static final void A00(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(-102115042);
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
                C0fH.A01(-1014048449, "com.instagram.compose.ui.notificationbadge.ListNewBadge (ListNewBadge.kt:20)");
            }
            C2DC A0P = AbstractC25227BEk.A0P(c5Tl, R.drawable.list_new_badge_background);
            String A00 = C5YD.A00(c5Tl, 2131968436);
            C5WR.A0a(c5Tl, AbstractC118175Wb.A0A(modifier.Eq3(new PainterElement(C118195Wf.A09, null, A0P, C5YJ.A01, 1.0f)), 6.0f, 4.0f), C5W5.A03, A00, 199680, 32720, AbstractC25226BEj.A0H(c5Tl), AbstractC118155Vz.A01(10));
            if (C0fH.A02()) {
                C0fH.A00(-809185127);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, modifier, i2, i, 11);
        }
    }
}
