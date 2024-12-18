package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jb7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43897Jb7 {
    public static final void A00(UserSession userSession, C98O c98o) {
        AbstractC167017dG.A1N(userSession, c98o);
        C71933Kq c71933Kq = C2KW.A00(userSession).A00;
        int i = c71933Kq.A02;
        if (i != -1) {
            c98o.A0G("total_badge_count", i);
            c98o.A0G("open_badge_count", c71933Kq.A00);
            c98o.A0G("e2ee_badge_count", c71933Kq.A01);
            c98o.A0K("badge_count_excludes_muted_threads", C18U.A06(C06090Tz.A06, userSession, 36320803255559072L));
        }
    }
}
