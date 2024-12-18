package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Xis, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72633Xis {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0Zx] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0Ai] */
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ) {
        double d;
        long j;
        long j2;
        ?? r2;
        boolean z;
        Long l;
        double d2;
        Long A0j;
        ?? A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4682));
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            Number A0Z = AbstractC72046XLm.A0Z(C5I8.A9E, A01);
            if (A0Z != null) {
                d = A0Z.longValue();
            } else {
                d = 0.0d;
            }
            A0f.A8I("timespent", Double.valueOf(d));
            long j3 = -1;
            A0f.A9K("reel_position", Long.valueOf(AbstractC31178DnM.A03(AbstractC72046XLm.A0Z(C5I8.A7X, A01))));
            A0f.A9K("reel_size", Long.valueOf(AbstractC31178DnM.A03(AbstractC72046XLm.A0Z(C5I8.A7Y, A01))));
            Number A0Z2 = AbstractC72046XLm.A0Z(C5I8.A7y, A01);
            if (A0Z2 != null) {
                j3 = A0Z2.longValue();
            }
            A0f.A9K("segment_index", Long.valueOf(j3));
            long j4 = 0;
            A0f.A9K("a_pk", Long.valueOf(AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A0Z, A01))));
            String A0R = AbstractC37300Gc1.A0R(C5I8.A0B, A01);
            if (A0R != null && (A0j = AbstractC166997dE.A0j(A0R)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            A0f.A9K("ad_id", Long.valueOf(j));
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A2w, A01);
            String str = "";
            if (A0R2 == null) {
                A0R2 = "";
            }
            A0f.AAP("follow_status", A0R2);
            String A0R3 = AbstractC37300Gc1.A0R(C5I8.A5K, A01);
            if (A0R3 == null) {
                A0R3 = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R3);
            AbstractC37301Gc2.A0y(A0f, AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A5c, A01)));
            Number A0Z3 = AbstractC72046XLm.A0Z(C5I8.A93, A01);
            if (A0Z3 != null) {
                j4 = A0Z3.longValue();
            }
            A0f.A9K("m_ts", Long.valueOf(j4));
            String A0R4 = AbstractC37300Gc1.A0R(C5I8.A7W, A01);
            if (A0R4 == null) {
                A0R4 = "";
            }
            A0f.AAP("reel_id", A0R4);
            String A0R5 = AbstractC37300Gc1.A0R(C5I8.A7b, A01);
            if (A0R5 == null) {
                A0R5 = "";
            }
            A0f.AAP("reel_type", A0R5);
            String A0R6 = AbstractC37300Gc1.A0R(C5I8.A8G, A01);
            if (A0R6 == null) {
                A0R6 = "";
            }
            A0f.AAP("source_of_action", A0R6);
            String A0R7 = AbstractC37300Gc1.A0R(C5I8.A9R, A01);
            if (A0R7 == null) {
                A0R7 = "";
            }
            A0f.AAP("tracking_token", A0R7);
            String A0R8 = AbstractC37300Gc1.A0R(C5I8.A7a, A01);
            if (A0R8 == null) {
                A0R8 = "";
            }
            A0f.AAP("tray_session_id", A0R8);
            String A0R9 = AbstractC37300Gc1.A0R(C5I8.A9o, A01);
            if (A0R9 != null) {
                str = A0R9;
            }
            A0f.AAP("viewer_session_id", str);
            Long A0Y = AbstractC72046XLm.A0Y(C5I8.A7e, A01);
            if (A0Y != null) {
                A0f.A9K("reel_viewer_position", A0Y);
            }
            Double A0U = AbstractC72046XLm.A0U(C5I8.A95, A01);
            if (A0U != null) {
                A0f.A8I("time_elapsed", A0U);
            }
            Long A0Y2 = AbstractC72046XLm.A0Y(C5I8.A7x, A01);
            if (A0Y2 != null) {
                A0f.A9K("segment_count", A0Y2);
            }
            String A0R10 = AbstractC37300Gc1.A0R(C5I8.A8U, A01);
            if (A0R10 != null) {
                A0f.AAP("story_ranking_token", A0R10);
            }
            Boolean A0S = AbstractC72046XLm.A0S(C5I8.A51, A01);
            if (A0S != null) {
                A0f.A7v("is_video_to_carousel", A0S);
            }
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9m, A01);
            if (A0c != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0c);
                Iterator it = A0c.iterator();
                while (it.hasNext()) {
                    A0i.add(AbstractC72046XLm.A0W(AbstractC166987dD.A1B(it)));
                }
                A0f.AAk("video_to_carousel_cut_secs", A0i);
            }
            String A0R11 = AbstractC37300Gc1.A0R(C5I8.A43, A01);
            if (A0R11 != null) {
                A0f.AAP("is_coming_from", A0R11);
            }
            Boolean A0S2 = AbstractC72046XLm.A0S(C5I8.A4L, A01);
            if (A0S2 != null) {
                A0f.A7v("is_highlights_sourced", A0S2);
            }
            Long A0Y3 = AbstractC72046XLm.A0Y(C5I8.A84, A01);
            if (A0Y3 != null) {
                A0f.A9K("session_reel_counter", A0Y3);
            }
            Double A0U2 = AbstractC72046XLm.A0U(C5I8.A9A, A01);
            if (A0U2 != null) {
                A0f.A8I("time_remaining", A0U2);
            }
            Long A0Y4 = AbstractC72046XLm.A0Y(C5I8.A0D, A01);
            if (A0Y4 != null) {
                A0f.A9K("ad_inserted_position", A0Y4);
            }
            String A0R12 = AbstractC37300Gc1.A0R(C5I8.A6b, A01);
            if (A0R12 != null) {
                A0f.AAP("post_id", A0R12);
            }
            ArrayList A06 = c19260xA.A06("attribution_type");
            if (A06 != null) {
                A0f.AAk("attribution_type", A06);
            }
            Boolean A012 = c19260xA.A01("has_translation");
            if (A012 != null) {
                A0f.A7v("has_translation", A012);
            }
            Long A0Y5 = AbstractC72046XLm.A0Y(C5I8.A0I, A01);
            if (A0Y5 != null) {
                A0f.A9K("ad_position_from_server", A0Y5);
            }
            Long A0Y6 = AbstractC72046XLm.A0Y(C5I8.A7Z, A01);
            if (A0Y6 != null) {
                A0f.A9K("reel_start_position", A0Y6);
            }
            String A0R13 = AbstractC37300Gc1.A0R(C5I8.A7f, A01);
            if (A0R13 != null) {
                A0f.AAP("release_channel", A0R13);
            }
            Long A0Y7 = AbstractC72046XLm.A0Y(C5I8.A9P, A01);
            if (A0Y7 != null) {
                A0f.A9K("top_liker_count", A0Y7);
            }
            Double A0U3 = AbstractC72046XLm.A0U(C5I8.A2Q, A01);
            if (A0U3 != null) {
                A0f.A8I("elapsed_time_since_last_item", A0U3);
            }
            Boolean A0S3 = AbstractC72046XLm.A0S(C5I8.A3u, A01);
            if (A0S3 != null) {
                A0f.A7v("is_acp_delivered", A0S3);
            }
            Number A0Z4 = AbstractC72046XLm.A0Z(C5I8.A20, A01);
            if (A0Z4 != null) {
                A0f.A9K("dark_mode_state", AbstractC25229BEm.A0n(A0Z4));
            }
            Long A0Y8 = AbstractC72046XLm.A0Y(C5I8.A4C, A01);
            if (A0Y8 != null) {
                A0f.A9K("is_dark_mode", A0Y8);
            }
            String A0R14 = AbstractC37300Gc1.A0R(C5I8.A00, A01);
            if (A0R14 != null) {
                A0f.AAP("action", A0R14);
            }
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C19260xA A00 = A07.A00();
                C0Zx c0Zx = new C0Zx();
                Boolean A0S4 = AbstractC72046XLm.A0S(C5I8.A4r, A07);
                if (A0S4 != null) {
                    z = A0S4.booleanValue();
                } else {
                    z = false;
                }
                c0Zx.A00.put("is_showreel_native", Boolean.valueOf(z));
                AbstractC72046XLm.A1M(c0Zx, A00, "caption_doesnt_fit");
                String A05 = A00.A05("caption_font_size");
                ArrayList arrayList = null;
                if (A05 != null) {
                    l = AbstractC003100w.A0k(10, A05);
                } else {
                    l = null;
                }
                c0Zx.A05("caption_font_size", l);
                c0Zx.A04("caption_height", AbstractC72046XLm.A0T(A00, "caption_height"));
                c0Zx.A04("caption_line_height", AbstractC72046XLm.A0T(A00, "caption_line_height"));
                c0Zx.A05("caption_num_char_showed", AbstractC72047XLn.A0A(A00, "caption_num_char_showed"));
                c0Zx.A05("caption_num_lines_showed", AbstractC72047XLn.A0A(A00, "caption_num_lines_showed"));
                c0Zx.A05("caption_num_lines_total", AbstractC72047XLn.A0A(A00, "caption_num_lines_total"));
                c0Zx.A04("caption_position_start_x", AbstractC72047XLn.A08(A00, "caption_position_start_x"));
                c0Zx.A04("caption_position_start_y", AbstractC72047XLn.A08(A00, "caption_position_start_y"));
                c0Zx.A04("caption_width", AbstractC72047XLn.A08(A00, "caption_width"));
                c0Zx.A03("is_caption_fully_displayed", AbstractC72047XLn.A07(A00, "is_caption_fully_displayed"));
                c0Zx.A04("media_height", AbstractC72047XLn.A08(A00, "media_height"));
                c0Zx.A05("media_position_start_x", AbstractC72047XLn.A0A(A00, "media_position_start_x"));
                c0Zx.A04("media_position_start_y", AbstractC72047XLn.A08(A00, "media_position_start_y"));
                c0Zx.A04("media_width", AbstractC72047XLn.A08(A00, "media_width"));
                c0Zx.A05("screen_density", AbstractC72047XLn.A0D(C5I8.A7o, A07));
                c0Zx.A05("screen_height", AbstractC72047XLn.A0D(C5I8.A7p, A07));
                c0Zx.A05("screen_width", AbstractC72047XLn.A0D(C5I8.A7q, A07));
                AbstractC72047XLn.A1Y(c0Zx, A00);
                AbstractC72046XLm.A1L(c0Zx, A00, "caption_text_color");
                c0Zx.A05("num_hashtags_showed", AbstractC72047XLn.A0A(A00, "num_hashtags_showed"));
                c0Zx.A05("num_mentions_showed", AbstractC72047XLn.A0A(A00, "num_mentions_showed"));
                AbstractC72046XLm.A1M(c0Zx, A00, "is_double_logging");
                AbstractC72047XLn.A1Z(c0Zx, A00, "background_color_caption");
                AbstractC72046XLm.A1L(c0Zx, A00, "default_caption");
                AbstractC72046XLm.A1L(c0Zx, A00, "headline_text_showed");
                c0Zx.A05("caption_num_hashtags_showed", AbstractC72047XLn.A0A(A00, "caption_num_hashtags_showed"));
                c0Zx.A05("caption_num_mentions_showed", AbstractC72047XLn.A0A(A00, "caption_num_mentions_showed"));
                ArrayList A062 = A00.A06("stickers");
                if (A062 != null) {
                    arrayList = AbstractC166987dD.A1E();
                    Iterator it2 = A062.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof C11520jB) {
                            C19260xA A002 = ((C11520jB) next).A00();
                            C0Zx c0Zx2 = new C0Zx();
                            Double A02 = A002.A02("center_x");
                            double d3 = -1.0d;
                            if (A02 != null) {
                                d2 = A02.doubleValue();
                            } else {
                                d2 = -1.0d;
                            }
                            AbstractC72046XLm.A1O(c0Zx2, "center_x", d2);
                            AbstractC72046XLm.A1O(c0Zx2, "center_y", AbstractC72049XLp.A00(A002, "center_y"));
                            AbstractC72046XLm.A1O(c0Zx2, IgReactMediaPickerNativeModule.HEIGHT, AbstractC72049XLp.A00(A002, IgReactMediaPickerNativeModule.HEIGHT));
                            long j5 = -1;
                            AbstractC72046XLm.A1P(c0Zx2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, AbstractC31178DnM.A03(A002.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                            AbstractC72046XLm.A1O(c0Zx2, "rotation", AbstractC72049XLp.A00(A002, "rotation"));
                            AbstractC72046XLm.A1O(c0Zx2, "scale_x", AbstractC72049XLp.A00(A002, "scale_x"));
                            AbstractC72046XLm.A1O(c0Zx2, "scale_y", AbstractC72049XLp.A00(A002, "scale_y"));
                            AbstractC72046XLm.A1P(c0Zx2, "screen_density", AbstractC31178DnM.A03(A002.A04("screen_density")));
                            AbstractC72046XLm.A1P(c0Zx2, "screen_height", AbstractC31178DnM.A03(A002.A04("screen_height")));
                            Long A04 = A002.A04("screen_width");
                            if (A04 != null) {
                                j5 = A04.longValue();
                            }
                            AbstractC72046XLm.A1P(c0Zx2, "screen_width", j5);
                            String A052 = A002.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A052 == null) {
                                A052 = "-1";
                            }
                            c0Zx2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A052);
                            Double A022 = A002.A02(IgReactMediaPickerNativeModule.WIDTH);
                            if (A022 != null) {
                                d3 = A022.doubleValue();
                            }
                            AbstractC72046XLm.A1O(c0Zx2, IgReactMediaPickerNativeModule.WIDTH, d3);
                            arrayList.add(c0Zx2);
                        }
                    }
                }
                c0Zx.A07("stickers", arrayList);
                A0f.AAQ(c0Zx, "media_layout");
            }
            ArrayList arrayList2 = (ArrayList) A01.A01(C5I8.A17);
            if (arrayList2 != null) {
                A0f.AAk("carousel_transformation_cards", arrayList2);
            }
            String A0R15 = AbstractC37300Gc1.A0R(C5I8.A3r, A01);
            if (A0R15 != null) {
                A0f.AAP("inventory_source", A0R15);
            }
            String A0R16 = AbstractC37300Gc1.A0R(C5I8.A27, A01);
            if (A0R16 != null) {
                A0f.AAP("delivery_flags", A0R16);
            }
            String A0R17 = AbstractC37300Gc1.A0R(C5I8.A8E, A01);
            if (A0R17 != null) {
                A0f.AAP("feed_request_id", A0R17);
            }
            Boolean A0S5 = AbstractC72046XLm.A0S(C5I8.A4n, A01);
            if (A0S5 != null) {
                A0f.A7v("is_second_channel_enabled", A0S5);
            }
            Boolean A0S6 = AbstractC72046XLm.A0S(C5I8.A4H, A01);
            if (A0S6 != null) {
                A0f.A7v("is_eof", A0S6);
            }
            String A0R18 = AbstractC37300Gc1.A0R(C5I8.A0l, A01);
            if (A0R18 != null) {
                A0f.AAP("byline_text", A0R18);
            }
            String A0R19 = AbstractC37300Gc1.A0R(C5I8.A8J, A01);
            if (A0R19 != null) {
                A0f.AAP("sponsored_label_text", A0R19);
            }
            Long A0Y9 = AbstractC72046XLm.A0Y(C5I8.A8L, A01);
            if (A0Y9 != null) {
                A0f.A9K("sponsor_tag_count", A0Y9);
            }
            ArrayList arrayList3 = (ArrayList) A01.A01(C5I8.A8N);
            if (arrayList3 != null) {
                A0f.AAk("sponsor_tag_ids", arrayList3);
            }
            String A0R20 = AbstractC37300Gc1.A0R(C5I8.A62, A01);
            if (A0R20 != null) {
                A0f.AAP("nav_chain", A0R20);
            }
            Boolean A0S7 = AbstractC72046XLm.A0S(C5I8.A3t, A01);
            if (A0S7 != null) {
                A0f.A7v("is_ad", A0S7);
            }
            C11500j9 c11500j9 = C5I8.A6l;
            AbstractCollection A0c2 = AbstractC72046XLm.A0c(c11500j9, A01);
            if (A0c2 != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0c2);
                Iterator it3 = A0c2.iterator();
                while (it3.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it3), A0i2);
                }
                A0f.AAk("product_ids", A0i2);
            }
            Boolean A0S8 = AbstractC72046XLm.A0S(C5I8.A42, A01);
            if (A0S8 != null) {
                A0f.A7v("is_checkout_enabled", A0S8);
            }
            Boolean A0S9 = AbstractC72046XLm.A0S(C5I8.A4P, A01);
            if (A0S9 != null) {
                A0f.A7v("is_influencer", A0S9);
            }
            Long A0Y10 = AbstractC72046XLm.A0Y(C5I8.A5U, A01);
            if (A0Y10 != null) {
                A0f.A9K("media_owner_id", A0Y10);
            }
            C11500j9 c11500j92 = C5I8.A5g;
            String A0R21 = AbstractC37300Gc1.A0R(c11500j92, A01);
            if (A0R21 != null) {
                A0f.A9K("merchant_id", AbstractC25228BEl.A13(A0R21));
            }
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A87);
            if (c11520jB != null) {
                C19260xA A003 = c11520jB.A00();
                ?? c0Zx3 = new C0Zx();
                String A0R22 = AbstractC37300Gc1.A0R(c11500j92, c11520jB);
                if (A0R22 != null) {
                    j2 = Long.parseLong(A0R22);
                } else {
                    j2 = 0;
                }
                c0Zx3.A05("merchant_id", Long.valueOf(j2));
                AbstractCollection A0c3 = AbstractC72046XLm.A0c(c11500j9, c11520jB);
                if (A0c3 != null) {
                    r2 = AbstractC166987dD.A1E();
                    Iterator it4 = A0c3.iterator();
                    while (it4.hasNext()) {
                        AbstractC72048XLo.A1V(r2, it4);
                    }
                } else {
                    r2 = C16930sl.A00;
                }
                c0Zx3.A07("product_ids", r2);
                String A053 = A003.A05("shopping_sticker_id");
                if (A053 == null) {
                    A053 = "";
                }
                c0Zx3.A06("shopping_sticker_id", A053);
                A0f.AAQ(c0Zx3, "shopping_sticker_info");
            }
            A0f.Cht();
        }
    }
}
