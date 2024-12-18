package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8YX, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8YX {
    public static final boolean A00(C22P c22p, UserSession userSession) {
        C14360o3.A0B(c22p, 1);
        String A04 = C18U.A04(C06090Tz.A06, userSession, 36885535620399770L);
        if (A04.length() == 0) {
            return false;
        }
        List<String> A0R = AbstractC001900j.A0R(A04, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0R, 10));
        for (String str : A0R) {
            C14360o3.A0B(str, 0);
            arrayList.add(AbstractC003100w.A0k(10, str));
        }
        if (AbstractC009903n.A0O(Long.valueOf(c22p.A00), arrayList.toArray(new Long[0])) && ((A7V) userSession.A01(A7V.class, new C57247PbV(userSession, 26))).A00.A00.getInt("last_story_posted_source_index", -1) == 1 && C18U.A06(C06090Tz.A05, userSession, 36322585666922861L)) {
            return true;
        }
        return false;
    }
}
