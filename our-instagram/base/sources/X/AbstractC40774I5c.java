package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.I5c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40774I5c {
    public static boolean A00(UserSession userSession, C23031Ai c23031Ai) {
        InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
        double d = interfaceC19630xq.getFloat("reel_tray_personalization_avg_core_sessions_per_day", -1.0f);
        C06090Tz c06090Tz = C06090Tz.A05;
        return d >= C18U.A00(c06090Tz, userSession, 37173199644983891L) && ((double) interfaceC19630xq.getFloat("reel_tray_personalization_avg_core_sessions_per_day", -1.0f)) <= C18U.A00(c06090Tz, userSession, 37173199645049428L);
    }
}
