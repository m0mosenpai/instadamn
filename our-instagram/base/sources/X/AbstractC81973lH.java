package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3lH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81973lH {
    public static final boolean A00(UserSession userSession, String str, boolean z) {
        C14360o3.A0B(userSession, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317491840423174L) && !z) {
            return false;
        }
        if (C18U.A06(c06090Tz, userSession, 36317491840357637L) && !z) {
            return true;
        }
        if (!"feed_timeline".equals(str) && !"reel_server_prefetch".equals(str) && !"reel_background_prefetch".equals(str) && !"profile".equals(str) && !"self_profile".equals(str) && !"calendar_archive".equals(str)) {
            return true;
        }
        return false;
    }
}
