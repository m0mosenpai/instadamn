package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public abstract class Xii {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        ArrayList arrayList;
        long j;
        Double d;
        C0Zx c0Zx;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Long l;
        Long l2;
        Long A0k;
        Long l3;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4671));
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5K, A01);
            if (A0R == null) {
                A0R = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R);
            long j2 = 0;
            AbstractC37300Gc1.A0h(A0f, Long.valueOf(AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A5M, A01))));
            A0f.A9K("media_author_id", Long.valueOf(AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A5G, A01))));
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            C11500j9 c11500j9 = C5I8.A0C;
            A0f.A9K("ad_id", AbstractC72046XLm.A0Y(c11500j9, A01));
            AbstractC72047XLn.A0W(A0f, A01);
            A0f.A9K(AbstractC111324zv.A00(3840), AbstractC72046XLm.A0Y(C5I8.A03, A01));
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A0y(A0f, A01);
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            C0Zx c0Zx2 = null;
            A0f.A8I("current_play_time", AbstractC72046XLm.A0V(AbstractC72046XLm.A0Z(C5I8.A1x, A01)));
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "ranking_session_id", AbstractC37300Gc1.A0R(C5I8.A6s, A01));
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0d);
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (A1B != null) {
                        l3 = AbstractC25228BEl.A13(A1B);
                    } else {
                        l3 = null;
                    }
                    A0i.add(l3);
                }
                arrayList = AbstractC001800i.A0U(A0i);
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            A0f.A9K("product_id", AbstractC72047XLn.A0B(C5I8.A6k, A01));
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A5g, A01);
            if (A0R2 != null && (A0k = AbstractC003100w.A0k(10, A0R2)) != null) {
                j = A0k.longValue();
            } else {
                j = -1;
            }
            A0f.A9K("merchant_id", Long.valueOf(j));
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A12(A0f, A01);
            AbstractC72048XLo.A0t(A0f, A01);
            AbstractC72047XLn.A0v(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A0f(A0f, A01);
            AbstractC72048XLo.A0h(A0f, A01);
            AbstractC72046XLm.A17(A0f, A01);
            AbstractC72046XLm.A0p(A0f, C5I8.A3R, A01);
            AbstractC72046XLm.A0q(A0f, C5I8.A3Q, A01);
            if (AbstractC72046XLm.A0Z(C5I8.A3h, A01) != null) {
                d = Double.valueOf(r0.intValue());
            } else {
                d = null;
            }
            A0f.A8I("igtv_video_width", d);
            A0f.A9K("push_down_offset", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A0U, A01)));
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            A0f.A9K("seed_ad_id", AbstractC72047XLn.A0B(C5I8.A7w, A01));
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0B(C5I8.A3c, A01));
            AbstractC72048XLo.A11(A0f, A01, AbstractC72047XLn.A0B(C5I8.A2v, A01));
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72047XLn.A0B(C5I8.A5v, A01), "multi_ads_first_ad_id");
            AbstractC72047XLn.A1L(A0f, A01);
            C11500j9 c11500j92 = C5I8.A0Z;
            AbstractC72046XLm.A0s(A0f, c11500j92, A01);
            C11500j9 c11500j93 = C5I8.A5c;
            AbstractC72046XLm.A0r(A0f, c11500j93, A01);
            AbstractC72049XLp.A0F(A0f, c11500j93, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72046XLm.A16(A0f, A01);
            AbstractC72048XLo.A0V(A0f, C5I8.A93, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 == null) {
                c0Zx = null;
            } else {
                C19260xA A00 = A07.A00();
                c0Zx = new C0Zx();
                AbstractC72047XLn.A1a(c0Zx, A07);
                c0Zx.A04("media_height", AbstractC72047XLn.A08(A00, "media_height"));
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
            }
            A0f.AAQ(c0Zx, "media_layout");
            AbstractC72047XLn.A0n(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72048XLo.A0a(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72047XLn.A1U(A0f, A01, "parent_m_pk", AbstractC37300Gc1.A0R(C5I8.A6U, A01));
            C11500j9 c11500j94 = C5I8.A12;
            AbstractC72046XLm.A0w(A0f, c11500j94, A01);
            AbstractC72046XLm.A0v(A0f, c11500j94, A01);
            AbstractC72047XLn.A0x(A0f, A01);
            AbstractC72046XLm.A14(A0f, A01);
            A0f.A9K("author_id", AbstractC72047XLn.A0B(C5I8.A0Y, A01));
            AbstractC72047XLn.A0p(A0f, A01);
            A0f.A9K("a_pk_long", AbstractC72046XLm.A0Y(c11500j92, A01));
            A0f.A9K("ad_id", AbstractC72046XLm.A0Y(c11500j9, A01));
            AbstractC72049XLp.A0G(A0f, c11500j9, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            AbstractC72046XLm.A0x(A0f, A01);
            AbstractCollection abstractCollection = (AbstractCollection) AbstractC72047XLn.A06(A0f, A01);
            if (abstractCollection != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(abstractCollection);
                Iterator it2 = abstractCollection.iterator();
                while (it2.hasNext()) {
                    AbstractC72048XLo.A1U(A0i2, it2);
                }
                linkedHashMap = AbstractC72046XLm.A0h(A0i2);
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("sponsor_tag_ids", linkedHashMap);
            A0f.AAk("c_pk_list", null);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            A0f.AAP("topic_cluster_status", null);
            AbstractC72047XLn.A15(A0f, A01);
            A0f.A9M("client_ad_creative_optimization_output", null);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            AbstractC72047XLn.A0J(A0f, A01);
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72046XLm.A1I(A0f, A01);
            AbstractC72046XLm.A1G(A0f, A01);
            Integer num = C05F.A0j;
            AbstractC72047XLn.A1R(A0f, A01, num);
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0B(C5I8.A9e, A01));
            C11500j9 c11500j95 = C5I8.A5U;
            A0f.A9K("media_owner_id", AbstractC72046XLm.A0Y(c11500j95, A01));
            AbstractC72047XLn.A0r(A0f, A01);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0B(C5I8.A5C, A01));
            A0f.A7v("is_below_eof", null);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72048XLo.A0c(A0f, A01);
            A0f.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72047XLn.A0B(C5I8.A9Z, A01));
            AbstractC72049XLp.A0H(A0f, A01, num, "container_module");
            AbstractC72049XLp.A0H(A0f, A01, num, "contextual_ads_category");
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i3 = AbstractC167007dF.A0i(A0e);
                Iterator it3 = A0e.iterator();
                while (it3.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(it3);
                    if (A1B2 != null) {
                        l = AbstractC25228BEl.A13(A1B2);
                        l2 = AbstractC25228BEl.A13(A1B2);
                    } else {
                        l = null;
                        l2 = null;
                    }
                    AbstractC166997dE.A1R(l, l2, A0i3);
                }
                linkedHashMap2 = AbstractC72046XLm.A0h(A0i3);
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap2);
            AbstractC72047XLn.A0V(A0f, A01);
            AbstractC72046XLm.A1H(A0f, A01);
            A0f.A9K("connection_id", AbstractC72047XLn.A0B(C5I8.A1X, A01));
            AbstractC72048XLo.A0e(A0f, A01);
            if (AbstractC166997dE.A1Z(A01.A01(C5I8.A4N), true)) {
                j2 = 1;
            }
            A0f.A9K("is_igtv", Long.valueOf(j2));
            AbstractC72047XLn.A1F(A0f, A01);
            A0f.A9K("media_owner_id_long", AbstractC72046XLm.A0Y(c11500j95, A01));
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A2J, A01);
            if (A0c != null) {
                ArrayList A0i4 = AbstractC167007dF.A0i(A0c);
                Iterator it4 = A0c.iterator();
                while (it4.hasNext()) {
                    AbstractC72048XLo.A1U(A0i4, it4);
                }
                linkedHashMap3 = AbstractC72046XLm.A0h(A0i4);
            } else {
                linkedHashMap3 = null;
            }
            A0f.A9M("drops_product_ids", linkedHashMap3);
            AbstractC72046XLm.A15(A0f, A01);
            AbstractC72047XLn.A0g(A0f, A01);
            A0f.A9K("counter_id", AbstractC72047XLn.A0B(C5I8.A1g, A01));
            A0f.A9K("counter_sid", AbstractC72047XLn.A0B(C5I8.A1h, A01));
            A0f.AAQ(null, "multi_ads_extra");
            A0f.A9M("carousel_media_product_ids", null);
            AbstractC72047XLn.A0P(A0f, A01);
            AbstractC72047XLn.A1S(A0f, A01, num);
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A21);
            if (c11520jB != null) {
                c0Zx2 = new C0Zx();
                AbstractC72048XLo.A18(c0Zx2, c11520jB);
                c0Zx2.A04("remaining_time", AbstractC72046XLm.A0U(C5I8.A25, c11520jB));
            }
            A0f.AAQ(c0Zx2, AbstractC111324zv.A00(203));
            AbstractC72047XLn.A0I(A0f, A01);
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
