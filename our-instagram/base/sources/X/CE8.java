package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CE8 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        Modifier modifier2 = modifier;
        c5Tl.Enr(1612951351);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                interfaceC16820sZ2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(-446691994, "com.instagram.barcelona.feed.post.ui.FirstPostLabel (FirstPostLabel.kt:10)");
            }
            int i6 = i3 << 9;
            CEM.A00(c5Tl, modifier2, C5YD.A00(c5Tl, 2131953653), null, interfaceC16820sZ2, null, null, R.drawable.instagram_star_pano_outline_24, (i6 & 7168) | (i6 & 57344), 100);
            if (C0fH.A02()) {
                C0fH.A00(-1124218683);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, interfaceC16820sZ2, i2, i, 14);
        }
    }
}
