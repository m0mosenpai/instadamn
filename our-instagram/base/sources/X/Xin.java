package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class Xin {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        C0Zx c0Zx;
        LinkedHashMap linkedHashMap4;
        Long l;
        double d;
        C19260xA A00;
        Long A04;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4675));
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            AbstractC72046XLm.A0s(A0f, C5I8.A0Z, A01);
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0C, A01), "ad_id");
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72048XLo.A0X(A0f, C5I8.A5c, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            Integer num = C05F.A0j;
            AbstractC72049XLp.A0H(A0f, A01, num, "sticker_type");
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72048XLo.A0m(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            AbstractC72047XLn.A1I(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            AbstractC72047XLn.A0i(A0f, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            Double d2 = null;
            A0f.AAk("header_layout", null);
            AbstractC72047XLn.A0e(A0f, A01);
            AbstractC72046XLm.A18(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72049XLp.A0H(A0f, A01, num, AbstractC111324zv.A00(2445));
            AbstractC72049XLp.A0H(A0f, A01, num, AbstractC111324zv.A00(4563));
            AbstractC72047XLn.A1N(A0f, A01);
            A0f.A8I("current_play_time", AbstractC72048XLo.A0E(C5I8.A1x, A01));
            A0f.A9K("interact_result", AbstractC72046XLm.A0Y(new C11500j9(num, "interact_result"), A01));
            A0f.A9K("sticker_id", AbstractC72046XLm.A0Y(new C11500j9(num, "sticker_id"), A01));
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72047XLn.A0T(A0f, A01);
            AbstractC72047XLn.A14(A0f, A01);
            A0f.A9K("elapsed_time_since_last_item", AbstractC72047XLn.A0D(C5I8.A2Q, A01));
            AbstractC72048XLo.A0k(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0c);
                Iterator it = A0c.iterator();
                while (it.hasNext()) {
                    A0i.add(AnonymousClass010.A0m(AbstractC166987dD.A1B(it)));
                }
                arrayList = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0i));
            } else {
                arrayList = null;
            }
            A0f.AAk("video_to_carousel_cut_secs", arrayList);
            A0f.AAP(AbstractC111324zv.A00(234), AbstractC37300Gc1.A0R(C5I8.A5f, A01));
            AbstractC72049XLp.A0H(A0f, A01, num, AbstractC111324zv.A00(3201));
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72047XLn.A0P(A0f, A01);
            A0f.AAk("sponsor_tag_ids", (List) AbstractC72047XLn.A06(A0f, A01));
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            A0f.A9K("media_dwell_time", AbstractC72047XLn.A0D(C5I8.A5H, A01));
            A0f.A9K("media_time_elapsed", AbstractC72047XLn.A0D(C5I8.A5a, A01));
            A0f.A9K("media_time_paused", AbstractC72047XLn.A0D(C5I8.A5V, A01));
            A0f.A9K("media_time_remaining", AbstractC72047XLn.A0D(C5I8.A5b, A01));
            A0f.A9K("media_time_to_load", AbstractC72047XLn.A0D(C5I8.A5S, A01));
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72046XLm.A1B(A0f, A01);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it2);
                    if (A1B != null) {
                        l4 = AbstractC25228BEl.A13(A1B);
                        l5 = AbstractC25228BEl.A13(A1B);
                    } else {
                        l4 = null;
                        l5 = null;
                    }
                    AbstractC166997dE.A1R(l4, l5, A0i2);
                }
                linkedHashMap = AbstractC72046XLm.A0h(A0i2);
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("product_ids", linkedHashMap);
            AbstractC72047XLn.A1R(A0f, A01, num);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i3 = AbstractC167007dF.A0i(A0e);
                Iterator it3 = A0e.iterator();
                while (it3.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(it3);
                    if (A1B2 != null) {
                        l2 = AbstractC25228BEl.A13(A1B2);
                        l3 = AbstractC25228BEl.A13(A1B2);
                    } else {
                        l2 = null;
                        l3 = null;
                    }
                    AbstractC166997dE.A1R(l2, l3, A0i3);
                }
                linkedHashMap2 = AbstractC72046XLm.A0h(A0i3);
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap2);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(C5I8.A8T, A01);
            if (A0c2 != null) {
                linkedHashMap3 = AbstractC166987dD.A1I();
                Iterator it4 = A0c2.iterator();
                while (it4.hasNext()) {
                    C11520jB c11520jB = (C11520jB) it4.next();
                    if (c11520jB != null && (A04 = (A00 = c11520jB.A00()).A04("sticker_id")) != null) {
                        long longValue = A04.longValue();
                        String A05 = A00.A05("sticker_type");
                        if (A05 != null) {
                            C0Zx c0Zx2 = new C0Zx();
                            c0Zx2.A06("sticker_id", String.valueOf(longValue));
                            c0Zx2.A06("sticker_type", A05);
                            linkedHashMap3.put(A04, c0Zx2);
                        }
                    }
                }
            } else {
                linkedHashMap3 = null;
            }
            A0f.A9M("sticker_types", linkedHashMap3);
            AbstractC72046XLm.A16(A0f, A01);
            AbstractC72047XLn.A0u(A0f, A01);
            A0f.A7v(AbstractC111324zv.A00(1037), null);
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C19260xA A002 = A07.A00();
                c0Zx = new C0Zx();
                AbstractC72047XLn.A1Y(c0Zx, A002);
                AbstractC72046XLm.A1M(c0Zx, A002, "caption_doesnt_fit");
                String A052 = A002.A05("caption_font_size");
                LinkedHashMap linkedHashMap5 = null;
                if (A052 != null) {
                    l = AbstractC25228BEl.A13(A052);
                } else {
                    l = null;
                }
                c0Zx.A05("caption_font_size", l);
                c0Zx.A04("caption_height", AbstractC72047XLn.A08(A002, "caption_line_height"));
                c0Zx.A04("caption_line_height", AbstractC72047XLn.A08(A002, "caption_line_height"));
                c0Zx.A05("caption_num_char_showed", AbstractC72047XLn.A0A(A002, "caption_num_char_showed"));
                c0Zx.A05("caption_num_hashtags_showed", AbstractC72047XLn.A0A(A002, "caption_num_hashtags_showed"));
                c0Zx.A05("caption_num_lines_showed", AbstractC72047XLn.A0A(A002, "caption_num_lines_showed"));
                c0Zx.A05("caption_num_lines_total", AbstractC72047XLn.A0A(A002, "caption_num_lines_total"));
                c0Zx.A05("caption_num_mentions_showed", AbstractC72047XLn.A0A(A002, "caption_num_mentions_showed"));
                c0Zx.A04("caption_position_start_x", AbstractC72047XLn.A08(A002, "caption_position_start_x"));
                c0Zx.A04("caption_position_start_y", AbstractC72047XLn.A08(A002, "caption_position_start_y"));
                AbstractC72046XLm.A1L(c0Zx, A002, "caption_text_color");
                c0Zx.A04("caption_width", AbstractC72047XLn.A08(A002, "caption_width"));
                c0Zx.A03("is_caption_fully_displayed", AbstractC72047XLn.A07(A002, "is_caption_fully_displayed"));
                c0Zx.A04("media_height", AbstractC72047XLn.A08(A002, "media_height"));
                c0Zx.A04("media_position_start_x", AbstractC72047XLn.A08(A002, "media_position_start_x"));
                c0Zx.A04("media_position_start_y", AbstractC72047XLn.A08(A002, "media_position_start_y"));
                c0Zx.A04("media_width", AbstractC72047XLn.A08(A002, "media_width"));
                c0Zx.A05("screen_density", AbstractC72047XLn.A0D(C5I8.A7o, A07));
                c0Zx.A05("screen_height", AbstractC72047XLn.A0D(C5I8.A7p, A07));
                c0Zx.A05("screen_width", AbstractC72047XLn.A0D(C5I8.A7q, A07));
                AbstractC72047XLn.A1Z(c0Zx, A002, "background_color_caption");
                AbstractC72046XLm.A1L(c0Zx, A002, "headline_text_showed");
                ArrayList A06 = A002.A06("stickers");
                if (A06 != null) {
                    linkedHashMap5 = AbstractC166987dD.A1I();
                    Iterator it5 = A06.iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        if (next instanceof C11520jB) {
                            C19260xA A003 = ((C11520jB) next).A00();
                            C0Zx c0Zx3 = new C0Zx();
                            Double A02 = A003.A02("center_x");
                            double d3 = -1.0d;
                            if (A02 != null) {
                                d = A02.doubleValue();
                            } else {
                                d = -1.0d;
                            }
                            AbstractC72046XLm.A1O(c0Zx3, "center_x", d);
                            AbstractC72046XLm.A1O(c0Zx3, "center_y", AbstractC72049XLp.A00(A003, "center_y"));
                            AbstractC72046XLm.A1O(c0Zx3, IgReactMediaPickerNativeModule.HEIGHT, AbstractC72049XLp.A00(A003, IgReactMediaPickerNativeModule.HEIGHT));
                            AbstractC72046XLm.A1O(c0Zx3, "rotation", AbstractC72049XLp.A00(A003, "rotation"));
                            AbstractC72046XLm.A1O(c0Zx3, "scale_x", AbstractC72049XLp.A00(A003, "scale_x"));
                            AbstractC72046XLm.A1O(c0Zx3, "scale_y", AbstractC72049XLp.A00(A003, "scale_y"));
                            long j = -1;
                            AbstractC72046XLm.A1P(c0Zx3, "screen_density", AbstractC31178DnM.A03(A003.A04("screen_density")));
                            AbstractC72046XLm.A1P(c0Zx3, "screen_height", AbstractC31178DnM.A03(A003.A04("screen_height")));
                            Long A042 = A003.A04("screen_width");
                            if (A042 != null) {
                                j = A042.longValue();
                            }
                            AbstractC72046XLm.A1P(c0Zx3, "screen_width", j);
                            String A053 = A003.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A053 == null) {
                                A053 = "-1";
                            }
                            c0Zx3.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A053);
                            Double A022 = A003.A02(IgReactMediaPickerNativeModule.WIDTH);
                            if (A022 != null) {
                                d3 = A022.doubleValue();
                            }
                            AbstractC72046XLm.A1O(c0Zx3, IgReactMediaPickerNativeModule.WIDTH, d3);
                            linkedHashMap5.put(0L, c0Zx3);
                        }
                    }
                }
                c0Zx.A08("stickers", linkedHashMap5);
                AbstractC72046XLm.A1L(c0Zx, A002, "template_id");
                AbstractC72046XLm.A1L(c0Zx, A002, "frame_front_color_bottom");
                AbstractC72046XLm.A1L(c0Zx, A002, "frame_front_color_top");
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "media_layout");
            AbstractC72047XLn.A1P(A0f, A01);
            A0f.AAQ(null, "toolbar_layout");
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractCollection A0c3 = AbstractC72046XLm.A0c(C5I8.A17, A01);
            if (A0c3 != null) {
                linkedHashMap4 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0c3));
                Iterator it6 = A0c3.iterator();
                while (it6.hasNext()) {
                    AbstractC72048XLo.A1Y(it6, linkedHashMap4);
                }
            } else {
                linkedHashMap4 = null;
            }
            A0f.A9M("carousel_transformation_cards", linkedHashMap4);
            A0f.A9K("carousel_transformation_type", null);
            if (AbstractC72046XLm.A0Z(C5I8.A6A, A01) != null) {
                d2 = Double.valueOf(r0.longValue());
            }
            AbstractC72046XLm.A1J(A0f, d2);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72048XLo.A0e(A0f, A01);
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
