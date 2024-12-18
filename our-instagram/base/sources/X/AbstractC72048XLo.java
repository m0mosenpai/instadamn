package X;

import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.audiofx.DynamicsProcessing;
import android.os.Build;
import androidx.media3.common.Timeline;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.yoga.YogaNodeJNIBase;
import com.instagram.api.schemas.AchievementName;
import com.instagram.api.schemas.ISOCountryCode;
import com.instagram.api.schemas.PaymentCredentialTypeEnum;
import com.instagram.settings2.core.model.AndValue;
import com.instagram.settings2.core.model.FbtLinkTokenValue;
import com.instagram.settings2.core.model.FbtWithTokensValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.ServerValue;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.XLo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72048XLo {
    public static DynamicsProcessing.Mbc A03(DynamicsProcessing.Config config) {
        return config.getChannelByChannelIndex(0).getMbc();
    }

    public static C63003SaR A05(String str, String str2, String str3, int i) {
        return new C63003SaR(str, str2, str3, i, 1, true);
    }

    public static AndValue A0A(AbstractC55145Od4 abstractC55145Od4, long j) {
        return new AndValue(AbstractC16960so.A1Q(abstractC55145Od4, new C33160Ek5(AbstractC20100yh.A00(j), true)));
    }

    public static AndValue A0B(C33160Ek5 c33160Ek5, long j) {
        return new AndValue(AbstractC16960so.A1Q(c33160Ek5, new C33160Ek5(AbstractC20100yh.A00(j), true)));
    }

    public static Double A0E(C11500j9 c11500j9, C11520jB c11520jB) {
        if (((Number) c11520jB.A01(c11500j9)) != null) {
            return Double.valueOf(r0.floatValue());
        }
        return null;
    }

    public static Double A0F(C11520jB c11520jB) {
        if (((Number) c11520jB.A01(C5I8.A6A)) != null) {
            return Double.valueOf(r0.longValue());
        }
        return null;
    }

    public static Long A0G(C0Zx c0Zx, C11520jB c11520jB, Long l) {
        c0Zx.A05("screen_height", l);
        Number number = (Number) c11520jB.A01(C5I8.A7q);
        if (number != null) {
            return Long.valueOf((long) number.doubleValue());
        }
        return null;
    }

    public static String A0K(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static List A0O(String str, long j) {
        return AbstractC16960so.A1Q(new C33160Ek5(AbstractC20100yh.A00(j), true), new ServerValue(str, new C0YZ(Boolean.class)));
    }

    public static void A0S(InterfaceC37541or interfaceC37541or, C51682MsD c51682MsD, long j) {
        interfaceC37541or.ADi(1, j);
        interfaceC37541or.ADi(2, c51682MsD.A0Y ? 1L : 0L);
        interfaceC37541or.ADp(3, c51682MsD.A0M);
        interfaceC37541or.ADi(4, c51682MsD.A08);
        interfaceC37541or.ADi(5, c51682MsD.A09);
        interfaceC37541or.ADi(6, c51682MsD.A07);
        interfaceC37541or.ADi(7, c51682MsD.A0B);
        interfaceC37541or.ADp(8, c51682MsD.A0L);
        interfaceC37541or.ADp(9, c51682MsD.A0I);
    }

    public static void A0T(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("fb_user_id", null);
    }

    public static void A1O(String str, String str2, AbstractMap abstractMap) {
        abstractMap.put(str, new C63003SaR(str, str2, null, 1, 1, true));
    }

    public static float A00(int[] iArr, float f, int i) {
        return Math.abs(f - iArr[i]);
    }

    public static long A02(ReactShadowNodeImpl reactShadowNodeImpl) {
        return ((YogaNodeJNIBase) reactShadowNodeImpl.A0B).mNativePointer;
    }

    public static InterfaceC29101an A06(C28381Yz c28381Yz, AbstractC28801aI abstractC28801aI, String str, String str2) {
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, abstractC28801aI, str, str2), c28381Yz.A04, false, false));
    }

    public static AchievementName A07(String str, String str2, int i) {
        return new AchievementName(str, i, str2);
    }

    public static ISOCountryCode A08(String str, int i) {
        return new ISOCountryCode(str, i, str);
    }

    public static PaymentCredentialTypeEnum A09(String str, int i) {
        return new PaymentCredentialTypeEnum(str, i, str);
    }

    public static FbtWithTokensValue A0C(AbstractC55145Od4 abstractC55145Od4, int i, int i2) {
        List singletonList = Collections.singletonList(new FbtLinkTokenValue(abstractC55145Od4, new NVA(new C51759Mti(new C51918Mx0(i))), "learn_more"));
        C14360o3.A07(singletonList);
        return new FbtWithTokensValue(i2, singletonList);
    }

    public static IfValue A0D(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, int i) {
        return new IfValue(abstractC55145Od4, abstractC55145Od42, new NVA(new C51759Mti(new C51918Mx0(i))));
    }

    public static String A0H(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "STREAM_INVALID";
                            }
                            return "STREAM_NOTIFICATION";
                        }
                        return "STREAM_ALARM";
                    }
                    return "STREAM_MUSIC";
                }
                return "STREAM_RING";
            }
            return "STREAM_SYSTEM";
        }
        return "STREAM_VOICE_CALL";
    }

    public static String A0I(InterfaceC37541or interfaceC37541or, C51682MsD c51682MsD) {
        interfaceC37541or.ADi(27, c51682MsD.A0a ? 1L : 0L);
        interfaceC37541or.ADi(28, c51682MsD.A0N ? 1L : 0L);
        interfaceC37541or.ADi(29, c51682MsD.A0O ? 1L : 0L);
        interfaceC37541or.ADi(30, c51682MsD.A0R ? 1L : 0L);
        interfaceC37541or.ADi(31, c51682MsD.A0U ? 1L : 0L);
        interfaceC37541or.ADi(32, c51682MsD.A0V ? 1L : 0L);
        return OPF.A01(c51682MsD.A0F);
    }

    public static String A0J(InterfaceC37541or interfaceC37541or, C51682MsD c51682MsD) {
        interfaceC37541or.ADi(18, c51682MsD.A03);
        interfaceC37541or.ADi(19, c51682MsD.A02);
        interfaceC37541or.ADi(20, c51682MsD.A01);
        interfaceC37541or.ADi(21, c51682MsD.A0Q ? 1L : 0L);
        interfaceC37541or.ADi(22, c51682MsD.A0W ? 1L : 0L);
        return OPE.A01(c51682MsD.A0D);
    }

    public static String A0L(Map map) {
        map.put("bottom", "Dynamic");
        map.put("collapsable", "boolean");
        return "boolean";
    }

    public static void A0P(MediaFormat mediaFormat, C23014ACo c23014ACo, boolean z) {
        mediaFormat.setInteger("profile", z ? 1 : 0);
        mediaFormat.setInteger("level", 1024);
        if (c23014ACo.A02 == 7) {
            mediaFormat.setInteger("profile", 2);
            mediaFormat.setInteger("level", Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
            if (Build.VERSION.SDK_INT >= 33) {
                mediaFormat.setFeatureEnabled("hdr-editing", z);
            }
        }
    }

    public static void A0R(InterfaceC37541or interfaceC37541or, C51682MsD c51682MsD) {
        interfaceC37541or.ADi(11, c51682MsD.A0X ? 1L : 0L);
        interfaceC37541or.ADi(12, c51682MsD.A04);
        interfaceC37541or.ADi(13, c51682MsD.A05);
        interfaceC37541or.ADg(14, c51682MsD.A00);
        interfaceC37541or.ADi(15, c51682MsD.A0T ? 1L : 0L);
        interfaceC37541or.ADi(16, c51682MsD.A0P ? 1L : 0L);
    }

    public static void A0Y(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("hashtag_feed_type", (String) c11520jB.A01(C5I8.A3O));
        interfaceC02590Ai.A9K("tab_index", (Long) c11520jB.A01(C5I8.A8o));
    }

    public static void A0Z(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("carousel_media_id_int", (Long) c11520jB.A01(C5I8.A11));
        interfaceC02590Ai.AAP("shopping_session_id", (String) c11520jB.A01(C5I8.A86));
        interfaceC02590Ai.A9K("client_position", (Long) c11520jB.A01(C5I8.A3s));
    }

    public static void A0a(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("top_likers_count", (Long) c11520jB.A01(C5I8.A9O));
        interfaceC02590Ai.A9K("top_followers_count", (Long) c11520jB.A01(C5I8.A9N));
        interfaceC02590Ai.AAP("application_state", (String) c11520jB.A01(C5I8.A0Q));
    }

    public static void A0b(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("top_followers_count", (Long) c11520jB.A01(C5I8.A9N));
        interfaceC02590Ai.A9K("top_likers_count", (Long) c11520jB.A01(C5I8.A9O));
    }

    public static void A0c(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("impression_logger_validate", (Boolean) c11520jB.A01(C5I8.A3j));
        interfaceC02590Ai.A9K("imp_logger_ver", (Long) c11520jB.A01(C5I8.A3l));
    }

    public static void A0d(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("byline_text", (String) c11520jB.A01(C5I8.A0l));
        interfaceC02590Ai.AAP("sponsored_label_text", (String) c11520jB.A01(C5I8.A8J));
    }

    public static void A0e(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("min_consumed_media_gap_to_previous_ad", (Long) c11520jB.A01(C5I8.A5j));
        interfaceC02590Ai.A9K("min_consumed_media_gap_to_previous_netego", (Long) c11520jB.A01(C5I8.A5k));
        interfaceC02590Ai.A9K("min_consumed_reel_gap_to_previous_ad", (Long) c11520jB.A01(C5I8.A5l));
        interfaceC02590Ai.A9K("min_consumed_reel_gap_to_previous_netego", (Long) c11520jB.A01(C5I8.A5m));
    }

    public static void A0f(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("imp_logger_ver", (Long) c11520jB.A01(C5I8.A3l));
        interfaceC02590Ai.A7v("impression_logger_validate", (Boolean) c11520jB.A01(C5I8.A3j));
    }

    public static void A0g(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("entity_id", (Long) c11520jB.A01(C5I8.A2a));
        interfaceC02590Ai.AAP("entity_name", (String) c11520jB.A01(C5I8.A2b));
        interfaceC02590Ai.AAP("entity_type", (String) c11520jB.A01(C5I8.A2e));
    }

    public static void A0h(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("chaining_seed_media_id", (Long) c11520jB.A01(C5I8.A3g));
        interfaceC02590Ai.A9K("chaining_seed_author_id", (Long) c11520jB.A01(C5I8.A1B));
    }

    public static void A0i(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A8I("time_elapsed", (Double) c11520jB.A01(C5I8.A95));
        interfaceC02590Ai.A8I("time_remaining", (Double) c11520jB.A01(C5I8.A9A));
    }

    public static void A0j(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("dynamic_item_id", (String) c11520jB.A01(C5I8.A2N));
        interfaceC02590Ai.AAP("dynamic_creator_item_id", (String) c11520jB.A01(C5I8.A2M));
    }

    public static void A0k(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("segment_index", (Long) c11520jB.A01(C5I8.A7y));
        interfaceC02590Ai.A9K("segment_count", (Long) c11520jB.A01(C5I8.A7x));
    }

    public static void A0l(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("chaining_seed_author_id", (Long) c11520jB.A01(C5I8.A1B));
        interfaceC02590Ai.A9K("chaining_seed_media_id", (Long) c11520jB.A01(C5I8.A3g));
    }

    public static void A0m(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("reel_id", (String) c11520jB.A01(C5I8.A7W));
        interfaceC02590Ai.A9K("reel_position", (Long) c11520jB.A01(C5I8.A7X));
        interfaceC02590Ai.A9K("reel_size", (Long) c11520jB.A01(C5I8.A7Y));
    }

    public static void A0n(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A8I("tap_x_position", (Double) c11520jB.A01(C5I8.A8w));
        interfaceC02590Ai.A8I("tap_y_position", (Double) c11520jB.A01(C5I8.A8x));
    }

    public static void A0o(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("reel_size", (Long) c11520jB.A01(C5I8.A7Y));
        interfaceC02590Ai.A9K("reel_position", (Long) c11520jB.A01(C5I8.A7X));
    }

    public static void A0p(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A8I("media_dwell_time", (Double) c11520jB.A01(C5I8.A5H));
        interfaceC02590Ai.A8I("media_time_elapsed", (Double) c11520jB.A01(C5I8.A5a));
    }

    public static void A0q(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("topic_cluster_id", (String) c11520jB.A01(C5I8.A9J));
        interfaceC02590Ai.AAP("topic_cluster_title", (String) c11520jB.A01(C5I8.A9L));
        interfaceC02590Ai.AAP("topic_cluster_type", (String) c11520jB.A01(C5I8.A9M));
    }

    public static void A0r(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("collection_id", (String) c11520jB.A01(C5I8.A1L));
        interfaceC02590Ai.AAP("collection_name", (String) c11520jB.A01(C5I8.A1N));
    }

    public static void A0s(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A8I("elapsed_time_since_last_item", (Double) c11520jB.A01(C5I8.A2Q));
        interfaceC02590Ai.A7v("is_acp_delivered", (Boolean) c11520jB.A01(C5I8.A3u));
    }

    public static void A0t(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("entity_type", (String) c11520jB.A01(C5I8.A2e));
        interfaceC02590Ai.A9K("entity_id", (Long) c11520jB.A01(C5I8.A2a));
        interfaceC02590Ai.AAP("entity_name", (String) c11520jB.A01(C5I8.A2b));
    }

    public static void A0u(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("segment_count", (Long) c11520jB.A01(C5I8.A7x));
        interfaceC02590Ai.A9K("segment_index", (Long) c11520jB.A01(C5I8.A7y));
    }

    public static void A0v(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("ad_pod_id", (String) c11520jB.A01(C5I8.A0G));
        interfaceC02590Ai.A9K("index_in_ad_pod", (Long) c11520jB.A01(C5I8.A3o));
    }

    public static void A0w(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("tray_session_id", (String) c11520jB.A01(C5I8.A7a));
        interfaceC02590Ai.AAP("viewer_session_id", (String) c11520jB.A01(C5I8.A9o));
    }

    public static void A0x(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("media_tags_hashtag_name", (String) c11520jB.A01(C5I8.A5X));
        interfaceC02590Ai.A9K("media_tags_total_hashtags", (Long) c11520jB.A01(C5I8.A5Y));
    }

    public static void A0y(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("reel_gap_to_last_ad", (Long) c11520jB.A01(C5I8.A7U));
        interfaceC02590Ai.A9K("reel_gap_to_last_netego", (Long) c11520jB.A01(C5I8.A7V));
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Long l) {
        interfaceC02590Ai.A9K("reel_gap", l);
        interfaceC02590Ai.A9M("element_timespent", (Map) c11520jB.A01(C5I8.A0q));
        interfaceC02590Ai.A8I("cover_media_timespent", (Double) c11520jB.A01(C5I8.A1M));
        interfaceC02590Ai.A8I("timespent", (Double) c11520jB.A01(C5I8.A9F));
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Long l) {
        interfaceC02590Ai.A9K("first_hscroll_item_ad_id", l);
        interfaceC02590Ai.A9K("horizontal_position_on_hscroll", (Long) c11520jB.A01(C5I8.A3X));
        interfaceC02590Ai.A9K("vertical_position_on_feed_of_ads", (Long) c11520jB.A01(C5I8.A9j));
        interfaceC02590Ai.A7v("is_multi_ads", (Boolean) c11520jB.A01(C5I8.A4W));
        interfaceC02590Ai.A9K("multi_ads_type", (Long) c11520jB.A01(C5I8.A5y));
        interfaceC02590Ai.AAP("multi_ads_id", (String) c11520jB.A01(C5I8.A5w));
        interfaceC02590Ai.A9K("position_in_multi_ads_unit", (Long) c11520jB.A01(C5I8.A6a));
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai, Long l, Object obj, String str, int i) {
        interfaceC02590Ai.A9K("session_reel_counter", l);
        interfaceC02590Ai.A8I("time", Double.valueOf(((Number) obj).doubleValue()));
        interfaceC02590Ai.A9K("tray_position", Long.valueOf(i));
        interfaceC02590Ai.AAP("tray_session_id", str);
    }

    public static void A16(C0Zx c0Zx, C19260xA c19260xA, Boolean bool) {
        c0Zx.A03("is_caption_fully_displayed", bool);
        c0Zx.A06("background_color_bottom", c19260xA.A05("background_color_bottom"));
        c0Zx.A06("background_color_caption", c19260xA.A05("background_color_caption"));
    }

    public static void A17(C0Zx c0Zx, C11520jB c11520jB) {
        c0Zx.A04("screen_density", (Double) c11520jB.A01(C5I8.A7o));
        c0Zx.A04("screen_height", (Double) c11520jB.A01(C5I8.A7p));
        c0Zx.A04("screen_width", (Double) c11520jB.A01(C5I8.A7q));
    }

    public static void A18(C0Zx c0Zx, C11520jB c11520jB) {
        c0Zx.A03("is_delayed_skip_ad", (Boolean) c11520jB.A01(C5I8.A24));
        c0Zx.A03("is_action_on_unskippable", (Boolean) c11520jB.A01(C5I8.A23));
    }

    public static void A19(C0Zx c0Zx, C11520jB c11520jB, Object obj) {
        c0Zx.A06("title_option", (String) obj);
        c0Zx.A06(DialogModule.KEY_TITLE, (String) c11520jB.A01(C5I8.A7L));
        c0Zx.A06("subtitle", (String) c11520jB.A01(C5I8.A7J));
        c0Zx.A06("format", (String) c11520jB.A01(C5I8.A7B));
        c0Zx.A05("image_width", (Long) c11520jB.A01(C5I8.A7G));
        c0Zx.A05("image_height", (Long) c11520jB.A01(C5I8.A7F));
        c0Zx.A03("hide_caption", (Boolean) c11520jB.A01(C5I8.A7D));
        c0Zx.A03("hide_social_context", (Boolean) c11520jB.A01(C5I8.A7E));
        c0Zx.A03("dismissible", (Boolean) c11520jB.A01(C5I8.A79));
    }

    public static void A1A(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setWidth(new T02(obj));
    }

    public static void A1B(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setRowGap(new T02(obj));
    }

    public static void A1C(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setMaxWidth(new T02(obj));
    }

    public static void A1D(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setMaxHeight(new T02(obj));
    }

    public static void A1E(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setHeight(new T02(obj));
    }

    public static void A1F(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setMinHeight(new T02(obj));
    }

    public static void A1G(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setMinWidth(new T02(obj));
    }

    public static void A1H(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setFlexBasis(new T02(obj));
    }

    public static void A1I(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setGap(new T02(obj));
    }

    public static void A1J(LayoutShadowNode layoutShadowNode, Object obj, int i) {
        layoutShadowNode.setPositionValues(i, new T02(obj));
    }

    public static void A1K(LayoutShadowNode layoutShadowNode, Object obj, int i) {
        layoutShadowNode.setPaddings(i, new T02(obj));
    }

    public static void A1L(LayoutShadowNode layoutShadowNode, Object obj, int i) {
        layoutShadowNode.setMargins(i, new T02(obj));
    }

    public static void A1M(EnumC72411Xcz enumC72411Xcz, String str) {
        new PlayerOrigin(enumC72411Xcz, str);
    }

    public static void A1N(String str, AudioManager audioManager, int i, StringBuilder sb) {
        sb.append(AnonymousClass001.A0g("  ", str, ": "));
        sb.append("volume=");
        sb.append(audioManager.getStreamVolume(i));
        sb.append(", max=");
        sb.append(audioManager.getStreamMaxVolume(i));
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        String str = (String) it.next();
        C14360o3.A0B(str, 0);
        Long A0k = AbstractC003100w.A0k(10, str);
        if (A0k != null) {
            abstractCollection.add(A0k);
        }
    }

    public static void A1Z(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static boolean A1a(MediaFormat mediaFormat, C23014ACo c23014ACo) {
        mediaFormat.setInteger("color-format", 2130708361);
        mediaFormat.setInteger(TraceFieldType.Bitrate, c23014ACo.A00);
        mediaFormat.setInteger("frame-rate", c23014ACo.A03);
        mediaFormat.setInteger("i-frame-interval", 5);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("max-input-size", 0);
        if (c23014ACo.A09) {
            mediaFormat.setInteger("color-range", 2);
            mediaFormat.setInteger("color-standard", c23014ACo.A01);
            mediaFormat.setInteger("color-transfer", c23014ACo.A02);
        }
        return true;
    }

    public static int A01(Dynamic dynamic, C69543Vr7 c69543Vr7) {
        c69543Vr7.A00(dynamic);
        return c69543Vr7.A01.intValue();
    }

    public static Timeline A04(Y8T y8t) {
        Y8T.A02(y8t);
        return y8t.A0A.A06;
    }

    public static HashSet A0M(Object obj, Object obj2, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, obj2);
        return new HashSet(i);
    }

    public static HashSet A0N(Object obj, Object[] objArr, int i, int i2, int i3) {
        System.arraycopy(obj, i, objArr, i2, i3);
        return AbstractC16830sb.A05(objArr);
    }

    public static void A0Q(InterfaceC37481ol interfaceC37481ol, Iterator it) {
        ((C2LL) it.next()).A01(interfaceC37481ol);
    }

    public static void A0U(InterfaceC02590Ai interfaceC02590Ai, InterfaceC11380iw interfaceC11380iw, C11520jB c11520jB, Long l, String str) {
        interfaceC02590Ai.A9K(str, l);
        interfaceC02590Ai.A9K("carousel_starting_media_id", (Long) c11520jB.A01(C5I8.A16));
        interfaceC02590Ai.AAP("module_name", interfaceC11380iw.getModuleName());
        interfaceC02590Ai.AAP("ranking_session_id", (String) c11520jB.A01(C5I8.A6s));
        interfaceC02590Ai.AAP("ranking_info_token", (String) c11520jB.A01(C5I8.A6r));
        interfaceC02590Ai.A9K("chaining_seed_author_id", (Long) c11520jB.A01(C5I8.A1B));
        interfaceC02590Ai.A9K("chaining_seed_media_id", (Long) c11520jB.A01(C5I8.A3g));
        interfaceC02590Ai.AAP("radio_type", (String) c11520jB.A01(C5I8.A6q));
    }

    public static void A0V(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("m_ts", (Long) c11520jB.A01(c11500j9));
        interfaceC02590Ai.A9K("top_liker_count", (Long) c11520jB.A01(C5I8.A9P));
    }

    public static void A0W(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("parent_m_pk", (String) c11520jB.A01(c11500j9));
        interfaceC02590Ai.A9K("chaining_position", (Long) c11520jB.A01(C5I8.A1A));
    }

    public static void A0X(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("m_t", (Long) c11520jB.A01(c11500j9));
        interfaceC02590Ai.A9K("m_ts", (Long) c11520jB.A01(C5I8.A93));
    }

    public static void A0z(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Double d, String str) {
        interfaceC02590Ai.A8I(str, d);
        interfaceC02590Ai.A8I("media_time_remaining", (Double) c11520jB.A01(C5I8.A5b));
        interfaceC02590Ai.A8I("media_time_to_load", (Double) c11520jB.A01(C5I8.A5S));
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Long l, String str) {
        interfaceC02590Ai.A9K(str, l);
        interfaceC02590Ai.AAP("carousel_media_id", (String) c11520jB.A01(C5I8.A10));
        interfaceC02590Ai.AAP("carousel_cover_media_id", (String) c11520jB.A01(C5I8.A0x));
        interfaceC02590Ai.A9K("carousel_size", (Long) c11520jB.A01(C5I8.A15));
    }

    public static void A13(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Long l, String str) {
        interfaceC02590Ai.A9K(str, l);
        interfaceC02590Ai.A9K("carousel_container_media_id", (Long) c11520jB.A01(C5I8.A0w));
        interfaceC02590Ai.A9K("carousel_cover_media_id_int", (Long) c11520jB.A01(C5I8.A0y));
    }

    public static void A14(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("feed_request_id", (String) c11520jB.A01(C5I8.A8E));
        interfaceC02590Ai.AAP("delivery_flags", (String) c11520jB.A01(C5I8.A27));
        interfaceC02590Ai.A7v("is_eof", (Boolean) c11520jB.A01(C5I8.A4H));
    }

    public static void A1P(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", mediaIds=");
    }

    public static void A1Q(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", itemId=");
    }

    public static void A1R(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", authorId=");
    }

    public static void A1S(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", itemType=");
    }

    public static void A1T(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", inventorySource=");
    }

    public static void A1U(AbstractCollection abstractCollection, Iterator it) {
        Long valueOf = Long.valueOf(((Number) it.next()).longValue());
        abstractCollection.add(new C09530e4(valueOf, valueOf));
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        String str = (String) it.next();
        abstractCollection.add(new C09530e4(Long.valueOf(Long.parseLong(str)), Long.valueOf(Long.parseLong(str))));
    }

    public static void A1X(Iterator it, Map map) {
        String str = (String) it.next();
        map.put(Long.valueOf(Long.parseLong(str)), Long.valueOf(Long.parseLong(str)));
    }

    public static void A1Y(Iterator it, Map map) {
        map.put(Long.valueOf(AbstractC105314ol.A00(r2).ordinal()), (String) it.next());
    }

    public static Object[] A1b(long[] jArr) {
        return new Object[]{Arrays.toString(jArr)};
    }
}
