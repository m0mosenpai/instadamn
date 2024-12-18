package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.354, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass354 implements InterfaceC64122vX {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C61382r1 A02;
    public final C1M1 A03;
    public final C28091Xn A04;
    public final String A05;

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ Object AGl(C82383m1 c82383m1, Object obj, Object obj2, String str) {
        C11520jB c11520jB;
        C128215qq c128215qq;
        String str2;
        Long l;
        String str3;
        Long l2;
        String str4;
        Long l3;
        Double d;
        String str5;
        Long l4;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Boolean bool;
        List list;
        Long l5;
        String Bnr;
        Integer BlL;
        int position;
        C38576Gxf c38576Gxf;
        C38321qM c38321qM = (C38321qM) obj;
        C42C c42c = (C42C) obj2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c42c, 1);
        C14360o3.A0B(c82383m1, 2);
        String str15 = this.A05;
        C19280xC c19280xC = null;
        if (C14360o3.A0K(str15, "instagram_ad_carousel_vpvd_imp")) {
            AnonymousClass351 anonymousClass351 = AnonymousClass350.A08;
            InterfaceC60442pS interfaceC60442pS = this.A01;
            UserSession userSession = this.A00;
            C75113Zb c75113Zb = c42c.A01;
            c19280xC = anonymousClass351.A00(userSession, c38321qM, interfaceC60442pS, c75113Zb, this.A03, c82383m1, str15, str);
            C38321qM A1e = c38321qM.A1e(0);
            int i = c42c.A00;
            C38321qM A1e2 = c38321qM.A1e(i);
            if (A1e != null && A1e2 != null) {
                c19280xC.A08(Integer.valueOf(c38321qM.A0p()), "carousel_size");
                c19280xC.A0C("carousel_cover_media_id", A1e.getId());
                c19280xC.A0C("carousel_media_id", A1e2.getId());
                c19280xC.A08(Integer.valueOf(A1e2.BRp().A00), "carousel_m_t");
                c19280xC.A08(Integer.valueOf(i), "carousel_index");
                String BPW = c38321qM.A0C.BPW();
                if (BPW != null) {
                    c19280xC.A0C("main_feed_carousel_starting_media_id", BPW);
                }
                C28091Xn c28091Xn = this.A04;
                if (A1e2.A2u() != null) {
                    c19280xC.A09("client_sub_impression", Boolean.valueOf(!c28091Xn.A02(r0)));
                    if (C18U.A06(C06090Tz.A05, userSession, 36312114536776619L)) {
                        c19280xC.A08(Integer.valueOf(c75113Zb.A02()), "media_loading_progress");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (c38321qM.CdW() && (c38576Gxf = c38321qM.A0B) != null) {
                c19280xC.A09("is_multi_ads", true);
                c19280xC.A08(Integer.valueOf(c38576Gxf.A00), "multi_ads_type");
                c19280xC.A0C("multi_ads_unit_id", c38576Gxf.A01);
                if (!c38576Gxf.A04) {
                    c19280xC.A0C("hscroll_seed_ad_id", c38576Gxf.A03);
                }
            }
        } else if (C14360o3.A0K(str15, "instagram_organic_carousel_vpvd_imp")) {
            InterfaceC60442pS interfaceC60442pS2 = this.A01;
            UserSession userSession2 = this.A00;
            C75113Zb c75113Zb2 = c42c.A01;
            C1M1 c1m1 = this.A03;
            C61382r1 c61382r1 = this.A02;
            int i2 = c42c.A00;
            C28091Xn c28091Xn2 = this.A04;
            C12210kP c12210kP = new C12210kP(userSession2);
            c12210kP.A00 = interfaceC60442pS2;
            c12210kP.A01(C12180kM.A03);
            C18920wW A00 = c12210kP.A00();
            C17050sx A01 = AbstractC09440dt.A01(new C50158MDl(userSession2, 15));
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "instagram_organic_carousel_vpvd_imp");
            if (A002.isSampled()) {
                C38321qM A1e3 = c38321qM.A1e(0);
                C38321qM A1e4 = c38321qM.A1e(i2);
                if (A1e4 != null && !A1e4.A5s()) {
                    if (interfaceC60442pS2 instanceof AnonymousClass309) {
                        c11520jB = ((AnonymousClass309) interfaceC60442pS2).E6Q(c38321qM);
                    } else {
                        c11520jB = null;
                    }
                    if (c38321qM.A3S(true) != null && (!r0.isEmpty())) {
                        c128215qq = C128205qp.A04(c38321qM);
                    } else {
                        c128215qq = null;
                    }
                    C30W c30w = new C30W(userSession2, c1m1);
                    if (c11520jB == null || (str2 = (String) c11520jB.A01(C5I8.A9J)) == null || str2.length() == 0) {
                        InterfaceC88353wq B3J = c38321qM.A0C.B3J();
                        if (B3J != null) {
                            str2 = B3J.BIy();
                        } else {
                            str2 = null;
                        }
                    }
                    String A05 = C38801rC.A05(A1e4.getId());
                    A002.A8I("max_duration_ms", Double.valueOf(c82383m1.A04));
                    A002.A9K("carousel_index", Long.valueOf(i2));
                    A002.AAP("inventory_source", c38321qM.A0C.BJN());
                    A002.AAP("tracking_token", AbstractC82633mR.A0E(userSession2, c38321qM, interfaceC60442pS2));
                    if (c75113Zb2.A0p() && (position = c75113Zb2.getPosition()) != -1) {
                        l = Long.valueOf(position);
                    } else {
                        l = null;
                    }
                    A002.A9K("m_ix", l);
                    String id = c38321qM.getId();
                    if (id != null) {
                        String A04 = C38801rC.A04(id);
                        C14360o3.A0B(A04, 0);
                        A002.A9K("media_author_id", AbstractC003100w.A0k(10, A04));
                        A002.AAP("ranking_session_id", c1m1.getSessionId());
                        if (c61382r1 != null) {
                            str3 = c61382r1.A00;
                        } else {
                            str3 = null;
                        }
                        A002.AAP("feed_session_id", str3);
                        C3XK B5f = c38321qM.A0C.B5f();
                        if (B5f != null && (BlL = B5f.BlL()) != null) {
                            l2 = Long.valueOf(BlL.intValue());
                        } else {
                            l2 = null;
                        }
                        A002.A9K("sub_vpvd_reason_server", l2);
                        if (c11520jB != null) {
                            str4 = (String) c11520jB.A01(C5I8.A1C);
                        } else {
                            str4 = null;
                        }
                        A002.AAP("chaining_session_id", str4);
                        if (c11520jB != null) {
                            l3 = (Long) c11520jB.A01(C5I8.A1A);
                        } else {
                            l3 = null;
                        }
                        A002.A9K("chaining_position", l3);
                        A002.A9K("chaining_seed_author_id", null);
                        A002.A9K("chaining_seed_media_id", null);
                        A002.AAP(AbstractC31187DnW.A02(9, 10, 110), AbstractC82633mR.A0A(c11520jB, c30w));
                        A002.AAP("follow_status", AbstractC82633mR.A0D(userSession2, c38321qM));
                        A002.A9K("media_index", null);
                        A002.A8I("sum_duration_ms", Double.valueOf(c82383m1.A05));
                        if (A1e4.A2u() != null) {
                            A002.A7v("client_sub_impression", Boolean.valueOf(!c28091Xn2.A02(r1)));
                            long j = c82383m1.A02;
                            if (j > 500) {
                                d = Double.valueOf(j);
                            } else {
                                d = null;
                            }
                            A002.A8I("legacy_duration_ms", d);
                            if (A1e3 != null) {
                                str5 = A1e3.getId();
                            } else {
                                str5 = null;
                            }
                            A002.AAP("carousel_cover_media_id", str5);
                            A002.AAP("carousel_media_id", A05);
                            A002.A9K("carousel_media_id_int", AbstractC82733mb.A00(A05));
                            String BPW2 = c38321qM.A0C.BPW();
                            if (BPW2 != null) {
                                l4 = AbstractC003100w.A0k(10, BPW2);
                            } else {
                                l4 = null;
                            }
                            A002.A9K("carousel_starting_media_id", l4);
                            A002.A9K("carousel_container_media_id", null);
                            A002.A9K("carousel_cover_media_id_int", null);
                            A002.A8R(A1e4.BRp().A00(), "carousel_media_type");
                            A002.AAP("delivery_flags", AbstractC77343dK.A00(c38321qM.A0e));
                            A002.A9K("media_loading_progress", Long.valueOf(c75113Zb2.A02()));
                            A002.AAP("topic_cluster_id", str2);
                            if (c11520jB != null) {
                                str6 = (String) c11520jB.A01(C5I8.A9L);
                            } else {
                                str6 = null;
                            }
                            A002.AAP("topic_cluster_title", str6);
                            if (c11520jB != null) {
                                str7 = (String) c11520jB.A01(C5I8.A9M);
                            } else {
                                str7 = null;
                            }
                            A002.AAP("topic_cluster_type", str7);
                            if (c11520jB != null) {
                                str8 = (String) c11520jB.A01(C5I8.A9I);
                            } else {
                                str8 = null;
                            }
                            A002.AAP("topic_cluster_debug_info", str8);
                            A002.AAP("mezql_token", c38321qM.A0C.getMezqlToken());
                            A002.AAP("hashtag_follow_status", AbstractC82633mR.A0B(c11520jB, c38321qM));
                            A002.A9K("hashtag_id", AbstractC82633mR.A04(c11520jB, c38321qM));
                            A002.AAP("hashtag_name", AbstractC82633mR.A0C(c11520jB, c38321qM));
                            A002.AAP("nav_chain", str);
                            if (c11520jB != null) {
                                str9 = (String) c11520jB.A01(AbstractC128995sK.A06);
                            } else {
                                str9 = null;
                            }
                            A002.AAP("entity_type", str9);
                            A002.A9K("entity_id", AbstractC82633mR.A02(c11520jB));
                            if (c11520jB != null) {
                                str10 = (String) c11520jB.A01(AbstractC128995sK.A02);
                            } else {
                                str10 = null;
                            }
                            A002.AAP("entity_name", str10);
                            if (c11520jB != null) {
                                str11 = (String) c11520jB.A01(AbstractC128995sK.A04);
                            } else {
                                str11 = null;
                            }
                            A002.AAP("entity_page_name", str11);
                            A002.A9K("entity_page_id", AbstractC82633mR.A03(c11520jB));
                            if (c11520jB != null) {
                                str12 = (String) c11520jB.A01(AbstractC128225qr.A00);
                            } else {
                                str12 = null;
                            }
                            A002.AAP("media_thumbnail_section", str12);
                            if (c11520jB != null) {
                                str13 = (String) c11520jB.A01(AbstractC37486Gf4.A00);
                            } else {
                                str13 = null;
                            }
                            A002.AAP("collection_id", str13);
                            if (c11520jB != null) {
                                str14 = (String) c11520jB.A01(AbstractC37486Gf4.A01);
                            } else {
                                str14 = null;
                            }
                            A002.AAP("collection_name", str14);
                            A002.AAP("action", AbstractC82633mR.A0F(c38321qM));
                            A002.AAQ(null, "location_info");
                            A002.AAP("module_name", null);
                            A002.AAP("source_of_like", null);
                            A002.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
                            A002.AAP("feed_request_id", c38321qM.A0R);
                            int i3 = c75113Zb2.A0W;
                            Long l6 = null;
                            if (Integer.valueOf(i3) != null && i3 != -1) {
                                l6 = Long.valueOf(i3);
                            }
                            A002.A9K("recs_ix", l6);
                            A002.A9K("product_id", null);
                            A002.A9K("merchant_id", null);
                            if (c128215qq != null) {
                                bool = c128215qq.A01;
                            } else {
                                bool = null;
                            }
                            A002.A7v("is_checkout_enabled", bool);
                            A002.A7v("can_add_to_bag", null);
                            if (c128215qq != null) {
                                list = c128215qq.A03;
                            } else {
                                list = null;
                            }
                            A002.AAk("product_ids", list);
                            A002.AAk("drop_product_ids", null);
                            A002.AAk("shared_product_ids", null);
                            A002.A7v("is_user_following_merchant", null);
                            A002.A9M("product_merchant_ids", null);
                            A002.A9K("reel_size", null);
                            A002.A9K("reel_position", null);
                            A002.A9K("tray_position", null);
                            A002.A9K("reel_viewer_position", null);
                            A01.getValue();
                            A002.AAP("direct_reshare_hub_session_id", null);
                            C0Zx c0Zx = new C0Zx();
                            c0Zx.A05("view_height", Long.valueOf(c82383m1.A00));
                            c0Zx.A05("view_width", Long.valueOf(c82383m1.A01));
                            c0Zx.A03("is_paged", Boolean.valueOf(AbstractC126515nm.A00(c75113Zb2)));
                            c0Zx.A03("motion_tilt", false);
                            A002.AAQ(c0Zx, "view_metadata");
                            JML Bns = c38321qM.A0C.Bns();
                            if (Bns != null && (Bnr = Bns.Bnr()) != null) {
                                l5 = AbstractC003100w.A0k(10, Bnr);
                            } else {
                                l5 = null;
                            }
                            A002.A9K("repost_id", l5);
                            A002.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                            A002.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                            A002.AAP("device_fold_orientation", AbstractC82673mV.A00);
                            A002.AAP("device_fold_state", AbstractC82683mW.A00);
                            A002.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                            A002.Cht();
                            return null;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return c19280xC;
    }

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ C19280xC AMA(Object obj) {
        C19280xC c19280xC = (C19280xC) obj;
        C14360o3.A0B(c19280xC, 0);
        return c19280xC;
    }

    public AnonymousClass354(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C61382r1 c61382r1, C1M1 c1m1, C28091Xn c28091Xn, String str) {
        this.A01 = interfaceC60442pS;
        this.A04 = c28091Xn;
        this.A05 = str;
        this.A00 = userSession;
        this.A03 = c1m1;
        this.A02 = c61382r1;
    }
}
