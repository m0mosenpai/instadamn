package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.93h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2044893h {
    public static C25621Ms A00(UserSession userSession, Integer num, String str) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B(StringFormatUtil.formatStrLocaleSafe(AbstractC111324zv.A00(2695), str));
        c25621Ms.A08(num);
        c25621Ms.A0S(C74293Vk.class, C74313Vm.class);
        return c25621Ms;
    }

    public static C1ON A01(UserSession userSession, Iterable iterable, boolean z, boolean z2) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A06();
        c25621Ms.A0B(AbstractC111324zv.A00(4872));
        c25621Ms.A9s("media_ids", new C71473Il(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02(iterable));
        c25621Ms.A0S(C74293Vk.class, C74313Vm.class);
        if (z) {
            c25621Ms.A9s("disable_preview_comments", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (z2) {
            c25621Ms.A9s(MSV.A00(1299), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        return c25621Ms.A0N();
    }

    public static C1ON A02(UserSession userSession, String str) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0L("media/%s/comment_info/", str);
        c25621Ms.A0S(HA0.class, IQO.class);
        return c25621Ms.A0N();
    }

    public static C1ON A03(UserSession userSession, String str) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0L("media/%s/deleted_info/", str);
        c25621Ms.A0S(C74293Vk.class, C74313Vm.class);
        return c25621Ms.A0N();
    }

    public static C1ON A04(UserSession userSession, String str) {
        return A00(userSession, C05F.A00, str).A0N();
    }

    public static C1ON A05(UserSession userSession, String str, String str2, String str3) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("discover/media_metadata/");
        c25621Ms.A9s("media_id", str);
        c25621Ms.A0S(C32155EBc.class, C31333Dpy.class);
        if (str2 != null && ((str2.equals("profile") && C18U.A06(C06090Tz.A05, userSession, 36324673023979893L)) || str2.equals("explore") || str2.equals("explore_1x2"))) {
            c25621Ms.A9s("surface", str2);
        }
        if (str3 != null) {
            c25621Ms.A9s("target_user_id", str3);
        }
        return c25621Ms.A0N();
    }

    public static void A06(C25621Ms c25621Ms, String str) {
        if (str != null) {
            c25621Ms.A9s("max_id", str);
        }
    }
}
