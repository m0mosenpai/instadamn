package X;

import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.settings2.core.model.AndValue;
import com.instagram.settings2.core.model.DerivedStringValue;
import com.instagram.settings2.core.model.DictionaryValue;
import com.instagram.settings2.core.model.EqualsValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.XLn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72047XLn {
    public static Boolean A07(C19260xA c19260xA, String str) {
        String A05 = c19260xA.A05(str);
        if (A05 != null) {
            return Boolean.valueOf(Boolean.parseBoolean(A05));
        }
        return null;
    }

    public static Double A08(C19260xA c19260xA, String str) {
        String A05 = c19260xA.A05(str);
        if (A05 != null) {
            return Double.valueOf(Double.parseDouble(A05));
        }
        return null;
    }

    public static Long A0A(C19260xA c19260xA, String str) {
        String A05 = c19260xA.A05(str);
        if (A05 != null) {
            return Long.valueOf(Long.parseLong(A05));
        }
        return null;
    }

    public static Long A0B(C11500j9 c11500j9, C11520jB c11520jB) {
        String str = (String) c11520jB.A01(c11500j9);
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static Long A0C(C11500j9 c11500j9, C11520jB c11520jB) {
        String str = (String) c11520jB.A01(c11500j9);
        if (str != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static Long A0D(C11500j9 c11500j9, C11520jB c11520jB) {
        Number number = (Number) c11520jB.A01(c11500j9);
        if (number != null) {
            return Long.valueOf((long) number.doubleValue());
        }
        return null;
    }

    public static Long A0F(Number number) {
        if (number != null) {
            return Long.valueOf(number.intValue());
        }
        return null;
    }

    public static void A0H(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.AAk("c_pk_list", null);
        interfaceC02590Ai.A9K("a_pk_long", (Long) c11520jB.A01(c11500j9));
    }

    public static void A1S(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Integer num) {
        c11520jB.A01(new C11500j9(num, "profile_shop_link"));
        interfaceC02590Ai.AAQ(null, "profile_shop_link");
    }

    public static void A1b(AbstractCollection abstractCollection, Iterator it) {
        String str = (String) it.next();
        C14360o3.A0B(str, 0);
        abstractCollection.add(AbstractC003100w.A0k(10, str));
    }

    public static int A00(Iterable iterable) {
        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(iterable, 10));
        if (A0L < 16) {
            return 16;
        }
        return A0L;
    }

    public static C79743hP A01(Object obj, AbstractC06830Ya abstractC06830Ya) {
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj;
        C14360o3.A0B(simpleZoomableViewContainer, 0);
        return C107384sj.A04(simpleZoomableViewContainer, (C107384sj) abstractC06830Ya.receiver);
    }

    public static DictionaryValue A03(Object obj, List list) {
        List singletonList = Collections.singletonList(new NVA(obj));
        C14360o3.A07(singletonList);
        return new DictionaryValue(list, singletonList);
    }

    public static EqualsValue A04(EnumC72360Xbw enumC72360Xbw, Object obj) {
        return new EqualsValue(new DerivedStringValue(enumC72360Xbw), new NVA(obj));
    }

    public static NVI A05(AbstractC72483Xel abstractC72483Xel, InterfaceC57866PlW interfaceC57866PlW, Class cls, String str) {
        return new NVI(new C51757Mtg(abstractC72483Xel, interfaceC57866PlW, str), new C0YZ(cls));
    }

    public static Serializable A06(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("sponsor_tag_count", (Long) c11520jB.A01(C5I8.A8L));
        return c11520jB.A01(C5I8.A8N);
    }

    public static Long A09(C19260xA c19260xA, String str) {
        String A05 = c19260xA.A05(str);
        if (A05 == null) {
            return null;
        }
        return AbstractC003100w.A0k(10, A05);
    }

    public static Long A0E(C11500j9 c11500j9, C11520jB c11520jB) {
        String str = (String) c11520jB.A01(c11500j9);
        if (str == null) {
            return null;
        }
        return AbstractC003100w.A0k(10, str);
    }

    public static void A0I(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        Long l = (Long) c11520jB.A01(C5I8.A3Z);
        if (l != null) {
            interfaceC02590Ai.A9K("host_profile_id", l);
        }
    }

    public static void A0J(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("seq_num", (Long) c11520jB.A01(C5I8.A7z));
    }

    public static void A0K(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("reel_id", (String) c11520jB.A01(C5I8.A7W));
    }

    public static void A0L(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("top_likers_count", (Long) c11520jB.A01(C5I8.A9O));
    }

    public static void A0M(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_checkout_enabled", (Boolean) c11520jB.A01(C5I8.A42));
    }

    public static void A0N(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("m_ts", (Long) c11520jB.A01(C5I8.A93));
    }

    public static void A0O(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP(AbstractC37307Gc9.A00(), (String) c11520jB.A01(C5I8.A83));
    }

    public static void A0P(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("carousel_opt_in_position", (Long) c11520jB.A01(C5I8.A14));
    }

    public static void A0Q(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("media_id", (Long) c11520jB.A01(C5I8.A5M));
    }

    public static void A0R(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("session_reel_counter", (Long) c11520jB.A01(C5I8.A84));
    }

    public static void A0S(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("ad_inserted_position", (Long) c11520jB.A01(C5I8.A0D));
    }

    public static void A0T(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("reel_start_position", (Long) c11520jB.A01(C5I8.A7Z));
    }

    public static void A0U(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("follow_status", (String) c11520jB.A01(C5I8.A2w));
    }

    public static void A0V(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("has_top_likers", (Long) c11520jB.A01(C5I8.A3U));
    }

    public static void A0W(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("action", (String) c11520jB.A01(C5I8.A00));
    }

    public static void A0X(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("carousel_starting_media_id", (Long) c11520jB.A01(C5I8.A16));
    }

    public static void A0Y(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_multi_ads", (Boolean) c11520jB.A01(C5I8.A4W));
    }

    public static void A0Z(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("release_channel", (String) c11520jB.A01(C5I8.A7f));
    }

    public static void A0a(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("feed_request_id", (String) c11520jB.A01(C5I8.A8E));
    }

    public static void A0b(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_previewable_video_ad", (Boolean) c11520jB.A01(C5I8.A4c));
    }

    public static void A0c(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("tray_position", (Long) c11520jB.A01(C5I8.A9V));
    }

    public static void A0d(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("explore_topic_session_id", (String) c11520jB.A01(C5I8.A2h));
    }

    public static void A0e(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("is_coming_from", (String) c11520jB.A01(C5I8.A43));
    }

    public static void A0f(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("chaining_position", (Long) c11520jB.A01(C5I8.A1A));
    }

    public static void A0g(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("counter_channel", (String) c11520jB.A01(C5I8.A1f));
    }

    public static void A0h(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("top_liker_count", (Long) c11520jB.A01(C5I8.A9P));
    }

    public static void A0i(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("story_ranking_token", (String) c11520jB.A01(C5I8.A8U));
    }

    public static void A0j(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("endpoint_type", (String) c11520jB.A01(C5I8.A2S));
    }

    public static void A0k(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("media_loading_progress", (Long) c11520jB.A01(C5I8.A5R));
    }

    public static void A0l(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_internal_build", (Boolean) c11520jB.A01(C5I8.A4Q));
    }

    public static void A0m(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("multi_ads_type", (Long) c11520jB.A01(C5I8.A5y));
    }

    public static void A0n(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A8I("elapsed_time_since_last_item", (Double) c11520jB.A01(C5I8.A2Q));
    }

    public static void A0o(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("sessions_chain", (String) c11520jB.A01(C5I8.A82));
    }

    public static void A0p(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("scans", (Long) c11520jB.A01(C5I8.A1y));
    }

    public static void A0q(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("reel_type", (String) c11520jB.A01(C5I8.A7b));
    }

    public static void A0r(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("multi_ads_unit_id", (String) c11520jB.A01(C5I8.A60));
    }

    public static void A0s(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("ad_skip_type", (String) c11520jB.A01(C5I8.A0M));
    }

    public static void A0t(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("entity_follow_status", (String) c11520jB.A01(C5I8.A2Z));
    }

    public static void A0u(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("post_id", (String) c11520jB.A01(C5I8.A6b));
    }

    public static void A0v(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("mezql_token", (String) c11520jB.A01(C5I8.A5i));
    }

    public static void A0w(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("event_trace_id", (String) c11520jB.A01(C5I8.A2g));
    }

    public static void A0x(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("gating_type", (String) c11520jB.A01(C5I8.A37));
    }

    public static void A0y(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("ranking_session_id", (String) c11520jB.A01(C5I8.A6s));
    }

    public static void A0z(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("dr_ad_type", (Long) c11520jB.A01(C5I8.A2K));
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("topic_cluster_debug_info", (String) c11520jB.A01(C5I8.A9I));
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("multi_ads_id", (String) c11520jB.A01(C5I8.A5w));
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("radio_type", (String) c11520jB.A01(C5I8.A6q));
    }

    public static void A13(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("media_thumbnail_section", (String) c11520jB.A01(C5I8.A5Z));
    }

    public static void A14(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("reel_viewer_position", (Long) c11520jB.A01(C5I8.A7e));
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("is_programmatic_scroll", (String) c11520jB.A01(C5I8.A4h));
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("chaining_session_id", (String) c11520jB.A01(C5I8.A1C));
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("application_state", (String) c11520jB.A01(C5I8.A0Q));
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("topic_cluster_status", (String) c11520jB.A01(C5I8.A9K));
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("igtv_viewer_session_id", (String) c11520jB.A01(C5I8.A3i));
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("parent_m_pk", (String) c11520jB.A01(C5I8.A6U));
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("m_ix", (Long) c11520jB.A01(C5I8.A3n));
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("delivery_flags", (String) c11520jB.A01(C5I8.A27));
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("is_dark_mode", (Long) c11520jB.A01(C5I8.A4C));
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("media_author_id", (Long) c11520jB.A01(C5I8.A5G));
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("ranking_info_token", (String) c11520jB.A01(C5I8.A6r));
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("cta_state", (Long) c11520jB.A01(C5I8.A08));
    }

    public static void A1H(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_igtv", (Boolean) c11520jB.A01(C5I8.A4N));
    }

    public static void A1I(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A8I("time_elapsed", (Double) c11520jB.A01(C5I8.A95));
    }

    public static void A1J(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("host_video_pk", (String) c11520jB.A01(C5I8.A3b));
    }

    public static void A1K(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("client_position", (Long) c11520jB.A01(C5I8.A3s));
    }

    public static void A1L(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("source_of_action", (String) c11520jB.A01(C5I8.A8G));
    }

    public static void A1M(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("tracking_token", (String) c11520jB.A01(C5I8.A9R));
    }

    public static void A1N(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_video_to_carousel", (Boolean) c11520jB.A01(C5I8.A51));
    }

    public static void A1O(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("nav_chain", (String) c11520jB.A01(C5I8.A62));
    }

    public static void A1P(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_ad", (Boolean) c11520jB.A01(C5I8.A3t));
    }

    public static void A1Q(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("source_of_like", (String) c11520jB.A01(C5I8.A8H));
    }

    public static void A1R(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Integer num) {
        interfaceC02590Ai.A9M("product_merchant_ids", (Map) c11520jB.A01(new C11500j9(num, "product_merchant_ids")));
    }

    public static void A1X(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("waterfall_id", str);
        interfaceC02590Ai.A9K("fb_user_id", null);
    }

    public static void A1Y(C0Zx c0Zx, C19260xA c19260xA) {
        c0Zx.A06("background_color_bottom", c19260xA.A05("background_color_bottom"));
        c0Zx.A06("background_color_top", c19260xA.A05("background_color_top"));
    }

    public static void A1a(C0Zx c0Zx, C11520jB c11520jB) {
        c0Zx.A03("is_showreel_native", (Boolean) c11520jB.A01(C5I8.A4r));
    }

    public static AndValue A02(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42) {
        return new AndValue(AbstractC16960so.A1Q(abstractC55145Od4, abstractC55145Od42));
    }

    public static LinkedHashMap A0G(AbstractMap abstractMap) {
        return new LinkedHashMap(AbstractC16850sd.A0L(abstractMap.size()));
    }

    public static void A1T(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Long l, String str) {
        interfaceC02590Ai.A9K(str, l);
        interfaceC02590Ai.AAP("follow_status", (String) c11520jB.A01(C5I8.A2w));
    }

    public static void A1U(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A9K("carousel_size", (Long) c11520jB.A01(C5I8.A15));
    }

    public static void A1V(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A9K("m_ix", (Long) c11520jB.A01(C5I8.A3n));
    }

    public static void A1W(InterfaceC02590Ai interfaceC02590Ai, Long l, Object obj, String str) {
        interfaceC02590Ai.A9K(str, l);
        interfaceC02590Ai.A8I("lsp", Double.valueOf(((Number) obj).doubleValue()));
    }

    public static void A1Z(C0Zx c0Zx, C19260xA c19260xA, String str) {
        c0Zx.A06(str, c19260xA.A05(str));
        c0Zx.A06("caption_background_color_alpha", c19260xA.A05("caption_background_color_alpha"));
    }
}
