package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.api.schemas.LineType;

/* loaded from: classes5.dex */
public abstract class CEY {
    public static final void A00(C5Tl c5Tl, Modifier modifier, LineType lineType, String str, int i, int i2, long j, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, str, lineType);
        c5Tl.Enr(-1738308412);
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
            i3 |= AbstractC25232BEp.A0S(c5Tl, lineType);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0G(c5Tl, j);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, modifier2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(666817524, "com.instagram.barcelona.feed.post.ui.TransparencyLabelFeedText (TransparencyLabelFeedText.kt:30)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            boolean A1b = AbstractC25232BEp.A1b(c5Tl, A19, A11, AbstractC25233BEq.A1R(c5Tl, 1846917214, i3));
            Object EEc = c5Tl.EEc();
            if (A1b || EEc == C5UI.A00) {
                EEc = new B63(j, A19, A11, A1R ? 1 : 0);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5WR.A0d(c5Tl, AbstractC118175Wb.A0D(C6HA.A00(C5XR.A05(modifier2, null, null, (InterfaceC16820sZ) EEc, A1R), C6H9.A00(lineType, C05F.A01), z, A1R), 12.0f, 0.0f, 8.0f), str, i3 & 14, 32760, A0M);
            if (C0fH.A02()) {
                C0fH.A00(1474713565);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVA(lineType, modifier2, str, i, i2, 0, j, z);
        }
    }
}
