package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Xit, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72634Xit {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        C0Zx c0Zx;
        LinkedHashMap linkedHashMap;
        long j;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        String str;
        Long A0k;
        Double d;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_unlike");
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            AbstractC72047XLn.A0U(A0f, A01);
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "tracking_token", AbstractC37300Gc1.A0R(C5I8.A9R, A01));
            AbstractC72046XLm.A0s(A0f, C5I8.A0Z, A01);
            AbstractC72046XLm.A0r(A0f, C5I8.A5c, A01);
            AbstractC72047XLn.A1Q(A0f, A01);
            AbstractC72046XLm.A0t(A0f, C5I8.A0C, A01);
            AbstractC72048XLo.A0V(A0f, C5I8.A93, A01);
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            C0Zx c0Zx2 = null;
            if (A07 != null) {
                C19260xA A00 = A07.A00();
                c0Zx = new C0Zx();
                AbstractC72047XLn.A1a(c0Zx, A07);
                String A05 = A00.A05("media_height");
                if (A05 != null) {
                    d = AbstractC72046XLm.A0W(A05);
                } else {
                    d = null;
                }
                c0Zx.A04("media_height", d);
                c0Zx.A05("media_width", AbstractC72047XLn.A0A(A00, "media_width"));
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
                c0Zx.A05("screen_density", AbstractC72047XLn.A0D(C5I8.A7o, A07));
                c0Zx.A05("screen_width", AbstractC72048XLo.A0G(c0Zx, A07, AbstractC72047XLn.A0D(C5I8.A7p, A07)));
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "media_layout");
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72048XLo.A14(A0f, A01, "inventory_source", AbstractC37300Gc1.A0R(C5I8.A3r, A01));
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72048XLo.A12(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0z, A01), "carousel_index");
            AbstractC72046XLm.A0v(A0f, C5I8.A12, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            A0f.A9K("entity_id", AbstractC72046XLm.A0Y(C5I8.A2a, A01));
            A0f.AAP("entity_name", AbstractC37300Gc1.A0R(C5I8.A2b, A01));
            AbstractC72047XLn.A0j(A0f, A01);
            A0f.AAP("entity_type", AbstractC37300Gc1.A0R(C5I8.A2e, A01));
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
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72047XLn.A0p(A0f, A01);
            AbstractC72048XLo.A0a(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72046XLm.A0w(A0f, C5I8.A13, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5g, A01);
            if (A0R != null && (A0k = AbstractC003100w.A0k(10, A0R)) != null) {
                j = A0k.longValue();
            } else {
                j = -1;
            }
            A0f.A9K("merchant_id", Long.valueOf(j));
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    AbstractC72047XLn.A1b(A0i2, it2);
                }
                arrayList = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0i2));
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            AbstractC72046XLm.A1K(A0f, null);
            A0f.A9K("tap_type", null);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72046XLm.A12(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72047XLn.A0J(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            A0f.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72047XLn.A0B(C5I8.A9Z, A01));
            AbstractC72047XLn.A0V(A0f, A01);
            AbstractC72046XLm.A1H(A0f, A01);
            A0f.A9K("min_consumed_media_gap_to_previous_ad", AbstractC72046XLm.A0Y(C5I8.A5l, A01));
            A0f.A9K("min_consumed_media_gap_to_previous_netego", AbstractC72046XLm.A0Y(C5I8.A5m, A01));
            A0f.A9K("min_consumed_reel_gap_to_previous_ad", AbstractC72046XLm.A0Y(C5I8.A5j, A01));
            A0f.A9K("min_consumed_reel_gap_to_previous_netego", AbstractC72046XLm.A0Y(C5I8.A5k, A01));
            A0f.A7v("impression_logger_validate", AbstractC72046XLm.A0S(C5I8.A3j, A01));
            AbstractC72047XLn.A0d(A0f, A01);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0B(C5I8.A5C, A01));
            AbstractC72046XLm.A1I(A0f, A01);
            AbstractC72046XLm.A15(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72047XLn.A0g(A0f, A01);
            A0f.A9K("counter_id", AbstractC72047XLn.A0B(C5I8.A1g, A01));
            A0f.A9K("counter_sid", AbstractC72047XLn.A0B(C5I8.A1h, A01));
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A1H(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i3 = AbstractC167007dF.A0i(A0e);
                Iterator it3 = A0e.iterator();
                while (it3.hasNext()) {
                    AbstractC72048XLo.A1W(A0i3, it3);
                }
                linkedHashMap2 = AbstractC72046XLm.A0h(A0i3);
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap2);
            AbstractC72046XLm.A0q(A0f, C5I8.A3Q, A01);
            AbstractC72046XLm.A17(A0f, A01);
            AbstractC72046XLm.A0p(A0f, C5I8.A3R, A01);
            AbstractC72047XLn.A0P(A0f, A01);
            A0f.A9K(AbstractC58317Pt9.A00(87), null);
            A0f.AAP("connection_type", null);
            A0f.A9K("sponsor_tag_id", AbstractC72047XLn.A0B(C5I8.A8O, A01));
            A0f.AAP("url", null);
            A0f.AAQ(null, "extra");
            AbstractC72047XLn.A0x(A0f, A01);
            AbstractC72047XLn.A19(A0f, A01);
            AbstractC72047XLn.A0Q(A0f, A01);
            A0f.A9K("tags", null);
            AbstractC72048XLo.A0U(A0f, interfaceC60442pS, A01, AbstractC72046XLm.A0Y(C5I8.A5G, A01), "media_author_id");
            AbstractC72048XLo.A13(A0f, A01, 1L, "is_prod");
            AbstractC72048XLo.A0Z(A0f, A01);
            A0f.A9K("product_id", AbstractC72046XLm.A0Y(C5I8.A6m, A01));
            A0f.AAQ(null, "location_info");
            AbstractC72047XLn.A0S(A0f, A01);
            A0f.A8I(AbstractC111324zv.A00(838), AbstractC72046XLm.A0U(C5I8.A0o, A01));
            A0f.A9K("gap_to_last_ad", AbstractC72046XLm.A0Y(C5I8.A34, A01));
            AbstractC72047XLn.A1G(A0f, A01);
            AbstractC72048XLo.A10(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A7S, A01));
            ArrayList arrayList2 = (ArrayList) A01.A01(C5I8.A2r);
            if (arrayList2 != null) {
                str = (String) AbstractC001800i.A0O(arrayList2, 0);
            } else {
                str = null;
            }
            A0f.AAP("feed_sticker_media_id", str);
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A21);
            if (c11520jB != null) {
                c0Zx2 = new C0Zx();
                AbstractC72048XLo.A18(c0Zx2, c11520jB);
                c0Zx2.A04("remaining_time", AbstractC72046XLm.A0U(C5I8.A25, c11520jB));
            }
            A0f.AAQ(c0Zx2, AbstractC111324zv.A00(203));
            AbstractC72047XLn.A0I(A0f, A01);
            A0f.Cht();
        }
    }
}
