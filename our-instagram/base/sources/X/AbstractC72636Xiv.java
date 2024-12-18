package X;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xiv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72636Xiv {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0Ai] */
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        EnumC72418XdO enumC72418XdO;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        List list;
        C0Zx c0Zx;
        C0Zx c0Zx2;
        C0Zx c0Zx3;
        List list2;
        ?? r1;
        List list3;
        long j;
        List list4;
        Long A0k;
        C19260xA c19260xA;
        Long l;
        long j2;
        Long A0k2;
        Long A0k3;
        ?? A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4683));
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA2 = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            C11500j9 c11500j9 = C5I8.A5K;
            AbstractC37300Gc1.A0l(A0f, AbstractC37300Gc1.A0R(c11500j9, A01));
            AbstractC72047XLn.A1M(A0f, A01);
            A0f.A8I("duration", AbstractC72046XLm.A0U(C5I8.A2L, A01));
            LinkedHashMap linkedHashMap2 = null;
            A0f.A9K("percent_visible", AbstractC72047XLn.A0F(c19260xA2.A03("percent_visible")));
            String A05 = c19260xA2.A05("visibility_unit");
            if (C14360o3.A0K(A05, "feed_unit")) {
                enumC72418XdO = EnumC72418XdO.FEED_UNIT;
            } else if (C14360o3.A0K(A05, "viewport")) {
                enumC72418XdO = EnumC72418XdO.VIEWPORT;
            } else {
                enumC72418XdO = null;
            }
            A0f.A8R(enumC72418XdO, "visibility_unit");
            C11500j9 c11500j92 = C5I8.A0Z;
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(c11500j92, A01), "a_pk");
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72048XLo.A0X(A0f, C5I8.A5c, A01);
            C11500j9 c11500j93 = C5I8.A0C;
            AbstractC72046XLm.A0t(A0f, c11500j93, A01);
            A0f.A9K("has_been_loaded", AbstractC72047XLn.A0C(C5I8.A3S, A01));
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            A0f.A9K("dark_mode_state", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A20, A01)));
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72048XLo.A0m(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            AbstractC72047XLn.A14(A0f, A01);
            AbstractC72047XLn.A1I(A0f, A01);
            AbstractC72047XLn.A0i(A0f, A01);
            AbstractC72048XLo.A14(A0f, A01, "inventory_source", AbstractC37300Gc1.A0R(C5I8.A3r, A01));
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72047XLn.A0T(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72047XLn.A0e(A0f, A01);
            A0f.A7v("is_highlights_sourced", AbstractC72046XLm.A0S(C5I8.A4L, A01));
            AbstractC72047XLn.A0u(A0f, A01);
            A0f.A9K("unseen_reel_size", null);
            AbstractC72046XLm.A18(A0f, A01);
            A0f.AAk("header_layout", null);
            AbstractC72047XLn.A0S(A0f, A01);
            A0f.A7v("has_translation", c19260xA2.A01("has_translation"));
            A0f.A9M("attribution_type", null);
            AbstractC72047XLn.A0P(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72048XLo.A0f(A0f, A01);
            AbstractC72048XLo.A0u(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A0c.iterator();
                while (it.hasNext()) {
                    Double A0m = AnonymousClass010.A0m(AbstractC166987dD.A1B(it));
                    if (A0m != null) {
                        A1E.add(A0m);
                    }
                }
                arrayList = AbstractC001800i.A0U(A1E);
            } else {
                arrayList = null;
            }
            A0f.AAk("video_to_carousel_cut_secs", arrayList);
            A0f.AAk("sponsor_tag_ids", (List) AbstractC72047XLn.A06(A0f, A01));
            AbstractC72047XLn.A1O(A0f, A01);
            A0f.AAQ(null, "toolbar_layout");
            AbstractList abstractList = (AbstractList) A01.A01(C5I8.A8T);
            if (abstractList != null) {
                linkedHashMap = AbstractC166987dD.A1I();
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    C19260xA A00 = ((C11520jB) abstractList.get(i)).A00();
                    Long A0n = AbstractC25233BEq.A0n(A00.A05("sticker_id"));
                    String A052 = A00.A05("sticker_type");
                    if (A052 != null) {
                        C0Zx c0Zx4 = new C0Zx();
                        c0Zx4.A06("sticker_type", A052);
                        c0Zx4.A05("sticker_id", A0n);
                        linkedHashMap.put(AbstractC31171DnF.A0V(i), c0Zx4);
                    }
                }
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("sticker_types", linkedHashMap);
            A0f.AAk("carousel_transformation_cards", (List) A01.A01(C5I8.A17));
            A0f.A9K("carousel_transformation_type", null);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            A0f.AAP(AbstractC111324zv.A00(377), interfaceC60442pS.getModuleName());
            A0f.AAP("reason", AbstractC37300Gc1.A0R(C5I8.A6u, A01));
            AbstractC72047XLn.A1V(A0f, A01, "application_state", AbstractC37300Gc1.A0R(C5I8.A0Q, A01));
            AbstractC72048XLo.A0b(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(C5I8.A1e, A01);
            if (A0c2 != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0c2);
                Iterator it2 = A0c2.iterator();
                while (it2.hasNext()) {
                    AbstractMap abstractMap = (AbstractMap) it2.next();
                    C0Zx c0Zx5 = new C0Zx();
                    String A002 = AbstractC111324zv.A00(5025);
                    String A0h = AbstractC31171DnF.A0h(A002, abstractMap);
                    long j3 = 0;
                    if (A0h != null && (A0k3 = AbstractC003100w.A0k(10, A0h)) != null) {
                        j2 = A0k3.longValue();
                    } else {
                        j2 = 0;
                    }
                    AbstractC72046XLm.A1P(c0Zx5, A002, j2);
                    String A003 = AbstractC111324zv.A00(5026);
                    String A0h2 = AbstractC31171DnF.A0h(A003, abstractMap);
                    if (A0h2 != null && (A0k2 = AbstractC003100w.A0k(10, A0h2)) != null) {
                        j3 = A0k2.longValue();
                    }
                    AbstractC72046XLm.A1P(c0Zx5, A003, j3);
                    A0i.add(c0Zx5);
                }
                list = AbstractC001800i.A0a(A0i);
            } else {
                list = null;
            }
            A0f.AAk("client_ad_creative_optimization_output", list);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            C11420j0 c11420j0 = c19260xA2.A00;
            Object A02 = c11420j0.A02("profile_shop_link");
            if ((A02 instanceof C19260xA) && (c19260xA = (C19260xA) A02) != null) {
                c0Zx = new C0Zx();
                String A004 = AbstractC111324zv.A00(132);
                String A053 = c19260xA.A05(A004);
                Long l2 = null;
                if (A053 != null) {
                    l = AbstractC003100w.A0k(10, A053);
                } else {
                    l = null;
                }
                c0Zx.A05(A004, l);
                c0Zx.A05("merchant_id", AbstractC72047XLn.A09(c19260xA, "merchant_id"));
                String A054 = c19260xA.A05("product_id");
                if (A054 != null) {
                    l2 = AbstractC003100w.A0k(10, A054);
                }
                c0Zx.A05("product_id", l2);
                AbstractC72046XLm.A1L(c0Zx, c19260xA, AbstractC111324zv.A00(1263));
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "profile_shop_link");
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A87);
            if (c11520jB != null) {
                C19260xA A005 = c11520jB.A00();
                c0Zx2 = new C0Zx();
                String A0R = AbstractC37300Gc1.A0R(C5I8.A5g, c11520jB);
                if (A0R != null && (A0k = AbstractC003100w.A0k(10, A0R)) != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                c0Zx2.A05("merchant_id", Long.valueOf(j));
                String A055 = A005.A05("shopping_sticker_id");
                if (A055 == null) {
                    A055 = "";
                }
                c0Zx2.A06("shopping_sticker_id", A055);
                AbstractCollection A0d = AbstractC72046XLm.A0d(c11520jB);
                if (A0d != null) {
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it3 = A0d.iterator();
                    while (it3.hasNext()) {
                        AbstractC72048XLo.A1V(A1E2, it3);
                    }
                    list4 = AbstractC001800i.A0a(A1E2);
                } else {
                    list4 = null;
                }
                c0Zx2.A07("product_ids", list4);
            } else {
                c0Zx2 = null;
            }
            A0f.AAQ(c0Zx2, "shopping_sticker_info");
            A0f.A7v("is_below_eof", AbstractC72046XLm.A0S(C5I8.A3z, A01));
            A0f.A9K("merchant_id", AbstractC72047XLn.A0E(C5I8.A5g, A01));
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72046XLm.A0y(A0f, A01);
            AbstractC72046XLm.A0w(A0f, C5I8.A12, A01);
            A0f.A9K("carousel_size", AbstractC72046XLm.A0Y(C5I8.A15, A01));
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72046XLm.A12(A0f, A01);
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0E(C5I8.A9e, A01));
            AbstractC72047XLn.A0l(A0f, A01);
            A0f.AAk("tagged_user_ids", (List) A01.A01(C5I8.A8p));
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C19260xA A006 = A07.A00();
                c0Zx3 = new C0Zx();
                AbstractC72048XLo.A17(c0Zx3, A07);
                AbstractC72047XLn.A1a(c0Zx3, A07);
                AbstractC72046XLm.A1N(c0Zx3, A07);
                c0Zx3.A04("media_height", AbstractC72046XLm.A0T(A006, "media_height"));
                c0Zx3.A04("media_width", AbstractC72046XLm.A0T(A006, "media_width"));
                c0Zx3.A04("caption_font_size", AbstractC72046XLm.A0T(A006, "caption_font_size"));
                c0Zx3.A05("caption_num_char_showed", AbstractC72047XLn.A09(A006, "caption_num_char_showed"));
                c0Zx3.A05("caption_num_hashtags_showed", AbstractC72047XLn.A09(A006, "caption_num_hashtags_showed"));
                c0Zx3.A05("caption_num_lines_showed", AbstractC72047XLn.A09(A006, "caption_num_lines_showed"));
                c0Zx3.A05("caption_num_lines_total", AbstractC72047XLn.A09(A006, "caption_num_lines_total"));
                c0Zx3.A05("caption_num_mentions_showed", AbstractC72047XLn.A09(A006, "caption_num_mentions_showed"));
                c0Zx3.A04("caption_position_start_x", AbstractC72046XLm.A0T(A006, "caption_position_start_x"));
                c0Zx3.A04("caption_position_start_y", AbstractC72046XLm.A0T(A006, "caption_position_start_y"));
                AbstractC72046XLm.A1L(c0Zx3, A006, "caption_text_color");
                AbstractC72047XLn.A1Y(c0Zx3, A006);
                c0Zx3.A04("caption_line_height", AbstractC72046XLm.A0T(A006, "caption_line_height"));
                c0Zx3.A04("caption_height", AbstractC72046XLm.A0T(A006, "caption_height"));
                c0Zx3.A04("caption_width", AbstractC72046XLm.A0T(A006, "caption_width"));
                AbstractC72046XLm.A1M(c0Zx3, A006, "is_caption_fully_displayed");
                AbstractC72047XLn.A1Z(c0Zx3, A006, "background_color_caption");
                AbstractC72046XLm.A1L(c0Zx3, A006, "headline_text_showed");
                c0Zx3.A04("media_position_start_x", A006.A02("media_position_start_x"));
                c0Zx3.A04("media_position_start_y", A006.A02("media_position_start_y"));
                AbstractC72046XLm.A1M(c0Zx3, A006, "caption_doesnt_fit");
                AbstractC72046XLm.A1L(c0Zx3, A006, "template_id");
                c0Zx3.A08("stickers", null);
                c0Zx3.A05("has_headline", A006.A04("has_headline"));
                AbstractC72046XLm.A1M(c0Zx3, A006, "media_is_visible");
                c0Zx3.A05("auto_cropping_height", A006.A04("auto_cropping_height"));
                c0Zx3.A05("auto_cropping_start_x_position", A006.A04("auto_cropping_start_x_position"));
                c0Zx3.A05("auto_cropping_start_y_position", A006.A04("auto_cropping_start_y_position"));
                c0Zx3.A05("auto_cropping_width", A006.A04("auto_cropping_width"));
            } else {
                c0Zx3 = null;
            }
            A0f.AAQ(c0Zx3, "media_layout");
            AbstractC72047XLn.A0x(A0f, A01);
            Object A022 = c11420j0.A02("c_pk_list");
            if ((A022 instanceof List) && (list3 = (List) A022) != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(list3);
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    C19260xA A007 = ((C11520jB) it4.next()).A00();
                    String A056 = A007.A05("comment_id");
                    String A057 = A007.A05(AbstractC111324zv.A00(4155));
                    if (A057 == null) {
                        A057 = "";
                    }
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    if (A056 != null) {
                        A1I.put(A056, A057);
                    }
                    A0i2.add(A1I);
                }
                list2 = AbstractC001800i.A0a(A0i2);
            } else {
                list2 = null;
            }
            A0f.AAk("c_pk_list", list2);
            A0f.A9K("a_pk_long", AbstractC72046XLm.A0Y(c11500j92, A01));
            AbstractC72049XLp.A0G(A0f, c11500j93, A01);
            String A008 = AbstractC111324zv.A00(5251);
            A0f.A9K(A008, c19260xA2.A04(A008));
            A0f.A9K("author_id", AbstractC72047XLn.A0E(C5I8.A0Y, A01));
            AbstractC37300Gc1.A0h(A0f, AbstractC72047XLn.A0E(c11500j9, A01));
            AbstractC72047XLn.A18(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72048XLo.A0p(A0f, A01);
            A0f.A8I("media_time_remaining", AbstractC72046XLm.A0U(C5I8.A5b, A01));
            A0f.A8I("media_time_paused", AbstractC72046XLm.A0U(C5I8.A5V, A01));
            A0f.A8I("media_time_to_load", AbstractC72046XLm.A0U(C5I8.A5S, A01));
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0E(C5I8.A3c, A01));
            AbstractC72047XLn.A0Y(A0f, A01);
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0E(C5I8.A5v, A01));
            AbstractC72047XLn.A11(A0f, A01);
            AbstractC72047XLn.A0m(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            AbstractC72046XLm.A1G(A0f, A01);
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractCollection A0d2 = AbstractC72046XLm.A0d(A01);
            if (A0d2 != null) {
                r1 = AbstractC166987dD.A1E();
                Iterator it5 = A0d2.iterator();
                while (it5.hasNext()) {
                    AbstractC72048XLo.A1V(r1, it5);
                }
            } else {
                r1 = C16930sl.A00;
            }
            A0f.AAk("product_ids", r1);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                linkedHashMap2 = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    linkedHashMap2.put(A1K.getKey(), A1K.getValue());
                }
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap2);
            AbstractC72047XLn.A0w(A0f, A01);
            A0f.Cht();
        }
    }
}
