package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC71463Ik {
    public static final C1ON A00(UserSession userSession, String str) {
        String A02 = C71473Il.A00(',').A02(((C17110t6) C0BQ.A00(userSession)).BOc(null));
        String A022 = C11830jh.A04.A01(userSession).A02(C19T.A1L);
        if (A022 == null) {
            A022 = "";
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("notifications/badge/");
        c25621Ms.A9s("user_ids", A02);
        c25621Ms.A9s("phone_id", A022);
        c25621Ms.A9s(AbstractC50529MSi.A02(0, 9, 30), str);
        c25621Ms.A0P(null, C71483Im.class, C71493In.class, false);
        return c25621Ms.A0N();
    }
}
