package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class Xil {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        Long l;
        LinkedHashMap linkedHashMap;
        Map map;
        Map map2;
        LinkedHashMap linkedHashMap2;
        Map map3;
        Map map4;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4673));
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72047XLn.A1E(A0f, A01);
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A1F(A0f, A01);
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72047XLn.A0f(A0f, A01);
            AbstractC72048XLo.A0h(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A1K(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A7e, A01), "reel_viewer_position");
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            C11500j9 c11500j9 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j9, A01);
            A0f.A9K("carousel_media_id_int", AbstractC72046XLm.A0Y(C5I8.A11, A01));
            AbstractC72047XLn.A1U(A0f, A01, "carousel_media_id", AbstractC37300Gc1.A0R(C5I8.A10, A01));
            AbstractC72047XLn.A0X(A0f, A01);
            C11500j9 c11500j92 = C5I8.A0Z;
            A0f.AAP("a_pk", String.valueOf(A01.A01(c11500j92)));
            AbstractC72047XLn.A0W(A0f, A01);
            String A0R = AbstractC37300Gc1.A0R(C5I8.A0B, A01);
            Long l2 = null;
            if (A0R != null) {
                l = AbstractC25228BEl.A13(A0R);
            } else {
                l = null;
            }
            A0f.A9K("ad_id", l);
            AbstractC72047XLn.A0S(A0f, A01);
            AbstractC72047XLn.A17(A0f, A01);
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A2K, A01), "dr_ad_type");
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            A0f.A7v("is_head_load", null);
            A0f.A7v("is_organic_media_tracked", null);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "is_programmatic_scroll", AbstractC37300Gc1.A0R(C5I8.A4h, A01));
            AbstractC72046XLm.A1A(A0f, A01);
            C11500j9 c11500j93 = C5I8.A5c;
            AbstractC72048XLo.A0X(A0f, c11500j93, A01);
            C19260xA A00 = A01.A00();
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("is_showreel_native", AbstractC72046XLm.A0a(C5I8.A4r, A01));
            c0Zx.A04("media_height", AbstractC72047XLn.A08(A00, "media_height"));
            c0Zx.A04("media_width", AbstractC72047XLn.A08(A00, "media_width"));
            c0Zx.A05("caption_font_size", AbstractC72047XLn.A0A(A00, "caption_font_size"));
            c0Zx.A04("caption_position_start_x", AbstractC72047XLn.A08(A00, "caption_position_start_x"));
            c0Zx.A04("caption_position_start_y", AbstractC72047XLn.A08(A00, "caption_position_start_y"));
            c0Zx.A04("caption_line_height", AbstractC72047XLn.A08(A00, "caption_line_height"));
            c0Zx.A04("caption_height", AbstractC72047XLn.A08(A00, "caption_line_height"));
            c0Zx.A04("caption_width", AbstractC72047XLn.A08(A00, "caption_width"));
            AbstractC72048XLo.A16(c0Zx, A00, AbstractC72047XLn.A07(A00, "is_caption_fully_displayed"));
            AbstractC72047XLn.A1Z(c0Zx, A00, "background_color_top");
            c0Zx.A05("caption_num_char_showed", AbstractC72047XLn.A0A(A00, "caption_num_char_showed"));
            c0Zx.A05("caption_num_hashtags_showed", AbstractC72047XLn.A0A(A00, "caption_num_hashtags_showed"));
            c0Zx.A05("caption_num_lines_showed", AbstractC72047XLn.A0A(A00, "caption_num_lines_showed"));
            c0Zx.A05("caption_num_lines_total", AbstractC72047XLn.A0A(A00, "caption_num_lines_total"));
            c0Zx.A05("caption_num_mentions_showed", AbstractC72047XLn.A0A(A00, "caption_num_mentions_showed"));
            AbstractC72046XLm.A1L(c0Zx, A00, "caption_text_color");
            AbstractC72046XLm.A1L(c0Zx, A00, "headline_text_showed");
            c0Zx.A05("screen_density", AbstractC72047XLn.A0D(C5I8.A7o, A01));
            c0Zx.A05("screen_width", AbstractC72048XLo.A0G(c0Zx, A01, AbstractC72047XLn.A0D(C5I8.A7p, A01)));
            A0f.AAQ(c0Zx, "media_layout");
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72047XLn.A12(A0f, A01);
            AbstractC72048XLo.A0m(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A0J(A0f, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            A0f.A9K("top_followers_count", AbstractC72046XLm.A0Y(C5I8.A9N, A01));
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72047XLn.A0L(A0f, A01);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            AbstractC72049XLp.A0F(A0f, c11500j93, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72046XLm.A0w(A0f, c11500j9, A01);
            AbstractC72047XLn.A0x(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72047XLn.A0e(A0f, A01);
            A0f.A9M("header_layout", null);
            AbstractC72048XLo.A0i(A0f, A01);
            AbstractC72047XLn.A0u(A0f, A01);
            A0f.A9K("unseen_reel_size", null);
            AbstractC72047XLn.A0i(A0f, A01);
            AbstractC72047XLn.A1A(A0f, A01);
            A0f.A9K("author_id", AbstractC72047XLn.A0B(C5I8.A0Y, A01));
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72047XLn.A0P(A0f, A01);
            AbstractC72048XLo.A0k(A0f, A01);
            AbstractCollection abstractCollection = (AbstractCollection) AbstractC72047XLn.A06(A0f, A01);
            if (abstractCollection != null) {
                ArrayList A0i = AbstractC167007dF.A0i(abstractCollection);
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    AbstractC72048XLo.A1U(A0i, it);
                }
                linkedHashMap = AbstractC72046XLm.A0h(A0i);
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("sponsor_tag_ids", linkedHashMap);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0c);
                Iterator it2 = A0c.iterator();
                while (it2.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it2);
                    AbstractC166997dE.A1R(AbstractC25228BEl.A13(A1B), AbstractC72046XLm.A0W(A1B), A0i2);
                }
                map = AbstractC06930Yk.A08(A0i2);
            } else {
                map = null;
            }
            A0f.A9M("video_to_carousel_cut_secs", map);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72048XLo.A0v(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(C5I8.A17, A01);
            if (A0c2 != null) {
                ArrayList A0i3 = AbstractC167007dF.A0i(A0c2);
                Iterator it3 = A0c2.iterator();
                while (it3.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(it3);
                    AbstractC166997dE.A1R(AbstractC25228BEl.A13(A1B2), A1B2, A0i3);
                }
                map2 = AbstractC06930Yk.A08(A0i3);
            } else {
                map2 = null;
            }
            A0f.A9M("carousel_transformation_cards", map2);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            A0f.A9K("merchant_id", AbstractC72047XLn.A0B(C5I8.A5g, A01));
            AbstractC72047XLn.A0H(A0f, c11500j92, A01);
            AbstractC72049XLp.A0G(A0f, C5I8.A0C, A01);
            A0f.AAQ(null, "toolbar_layout");
            A0f.A9K("carousel_transformation_type", null);
            A0f.A9M("sticker_types", null);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72046XLm.A0x(A0f, A01);
            A0f.A9M("client_ad_creative_optimization_output", null);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72047XLn.A0s(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                linkedHashMap2 = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    Iterable iterable = (Iterable) A1K.getValue();
                    ArrayList A0i4 = AbstractC167007dF.A0i(iterable);
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        AbstractC72048XLo.A1U(A0i4, it4);
                    }
                    linkedHashMap2.put(key, AbstractC06930Yk.A08(A0i4));
                }
            } else {
                linkedHashMap2 = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap2);
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A1J(A0f, A01);
            A0f.AAP("host_media_pk", AbstractC37300Gc1.A0R(C5I8.A3Y, A01));
            AbstractC72047XLn.A19(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            AbstractC72046XLm.A1I(A0f, A01);
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0B(C5I8.A3c, A01));
            AbstractC72048XLo.A0f(A0f, A01);
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0B(C5I8.A5v, A01));
            AbstractC72047XLn.A0m(A0f, A01);
            AbstractC72047XLn.A11(A0f, A01);
            A0f.A7v("is_below_eof", null);
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0B(C5I8.A9e, A01));
            AbstractC72046XLm.A1H(A0f, A01);
            AbstractC72046XLm.A1G(A0f, A01);
            AbstractC72047XLn.A0V(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i5 = AbstractC167007dF.A0i(A0e);
                Iterator it5 = A0e.iterator();
                while (it5.hasNext()) {
                    AbstractC72048XLo.A1W(A0i5, it5);
                }
                map3 = AbstractC06930Yk.A08(A0i5);
            } else {
                map3 = null;
            }
            A0f.A9M("tagged_user_ids", map3);
            AbstractC72047XLn.A0r(A0f, A01);
            A0f.AAP("survey_id", AbstractC37300Gc1.A0R(C5I8.A8a, A01));
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i6 = AbstractC167007dF.A0i(A0d);
                Iterator it6 = A0d.iterator();
                while (it6.hasNext()) {
                    AbstractC72048XLo.A1W(A0i6, it6);
                }
                map4 = AbstractC06930Yk.A08(A0i6);
            } else {
                map4 = null;
            }
            A0f.A9M("product_ids", map4);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72046XLm.A15(A0f, A01);
            AbstractC72048XLo.A0e(A0f, A01);
            A0f.A9M("carousel_media_product_ids", null);
            A0f.A9K("seed_ad_id", AbstractC72047XLn.A0B(C5I8.A7w, A01));
            AbstractC72047XLn.A0Y(A0f, A01);
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A2v, A01);
            if (A0R2 != null) {
                l2 = AbstractC25228BEl.A13(A0R2);
            }
            A0f.A9K("first_hscroll_item_ad_id", l2);
            A0f.A9K("horizontal_position_on_hscroll", AbstractC72046XLm.A0Y(C5I8.A3X, A01));
            A0f.A9K("vertical_position_on_feed_of_ads", AbstractC72046XLm.A0Y(C5I8.A9j, A01));
            A0f.A9K("position_in_multi_ads_unit", AbstractC72046XLm.A0Y(C5I8.A6a, A01));
            A0f.A7v(AbstractC111324zv.A00(2618), AbstractC72046XLm.A0S(C5I8.A4T, A01));
            AbstractC72047XLn.A0I(A0f, A01);
            A0f.Cht();
        }
    }
}
