package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractMap;

/* renamed from: X.I9u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40896I9u {
    public static void A00(InterfaceC02590Ai interfaceC02590Ai, UserSession userSession, String str, AbstractMap abstractMap) {
        String str2 = (String) abstractMap.get("ad_id");
        Long l = null;
        if (str2 != null) {
            try {
                l = Long.valueOf(Long.parseLong(str2));
            } catch (NumberFormatException unused) {
            }
        }
        interfaceC02590Ai.A9K("ad_id", l);
        String str3 = userSession.userId;
        Long l2 = null;
        if (str3 != null) {
            try {
                l2 = Long.valueOf(Long.parseLong(str3));
            } catch (NumberFormatException unused2) {
            }
        }
        interfaceC02590Ai.A9K("ig_userid", l2);
        interfaceC02590Ai.AAP("ad_tracking_token", (String) abstractMap.get("ad_tracking_token"));
        interfaceC02590Ai.AAP("page_id", str);
        String str4 = (String) abstractMap.get("iab_dwell_time");
        Long l3 = null;
        if (str4 != null) {
            try {
                l3 = Long.valueOf(Long.parseLong(str4));
            } catch (NumberFormatException unused3) {
            }
        }
        interfaceC02590Ai.A9K("iab_dwell_time_in_ms", l3);
    }
}
