package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;

/* renamed from: X.5lU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125235lU {
    public static final String A00(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) AbstractC001800i.A0O(AbstractC001900j.A0R(str, new String[]{"_"}, 0), 0);
        if (str2 != null && AbstractC001900j.A0a(str2, ".", false)) {
            return (String) AbstractC001800i.A0O(AbstractC001900j.A0R(str2, new String[]{"."}, 0), 1);
        }
        return str2;
    }

    public static final void A01(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        C11520jB A01 = c82713mZ.A01();
        String str = (String) A01.A01(C5I8.A66);
        if (str != null && !str.equals(C1XV.A10.toString()) && !str.equals(C1XV.A0G.toString())) {
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_netego_impression");
            C11500j9 c11500j9 = C5I8.A5K;
            String A002 = A00((String) A01.A01(c11500j9));
            C19260xA c19260xA = c82713mZ.A00().A06;
            if (A00.isSampled()) {
                A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                A00.AAP("action", (String) A01.A01(C5I8.A00));
                A00.AAP("delivery_flags", (String) A01.A01(C5I8.A27));
                A00.AAP("inventory_source", (String) A01.A01(C5I8.A3r));
                A00.AAP("module_name", interfaceC60442pS.getModuleName());
                A00.AAP("ranking_session_id", (String) A01.A01(C5I8.A6s));
                A00.AAP("ranking_info_token", (String) A01.A01(C5I8.A6r));
                A00.AAP("container_module", c19260xA.A05("container_module"));
                A00.AAP("radio_type", (String) A01.A01(C5I8.A6q));
                A00.A7v("post_impression_column_override", (Boolean) A01.A01(C5I8.A6Q));
                A00.A9K("a_pk", (Long) A01.A01(C5I8.A0Z));
                A00.A9K("ad_consumed_media_gap", (Long) A01.A01(C5I8.A06));
                A00.AAP("async_ad_source", (String) A01.A01(C5I8.A0V));
                A00.A7v("canary", null);
                if (((Number) A01.A01(C5I8.A20)) != null) {
                    l = Long.valueOf(r0.intValue());
                } else {
                    l = null;
                }
                A00.A9K("dark_mode_state", l);
                A00.AAP("device_model", null);
                A00.AAP("device_os", null);
                A00.AAP("deviceid", null);
                A00.A8I("elapsed_time_since_last_item", (Double) A01.A01(C5I8.A2Q));
                A00.AAP("follow_status", (String) A01.A01(C5I8.A2w));
                A00.AAP("format", null);
                A00.AAP("frontend_env", null);
                A00.A9K("gap_to_last_ad", (Long) A01.A01(C5I8.A34));
                Long l6 = (Long) A01.A01(C5I8.A35);
                if (l6 == null) {
                    l6 = null;
                }
                A00.A9K("gap_to_last_netego", l6);
                A00.A9K("highest_position_rule", (Long) A01.A01(C5I8.A3V));
                A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, null);
                A00.A9K("ig_userid", null);
                A00.A9K("imp_logger_ver", (Long) A01.A01(C5I8.A3l));
                A00.A7v("impression_logger_validate", (Boolean) A01.A01(C5I8.A3j));
                A00.AAP("insertion_context", null);
                A00.A7v("is_acp_delivered", (Boolean) A01.A01(C5I8.A3u));
                A00.A7v("is_ad", (Boolean) A01.A01(C5I8.A3t));
                A00.AAP("is_coming_from", (String) A01.A01(C5I8.A43));
                A00.A7v("is_dark_mode", Boolean.valueOf(C1H6.A03()));
                A00.A7v("is_from_needy_user", null);
                A00.A7v("is_highlights_sourced", (Boolean) A01.A01(C5I8.A4L));
                A00.A7v("is_using_new_gap_logging", null);
                A00.A7v("is_video_to_carousel", (Boolean) A01.A01(C5I8.A51));
                A00.A9K("m_ix", (Long) A01.A01(C5I8.A3n));
                A00.AAP("m_pk", (String) A01.A01(c11500j9));
                A00.A9K("m_t", (Long) A01.A01(C5I8.A5c));
                A00.A9K("max_reel_gap_to_previous_item", (Long) A01.A01(C5I8.A5D));
                if (A002 != null) {
                    l2 = AbstractC003100w.A0k(10, A002);
                } else {
                    l2 = null;
                }
                A00.A9K("media_id", l2);
                A00.A9K("min_consumed_media_gap_to_previous_ad", (Long) A01.A01(C5I8.A5j));
                A00.A9K("min_consumed_media_gap_to_previous_netego", (Long) A01.A01(C5I8.A5k));
                A00.A9K("min_consumed_reel_gap_to_previous_ad", (Long) A01.A01(C5I8.A5l));
                A00.A9K("min_consumed_reel_gap_to_previous_netego", (Long) A01.A01(C5I8.A5m));
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.A9K("netego_consumed_media_gap", (Long) A01.A01(C5I8.A63));
                A00.AAP("netego_id", (String) A01.A01(C5I8.A64));
                if (((Number) A01.A01(C5I8.A65)) != null) {
                    l3 = Long.valueOf(r0.intValue());
                } else {
                    l3 = null;
                }
                A00.A9K("netego_subtype", l3);
                A00.AAP("original_referrer_domain", null);
                A00.AAP("original_referrer", null);
                A00.A9K("position", (Long) A01.A01(C5I8.A6Y));
                String str2 = (String) A01.A01(C5I8.A6b);
                if (str2 != null) {
                    l4 = AbstractC003100w.A0k(10, str2);
                } else {
                    l4 = null;
                }
                A00.A9K("post_id", l4);
                A00.AAP("primary_locale", null);
                A00.A9K("priority_index", (Long) A01.A01(C5I8.A6i));
                A00.A7v("production_build", (Boolean) A01.A01(C5I8.A2i));
                A00.A7v("pwa", null);
                A00.AAQ(null, QuickExperimentDumperPlugin.NAME);
                A00.AAP("ranking_algorithm", null);
                A00.A9K("rating_value", null);
                A00.A9K("reel_gap_to_last_ad", (Long) A01.A01(C5I8.A7U));
                A00.A9K("reel_gap_to_last_netego", (Long) A01.A01(C5I8.A7V));
                A00.AAP("reel_id", (String) A01.A01(C5I8.A7W));
                A00.A9K("reel_position", (Long) A01.A01(C5I8.A7X));
                A00.A9K("reel_size", (Long) A01.A01(C5I8.A7Y));
                A00.A9K("reel_start_position", (Long) A01.A01(C5I8.A7Z));
                A00.AAP("reel_type", (String) A01.A01(C5I8.A7b));
                A00.A9K("reel_viewer_entry_position", (Long) A01.A01(C5I8.A7c));
                A00.A9K("reel_viewer_position", (Long) A01.A01(C5I8.A7e));
                A00.AAP("referrer_domain", null);
                A00.AAP("referrer", null);
                A00.AAP("release_channel", (String) A01.A01(C5I8.A7f));
                A00.AAP("rollout_hash", null);
                A00.A9K("session_reel_counter", (Long) A01.A01(C5I8.A84));
                A00.AAP("sessions_chain", (String) A01.A01(C5I8.A82));
                String str3 = (String) A01.A01(C5I8.A8G);
                if (str3 == null) {
                    str3 = interfaceC60442pS.getModuleName();
                }
                A00.AAP("source_of_action", str3);
                A00.AAk("sticker_types", null);
                A00.AAP("story_ranking_token", (String) A01.A01(C5I8.A8U));
                A00.A8I("time_elapsed", (Double) A01.A01(C5I8.A95));
                A00.A8I("time_remaining", (Double) A01.A01(C5I8.A9A));
                A00.AAP("tracking_token", c19260xA.A05("tracking_token"));
                String str4 = (String) A01.A01(C5I8.A9W);
                if (str4 != null) {
                    l5 = AbstractC003100w.A0k(10, str4);
                } else {
                    l5 = null;
                }
                A00.A9K("tray_pos_excl_own_story", l5);
                A00.A9K("tray_position", (Long) A01.A01(C5I8.A9V));
                A00.AAP("tray_session_id", (String) A01.A01(C5I8.A7a));
                A00.A9K("unseen_reel_size", null);
                A00.AAP("url", (String) A01.A01(C5I8.A9g));
                A00.AAP("view_state_item_type", null);
                A00.AAP("view", null);
                A00.AAP("viewer_session_id", (String) A01.A01(C5I8.A9o));
                A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                A00.AAP("device_fold_state", AbstractC82683mW.A00);
                A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                A00.Cht();
            }
        }
    }
}
