package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xig, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72628Xig {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        String str;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Double d;
        Long l;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        Double d2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_brand_profile");
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            AbstractC72047XLn.A0W(A0f, A01);
            A0f.AAP("from", AbstractC37300Gc1.A0R(C5I8.A30, A01));
            AbstractC72047XLn.A1M(A0f, A01);
            A0f.AAP("url", AbstractC37300Gc1.A0R(C5I8.A9g, A01));
            A0f.AAP("source_of_tapping", AbstractC37300Gc1.A0R(C5I8.A8I, A01));
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72048XLo.A0o(A0f, A01);
            Serializable A012 = A01.A01(C5I8.A9N);
            Long l2 = null;
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = null;
            }
            A0f.AAP("top_followers_count", str);
            AbstractC72047XLn.A0w(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72047XLn.A0U(A0f, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72046XLm.A0s(A0f, C5I8.A0Z, A01);
            C11500j9 c11500j9 = C5I8.A5c;
            AbstractC72046XLm.A0r(A0f, c11500j9, A01);
            A0f.A9K("ad_id", AbstractC72047XLn.A0C(C5I8.A0B, A01));
            A0f.A7v("is_unpublished", AbstractC72046XLm.A0S(C5I8.A4z, A01));
            AbstractC72048XLo.A0V(A0f, C5I8.A93, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72048XLo.A14(A0f, A01, "inventory_source", AbstractC37300Gc1.A0R(C5I8.A3r, A01));
            AbstractC72047XLn.A1B(A0f, A01);
            AbstractC72047XLn.A1G(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            AbstractC72047XLn.A0K(A0f, A01);
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72048XLo.A12(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0I, A01), "ad_position_from_server");
            C11500j9 c11500j92 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j92, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0L(A0f, A01);
            AbstractC72047XLn.A17(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72048XLo.A0i(A0f, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72047XLn.A0e(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            A0f.A9M("header_layout", null);
            AbstractC72047XLn.A0u(A0f, A01);
            AbstractC72047XLn.A0i(A0f, A01);
            A0f.AAQ(null, "toolbar_layout");
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72046XLm.A0w(A0f, c11500j92, A01);
            A0f.A9M("sticker_types", null);
            AbstractC72047XLn.A0P(A0f, A01);
            AbstractCollection abstractCollection = (AbstractCollection) AbstractC72047XLn.A06(A0f, A01);
            if (abstractCollection != null) {
                linkedHashMap = AbstractC25225BEi.A18(AbstractC72047XLn.A00(abstractCollection));
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    Long valueOf = Long.valueOf(MSY.A07(it));
                    linkedHashMap.put(valueOf, valueOf);
                }
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("sponsor_tag_ids", linkedHashMap);
            A0f.A9K("sponsor_id_clicked_on", AbstractC72047XLn.A0E(C5I8.A8K, A01));
            AbstractC72048XLo.A0k(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A17, A01);
            if (A0c != null) {
                linkedHashMap2 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0c));
                Iterator it2 = A0c.iterator();
                while (it2.hasNext()) {
                    AbstractC72048XLo.A1Y(it2, linkedHashMap2);
                }
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("carousel_transformation_cards", linkedHashMap2);
            A0f.A9K("carousel_transformation_type", null);
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c2 != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it3 = A0c2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    String str2 = (String) next;
                    C14360o3.A0B(str2, 0);
                    if (AbstractC003100w.A0k(10, str2) != null) {
                        A1E.add(next);
                    }
                }
                linkedHashMap3 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A1E));
                Iterator it4 = A1E.iterator();
                while (it4.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it4);
                    linkedHashMap3.put(AbstractC25228BEl.A13(A1B), AbstractC72046XLm.A0W(A1B));
                }
            } else {
                linkedHashMap3 = null;
            }
            A0f.A9M("video_to_carousel_cut_secs", linkedHashMap3);
            A0f.AAP("text", AbstractC37300Gc1.A0R(C5I8.A90, A01));
            AbstractC72047XLn.A0J(A0f, A01);
            AbstractC72046XLm.A10(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0E(C5I8.A2c, A01));
            AbstractC72046XLm.A1E(A0f, A01);
            C11500j9 c11500j93 = C5I8.A6A;
            if (AbstractC72046XLm.A0Z(c11500j93, A01) != null) {
                d = Double.valueOf(r0.longValue());
            } else {
                d = null;
            }
            AbstractC72046XLm.A1J(A0f, d);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72046XLm.A1I(A0f, A01);
            C11500j9 c11500j94 = C5I8.A5g;
            if (A01.A01(c11500j94) != null) {
                l = AbstractC25228BEl.A13(AbstractC37300Gc1.A0R(c11500j94, A01));
            } else {
                l = null;
            }
            A0f.A9K("merchant_id", l);
            AbstractC72047XLn.A0V(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72047XLn.A13(A0f, A01);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it5 = A0d.iterator();
                while (it5.hasNext()) {
                    AbstractC72048XLo.A1V(A1E2, it5);
                }
                arrayList = AbstractC001800i.A0U(A1E2);
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                linkedHashMap4 = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    Iterable iterable = (Iterable) A1K.getValue();
                    LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(iterable));
                    for (Object obj : iterable) {
                        A18.put(obj, obj);
                    }
                    linkedHashMap4.put(key, A18);
                }
            } else {
                linkedHashMap4 = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap4);
            AbstractC72048XLo.A0c(A0f, A01);
            A0f.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72047XLn.A0E(C5I8.A9Z, A01));
            AbstractC72047XLn.A1J(A0f, A01);
            AbstractC72047XLn.A19(A0f, A01);
            AbstractC72048XLo.A0e(A0f, A01);
            AbstractC72046XLm.A1H(A0f, A01);
            AbstractC72047XLn.A0s(A0f, A01);
            AbstractC72046XLm.A12(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0E(C5I8.A5C, A01));
            AbstractC72047XLn.A0g(A0f, A01);
            A0f.A9K("counter_id", AbstractC72047XLn.A0E(C5I8.A1g, A01));
            A0f.A9K("counter_sid", AbstractC72047XLn.A0E(C5I8.A1h, A01));
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72046XLm.A15(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                linkedHashMap5 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0e));
                Iterator it6 = A0e.iterator();
                while (it6.hasNext()) {
                    AbstractC72048XLo.A1X(it6, linkedHashMap5);
                }
            } else {
                linkedHashMap5 = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap5);
            A0f.A9K("is_igtv", Long.valueOf(AbstractC37302Gc3.A03(AbstractC166997dE.A1Z(A01.A01(C5I8.A4N), true) ? 1 : 0)));
            AbstractC72047XLn.A0v(A0f, A01);
            AbstractC72047XLn.A0x(A0f, A01);
            A0f.A9K(AbstractC111324zv.A00(4041), AbstractC72047XLn.A0E(C5I8.A0j, A01));
            A0f.A9K("connection_id", AbstractC72047XLn.A0E(C5I8.A1X, A01));
            if (AbstractC72046XLm.A0Z(c11500j93, A01) != null) {
                d2 = Double.valueOf(r0.longValue());
            } else {
                d2 = null;
            }
            A0f.A8I("norialized_feed_position", d2);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72048XLo.A0U(A0f, interfaceC60442pS, A01, AbstractC72046XLm.A0Y(C5I8.A5G, A01), "media_author_id");
            AbstractC72048XLo.A13(A0f, A01, 1L, "is_prod");
            AbstractC72048XLo.A0Z(A0f, A01);
            A0f.A9K("product_id", AbstractC72046XLm.A0Y(C5I8.A6m, A01));
            AbstractC72047XLn.A14(A0f, A01);
            A0f.AAP("log_auditor_session", null);
            AbstractC72046XLm.A0u(A0f, c11500j9, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            A0f.A9K("media_index", AbstractC72046XLm.A0Y(C5I8.A5N, A01));
            A0f.A9K("unseen_reel_size", null);
            AbstractC72046XLm.A0x(A0f, A01);
            A0f.A9M("client_ad_creative_optimization_output", null);
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0E(C5I8.A9e, A01));
            A0f.A9K("seed_ad_id", AbstractC72047XLn.A0E(C5I8.A7w, A01));
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0E(C5I8.A3c, A01));
            AbstractC72048XLo.A11(A0f, A01, AbstractC72047XLn.A0E(C5I8.A2v, A01));
            A0f.A7v("should_navigate_to_profile_and_browse", AbstractC72046XLm.A0S(C5I8.A88, A01));
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0E(C5I8.A5v, A01));
            AbstractC72048XLo.A0n(A0f, A01);
            AbstractC72048XLo.A0j(A0f, A01);
            AbstractC72047XLn.A0I(A0f, A01);
            Number A0Z = AbstractC72046XLm.A0Z(C5I8.A5h, A01);
            if (A0Z != null) {
                l2 = AbstractC25229BEm.A0n(A0Z);
            }
            A0f.A9K(AbstractC111324zv.A00(1110), l2);
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
