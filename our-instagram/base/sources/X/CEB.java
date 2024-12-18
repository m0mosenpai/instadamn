package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* loaded from: classes5.dex */
public abstract class CEB {
    public static final void A00(C5Tl c5Tl, Modifier modifier, LineType lineType, int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        C14360o3.A0B(lineType, 1);
        c5Tl.Enr(920683081);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, lineType);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z3);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = AbstractC25226BEj.A1U(i5, z3);
            if (C0fH.A02()) {
                C0fH.A01(-2007934029, "com.instagram.barcelona.feed.post.ui.PaidPartnershipLabel (PaidPartnershipLabel.kt:24)");
            }
            String A00 = C5YD.A00(c5Tl, 2131953696);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            Modifier A002 = C6HA.A00(modifier2, C6H9.A00(lineType, C05F.A0C), z, true);
            float f = 4.0f;
            if (z3) {
                f = 0.0f;
            }
            C5WR.A0R(c5Tl, AbstractC118175Wb.A0B(A002, 0.0f, 0.0f, f), A0c, A00, A0M);
            if (C0fH.A02()) {
                C0fH.A00(-1791584310);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUE(lineType, modifier2, i, i2, 0, z3, z);
        }
    }
}
