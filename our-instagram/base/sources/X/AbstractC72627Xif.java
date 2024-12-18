package X;

/* renamed from: X.Xif, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72627Xif {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ) {
        C0Zx c0Zx;
        Double d;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_action_failed");
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            long j = 0;
            A0f.A9K("a_pk", Long.valueOf(AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A0Z, A01))));
            String A0R = AbstractC37300Gc1.A0R(C5I8.A2w, A01);
            String str = "";
            if (A0R == null) {
                A0R = "";
            }
            A0f.AAP("follow_status", A0R);
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A30, A01);
            if (A0R2 == null) {
                A0R2 = "";
            }
            A0f.AAP("from", A0R2);
            String A0R3 = AbstractC37300Gc1.A0R(C5I8.A5K, A01);
            if (A0R3 == null) {
                A0R3 = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R3);
            Number A0Z = AbstractC72046XLm.A0Z(C5I8.A5c, A01);
            if (A0Z != null) {
                j = A0Z.longValue();
            }
            AbstractC37301Gc2.A0y(A0f, j);
            String A0R4 = AbstractC37300Gc1.A0R(C5I8.A8G, A01);
            if (A0R4 == null) {
                A0R4 = "";
            }
            A0f.AAP("source_of_action", A0R4);
            String A0R5 = AbstractC37300Gc1.A0R(C5I8.A9R, A01);
            if (A0R5 != null) {
                str = A0R5;
            }
            A0f.AAP("tracking_token", str);
            A0f.AAP("ad_id", AbstractC37300Gc1.A0R(C5I8.A0B, A01));
            A0f.AAP("open_target", null);
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "url", AbstractC37300Gc1.A0R(C5I8.A9g, A01));
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72048XLo.A0a(A0f, A01);
            AbstractC72048XLo.A12(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0z, A01), "carousel_index");
            C11500j9 c11500j9 = C5I8.A12;
            AbstractC72046XLm.A0w(A0f, c11500j9, A01);
            A0f.A7v("supports_cta", null);
            AbstractC72048XLo.A0V(A0f, C5I8.A93, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            A0f.AAP("a_i", AbstractC37300Gc1.A0R(C5I8.A9S, A01));
            C11520jB A07 = AbstractC72046XLm.A07(A01);
            if (A07 != null) {
                C19260xA A00 = A07.A00();
                c0Zx = new C0Zx();
                AbstractC72048XLo.A17(c0Zx, A07);
                AbstractC72047XLn.A1a(c0Zx, A07);
                AbstractC72046XLm.A1N(c0Zx, A07);
                AbstractC72047XLn.A1Y(c0Zx, A00);
                String A05 = A00.A05("caption_font_size");
                Double d2 = null;
                if (A05 != null) {
                    d = AbstractC72046XLm.A0W(A05);
                } else {
                    d = null;
                }
                c0Zx.A04("caption_font_size", d);
                c0Zx.A05("caption_num_char_showed", AbstractC72047XLn.A0A(A00, "caption_num_char_showed"));
                c0Zx.A05("caption_num_hashtags_showed", AbstractC72047XLn.A0A(A00, "caption_num_hashtags_showed"));
                c0Zx.A05("caption_num_lines_showed", AbstractC72047XLn.A0A(A00, "caption_num_lines_showed"));
                c0Zx.A05("caption_num_lines_total", AbstractC72047XLn.A0A(A00, "caption_num_lines_total"));
                c0Zx.A05("caption_num_mentions_showed", AbstractC72047XLn.A0A(A00, "caption_num_mentions_showed"));
                c0Zx.A04("caption_position_start_x", AbstractC72047XLn.A08(A00, "caption_position_start_x"));
                c0Zx.A04("caption_position_start_y", AbstractC72047XLn.A08(A00, "caption_position_start_y"));
                c0Zx.A04("caption_line_height", AbstractC72047XLn.A08(A00, "caption_line_height"));
                c0Zx.A04("caption_height", AbstractC72047XLn.A08(A00, "caption_line_height"));
                c0Zx.A04("caption_width", AbstractC72047XLn.A08(A00, "caption_width"));
                c0Zx.A03("is_caption_fully_displayed", AbstractC72047XLn.A07(A00, "is_caption_fully_displayed"));
                AbstractC72046XLm.A1L(c0Zx, A00, "caption_text_color");
                AbstractC72047XLn.A1Z(c0Zx, A00, "background_color_caption");
                AbstractC72046XLm.A1L(c0Zx, A00, "headline_text_showed");
                c0Zx.A04("media_height", AbstractC72047XLn.A08(A00, "media_height"));
                String A052 = A00.A05("media_width");
                if (A052 != null) {
                    d2 = AbstractC72046XLm.A0W(A052);
                }
                c0Zx.A04("media_width", d2);
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "media_layout");
            AbstractC72046XLm.A1D(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0B(C5I8.A2c, A01));
            AbstractC72046XLm.A10(A0f, A01);
            AbstractC72047XLn.A13(A0f, A01);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72047XLn.A0f(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72047XLn.A1A(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72047XLn.A1G(A0f, A01);
            A0f.AAP("ad_intent", AbstractC37300Gc1.A0R(C5I8.A0E, A01));
            AbstractC72047XLn.A0J(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72046XLm.A1I(A0f, A01);
            AbstractC72046XLm.A0v(A0f, c11500j9, A01);
            AbstractC72048XLo.A0f(A0f, A01);
            A0f.A7v("incorrect_code_path", null);
            AbstractC72048XLo.A0x(A0f, A01);
            A0f.AAP(AbstractC111324zv.A00(1339), AbstractC37300Gc1.A0R(C5I8.A1Q, A01));
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractC72046XLm.A14(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72048XLo.A0m(A0f, A01);
            A0f.AAP("tray_session_id", AbstractC37300Gc1.A0R(C5I8.A7a, A01));
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            A0f.A9K("merchant_id", AbstractC72047XLn.A0B(C5I8.A5g, A01));
            A0f.A9K("sponsor_tag_count", AbstractC72046XLm.A0Y(C5I8.A8L, A01));
            A0f.A9M("sponsor_tag_ids", null);
            AbstractC72048XLo.A0i(A0f, A01);
            A0f.A9M("product_ids", null);
            AbstractC72046XLm.A1K(A0f, null);
            A0f.A8I("device_height", AbstractC72046XLm.A0U(C5I8.A2A, A01));
            A0f.A8I("device_width", AbstractC72046XLm.A0U(C5I8.A2B, A01));
            A0f.A8I("screen_density", AbstractC72046XLm.A0U(C5I8.A7o, A01));
            A0f.A8I("screen_height", AbstractC72046XLm.A0U(C5I8.A7p, A01));
            A0f.A8I("screen_width", AbstractC72046XLm.A0U(C5I8.A7q, A01));
            AbstractC72047XLn.A1J(A0f, A01);
            AbstractC72047XLn.A19(A0f, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72047XLn.A0s(A0f, A01);
            AbstractC72046XLm.A12(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            A0f.A9M("carousel_media_product_ids", null);
            A0f.A8I("end_x_position", AbstractC72048XLo.A0E(C5I8.A2T, A01));
            A0f.A8I("end_y_position", AbstractC72048XLo.A0E(C5I8.A2U, A01));
            A0f.A8I("start_x_position", AbstractC72048XLo.A0E(C5I8.A8R, A01));
            A0f.A8I("start_y_position", AbstractC72048XLo.A0E(C5I8.A8S, A01));
            A0f.A8I("x_velocity", AbstractC72048XLo.A0E(C5I8.AA0, A01));
            A0f.A8I("y_velocity", AbstractC72048XLo.A0E(C5I8.AA1, A01));
            A0f.A9M("drops_product_ids", null);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72048XLo.A0u(A0f, A01);
            A0f.A9M("video_to_carousel_cut_secs", null);
            A0f.A9K("is_igtv", null);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72047XLn.A0V(A0f, A01);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0B(C5I8.A5C, A01));
            A0f.A9M("tagged_user_ids", null);
            A0f.A9M("carousel_transformation_cards", null);
            A0f.A7v("is_below_eof", null);
            AbstractC72048XLo.A0y(A0f, A01);
            A0f.Cht();
        }
    }
}
