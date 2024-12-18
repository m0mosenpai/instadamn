package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23771Ej {
    public static final String A00(C1EU c1eu, String str) {
        String str2 = (String) c1eu.A0D.get("unseen_media_ids");
        String str3 = null;
        if (str2 != null) {
            str3 = (String) AbstractC001800i.A0J(AbstractC001900j.A0R(AbstractC001900j.A0E("[", "]", str2), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
        }
        List A0R = AbstractC001900j.A0R(AbstractC001900j.A0E("[", "]", str), new String[]{",{"}, 0);
        if (str3 != null && str3.length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            int size = A0R.size();
            if (size >= 0) {
                int i = 0;
                while (true) {
                    String str4 = (String) AbstractC001800i.A0O(A0R, i);
                    if (str4 != null) {
                        if (AbstractC001900j.A0a(str4, str3, false)) {
                            break;
                        }
                        if (i != 0) {
                            sb.append(",{");
                        }
                        sb.append(str4);
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            sb.append("]");
            String obj = sb.toString();
            C14360o3.A07(obj);
            return obj;
        }
        return str;
    }

    public static final void A01(Context context, AbstractC23721Ec abstractC23721Ec, UserSession userSession, C1EU c1eu, C1CM c1cm) {
        String str;
        HashSet hashSet;
        String str2;
        C1ET c1et;
        Integer num;
        C14360o3.A0B(context, 2);
        C14360o3.A0B(c1cm, 3);
        if (Systrace.A0E(1L)) {
            C0fO.A01("addParams", 1000938036);
        }
        try {
            boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36328839139573574L));
            C1ES c1es = c1eu.A05;
            abstractC23721Ec.A06 = EnumC23341Bw.CriticalAPI;
            abstractC23721Ec.A0V = true;
            abstractC23721Ec.A08(c1es.A01);
            abstractC23721Ec.A0A = c1es.A03;
            Long l = c1es.A02;
            if (l != null) {
                abstractC23721Ec.A00 = l.longValue();
            }
            abstractC23721Ec.A01 = c1es.A00;
            abstractC23721Ec.A0T = true;
            C1EN c1en = c1eu.A04;
            boolean z = false;
            if (c1en == C1EN.A06) {
                z = true;
            }
            String str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            if (z) {
                abstractC23721Ec.A0G("X-IG-APP-START-REQUEST", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            if (c1eu.A00) {
                abstractC23721Ec.A0G("X-IG-PRIMED-FEED-REQUEST", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            Map map = c1eu.A0D;
            if (map.containsKey("is_retry_request")) {
                abstractC23721Ec.A0G("X-IG-FEED-RETRY", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            if (C20150ym.A07(AbstractC20100yh.A00(36327838412454819L)) && (c1et = c1eu.A02) != null && (num = c1et.A00) != null) {
                abstractC23721Ec.A0G("X-IG-Accept-Hint", AbstractC23791Em.A00(num));
            }
            if (!A07) {
                Long l2 = c1eu.A06;
                if (l2 != null) {
                    long longValue = l2.longValue();
                    if (longValue > 0 && c1eu.A08 == null) {
                        abstractC23721Ec.A0E("last_head_load_time_ms", longValue);
                    }
                }
                abstractC23721Ec.A0H("hoisted_media_id", c1eu.A07);
                abstractC23721Ec.A0H("feed_reshare_info", c1eu.A0B);
                if (new C57382kD(userSession).A00()) {
                    abstractC23721Ec.A9s("can_support_carousel_mentions", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                }
                abstractC23721Ec.A9s(AbstractC31182DnR.A05(208, 9, 20), C16030qx.A02.A04(AbstractC12290kX.A00));
                abstractC23721Ec.A9s("timezone_offset", String.valueOf(C23831Eq.A00()));
            }
            abstractC23721Ec.A9s(TraceFieldType.RequestID, c1eu.A09);
            abstractC23721Ec.A9s(AbstractC31182DnR.A05(374, 10, 34), c1eu.A0A);
            abstractC23721Ec.A9s("reason", c1en.toString());
            String str4 = "0";
            if (c1en.A00()) {
                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            abstractC23721Ec.A9s("is_pull_to_refresh", str4);
            String str5 = c1eu.A08;
            if (str5 != null) {
                abstractC23721Ec.A9s("max_id", str5);
            }
            C17590tu c17590tu = c1eu.A03;
            if (c17590tu != null) {
                str = c17590tu.A00;
            } else {
                str = null;
            }
            abstractC23721Ec.A0H("feed_view_info", str);
            C18720vz c18720vz = AbstractC12960li.A00;
            C226418s A01 = C226218q.A01(c18720vz);
            A01.A0P(A01.A02, "BLOKS_PARAM_GET_VERSIONING_ID_START");
            abstractC23721Ec.A9s("bloks_versioning_id", "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf");
            C226418s A012 = C226218q.A01(c18720vz);
            A012.A0P(A012.A02, "BLOKS_PARAM_GET_VERSIONING_ID_END");
            if (!AbstractC14480oK.A01(context)) {
                abstractC23721Ec.A9s("push_disabled", "true");
            }
            for (Map.Entry entry : map.entrySet()) {
                abstractC23721Ec.A9s((String) entry.getKey(), (String) entry.getValue());
            }
            if (!C20150ym.A07(AbstractC20100yh.A00(36328839139639111L))) {
                if (c1eu.A0F) {
                    abstractC23721Ec.A9s("disable_feed_ad_load", "true");
                }
                C06090Tz c06090Tz = C06090Tz.A05;
                if ((!C18U.A06(c06090Tz, userSession, 36322740285745604L) || !c1eu.A02()) && (str2 = c1eu.A0C) != null) {
                    if (map.containsKey("is_feed_eager_refresh") && C14360o3.A0K(map.get("is_feed_eager_refresh"), "true")) {
                        abstractC23721Ec.A9s("client_view_state_media_list", A00(c1eu, str2));
                    } else {
                        abstractC23721Ec.A9s("client_view_state_media_list", str2);
                    }
                }
                AbstractC23841Er.A00(context, abstractC23721Ec, userSession, c1cm, A07);
                if (C18U.A06(c06090Tz, userSession, 36315782438719028L)) {
                    try {
                        abstractC23721Ec.A9s("ar_device_capabilities", AnonymousClass566.A04(userSession).toString());
                    } catch (RuntimeException unused) {
                        C0w9.A03("MainFeedRequestHelper", "device capabilities runtime exception");
                    }
                }
            }
            for (Map.Entry entry2 : c1eu.A0E.entrySet()) {
                abstractC23721Ec.A9s((String) entry2.getKey(), (String) entry2.getValue());
            }
            if (!A07) {
                boolean A072 = AbstractC23451Ch.A07(context, "android.permission.RECORD_AUDIO");
                boolean A073 = AbstractC23451Ch.A07(context, "android.permission.CAMERA");
                if (!A072 || !A073) {
                    str3 = "0";
                }
                abstractC23721Ec.A9s("has_camera_permission", str3);
                if (C18U.A06(C06090Tz.A05, userSession, 36317745238775302L)) {
                    C55782hJ A00 = C55772hI.A00(userSession);
                    synchronized (A00.A0K) {
                        hashSet = new HashSet(A00._lastClickedExternalSharedFeedIds);
                        A00._lastClickedExternalSharedFeedIds.clear();
                    }
                    abstractC23721Ec.A0H("feed_external_reshare_info", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", hashSet, null));
                }
                C24461Hp A002 = AbstractC24451Ho.A00(userSession);
                abstractC23721Ec.A0H("feed_comment_button_tap_info", A002.A01());
                abstractC23721Ec.A0H("feed_comment_count_button_tap_info", A002.A02());
                abstractC23721Ec.A0H("feed_comment_preview_button_tap_info", A002.A03());
                abstractC23721Ec.A0H("feed_profile_tap_info", A002.A04());
                abstractC23721Ec.A0H("feed_screenshot_info", A002.A05());
                abstractC23721Ec.A0H("feed_carousel_swipe_info", A002.A00());
                abstractC23721Ec.A9s("threads_app_version", AbstractC14490oL.A05(context, "com.instagram.barcelona"));
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(562398320);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-361090977);
            }
            throw th;
        }
    }

    public static final void A02(Context context, AbstractC23721Ec abstractC23721Ec, UserSession userSession, C1EU c1eu, C1CM c1cm) {
        String str;
        String str2;
        HashSet hashSet;
        Map map;
        Integer num;
        C14360o3.A0B(abstractC23721Ec, 0);
        C14360o3.A0B(c1cm, 3);
        if (Systrace.A0E(1L)) {
            C0fO.A01("addParams", 2107266859);
        }
        try {
            C1ES c1es = c1eu.A05;
            abstractC23721Ec.A06 = EnumC23341Bw.CriticalAPI;
            abstractC23721Ec.A0V = true;
            abstractC23721Ec.A08(c1es.A01);
            abstractC23721Ec.A0A = c1es.A03;
            Long l = c1es.A02;
            if (l != null) {
                abstractC23721Ec.A00 = l.longValue();
            }
            abstractC23721Ec.A01 = c1es.A00;
            abstractC23721Ec.A0T = true;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, userSession, 36323530559728980L);
            String str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            if (A06) {
                abstractC23721Ec.A9s("is_swipe_to_immersive_enabled", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            C1EN c1en = c1eu.A04;
            C1EN c1en2 = C1EN.A06;
            if (c1en == c1en2) {
                abstractC23721Ec.A0G("X-IG-APP-START-REQUEST", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            if (c1eu.A00) {
                abstractC23721Ec.A0G("X-IG-PRIMED-FEED-REQUEST", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            Map map2 = c1eu.A0D;
            if (map2.containsKey("is_retry_request")) {
                abstractC23721Ec.A0G("X-IG-FEED-RETRY", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            if ((c1en == c1en2 || c1eu.A00()) && C18U.A06(c06090Tz, userSession, 36328057459194999L)) {
                Context context2 = AbstractC12290kX.A00;
                C14360o3.A07(context2);
                String string = context2.getSharedPreferences("ig_connection_type", 0).getString("last_type", "");
                if (string != null && string.length() != 0) {
                    abstractC23721Ec.A0G("X-Ig-Last-Connection-Type", string);
                }
            }
            C1ET c1et = c1eu.A02;
            if (c1et != null && (num = c1et.A00) != null) {
                abstractC23721Ec.A0G("X-IG-Accept-Hint", AbstractC23791Em.A00(num));
            }
            Long l2 = c1eu.A06;
            if (l2 != null) {
                long longValue = l2.longValue();
                if (longValue > 0 && c1eu.A08 == null) {
                    abstractC23721Ec.A0E("last_head_load_time_ms", longValue);
                }
            }
            abstractC23721Ec.A9s(TraceFieldType.RequestID, c1eu.A09);
            abstractC23721Ec.A9s(AbstractC31182DnR.A05(374, 10, 34), c1eu.A0A);
            if (c1eu.A0F) {
                abstractC23721Ec.A9s("disable_feed_ad_load", "true");
            }
            abstractC23721Ec.A9s("reason", c1en.toString());
            String str4 = "0";
            if (c1en.A00()) {
                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            abstractC23721Ec.A9s("is_pull_to_refresh", str4);
            String str5 = c1eu.A08;
            if (str5 != null) {
                abstractC23721Ec.A9s("max_id", str5);
            }
            C17590tu c17590tu = c1eu.A03;
            if (c17590tu != null) {
                str = c17590tu.A00;
            } else {
                str = null;
            }
            abstractC23721Ec.A0H("feed_view_info", str);
            if (C18U.A06(c06090Tz, userSession, 36328057459129462L)) {
                Context context3 = AbstractC12290kX.A00;
                C14360o3.A07(context3);
                C28091Xn A00 = C28071Xl.A00(context3, userSession);
                synchronized (A00) {
                    C28091Xn.A00(A00);
                    map = A00.A06;
                }
                ArrayList arrayList = new ArrayList(map.size());
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                abstractC23721Ec.A0H("client_seen_store_media_list", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", arrayList, null));
            }
            abstractC23721Ec.A0H("hoisted_media_id", c1eu.A07);
            abstractC23721Ec.A0H("feed_reshare_info", c1eu.A0B);
            C18720vz c18720vz = AbstractC12960li.A00;
            C226418s A01 = C226218q.A01(c18720vz);
            A01.A0P(A01.A02, "BLOKS_PARAM_GET_VERSIONING_ID_START");
            abstractC23721Ec.A9s("bloks_versioning_id", "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf");
            C226418s A012 = C226218q.A01(c18720vz);
            A012.A0P(A012.A02, "BLOKS_PARAM_GET_VERSIONING_ID_END");
            if (!AbstractC14480oK.A01(context)) {
                abstractC23721Ec.A9s("push_disabled", "true");
            }
            abstractC23721Ec.A9s(AbstractC31182DnR.A05(208, 9, 20), C16030qx.A02.A04(AbstractC12290kX.A00));
            for (Map.Entry entry : map2.entrySet()) {
                abstractC23721Ec.A9s((String) entry.getKey(), (String) entry.getValue());
            }
            if (C18U.A06(c06090Tz, userSession, 36323264271887486L)) {
                abstractC23721Ec.A9s("can_support_carousel_mentions", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            abstractC23721Ec.A9s("timezone_offset", String.valueOf(C23831Eq.A00()));
            if ((!C18U.A06(c06090Tz, userSession, 36322740285745604L) || !c1eu.A02()) && (str2 = c1eu.A0C) != null) {
                if (map2.containsKey("is_feed_eager_refresh") && C14360o3.A0K(map2.get("is_feed_eager_refresh"), "true")) {
                    abstractC23721Ec.A9s("client_view_state_media_list", A00(c1eu, str2));
                } else {
                    abstractC23721Ec.A9s("client_view_state_media_list", str2);
                }
            }
            AbstractC23841Er.A00(context, abstractC23721Ec, userSession, c1cm, false);
            for (Map.Entry entry2 : c1eu.A0E.entrySet()) {
                abstractC23721Ec.A9s((String) entry2.getKey(), (String) entry2.getValue());
            }
            boolean A07 = AbstractC23451Ch.A07(context, "android.permission.RECORD_AUDIO");
            boolean A072 = AbstractC23451Ch.A07(context, "android.permission.CAMERA");
            if (!A07 || !A072) {
                str3 = "0";
            }
            abstractC23721Ec.A9s("has_camera_permission", str3);
            if (C18U.A06(c06090Tz, userSession, 36315782438719028L)) {
                try {
                    abstractC23721Ec.A9s("ar_device_capabilities", AnonymousClass566.A04(userSession).toString());
                } catch (RuntimeException unused) {
                    C0w9.A03("MainFeedRequestHelper", "device capabilities runtime exception");
                }
            }
            if (C18U.A06(c06090Tz, userSession, 36317745238775302L)) {
                C55782hJ A002 = C55772hI.A00(userSession);
                synchronized (A002.A0K) {
                    hashSet = new HashSet(A002._lastClickedExternalSharedFeedIds);
                    A002._lastClickedExternalSharedFeedIds.clear();
                }
                abstractC23721Ec.A0H("feed_external_reshare_info", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", hashSet, null));
            }
            C24461Hp A003 = AbstractC24451Ho.A00(userSession);
            abstractC23721Ec.A0H("feed_comment_button_tap_info", A003.A01());
            abstractC23721Ec.A0H("feed_comment_count_button_tap_info", A003.A02());
            abstractC23721Ec.A0H("feed_comment_preview_button_tap_info", A003.A03());
            abstractC23721Ec.A0H("feed_profile_tap_info", A003.A04());
            abstractC23721Ec.A0H("feed_screenshot_info", A003.A05());
            abstractC23721Ec.A0H("feed_carousel_swipe_info", A003.A00());
            if (Systrace.A0E(1L)) {
                C0fO.A00(-2145358084);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1199873390);
            }
            throw th;
        }
    }
}
