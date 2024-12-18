package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.7P0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7P0 {
    public final C18920wW A00;

    public C7P0(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static final void A01(EnumC33504Erd enumC33504Erd, C7P1 c7p1, C7P2 c7p2, C7P0 c7p0, String str, String str2) {
        C18920wW c18920wW = c7p0.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "thread_action_system_activity");
        A00.A9K(OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME, Long.valueOf(System.currentTimeMillis()));
        A00.AAP("consumer_id", str);
        A00.AAP("page_id", str2);
        A00.A8R(c7p1, "event_type");
        A00.A8R(c7p2, "flow_step");
        A00.AAP("ig_locale", C1Q2.A00());
        A00.A8R(enumC33504Erd, "thread_activity");
        A00.Cht();
    }

    public static final EnumC33504Erd A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 4) {
            if (intValue != 10) {
                if (intValue != 5) {
                    if (intValue != 6) {
                        if (intValue != 7) {
                            return EnumC33504Erd.EMPTY_ACTIVITY;
                        }
                        return EnumC33504Erd.MARK_AS_SHIPPED;
                    }
                    return EnumC33504Erd.MARK_AS_PAID;
                }
                return EnumC33504Erd.MARK_AS_ORDER;
            }
            return EnumC33504Erd.MARK_AS_LEAD;
        }
        return EnumC33504Erd.MARK_AS_APPOINTMENT;
    }
}
