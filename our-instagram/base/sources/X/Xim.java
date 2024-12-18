package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public abstract class Xim {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        String str;
        LinkedHashMap linkedHashMap;
        C0Zx c0Zx;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        String A05;
        Double d;
        LinkedHashMap linkedHashMap6;
        double d2;
        double d3;
        double d4;
        long j;
        double d5;
        double d6;
        double d7;
        long j2;
        long j3;
        Double A0m;
        Long A0k;
        Long A0k2;
        Long A0k3;
        Double A0m2;
        Double A0m3;
        Double A0m4;
        Long A0k4;
        Double A0m5;
        Double A0m6;
        Double A0m7;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_influencer_profile");
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
            Long l = null;
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = null;
            }
            A0f.AAP("top_followers_count", str);
            AbstractC72047XLn.A0w(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0Z, A01), "a_pk");
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72046XLm.A0r(A0f, C5I8.A5c, A01);
            AbstractC72047XLn.A1L(A0f, A01);
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
            AbstractC72046XLm.A0t(A0f, C5I8.A0C, A01);
            A0f.A7v("is_unpublished", AbstractC72046XLm.A0S(C5I8.A4z, A01));
            AbstractC72048XLo.A0V(A0f, C5I8.A93, A01);
            AbstractC72047XLn.A0n(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72046XLm.A16(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "entity_follow_status", AbstractC37300Gc1.A0R(C5I8.A2Z, A01));
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72047XLn.A1G(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72047XLn.A1U(A0f, A01, "carousel_media_id", AbstractC37300Gc1.A0R(C5I8.A10, A01));
            AbstractC72047XLn.A0K(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            C11500j9 c11500j9 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j9, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A17(A0f, A01);
            AbstractC72047XLn.A0L(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72046XLm.A0w(A0f, c11500j9, A01);
            A0f.A9M("header_layout", null);
            AbstractC72047XLn.A0e(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72048XLo.A0i(A0f, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            AbstractC72047XLn.A0u(A0f, A01);
            AbstractC72047XLn.A0i(A0f, A01);
            A0f.AAQ(null, "toolbar_layout");
            AbstractC72047XLn.A0o(A0f, A01);
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C19260xA A00 = A07.A00();
                c0Zx = new C0Zx();
                c0Zx.A04("screen_density", AbstractC72046XLm.A0U(C5I8.A7o, A07));
                c0Zx.A04("screen_height", AbstractC72046XLm.A0U(C5I8.A7p, A07));
                c0Zx.A04("screen_width", AbstractC72046XLm.A0U(C5I8.A7q, A07));
                AbstractC72047XLn.A1a(c0Zx, A07);
                AbstractC72046XLm.A1N(c0Zx, A07);
                String A052 = A00.A05("media_height");
                Long l2 = null;
                if (A052 != null) {
                    d = AnonymousClass010.A0m(A052);
                } else {
                    d = null;
                }
                c0Zx.A04("media_height", d);
                c0Zx.A04("media_width", AbstractC72046XLm.A0T(A00, "media_width"));
                AbstractC72047XLn.A1Y(c0Zx, A00);
                c0Zx.A04("caption_font_size", AbstractC72046XLm.A0T(A00, "caption_font_size"));
                c0Zx.A05("caption_num_char_showed", AbstractC72047XLn.A09(A00, "caption_num_char_showed"));
                c0Zx.A05("caption_num_hashtags_showed", AbstractC72047XLn.A09(A00, "caption_num_hashtags_showed"));
                c0Zx.A05("caption_num_lines_showed", AbstractC72047XLn.A09(A00, "caption_num_lines_showed"));
                c0Zx.A05("caption_num_lines_total", AbstractC72047XLn.A09(A00, "caption_num_lines_total"));
                c0Zx.A05("caption_num_mentions_showed", AbstractC72047XLn.A09(A00, "caption_num_mentions_showed"));
                c0Zx.A04("caption_position_start_x", AbstractC72046XLm.A0T(A00, "caption_position_start_x"));
                c0Zx.A04("caption_position_start_y", AbstractC72046XLm.A0T(A00, "caption_position_start_y"));
                c0Zx.A04("caption_line_height", AbstractC72046XLm.A0T(A00, "caption_line_height"));
                c0Zx.A04("caption_height", AbstractC72046XLm.A0T(A00, "caption_line_height"));
                c0Zx.A04("caption_width", AbstractC72046XLm.A0T(A00, "caption_width"));
                c0Zx.A03("is_caption_fully_displayed", AbstractC72047XLn.A07(A00, "is_caption_fully_displayed"));
                AbstractC72046XLm.A1L(c0Zx, A00, "caption_text_color");
                AbstractC72047XLn.A1Z(c0Zx, A00, "background_color_caption");
                AbstractC72046XLm.A1L(c0Zx, A00, "headline_text_showed");
                c0Zx.A04("media_position_start_x", AbstractC72046XLm.A0T(A00, "media_position_start_x"));
                c0Zx.A04("media_position_start_y", AbstractC72046XLm.A0T(A00, "media_position_start_y"));
                AbstractC72046XLm.A1M(c0Zx, A00, "caption_doesnt_fit");
                ArrayList A06 = A00.A06("stickers");
                if (A06 != null) {
                    linkedHashMap6 = AbstractC166987dD.A1I();
                    Iterator it2 = A06.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof C11520jB) {
                            C19260xA A002 = ((C11520jB) next).A00();
                            C0Zx c0Zx2 = new C0Zx();
                            String A053 = A002.A05("center_x");
                            double d8 = -1.0d;
                            if (A053 != null && (A0m7 = AnonymousClass010.A0m(A053)) != null) {
                                d2 = A0m7.doubleValue();
                            } else {
                                d2 = -1.0d;
                            }
                            AbstractC72046XLm.A1O(c0Zx2, "center_x", d2);
                            String A054 = A002.A05("center_y");
                            if (A054 != null && (A0m6 = AnonymousClass010.A0m(A054)) != null) {
                                d3 = A0m6.doubleValue();
                            } else {
                                d3 = -1.0d;
                            }
                            AbstractC72046XLm.A1O(c0Zx2, "center_y", d3);
                            String A055 = A002.A05(IgReactMediaPickerNativeModule.HEIGHT);
                            if (A055 != null && (A0m5 = AnonymousClass010.A0m(A055)) != null) {
                                d4 = A0m5.doubleValue();
                            } else {
                                d4 = -1.0d;
                            }
                            AbstractC72046XLm.A1O(c0Zx2, IgReactMediaPickerNativeModule.HEIGHT, d4);
                            String A056 = A002.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            long j4 = -1;
                            if (A056 != null && (A0k4 = AbstractC003100w.A0k(10, A056)) != null) {
                                j = A0k4.longValue();
                            } else {
                                j = -1;
                            }
                            AbstractC72046XLm.A1P(c0Zx2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, j);
                            String A057 = A002.A05("rotation");
                            if (A057 != null && (A0m4 = AnonymousClass010.A0m(A057)) != null) {
                                d5 = A0m4.doubleValue();
                            } else {
                                d5 = -1.0d;
                            }
                            AbstractC72046XLm.A1O(c0Zx2, "rotation", d5);
                            String A058 = A002.A05("scale_x");
                            if (A058 != null && (A0m3 = AnonymousClass010.A0m(A058)) != null) {
                                d6 = A0m3.doubleValue();
                            } else {
                                d6 = -1.0d;
                            }
                            AbstractC72046XLm.A1O(c0Zx2, "scale_x", d6);
                            String A059 = A002.A05("scale_y");
                            if (A059 != null && (A0m2 = AnonymousClass010.A0m(A059)) != null) {
                                d7 = A0m2.doubleValue();
                            } else {
                                d7 = -1.0d;
                            }
                            AbstractC72046XLm.A1O(c0Zx2, "scale_y", d7);
                            String A0510 = A002.A05("screen_density");
                            if (A0510 != null && (A0k3 = AbstractC003100w.A0k(10, A0510)) != null) {
                                j2 = A0k3.longValue();
                            } else {
                                j2 = -1;
                            }
                            AbstractC72046XLm.A1P(c0Zx2, "screen_density", j2);
                            String A0511 = A002.A05("screen_height");
                            if (A0511 != null && (A0k2 = AbstractC003100w.A0k(10, A0511)) != null) {
                                j3 = A0k2.longValue();
                            } else {
                                j3 = -1;
                            }
                            AbstractC72046XLm.A1P(c0Zx2, "screen_height", j3);
                            String A0512 = A002.A05("screen_width");
                            if (A0512 != null && (A0k = AbstractC003100w.A0k(10, A0512)) != null) {
                                j4 = A0k.longValue();
                            }
                            AbstractC72046XLm.A1P(c0Zx2, "screen_width", j4);
                            String A0513 = A002.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A0513 == null) {
                                A0513 = "-1";
                            }
                            c0Zx2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0513);
                            String A0514 = A002.A05(IgReactMediaPickerNativeModule.WIDTH);
                            if (A0514 != null && (A0m = AnonymousClass010.A0m(A0514)) != null) {
                                d8 = A0m.doubleValue();
                            }
                            AbstractC72046XLm.A1O(c0Zx2, IgReactMediaPickerNativeModule.WIDTH, d8);
                            linkedHashMap6.put(0L, c0Zx2);
                        }
                    }
                } else {
                    linkedHashMap6 = null;
                }
                c0Zx.A08("stickers", linkedHashMap6);
                AbstractC72046XLm.A1L(c0Zx, A00, "template_id");
                c0Zx.A05("has_headline", AbstractC72047XLn.A09(A00, "has_headline"));
                c0Zx.A03("media_is_visible", AbstractC72047XLn.A07(A00, "media_is_visible"));
                c0Zx.A05("auto_cropping_height", AbstractC72047XLn.A09(A00, "auto_cropping_height"));
                c0Zx.A05("auto_cropping_start_x_position", AbstractC72047XLn.A09(A00, "auto_cropping_start_x_position"));
                c0Zx.A05("auto_cropping_start_y_position", AbstractC72047XLn.A09(A00, "auto_cropping_start_y_position"));
                String A0515 = A00.A05("auto_cropping_width");
                if (A0515 != null) {
                    l2 = AbstractC003100w.A0k(10, A0515);
                }
                c0Zx.A05("auto_cropping_width", l2);
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "media_layout");
            AbstractC72047XLn.A0P(A0f, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72048XLo.A0k(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                linkedHashMap2 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0c));
                Iterator it3 = A0c.iterator();
                while (it3.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it3);
                    linkedHashMap2.put(AbstractC25228BEl.A13(A1B), AbstractC72046XLm.A0W(A1B));
                }
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("video_to_carousel_cut_secs", linkedHashMap2);
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(C5I8.A8T, A01);
            if (A0c2 != null) {
                linkedHashMap3 = AbstractC166987dD.A1I();
                Iterator it4 = A0c2.iterator();
                while (it4.hasNext()) {
                    C19260xA A003 = ((C11520jB) it4.next()).A00();
                    Long A04 = A003.A04("sticker_id");
                    if (A04 != null && (A05 = A003.A05("sticker_type")) != null) {
                        C0Zx c0Zx3 = new C0Zx();
                        c0Zx3.A05("sticker_id", A04);
                        c0Zx3.A06("sticker_type", A05);
                        linkedHashMap3.put(A04, c0Zx3);
                    }
                }
            } else {
                linkedHashMap3 = null;
            }
            A0f.A9M("sticker_types", linkedHashMap3);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractCollection A0c3 = AbstractC72046XLm.A0c(C5I8.A17, A01);
            if (A0c3 != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it5 = A0c3.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    String str2 = (String) next2;
                    C14360o3.A0B(str2, 0);
                    if (AbstractC003100w.A0k(10, str2) != null) {
                        A1E.add(next2);
                    }
                }
                linkedHashMap4 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A1E));
                Iterator it6 = A1E.iterator();
                while (it6.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(it6);
                    linkedHashMap4.put(AbstractC25228BEl.A13(A1B2), A1B2);
                }
            } else {
                linkedHashMap4 = null;
            }
            A0f.A9M("carousel_transformation_cards", linkedHashMap4);
            A0f.A9K("carousel_transformation_type", null);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72046XLm.A10(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0E(C5I8.A2c, A01));
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72047XLn.A13(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72048XLo.A0f(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                linkedHashMap5 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0e));
                Iterator it7 = A0e.iterator();
                while (it7.hasNext()) {
                    AbstractC72048XLo.A1X(it7, linkedHashMap5);
                }
            } else {
                linkedHashMap5 = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap5);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72048XLo.A0U(A0f, interfaceC60442pS, A01, AbstractC72046XLm.A0Y(C5I8.A5G, A01), "media_author_id");
            AbstractC72048XLo.A13(A0f, A01, 1L, "is_prod");
            AbstractC72048XLo.A0Z(A0f, A01);
            AbstractC72047XLn.A14(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            A0f.A9K("seed_ad_id", AbstractC72047XLn.A0E(C5I8.A7w, A01));
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0E(C5I8.A3c, A01));
            AbstractC72048XLo.A11(A0f, A01, AbstractC72047XLn.A0E(C5I8.A2v, A01));
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5v, A01);
            if (A0R != null) {
                l = AbstractC003100w.A0k(10, A0R);
            }
            A0f.A9K("multi_ads_first_ad_id", l);
            A0f.A7v(AbstractC111324zv.A00(1055), AbstractC72046XLm.A0S(C5I8.A4X, A01));
            AbstractC72048XLo.A0j(A0f, A01);
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
