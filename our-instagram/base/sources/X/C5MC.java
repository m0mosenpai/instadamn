package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5MC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5MC {
    public static final void A00(C18920wW c18920wW, UserSession userSession, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        ArrayList arrayList;
        C0Zx c0Zx;
        C0Zx c0Zx2;
        ArrayList arrayList2;
        C0Zx c0Zx3;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap;
        List list;
        C0Zx c0Zx4;
        C0Zx c0Zx5;
        C0Zx c0Zx6;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String A05;
        ArrayList arrayList7;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_ad_impression");
        C11520jB A01 = c82713mZ.A01();
        Long l = (Long) A01.A01(C5I8.A3Z);
        if (l == null) {
            l = null;
        }
        Long l2 = (Long) A01.A01(C5I8.A3a);
        if (l2 != null) {
            long longValue = l2.longValue();
            if (l == null || longValue != l.longValue()) {
                C18950wb c18950wb = C18950wb.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("\n                HostProfile Id's mismatch while reporting:\n                hpid on mediaState: ");
                sb.append(longValue);
                sb.append("\n                and hpid reported: ");
                sb.append(l);
                sb.append("\n              ");
                C0f5 AEp = c18950wb.AEp(AbstractC16490ru.A0p(sb.toString()), 817898950);
                AEp.ABW("module_name", interfaceC60442pS.getModuleName());
                AEp.report();
            }
        } else {
            l2 = null;
        }
        if (A00.isSampled()) {
            A00.AAP("m_pk", (String) A01.A01(C5I8.A5K));
            A00.A9K("m_t", (Long) A01.A01(C5I8.A5c));
            A00.A9K("hashtag_id", (Long) A01.A01(C5I8.A3P));
            ArrayList arrayList8 = (ArrayList) A01.A01(C5I8.A2r);
            A00.AAP("feed_sticker_media_id", arrayList8 != null ? (String) AbstractC001800i.A0O(arrayList8, 0) : null);
            A00.AAP("format_liquidity_use_case", (String) A01.A01(C5I8.A2x));
            A00.AAP("inventory_source", (String) A01.A01(C5I8.A3r));
            A00.A9K("carousel_index", (Long) A01.A01(C5I8.A0z));
            A00.A9K("ad_id", (Long) A01.A01(C5I8.A0C));
            A00.AAP("tracking_token", (String) A01.A01(C5I8.A9R));
            A00.AAP("action", (String) A01.A01(C5I8.A00));
            A00.A9K("m_ix", (Long) A01.A01(C5I8.A3n));
            A00.A9K("ad_inserted_position", (Long) A01.A01(C5I8.A0D));
            A00.A9K("reel_gap", (Long) A01.A01(C5I8.A7S));
            A00.A9K("gap_to_last_ad", (Long) A01.A01(C5I8.A34));
            A00.A9K("gap_to_previous_multi_ads", (Long) A01.A01(C5I8.A36));
            A00.A9K("previous_multi_ads_type", (Long) A01.A01(C5I8.A57));
            A00.A9K("top_followers_count", (Long) A01.A01(C5I8.A9N));
            A00.A9K("top_likers_count", (Long) A01.A01(C5I8.A9O));
            A00.A9K("carousel_opt_in_position", (Long) A01.A01(C5I8.A14));
            A00.AAP("follow_status", (String) A01.A01(C5I8.A2w));
            A00.A9K("reel_size", (Long) A01.A01(C5I8.A7Y));
            A00.A9K("reel_position", (Long) A01.A01(C5I8.A7X));
            A00.AAP("event_trace_id", (String) A01.A01(C5I8.A2g));
            A00.AAP("host_video_pk", (String) A01.A01(C5I8.A3b));
            A00.AAP("host_media_pk", (String) A01.A01(C5I8.A3Y));
            A00.AAP("ranking_session_id", (String) A01.A01(C5I8.A6s));
            A00.AAP("media_layout_encoded_string", (String) A01.A01(C5I8.A5Q));
            A00.A7v("mop_should_double_logging", (Boolean) A01.A01(C5I8.A5p));
            A00.A7v("mop_should_rollout", (Boolean) A01.A01(C5I8.A5q));
            A00.A7v("is_zoomed_out", (Boolean) A01.A01(C5I8.A52));
            A00.A7v("is_acp_delivered", (Boolean) A01.A01(C5I8.A3u));
            AbstractCollection abstractCollection = (AbstractCollection) A01.A01(C5I8.A1e);
            if (abstractCollection != null) {
                ArrayList arrayList9 = new ArrayList(AbstractC06950Ym.A1E(abstractCollection, 10));
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    arrayList9.add(AbstractC06930Yk.A03((HashMap) it.next()));
                }
                arrayList = AbstractC001800i.A0U(arrayList9);
            } else {
                arrayList = null;
            }
            A00.AAk("client_ad_creative_optimization_output", arrayList);
            A00.A7v("is_previewable_video_ad", (Boolean) A01.A01(C5I8.A4c));
            A00.A7v("is_ad_tag_enabled", (Boolean) A01.A01(C5I8.A3v));
            A00.AAP("delivery_flags", (String) A01.A01(C5I8.A27));
            A00.A9K("media_id", (Long) A01.A01(C5I8.A5M));
            A00.A9K("media_author_id", (Long) A01.A01(C5I8.A5G));
            A00.AAP("module_name", interfaceC60442pS.getModuleName());
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.AAP("ad_skip_type", (String) A01.A01(C5I8.A0M));
            A00.AAP("carousel_cover_media_id", (String) A01.A01(C5I8.A0x));
            A00.AAP("carousel_media_id", (String) A01.A01(C5I8.A10));
            A00.A9K("carousel_starting_media_id", (Long) A01.A01(C5I8.A16));
            A00.A9K("carousel_media_id_int", (Long) A01.A01(C5I8.A11));
            A00.A9K("carousel_container_media_id", (Long) A01.A01(C5I8.A0w));
            A00.A9K("carousel_cover_media_id_int", (Long) A01.A01(C5I8.A0y));
            A00.A9K("reel_viewer_position", (Long) A01.A01(C5I8.A7e));
            A00.A9K("tray_position", (Long) A01.A01(C5I8.A9V));
            A00.A9K("position", (Long) A01.A01(C5I8.A6Y));
            A00.A9K("client_position", (Long) A01.A01(C5I8.A3s));
            A00.AAP("ranking_info_token", (String) A01.A01(C5I8.A6r));
            A00.A9K("is_dark_mode", (Long) A01.A01(C5I8.A4C));
            A00.A7v("is_eof", (Boolean) A01.A01(C5I8.A4H));
            A00.AAP("entity_type", (String) A01.A01(C5I8.A2e));
            A00.A9K("entity_id", (Long) A01.A01(C5I8.A2a));
            A00.AAP("entity_name", (String) A01.A01(C5I8.A2b));
            A00.AAP("mezql_token", (String) A01.A01(C5I8.A5i));
            A00.A8I("media_dwell_time", (Double) A01.A01(C5I8.A5H));
            A00.AAP("chaining_session_id", (String) A01.A01(C5I8.A1C));
            A00.A9K("chaining_position", (Long) A01.A01(C5I8.A1A));
            A00.A9K("chaining_seed_media_id", (Long) A01.A01(C5I8.A3g));
            A00.A9K("chaining_seed_author_id", (Long) A01.A01(C5I8.A1B));
            A00.AAP("topic_cluster_id", (String) A01.A01(C5I8.A9J));
            A00.AAP("topic_cluster_title", (String) A01.A01(C5I8.A9L));
            A00.AAP("topic_cluster_type", (String) A01.A01(C5I8.A9M));
            A00.AAP("topic_cluster_debug_info", (String) A01.A01(C5I8.A9I));
            A00.A8I("media_time_elapsed", (Double) A01.A01(C5I8.A5a));
            A00.A8I("media_time_paused", (Double) A01.A01(C5I8.A5V));
            A00.A8I("media_time_remaining", (Double) A01.A01(C5I8.A5b));
            A00.A8I("media_time_to_load", (Double) A01.A01(C5I8.A5S));
            A00.A9K("media_loading_progress", (Long) A01.A01(C5I8.A5R));
            A00.AAP("reel_id", (String) A01.A01(C5I8.A7W));
            A00.AAP("reel_type", (String) A01.A01(C5I8.A7b));
            A00.AAP("tray_session_id", (String) A01.A01(C5I8.A7a));
            A00.AAP("viewer_session_id", (String) A01.A01(C5I8.A9o));
            A00.A7v("is_highlights_sourced", (Boolean) A01.A01(C5I8.A4L));
            A00.A8I("feed_cta_highlight_time", (Double) A01.A01(C5I8.A2n));
            A00.A7v("feed_cta_highlight_time_upper_capped", (Boolean) A01.A01(C5I8.A2p));
            A00.A7v("feed_cta_highlight_time_lower_capped", (Boolean) A01.A01(C5I8.A2o));
            A00.AAP("story_ranking_token", (String) A01.A01(C5I8.A8U));
            A00.A7v("is_cta_sticker_available", (Boolean) A01.A01(C5I8.A45));
            A00.A7v("is_cta_sticker_shown", (Boolean) A01.A01(C5I8.A48));
            A00.A7v("is_cta_sticker_metadata_shown", (Boolean) A01.A01(C5I8.A47));
            A00.AAP("cta_sticker_metadata_style", (String) A01.A01(C5I8.A1s));
            A00.AAP("dynamic_cta_replacement_text", (String) A01.A01(C5I8.A1o));
            A00.A7v("dynamic_cta_has_emoji", (Boolean) A01.A01(C5I8.A1m));
            A00.AAP("dynamic_cta_language", (String) A01.A01(C5I8.A1n));
            A00.AAP("dynamic_cta_text_source", (String) A01.A01(C5I8.A1p));
            A00.A7v("is_sensitive_vertical_ad", (Boolean) A01.A01(C5I8.A4q));
            A00.A7v("is_cta_sticker_smart_position_available", (Boolean) A01.A01(C5I8.A4B));
            A00.A7v("is_cta_sticker_smart_position_10_percent_text_overlap", (Boolean) A01.A01(C5I8.A49));
            A00.A7v("is_cta_sticker_smart_position_20_percent_text_overlap", (Boolean) A01.A01(C5I8.A4A));
            A00.A7v("is_cta_sticker_custom_position_info_available", (Boolean) A01.A01(C5I8.A46));
            A00.A7v("cta_sticker_smart_position_has_overlap", (Boolean) A01.A01(C5I8.A1u));
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A1j);
            if (c11520jB == null) {
                c0Zx = null;
            } else {
                c0Zx = new C0Zx();
                Number number = (Number) c11520jB.A01(C5I8.A1k);
                c0Zx.A04("center_x", Double.valueOf(number != null ? number.doubleValue() : 0.0d));
                Number number2 = (Number) c11520jB.A01(C5I8.A1l);
                c0Zx.A04("center_y", Double.valueOf(number2 != null ? number2.doubleValue() : 0.0d));
            }
            A00.AAQ(c0Zx, "cta_sticker_smart_position_custom_position_info");
            C11520jB c11520jB2 = (C11520jB) A01.A01(C5I8.A1t);
            if (c11520jB2 == null) {
                c0Zx2 = null;
            } else {
                c0Zx2 = new C0Zx();
                Number number3 = (Number) c11520jB2.A01(C5I8.A1q);
                c0Zx2.A04(IgReactMediaPickerNativeModule.HEIGHT, Double.valueOf(number3 != null ? number3.doubleValue() : -1.0d));
                Number number4 = (Number) c11520jB2.A01(C5I8.A1v);
                c0Zx2.A04(IgReactMediaPickerNativeModule.WIDTH, Double.valueOf(number4 != null ? number4.doubleValue() : -1.0d));
            }
            A00.AAQ(c0Zx2, "cta_sticker_size_info_in_dp_pt");
            A00.AAk("cta_sticker_invalidation_reasons", (List) A01.A01(C5I8.A1r));
            A00.A7v("media_interactivity_enabled", (Boolean) A01.A01(C5I8.A5O));
            AbstractCollection abstractCollection2 = (AbstractCollection) A01.A01(C5I8.A6l);
            if (abstractCollection2 != null) {
                ArrayList arrayList10 = new ArrayList(AbstractC06950Ym.A1E(abstractCollection2, 10));
                Iterator it2 = abstractCollection2.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    C14360o3.A0B(str, 0);
                    arrayList10.add(AbstractC003100w.A0k(10, str));
                }
                arrayList2 = new ArrayList(AbstractC001800i.A0X(arrayList10));
            } else {
                arrayList2 = null;
            }
            A00.AAk("product_ids", arrayList2);
            A00.A9K("product_id", (Long) A01.A01(C5I8.A6m));
            String str2 = (String) A01.A01(C5I8.A5g);
            A00.A9K("merchant_id", str2 != null ? Long.valueOf(Long.parseLong(str2)) : null);
            A00.A7v("is_checkout_enabled", (Boolean) A01.A01(C5I8.A42));
            A00.A7v("post_impression_column_override", (Boolean) A01.A01(C5I8.A6Q));
            A00.A7v("is_igtv", (Boolean) A01.A01(C5I8.A4N));
            A00.A7v("is_second_channel_enabled", (Boolean) A01.A01(C5I8.A4n));
            A00.AAP("radio_type", (String) A01.A01(C5I8.A6q));
            A00.A9M("two_measurement_debugging_fields", (Map) A01.A01(C5I8.A9Y));
            String str3 = (String) A01.A01(C5I8.A7w);
            A00.A9K("seed_ad_id", str3 != null ? Long.valueOf(Long.parseLong(str3)) : null);
            String str4 = (String) A01.A01(C5I8.A3c);
            A00.A9K("hscroll_seed_ad_id", str4 != null ? Long.valueOf(Long.parseLong(str4)) : null);
            String str5 = (String) A01.A01(C5I8.A3e);
            A00.A9K("hscroll_seed_media_id", str5 != null ? Long.valueOf(Long.parseLong(str5)) : null);
            String str6 = (String) A01.A01(C5I8.A3d);
            A00.A9K("hscroll_seed_media_author_igid", str6 != null ? Long.valueOf(Long.parseLong(str6)) : null);
            String str7 = (String) A01.A01(C5I8.A2v);
            A00.A9K("first_hscroll_item_ad_id", str7 != null ? Long.valueOf(Long.parseLong(str7)) : null);
            A00.A9K("horizontal_position_on_hscroll", (Long) A01.A01(C5I8.A3X));
            A00.A9K("vertical_position_on_feed_of_ads", (Long) A01.A01(C5I8.A9j));
            A00.A7v("is_multi_ads", (Boolean) A01.A01(C5I8.A4W));
            C11500j9 c11500j9 = C5I8.A60;
            A00.AAP("multi_ads_unit_id", (String) A01.A01(c11500j9));
            A00.A7v("is_multi_ads_eligible", (Boolean) A01.A01(C5I8.A4X));
            A00.A7v("is_seed_ad_multi_ads_eligible", (Boolean) A01.A01(C5I8.A4o));
            A00.A9K("multi_ads_type", (Long) A01.A01(C5I8.A5y));
            String str8 = (String) A01.A01(C5I8.A5w);
            if (str8 == null) {
                str8 = (String) A01.A01(c11500j9);
            }
            A00.AAP("multi_ads_id", str8);
            A00.A9K("position_in_multi_ads_unit", (Long) A01.A01(C5I8.A6a));
            String str9 = (String) A01.A01(C5I8.A5v);
            A00.A9K("multi_ads_first_ad_id", str9 != null ? Long.valueOf(Long.parseLong(str9)) : null);
            Long l3 = (Long) A01.A01(C5I8.A5u);
            if (l3 == null) {
                l3 = null;
            }
            A00.A9K("multi_ads_feed_of_ads_seed_ad_id", l3);
            A00.AAP("multi_ads_insertion_mechanism", (String) A01.A01(C5I8.A5x));
            A00.AAk("multi_ads_ad_ids", (List) A01.A01(C5I8.A5t));
            A00.AAP("ad_request_id", (String) A01.A01(C5I8.A0K));
            A00.AAP("imp_signature", (String) A01.A01(C5I8.A3m));
            A00.AAP("grid_ad_layout_type", (String) A01.A01(C5I8.A3M));
            A00.AAP("intent_aware_ads_trigger_type", (String) A01.A01(C5I8.A3q));
            A00.AAP("source_of_action", (String) A01.A01(C5I8.A8G));
            A00.A9K("a_pk", (Long) A01.A01(C5I8.A0Z));
            C11500j9 c11500j92 = C5I8.A93;
            A00.A9K("m_ts", (Long) A01.A01(c11500j92));
            A00.A9K("top_liker_count", (Long) A01.A01(C5I8.A9P));
            A00.A8I("elapsed_time_since_last_item", (Double) A01.A01(C5I8.A2Q));
            A00.A9K("session_reel_counter", (Long) A01.A01(C5I8.A84));
            A00.A8I("time_elapsed", (Double) A01.A01(C5I8.A95));
            A00.A9K("ad_request_position", (Long) A01.A01(C5I8.A0L));
            A00.A9K("reel_viewer_entry_position", (Long) A01.A01(C5I8.A7c));
            A00.A9K("ad_received_position", (Long) A01.A01(C5I8.A0J));
            C11520jB c11520jB3 = (C11520jB) A01.A01(C5I8.A5P);
            if (c11520jB3 != null) {
                C19260xA A002 = c11520jB3.A00();
                c0Zx3 = new C0Zx();
                c0Zx3.A03("is_showreel_native", (Boolean) c11520jB3.A01(C5I8.A4r));
                c0Zx3.A04("media_height", (Double) c11520jB3.A01(C5I8.A5J));
                c0Zx3.A04("media_width", (Double) c11520jB3.A01(C5I8.A5e));
                String A052 = A002.A05("caption_font_size");
                c0Zx3.A04("caption_font_size", A052 != null ? Double.valueOf(Double.parseDouble(A052)) : null);
                String A053 = A002.A05("caption_position_start_x");
                c0Zx3.A04("caption_position_start_x", A053 != null ? Double.valueOf(Double.parseDouble(A053)) : null);
                String A054 = A002.A05("caption_position_start_y");
                c0Zx3.A04("caption_position_start_y", A054 != null ? Double.valueOf(Double.parseDouble(A054)) : null);
                String A055 = A002.A05("caption_line_height");
                c0Zx3.A04("caption_line_height", A055 != null ? Double.valueOf(Double.parseDouble(A055)) : null);
                String A056 = A002.A05("caption_line_height");
                c0Zx3.A04("caption_height", A056 != null ? Double.valueOf(Double.parseDouble(A056)) : null);
                String A057 = A002.A05("caption_width");
                c0Zx3.A04("caption_width", A057 != null ? Double.valueOf(Double.parseDouble(A057)) : null);
                String A058 = A002.A05("is_caption_fully_displayed");
                c0Zx3.A03("is_caption_fully_displayed", A058 != null ? Boolean.valueOf(Boolean.parseBoolean(A058)) : null);
                c0Zx3.A06("caption_short_text", A002.A05("short_caption_text"));
                c0Zx3.A06("background_color_bottom", A002.A05("background_color_bottom"));
                c0Zx3.A06("background_color_caption", A002.A05("caption_background_color"));
                c0Zx3.A06("background_color_top", A002.A05("background_color_top"));
                c0Zx3.A06("caption_background_color_alpha", A002.A05("caption_background_color_alpha"));
                String A059 = A002.A05("caption_num_char_showed");
                c0Zx3.A05("caption_num_char_showed", A059 != null ? Long.valueOf(Long.parseLong(A059)) : null);
                String A0510 = A002.A05("caption_num_hashtags_showed");
                c0Zx3.A05("caption_num_hashtags_showed", A0510 != null ? Long.valueOf(Long.parseLong(A0510)) : null);
                String A0511 = A002.A05("caption_num_lines_showed");
                c0Zx3.A05("caption_num_lines_showed", A0511 != null ? Long.valueOf(Long.parseLong(A0511)) : null);
                String A0512 = A002.A05("caption_num_lines_total");
                c0Zx3.A05("caption_num_lines_total", A0512 != null ? Long.valueOf(Long.parseLong(A0512)) : null);
                c0Zx3.A05("caption_num_char_total", (Long) c11520jB3.A01(C5I8.A0u));
                String A0513 = A002.A05("caption_num_mentions_showed");
                c0Zx3.A05("caption_num_mentions_showed", A0513 != null ? Long.valueOf(Long.parseLong(A0513)) : null);
                c0Zx3.A06("caption_text_color", A002.A05("caption_text_color"));
                c0Zx3.A06("cta_color", (String) c11520jB3.A01(C5I8.A1i));
                String A0514 = A002.A05("is_highlighted_keyword_shown");
                c0Zx3.A03("is_highlighted_keyword_shown", A0514 != null ? Boolean.valueOf(Boolean.parseBoolean(A0514)) : null);
                c0Zx3.A06("caption_highlights_model_type", A002.A05("caption_highlights_model_type"));
                String A0515 = A002.A05("caption_num_highlights_showed");
                c0Zx3.A05("caption_num_highlights_showed", A0515 != null ? Long.valueOf(Long.parseLong(A0515)) : null);
                String A0516 = A002.A05("caption_num_highlights_dropped");
                c0Zx3.A05("caption_num_highlights_dropped", A0516 != null ? Long.valueOf(Long.parseLong(A0516)) : null);
                AbstractCollection abstractCollection3 = (AbstractCollection) c11520jB3.A01(C5I8.A0s);
                if (abstractCollection3 == null) {
                    arrayList7 = null;
                } else {
                    arrayList7 = new ArrayList(AbstractC06950Ym.A1E(abstractCollection3, 10));
                    Iterator it3 = abstractCollection3.iterator();
                    while (it3.hasNext()) {
                        C11520jB c11520jB4 = (C11520jB) it3.next();
                        C0Zx c0Zx7 = new C0Zx();
                        String str10 = (String) c11520jB4.A01(C5I8.A0t);
                        String str11 = "";
                        if (str10 == null) {
                            str10 = "";
                        }
                        c0Zx7.A06("token", str10);
                        String str12 = (String) c11520jB4.A01(C5I8.A0r);
                        if (str12 != null) {
                            str11 = str12;
                        }
                        c0Zx7.A06("category", str11);
                        arrayList7.add(c0Zx7);
                    }
                }
                c0Zx3.A07("caption_highlights_showed", arrayList7);
                c0Zx3.A06("headline_text_showed", A002.A05("headline_text_showed"));
                c0Zx3.A04("screen_density", (Double) c11520jB3.A01(C5I8.A7o));
                c0Zx3.A04("screen_height", (Double) c11520jB3.A01(C5I8.A7p));
                c0Zx3.A04("screen_width", (Double) c11520jB3.A01(C5I8.A7q));
                c0Zx3.A03("is_toolbar_below_media", (Boolean) c11520jB3.A01(C5I8.A4w));
                String A0517 = A002.A05("is_systematic_caption");
                c0Zx3.A03("is_systematic_caption", A0517 != null ? Boolean.valueOf(Boolean.parseBoolean(A0517)) : null);
            } else {
                c0Zx3 = null;
            }
            A00.AAQ(c0Zx3, "media_layout");
            A00.A7v("is_video_to_carousel", (Boolean) A01.A01(C5I8.A51));
            A00.A7v("is_long_story_video", (Boolean) A01.A01(C5I8.A4S));
            A00.A9K("ad_position_from_server", (Long) A01.A01(C5I8.A0I));
            A00.A9K("reel_start_position", (Long) A01.A01(C5I8.A7Z));
            A00.A9K("reel_gap_to_last_ad", (Long) A01.A01(C5I8.A7U));
            Long l4 = (Long) A01.A01(C5I8.A7V);
            if (l4 == null) {
                l4 = null;
            }
            A00.A9K("reel_gap_to_last_netego", l4);
            A00.A9K("ad_consumed_media_gap", (Long) A01.A01(C5I8.A06));
            A00.A9K("netego_consumed_media_gap", (Long) A01.A01(C5I8.A63));
            A00.A9K("min_consumed_media_gap_to_previous_ad", (Long) A01.A01(C5I8.A5l));
            A00.A9K("min_consumed_media_gap_to_previous_netego", (Long) A01.A01(C5I8.A5m));
            A00.A9K("min_consumed_reel_gap_to_previous_ad", (Long) A01.A01(C5I8.A5j));
            A00.A9K("min_consumed_reel_gap_to_previous_netego", (Long) A01.A01(C5I8.A5k));
            A00.A9K("priority_index", (Long) A01.A01(C5I8.A6i));
            A00.A9K("highest_position_rule", (Long) A01.A01(C5I8.A3V));
            A00.A9K("max_reel_gap_to_previous_item", (Long) A01.A01(C5I8.A5D));
            A00.A9K("min_media_gap_to_previous_item", (Long) A01.A01(C5I8.A5n));
            A00.A8I("time_gap_to_previous_item_in_sec", (Double) A01.A01(C5I8.A97));
            A00.AAP("release_channel", (String) A01.A01(C5I8.A7f));
            A00.A9K("consumed_media_gap", (Long) A01.A01(C5I8.A1Z));
            A00.A7v("is_ad", (Boolean) A01.A01(C5I8.A3t));
            A00.A9K("consumed_media_gap_highest_position", (Long) A01.A01(C5I8.A1a));
            A00.A9K("reel_gap_highest_position", (Long) A01.A01(C5I8.A7T));
            A00.A9K("imp_logger_ver", (Long) A01.A01(C5I8.A53));
            A00.AAP("previous_media_pk", (String) A01.A01(C5I8.A6c));
            A00.AAP("next_media_pk", (String) A01.A01(C5I8.A68));
            A00.AAP("is_app_backgrounded", (String) A01.A01(C5I8.A3y));
            A00.AAP("last_navigation_module", (String) A01.A01(C5I8.A58));
            String str13 = (String) A01.A01(C5I8.A61);
            A00.A9K("nav_in_transit", str13 != null ? Long.valueOf(Long.parseLong(str13)) : null);
            A00.AAP("feed_request_id", (String) A01.A01(C5I8.A8E));
            A00.AAP("application_state", (String) A01.A01(C5I8.A0Q));
            A00.AAP("current_module", interfaceC60442pS.getModuleName());
            A00.A9K("gap_to_last_netego", (Long) A01.A01(C5I8.A35));
            A00.A8I("time_remaining", (Double) A01.A01(C5I8.A9A));
            A00.AAP("is_coming_from", (String) A01.A01(C5I8.A43));
            A00.AAP("async_ad_source", (String) A01.A01(C5I8.A0V));
            A00.AAP("post_id", (String) A01.A01(C5I8.A6b));
            A00.A7v("impression_logger_validate", (Boolean) A01.A01(C5I8.A3j));
            A00.AAP("parent_m_pk", (String) A01.A01(C5I8.A6U));
            A00.A9K("carousel_size", (Long) A01.A01(C5I8.A15));
            A00.AAP("nav_chain", (String) A01.A01(C5I8.A62));
            A00.A9K("carousel_m_t", (Long) A01.A01(C5I8.A12));
            A00.A7v("is_holdout", (Boolean) A01.A01(C5I8.A4M));
            A00.AAP("sessions_chain", (String) A01.A01(C5I8.A82));
            A00.AAk("sticker_types", null);
            A00.A9K("sponsor_tag_count", (Long) A01.A01(C5I8.A8L));
            A00.AAk("sponsor_tag_ids", (List) A01.A01(C5I8.A8N));
            A00.A9K("segment_index", (Long) A01.A01(C5I8.A7y));
            A00.A9K("segment_count", (Long) A01.A01(C5I8.A7x));
            A00.AAP("ad_pod_id", (String) A01.A01(C5I8.A0G));
            A00.A9K("index_in_ad_pod", (Long) A01.A01(C5I8.A3o));
            AbstractCollection abstractCollection4 = (AbstractCollection) A01.A01(C5I8.A9m);
            if (abstractCollection4 != null) {
                ArrayList arrayList11 = new ArrayList(AbstractC06950Ym.A1E(abstractCollection4, 10));
                Iterator it4 = abstractCollection4.iterator();
                while (it4.hasNext()) {
                    arrayList11.add(AnonymousClass010.A0m((String) it4.next()));
                }
                arrayList3 = new ArrayList(AbstractC001800i.A0X(arrayList11));
            } else {
                arrayList3 = null;
            }
            A00.AAk("video_to_carousel_cut_secs", arrayList3);
            A00.A9K("carousel_media_type", (Long) A01.A01(C5I8.A13));
            A00.AAk("carousel_transformation_cards", (List) A01.A01(C5I8.A17));
            A00.A9K("carousel_transformation_type", null);
            A00.AAP("impression_type", (String) A01.A01(C5I8.A3k));
            A00.AAQ(null, "toolbar_layout");
            A00.AAP("entity_follow_status", (String) A01.A01(C5I8.A2Z));
            A00.AAP("endpoint_type", (String) A01.A01(C5I8.A2S));
            A00.AAP("byline_text", (String) A01.A01(C5I8.A0l));
            A00.A9K("dr_ad_type", (Long) A01.A01(C5I8.A2K));
            A00.A7v("is_pride_media", (Boolean) A01.A01(C5I8.A4e));
            A00.A7v("is_besties_media", (Boolean) A01.A01(C5I8.A40));
            A00.A8I("normalized_feed_position", ((Number) A01.A01(C5I8.A6A)) != null ? Double.valueOf(r0.longValue()) : null);
            A00.A7v("is_influencer", (Boolean) A01.A01(C5I8.A4P));
            A00.AAP("is_programmatic_scroll", (String) A01.A01(C5I8.A4h));
            A00.AAk("tagged_user_ids", (List) A01.A01(C5I8.A8p));
            A00.A7v("is_image_loaded", (Boolean) A01.A01(C5I8.A4O));
            A00.AAP("media_tags_hashtag_name", (String) A01.A01(C5I8.A5X));
            A00.A9K("media_tags_total_hashtags", (Long) A01.A01(C5I8.A5Y));
            A00.A9K("seq_num", (Long) A01.A01(C5I8.A7z));
            A00.AAP("igtv_viewer_session_id", (String) A01.A01(C5I8.A3i));
            A00.AAP("disclaimer_text", (String) A01.A01(C5I8.A2D));
            A00.AAP("disclaimer_title", (String) A01.A01(C5I8.A2E));
            A00.A9K("carousel_type", (Long) A01.A01(C5I8.A19));
            String str14 = (String) A01.A01(C5I8.A9Z);
            A00.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str14 != null ? Long.valueOf(Long.parseLong(str14)) : null);
            A00.AAP("channel_pk", (String) A01.A01(C5I8.A1E));
            A00.A9K("has_top_likers", (Long) A01.A01(C5I8.A3U));
            A00.A9K("ad_delivery_position", (Long) A01.A01(C5I8.A0A));
            A00.A7v("is_first_ad_in_the_session", (Boolean) A01.A01(C5I8.A4I));
            A00.A9K("seq_session", (Long) A01.A01(C5I8.A80));
            A00.AAP("cache_key", (String) A01.A01(C5I8.A0m));
            A00.AAP("call_stack", (String) A01.A01(C5I8.A0n));
            A00.A8I("time_interval_since_reference_date", (Double) A01.A01(C5I8.A98));
            A00.A8I("time_stamp", ((Number) A01.A01(c11500j92)) != null ? Double.valueOf(r0.longValue()) : null);
            String str15 = (String) A01.A01(C5I8.A5C);
            A00.A9K("main_feed_carousel_starting_media_id", str15 != null ? Long.valueOf(Long.parseLong(str15)) : null);
            AbstractMap abstractMap = (AbstractMap) A01.A01(C5I8.A6n);
            if (abstractMap != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(abstractMap.size()));
                for (Map.Entry entry : abstractMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), AbstractC001800i.A0U((Collection) entry.getValue()));
                }
                linkedHashMap = AbstractC06930Yk.A03(linkedHashMap2);
            } else {
                linkedHashMap = null;
            }
            A00.A9M("product_merchant_ids", linkedHashMap);
            C11520jB c11520jB5 = (C11520jB) A01.A01(C5I8.A0k);
            if (c11520jB5 != null && (A05 = c11520jB5.A00().A05("incentive_id")) != null) {
                C0Zx c0Zx8 = new C0Zx();
                c0Zx8.A06("display_type", "visible");
                c0Zx8.A05("discount_id", Long.valueOf(Long.parseLong(A05)));
                list = Collections.singletonList(c0Zx8);
                C14360o3.A07(list);
            } else {
                list = C16930sl.A00;
            }
            A00.AAk("promotions", list);
            A00.A9K("media_owner_id", (Long) A01.A01(C5I8.A5U));
            A00.AAP("explore_topic_session_id", (String) A01.A01(C5I8.A2h));
            A00.A9K("next_max_id", (Long) A01.A01(C5I8.A67));
            A00.A7v("is_internal_build", (Boolean) A01.A01(C5I8.A4Q));
            A00.AAP("disclaimer_url", (String) A01.A01(C5I8.A2F));
            A00.AAP("next_inventory_source", (String) A01.A01(C5I8.A69));
            A00.AAP("prev_inventory_source", (String) A01.A01(C5I8.A6d));
            A00.AAP(AbstractC37307Gc9.A01(12, 10, 122), (String) A01.A01(C5I8.A83));
            A00.AAP("sponsored_label_text", (String) A01.A01(C5I8.A8J));
            A00.A7v("is_merlin_double_logging_enabled", (Boolean) A01.A01(C5I8.A4V));
            C11520jB c11520jB6 = (C11520jB) A01.A01(C5I8.A77);
            if (c11520jB6 == null) {
                c0Zx4 = null;
            } else {
                c0Zx4 = new C0Zx();
                c0Zx4.A06("body", (String) c11520jB6.A01(C5I8.A78));
                c0Zx4.A03("has_image", (Boolean) c11520jB6.A01(C5I8.A7C));
                c0Zx4.A06("style", (String) c11520jB6.A01(C5I8.A7I));
                c0Zx4.A06("title_option", (String) c11520jB6.A01(C5I8.A7K));
                c0Zx4.A06(DialogModule.KEY_TITLE, (String) c11520jB6.A01(C5I8.A7L));
                c0Zx4.A06("subtitle", (String) c11520jB6.A01(C5I8.A7J));
                c0Zx4.A06("format", (String) c11520jB6.A01(C5I8.A7B));
                c0Zx4.A05("image_width", (Long) c11520jB6.A01(C5I8.A7G));
                c0Zx4.A05("image_height", (Long) c11520jB6.A01(C5I8.A7F));
                c0Zx4.A03("hide_caption", (Boolean) c11520jB6.A01(C5I8.A7D));
                c0Zx4.A03("hide_social_context", (Boolean) c11520jB6.A01(C5I8.A7E));
                c0Zx4.A03("dismissible", (Boolean) c11520jB6.A01(C5I8.A79));
            }
            A00.AAQ(c0Zx4, "reels_mid_scene_info");
            A00.AAP("django_push_phase", (String) A01.A01(C5I8.A2H));
            String str16 = (String) A01.A01(C5I8.A0X);
            A00.A9K("audio_asset_id", str16 != null ? Long.valueOf(Long.parseLong(str16)) : null);
            A00.AAP("rendering_metadata", (String) A01.A01(C5I8.A7h));
            A00.A9K("previous_position", ((Number) A01.A01(C5I8.A6e)) != null ? Long.valueOf(r0.intValue()) : null);
            Number number5 = (Number) A01.A01(C5I8.A96);
            A00.A9K("time_gap", number5 != null ? Long.valueOf((long) number5.doubleValue()) : null);
            A00.A9K("min_push_up_gap", ((Number) A01.A01(C5I8.A5o)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.A9K("gap_after_push_up", ((Number) A01.A01(C5I8.A32)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.A9K("brs_threshold", ((Number) A01.A01(C5I8.A0i)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.AAP("organic_media_id_before", (String) A01.A01(C5I8.A6P));
            A00.A9K("organic_brs_severity_before", ((Number) A01.A01(C5I8.A6L)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.AAP("organic_media_id_after", (String) A01.A01(C5I8.A6O));
            A00.A9K("organic_brs_severity_after", ((Number) A01.A01(C5I8.A6K)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.AAP("position_change_reason", (String) A01.A01(C5I8.A6Z));
            A00.A9K("gap_before_push_down", ((Number) A01.A01(C5I8.A33)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.A9K("push_down_distance", ((Number) A01.A01(C5I8.A6o)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.A9K("previous_sponsored_item_position_before_push_up", ((Number) A01.A01(C5I8.A6f)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.AAP("previous_sponsored_item_type_before_push_up", (String) A01.A01(C5I8.A6g));
            A00.A7v("is_demo", (Boolean) A01.A01(C5I8.A4D));
            A00.A9K("actual_insert_position", (Long) A01.A01(C5I8.A03));
            A00.AAP("ad_client_delivery_session_id", (String) A01.A01(C5I8.A05));
            A00.AAP("afs_enablement_status", C32V.A00(userSession));
            C11520jB c11520jB7 = (C11520jB) A01.A01(C5I8.A8A);
            if (c11520jB7 != null) {
                c0Zx5 = new C0Zx();
                c0Zx5.A05("social_context_placement", (Long) c11520jB7.A01(C5I8.A8B));
                c0Zx5.A06("social_context_type", (String) c11520jB7.A01(C5I8.A8C));
            } else {
                c0Zx5 = null;
            }
            A00.AAQ(c0Zx5, "social_context");
            C11520jB c11520jB8 = (C11520jB) A01.A01(C5I8.A2q);
            if (c11520jB8 != null) {
                c0Zx6 = new C0Zx();
                c0Zx6.A06("more_info_type", (String) c11520jB8.A01(C5I8.A5s));
                c0Zx6.A05("more_info_placement", (Long) c11520jB8.A01(C5I8.A5r));
            } else {
                c0Zx6 = null;
            }
            A00.AAQ(c0Zx6, "feed_cta_metadata");
            A00.A7v("is_dwell_tap_to_iab_enabled", (Boolean) A01.A01(C5I8.A4F));
            A00.AAP("destination_type", (String) A01.A01(C5I8.A29));
            A00.A7v("is_page_start", (Boolean) A01.A01(C5I8.A4a));
            A00.A7v("is_page_end", (Boolean) A01.A01(C5I8.A4Z));
            A00.A9K("view_state_item_type_before", ((Number) A01.A01(C5I8.A9q)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.A9K("view_state_item_type_after", ((Number) A01.A01(C5I8.A9p)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.A7v("is_delayed_skip_ad", (Boolean) A01.A01(C5I8.A24));
            A00.A7v("is_rendered_as_delayed_skip_ad", (Boolean) A01.A01(C5I8.A4k));
            A00.A7v("is_reels_sync_flow_enabled", (Boolean) A01.A01(C5I8.A4t));
            A00.AAP("delivery_context", (String) A01.A01(C5I8.A26));
            A00.A7v("is_self_pog_chaining", (Boolean) A01.A01(C5I8.A4p));
            AbstractCollection abstractCollection5 = (AbstractCollection) A01.A01(C5I8.A0f);
            if (abstractCollection5 != null) {
                arrayList4 = new ArrayList(AbstractC06950Ym.A1E(abstractCollection5, 10));
                Iterator it5 = abstractCollection5.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(Long.valueOf(((Number) it5.next()).intValue()));
                }
            } else {
                arrayList4 = null;
            }
            A00.AAk("brs_content_blocklist_before", arrayList4);
            AbstractCollection abstractCollection6 = (AbstractCollection) A01.A01(C5I8.A0d);
            if (abstractCollection6 != null) {
                arrayList5 = new ArrayList(AbstractC06950Ym.A1E(abstractCollection6, 10));
                Iterator it6 = abstractCollection6.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(Long.valueOf(((Number) it6.next()).intValue()));
                }
            } else {
                arrayList5 = null;
            }
            A00.AAk("brs_content_blocklist_after", arrayList5);
            AbstractCollection abstractCollection7 = (AbstractCollection) A01.A01(C5I8.A07);
            if (abstractCollection7 != null) {
                arrayList6 = new ArrayList(AbstractC06950Ym.A1E(abstractCollection7, 10));
                Iterator it7 = abstractCollection7.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(Long.valueOf(((Number) it7.next()).intValue()));
                }
            } else {
                arrayList6 = null;
            }
            A00.AAk("ad_content_blocklist", arrayList6);
            A00.A9K("brs_content_blocklist_before_length", ((Number) A01.A01(C5I8.A0g)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.A9K("brs_content_blocklist_after_length", ((Number) A01.A01(C5I8.A0e)) != null ? Long.valueOf(r0.intValue()) : null);
            A00.A7v("is_afi_click_feed_ini_eligible", (Boolean) A01.A01(C5I8.A3w));
            A00.A7v("is_afi_dwell_feed_ini_eligible", (Boolean) A01.A01(C5I8.A3x));
            A00.A7v("is_eager_refresh", (Boolean) A01.A01(C5I8.A4G));
            A00.A8I("client_timestamp_delta_since_last_item_sec", (Double) A01.A01(C5I8.A1J));
            A00.A9K("messaged_by_count", ((Number) A01.A01(C5I8.A5h)) != null ? Long.valueOf(r0.intValue()) : null);
            if (l != null) {
                A00.A9K("host_profile_id", l);
            }
            if (l2 != null) {
                A00.A9K("host_profile_id_delivered_to", l2);
            }
            if (AbstractC61652rS.A02(userSession)) {
                A00.AAP("basic_ads_graphql_tier", AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString());
                A00.AAP("basic_ads_launcher_tier", AbstractC61652rS.A00(userSession).toString());
            }
            C11500j9 c11500j93 = C5I8.A1Y;
            if (A01.A01(c11500j93) != null) {
                A00.AAk("consider_and_browse_options", (List) A01.A01(c11500j93));
            }
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
        }
    }
}
