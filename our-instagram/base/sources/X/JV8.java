package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class JV8 {
    public static final boolean A00(UserSession userSession, String str) {
        if (str.length() == 0) {
            return false;
        }
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36607299049887312L);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (A00.A01.getLong(AnonymousClass001.A0R("odn_total_media_messages_inferenced_for_thread/", str), 0L) >= A01) {
            return true;
        }
        return false;
    }
}
