package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.FOk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34652FOk {
    public final boolean A00(UserSession userSession, C2EY c2ey, boolean z) {
        C06090Tz c06090Tz;
        C06090Tz c06090Tz2;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        boolean A1b = AbstractC167017dG.A1b(A00, A00.A3F, C23031Ai.A8c, 377);
        if (AbstractC16960so.A1Q(C2EY.A1V, C2EY.A20, C2EY.A0W, C2EY.A1r, C2EY.A1g, C2EY.A22, C2EY.A1F, C2EY.A1x, C2EY.A1Q, C2EY.A1y).contains(c2ey) && !A1b) {
            HashMap A02 = C23031Ai.A02(A00, "external_sharing_share_option_timestamp_map");
            double A01 = AbstractC31171DnF.A01();
            if (!A02.isEmpty()) {
                Iterator A14 = AbstractC166997dE.A14(A02);
                while (A14.hasNext()) {
                    if (A01 - ((Number) AbstractC31176DnK.A0j(A14)).doubleValue() < 7.776E9d) {
                        break;
                    }
                }
            }
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            boolean A1U = AbstractC31177DnL.A1U(c06090Tz, userSession, 36328727470292728L);
            if (z) {
                c06090Tz2 = C06090Tz.A05;
            } else {
                c06090Tz2 = C06090Tz.A06;
            }
            boolean A1U2 = AbstractC31177DnL.A1U(c06090Tz2, userSession, 36328727470227191L);
            if (A1U || A1U2) {
                return true;
            }
        }
        return false;
    }
}
