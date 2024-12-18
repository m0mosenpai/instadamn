package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3CS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CS {
    public final UserSession A00;
    public final C05A A01;
    public final C0UO A02;

    public static final void A00(C3CS c3cs) {
        UserSession userSession = c3cs.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321584939542145L) || C18U.A06(c06090Tz, userSession, 36321984371632051L)) {
            AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) C49Q.A00.invoke(AbstractC12220kQ.A02(userSession));
            if (abstractC02600Aj.A00.isSampled()) {
                abstractC02600Aj.A0Q("promotion_id", Long.valueOf(Long.parseLong("649845863914013")));
                abstractC02600Aj.A0Q("context_surface_id", Long.valueOf(Long.parseLong("11483")));
                abstractC02600Aj.A0R(AbstractC111324zv.A00(2577), "nonQpNotifPrompt");
                abstractC02600Aj.A00.A9M("extra_client_data", null);
                abstractC02600Aj.Cht();
            }
        }
    }

    public static final void A01(C3CS c3cs) {
        InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
        if (interfaceC19630xq.getInt("preference_push_permission_impression_count", 0) > 0 && interfaceC19630xq.getInt("priming_screen_shown_count", 0) == 0) {
            long j = interfaceC19630xq.getLong("preference_push_permission_dialog_impression_timestamp", 0L);
            UserSession userSession = c3cs.A00;
            if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j) >= C18U.A01(C06090Tz.A05, userSession, 36601118591094907L)) {
                int i = interfaceC19630xq.getInt("priming_screen_shown_count", 0) + 1;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D("priming_screen_shown_count", i);
                ARD.apply();
                C18920wW A02 = AbstractC12220kQ.A02(userSession);
                InterfaceC02590Ai A00 = A02.A00(A02.A00, "instagram_android_13_notifications_priming_event");
                if (A00.isSampled()) {
                    A00.AAP("experiment_group", "in_priming_test_v2");
                    A00.AAP("event_name", "priming_screen_impression");
                    A00.Cht();
                }
                c3cs.A01.Egh(C3IH.A00);
            }
        }
    }

    public C3CS(UserSession userSession) {
        this.A00 = userSession;
        C008002u A00 = C10E.A00(C3CT.A00);
        this.A01 = A00;
        this.A02 = AbstractC208910l.A02(A00);
    }
}
