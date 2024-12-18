package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.FQj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34698FQj {
    public final void A00(Context context, UserSession userSession, User user, Integer num, String str) {
        String BAz;
        String str2;
        String str3;
        int A06 = AbstractC167007dF.A06(1, userSession, user);
        C52Z AYA = user.A03.AYA();
        if (AYA != null && AYA.BAz() != null && (BAz = AYA.BAz()) != null) {
            String id = user.getId();
            C52Z AYA2 = user.A03.AYA();
            if (AYA2 != null && AYA2.AqO() != null) {
                str2 = String.valueOf(AYA2.AqO());
            } else {
                str2 = null;
            }
            Long A0k = AbstractC003100w.A0k(10, id);
            if (A0k == null) {
                return;
            }
            switch (num.intValue()) {
                case 0:
                    str3 = "ACCEPT_FOLLOW_REQUEST";
                    break;
                case 1:
                    str3 = "ACCEPT_MESSAGE_REQUEST";
                    break;
                case 2:
                    str3 = "FOLLOW";
                    break;
                default:
                    str3 = "OPEN_BIO_LINK";
                    break;
            }
            Long A0Z = AbstractC31177DnL.A0Z(str2);
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            HashMap A1G3 = AbstractC166987dD.A1G();
            BitSet A0j = AbstractC31171DnF.A0j(3);
            A1G.put("target_user_id", A0k);
            A0j.set(A06);
            A1G.put("action", str3);
            A0j.set(0);
            A1G.put("harm", BAz);
            A0j.set(1);
            A1G.put("url", str);
            if (A0Z != null) {
                A1G.put("connected_user_id", Long.valueOf(A0Z.longValue()));
            }
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0R = "com.bloks.www.ig.proactive_warning";
            if (A0j.nextClearBit(0) >= 3) {
                C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.ig.proactive_warning", A1G, A1G2);
                A0H.A03 = null;
                A0H.A02 = null;
                A0H.A04 = null;
                A0H.A08(A1G3);
                A0H.A05(context, A0C);
                return;
            }
            throw AbstractC31173DnH.A0f();
        }
    }

    public final boolean A01(UserSession userSession, User user, Integer num) {
        String BAz;
        long j;
        AbstractC167007dF.A1K(user, userSession);
        C52Z AYA = user.A03.AYA();
        if (AYA != null && AYA.BAz() != null && (BAz = AYA.BAz()) != null) {
            int intValue = num.intValue();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (intValue != 0) {
                if (intValue != 3) {
                    if (intValue != 2) {
                        j = 36884616497922637L;
                    } else {
                        j = 36884616497726027L;
                    }
                } else {
                    j = 36884616497857100L;
                }
            } else {
                j = 36884616497594954L;
            }
            String A04 = C18U.A04(c06090Tz, userSession, j);
            if (!AbstractC001900j.A0T(A04)) {
                return AbstractC167007dF.A0m(A04, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0).contains(BAz);
            }
        }
        return false;
    }
}
