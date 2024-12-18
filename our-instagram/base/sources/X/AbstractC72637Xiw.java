package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xiw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72637Xiw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.0Zx] */
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, Long l, Long l2) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        C0Zx c0Zx;
        EnumC37904Gm1 enumC37904Gm1;
        long j;
        ?? r10;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(2567));
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            AbstractC72047XLn.A0d(A0f, A01);
            ArrayList arrayList3 = null;
            A0f.A9K(AbstractC111324zv.A00(5446), null);
            AbstractC72046XLm.A1A(A0f, A01);
            C11500j9 c11500j9 = C5I8.A9J;
            A0f.AAP("topic_cluster_id", AbstractC37300Gc1.A0R(c11500j9, A01));
            A0f.AAP("topic_cluster_title", AbstractC37300Gc1.A0R(C5I8.A9L, A01));
            C11500j9 c11500j92 = C5I8.A9M;
            A0f.AAP("topic_cluster_type", AbstractC37300Gc1.A0R(c11500j92, A01));
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72047XLn.A0f(A0f, A01);
            AbstractC72048XLo.A0l(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72046XLm.A0q(A0f, AbstractC129005sL.A01, A01);
            AbstractC72046XLm.A0p(A0f, AbstractC129005sL.A03, A01);
            AbstractC72046XLm.A17(A0f, A01);
            A0f.AAP("hashtag_feed_type", AbstractC37300Gc1.A0R(C5I8.A3O, A01));
            AbstractC72047XLn.A0v(A0f, A01);
            C11500j9 c11500j93 = C5I8.A0Z;
            AbstractC72046XLm.A0s(A0f, c11500j93, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, "algorithm");
            A0f.AAP("dest_topic_cluster_id", AbstractC37300Gc1.A0R(c11500j9, A01));
            A0f.AAP(AbstractC111324zv.A00(4258), AbstractC37300Gc1.A0R(c11500j92, A01));
            A0f.A9K("duration", AbstractC72047XLn.A0D(C5I8.A2L, A01));
            AbstractC72046XLm.A0o(A0f, c19260xA, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            AbstractC72046XLm.A0o(A0f, c19260xA, "impression_token");
            A0f.AAP("loop_count", null);
            C11500j9 c11500j94 = C5I8.A5c;
            AbstractC72046XLm.A0r(A0f, c11500j94, A01);
            AbstractC72046XLm.A0u(A0f, c11500j94, A01);
            AbstractC72047XLn.A1A(A0f, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            A0f.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72047XLn.A0A(c19260xA, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
            A0f.A9K("visible_item_count", null);
            AbstractC72047XLn.A1F(A0f, A01);
            A0f.AAP("rank_token", AbstractC37300Gc1.A0R(C5I8.A6t, A01));
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72047XLn.A1E(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            C11500j9 c11500j95 = C5I8.A0C;
            AbstractC72046XLm.A0t(A0f, c11500j95, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "ranking_session_id", AbstractC37300Gc1.A0R(C5I8.A6s, A01));
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A0y(A0f, A01);
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            AbstractC72048XLo.A0m(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            C11500j9 c11500j96 = C5I8.A6l;
            AbstractCollection A0c = AbstractC72046XLm.A0c(c11500j96, A01);
            if (A0c != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0c);
                Iterator it = A0c.iterator();
                while (it.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0i);
                }
                arrayList = AbstractC001800i.A0U(A0i);
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            A0f.AAk("mentioned_product_ids", null);
            ArrayList A06 = c19260xA.A06("shared_product_ids");
            if (A06 == null) {
                A06 = null;
            }
            A0f.AAk("shared_product_ids", A06);
            A0f.A9K("product_id", AbstractC72047XLn.A0E(C5I8.A6k, A01));
            C11500j9 c11500j97 = C5I8.A5g;
            A0f.A9K("merchant_id", AbstractC72047XLn.A0E(c11500j97, A01));
            AbstractC72047XLn.A0M(A0f, A01);
            A0f.A7v("can_add_to_bag", c19260xA.A01("can_add_to_bag"));
            AbstractC72047XLn.A1S(A0f, A01, C05F.A0j);
            A0f.AAP("shopping_session_id", AbstractC37300Gc1.A0R(C5I8.A86, A01));
            A0f.AAP("prior_module", AbstractC37300Gc1.A0R(C5I8.A6j, A01));
            A0f.AAP("current_price", null);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A12(A0f, A01);
            AbstractC72048XLo.A0t(A0f, A01);
            AbstractC72046XLm.A10(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0E(C5I8.A2c, A01));
            AbstractC72047XLn.A13(A0f, A01);
            AbstractC72048XLo.A0r(A0f, A01);
            AbstractC72047XLn.A0U(A0f, A01);
            A0f.AAP("log_auditor_session", null);
            A0f.AAQ(null, "search_context");
            A0f.A9K(AbstractC111324zv.A00(4006), null);
            A0f.AAP("source_of_tapping", AbstractC37300Gc1.A0R(C5I8.A8I, A01));
            A0f.A9K("media_index", AbstractC72046XLm.A0Y(C5I8.A5N, A01));
            AbstractC72047XLn.A0N(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            A0f.A7v("is_unpublished", AbstractC72046XLm.A0S(C5I8.A4z, A01));
            AbstractC72047XLn.A1G(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72047XLn.A1U(A0f, A01, "application_state", AbstractC37300Gc1.A0R(C5I8.A0Q, A01));
            C11500j9 c11500j98 = C5I8.A12;
            AbstractC72046XLm.A0w(A0f, c11500j98, A01);
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72048XLo.A0i(A0f, A01);
            AbstractC72047XLn.A0e(A0f, A01);
            A0f.A9K("post_id", AbstractC72047XLn.A0B(C5I8.A6b, A01));
            A0f.A9K("unseen_reel_size", null);
            A0f.A9K("tray_pos_excl_own_story", AbstractC72047XLn.A0E(C5I8.A9W, A01));
            AbstractC72047XLn.A0i(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                linkedHashMap = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0e));
                Iterator it2 = A0e.iterator();
                while (it2.hasNext()) {
                    AbstractC72048XLo.A1X(it2, linkedHashMap);
                }
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap);
            AbstractC72046XLm.A19(A0f, A01);
            AbstractC72046XLm.A0v(A0f, c11500j98, A01);
            AbstractC72047XLn.A0x(A0f, A01);
            A0f.A9K("author_id", AbstractC72047XLn.A0B(C5I8.A0Y, A01));
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(C5I8.A2r, A01);
            if (A0c2 != null) {
                arrayList2 = AbstractC167007dF.A0i(A0c2);
                Iterator it3 = A0c2.iterator();
                while (it3.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it3), arrayList2);
                }
            } else {
                arrayList2 = null;
            }
            A0f.AAk("feed_sticker_media_id", arrayList2);
            AbstractC72047XLn.A0H(A0f, c11500j93, A01);
            AbstractC72048XLo.A0n(A0f, A01);
            A0f.A9K("effect_id", AbstractC72046XLm.A0Y(C5I8.A2P, A01));
            A0f.A9K(AbstractC111324zv.A00(405), null);
            A0f.A9K(AbstractC111324zv.A00(2703), AbstractC72046XLm.A0Y(C5I8.A5I, A01));
            AbstractC72047XLn.A1H(A0f, A01);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0E(C5I8.A5C, A01));
            AbstractC72047XLn.A0S(A0f, A01);
            A0f.A9K("tab_index", AbstractC72046XLm.A0Y(C5I8.A8o, A01));
            A0f.A9K("recs_ix", AbstractC72047XLn.A0A(c19260xA, "recs_ix"));
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72046XLm.A0x(A0f, A01);
            AbstractCollection A0c3 = AbstractC72046XLm.A0c(C5I8.A8T, A01);
            if (A0c3 != null) {
                linkedHashMap2 = AbstractC166987dD.A1I();
                Iterator it4 = A0c3.iterator();
                while (it4.hasNext()) {
                    it4.next();
                    Long A04 = c19260xA.A04("sticker_id");
                    if (A04 != null) {
                        long longValue = A04.longValue();
                        String A05 = c19260xA.A05("sticker_type");
                        if (A05 != null) {
                            C0Zx c0Zx2 = new C0Zx();
                            c0Zx2.A06("sticker_id", String.valueOf(longValue));
                            c0Zx2.A06("sticker_type", A05);
                            linkedHashMap2.put(A04, c0Zx2);
                        }
                    }
                }
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("sticker_types", linkedHashMap2);
            A0f.AAP("audience", AbstractC37300Gc1.A0R(C5I8.A0W, A01));
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72047XLn.A18(A0f, A01);
            AbstractC72047XLn.A1K(A0f, A01);
            A0f.A9K("feed_recs_post_position", AbstractC72046XLm.A0Y(C5I8.A2s, A01));
            AbstractC72046XLm.A12(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, "chaining_feed_session_id");
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72048XLo.A0b(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractCollection abstractCollection = (AbstractCollection) AbstractC72047XLn.A06(A0f, A01);
            if (abstractCollection != null) {
                LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(abstractCollection));
                Iterator it5 = abstractCollection.iterator();
                while (it5.hasNext()) {
                    Long valueOf = Long.valueOf(MSY.A07(it5));
                    A18.put(valueOf, valueOf);
                }
                linkedHashMap3 = AbstractC06930Yk.A03(A18);
            } else {
                linkedHashMap3 = null;
            }
            A0f.A9M("sponsor_tag_ids", linkedHashMap3);
            A0f.AAP("search_session_id", AbstractC37300Gc1.A0R(C5I8.A7v, A01));
            A0f.AAP("query_text", AbstractC37300Gc1.A0R(C5I8.A6p, A01));
            AbstractC72046XLm.A0o(A0f, c19260xA, "entity_page_type");
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            A0f.A9K("sponsor_id_clicked_on", AbstractC72047XLn.A0B(C5I8.A8K, A01));
            AbstractC72047XLn.A15(A0f, A01);
            A0f.AAk("header_layout", null);
            AbstractC72046XLm.A0z(A0f, A01);
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0B(C5I8.A9e, A01));
            A0f.AAP(AbstractC111324zv.A00(396), AbstractC37300Gc1.A0R(C5I8.A2G, A01));
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                linkedHashMap4 = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    Iterable iterable = (Iterable) A1K.getValue();
                    LinkedHashMap A182 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(iterable));
                    for (Object obj : iterable) {
                        A182.put(obj, obj);
                    }
                    linkedHashMap4.put(key, A182);
                }
            } else {
                linkedHashMap4 = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap4);
            AbstractC72046XLm.A0o(A0f, c19260xA, "feed_type");
            A0f.A9K("ad_id_long", AbstractC72046XLm.A0Y(c11500j95, A01));
            AbstractC72047XLn.A0l(A0f, A01);
            A0f.A9M("product_mention_ids", null);
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A87);
            if (c11520jB != null) {
                ?? c0Zx3 = new C0Zx();
                String A0R = AbstractC37300Gc1.A0R(c11500j97, c11520jB);
                if (A0R != null) {
                    j = Long.parseLong(A0R);
                } else {
                    j = 0;
                }
                AbstractC72046XLm.A1P(c0Zx3, "merchant_id", j);
                AbstractCollection A0c4 = AbstractC72046XLm.A0c(c11500j96, c11520jB);
                if (A0c4 != null) {
                    r10 = AbstractC166987dD.A1E();
                    Iterator it6 = A0c4.iterator();
                    while (it6.hasNext()) {
                        AbstractC72048XLo.A1V(r10, it6);
                    }
                } else {
                    r10 = C16930sl.A00;
                }
                c0Zx3.A07("product_ids", r10);
                String A052 = c19260xA.A05("shopping_sticker_id");
                if (A052 == null) {
                    A052 = "";
                }
                c0Zx3.A06("shopping_sticker_id", A052);
                c0Zx = c0Zx3;
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "shopping_sticker_info");
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC43591JPw.A00(188));
            AbstractC72046XLm.A15(A0f, A01);
            A0f.A7v("is_top_post", AbstractC72047XLn.A07(c19260xA, "is_top_post"));
            A0f.A7v("guide_open_status", null);
            AbstractC72047XLn.A19(A0f, A01);
            A0f.A9M("sponsor_ids", null);
            A0f.AAP(AbstractC111324zv.A00(921), null);
            AbstractC72046XLm.A0o(A0f, c19260xA, "checkout_session_id");
            AbstractC72046XLm.A0o(A0f, c19260xA, "full_price");
            A0f.A7v("is_on_sale", null);
            A0f.A9K("product_image_count", null);
            C0Zx c0Zx4 = new C0Zx();
            c0Zx4.A06("search_session_id", null);
            c0Zx4.A06("serp_session_id", null);
            c0Zx4.A06("query_text", null);
            c0Zx4.A06("rank_token", null);
            A0f.AAQ(c0Zx4, "search_context");
            A0f.A9K("barcelona_source_reply_id", l);
            A0f.A9K(AbstractC111324zv.A00(32), l2);
            A0f.AAP(AbstractC111324zv.A00(1347), AbstractC37300Gc1.A0R(C5I8.A9T, A01));
            AbstractCollection A0c5 = AbstractC72046XLm.A0c(C5I8.A9U, A01);
            if (A0c5 != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0c5);
                Iterator it7 = A0c5.iterator();
                while (it7.hasNext()) {
                    Object next = it7.next();
                    EnumC37904Gm1[] values = EnumC37904Gm1.values();
                    int i = 0;
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            enumC37904Gm1 = values[i];
                            if (!C14360o3.A0K(enumC37904Gm1.A00, next)) {
                                i++;
                            }
                        } else {
                            enumC37904Gm1 = null;
                            break;
                        }
                    }
                    A0i2.add(enumC37904Gm1);
                }
                arrayList3 = A0i2;
            }
            A0f.AAk(AbstractC111324zv.A00(1348), arrayList3);
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
