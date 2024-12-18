package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xiu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72635Xiu {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        C4SX c4sx;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap3;
        long j;
        ArrayList arrayList3;
        Long A0k;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_unsave");
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            Boolean A0S = AbstractC72046XLm.A0S(C5I8.A4c, A01);
            if (A0S != null) {
                z = A0S.booleanValue();
            } else {
                z = false;
            }
            A0f.A9T("is_previewable_video_ad", Boolean.valueOf(z));
            Boolean A0S2 = AbstractC72046XLm.A0S(C5I8.A4W, A01);
            if (A0S2 != null) {
                z2 = A0S2.booleanValue();
            } else {
                z2 = false;
            }
            A0f.A9T("is_multi_ads", Boolean.valueOf(z2));
            A0f.A9T("is_below_eof", false);
            C11500j9 c11500j9 = C5I8.A0Z;
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(c11500j9, A01), "a_pk");
            AbstractC72046XLm.A1A(A0f, A01);
            C11500j9 c11500j92 = C5I8.A5c;
            AbstractC72046XLm.A0r(A0f, c11500j92, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "tracking_token", AbstractC37300Gc1.A0R(C5I8.A9R, A01));
            C11500j9 c11500j93 = C5I8.A0C;
            AbstractC72046XLm.A0t(A0f, c11500j93, A01);
            AbstractC72048XLo.A0V(A0f, C5I8.A93, A01);
            A0f.AAP(AbstractC111324zv.A00(5244), AbstractC37300Gc1.A0R(C5I8.A7n, A01));
            AbstractC72047XLn.A0n(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72046XLm.A16(A0f, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72048XLo.A14(A0f, A01, "inventory_source", AbstractC37300Gc1.A0R(C5I8.A3r, A01));
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72048XLo.A12(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0z, A01), "carousel_index");
            C11500j9 c11500j94 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j94, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72048XLo.A0a(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractCollection abstractCollection = (AbstractCollection) AbstractC72047XLn.A06(A0f, A01);
            C0Zx c0Zx = null;
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
            AbstractC72046XLm.A0w(A0f, c11500j94, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            C11500j9 c11500j95 = C5I8.A5g;
            String A0R = AbstractC37300Gc1.A0R(c11500j95, A01);
            if (A0R != null) {
                c4sx = C4SX.A00(A0R);
            } else {
                c4sx = null;
            }
            A0f.AAK(c4sx, "merchant_id");
            C11500j9 c11500j96 = C5I8.A6l;
            AbstractCollection A0c = AbstractC72046XLm.A0c(c11500j96, A01);
            if (A0c != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0c);
                Iterator it2 = A0c.iterator();
                while (it2.hasNext()) {
                    AbstractC72047XLn.A1b(A0i2, it2);
                }
                arrayList = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0i2));
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                LinkedHashMap A0G = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    Iterable<Number> iterable = (Iterable) A1K.getValue();
                    LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(iterable));
                    for (Number number : iterable) {
                        A18.put(Long.valueOf(number.longValue()), Long.valueOf(number.longValue()));
                    }
                    A0G.put(key, AbstractC06930Yk.A03(A18));
                }
                linkedHashMap2 = AbstractC06930Yk.A03(A0G);
            } else {
                linkedHashMap2 = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap2);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                arrayList2 = AbstractC167007dF.A0i(A0e);
                Iterator it3 = A0e.iterator();
                while (it3.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it3), arrayList2);
                }
            } else {
                arrayList2 = null;
            }
            A0f.AAk("tagged_user_ids", arrayList2);
            AbstractC72048XLo.A0y(A0f, A01);
            C11500j9 c11500j97 = C5I8.A5U;
            A0f.A9K("media_owner_id", AbstractC72046XLm.A0Y(c11500j97, A01));
            AbstractC72047XLn.A0d(A0f, A01);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0E(C5I8.A5C, A01));
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72047XLn.A0g(A0f, A01);
            A0f.A9K("counter_id", AbstractC72047XLn.A0E(C5I8.A1g, A01));
            A0f.A9K("counter_sid", AbstractC72047XLn.A0E(C5I8.A1h, A01));
            AbstractC72046XLm.A0q(A0f, C5I8.A3Q, A01);
            AbstractC72046XLm.A17(A0f, A01);
            AbstractC72046XLm.A0p(A0f, C5I8.A3R, A01);
            A0f.A9K("connection_id", AbstractC72047XLn.A0E(C5I8.A1X, A01));
            AbstractC72047XLn.A0v(A0f, A01);
            AbstractC72048XLo.A0e(A0f, A01);
            AbstractC72047XLn.A0x(A0f, A01);
            AbstractC72048XLo.A0f(A0f, A01);
            A0f.A9K("is_igtv", Long.valueOf(AbstractC37302Gc3.A03(AbstractC166997dE.A1Z(A01.A01(C5I8.A4N), true) ? 1 : 0)));
            AbstractC72047XLn.A0P(A0f, A01);
            ArrayList arrayList4 = (ArrayList) A01.A01(C5I8.A2J);
            if (arrayList4 != null) {
                ArrayList A1F = AbstractC166987dD.A1F(arrayList4);
                ArrayList A0i3 = AbstractC167007dF.A0i(A1F);
                Iterator it4 = A1F.iterator();
                while (it4.hasNext()) {
                    AbstractC72048XLo.A1U(A0i3, it4);
                }
                linkedHashMap3 = AbstractC72046XLm.A0h(A0i3);
            } else {
                linkedHashMap3 = null;
            }
            A0f.A9M("drops_product_ids", linkedHashMap3);
            AbstractC72047XLn.A0V(A0f, A01);
            AbstractC72048XLo.A0U(A0f, interfaceC60442pS, A01, AbstractC72046XLm.A0Y(C5I8.A5M, A01), "media_id");
            AbstractC72048XLo.A13(A0f, A01, 1L, "is_prod");
            AbstractC72048XLo.A0Z(A0f, A01);
            A0f.A9K("product_id", AbstractC72047XLn.A0E(C5I8.A6k, A01));
            AbstractC72047XLn.A1E(A0f, A01);
            AbstractC72049XLp.A0F(A0f, c11500j92, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            A0f.A9K("author_id", AbstractC72047XLn.A0E(C5I8.A0Y, A01));
            AbstractC72047XLn.A0H(A0f, c11500j9, A01);
            AbstractC72049XLp.A0G(A0f, c11500j93, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            A0f.AAP("topic_cluster_status", null);
            A0f.A9M("client_ad_creative_optimization_output", null);
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0E(C5I8.A5v, A01));
            AbstractC72047XLn.A0m(A0f, A01);
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0E(C5I8.A3c, A01));
            AbstractC72047XLn.A11(A0f, A01);
            AbstractC72047XLn.A0r(A0f, A01);
            AbstractC72046XLm.A1G(A0f, A01);
            Integer num = C05F.A0j;
            AbstractC72049XLp.A0H(A0f, A01, num, "container_module");
            AbstractC72049XLp.A0H(A0f, A01, num, "contextual_ads_category");
            A0f.A9K("first_hscroll_item_ad_id", AbstractC72047XLn.A0E(C5I8.A2v, A01));
            A0f.A9K("seed_ad_id", AbstractC72047XLn.A0E(C5I8.A7w, A01));
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0E(C5I8.A9e, A01));
            A0f.A9K("media_owner_id_long", AbstractC72046XLm.A0Y(c11500j97, A01));
            A0f.A9K("recs_ix", AbstractC72047XLn.A09(c19260xA, "recs_ix"));
            AbstractC72048XLo.A0r(A0f, A01);
            A0f.AAQ(null, "multi_ads_extra");
            AbstractC72046XLm.A14(A0f, A01);
            A0f.A7v(AbstractC111324zv.A00(456), Boolean.valueOf(C14360o3.A0K(A01.A01(C5I8.A4g), RealtimeSubscription.GRAPHQL_MQTT_VERSION)));
            A0f.AAP("prior_module", AbstractC37300Gc1.A0R(C5I8.A6j, A01));
            AbstractC72047XLn.A19(A0f, A01);
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A87);
            if (c11520jB != null) {
                C19260xA A00 = c11520jB.A00();
                C0Zx c0Zx2 = new C0Zx();
                String A0R2 = AbstractC37300Gc1.A0R(c11500j95, c11520jB);
                if (A0R2 != null && (A0k = AbstractC003100w.A0k(10, A0R2)) != null) {
                    j = A0k.longValue();
                } else {
                    j = -1;
                }
                AbstractC72046XLm.A1P(c0Zx2, "merchant_id", j);
                AbstractCollection A0c2 = AbstractC72046XLm.A0c(c11500j96, c11520jB);
                if (A0c2 != null) {
                    ArrayList A0i4 = AbstractC167007dF.A0i(A0c2);
                    Iterator it5 = A0c2.iterator();
                    while (it5.hasNext()) {
                        AbstractC72047XLn.A1b(A0i4, it5);
                    }
                    arrayList3 = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0i4));
                } else {
                    arrayList3 = null;
                }
                c0Zx2.A07("product_ids", arrayList3);
                String A05 = A00.A05("shopping_sticker_id");
                if (A05 == null) {
                    A05 = "";
                }
                c0Zx2.A06("shopping_sticker_id", A05);
                c0Zx = c0Zx2;
            }
            A0f.AAQ(c0Zx, "shopping_sticker_info");
            AbstractC72047XLn.A0I(A0f, A01);
            A0f.Cht();
        }
    }
}
