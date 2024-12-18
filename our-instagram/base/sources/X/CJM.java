package X;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public abstract class CJM {
    @Deprecated(message = "DO NOT USE -- use IgdsButton instead (this is only for QE investigation)")
    public static final void A00(C5Tl c5Tl, Modifier modifier, C6GC c6gc, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        AbstractC167007dF.A1E(c6gc, 1, interfaceC16820sZ);
        c5Tl.Enr(-1431770245);
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
            i3 |= AbstractC25232BEp.A0S(c5Tl, c6gc);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-586369363, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestButton (FollowRequestButton.kt:39)");
            }
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, 194182054);
            AbstractC25225BEi.A1V(c5Tl, false);
            C5WR.A0M(c5Tl, AbstractC118185Wd.A02(C118195Wf.A09, AbstractC118175Wb.A0A(AbstractC118185Wd.A05(AbstractC25230BEn.A0V(c5Tl, AbstractC118645Yd.A00(c5xo, C5XR.A00(null, c5xo, AnonymousClass598.A00(modifier2, DOY.A00, true), AbstractC25225BEi.A0W(0), null, interfaceC16820sZ, true), 0.3f, true), c6gc.ADC(false)), c6gc.Cpd(C6GD.A03)), 12.0f, 5.0f)), AbstractC25226BEj.A0h(c5Tl), str, i3 & 14, c6gc.AJo(true));
            if (C0fH.A02()) {
                C0fH.A00(-1574070331);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUR(modifier2, interfaceC16820sZ, c6gc, str, i, i2, 4);
        }
    }
}
