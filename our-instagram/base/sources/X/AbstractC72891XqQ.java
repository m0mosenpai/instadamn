package X;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.XqQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72891XqQ {
    public static final void A01(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        String str;
        Map map;
        C0Zx c0Zx;
        LinkedHashMap linkedHashMap;
        List list;
        Map map2;
        C0Zx c0Zx2;
        C19260xA c19260xA;
        Long l;
        Long l2;
        Long l3;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4681));
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA2 = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72046XLm.A0r(A0f, C5I8.A5c, A01);
            C11500j9 c11500j9 = C5I8.A0Z;
            AbstractC72046XLm.A0s(A0f, c11500j9, A01);
            AbstractC72046XLm.A17(A0f, A01);
            ArrayList arrayList = (ArrayList) A01.A01(C5I8.A2r);
            int i = 0;
            if (arrayList != null) {
                str = (String) AbstractC001800i.A0O(arrayList, 0);
            } else {
                str = null;
            }
            A0f.AAP("feed_sticker_media_id", str);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            C11500j9 c11500j92 = C5I8.A0C;
            AbstractC72046XLm.A0t(A0f, c11500j92, A01);
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
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A0N(A0f, A01);
            AbstractC72047XLn.A0K(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            AbstractC72047XLn.A14(A0f, A01);
            A0f.A9K("segment_index", AbstractC72046XLm.A0Y(C5I8.A7y, A01));
            AbstractC72047XLn.A1I(A0f, A01);
            A0f.A9K("segment_count", AbstractC72046XLm.A0Y(C5I8.A7x, A01));
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0i(A0f, A01);
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0c);
                Iterator it = A0c.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    AbstractC166997dE.A1R(AbstractC31171DnF.A0V(i), AnonymousClass010.A0m((String) next), A0i);
                    i = i2;
                }
                map = AbstractC06930Yk.A08(A0i);
            } else {
                map = null;
            }
            A0f.A9M("video_to_carousel_cut_secs", map);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72047XLn.A0T(A0f, A01);
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            A0f.A9K("dark_mode_state", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A20, A01)));
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            A0f.A9M("header_layout", null);
            AbstractC72047XLn.A0e(A0f, A01);
            A0f.A7v("is_highlights_sourced", AbstractC72046XLm.A0S(C5I8.A4L, A01));
            AbstractC72046XLm.A18(A0f, A01);
            AbstractC72047XLn.A0u(A0f, A01);
            A0f.A9K("unseen_reel_size", null);
            AbstractC72047XLn.A0k(A0f, A01);
            ArrayList A06 = c19260xA2.A06("attribution_type");
            if (!(A06 instanceof List)) {
                A06 = null;
            }
            A0f.A9M("attribution_type", A00(A06));
            A0f.A7v("has_translation", c19260xA2.A01("has_translation"));
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C19260xA A00 = A07.A00();
                c0Zx = new C0Zx();
                AbstractC72048XLo.A17(c0Zx, A07);
                AbstractC72047XLn.A1a(c0Zx, A07);
                c0Zx.A04("media_height", AbstractC72046XLm.A0T(A00, "media_height"));
                c0Zx.A04("media_width", AbstractC72046XLm.A0T(A00, "media_width"));
                c0Zx.A04("caption_font_size", AbstractC72046XLm.A0T(A00, "caption_font_size"));
                c0Zx.A05("caption_num_char_showed", AbstractC72047XLn.A09(A00, "caption_num_char_showed"));
                c0Zx.A05("caption_num_hashtags_showed", AbstractC72047XLn.A09(A00, "caption_num_hashtags_showed"));
                c0Zx.A05("caption_num_lines_showed", AbstractC72047XLn.A09(A00, "caption_num_lines_showed"));
                c0Zx.A05("caption_num_lines_total", AbstractC72047XLn.A09(A00, "caption_num_lines_total"));
                c0Zx.A05("caption_num_mentions_showed", AbstractC72047XLn.A09(A00, "caption_num_mentions_showed"));
                c0Zx.A04("caption_position_start_x", AbstractC72046XLm.A0T(A00, "caption_position_start_x"));
                c0Zx.A04("caption_position_start_y", AbstractC72046XLm.A0T(A00, "caption_position_start_y"));
                AbstractC72046XLm.A1L(c0Zx, A00, "caption_text_color");
                AbstractC72047XLn.A1Y(c0Zx, A00);
                c0Zx.A04("caption_line_height", AbstractC72046XLm.A0T(A00, "caption_line_height"));
                c0Zx.A04("caption_height", AbstractC72046XLm.A0T(A00, "caption_height"));
                c0Zx.A04("caption_width", AbstractC72046XLm.A0T(A00, "caption_width"));
                AbstractC72046XLm.A1M(c0Zx, A00, "is_caption_fully_displayed");
                AbstractC72047XLn.A1Z(c0Zx, A00, "background_color_caption");
                AbstractC72046XLm.A1L(c0Zx, A00, "headline_text_showed");
                Double A02 = A00.A02("media_position_start_x");
                if (A02 != null) {
                    l3 = Long.valueOf((long) A02.doubleValue());
                } else {
                    l3 = null;
                }
                c0Zx.A05("media_position_start_x", l3);
                c0Zx.A04("media_position_start_y", A00.A02("media_position_start_y"));
                AbstractC72046XLm.A1M(c0Zx, A00, "caption_doesnt_fit");
                AbstractC72046XLm.A1L(c0Zx, A00, "template_id");
                c0Zx.A08("stickers", null);
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "media_layout");
            A0f.A9M("carousel_transformation_cards", A00((List) A01.A01(C5I8.A17)));
            A0f.A9K("carousel_transformation_type", null);
            AbstractC72047XLn.A0H(A0f, c11500j9, A01);
            AbstractC72049XLp.A0G(A0f, c11500j92, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            A0f.A9M("sponsor_tag_ids", A00((List) AbstractC72047XLn.A06(A0f, A01)));
            AbstractC72046XLm.A1D(A0f, A01);
            A0f.A7v("is_second_channel_enabled", AbstractC72046XLm.A0S(C5I8.A4n, A01));
            A0f.AAQ(null, "toolbar_layout");
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractList abstractList = (AbstractList) A01.A01(C5I8.A8T);
            if (abstractList != null) {
                linkedHashMap = AbstractC166987dD.A1I();
                int size = abstractList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C19260xA A002 = ((C11520jB) abstractList.get(i3)).A00();
                    String A05 = A002.A05("sticker_id");
                    if (A05 != null) {
                        l2 = AbstractC003100w.A0k(10, A05);
                    } else {
                        l2 = null;
                    }
                    String A052 = A002.A05("sticker_type");
                    if (A052 != null) {
                        C0Zx c0Zx3 = new C0Zx();
                        c0Zx3.A06("sticker_type", A052);
                        c0Zx3.A05("sticker_id", l2);
                        linkedHashMap.put(AbstractC31171DnF.A0V(i3), c0Zx3);
                    }
                }
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("sticker_types", linkedHashMap);
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0e);
                Iterator it2 = A0e.iterator();
                while (it2.hasNext()) {
                    AbstractC72047XLn.A1b(A0i2, it2);
                }
                list = AbstractC001800i.A0X(A0i2);
            } else {
                list = null;
            }
            A0f.AAk("tagged_user_ids", list);
            A0f.AAk("product_ids", (List) A01.A01(C5I8.A6l));
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                ArrayList A17 = AbstractC25225BEi.A17(A0f2.size());
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    long A0N = AbstractC166987dD.A0N(A1K.getKey());
                    AbstractCollection abstractCollection = (AbstractCollection) A1K.getValue();
                    Long valueOf = Long.valueOf(A0N);
                    ArrayList A0i3 = AbstractC167007dF.A0i(abstractCollection);
                    Iterator it3 = abstractCollection.iterator();
                    while (it3.hasNext()) {
                        A0i3.add(String.valueOf(MSY.A07(it3)));
                    }
                    AbstractC166997dE.A1R(valueOf, A00(A0i3), A17);
                }
                map2 = AbstractC06930Yk.A08(A17);
            } else {
                map2 = null;
            }
            AbstractC72046XLm.A1K(A0f, map2);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72048XLo.A0f(A0f, A01);
            A0f.A7v("production_build", null);
            Object A022 = c19260xA2.A00.A02("profile_shop_link");
            if ((A022 instanceof C19260xA) && (c19260xA = (C19260xA) A022) != null) {
                c0Zx2 = new C0Zx();
                String A003 = AbstractC111324zv.A00(132);
                String A053 = c19260xA.A05(A003);
                if (A053 != null) {
                    l = AbstractC003100w.A0k(10, A053);
                } else {
                    l = null;
                }
                c0Zx2.A05(A003, l);
            } else {
                c0Zx2 = null;
            }
            A0f.AAQ(c0Zx2, "profile_shop_link");
            AbstractC72047XLn.A0o(A0f, A01);
            A0f.AAQ(null, "carousel_transformation_generic_card_info");
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0E(C5I8.A3c, A01));
            AbstractC72047XLn.A0Y(A0f, A01);
            AbstractC72047XLn.A0m(A0f, A01);
            A0f.AAP("multi_ads_unit_id", null);
            A0f.AAP("intent_aware_ads_trigger_type", AbstractC37300Gc1.A0R(C5I8.A3q, A01));
            A0f.Cht();
        }
    }

    public static final Map A00(List list) {
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                AbstractC166997dE.A1R(AbstractC31171DnF.A0V(i), obj, A0q);
                i = i2;
            }
            return AbstractC06930Yk.A08(A0q);
        }
        return AbstractC06930Yk.A0E();
    }
}
