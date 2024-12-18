package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xie, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72626Xie {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        String str;
        C0Zx c0Zx;
        String str2;
        ArrayList arrayList;
        Long l;
        List list;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        C0Zx c0Zx2;
        C0Zx c0Zx3;
        C0Zx c0Zx4;
        C0Zx c0Zx5;
        String A05;
        String A052;
        Double d;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_action");
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            A0f.AAP("a_i", AbstractC37300Gc1.A0R(C5I8.A9S, A01));
            C11500j9 c11500j9 = C5I8.A0Z;
            AbstractC72046XLm.A0s(A0f, c11500j9, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            C11500j9 c11500j92 = C5I8.A0C;
            AbstractC72046XLm.A0t(A0f, c11500j92, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            A0f.AAP("ad_intent", AbstractC37300Gc1.A0R(C5I8.A0E, A01));
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72047XLn.A17(A0f, A01);
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            C11500j9 c11500j93 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j93, A01);
            AbstractC72046XLm.A0y(A0f, A01);
            Serializable A012 = A01.A01(c11500j93);
            Long l2 = null;
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = null;
            }
            AbstractC72047XLn.A1U(A0f, A01, "carousel_media_type", str);
            AbstractC72047XLn.A0z(A0f, A01);
            A0f.A8I("end_x_position", AbstractC72048XLo.A0E(C5I8.A2T, A01));
            A0f.A8I("end_y_position", AbstractC72048XLo.A0E(C5I8.A2U, A01));
            AbstractC72047XLn.A0U(A0f, A01);
            A0f.AAP("from", AbstractC37300Gc1.A0R(C5I8.A30, A01));
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "is_programmatic_scroll", AbstractC37300Gc1.A0R(C5I8.A4h, A01));
            C11500j9 c11500j94 = C5I8.A5K;
            AbstractC37300Gc1.A0l(A0f, AbstractC37300Gc1.A0R(c11500j94, A01));
            C11500j9 c11500j95 = C5I8.A5c;
            AbstractC72048XLo.A0X(A0f, c11500j95, A01);
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C14360o3.A0A(c19260xA);
                c0Zx = new C0Zx();
                AbstractC72048XLo.A17(c0Zx, A07);
                AbstractC72047XLn.A1a(c0Zx, A07);
                AbstractC72046XLm.A1N(c0Zx, A07);
                C11500j9 c11500j96 = C5I8.A5e;
                c0Zx.A04("media_width", AbstractC72046XLm.A0U(c11500j96, A07));
                c0Zx.A04("media_height", AbstractC72046XLm.A0U(c11500j96, A07));
                AbstractC72047XLn.A1Y(c0Zx, c19260xA);
                String A053 = c19260xA.A05("caption_font_size");
                Boolean bool = null;
                if (A053 != null) {
                    d = AbstractC72046XLm.A0W(A053);
                } else {
                    d = null;
                }
                c0Zx.A04("caption_font_size", d);
                c0Zx.A05("caption_num_char_showed", AbstractC72047XLn.A0A(c19260xA, "caption_num_char_showed"));
                c0Zx.A05("caption_num_hashtags_showed", AbstractC72047XLn.A0A(c19260xA, "caption_num_hashtags_showed"));
                c0Zx.A05("caption_num_lines_showed", AbstractC72047XLn.A0A(c19260xA, "caption_num_lines_showed"));
                c0Zx.A05("caption_num_lines_total", AbstractC72047XLn.A0A(c19260xA, "caption_num_lines_total"));
                c0Zx.A05("caption_num_mentions_showed", AbstractC72047XLn.A0A(c19260xA, "caption_num_mentions_showed"));
                c0Zx.A04("caption_position_start_x", AbstractC72047XLn.A08(c19260xA, "caption_position_start_x"));
                c0Zx.A04("caption_position_start_y", AbstractC72047XLn.A08(c19260xA, "caption_position_start_y"));
                c0Zx.A04("caption_line_height", AbstractC72047XLn.A08(c19260xA, "caption_line_height"));
                c0Zx.A04("caption_height", AbstractC72047XLn.A08(c19260xA, "caption_line_height"));
                c0Zx.A04("caption_width", AbstractC72047XLn.A08(c19260xA, "caption_width"));
                String A054 = c19260xA.A05("is_caption_fully_displayed");
                if (A054 != null) {
                    bool = Boolean.valueOf(Boolean.parseBoolean(A054));
                }
                c0Zx.A03("is_caption_fully_displayed", bool);
                AbstractC72046XLm.A1L(c0Zx, c19260xA, "caption_text_color");
                AbstractC72047XLn.A1Z(c0Zx, c19260xA, "background_color_caption");
                AbstractC72046XLm.A1L(c0Zx, c19260xA, "headline_text_showed");
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "media_layout");
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72047XLn.A12(A0f, A01);
            AbstractC72048XLo.A0m(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            A0f.A8I("start_x_position", AbstractC72048XLo.A0E(C5I8.A8R, A01));
            A0f.A8I("start_y_position", AbstractC72048XLo.A0E(C5I8.A8S, A01));
            AbstractC72047XLn.A0i(A0f, A01);
            A0f.AAP(AbstractC111324zv.A00(1339), AbstractC37300Gc1.A0R(C5I8.A1Q, A01));
            A0f.AAP("top_followers_count", AbstractC72046XLm.A0a(C5I8.A9N, A01));
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72047XLn.A0L(A0f, A01);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            A0f.AAP("tray_session_id", AbstractC37300Gc1.A0R(C5I8.A7a, A01));
            A0f.AAP("url", AbstractC37300Gc1.A0R(C5I8.A9g, A01));
            AbstractC72046XLm.A14(A0f, A01);
            A0f.A8I("x_velocity", AbstractC72048XLo.A0E(C5I8.AA0, A01));
            A0f.A8I("y_velocity", AbstractC72048XLo.A0E(C5I8.AA1, A01));
            AbstractC72046XLm.A17(A0f, A01);
            ArrayList arrayList4 = (ArrayList) A01.A01(C5I8.A2r);
            if (arrayList4 != null) {
                str2 = (String) AbstractC001800i.A0O(arrayList4, 0);
            } else {
                str2 = null;
            }
            A0f.AAP("feed_sticker_media_id", str2);
            AbstractC72047XLn.A0w(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC37300Gc1.A0h(A0f, AbstractC72047XLn.A0C(c11500j94, A01));
            AbstractC72047XLn.A1E(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A1Q(A0f, A01);
            A0f.AAQ(null, "location_info");
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    Long A0j = AbstractC25231BEo.A0j(0, AbstractC166987dD.A1B(it));
                    if (A0j != null) {
                        A1E.add(A0j);
                    }
                }
                arrayList = AbstractC001800i.A0U(A1E);
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            A0f.AAk("drop_product_ids", null);
            A0f.AAk("mentioned_product_ids", null);
            ArrayList A06 = c19260xA.A06("shared_product_ids");
            if (A06 == null) {
                A06 = null;
            }
            A0f.AAk("shared_product_ids", A06);
            C11500j9 c11500j97 = C5I8.A6m;
            A0f.A9K("product_id", AbstractC72046XLm.A0Y(c11500j97, A01));
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5g, A01);
            if (A0R != null) {
                l = AbstractC25228BEl.A13(A0R);
            } else {
                l = null;
            }
            A0f.A9K("merchant_id", l);
            AbstractC72047XLn.A0M(A0f, A01);
            A0f.A7v("can_add_to_bag", c19260xA.A01("can_add_to_bag"));
            AbstractC72047XLn.A1S(A0f, A01, C05F.A0j);
            A0f.AAk(AbstractC111324zv.A00(1109), null);
            A0f.AAP("shopping_session_id", AbstractC37300Gc1.A0R(C5I8.A86, A01));
            if (A01.A01(C5I8.A0k) != null && (A052 = c19260xA.A05("incentive_id")) != null) {
                C0Zx c0Zx6 = new C0Zx();
                c0Zx6.A06("display_type", "visible");
                c0Zx6.A05("discount_id", AbstractC25228BEl.A13(A052));
                list = AbstractC166987dD.A1J(c0Zx6);
            } else {
                list = C16930sl.A00;
            }
            A0f.AAk(AbstractC111324zv.A00(2931), list);
            A0f.AAP("prior_module", AbstractC37300Gc1.A0R(C5I8.A6j, A01));
            A0f.AAP("current_price", null);
            AbstractC72047XLn.A1F(A0f, A01);
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            A0f.AAP("topic_cluster_type", AbstractC37300Gc1.A0R(C5I8.A9M, A01));
            A0f.AAP("topic_cluster_id", AbstractC37300Gc1.A0R(C5I8.A9J, A01));
            A0f.AAP("topic_cluster_title", AbstractC37300Gc1.A0R(C5I8.A9L, A01));
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A0f(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72048XLo.A0t(A0f, A01);
            AbstractC72046XLm.A10(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0C(C5I8.A2c, A01));
            AbstractC72047XLn.A13(A0f, A01);
            AbstractC72048XLo.A0r(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72048XLo.A0l(A0f, A01);
            AbstractC72047XLn.A0s(A0f, A01);
            AbstractC72047XLn.A1J(A0f, A01);
            A0f.AAP("host_media_pk", AbstractC37300Gc1.A0R(C5I8.A3Y, A01));
            A0f.A9K("placement_page_type", null);
            A0f.A7v(AbstractC111324zv.A00(1055), AbstractC72046XLm.A0S(C5I8.A4X, A01));
            AbstractC72046XLm.A0u(A0f, c11500j95, A01);
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A09, A01);
            if (A0R2 == null) {
                A0R2 = AbstractC72046XLm.A0a(C5I8.A08, A01);
            }
            A0f.AAP("cta_state", A0R2);
            A0f.A9K("media_index", AbstractC72046XLm.A0Y(C5I8.A5N, A01));
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72048XLo.A0i(A0f, A01);
            A0f.A7v("is_cta_delay_enabled", null);
            A0f.A8I("cta_min_delay_time", null);
            A0f.A7v("is_cta_default_color_enabled", null);
            A0f.A7v("is_cta_scroll_aware_enabled", null);
            AbstractC72047XLn.A0e(A0f, A01);
            A0f.AAk("header_layout", null);
            AbstractC72047XLn.A0u(A0f, A01);
            A0f.A9K("unseen_reel_size", null);
            AbstractC72047XLn.A1N(A0f, A01);
            A0f.A8I("device_height", AbstractC72046XLm.A0U(C5I8.A2A, A01));
            A0f.A8I("device_width", AbstractC72046XLm.A0U(C5I8.A2B, A01));
            A0f.A8I("screen_density", AbstractC72046XLm.A0U(C5I8.A7o, A01));
            A0f.A9K("screen_height", AbstractC72047XLn.A0D(C5I8.A7p, A01));
            A0f.A9K("screen_width", AbstractC72047XLn.A0D(C5I8.A7q, A01));
            AbstractC72047XLn.A0P(A0f, A01);
            AbstractC72047XLn.A1A(A0f, A01);
            AbstractC72048XLo.A0u(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0c);
                Iterator it2 = A0c.iterator();
                while (it2.hasNext()) {
                    A0i.add(AnonymousClass010.A0m(AbstractC166987dD.A1B(it2)));
                }
                arrayList2 = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0i));
            } else {
                arrayList2 = null;
            }
            A0f.AAk("video_to_carousel_cut_secs", arrayList2);
            A0f.AAP("cta_style_when_clicked", null);
            AbstractC72048XLo.A0d(A0f, A01);
            A0f.AAQ(null, "toolbar_layout");
            A0f.AAk("sponsor_tag_ids", (List) AbstractC72047XLn.A06(A0f, A01));
            A0f.AAk("carousel_transformation_cards", (List) A01.A01(C5I8.A17));
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                LinkedHashMap A0G = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    A0G.put(A1K.getKey(), AbstractC001800i.A0U((Collection) A1K.getValue()));
                }
                linkedHashMap = AbstractC06930Yk.A03(A0G);
            } else {
                linkedHashMap = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap);
            A0f.A9K("carousel_transformation_type", null);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                linkedHashMap2 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0e));
                Iterator it3 = A0e.iterator();
                while (it3.hasNext()) {
                    AbstractC72048XLo.A1X(it3, linkedHashMap2);
                }
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap2);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            A0f.A7v(AbstractC111324zv.A00(226), null);
            AbstractC72046XLm.A12(A0f, A01);
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(C5I8.A8T, A01);
            if (A0c2 != null) {
                arrayList3 = AbstractC166987dD.A1E();
                Iterator it4 = A0c2.iterator();
                while (it4.hasNext()) {
                    it4.next();
                    String A055 = c19260xA.A05("sticker_id");
                    if (A055 != null && (A05 = c19260xA.A05("sticker_type")) != null) {
                        C0Zx c0Zx7 = new C0Zx();
                        c0Zx7.A06("sticker_id", A055);
                        c0Zx7.A06("sticker_type", A05);
                        arrayList3.add(c0Zx7);
                    }
                }
            } else {
                arrayList3 = null;
            }
            A0f.AAk("sticker_types", arrayList3);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72047XLn.A19(A0f, A01);
            A0f.AAP("log_auditor_session", null);
            A0f.A9K("seed_ad_id", AbstractC72047XLn.A0B(C5I8.A7w, A01));
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0B(C5I8.A3c, A01));
            A0f.A9K(AbstractC111324zv.A00(2456), AbstractC72047XLn.A0B(C5I8.A3e, A01));
            A0f.A9K(AbstractC111324zv.A00(2455), AbstractC72047XLn.A0B(C5I8.A3d, A01));
            AbstractC72048XLo.A11(A0f, A01, AbstractC72047XLn.A0B(C5I8.A2v, A01));
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0B(C5I8.A5v, A01));
            A0f.AAP("intent_aware_ads_trigger_type", AbstractC37300Gc1.A0R(C5I8.A3q, A01));
            AbstractC72047XLn.A0x(A0f, A01);
            A0f.A9K("a_pk_long", AbstractC72046XLm.A0Y(c11500j9, A01));
            A0f.A9K("ad_id_long", AbstractC72046XLm.A0Y(c11500j92, A01));
            A0f.AAk("c_pk_list", null);
            AbstractC72048XLo.A0n(A0f, A01);
            A0f.A9K("author_id", AbstractC72046XLm.A0Y(c11500j9, A01));
            A0f.A9K("product_id_long", AbstractC72046XLm.A0Y(c11500j97, A01));
            AbstractC72047XLn.A18(A0f, A01);
            AbstractC72046XLm.A0x(A0f, A01);
            A0f.A9M("client_ad_creative_optimization_output", null);
            AbstractC72048XLo.A0y(A0f, A01);
            A0f.AAP("container_module", interfaceC60442pS.getModuleName());
            A0f.AAP("contextual_ads_category", AbstractC37300Gc1.A0R(C5I8.A1c, A01));
            A0f.AAP("opt_in_state", null);
            AbstractC72047XLn.A0r(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72046XLm.A1G(A0f, A01);
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A77);
            if (c11520jB == null) {
                c0Zx2 = null;
            } else {
                c0Zx2 = new C0Zx();
                c0Zx2.A06("body", AbstractC37300Gc1.A0R(C5I8.A78, c11520jB));
                c0Zx2.A03("has_image", AbstractC72046XLm.A0S(C5I8.A7C, c11520jB));
                c0Zx2.A06("style", AbstractC37300Gc1.A0R(C5I8.A7I, c11520jB));
                AbstractC72048XLo.A19(c0Zx2, c11520jB, c11520jB.A01(C5I8.A7K));
                c0Zx2.A06("source_of_tapping", AbstractC37300Gc1.A0R(C5I8.A7H, c11520jB));
            }
            A0f.AAQ(c0Zx2, "reels_mid_scene_info");
            C11520jB c11520jB2 = (C11520jB) A01.A01(C5I8.A70);
            if (c11520jB2 == null) {
                c0Zx3 = null;
            } else {
                c0Zx3 = new C0Zx();
                c0Zx3.A06(AbstractC111324zv.A00(2215), AbstractC37300Gc1.A0R(C5I8.A6z, c11520jB2));
                c0Zx3.A06(AbstractC111324zv.A00(2216), AbstractC37300Gc1.A0R(C5I8.A71, c11520jB2));
                c0Zx3.A06(AbstractC111324zv.A00(2217), AbstractC37300Gc1.A0R(C5I8.A72, c11520jB2));
                c0Zx3.A05(AbstractC111324zv.A00(2218), AbstractC72046XLm.A0Y(C5I8.A73, c11520jB2));
            }
            A0f.AAQ(c0Zx3, AbstractC111324zv.A00(2993));
            A0f.AAP("cta_action", null);
            A0f.AAQ(null, "carousel_transformation_generic_card_info");
            A0f.A9K("host_profile_id", AbstractC72046XLm.A0Y(C5I8.A3Z, A01));
            AbstractC72047XLn.A14(A0f, A01);
            C11520jB c11520jB3 = (C11520jB) A01.A01(C5I8.A1O);
            if (c11520jB3 == null) {
                c0Zx4 = null;
            } else {
                c0Zx4 = new C0Zx();
                c0Zx4.A05("thumbnail_click_index", AbstractC72046XLm.A0Y(C5I8.A1K, c11520jB3));
                c0Zx4.A05("collection_product_id", AbstractC72046XLm.A0Y(C5I8.A1P, c11520jB3));
            }
            A0f.AAQ(c0Zx4, "product_extension_collection_info");
            C11520jB c11520jB4 = (C11520jB) A01.A01(C5I8.A21);
            Long l3 = null;
            if (c11520jB4 == null) {
                c0Zx5 = null;
            } else {
                c0Zx5 = new C0Zx();
                AbstractC72048XLo.A18(c0Zx5, c11520jB4);
                Number A0Z = AbstractC72046XLm.A0Z(C5I8.A22, c11520jB4);
                if (A0Z != null) {
                    l3 = AbstractC25229BEm.A0n(A0Z);
                }
                c0Zx5.A05(AbstractC111324zv.A00(1888), l3);
            }
            A0f.AAQ(c0Zx5, AbstractC111324zv.A00(2994));
            A0f.A8I("ad_tag_width", AbstractC72048XLo.A0E(C5I8.A0O, A01));
            A0f.A8I("ad_tag_height", AbstractC72048XLo.A0E(C5I8.A0N, A01));
            AbstractC72048XLo.A0j(A0f, A01);
            A0f.A7v("is_dwell_tap_to_iab_enabled", AbstractC72046XLm.A0S(C5I8.A4F, A01));
            A0f.AAP(AbstractC111324zv.A00(2240), AbstractC37300Gc1.A0R(C5I8.A29, A01));
            A0f.AAP("cta_type", AbstractC37300Gc1.A0R(C5I8.A1w, A01));
            Number A0Z2 = AbstractC72046XLm.A0Z(C5I8.A5h, A01);
            if (A0Z2 != null) {
                l2 = AbstractC25229BEm.A0n(A0Z2);
            }
            A0f.A9K(AbstractC111324zv.A00(1110), l2);
            A0f.Cht();
        }
    }
}
