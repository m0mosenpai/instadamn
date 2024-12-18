package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class U3F {
    public static final C1ON A00(UserSession userSession, String str, String str2, String str3, String str4, String str5, int i) {
        C14360o3.A0B(userSession, 0);
        Location performIntegrityChecks = C1VW.performIntegrityChecks(null);
        String str6 = null;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        if (str5 != null) {
            A0M.A0E = str5;
            A0M.A0P(null, U3B.class, U3A.class, false);
            ((AbstractC23721Ec) A0M).A06 = EnumC23341Bw.CriticalAPI;
            A0M.A0V = true;
            A0M.A9s("query", str);
            A0M.A9s("count", String.valueOf(i));
            A0M.A9s("context", "blended");
            A0M.A9s("lat", performIntegrityChecks != null ? Double.valueOf(performIntegrityChecks.getLatitude()).toString() : null);
            if (performIntegrityChecks != null) {
                str6 = Double.valueOf(performIntegrityChecks.getLongitude()).toString();
            }
            A0M.A9s("lng", str6);
            AbstractC37303Gc4.A15(A0M);
            A0M.A9s("search_surface", str2);
            A0M.A0H("rank_token", str4);
            A0M.A0H("page_token", str3);
            return A0M.A0N();
        }
        throw AbstractC166997dE.A0g();
    }
}
