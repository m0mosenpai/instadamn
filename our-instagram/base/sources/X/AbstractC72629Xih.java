package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xih, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72629Xih {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ) {
        C0Zx c0Zx;
        LinkedHashMap linkedHashMap;
        Map map;
        LinkedHashMap linkedHashMap2;
        Map map2;
        C0Zx c0Zx2;
        Long l;
        Long l2;
        Double d;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_carousel_impression");
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "tracking_token", AbstractC37300Gc1.A0R(C5I8.A9R, A01));
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72047XLn.A1U(A0f, A01, "carousel_media_id", AbstractC37300Gc1.A0R(C5I8.A10, A01));
            AbstractC72046XLm.A11(A0f, A01);
            A0f.A7v("post_impression_column_override", AbstractC72046XLm.A0S(C5I8.A6Q, A01));
            C11500j9 c11500j9 = C5I8.A5c;
            AbstractC72046XLm.A0r(A0f, c11500j9, A01);
            A0f.AAP("a_pk", AbstractC37300Gc1.A0R(C5I8.A0Y, A01));
            AbstractC72047XLn.A0U(A0f, A01);
            AbstractC72047XLn.A0N(A0f, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72047XLn.A0h(A0f, A01);
            C11500j9 c11500j92 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j92, A01);
            C11500j9 c11500j93 = C5I8.A0C;
            AbstractC72046XLm.A0t(A0f, c11500j93, A01);
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C19260xA A00 = A07.A00();
                c0Zx = new C0Zx();
                AbstractC72047XLn.A1a(c0Zx, A07);
                String A05 = A00.A05("media_height");
                Long l3 = null;
                if (A05 != null) {
                    d = AbstractC72046XLm.A0W(A05);
                } else {
                    d = null;
                }
                c0Zx.A04("media_height", d);
                c0Zx.A04("media_width", AbstractC72047XLn.A08(A00, "media_width"));
                c0Zx.A04("caption_font_size", AbstractC72047XLn.A08(A00, "caption_font_size"));
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
                String A052 = A00.A05("caption_num_mentions_showed");
                if (A052 != null) {
                    l3 = AbstractC25228BEl.A13(A052);
                }
                c0Zx.A05("caption_num_mentions_showed", l3);
                AbstractC72046XLm.A1L(c0Zx, A00, "caption_text_color");
                AbstractC72046XLm.A1L(c0Zx, A00, "headline_text_showed");
                AbstractC72048XLo.A17(c0Zx, A07);
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "media_layout");
            A0f.A9K("imp_logger_ver", AbstractC72046XLm.A0Y(C5I8.A3l, A01));
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            A0f.A9K("dark_mode_state", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A20, A01)));
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72046XLm.A0u(A0f, c11500j9, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72048XLo.A0a(A0f, A01);
            AbstractC72047XLn.A1F(A0f, A01);
            AbstractC72047XLn.A0v(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72047XLn.A0x(A0f, A01);
            C11500j9 c11500j94 = C5I8.A0Z;
            A0f.A9K("author_id", AbstractC72046XLm.A0Y(c11500j94, A01));
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72047XLn.A0H(A0f, c11500j94, A01);
            AbstractC72049XLp.A0G(A0f, c11500j93, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractC72046XLm.A0w(A0f, c11500j92, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            A0f.A9K("carousel_container_media_id", AbstractC72046XLm.A0Y(C5I8.A0w, A01));
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
            AbstractC72047XLn.A1O(A0f, A01);
            A0f.AAP("topic_cluster_status", null);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            C11500j9 c11500j95 = C5I8.A5g;
            A0f.A9K("merchant_id", AbstractC72047XLn.A0B(c11500j95, A01));
            C11500j9 c11500j96 = C5I8.A5U;
            A0f.A9K("media_owner_id", AbstractC72046XLm.A0Y(c11500j96, A01));
            A0f.A9M("client_ad_creative_optimization_output", null);
            A0f.A9K("media_owner_id_long", AbstractC72046XLm.A0Y(c11500j96, A01));
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0B(C5I8.A3c, A01));
            AbstractC72047XLn.A0Y(A0f, A01);
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0B(C5I8.A5v, A01));
            AbstractC72047XLn.A0m(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72047XLn.A11(A0f, A01);
            C11500j9 c11500j97 = C5I8.A6l;
            AbstractCollection A0c = AbstractC72046XLm.A0c(c11500j97, A01);
            if (A0c != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0c);
                Iterator it2 = A0c.iterator();
                while (it2.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it2);
                    if (A1B != null) {
                        l2 = AbstractC25228BEl.A13(A1B);
                    } else {
                        l2 = null;
                    }
                    AbstractC166997dE.A1R(l2, A1B, A0i2);
                }
                map = AbstractC06930Yk.A08(A0i2);
            } else {
                map = null;
            }
            A0f.A9M("product_ids", map);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                linkedHashMap2 = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    Iterable iterable = (Iterable) A1K.getValue();
                    ArrayList A0i3 = AbstractC167007dF.A0i(iterable);
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        AbstractC72048XLo.A1U(A0i3, it3);
                    }
                    linkedHashMap2.put(key, AbstractC06930Yk.A08(A0i3));
                }
            } else {
                linkedHashMap2 = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap2);
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72046XLm.A1G(A0f, A01);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0B(C5I8.A5C, A01));
            AbstractC72047XLn.A0r(A0f, A01);
            A0f.A7v("is_below_eof", null);
            AbstractC72047XLn.A0J(A0f, A01);
            AbstractC72046XLm.A1H(A0f, A01);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            A0f.A7v("is_ad_tag_enabled", AbstractC72046XLm.A0S(C5I8.A3v, A01));
            AbstractC72048XLo.A0e(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i4 = AbstractC167007dF.A0i(A0e);
                Iterator it4 = A0e.iterator();
                while (it4.hasNext()) {
                    AbstractC72048XLo.A1W(A0i4, it4);
                }
                map2 = AbstractC06930Yk.A08(A0i4);
            } else {
                map2 = null;
            }
            A0f.A9M("tagged_user_ids", map2);
            A0f.AAQ(null, "multi_ads_extra");
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72047XLn.A0g(A0f, A01);
            A0f.A9K("counter_id", AbstractC72047XLn.A0B(C5I8.A1g, A01));
            A0f.A9K("counter_sid", AbstractC72047XLn.A0B(C5I8.A1h, A01));
            A0f.A9K("connection_id", AbstractC72047XLn.A0B(C5I8.A1X, A01));
            AbstractC72046XLm.A1I(A0f, A01);
            AbstractC72046XLm.A0q(A0f, C5I8.A3Q, A01);
            AbstractC72046XLm.A17(A0f, A01);
            AbstractC72046XLm.A0p(A0f, C5I8.A3R, A01);
            AbstractC72046XLm.A15(A0f, A01);
            A0f.A9M("carousel_media_product_ids", null);
            A0f.A9K("recs_ix", AbstractC72047XLn.A0A(c19260xA, "recs_ix"));
            AbstractC72047XLn.A1K(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            A0f.A9K("feed_recs_post_position", null);
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72047XLn.A0P(A0f, A01);
            A0f.A9K("collection_id", AbstractC72047XLn.A0B(C5I8.A1L, A01));
            A0f.AAP("collection_name", AbstractC37300Gc1.A0R(C5I8.A1N, A01));
            A0f.A9K("carousel_ad_id", null);
            A0f.AAP("carousel_image_url", null);
            AbstractC72047XLn.A0V(A0f, A01);
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A87);
            if (c11520jB != null) {
                C19260xA A002 = c11520jB.A00();
                c0Zx2 = new C0Zx();
                String A0R = AbstractC37300Gc1.A0R(c11500j95, c11520jB);
                Map map3 = null;
                if (A0R != null) {
                    l = AbstractC25228BEl.A13(A0R);
                } else {
                    l = null;
                }
                c0Zx2.A05("merchant_id", l);
                AbstractCollection A0c2 = AbstractC72046XLm.A0c(c11500j97, c11520jB);
                if (A0c2 != null) {
                    ArrayList A0i5 = AbstractC167007dF.A0i(A0c2);
                    Iterator it5 = A0c2.iterator();
                    while (it5.hasNext()) {
                        AbstractC72048XLo.A1W(A0i5, it5);
                    }
                    map3 = AbstractC06930Yk.A08(A0i5);
                }
                c0Zx2.A08("product_ids", map3);
                String A053 = A002.A05("shopping_sticker_id");
                if (A053 == null) {
                    A053 = "";
                }
                c0Zx2.A06("shopping_sticker_id", A053);
            } else {
                c0Zx2 = null;
            }
            A0f.AAQ(c0Zx2, "shopping_sticker_info");
            A0f.AAP("carouwel_cover_media_id", null);
            A0f.A9K("start_process_time", null);
            A0f.AAP(AbstractC111324zv.A00(3137), null);
            AbstractC72048XLo.A0j(A0f, A01);
            A0f.Cht();
        }
    }
}
