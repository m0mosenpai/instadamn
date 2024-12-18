package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.CAp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27469CAp {
    public static final void A00(C5Tl c5Tl, Alignment alignment, Modifier modifier, InterfaceC16610sE interfaceC16610sE, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        Alignment alignment2 = alignment;
        Modifier modifier2 = modifier;
        c5Tl.Enr(1781813501);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, alignment);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16610sE);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                alignment2 = C118195Wf.A0E;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (C0fH.A02()) {
                C0fH.A01(982371219, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            InterfaceC1127857k A00 = C5XX.A00(alignment2, z2);
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, A00, AbstractC167007dF.A1P(i3 & 7168, C3OO.FLAG_MOVED));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C30484DbT(3, interfaceC16610sE, A00);
                c5Tl.FBy(EEc);
            }
            C6NH.A01(c5Tl, modifier2, (InterfaceC16620sF) EEc, i3 & 14, 0);
            if (C0fH.A02()) {
                C0fH.A00(-955722092);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUI(modifier2, alignment2, interfaceC16610sE, i, i2, 0, z2);
        }
    }
}
