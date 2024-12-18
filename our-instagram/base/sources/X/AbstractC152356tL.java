package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC152356tL {
    public static final void A00(C1P1 c1p1, UserSession userSession, C1GL c1gl) {
        boolean z = !C18U.A06(C06090Tz.A05, userSession, 36327799757355894L);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("text_feed/ig_text_post_app_new_activity_feed_count/");
        c25621Ms.A0P(null, C152366tM.class, C152376tN.class, false);
        c25621Ms.A9s("threads_app_version", AbstractC14490oL.A05(userSession.deviceSession.A06(), "com.instagram.barcelona"));
        c25621Ms.A0I("include_promotional_notifs", z);
        C1ON A0N = c25621Ms.A0N();
        if (c1p1 != null) {
            A0N.A00 = c1p1;
        }
        c1gl.schedule(A0N);
    }
}
