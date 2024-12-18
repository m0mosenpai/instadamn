package X;

import com.instagram.common.session.UserSession;
import java.util.TimeZone;

/* renamed from: X.4DT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4DT {
    public final UserSession A00;

    public C4DT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final Object A00(String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        String str5;
        String str6;
        UserSession userSession = this.A00;
        String str7 = null;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("news/inbox/");
        c25621Ms.A0O = z2;
        c25621Ms.A02 = new C25581Mo(new C07510aQ(userSession), C120965do.class);
        if (str2 == null) {
            str5 = "";
        } else {
            str5 = str2;
        }
        c25621Ms.A0A = AnonymousClass001.A0i("news/inbox/", str5, str, '/');
        c25621Ms.A08(C05F.A0Y);
        c25621Ms.A9s("mark_as_seen", "false");
        c25621Ms.A9s("timezone_offset", String.valueOf(C23831Eq.A00()));
        c25621Ms.A9s("timezone_name", TimeZone.getDefault().getID());
        c25621Ms.A0H("max_id", str);
        c25621Ms.A0H("pagination_first_record_timestamp", str4);
        c25621Ms.A0F("should_skip_su", Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36330449752048503L)));
        c25621Ms.A0H("selected_filters", str2);
        if (C14360o3.A0K(str2, "professional")) {
            str7 = "pro";
        }
        c25621Ms.A0H("feed_type", str7);
        c25621Ms.A0H("last_checked", str3);
        c25621Ms.A9s("could_truncate_feed", "true");
        if (AbstractC120975dp.A00(userSession) && AbstractC109484wa.A00(userSession).A02()) {
            str6 = "suspicious_login";
        } else {
            str6 = null;
        }
        c25621Ms.A0H("excluded_notification_types", str6);
        c25621Ms.A9s("threads_app_version", AbstractC14490oL.A05(userSession.deviceSession.A06(), "com.instagram.barcelona"));
        ((AbstractC23721Ec) c25621Ms).A00 = 4500L;
        if (!AbstractC14480oK.A01(userSession.deviceSession.A06())) {
            c25621Ms.A9s("push_disabled", "true");
        }
        if (z) {
            c25621Ms.A09 = C05F.A01;
        }
        return c25621Ms.A0N().A02(interfaceC23621Ds, 1780311179, 3, false);
    }
}
