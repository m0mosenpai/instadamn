package X;

import android.content.Context;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEventImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145866hj {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final C145826hf A03;
    public final InterfaceC1118853a A04;

    public C145866hj(InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, C145826hf c145826hf, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c18920wW, 2);
        C14360o3.A0B(c145826hf, 3);
        this.A02 = userSession;
        this.A01 = c18920wW;
        this.A03 = c145826hf;
        this.A04 = interfaceC1118853a;
        this.A00 = interfaceC11380iw;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    public final void A00(C84823qW c84823qW, int i, int i2) {
        C145826hf c145826hf;
        Reel reel;
        C41181vS A08;
        int i3;
        String str;
        String str2;
        C145826hf c145826hf2;
        C38321qM c38321qM;
        MoreInfoProductTagType moreInfoProductTagType;
        MoreInfoProductTagType moreInfoProductTagType2;
        String str3;
        InterfaceC107114sH B7j;
        long j;
        Long A0k;
        InterfaceC107114sH B7j2;
        InterfaceC02590Ai A00;
        String str4;
        Long A0k2;
        String moduleName;
        String str5;
        C38321qM c38321qM2;
        long j2;
        Long A0k3;
        ProductSticker productSticker;
        C38321qM c38321qM3;
        C38321qM c38321qM4;
        C38321qM c38321qM5;
        C4SX c4sx;
        C25531Mh c25531Mh;
        Long l;
        String str6;
        String id;
        String str7;
        C8F9 c8f9;
        String str8;
        C41551w4 Aun = this.A04.Aun(c84823qW.A1e);
        if (Aun != null) {
            switch (c84823qW.A12.ordinal()) {
                case 4:
                    if (c84823qW.A0N()) {
                        C41743IeH c41743IeH = c84823qW.A1G;
                        if (c41743IeH != null && (str7 = c41743IeH.A09) != null && str7.startsWith("bloks_tappable_animated_avatar_sticker_id")) {
                            str2 = "avatar_animated_sticker";
                        } else {
                            str2 = "avatar_sticker";
                        }
                        if (c41743IeH != null) {
                            if (c41743IeH.A09 == null) {
                                return;
                            }
                            c145826hf = this.A03;
                            reel = Aun.A0H;
                            A08 = Aun.A08(this.A02);
                            i3 = Aun.A01;
                            str = c41743IeH.A09;
                            if (str == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            c145826hf.A07(reel, A08, str2, str, i3);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    break;
                case 0:
                case 1:
                case 51:
                    C18920wW c18920wW = this.A01;
                    C41181vS A082 = Aun.A08(this.A02);
                    C14360o3.A0B(A082, 1);
                    ALm.A00(c18920wW, EnumC53340Niq.CLICK, EnumC223329tP.CONSUMER_STICKER, A082, c84823qW, A082.BlY(c84823qW.A12));
                    return;
                case Process.SIGTERM /* 15 */:
                    HashtagImpl hashtagImpl = c84823qW.A0l;
                    if (hashtagImpl != null) {
                        C145826hf c145826hf3 = this.A03;
                        String str9 = hashtagImpl.A0D;
                        if (str9 == null) {
                            str9 = "";
                        }
                        c145826hf3.A0H(Aun, c84823qW, null, "hashtag_attempt", str9);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                case 18:
                    c145826hf = this.A03;
                    reel = Aun.A0H;
                    A08 = Aun.A08(this.A02);
                    i3 = Aun.A01;
                    str = c84823qW.A1j;
                    if (str != null) {
                        str2 = "link_web";
                        c145826hf.A07(reel, A08, str2, str, i3);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                case Process.SIGSTOP /* 19 */:
                    C145826hf c145826hf4 = this.A03;
                    Venue A09 = c84823qW.A09();
                    if (A09 != null) {
                        String A02 = A09.A02();
                        C14360o3.A07(A02);
                        String str10 = c84823qW.A1g;
                        C14360o3.A07(str10);
                        c145826hf4.A0N(Aun, null, "location_attempt", A02, str10);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                case 21:
                    C145826hf c145826hf5 = this.A03;
                    C41181vS A083 = Aun.A08(c145826hf5.A06);
                    C38321qM c38321qM6 = A083.A0b;
                    if (c38321qM6 != null) {
                        C37948Gmq c37948Gmq = (C37948Gmq) c145826hf5.A0I.get(A083.CGe());
                        if (c37948Gmq == null) {
                            return;
                        }
                        C18920wW c18920wW2 = c145826hf5.A05;
                        C25531Mh c25531Mh2 = new C25531Mh(c18920wW2.A00(c18920wW2.A00, "instagram_organic_story_media_reshare_attempt"), 308);
                        String str11 = null;
                        if (!((AbstractC02600Aj) c25531Mh2).A00.isSampled()) {
                            return;
                        }
                        Context context = c145826hf5.A04;
                        float A01 = AbstractC13880nE.A01(context, AbstractC13890nF.A01(context));
                        float A012 = AbstractC13880nE.A01(context, AbstractC13890nF.A00(context));
                        float A013 = AbstractC13880nE.A01(context, i);
                        float A014 = AbstractC13880nE.A01(context, i2);
                        C141596ac c141596ac = c37948Gmq.A05;
                        double d = (c141596ac.A0A * c141596ac.A0B) / 1000.0d;
                        String id2 = c38321qM6.getId();
                        if (id2 != null) {
                            c25531Mh2.A0l(id2);
                            c25531Mh2.A0Q("m_t", Long.valueOf(c38321qM6.BRp().A00));
                            Reel reel2 = Aun.A0H;
                            String id3 = reel2.getId();
                            C14360o3.A07(id3);
                            c25531Mh2.A0R("reel_id", id3);
                            c25531Mh2.A0R("tray_session_id", c145826hf5.A0H);
                            c25531Mh2.A0R("viewer_session_id", c145826hf5.A0E.getSessionId());
                            C1NB c1nb = reel2.A0W;
                            if (c1nb != null && (id = c1nb.getId()) != null) {
                                l = AbstractC003100w.A0k(10, id);
                            } else {
                                l = null;
                            }
                            c25531Mh2.A0Q("a_pk", l);
                            ProductType productType = c84823qW.A0n;
                            if (productType != null) {
                                str11 = productType.A00;
                            }
                            c25531Mh2.A0R("tapped_media_product_type", str11);
                            c25531Mh2.A0R("tapped_media_id", c84823qW.A1b);
                            c25531Mh2.A0j("tap");
                            c25531Mh2.A0Q("reel_position", Long.valueOf(c37948Gmq.A00()));
                            c25531Mh2.A0Q("reel_size", Long.valueOf(c37948Gmq.A02.A0O(c37948Gmq.A01).size()));
                            c25531Mh2.A0Q("tray_position", Long.valueOf(c37948Gmq.A04.A0E));
                            c25531Mh2.A0P("start_x_position", Double.valueOf(A013));
                            c25531Mh2.A0P("start_y_position", Double.valueOf(A014));
                            c25531Mh2.A0P("screen_height", Double.valueOf(A012));
                            c25531Mh2.A0P("screen_width", Double.valueOf(A01));
                            c25531Mh2.A0P("time_elapsed", Double.valueOf(d));
                            UpcomingEventImpl upcomingEventImpl = c84823qW.A1B;
                            if (upcomingEventImpl != null) {
                                str6 = upcomingEventImpl.A0B;
                            } else {
                                str6 = c84823qW.A1n;
                            }
                            c25531Mh2.A0R("upcoming_event_id", str6);
                            c25531Mh2.Cht();
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str12 = A083.A0j;
                    String id4 = Aun.A0H.getId();
                    C14360o3.A07(id4);
                    C0w9.A03("ReelViewerLogger", AnonymousClass001.A0u("Missing media ID for reel item: ", str12, ", In reel: ", id4));
                    return;
                case 23:
                    this.A03.A0G(Aun, c84823qW, null, "tag_attempt", i, i2);
                    return;
                case 26:
                    C145826hf c145826hf6 = this.A03;
                    Reel reel3 = Aun.A0H;
                    UserSession userSession = this.A02;
                    c145826hf6.A07(reel3, Aun.A08(userSession), "message_share", "message_share_sticker_id", Aun.A01);
                    C41181vS A084 = Aun.A08(userSession);
                    C14360o3.A0B(A084, 0);
                    C84823qW A002 = AbstractC120715dH.A00(EnumC75383a5.A0p, A084.A0c());
                    if (A002 == null || (c8f9 = A002.A14) == null) {
                        return;
                    }
                    C142846ck A003 = AbstractC147806l5.A00(c145826hf6.A06);
                    int A004 = c8f9.A00();
                    C66645URj c66645URj = c8f9.A0E;
                    if (c66645URj == null || (str8 = c66645URj.A0K) == null) {
                        str8 = "";
                    }
                    c25531Mh = C25531Mh.A0E(A003.A03);
                    if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                        return;
                    }
                    c25531Mh.A0g(Long.valueOf(A003.A02));
                    c25531Mh.A0k("see_channel_tooltip_rendered");
                    c25531Mh.A0j("tap");
                    c25531Mh.A0o("message_snippet");
                    c25531Mh.A0p("story");
                    c25531Mh.A0n(AbstractC147806l5.A01(Integer.valueOf(A004)));
                    c25531Mh.A0r(str8);
                    c25531Mh.Cht();
                    return;
                case 30:
                    C145826hf c145826hf7 = this.A03;
                    UserSession userSession2 = c145826hf7.A06;
                    C41181vS A085 = Aun.A08(userSession2);
                    if (A085.CY4() && (c38321qM3 = A085.A0b) != null && c38321qM3.A63()) {
                        Product A0H = c84823qW.A0H();
                        C38683GzO A03 = C128205qp.A03(userSession2, A0H);
                        long j3 = A03.A00;
                        C4SX c4sx2 = A03.A01;
                        Boolean bool = A03.A04;
                        Long l2 = A03.A07;
                        Long l3 = A03.A06;
                        Boolean bool2 = A03.A03;
                        C128215qq A04 = C128205qp.A04(c38321qM3);
                        List list = A04.A03;
                        Map map = A04.A08;
                        List list2 = A04.A02;
                        List list3 = A04.A04;
                        C26087BgG A022 = C128205qp.A02(c38321qM3, A0H.A0H);
                        String str13 = A022.A03;
                        List list4 = (List) A022.A02;
                        List list5 = (List) A022.A01;
                        Map map2 = (Map) A022.A00;
                        Reel reel4 = Aun.A0H;
                        C18920wW A015 = AbstractC12220kQ.A01(C145826hf.A01(reel4, c145826hf7), userSession2);
                        C25531Mh A016 = C25531Mh.A01(A015);
                        LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4("product_inventory", String.valueOf(l2)), new C09530e4("product_sticker_id", str13), new C09530e4("drops_product_ids", String.valueOf(list2)), new C09530e4("shared_product_ids", String.valueOf(list5)), new C09530e4("sticker_styles", String.valueOf(list4)), new C09530e4("profile_shop_link", String.valueOf(map2)));
                        if (((AbstractC02600Aj) A016).A00.isSampled()) {
                            String str14 = c145826hf7.A02;
                            if (str14 == null) {
                                str14 = "";
                            }
                            A016.A0R("shopping_session_id", str14);
                            A016.A0R("navigation_chain", C1QM.A00.A02.A00);
                            A016.A0R("legacy_event_name", "instagram_organic_tap_product_sticker");
                            A016.A0M(EnumC39651Hig.A0F, "analytics_component");
                            A016.A0R("legacy_surface", C145826hf.A01(reel4, c145826hf7).getModuleName());
                            A016.A0w(A06);
                            A016.A0Q("merchant_id", c4sx2.A00);
                            A016.A0l(c38321qM3.getId());
                            A016.A0O("has_drops_launched", bool2);
                            A016.A0O("is_checkout_enabled", bool);
                            A016.A0S("product_ids", list);
                            A016.A0x(map);
                            A016.Cht();
                        }
                        C25531Mh c25531Mh3 = new C25531Mh(A015.A00(A015.A00, "instagram_organic_tap_product_sticker"), 313);
                        if (((AbstractC02600Aj) c25531Mh3).A00.isSampled()) {
                            String id5 = c38321qM3.getId();
                            if (id5 != null) {
                                c25531Mh3.A0l(id5);
                                c25531Mh3.A0Q("m_t", Long.valueOf(c38321qM3.BRp().A00));
                                c25531Mh3.A0Q("product_id", Long.valueOf(j3));
                                C0Zx c0Zx = new C0Zx();
                                c0Zx.A06("shopping_session_id", c145826hf7.A02);
                                c0Zx.A06("nav_chain", C1QM.A00.A02.A00);
                                c25531Mh3.A0N(c0Zx, "navigation_info");
                                c25531Mh3.A0d(c4sx2);
                                c25531Mh3.A0Q("drops_launch_date", l3);
                                c25531Mh3.A0O("has_drops_launched", bool2);
                                c25531Mh3.A0O("is_checkout_enabled", bool);
                                c25531Mh3.A0Q("product_inventory", l2);
                                c25531Mh3.A0S("tagged_user_ids", list3);
                                c25531Mh3.A0S("drops_product_ids", list2);
                                c25531Mh3.A0S("product_ids", list);
                                c25531Mh3.A0x(map);
                                c25531Mh3.A0S("shared_product_ids", list5);
                                c25531Mh3.A0R("product_sticker_id", str13);
                                ((AbstractC02600Aj) c25531Mh3).A00.A9M("profile_shop_link", map2);
                                c25531Mh3.A0S("sticker_styles", list4);
                                c25531Mh3.Cht();
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    c145826hf7.A0F(Aun, c84823qW);
                    C41181vS A086 = Aun.A08(userSession2);
                    if (!A086.CY4() || (c38321qM2 = A086.A0b) == null || !c38321qM2.BQN().A1g(userSession2).CdW()) {
                        return;
                    }
                    C84823qW A005 = AbstractC120715dH.A00(EnumC75383a5.A0y, A086.A0c());
                    String str15 = null;
                    if (A005 != null && (productSticker = A005.A0r) != null) {
                        str15 = I48.A00(productSticker);
                    }
                    String str16 = "";
                    if (str15 == null) {
                        str15 = "";
                    }
                    Product A0G = c84823qW.A0G();
                    if (A0G == null) {
                        return;
                    }
                    C4SX c4sx3 = C128205qp.A03(userSession2, A0G).A01;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(Long.parseLong(A0G.A0H)));
                    HashMap hashMap = new HashMap();
                    hashMap.put(c4sx3.A00, arrayList);
                    String BzL = A086.BzL(userSession2);
                    if (BzL == null) {
                        BzL = c38321qM2.CAR();
                    }
                    String A0V = A086.A0V(userSession2);
                    C18920wW A017 = AbstractC12220kQ.A01(C145826hf.A01(Aun.A0H, c145826hf7), userSession2);
                    C25531Mh c25531Mh4 = new C25531Mh(A017.A00(A017.A00, "instagram_ad_tap_shopping_sticker"), 285);
                    InterfaceC02590Ai interfaceC02590Ai = ((AbstractC02600Aj) c25531Mh4).A00;
                    if (!interfaceC02590Ai.isSampled()) {
                        return;
                    }
                    interfaceC02590Ai.AAK(c4sx3, "merchant_id");
                    String id6 = c38321qM2.getId();
                    if (id6 != null) {
                        c25531Mh4.A0l(id6);
                        c25531Mh4.A0Q("m_t", Long.valueOf(c38321qM2.BQN().BRp().A00));
                        c25531Mh4.A0R("shopping_sticker_id", str15);
                        if (BzL != null) {
                            str16 = BzL;
                        }
                        c25531Mh4.A0R("tracking_token", str16);
                        if (A0V != null && (A0k3 = AbstractC003100w.A0k(10, A0V)) != null) {
                            j2 = A0k3.longValue();
                        } else {
                            j2 = 0;
                        }
                        c25531Mh4.A0Q("ad_id", Long.valueOf(j2));
                        c25531Mh4.A0j("shopping");
                        c25531Mh4.A0Q("m_ix", Long.valueOf(Aun.A01));
                        c25531Mh4.A0O("is_checkout_enabled", false);
                        c25531Mh4.A0S("product_ids", arrayList);
                        c25531Mh4.A0x(hashMap);
                        c25531Mh4.Cht();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                case 36:
                    c145826hf2 = this.A03;
                    UserSession userSession3 = c145826hf2.A06;
                    C41181vS A087 = Aun.A08(userSession3);
                    if (A087.CY4() && (c38321qM = A087.A0b) != null && c38321qM.BQN().A1g(userSession3).CdW()) {
                        InterfaceC87803vo BUx = c38321qM.BQN().A0C.BUx();
                        if (BUx != null && (B7j2 = BUx.B7j()) != null) {
                            moreInfoProductTagType = B7j2.BhL();
                        } else {
                            moreInfoProductTagType = null;
                        }
                        if (moreInfoProductTagType == MoreInfoProductTagType.A0A) {
                            str3 = "footer_product_thumbnail";
                        } else {
                            InterfaceC87803vo BUx2 = c38321qM.BQN().A0C.BUx();
                            if (BUx2 != null && (B7j = BUx2.B7j()) != null) {
                                moreInfoProductTagType2 = B7j.BhL();
                            } else {
                                moreInfoProductTagType2 = null;
                            }
                            if (moreInfoProductTagType2 == MoreInfoProductTagType.A07) {
                                str3 = "footer_product_pill";
                            } else {
                                str3 = null;
                            }
                        }
                        C84823qW A006 = AbstractC120715dH.A00(EnumC75383a5.A0q, A087.A0c());
                        String str17 = "";
                        if (A006 == null) {
                            str3 = "";
                        } else if (str3 == null) {
                            MultiProductSticker multiProductSticker = A006.A0o;
                            if (multiProductSticker != null) {
                                str3 = I40.A00(multiProductSticker);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        List A0M = c84823qW.A0M();
                        if (A0M != null) {
                            Object obj = A0M.get(0);
                            C14360o3.A07(obj);
                            C4SX c4sx4 = C128205qp.A03(userSession3, (Product) obj).A01;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = A0M.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Long.valueOf(Long.parseLong(((Product) it.next()).A0H)));
                            }
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(c4sx4.A00, arrayList2);
                            String BzL2 = A087.BzL(userSession3);
                            if (BzL2 == null) {
                                BzL2 = c38321qM.CAR();
                            }
                            String A0V2 = A087.A0V(userSession3);
                            C18920wW A018 = AbstractC12220kQ.A01(C145826hf.A01(Aun.A0H, c145826hf2), userSession3);
                            C25531Mh c25531Mh5 = new C25531Mh(A018.A00(A018.A00, "instagram_ad_tap_shopping_sticker"), 285);
                            InterfaceC02590Ai interfaceC02590Ai2 = ((AbstractC02600Aj) c25531Mh5).A00;
                            if (interfaceC02590Ai2.isSampled()) {
                                interfaceC02590Ai2.AAK(c4sx4, "merchant_id");
                                String id7 = c38321qM.getId();
                                if (id7 != null) {
                                    c25531Mh5.A0l(id7);
                                    c25531Mh5.A0Q("m_t", Long.valueOf(c38321qM.BQN().BRp().A00));
                                    c25531Mh5.A0R("shopping_sticker_id", str3);
                                    if (BzL2 != null) {
                                        str17 = BzL2;
                                    }
                                    c25531Mh5.A0R("tracking_token", str17);
                                    if (A0V2 != null && (A0k = AbstractC003100w.A0k(10, A0V2)) != null) {
                                        j = A0k.longValue();
                                    } else {
                                        j = 0;
                                    }
                                    c25531Mh5.A0Q("ad_id", Long.valueOf(j));
                                    c25531Mh5.A0j("shopping");
                                    c25531Mh5.A0Q("m_ix", Long.valueOf(Aun.A01));
                                    c25531Mh5.A0O("is_checkout_enabled", false);
                                    c25531Mh5.A0S("product_ids", arrayList2);
                                    c25531Mh5.A0x(hashMap2);
                                    c25531Mh5.Cht();
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        }
                    }
                    c145826hf2.A0F(Aun, c84823qW);
                    return;
                case 37:
                case 48:
                    c145826hf2 = this.A03;
                    c145826hf2.A0F(Aun, c84823qW);
                    return;
                case 38:
                    C145826hf c145826hf8 = this.A03;
                    Product A0I = c84823qW.A0I();
                    if (A0I != null) {
                        UserSession userSession4 = c145826hf8.A06;
                        C41181vS A088 = Aun.A08(userSession4);
                        if (!A088.CY4() || (c38321qM4 = A088.A0b) == null) {
                            return;
                        }
                        C38683GzO A032 = C128205qp.A03(userSession4, A0I);
                        long j4 = A032.A00;
                        C4SX c4sx5 = A032.A01;
                        Boolean bool3 = A032.A04;
                        Long l4 = A032.A06;
                        Boolean bool4 = A032.A03;
                        C128215qq A042 = C128205qp.A04(c38321qM4);
                        List list6 = A042.A03;
                        Map map3 = A042.A08;
                        List list7 = A042.A02;
                        List list8 = A042.A05;
                        C26087BgG A023 = C128205qp.A02(c38321qM4, A0I.A0H);
                        Object obj2 = A023.A02;
                        List list9 = (List) A023.A01;
                        Reel reel5 = Aun.A0H;
                        C18920wW A019 = AbstractC12220kQ.A01(C145826hf.A01(reel5, c145826hf8), userSession4);
                        LinkedHashMap A062 = AbstractC06930Yk.A06(new C09530e4("sticker_type", String.valueOf(obj2)), new C09530e4("shared_product_ids", String.valueOf(list9)));
                        C25531Mh A0110 = C25531Mh.A01(A019);
                        if (((AbstractC02600Aj) A0110).A00.isSampled()) {
                            String str18 = c145826hf8.A02;
                            if (str18 == null) {
                                str18 = "";
                            }
                            A0110.A0R("shopping_session_id", str18);
                            A0110.A0R("navigation_chain", C1QM.A00.A02.A00);
                            A0110.A0R("legacy_event_name", "instagram_organic_tap_product_share_sticker");
                            A0110.A0M(EnumC39651Hig.A0F, "analytics_component");
                            A0110.A0R("legacy_surface", C145826hf.A01(reel5, c145826hf8).getModuleName());
                            A0110.A0l(c38321qM4.getId());
                            A0110.A0Q("merchant_id", c4sx5.A00);
                            A0110.A0O("has_drops_launched", bool4);
                            A0110.A0O("is_checkout_enabled", bool3);
                            A0110.A0S("product_ids", list6);
                            A0110.A0x(map3);
                            A0110.A0w(A062);
                            A0110.Cht();
                        }
                        C25531Mh c25531Mh6 = new C25531Mh(A019.A00(A019.A00, "instagram_organic_tap_product_share_sticker"), 311);
                        if (!((AbstractC02600Aj) c25531Mh6).A00.isSampled()) {
                            return;
                        }
                        c25531Mh6.A0Q("m_t", Long.valueOf(c38321qM4.BRp().A00));
                        c25531Mh6.A0Q("product_id", Long.valueOf(j4));
                        String id8 = c38321qM4.getId();
                        if (id8 != null) {
                            c25531Mh6.A0l(id8);
                            ((AbstractC02600Aj) c25531Mh6).A00.AAK(c4sx5, "merchant_id");
                            if (list6 != null) {
                                c25531Mh6.A0S("product_ids", list6);
                                C0Zx c0Zx2 = new C0Zx();
                                c0Zx2.A06("nav_chain", C1QM.A00.A02.A00);
                                c25531Mh6.A0N(c0Zx2, "navigation_info");
                                c25531Mh6.A0x(map3);
                                c25531Mh6.A0S("shared_product_ids", list9);
                                c25531Mh6.A0S("tagged_user_ids", list8);
                                c25531Mh6.A0Q("drops_launch_date", l4);
                                c25531Mh6.A0O("has_drops_launched", bool4);
                                c25531Mh6.A0S("drops_product_ids", list7);
                                c25531Mh6.A0O("is_checkout_enabled", bool3);
                                c25531Mh6.Cht();
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                case 44:
                    C145826hf c145826hf9 = this.A03;
                    UserSession userSession5 = c145826hf9.A06;
                    C41181vS A089 = Aun.A08(userSession5);
                    if (!A089.CY4() || (c38321qM5 = A089.A0b) == null) {
                        return;
                    }
                    C145836hg A0111 = C145826hf.A01(Aun.A0H, c145826hf9);
                    String str19 = c84823qW.A1d;
                    if (str19 != null && str19.length() != 0) {
                        c4sx = C4SX.A00(str19);
                    } else {
                        c4sx = null;
                    }
                    C18920wW A0112 = AbstractC12220kQ.A01(A0111, userSession5);
                    c25531Mh = new C25531Mh(A0112.A00(A0112.A00, "instagram_shopping_format_stories_reshare_view_shop_cta_tap"), 318);
                    if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                        return;
                    }
                    c25531Mh.A0l(c38321qM5.getId());
                    c25531Mh.A0d(c4sx);
                    c25531Mh.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "stories_reshare_view_shop_cta");
                    C0Zx c0Zx3 = new C0Zx();
                    c0Zx3.A06("shopping_session_id", c145826hf9.A02);
                    c0Zx3.A06("prior_module", A0111.getModuleName());
                    c0Zx3.A06(AbstractC43591JPw.A00(188), "stories_reshare_view_shop_cta");
                    c0Zx3.A06("submodule", "stories_reshare_view_shop_cta");
                    c0Zx3.A06("nav_chain", C1QM.A00.A02.A00);
                    c25531Mh.A0N(c0Zx3, "navigation_info");
                    c25531Mh.Cht();
                    return;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    if (c84823qW.A1r) {
                        return;
                    }
                    C18920wW c18920wW3 = this.A01;
                    A00 = c18920wW3.A00(c18920wW3.A00, "instagram_upcoming_event_action");
                    A00.AAP("action", "open_upcoming_event_bottom_sheet");
                    UpcomingEventImpl upcomingEventImpl2 = c84823qW.A1B;
                    if (upcomingEventImpl2 != null) {
                        str4 = upcomingEventImpl2.A0B;
                    } else {
                        str4 = c84823qW.A1n;
                    }
                    if (str4 != null && (A0k2 = AbstractC003100w.A0k(10, str4)) != null) {
                        A00.A9K("upcoming_event_id", A0k2);
                        A00.AAP("m_pk", c84823qW.A1b);
                        moduleName = this.A00.getModuleName();
                        str5 = "source_of_action";
                        A00.AAP(str5, moduleName);
                        A00.Cht();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                case 57:
                    c145826hf = this.A03;
                    reel = Aun.A0H;
                    A08 = Aun.A08(this.A02);
                    i3 = Aun.A01;
                    C102134ij c102134ij = c84823qW.A0C;
                    if (c102134ij != null) {
                        str = c102134ij.A04;
                        if (str != null) {
                            str2 = "avatar_sticker";
                            c145826hf.A07(reel, A08, str2, str, i3);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                case 65:
                    c145826hf = this.A03;
                    reel = Aun.A0H;
                    A08 = Aun.A08(this.A02);
                    i3 = Aun.A01;
                    str = c84823qW.A1j;
                    if (str != null) {
                        str2 = "photo_credit";
                        c145826hf.A07(reel, A08, str2, str, i3);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                case 66:
                    C145826hf c145826hf10 = this.A03;
                    C18920wW A0113 = AbstractC12220kQ.A01(C145826hf.A01(Aun.A0H, c145826hf10), c145826hf10.A06);
                    A00 = A0113.A00(A0113.A00, "instagram_explore_shareable_grid_interact");
                    if (!A00.isSampled()) {
                        return;
                    }
                    moduleName = c145826hf10.A0A.getModuleName();
                    str5 = "containermodule";
                    A00.AAP(str5, moduleName);
                    A00.Cht();
                    return;
                case 69:
                    c145826hf = this.A03;
                    reel = Aun.A0H;
                    A08 = Aun.A08(this.A02);
                    i3 = Aun.A01;
                    str2 = "notify_me";
                    str = "notify_me_sticker_bundle_id";
                    c145826hf.A07(reel, A08, str2, str, i3);
                    return;
                case 77:
                    c145826hf = this.A03;
                    reel = Aun.A0H;
                    A08 = Aun.A08(this.A02);
                    i3 = Aun.A01;
                    str2 = "achievement";
                    str = "achievements_sticker_id";
                    c145826hf.A07(reel, A08, str2, str, i3);
                    return;
                default:
                    return;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
