package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.XOr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72120XOr {
    public static final void A00(C18920wW c18920wW, UserSession userSession, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        C0Zx c0Zx;
        ArrayList arrayList;
        Long l;
        C0Zx c0Zx2;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        C0Zx c0Zx3;
        Double d;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_sub_impression");
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72046XLm.A0r(A0f, C5I8.A5c, A01);
            AbstractC72046XLm.A17(A0f, A01);
            ArrayList arrayList3 = (ArrayList) A01.A01(C5I8.A2r);
            A0f.AAP("feed_sticker_media_id", arrayList3 != null ? (String) AbstractC001800i.A0O(arrayList3, 0) : null);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72046XLm.A0t(A0f, C5I8.A0C, A01);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "action", AbstractC37300Gc1.A0R(C5I8.A00, A01));
            AbstractC72047XLn.A0S(A0f, A01);
            A0f.A9K("reel_gap", AbstractC72046XLm.A0Y(C5I8.A7S, A01));
            A0f.A9K("gap_to_last_ad", AbstractC72046XLm.A0Y(C5I8.A34, A01));
            AbstractC72048XLo.A0b(A0f, A01);
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A14, A01), "carousel_opt_in_position");
            AbstractC72048XLo.A0o(A0f, A01);
            AbstractC72047XLn.A0w(A0f, A01);
            AbstractC72047XLn.A1J(A0f, A01);
            A0f.AAP("host_media_pk", AbstractC37300Gc1.A0R(C5I8.A3Y, A01));
            AbstractC72047XLn.A0y(A0f, A01);
            A0f.AAP("media_layout_encoded_string", AbstractC37300Gc1.A0R(C5I8.A5Q, A01));
            A0f.A7v("mop_should_double_logging", AbstractC72046XLm.A0S(C5I8.A5p, A01));
            A0f.A7v("mop_should_rollout", AbstractC72046XLm.A0S(C5I8.A5q, A01));
            A0f.A7v("is_zoomed_out", AbstractC72046XLm.A0S(C5I8.A52, A01));
            AbstractC72046XLm.A16(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72047XLn.A1E(A0f, A01);
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A0s(A0f, A01);
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A0y(A0f, A01);
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            AbstractC72047XLn.A14(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            A0f.A9K("position", AbstractC72046XLm.A0Y(C5I8.A6Y, A01));
            AbstractC72047XLn.A1K(A0f, A01);
            AbstractC72047XLn.A1F(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72048XLo.A0t(A0f, A01);
            AbstractC72047XLn.A0v(A0f, A01);
            A0f.A8I("media_dwell_time", AbstractC72046XLm.A0U(C5I8.A5H, A01));
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A0f(A0f, A01);
            AbstractC72048XLo.A0h(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            A0f.A8I("media_time_elapsed", AbstractC72046XLm.A0U(C5I8.A5a, A01));
            AbstractC72048XLo.A0z(A0f, A01, AbstractC72046XLm.A0U(C5I8.A5V, A01), "media_time_paused");
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72047XLn.A0K(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            A0f.A7v("is_highlights_sourced", AbstractC72046XLm.A0S(C5I8.A4L, A01));
            AbstractC72047XLn.A0i(A0f, A01);
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A1t);
            if (c11520jB == null) {
                c0Zx = null;
            } else {
                c0Zx = new C0Zx();
                Number A0Z = AbstractC72046XLm.A0Z(C5I8.A1q, c11520jB);
                c0Zx.A04(IgReactMediaPickerNativeModule.HEIGHT, Double.valueOf(A0Z != null ? A0Z.doubleValue() : -1.0d));
                Number A0Z2 = AbstractC72046XLm.A0Z(C5I8.A1v, c11520jB);
                c0Zx.A04(IgReactMediaPickerNativeModule.WIDTH, Double.valueOf(A0Z2 != null ? A0Z2.doubleValue() : -1.0d));
            }
            A0f.AAQ(c0Zx, "cta_sticker_size_info_in_dp_pt");
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0d);
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C14360o3.A0B(str, 0);
                    A0i.add(AbstractC003100w.A0k(10, str));
                }
                arrayList = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0i));
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            A0f.A9K("product_id", AbstractC72046XLm.A0Y(C5I8.A6m, A01));
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5g, A01);
            if (A0R != null) {
                l = C4SX.A00(A0R).A00;
            } else {
                l = null;
            }
            A0f.A9K("merchant_id", l);
            AbstractC72047XLn.A0M(A0f, A01);
            A0f.A7v("post_impression_column_override", AbstractC72046XLm.A0S(C5I8.A6Q, A01));
            AbstractC72047XLn.A1H(A0f, A01);
            A0f.A7v("is_second_channel_enabled", AbstractC72046XLm.A0S(C5I8.A4n, A01));
            AbstractC72047XLn.A12(A0f, A01);
            A0f.A9M("two_measurement_debugging_fields", (Map) A01.A01(C5I8.A9Y));
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0B(C5I8.A3c, A01));
            AbstractC72048XLo.A11(A0f, A01, AbstractC72047XLn.A0B(C5I8.A2v, A01));
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0B(C5I8.A5v, A01));
            A0f.AAP("intent_aware_ads_trigger_type", AbstractC37300Gc1.A0R(C5I8.A3q, A01));
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72046XLm.A0s(A0f, C5I8.A0Z, A01);
            C11500j9 c11500j9 = C5I8.A93;
            AbstractC72048XLo.A0V(A0f, c11500j9, A01);
            AbstractC72047XLn.A0n(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72047XLn.A1I(A0f, A01);
            A0f.A9K("ad_request_position", AbstractC72046XLm.A0Y(C5I8.A0L, A01));
            A0f.A9K("reel_viewer_entry_position", AbstractC72046XLm.A0Y(C5I8.A7c, A01));
            A0f.A9K("ad_received_position", AbstractC72046XLm.A0Y(C5I8.A0J, A01));
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C19260xA A00 = A07.A00();
                c0Zx2 = new C0Zx();
                AbstractC72047XLn.A1a(c0Zx2, A07);
                c0Zx2.A04("media_height", AbstractC72046XLm.A0U(C5I8.A5J, A07));
                c0Zx2.A04("media_width", AbstractC72046XLm.A0U(C5I8.A5e, A07));
                String A05 = A00.A05("caption_font_size");
                if (A05 != null) {
                    d = AbstractC72046XLm.A0W(A05);
                } else {
                    d = null;
                }
                c0Zx2.A04("caption_font_size", d);
                c0Zx2.A04("caption_position_start_x", AbstractC72047XLn.A08(A00, "caption_position_start_x"));
                c0Zx2.A04("caption_position_start_y", AbstractC72047XLn.A08(A00, "caption_position_start_y"));
                c0Zx2.A04("caption_line_height", AbstractC72047XLn.A08(A00, "caption_line_height"));
                c0Zx2.A04("caption_height", AbstractC72047XLn.A08(A00, "caption_line_height"));
                c0Zx2.A04("caption_width", AbstractC72047XLn.A08(A00, "caption_width"));
                AbstractC72048XLo.A16(c0Zx2, A00, AbstractC72047XLn.A07(A00, "is_caption_fully_displayed"));
                AbstractC72047XLn.A1Z(c0Zx2, A00, "background_color_top");
                c0Zx2.A05("caption_num_char_showed", AbstractC72047XLn.A0A(A00, "caption_num_char_showed"));
                c0Zx2.A05("caption_num_hashtags_showed", AbstractC72047XLn.A0A(A00, "caption_num_hashtags_showed"));
                c0Zx2.A05("caption_num_lines_showed", AbstractC72047XLn.A0A(A00, "caption_num_lines_showed"));
                c0Zx2.A05("caption_num_lines_total", AbstractC72047XLn.A0A(A00, "caption_num_lines_total"));
                String A052 = A00.A05("caption_num_mentions_showed");
                c0Zx2.A05("caption_num_mentions_showed", A052 != null ? AbstractC25228BEl.A13(A052) : null);
                AbstractC72046XLm.A1L(c0Zx2, A00, "caption_text_color");
                AbstractC72046XLm.A1N(c0Zx2, A07);
                AbstractC72046XLm.A1L(c0Zx2, A00, "headline_text_showed");
                AbstractC72048XLo.A17(c0Zx2, A07);
            } else {
                c0Zx2 = null;
            }
            A0f.AAQ(c0Zx2, "media_layout");
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72047XLn.A0T(A0f, A01);
            A0f.A9K("reel_gap_to_last_ad", AbstractC72046XLm.A0Y(C5I8.A7U, A01));
            Long A0Y = AbstractC72046XLm.A0Y(C5I8.A7V, A01);
            if (A0Y == null) {
                A0Y = null;
            }
            A0f.A9K("reel_gap_to_last_netego", A0Y);
            A0f.A9K("ad_consumed_media_gap", AbstractC72046XLm.A0Y(C5I8.A06, A01));
            A0f.A9K("netego_consumed_media_gap", AbstractC72046XLm.A0Y(C5I8.A63, A01));
            A0f.A9K("min_consumed_media_gap_to_previous_ad", AbstractC72046XLm.A0Y(C5I8.A5l, A01));
            A0f.A9K("min_consumed_media_gap_to_previous_netego", AbstractC72046XLm.A0Y(C5I8.A5m, A01));
            A0f.A9K("min_consumed_reel_gap_to_previous_ad", AbstractC72046XLm.A0Y(C5I8.A5j, A01));
            A0f.A9K("min_consumed_reel_gap_to_previous_netego", AbstractC72046XLm.A0Y(C5I8.A5k, A01));
            A0f.A9K("priority_index", AbstractC72046XLm.A0Y(C5I8.A6i, A01));
            A0f.A9K("highest_position_rule", AbstractC72046XLm.A0Y(C5I8.A3V, A01));
            A0f.A9K("max_reel_gap_to_previous_item", AbstractC72046XLm.A0Y(C5I8.A5D, A01));
            A0f.A9K("min_media_gap_to_previous_item", AbstractC72046XLm.A0Y(C5I8.A5n, A01));
            A0f.A8I("time_gap_to_previous_item_in_sec", AbstractC72046XLm.A0U(C5I8.A97, A01));
            AbstractC72047XLn.A0Z(A0f, A01);
            A0f.A9K("consumed_media_gap", AbstractC72046XLm.A0Y(C5I8.A1Z, A01));
            AbstractC72047XLn.A1P(A0f, A01);
            A0f.A9K("consumed_media_gap_highest_position", AbstractC72046XLm.A0Y(C5I8.A1a, A01));
            A0f.A9K("reel_gap_highest_position", AbstractC72046XLm.A0Y(C5I8.A7T, A01));
            A0f.A9K("imp_logger_ver", AbstractC72046XLm.A0Y(C5I8.A53, A01));
            A0f.AAP("previous_media_pk", AbstractC37300Gc1.A0R(C5I8.A6c, A01));
            A0f.AAP("next_media_pk", AbstractC37300Gc1.A0R(C5I8.A68, A01));
            A0f.AAP("is_app_backgrounded", AbstractC37300Gc1.A0R(C5I8.A3y, A01));
            A0f.AAP("last_navigation_module", AbstractC37300Gc1.A0R(C5I8.A58, A01));
            A0f.A9K("nav_in_transit", AbstractC72047XLn.A0B(C5I8.A61, A01));
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72047XLn.A17(A0f, A01);
            A0f.AAP("current_module", interfaceC60442pS.getModuleName());
            Long A0Y2 = AbstractC72046XLm.A0Y(C5I8.A35, A01);
            if (A0Y2 == null) {
                A0Y2 = null;
            }
            A0f.A9K("gap_to_last_netego", A0Y2);
            AbstractC72046XLm.A18(A0f, A01);
            AbstractC72047XLn.A0e(A0f, A01);
            A0f.AAP("async_ad_source", AbstractC37300Gc1.A0R(C5I8.A0V, A01));
            AbstractC72047XLn.A0u(A0f, A01);
            A0f.A7v("impression_logger_validate", AbstractC72046XLm.A0S(C5I8.A3j, A01));
            AbstractC72047XLn.A1U(A0f, A01, "parent_m_pk", AbstractC37300Gc1.A0R(C5I8.A6U, A01));
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72046XLm.A0v(A0f, C5I8.A12, A01);
            A0f.A7v("is_holdout", AbstractC72046XLm.A0S(C5I8.A4M, A01));
            AbstractC72047XLn.A0o(A0f, A01);
            A0f.AAk("sticker_types", null);
            A0f.AAk("sponsor_tag_ids", (List) AbstractC72047XLn.A06(A0f, A01));
            AbstractC72048XLo.A0k(A0f, A01);
            AbstractC72048XLo.A0v(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0c);
                Iterator it2 = A0c.iterator();
                while (it2.hasNext()) {
                    A0i2.add(AnonymousClass010.A0m((String) it2.next()));
                }
                arrayList2 = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0i2));
            } else {
                arrayList2 = null;
            }
            A0f.AAk("video_to_carousel_cut_secs", arrayList2);
            AbstractC72046XLm.A0w(A0f, C5I8.A13, A01);
            A0f.AAk("carousel_transformation_cards", (List) A01.A01(C5I8.A17));
            A0f.A9K("carousel_transformation_type", null);
            A0f.AAP("impression_type", AbstractC37300Gc1.A0R(C5I8.A3k, A01));
            A0f.AAQ(null, "toolbar_layout");
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            A0f.AAP("byline_text", AbstractC37300Gc1.A0R(C5I8.A0l, A01));
            A0f.A7v("is_pride_media", AbstractC72046XLm.A0S(C5I8.A4e, A01));
            A0f.A7v("is_besties_media", AbstractC72046XLm.A0S(C5I8.A40, A01));
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A15(A0f, A01);
            A0f.AAk("tagged_user_ids", (List) A01.A01(C5I8.A8p));
            A0f.A7v("is_image_loaded", AbstractC72046XLm.A0S(C5I8.A4O, A01));
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A0J(A0f, A01);
            AbstractC72047XLn.A19(A0f, A01);
            A0f.AAP("disclaimer_text", AbstractC37300Gc1.A0R(C5I8.A2D, A01));
            A0f.AAP("disclaimer_title", AbstractC37300Gc1.A0R(C5I8.A2E, A01));
            AbstractC72046XLm.A1I(A0f, A01);
            A0f.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72047XLn.A0B(C5I8.A9Z, A01));
            A0f.AAP("channel_pk", AbstractC37300Gc1.A0R(C5I8.A1E, A01));
            AbstractC72047XLn.A0V(A0f, A01);
            A0f.A9K("ad_delivery_position", AbstractC72046XLm.A0Y(C5I8.A0A, A01));
            A0f.A7v("is_first_ad_in_the_session", AbstractC72046XLm.A0S(C5I8.A4I, A01));
            AbstractC72046XLm.A1H(A0f, A01);
            A0f.AAP("cache_key", AbstractC37300Gc1.A0R(C5I8.A0m, A01));
            A0f.AAP("call_stack", AbstractC37300Gc1.A0R(C5I8.A0n, A01));
            A0f.A8I("time_interval_since_reference_date", AbstractC72046XLm.A0U(C5I8.A98, A01));
            A0f.A8I("time_stamp", AbstractC72046XLm.A0Z(c11500j9, A01) != null ? Double.valueOf(r0.longValue()) : null);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0B(C5I8.A5C, A01));
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                LinkedHashMap A0G = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry entry = (Map.Entry) A14.next();
                    A0G.put(entry.getKey(), AbstractC001800i.A0U((Collection) entry.getValue()));
                }
                linkedHashMap = AbstractC06930Yk.A03(A0G);
            } else {
                linkedHashMap = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap);
            AbstractC72046XLm.A12(A0f, A01);
            A0f.AAP("next_inventory_source", AbstractC37300Gc1.A0R(C5I8.A69, A01));
            A0f.AAP("prev_inventory_source", AbstractC37300Gc1.A0R(C5I8.A6d, A01));
            AbstractC72047XLn.A0O(A0f, A01);
            A0f.AAP("sponsored_label_text", AbstractC37300Gc1.A0R(C5I8.A8J, A01));
            C11520jB c11520jB2 = (C11520jB) A01.A01(C5I8.A77);
            if (c11520jB2 == null) {
                c0Zx3 = null;
            } else {
                c0Zx3 = new C0Zx();
                c0Zx3.A06("body", AbstractC37300Gc1.A0R(C5I8.A78, c11520jB2));
                c0Zx3.A03("has_image", AbstractC72046XLm.A0S(C5I8.A7C, c11520jB2));
                c0Zx3.A06("style", AbstractC37300Gc1.A0R(C5I8.A7I, c11520jB2));
                AbstractC72048XLo.A19(c0Zx3, c11520jB2, c11520jB2.A01(C5I8.A7K));
            }
            A0f.AAQ(c0Zx3, "reels_mid_scene_info");
            A0f.A7v("is_merlin_double_logging_enabled", AbstractC72046XLm.A0S(C5I8.A4V, A01));
            A0f.A7v("is_demo", AbstractC72046XLm.A0S(C5I8.A4D, A01));
            A0f.AAP("delivery_context", AbstractC37300Gc1.A0R(C5I8.A26, A01));
            A0f.A7v("is_reels_sync_flow_enabled", AbstractC72046XLm.A0S(C5I8.A4t, A01));
            A0f.A9K("brs_threshold", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A0i, A01)));
            A0f.AAP("organic_media_id_before", AbstractC37300Gc1.A0R(C5I8.A6P, A01));
            A0f.A9K("organic_brs_severity_before", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A6L, A01)));
            A0f.AAP("organic_media_id_after", AbstractC37300Gc1.A0R(C5I8.A6O, A01));
            A0f.A9K("organic_brs_severity_after", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A6K, A01)));
            A0f.A9K("view_state_item_type_before", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A9q, A01)));
            Number A0Z3 = AbstractC72046XLm.A0Z(C5I8.A9p, A01);
            A0f.A9K("view_state_item_type_after", A0Z3 != null ? AbstractC25229BEm.A0n(A0Z3) : null);
            AbstractC72047XLn.A0I(A0f, A01);
            if (AbstractC61652rS.A02(userSession)) {
                A0f.AAP("basic_ads_graphql_tier", AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString());
                A0f.AAP("basic_ads_launcher_tier", AbstractC61652rS.A00(userSession).toString());
            }
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
