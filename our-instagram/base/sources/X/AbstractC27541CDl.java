package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CDl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27541CDl {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(1580599782);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
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
                C0fH.A01(-162908050, "com.instagram.barcelona.common.ui.button.VolumeButton (AudioButton.kt:11)");
            }
            int i5 = R.drawable.instagram_volume_pano_outline_24;
            if (z) {
                i5 = R.drawable.instagram_volume_off_pano_outline_24;
            }
            C2DC A00 = C5Y7.A00(c5Tl, i5, 0);
            int i6 = 2131953313;
            if (z) {
                i6 = 2131953314;
            }
            AbstractC27544CDo.A00(c5Tl, modifier2, A00, null, C5YD.A00(c5Tl, i6), interfaceC16820sZ, (i3 & 14) | ((i3 << 3) & 7168), 16);
            if (C0fH.A02()) {
                C0fH.A00(-1188421531);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 1, modifier2, interfaceC16820sZ, z);
        }
    }
}
