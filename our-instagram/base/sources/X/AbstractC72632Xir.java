package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xir, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72632Xir {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ) {
        String str;
        Map map;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        C19260xA A00;
        Long A04;
        Long l5;
        Double d;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4680));
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            String A0R = AbstractC37300Gc1.A0R(C5I8.A2w, A01);
            String str2 = "";
            if (A0R == null) {
                A0R = "";
            }
            A0f.AAP("follow_status", A0R);
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A5K, A01);
            if (A0R2 == null) {
                A0R2 = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R2);
            long j = 0;
            AbstractC37301Gc2.A0y(A0f, AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A5c, A01)));
            String A0R3 = AbstractC37300Gc1.A0R(C5I8.A8G, A01);
            if (A0R3 == null) {
                A0R3 = "";
            }
            A0f.AAP("source_of_action", A0R3);
            String A0R4 = AbstractC37300Gc1.A0R(C5I8.A9R, A01);
            if (A0R4 == null) {
                A0R4 = "";
            }
            A0f.AAP("tracking_token", A0R4);
            String A0R5 = AbstractC37300Gc1.A0R(C5I8.A6q, A01);
            if (A0R5 != null) {
                str2 = A0R5;
            }
            A0f.AAP("radio_type", str2);
            C11500j9 c11500j9 = C5I8.A0Z;
            Serializable A012 = A01.A01(c11500j9);
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = null;
            }
            A0f.AAP("a_pk", str);
            AbstractC72047XLn.A0W(A0f, A01);
            C11500j9 c11500j92 = C5I8.A0C;
            A0f.AAP("ad_id", AbstractC72046XLm.A0a(c11500j92, A01));
            AbstractC72047XLn.A0S(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72047XLn.A17(A0f, A01);
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            C11500j9 c11500j93 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j93, A01);
            AbstractC72046XLm.A0y(A0f, A01);
            AbstractC72047XLn.A1U(A0f, A01, "carousel_media_type", AbstractC72046XLm.A0a(c11500j93, A01));
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "is_programmatic_scroll", AbstractC37300Gc1.A0R(C5I8.A4h, A01));
            AbstractC72047XLn.A0N(A0f, A01);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            A0f.AAP("production_build", AbstractC72046XLm.A0a(C5I8.A2i, A01));
            AbstractC72048XLo.A0m(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            A0f.A9K("top_followers_count", AbstractC72046XLm.A0Y(C5I8.A9N, A01));
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72047XLn.A0L(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72047XLn.A0e(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            A0f.AAk("header_layout", null);
            AbstractC72048XLo.A0i(A0f, A01);
            AbstractC72047XLn.A0u(A0f, A01);
            A0f.A9K("unseen_reel_size", null);
            AbstractC72047XLn.A0i(A0f, A01);
            AbstractC72047XLn.A0x(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            A0f.A9K("author_id", AbstractC72047XLn.A0C(C5I8.A0Y, A01));
            AbstractC37300Gc1.A0h(A0f, null);
            AbstractC72047XLn.A0H(A0f, c11500j9, A01);
            AbstractC72049XLp.A0G(A0f, c11500j92, A01);
            AbstractC72048XLo.A0k(A0f, A01);
            AbstractC72047XLn.A0P(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0c);
                Iterator it = A0c.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (A1B != null) {
                        l5 = AbstractC003100w.A0k(10, A1B);
                        d = AnonymousClass010.A0m(A1B);
                    } else {
                        l5 = null;
                        d = null;
                    }
                    AbstractC166997dE.A1R(l5, d, A0i);
                }
                map = AbstractC06930Yk.A08(A0i);
            } else {
                map = null;
            }
            A0f.A9M("video_to_carousel_cut_secs", map);
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
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72048XLo.A0v(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(C5I8.A17, A01);
            if (A0c2 != null) {
                linkedHashMap2 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0c2));
                Iterator it3 = A0c2.iterator();
                while (it3.hasNext()) {
                    AbstractC72048XLo.A1Y(it3, linkedHashMap2);
                }
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("carousel_transformation_cards", linkedHashMap2);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            A0f.AAQ(null, "toolbar_layout");
            AbstractC72047XLn.A0j(A0f, A01);
            A0f.A9K("carousel_transformation_type", null);
            A0f.A9K("carousel_container_media_id", AbstractC72046XLm.A0Y(C5I8.A0w, A01));
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            A0f.A9K("merchant_id", AbstractC72047XLn.A0E(C5I8.A5g, A01));
            AbstractC72046XLm.A0x(A0f, A01);
            List<C11520jB> list = (List) A01.A01(C5I8.A8T);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            if (list != null) {
                for (C11520jB c11520jB : list) {
                    if (c11520jB != null && (A04 = (A00 = c11520jB.A00()).A04("sticker_id")) != null) {
                        long longValue = A04.longValue();
                        String A05 = A00.A05("sticker_type");
                        if (A05 != null) {
                            C0Zx c0Zx = new C0Zx();
                            c0Zx.A06("sticker_id", String.valueOf(longValue));
                            c0Zx.A06("sticker_type", A05);
                            A1I.put(A04, c0Zx);
                        }
                    }
                }
            }
            A0f.A9M("sticker_types", A1I);
            A0f.AAP("topic_cluster_status", null);
            A0f.A9M("client_ad_creative_optimization_output", null);
            AbstractC72047XLn.A0s(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72047XLn.A1J(A0f, A01);
            AbstractC72047XLn.A19(A0f, A01);
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0E(C5I8.A3c, A01));
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0E(C5I8.A5v, A01));
            AbstractC72047XLn.A0m(A0f, A01);
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A11(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            AbstractC72047XLn.A0Y(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            A0f.A7v("is_below_eof", null);
            AbstractC72046XLm.A1G(A0f, A01);
            AbstractC72047XLn.A0r(A0f, A01);
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0E(C5I8.A9e, A01));
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i3 = AbstractC167007dF.A0i(A0e);
                Iterator it4 = A0e.iterator();
                while (it4.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(it4);
                    if (A1B2 != null) {
                        l3 = AbstractC003100w.A0k(10, A1B2);
                        l4 = AbstractC003100w.A0k(10, A1B2);
                    } else {
                        l3 = null;
                        l4 = null;
                    }
                    AbstractC166997dE.A1R(l3, l4, A0i3);
                }
                linkedHashMap3 = AbstractC72046XLm.A0h(A0i3);
            } else {
                linkedHashMap3 = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap3);
            Integer num = C05F.A0j;
            AbstractC72049XLp.A0H(A0f, A01, num, "container_module");
            A0f.AAP("contextual_ads_category", null);
            A0f.A9K("first_hscroll_item_ad_id", AbstractC72047XLn.A0E(C5I8.A2v, A01));
            A0f.A9K("seed_ad_id", AbstractC72047XLn.A0E(C5I8.A7w, A01));
            AbstractC72048XLo.A0e(A0f, A01);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i4 = AbstractC167007dF.A0i(A0d);
                Iterator it5 = A0d.iterator();
                while (it5.hasNext()) {
                    String A1B3 = AbstractC166987dD.A1B(it5);
                    if (A1B3 != null) {
                        l = AbstractC003100w.A0k(10, A1B3);
                        l2 = AbstractC003100w.A0k(10, A1B3);
                    } else {
                        l = null;
                        l2 = null;
                    }
                    AbstractC166997dE.A1R(l, l2, A0i4);
                }
                linkedHashMap4 = AbstractC72046XLm.A0h(A0i4);
            } else {
                linkedHashMap4 = null;
            }
            A0f.A9M("product_ids", linkedHashMap4);
            if (AbstractC166997dE.A1Z(A01.A01(C5I8.A4N), true)) {
                j = 1;
            }
            A0f.A9K("is_igtv", Long.valueOf(j));
            AbstractC72047XLn.A0V(A0f, A01);
            A0f.A9M("carousel_media_product_ids", null);
            AbstractC72048XLo.A0f(A0f, A01);
            AbstractC72046XLm.A12(A0f, A01);
            AbstractC72047XLn.A1R(A0f, A01, num);
            AbstractC72047XLn.A0I(A0f, A01);
            A0f.Cht();
        }
    }
}
