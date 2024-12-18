package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CDp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27545CDp {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C26032BfL c26032BfL, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        C26032BfL c26032BfL2 = c26032BfL;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-1303649747);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, c26032BfL);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                c26032BfL2 = C26032BfL.A04;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1607898133, "com.instagram.barcelona.common.ui.button.RemoveAttachmentButton (RemoveAttachmentButton.kt:15)");
            }
            AbstractC27544CDo.A00(c5Tl, modifier2, C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_outline_24, 0), c26032BfL2, C5YD.A00(c5Tl, 2131972186), interfaceC16820sZ, AbstractC25231BEo.A06(i3 << 6, i3 & 14), 0);
            if (C0fH.A02()) {
                C0fH.A00(327291351);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 10, modifier2, c26032BfL2, interfaceC16820sZ);
        }
    }
}
