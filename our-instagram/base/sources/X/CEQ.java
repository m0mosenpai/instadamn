package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.api.schemas.LineType;

/* loaded from: classes5.dex */
public abstract class CEQ {
    public static final void A00(C5Tl c5Tl, Modifier modifier, LineType lineType, String str, int i, int i2, boolean z, boolean z2) {
        int i3;
        String A17;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, str, lineType);
        c5Tl.Enr(1419299040);
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
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0f(c5Tl, z3);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = AbstractC25226BEj.A1U(i5, z3);
            if (C0fH.A02()) {
                C0fH.A01(488025477, "com.instagram.barcelona.feed.post.ui.PostReplyToContext (PostReplyToContext.kt:25)");
            }
            if (z3) {
                c5Tl.Eno(-1184676537);
                A17 = C5YD.A00(c5Tl, 2131953742);
            } else {
                c5Tl.Eno(-1184673568);
                A17 = AbstractC25228BEl.A17(c5Tl, str, 2131953741);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5WR.A0g(c5Tl, AbstractC118175Wb.A0D(C6HA.A00(modifier2, C6H9.A00(lineType, C05F.A01), z, A1R), 12.0f, 0.0f, 8.0f), A17, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(1913841889);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVB(lineType, modifier2, str, i, i2, 0, z, z3);
        }
    }
}
