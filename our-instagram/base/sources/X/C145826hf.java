package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145826hf extends AbstractC60592pi implements C30V {
    public int A00;
    public C145816he A01;
    public String A02;
    public boolean A03;
    public final Context A04;
    public final C18920wW A05;
    public final UserSession A06;
    public final C64352vu A07;
    public final C3G2 A08;
    public final C145846hh A09;
    public final C145836hg A0A;
    public final C145856hi A0B;
    public final C64022vN A0C;
    public final User A0D;
    public final C1M1 A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final Map A0I;
    public final Map A0J;
    public final java.util.Set A0K;
    public final C145796hc A0L;

    /* JADX WARN: Type inference failed for: r0v18, types: [X.30a, java.lang.Object] */
    public C145826hf(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C145816he c145816he, C145796hc c145796hc, C1M1 c1m1, String str, String str2, String str3) {
        C30Y c30y;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c3g2, 4);
        C14360o3.A0B(str, 6);
        C14360o3.A0B(c145796hc, 7);
        this.A04 = context;
        this.A06 = userSession;
        this.A08 = c3g2;
        this.A0E = c1m1;
        this.A0H = str;
        this.A0L = c145796hc;
        this.A0F = str2;
        this.A0G = str3;
        this.A01 = c145816he;
        this.A0I = new LinkedHashMap();
        this.A0J = new LinkedHashMap();
        C64022vN c64022vN = new C64022vN();
        this.A0C = c64022vN;
        this.A0K = new LinkedHashSet();
        C145836hg c145836hg = new C145836hg(interfaceC60442pS, c3g2);
        this.A0A = c145836hg;
        this.A05 = AbstractC12220kQ.A01(c145836hg, userSession);
        this.A0D = C08730cb.A00(userSession).A00();
        this.A09 = new C145846hh(userSession, c145836hg, c145796hc, c1m1, str, str3);
        this.A0B = new C145856hi();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36311985687757652L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36311985687954263L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 36311985687888726L);
        boolean A064 = C18U.A06(c06090Tz, userSession, 36311985688150874L);
        if (!A06 && !A062 && !A063 && !A064) {
            c30y = null;
        } else {
            c30y = new C30Y(userSession, new Object(), new HLG(userSession, A06, A062, A063, A064), c145836hg);
        }
        this.A07 = new C64352vu(new C30Y(userSession, null, this, c145836hg), c30y, new C5GQ(userSession, this, c145836hg));
        c64022vN.A01 = c3g2.A00;
        c64022vN.A00 = str2;
    }

    public final void A05(C18920wW c18920wW, UserSession userSession, C41551w4 c41551w4, Boolean bool, String str, String str2, String str3, String str4, String str5, double d, long j) {
        Long l;
        Long l2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41551w4, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c18920wW, 8);
        C41181vS A08 = c41551w4.A08(userSession);
        if (A08.A18()) {
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_live_reaction"), 233);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C37948Gmq c37948Gmq = (C37948Gmq) this.A0I.get(A08.CGe());
                c25531Mh.A0Q("a_pk", Long.valueOf(j));
                c25531Mh.A0l(str);
                c25531Mh.A0R(AbstractC43591JPw.A00(92), str2);
                c25531Mh.A0R(MSV.A00(1645), str3);
                c25531Mh.A0R("tray_session_id", this.A0H);
                c25531Mh.A0R("viewer_session_id", this.A0E.getSessionId());
                c25531Mh.A0P(MSV.A00(1387), Double.valueOf(d));
                c25531Mh.A0R("story_ranking_token", this.A0G);
                if (c37948Gmq != null) {
                    l = Long.valueOf(c37948Gmq.A00);
                } else {
                    l = null;
                }
                c25531Mh.A0Q("session_reel_counter", l);
                if (c37948Gmq != null) {
                    l2 = Long.valueOf(c37948Gmq.A04.A0E);
                } else {
                    l2 = null;
                }
                c25531Mh.A0Q("tray_position", l2);
                c25531Mh.A0R(MSV.A00(554), str4);
                c25531Mh.A0R(MSV.A00(973), str5);
                if (str5 == null) {
                    bool = null;
                }
                c25531Mh.A0O("avatar_reaction_is_animated", bool);
                c25531Mh.Cht();
            }
        }
    }

    public final void A07(Reel reel, C41181vS c41181vS, String str, String str2, int i) {
        long j;
        String str3;
        String str4;
        long j2;
        User A2E;
        String id;
        Long A0k;
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(str2, 4);
        UserSession userSession = this.A06;
        C145836hg c145836hg = this.A0A;
        c145836hg.A00 = reel;
        C18920wW A01 = AbstractC12220kQ.A01(c145836hg, userSession);
        C38321qM c38321qM = c41181vS.A0b;
        try {
            C25531Mh A0I = C25531Mh.A0I(A01);
            if (((AbstractC02600Aj) A0I).A00.isSampled()) {
                C1NB c1nb = reel.A0W;
                if (c1nb != null && (id = c1nb.getId()) != null && (A0k = AbstractC003100w.A0k(10, id)) != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                A0I.A0Q("a_pk", Long.valueOf(j));
                String str5 = "";
                if (c38321qM == null || (A2E = c38321qM.A2E(userSession)) == null || (str3 = A2E.B7L().name()) == null) {
                    str3 = "";
                }
                A0I.A0R("follow_status", str3);
                A0I.A0R("is_coming_from", "");
                A0I.A0O("is_context_sheet", false);
                if (c38321qM == null || (str4 = c38321qM.getId()) == null) {
                    str4 = "";
                }
                A0I.A0l(str4);
                if (c38321qM == null) {
                    j2 = 0;
                } else {
                    j2 = c38321qM.BRp().A00;
                }
                A0I.A0Q("m_t", Long.valueOf(j2));
                A0I.A0R("pigeon_reserved_keyword_module", "");
                A0I.A0Q("post_id", 0L);
                A0I.A0R("reel_id", reel.getId());
                A0I.A0Q("reel_position", Long.valueOf(i));
                A0I.A0Q("reel_size", Long.valueOf(reel.A0O(userSession).size()));
                A0I.A0R("reel_type", reel.A0H(userSession));
                A0I.A0Q("session_reel_counter", Long.valueOf(this.A00));
                A0I.A0R("source_of_action", "stories");
                A0I.A0R("sticker_id", str2);
                A0I.A0R("sticker_type", str);
                String str6 = this.A0G;
                if (str6 != null) {
                    str5 = str6;
                }
                A0I.A0R("story_ranking_token", str5);
                Double valueOf = Double.valueOf(0.0d);
                A0I.A0P("time_elapsed", valueOf);
                A0I.A0P("time_remaining", valueOf);
                A0I.A0Q("tray_pos_excl_own_story", 0L);
                A0I.A0Q("tray_position", 0L);
                A0I.A0R("tray_session_id", this.A0H);
                A0I.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId);
                A0I.A0R("viewer_session_id", this.A0E.getSessionId());
                A0I.A0R("bloks_app", null);
                A0I.A0S("attribution_type", null);
                A0I.Cht();
            }
        } catch (Exception e) {
            C0w9.A06("ReelViewerLogger#reportLinkStickerTap", "Failed to log link sticker tap", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0046, code lost:
    
        if (X.C14360o3.A0K(r8, "-1") != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.C41181vS r20, X.C41551w4 r21, X.C141596ac r22, java.lang.Integer r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145826hf.A0A(X.1vS, X.1w4, X.6ac, java.lang.Integer, java.lang.String):void");
    }

    public final void A0D(C41551w4 c41551w4, float f, float f2, boolean z, boolean z2) {
        C37948Gmq c37948Gmq;
        FollowStatus followStatus;
        Long l;
        int i;
        String str;
        UserSession userSession = this.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        Long l2 = null;
        if (A08.CY4() && (c37948Gmq = (C37948Gmq) this.A0I.get(A08.CGe())) != null) {
            C38321qM c38321qM = A08.A0b;
            c38321qM.getClass();
            Reel reel = c41551w4.A0H;
            C1NB c1nb = reel.A0W;
            C145836hg c145836hg = this.A0A;
            c145836hg.A00 = reel;
            C18920wW A01 = AbstractC12220kQ.A01(c145836hg, userSession);
            C25531Mh c25531Mh = new C25531Mh(A01.A00(A01.A00, "reel_send_message"), 370);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                String str2 = "";
                if (!C18U.A06(C06090Tz.A05, userSession, 36324097495478151L) && (str2 = c38321qM.getId()) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                c25531Mh.A0l(str2);
                c25531Mh.A0Q("m_t", Long.valueOf(c38321qM.BRp().A00));
                c25531Mh.A0R("tray_session_id", this.A0H);
                c25531Mh.A0R("viewer_session_id", this.A0E.getSessionId());
                c25531Mh.A0Q("reel_position", Long.valueOf(c37948Gmq.A00()));
                c25531Mh.A0O("is_quick_reaction", Boolean.valueOf(z));
                c25531Mh.A0O("is_avatar_quick_reaction", Boolean.valueOf(z2));
                c25531Mh.A0O(AbstractC43591JPw.A00(404), false);
                Reel reel2 = c37948Gmq.A02;
                c25531Mh.A0R("reel_type", reel2.A0H(c37948Gmq.A01));
                c25531Mh.A0O("is_custom_quick_reaction", false);
                c25531Mh.A0R("inventory_source", c38321qM.A0C.BJN());
                c25531Mh.A0P("time_elapsed", Double.valueOf((f * f2) / 1000.0d));
                c25531Mh.A0Q("reel_size", Long.valueOf(reel2.A0O(r12).size()));
                float f3 = 1.0f - f;
                float f4 = 0.0f;
                if (0.0f < f3) {
                    f4 = f3;
                }
                c25531Mh.A0P("time_remaining", Double.valueOf((f4 * f2) / 1000.0d));
                c25531Mh.A0Q("session_reel_counter", Long.valueOf(c37948Gmq.A00));
                Parcelable.Creator creator = User.CREATOR;
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    followStatus = A2E.B7L();
                } else {
                    followStatus = null;
                }
                c25531Mh.A0R("follow_status", AbstractC38851rI.A06(followStatus));
                c25531Mh.A0O("first_view", Boolean.valueOf(c37948Gmq.A06));
                C41551w4 c41551w42 = c37948Gmq.A04;
                c25531Mh.A0Q("tray_position", Long.valueOf(c41551w42.A0E));
                c25531Mh.A0R("tracking_token", c38321qM.CAR());
                User A2E2 = c38321qM.A2E(userSession);
                if (A2E2 != null) {
                    l = AbstractC003100w.A0k(10, A2E2.getId());
                } else {
                    l = null;
                }
                c25531Mh.A0Q("media_owner_id", l);
                c25531Mh.A0R("source_of_action", c145836hg.getModuleName());
                String id = reel2.getId();
                C14360o3.A07(id);
                c25531Mh.A0R("reel_id", id);
                c25531Mh.A0R("story_ranking_token", this.A0G);
                if (c41551w42.A0L) {
                    i = 0;
                } else {
                    i = c41551w42.A00;
                }
                c25531Mh.A0Q("reel_start_position", Long.valueOf(i));
                c25531Mh.A0Q("reel_viewer_position", Long.valueOf(c37948Gmq.A05.A0I));
                c25531Mh.A0O("is_video_to_carousel", Boolean.valueOf(c37948Gmq.A07));
                c25531Mh.A0P("elapsed_time_since_last_item", Double.valueOf(-1.0d));
                boolean z3 = false;
                if (reel.A0P == ReelType.A05) {
                    z3 = true;
                }
                c25531Mh.A0O("is_moments_with_friends", Boolean.valueOf(z3));
                c25531Mh.A0R("delivery_flags", AbstractC77343dK.A00(c38321qM.A0e));
                if (A08.CdW()) {
                    str = "ad";
                } else {
                    str = "organic";
                }
                c25531Mh.A0R("delivery_class", str);
                Hashtag B7K = c38321qM.A0C.B7K();
                if (B7K != null) {
                    String id2 = B7K.getId();
                    if (id2 != null) {
                        l2 = AbstractC003100w.A0k(10, id2);
                    }
                    c25531Mh.A0Q("hashtag_id", l2);
                    c25531Mh.A0R("hashtag_name", B7K.getName());
                }
                if (c1nb instanceof C1N9) {
                    c25531Mh.A0Q("a_pk", AbstractC003100w.A0k(10, ((C1N9) c1nb).getId()));
                } else if (c1nb instanceof C6ZI) {
                    C6ZI c6zi = (C6ZI) c1nb;
                    String str3 = c6zi.A00.A07;
                    C14360o3.A0B(str3, 0);
                    c25531Mh.A0Q("o_pk", AbstractC003100w.A0k(10, str3));
                    c25531Mh.A0R("o_t", c6zi.A00());
                }
                c25531Mh.Cht();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.Map] */
    public final void A0F(C41551w4 c41551w4, C84823qW c84823qW) {
        C51634MrR c51634MrR;
        String str;
        C4SX A00;
        String A002;
        String str2;
        Boolean bool;
        String str3;
        List A03;
        User user;
        C38321qM c38321qM;
        String Ap3;
        ProductCollectionV2Type productCollectionV2Type;
        ProductCollection productCollection;
        String str4;
        UserSession userSession = this.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        ProductSticker productSticker = c84823qW.A0r;
        MultiProductSticker multiProductSticker = c84823qW.A0o;
        C38820H7m c38820H7m = c84823qW.A0p;
        C38822H7p c38822H7p = c84823qW.A0s;
        if (productSticker != null) {
            ProductDetailsProductItemDict productDetailsProductItemDict = productSticker.A03;
            if (productDetailsProductItemDict != null) {
                Product A01 = AbstractC38048Gob.A01(productDetailsProductItemDict);
                C38683GzO A032 = C128205qp.A03(userSession, A01);
                long j = A032.A00;
                C4SX c4sx = A032.A01;
                Boolean bool2 = A032.A04;
                Boolean bool3 = A032.A03;
                List singletonList = Collections.singletonList(A01);
                C14360o3.A07(singletonList);
                c51634MrR = new C51634MrR(c4sx, bool2, bool3, Long.valueOf(j), I48.A00(productSticker), productSticker.A0B, "product_sticker", C128205qp.A0C(singletonList), C128205qp.A0D(singletonList));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (multiProductSticker != null) {
            List list = multiProductSticker.A09;
            String str5 = null;
            if (list != null && (A03 = AbstractC38048Gob.A03(list)) != null) {
                Product product = (Product) A03.get(0);
                if (product != null && (user = product.A0B) != null) {
                    str5 = AbstractC76433bn.A00(user);
                }
                c51634MrR = new C51634MrR(C4SX.A00(str5), C128205qp.A08(A03), null, null, I40.A00(multiProductSticker), multiProductSticker.A04, "multi_product_sticker", C128205qp.A0C(A03), C128205qp.A0D(A03));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (c38820H7m != null) {
                A00 = C4SX.A00(c38820H7m.A05);
                A002 = I45.A00(c38820H7m);
                str2 = c38820H7m.A07;
                bool = null;
                str3 = "product_collection_sticker";
            } else if (c38822H7p != null) {
                User user2 = c38822H7p.A00;
                if (user2 != null) {
                    str = user2.getId();
                } else {
                    str = null;
                }
                A00 = C4SX.A00(str);
                A002 = I4G.A00(c38822H7p);
                str2 = c38822H7p.A04;
                bool = null;
                str3 = "storefront_sticker";
            } else {
                c51634MrR = null;
            }
            c51634MrR = new C51634MrR(A00, bool, bool, bool, A002, str2, str3, bool, bool);
        }
        if (A08.CY4() && (c38321qM = A08.A0b) != null && !c38321qM.A1g(userSession).CdW() && c51634MrR != null) {
            Reel reel = c41551w4.A0H;
            C18920wW A012 = AbstractC12220kQ.A01(A01(reel, this), userSession);
            C25531Mh A013 = C25531Mh.A01(A012);
            String str6 = c51634MrR.A04;
            LinkedHashMap A07 = AbstractC06930Yk.A07(new C09530e4("shopping_sticker_id", str6));
            C38820H7m c38820H7m2 = c84823qW.A0p;
            String str7 = "";
            if (c38820H7m2 != null) {
                ProductCollection productCollection2 = c38820H7m2.A02;
                if (productCollection2 == null || (str4 = productCollection2.Ap3()) == null) {
                    str4 = "";
                }
                A07.put("product_collection_id", str4);
            }
            C0Zx c0Zx = null;
            ProductCollectionV2Type productCollectionV2Type2 = null;
            if (((AbstractC02600Aj) A013).A00.isSampled()) {
                String str8 = this.A02;
                if (str8 == null) {
                    str8 = "";
                }
                A013.A0R("shopping_session_id", str8);
                A013.A0R("navigation_chain", C1QM.A00.A02.A00);
                A013.A0R("legacy_event_name", "instagram_organic_tap_shopping_sticker");
                A013.A0M(EnumC39651Hig.A0F, "analytics_component");
                A013.A0R("legacy_surface", A01(reel, this).getModuleName());
                A013.A0R("legacy_ui_component", c51634MrR.A05);
                A013.A0l(c38321qM.getId());
                A013.A0Q("merchant_id", c51634MrR.A00.A00);
                A013.A0w(A07);
                A013.A0S("product_ids", c51634MrR.A07);
                A013.A0x(c51634MrR.A08);
                A013.A0R("text_format", c51634MrR.A06);
                C38820H7m c38820H7m3 = c84823qW.A0p;
                if (c38820H7m3 != null && (productCollection = c38820H7m3.A02) != null) {
                    productCollectionV2Type = productCollection.ApF();
                } else {
                    productCollectionV2Type = null;
                }
                A013.A0R("product_collection_type", String.valueOf(productCollectionV2Type));
                A013.Cht();
            }
            InterfaceC02590Ai A003 = A012.A00(A012.A00, "instagram_organic_tap_shopping_sticker");
            C38820H7m c38820H7m4 = c84823qW.A0p;
            if (c38820H7m4 != null) {
                C0Zx c0Zx2 = new C0Zx();
                ProductCollection productCollection3 = c38820H7m4.A02;
                if (productCollection3 != null && (Ap3 = productCollection3.Ap3()) != null) {
                    str7 = Ap3;
                }
                c0Zx2.A06("product_collection_id", str7);
                if (productCollection3 != null) {
                    productCollectionV2Type2 = productCollection3.ApF();
                }
                c0Zx2.A06("product_collection_type", String.valueOf(productCollectionV2Type2));
                c0Zx = c0Zx2;
            }
            if (A003.isSampled()) {
                C0Zx c0Zx3 = new C0Zx();
                c0Zx3.A06("shopping_session_id", this.A02);
                c0Zx3.A06("submodule", c51634MrR.A05);
                c0Zx3.A06("nav_chain", C1QM.A00.A02.A00);
                A003.AAQ(c0Zx3, "navigation_info");
                A003.AAK(c51634MrR.A00, "merchant_id");
                A003.AAP("shopping_sticker_id", str6);
                String id = c38321qM.getId();
                if (id != null) {
                    A003.AAP("m_pk", id);
                    A003.A9K("product_id", c51634MrR.A03);
                    A003.A7v("is_checkout_enabled", c51634MrR.A02);
                    A003.A7v("has_drops_launched", c51634MrR.A01);
                    A003.AAk("product_ids", c51634MrR.A07);
                    A003.A9M("product_merchant_ids", c51634MrR.A08);
                    A003.AAQ(c0Zx, "collections_logging_info");
                    A003.AAP("text_format", c51634MrR.A06);
                    A003.Cht();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void A0I(C41551w4 c41551w4, C141596ac c141596ac, int i) {
        UserSession userSession = this.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        if (!A08.A1O()) {
            Reel reel = c41551w4.A0H;
            String id = reel.getId();
            C14360o3.A07(id);
            int i2 = c41551w4.A01;
            if (this.A0B.A00(A08, c41551w4)) {
                this.A00++;
            }
            C37948Gmq c37948Gmq = new C37948Gmq(userSession, reel, A08, c41551w4, c141596ac, this.A00, !C41661wG.A00(userSession).Cbf(reel, A08));
            this.A0I.put(A08.CGe(), c37948Gmq);
            Map map = this.A0J;
            if (!map.containsKey(id)) {
                this.A0L.A01(userSession, reel, A08, i);
                map.put(id, c37948Gmq);
                this.A07.A00(null, reel, i2, -1, false);
            }
            this.A0L.A02(A08, i);
            if (!A08.A1Q()) {
                this.A07.A00(null, A08, i2, -1, false);
            }
        }
    }

    public final void A0K(C41551w4 c41551w4, C141596ac c141596ac, Float f, String str, float f2, float f3) {
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c141596ac, 4);
        Reel reel = c41551w4.A0H;
        if (!reel.A0m()) {
            UserSession userSession = this.A06;
            C41181vS A08 = c41551w4.A08(userSession);
            if (!A08.A1O()) {
                float f4 = AbstractC13880nE.A0I(this.A04).density;
                C145836hg c145836hg = this.A0A;
                c145836hg.A00 = reel;
                C82713mZ A02 = AbstractC37955Gmx.A02(userSession, c145836hg, A08, "gesture");
                A02.A7T = str;
                A02.A2X = Double.valueOf(f2 / f4);
                A02.A2Y = Double.valueOf(f3 / f4);
                A02.A2l = f;
                A02.A1U = Boolean.valueOf(!c141596ac.A0q);
                A03(A02, c41551w4, this, c141596ac);
            }
        }
    }

    public final void A0M(C41551w4 c41551w4, C130935vh c130935vh, User user, String str, String str2, String str3) {
        String str4;
        C14360o3.A0B(str, 3);
        UserSession userSession = this.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        if (A08.CY4()) {
            C38321qM c38321qM = A08.A0b;
            if (c38321qM != null) {
                C82713mZ c82713mZ = new C82713mZ(A01(c41551w4.A0H, this), str2);
                c82713mZ.A0G(userSession, c38321qM);
                c82713mZ.A5R = str;
                c82713mZ.A12 = c130935vh;
                if (user != null) {
                    str4 = user.A03.B4q();
                } else {
                    str4 = null;
                }
                c82713mZ.A4f = str4;
                c82713mZ.A4P = str3;
                A04(c82713mZ, (C37948Gmq) this.A0I.get(A08.CGe()), this);
                C32U.A0C(userSession, c82713mZ, c38321qM, this.A0A, null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0N(C41551w4 c41551w4, Boolean bool, String str, String str2, String str3) {
        C38321qM c38321qM;
        C37948Gmq c37948Gmq;
        User A2E;
        String name;
        long j;
        int i;
        C14360o3.A0B(str3, 3);
        UserSession userSession = this.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        if (A08.CY4()) {
            C38321qM c38321qM2 = A08.A0b;
            if (c38321qM2 != null) {
                if (!c38321qM2.CdW() && "location_attempt".equals(str)) {
                    C41181vS A082 = c41551w4.A08(userSession);
                    C1NB c1nb = c41551w4.A0H.A0W;
                    if (c1nb != null && (c38321qM = A082.A0b) != null && (c37948Gmq = (C37948Gmq) this.A0I.get(A082.CGe())) != null) {
                        C141596ac c141596ac = c37948Gmq.A05;
                        C18920wW c18920wW = this.A05;
                        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_organic_location_attempt"), 306);
                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled() && (A2E = c38321qM.A2E(userSession)) != null && (name = A2E.B7L().name()) != null) {
                            String id = c1nb.getId();
                            C14360o3.A0B(id, 0);
                            Long A0k = AbstractC003100w.A0k(10, id);
                            long j2 = 0;
                            if (A0k != null) {
                                j = A0k.longValue();
                            } else {
                                j = 0;
                            }
                            c25531Mh.A0Q("a_pk", Long.valueOf(j));
                            c25531Mh.A0R("follow_status", name);
                            c25531Mh.A0R("from", str3);
                            c25531Mh.A0R("location_id", str2);
                            c25531Mh.A0l(AbstractC128985sJ.A09(c38321qM));
                            c25531Mh.A0Q("m_t", Long.valueOf(c38321qM.BRp().A00));
                            long A1B = c38321qM.A1B();
                            if (Long.valueOf(A1B) != null) {
                                j2 = A1B;
                            }
                            c25531Mh.A0Q("m_ts", Long.valueOf(j2));
                            String str4 = this.A0G;
                            String str5 = "";
                            if (str4 == null) {
                                str4 = "";
                            }
                            c25531Mh.A0R("story_ranking_token", str4);
                            c25531Mh.A0O("is_acp_delivered", false);
                            c25531Mh.A0O("is_video_to_carousel", Boolean.valueOf(c37948Gmq.A07));
                            Reel reel = c37948Gmq.A02;
                            String id2 = reel.getId();
                            C14360o3.A07(id2);
                            c25531Mh.A0R("reel_id", id2);
                            c25531Mh.A0Q("reel_position", Long.valueOf(c37948Gmq.A00()));
                            UserSession userSession2 = c37948Gmq.A01;
                            c25531Mh.A0Q("reel_size", Long.valueOf(reel.A0O(userSession2).size()));
                            C41551w4 c41551w42 = c37948Gmq.A04;
                            if (c41551w42.A0L) {
                                i = 0;
                            } else {
                                i = c41551w42.A00;
                            }
                            c25531Mh.A0Q("reel_start_position", Long.valueOf(i));
                            c25531Mh.A0R("reel_type", reel.A0H(userSession2));
                            c25531Mh.A0Q("reel_viewer_position", Long.valueOf(c141596ac.A0I));
                            c25531Mh.A0Q("session_reel_counter", Long.valueOf(c37948Gmq.A00));
                            c25531Mh.A0R("source_of_action", A00(A082, this).getModuleName());
                            c25531Mh.A0P("time_elapsed", Double.valueOf((c141596ac.A0B * c141596ac.A0A) / 1000.0d));
                            String A33 = c38321qM.A33();
                            if (A33 != null) {
                                str5 = A33;
                            }
                            c25531Mh.A0R("tracking_token", str5);
                            c25531Mh.A0Q("tray_position", Long.valueOf(c41551w42.A0E));
                            c25531Mh.A0R("tray_session_id", this.A0H);
                            c25531Mh.A0R("viewer_session_id", this.A0E.getSessionId());
                            c25531Mh.Cht();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C82713mZ A02 = AbstractC37955Gmx.A02(userSession, A01(c41551w4.A0H, this), A08, str);
                A02.A5y = str2;
                A02.A5R = str3;
                if (bool != null) {
                    A02.A2F = Boolean.valueOf(bool.booleanValue());
                }
                A04(A02, (C37948Gmq) this.A0I.get(A08.CGe()), this);
                C32U.A0C(userSession, A02, c38321qM2, this.A0A, null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.C30V
    public final void Cig(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Cih(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Cii(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Cik(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2, long j) {
    }

    @Override // X.C30V
    public final void Cil(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Ck5(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Cls(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Clt(C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C38321qM c38321qM;
        Long valueOf;
        Long l;
        long j;
        Long l2;
        Long l3;
        Long l4;
        C14360o3.A0B(c1ni, 1);
        if (c1ni instanceof C41181vS) {
            C41181vS c41181vS = (C41181vS) c1ni;
            if (!c41181vS.CdW()) {
                C145836hg A00 = A00(c1ni, this);
                C3R6 c3r6 = C3R6.A00;
                UserSession userSession = this.A06;
                C41181vS A002 = C3R6.A00(userSession, c1ni);
                C82713mZ A02 = AbstractC37955Gmx.A02(userSession, A00, c41181vS, "sub_viewed_impression");
                C37948Gmq A022 = A02(c1ni);
                A04(A02, A022, this);
                c3r6.A0D(A02, A022);
                C41181vS A003 = C3R6.A00(userSession, c1ni);
                if (A003 != null) {
                    A02.A1Y = Boolean.valueOf(A003.A1K());
                }
                boolean CdW = c41181vS.CdW();
                Long l5 = null;
                if (!CdW) {
                    C18920wW A01 = AbstractC12220kQ.A01(A00, userSession);
                    InterfaceC02590Ai A004 = A01.A00(A01.A00, "instagram_organic_sub_viewed_impression");
                    if (A004.isSampled()) {
                        if (A002 != null) {
                            c38321qM = A002.A0b;
                        } else {
                            c38321qM = null;
                        }
                        C11520jB A012 = A02.A01();
                        C19260xA c19260xA = A02.A00().A06;
                        if (c38321qM != null) {
                            A004.AAP("follow_status", AbstractC128985sJ.A06(userSession, c38321qM));
                            A004.A9K("sponsor_tag_count", (Long) A012.A01(C5I8.A8L));
                            A004.AAP("m_pk", AbstractC128985sJ.A09(c38321qM));
                            A004.AAP("tracking_token", AbstractC128985sJ.A07(userSession, c38321qM, interfaceC60442pS));
                            A004.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
                            A004.A9T("feed_sticker_media_id", A012.A01(C5I8.A2r));
                            A004.AAP("inventory_source", c38321qM.A0C.BJN());
                            C14360o3.A0B(userSession, 0);
                            A004.AAP("last_navigation_module", C55772hI.A00(userSession).A03());
                            A004.AAP("module_name", interfaceC60442pS.getModuleName());
                            A004.AAP("reel_id", (String) A012.A01(C5I8.A7W));
                            A004.AAP("tray_session_id", (String) A012.A01(C5I8.A7a));
                            A004.AAP("viewer_session_id", (String) A012.A01(C5I8.A9o));
                            A004.AAP("ranking_session_id", (String) A012.A01(C5I8.A6s));
                            A004.AAP("action", AbstractC128985sJ.A08(c38321qM));
                            A004.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) A012.A01(C5I8.A2f));
                            A004.A7v("can_add_to_bag", c19260xA.A01("can_add_to_bag"));
                            A004.AAP("prior_module", (String) A012.A01(C5I8.A6j));
                            if (i2 == -1) {
                                valueOf = null;
                            } else {
                                valueOf = Long.valueOf(i2);
                            }
                            A004.A9K("m_ix", valueOf);
                            A004.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c19260xA.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                            A004.AAP("source_of_action", (String) A012.A01(C5I8.A8G));
                            A004.A8I("elapsed_time_since_last_item", (Double) A012.A01(C5I8.A2Q));
                            A004.A9K("m_ts", Long.valueOf(c38321qM.A1B()));
                            A004.A7v("is_acp_delivered", false);
                            A004.AAP("a_pk", String.valueOf(AbstractC128985sJ.A00(userSession, c38321qM)));
                            A004.A9K("imp_logger_ver", 24L);
                            A004.AAP(AbstractC58410Puo.A01(9, 10, 53), (String) A012.A01(C5I8.A83));
                            A004.AAP("feed_request_id", (String) A012.A01(C5I8.A8E));
                            A004.A7v("is_highlights_sourced", (Boolean) A012.A01(C5I8.A4L));
                            A004.A9K("reel_size", (Long) A012.A01(C5I8.A7Y));
                            A004.A9K("session_reel_counter", (Long) A012.A01(C5I8.A84));
                            A004.A9K("reel_viewer_position", (Long) A012.A01(C5I8.A7e));
                            A004.AAP("reel_type", (String) A012.A01(C5I8.A7b));
                            A004.A8I("time_elapsed", (Double) A012.A01(C5I8.A95));
                            A004.A8I("media_dwell_time", (Double) A012.A01(C5I8.A5H));
                            A004.A8I("media_time_paused", (Double) A012.A01(C5I8.A5V));
                            A004.A9K("tray_position", (Long) A012.A01(C5I8.A9V));
                            A004.A8I("media_time_elapsed", Double.valueOf(-1.0d));
                            A004.A8I("media_time_remaining", (Double) A012.A01(C5I8.A5b));
                            A004.A8I("media_time_to_load", (Double) A012.A01(C5I8.A5S));
                            A004.A9K("reel_position", (Long) A012.A01(C5I8.A7X));
                            A004.A9K("reel_start_position", (Long) A012.A01(C5I8.A7Z));
                            A004.AAP("story_ranking_token", (String) A012.A01(C5I8.A8U));
                            A004.A9K("entity_id", (Long) A012.A01(C5I8.A2a));
                            A004.AAP("entity_name", (String) A012.A01(C5I8.A2b));
                            A004.A7v("is_igtv", Boolean.valueOf(c38321qM.A5g()));
                            A004.AAP("audience", (String) A012.A01(C5I8.A0W));
                            A004.A9K("is_live_streaming", c19260xA.A04("is_live_streaming"));
                            C11500j9 c11500j9 = C5I8.A01;
                            String str = (String) A012.A01(c11500j9);
                            if (str != null) {
                                l = AbstractC003100w.A0k(10, str);
                            } else {
                                l = null;
                            }
                            A004.A9K("actor_id", l);
                            A004.A9K("is_live_questions", c19260xA.A04("is_live_questions"));
                            if (C1H6.A03()) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            A004.A9K("is_dark_mode", Long.valueOf(j));
                            A004.A9K("tab_index", (Long) A012.A01(C5I8.A8o));
                            A004.AAP("nav_chain", C1QM.A00.A02.A00);
                            A004.A9K("guest_id", c19260xA.A04("guest_id"));
                            if (c19260xA.A03("is_replay") != null) {
                                l2 = Long.valueOf(r0.intValue());
                            } else {
                                l2 = null;
                            }
                            A004.A9K("is_replay", l2);
                            A004.A8I("time_remaining", (Double) A012.A01(C5I8.A9A));
                            A004.AAP("is_coming_from", (String) A012.A01(C5I8.A43));
                            A004.A9K("effect_id", (Long) A012.A01(C5I8.A2P));
                            A004.A9K("media_face_effect_id", (Long) A012.A01(C5I8.A5I));
                            String str2 = (String) A012.A01(C5I8.A9W);
                            if (str2 != null) {
                                l3 = AbstractC003100w.A0k(10, str2);
                            } else {
                                l3 = null;
                            }
                            A004.A9K("tray_pos_excl_own_story", l3);
                            A004.AAP("ranking_info_token", (String) A012.A01(C5I8.A6r));
                            A004.AAP("reply_type", c19260xA.A05("reply_type"));
                            A004.AAP("explore_topic_session_id", (String) A012.A01(C5I8.A2h));
                            C11500j9 c11500j92 = C5I8.A9P;
                            A004.A9K("top_liker_count", (Long) A012.A01(c11500j92));
                            A004.A9K("reel_gap_to_last_ad", (Long) A012.A01(C5I8.A7U));
                            A004.A9K("reel_gap_to_last_netego", (Long) A012.A01(C5I8.A7V));
                            A004.AAP("search_session_id", (String) A012.A01(C5I8.A7v));
                            A004.A7v("is_influencer", (Boolean) A012.A01(C5I8.A4P));
                            A004.A9K("media_type", (Long) A012.A01(C5I8.A5c));
                            A004.AAP("position", String.valueOf(i2));
                            A004.A7v("is_besties_reel", (Boolean) A012.A01(C5I8.A41));
                            A004.AAP("impression_token", c19260xA.A05("impression_token"));
                            A004.AAP("algorithm", c19260xA.A05("algorithm"));
                            A004.AAP("media_tags_hashtag_name", (String) A012.A01(C5I8.A5X));
                            A004.A9K("media_tags_total_hashtags", (Long) A012.A01(C5I8.A5Y));
                            A004.A7v("is_besties_media", (Boolean) A012.A01(C5I8.A40));
                            String A2u = c38321qM.A2u();
                            if (A2u != null) {
                                A004.A9K("media_id", AbstractC003100w.A0k(10, A2u));
                                A004.A9K("ad_position_from_server", (Long) A012.A01(C5I8.A0I));
                                A004.A7v("is_reshare", c19260xA.A01("is_reshare"));
                                A004.A9K("top_followers_count", (Long) A012.A01(C5I8.A9N));
                                A004.A9K("top_likers_count", (Long) A012.A01(c11500j92));
                                A004.A9K("dr_ad_type", (Long) A012.A01(C5I8.A2K));
                                A004.A9K("min_consumed_media_gap_to_previous_ad", (Long) A012.A01(C5I8.A5j));
                                A004.A9K("min_consumed_media_gap_to_previous_netego", (Long) A012.A01(C5I8.A5k));
                                A004.A9K("min_consumed_reel_gap_to_previous_ad", (Long) A012.A01(C5I8.A5l));
                                A004.A9K("min_consumed_reel_gap_to_previous_netego", (Long) A012.A01(C5I8.A5m));
                                A004.AAP("entity_page_type", c19260xA.A05("entity_page_type"));
                                A004.AAP("counter_channel", (String) A012.A01(C5I8.A1f));
                                String str3 = (String) A012.A01(C5I8.A1g);
                                if (str3 != null) {
                                    l4 = AbstractC003100w.A0k(10, str3);
                                } else {
                                    l4 = null;
                                }
                                A004.A9K("counter_id", l4);
                                String str4 = (String) A012.A01(C5I8.A1h);
                                if (str4 != null) {
                                    l5 = AbstractC003100w.A0k(10, str4);
                                }
                                A004.A9K("counter_sid", l5);
                                A004.A9K(TraceFieldType.BroadcastId, c19260xA.A04(TraceFieldType.BroadcastId));
                                A004.AAP("a_i", (String) A012.A01(c11500j9));
                                A004.AAP("tray_rank_token", c19260xA.A05("tray_rank_token"));
                                A004.A9K("ad_inserted_position", (Long) A012.A01(C5I8.A0D));
                                A004.A9K("sponsor_tag_id", c19260xA.A04("bc_tagged_partner"));
                                A004.AAP("playback_format", c19260xA.A05("playback_format"));
                                A004.A7v("is_pride_media", (Boolean) A012.A01(C5I8.A4e));
                                A004.A7v("is_pride_reel", (Boolean) A012.A01(C5I8.A4f));
                                A004.Cht();
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        return;
                    }
                    return;
                }
                C32U.A0C(userSession, A02, c1ni, A00, null);
            }
        }
    }

    @Override // X.C30V
    public final void Cm8(C82413m5 c82413m5, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2, long j) {
        C14360o3.A0B(c1ni, 1);
        if ((c1ni instanceof Reel) && !((Reel) c1ni).CdW()) {
            return;
        }
        C145836hg A00 = A00(c1ni, this);
        UserSession userSession = this.A06;
        C82713mZ A002 = AbstractC37955Gmx.A00(userSession, c1ni, A00, "time_spent");
        A002.A0B(j);
        A04(A002, A02(c1ni), this);
        C32U.A0C(userSession, A002, c1ni, A00, null);
    }

    @Override // X.C30V
    public final void CmR(C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C38321qM c38321qM;
        Long valueOf;
        long j;
        C14360o3.A0B(c1ni, 1);
        if (c1ni instanceof C41181vS) {
            C41181vS c41181vS = (C41181vS) c1ni;
            if (!c41181vS.CdW()) {
                C145836hg A00 = A00(c1ni, this);
                UserSession userSession = this.A06;
                C82713mZ A02 = AbstractC37955Gmx.A02(userSession, A00, c41181vS, "viewed_impression");
                C37948Gmq A022 = A02(c1ni);
                C3R6 c3r6 = C3R6.A00;
                C41181vS A002 = C3R6.A00(userSession, c1ni);
                A04(A02, A022, this);
                c3r6.A0D(A02, A022);
                if (A002 != null) {
                    A02.A1Y = Boolean.valueOf(A002.A1K());
                }
                Long l = null;
                if (!c41181vS.CdW()) {
                    C18920wW A01 = AbstractC12220kQ.A01(A00, userSession);
                    InterfaceC02590Ai A003 = A01.A00(A01.A00, "instagram_organic_viewed_impression");
                    if (A003.isSampled()) {
                        if (A002 != null) {
                            c38321qM = A002.A0b;
                        } else {
                            c38321qM = null;
                        }
                        C11520jB A012 = A02.A01();
                        C19260xA c19260xA = A02.A00().A06;
                        if (c38321qM != null) {
                            A003.A9K("a_pk", Long.valueOf(AbstractC128985sJ.A00(userSession, c38321qM)));
                            A003.AAP("action", AbstractC128985sJ.A08(c38321qM));
                            A003.AAP("follow_status", AbstractC128985sJ.A06(userSession, c38321qM));
                            A003.A9K("imp_logger_ver", 24L);
                            A003.AAP("inventory_source", c38321qM.A0C.BJN());
                            if (i2 == -1) {
                                valueOf = null;
                            } else {
                                valueOf = Long.valueOf(i2);
                            }
                            A003.A9K("m_ix", valueOf);
                            A003.AAP("m_pk", AbstractC128985sJ.A09(c38321qM));
                            A003.A9T("feed_sticker_media_id", A012.A01(C5I8.A2r));
                            if (c19260xA.A03("is_replay") != null) {
                                l = Long.valueOf(r0.intValue());
                            }
                            A003.A9T("is_replay", l);
                            A003.A7v("is_ad", Boolean.valueOf(c41181vS.CdW()));
                            A003.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
                            A003.A9K("m_ts", Long.valueOf(c38321qM.A1B()));
                            A003.A8I("media_time_elapsed", Double.valueOf(-1.0d));
                            A003.AAP("reel_id", (String) A012.A01(C5I8.A7W));
                            A003.A9K("reel_position", (Long) A012.A01(C5I8.A7X));
                            A003.A9K("reel_size", (Long) A012.A01(C5I8.A7Y));
                            A003.A9K("reel_start_position", (Long) A012.A01(C5I8.A7Z));
                            A003.AAP("reel_type", (String) A012.A01(C5I8.A7b));
                            A003.A9K("reel_viewer_position", (Long) A012.A01(C5I8.A7e));
                            A003.A9K("session_reel_counter", (Long) A012.A01(C5I8.A84));
                            A003.AAP("source_of_action", (String) A012.A01(C5I8.A8G));
                            A003.A9K("sponsor_tag_count", (Long) A012.A01(C5I8.A8L));
                            A003.AAP("story_ranking_token", (String) A012.A01(C5I8.A8U));
                            A003.A8I("time_elapsed", (Double) A012.A01(C5I8.A95));
                            A003.A8I("time_remaining", (Double) A012.A01(C5I8.A9A));
                            A003.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c19260xA.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                            A003.AAP("topic_cluster_debug_info", (String) A012.A01(C5I8.A9I));
                            A003.AAP("topic_cluster_id", (String) A012.A01(C5I8.A9J));
                            A003.AAP("topic_cluster_title", (String) A012.A01(C5I8.A9L));
                            A003.AAP("topic_cluster_type", (String) A012.A01(C5I8.A9M));
                            A003.AAP("tracking_token", AbstractC128985sJ.A07(userSession, c38321qM, interfaceC60442pS));
                            A003.A9K("tray_position", (Long) A012.A01(C5I8.A9V));
                            A003.AAP("tray_session_id", (String) A012.A01(C5I8.A7a));
                            A003.AAP("viewer_session_id", (String) A012.A01(C5I8.A9o));
                            A003.A7v("can_add_to_bag", c19260xA.A01("can_add_to_bag"));
                            A003.A8I("elapsed_time_since_last_item", (Double) A012.A01(C5I8.A2Q));
                            A003.A7v("is_acp_delivered", false);
                            A003.A7v("is_highlights_sourced", (Boolean) A012.A01(C5I8.A4L));
                            A003.AAP(AbstractC58410Puo.A01(9, 10, 53), (String) A012.A01(C5I8.A83));
                            A003.AAP("feed_request_id", (String) A012.A01(C5I8.A8E));
                            A003.A9K("entity_id", (Long) A012.A01(C5I8.A2a));
                            A003.AAP("entity_name", (String) A012.A01(C5I8.A2b));
                            A003.A7v("is_igtv", Boolean.valueOf(c38321qM.A5g()));
                            if (C1H6.A03()) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            A003.A9K("is_dark_mode", Long.valueOf(j));
                            A003.AAP("audience", (String) A012.A01(C5I8.A0W));
                            A003.A9K("tab_index", (Long) A012.A01(C5I8.A8o));
                            A003.AAP("collection_id", (String) A012.A01(C5I8.A1L));
                            A003.AAP("collection_name", (String) A012.A01(C5I8.A1N));
                            A003.AAP("nav_chain", C1QM.A00.A02.A00);
                            A003.A9K("is_live_streaming", c19260xA.A04("is_live_streaming"));
                            A003.A9K("is_live_questions", c19260xA.A04("is_live_questions"));
                            A003.A7v("is_influencer", (Boolean) A012.A01(C5I8.A4P));
                            A003.A9K("effect_id", (Long) A012.A01(C5I8.A2P));
                            A003.A9K("media_face_effect_id", (Long) A012.A01(C5I8.A5I));
                            A003.AAP("ranking_info_token", (String) A012.A01(C5I8.A6r));
                            A003.AAP("reply_type", c19260xA.A05("reply_type"));
                            A003.A9K("guest_id", c19260xA.A04("guest_id"));
                            A003.A9K("top_liker_count", (Long) A012.A01(C5I8.A9P));
                            A003.A9K("top_followers_count", (Long) A012.A01(C5I8.A9N));
                            A003.A9K("top_likers_count", (Long) A012.A01(C5I8.A9O));
                            A003.A9K("dr_ad_type", (Long) A012.A01(C5I8.A2K));
                            A003.A7v("is_besties_reel", (Boolean) A012.A01(C5I8.A41));
                            A003.AAP("search_session_id", (String) A012.A01(C5I8.A7v));
                            A003.AAP("is_programmatic_scroll", (String) A012.A01(C5I8.A4h));
                            A003.A7v("is_besties_media", (Boolean) A012.A01(C5I8.A40));
                            A003.AAP("impression_token", c19260xA.A05("impression_token"));
                            String A2u = c38321qM.A2u();
                            if (A2u != null) {
                                A003.A9K("media_id", AbstractC003100w.A0k(10, A2u));
                                A003.A9K("media_author_id", (Long) A012.A01(C5I8.A5G));
                                A003.A9K("media_type", (Long) A012.A01(C5I8.A5c));
                                A003.AAP("position", String.valueOf(i2));
                                A003.A9K("reel_gap_to_last_ad", (Long) A012.A01(C5I8.A7U));
                                A003.A9K("reel_gap_to_last_netego", (Long) A012.A01(C5I8.A7V));
                                A003.A7v("is_reshare", c19260xA.A01("is_reshare"));
                                A003.A9K("ad_position_from_server", (Long) A012.A01(C5I8.A0I));
                                A003.AAP("entity_page_type", c19260xA.A05("entity_page_type"));
                                A003.A9K("min_consumed_media_gap_to_previous_ad", (Long) A012.A01(C5I8.A5j));
                                A003.A9K("min_consumed_media_gap_to_previous_netego", (Long) A012.A01(C5I8.A5k));
                                A003.A9K("min_consumed_reel_gap_to_previous_ad", (Long) A012.A01(C5I8.A5l));
                                A003.A9K("min_consumed_reel_gap_to_previous_netego", (Long) A012.A01(C5I8.A5m));
                                A003.AAP("explore_topic_session_id", (String) A012.A01(C5I8.A2h));
                                A003.A7v("is_pride_media", (Boolean) A012.A01(C5I8.A4e));
                                A003.A7v("is_pride_reel", (Boolean) A012.A01(C5I8.A4f));
                                A003.AAP("algorithm", c19260xA.A05("algorithm"));
                                A003.Cht();
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        return;
                    }
                    return;
                }
                C32U.A0C(userSession, A02, c1ni, A00, null);
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        this.A07.D8S(view);
    }

    public static final C145836hg A00(C1NI c1ni, C145826hf c145826hf) {
        Reel A0M;
        if (c1ni instanceof Reel) {
            A0M = (Reel) c1ni;
        } else if (c1ni instanceof C41181vS) {
            A0M = ReelStore.A03(c145826hf.A06).A0M(((C41181vS) c1ni).A0k);
        } else {
            throw new UnsupportedOperationException("This item does not represent an ImpressionItem");
        }
        return A01(A0M, c145826hf);
    }

    public static final C145836hg A01(Reel reel, C145826hf c145826hf) {
        if (reel != null) {
            c145826hf.A0A.A00 = reel;
        }
        return c145826hf.A0A;
    }

    private final C37948Gmq A02(C1NI c1ni) {
        Map map;
        String CGe;
        if (c1ni instanceof Reel) {
            map = this.A0J;
            CGe = ((Reel) c1ni).getId();
        } else if (c1ni instanceof C41181vS) {
            map = this.A0I;
            CGe = ((C41181vS) c1ni).CGe();
        } else {
            throw new UnsupportedOperationException("This item does not represent an ImpressionItem");
        }
        return (C37948Gmq) map.get(CGe);
    }

    public static final void A03(C82713mZ c82713mZ, C41551w4 c41551w4, C145826hf c145826hf, C141596ac c141596ac) {
        UserSession userSession = c145826hf.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        C38321qM c38321qM = A08.A0b;
        if (c38321qM != null) {
            c82713mZ.A0G(userSession, c38321qM);
            C3R6.A03(c145826hf.A04, c82713mZ);
            float f = c141596ac.A0A;
            double d = (c141596ac.A0B * f) / 1000.0d;
            c82713mZ.A2Z = Double.valueOf(d);
            c82713mZ.A2c = Double.valueOf((f / 1000.0d) - d);
            A04(c82713mZ, (C37948Gmq) c145826hf.A0I.get(A08.CGe()), c145826hf);
            C32U.A0I(userSession, c82713mZ, c145826hf.A0A, C05F.A01);
        }
    }

    public static final void A04(C82713mZ c82713mZ, C37948Gmq c37948Gmq, C145826hf c145826hf) {
        if (c37948Gmq != null) {
            C3R6.A09(c82713mZ, c37948Gmq);
            c82713mZ.A6n = c145826hf.A0H;
            c82713mZ.A7X = c145826hf.A0E.getSessionId();
            c82713mZ.A79 = c145826hf.A0G;
        }
    }

    public final void A09(C41181vS c41181vS, C41551w4 c41551w4) {
        if (!c41181vS.A1O()) {
            UserSession userSession = this.A06;
            int A03 = c41551w4.A03(userSession, c41181vS);
            Reel reel = c41551w4.A0H;
            if (reel.A1P) {
                if (reel.A16(userSession)) {
                    this.A0C.A04.put("nux_story", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                }
                String str = reel.A0q;
                if (str != null && reel.A0O(userSession).indexOf(c41181vS) == 0) {
                    long millis = TimeUnit.SECONDS.toMillis(SandboxRepository.CACHE_TTL);
                    AbstractC54912fq.A00();
                    C14360o3.A0B(userSession, 0);
                    C31212Dnv A00 = AbstractC31211Dnu.A00(userSession);
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    long j = -1;
                    if (str.equals(interfaceC19630xq.getString("qp_reel_tray_last_impressed_promotion_id", null))) {
                        j = interfaceC19630xq.getLong("qp_reel_tray_last_impressed_promotion_time_millis", -1L);
                    }
                    if (j <= currentTimeMillis - millis) {
                        QuickPromotionSurface quickPromotionSurface = QuickPromotionSurface.A0G;
                        C19280xC A002 = C19280xC.A00(A00, "view");
                        UserSession userSession2 = A00.A00;
                        C14360o3.A0A(A002);
                        A002.A08(Integer.valueOf(quickPromotionSurface.A00), "nux_id");
                        A002.A0C("promotion_id", str);
                        AbstractC11060iN.A00(userSession2).EIu(A002);
                        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                        ARD.E7K("qp_reel_tray_last_impressed_promotion_id", str);
                        ARD.E7G("qp_reel_tray_last_impressed_promotion_time_millis", currentTimeMillis);
                        ARD.apply();
                    }
                }
            } else if (c41181vS.CY4() && !reel.A0b()) {
                C64022vN c64022vN = this.A0C;
                String id = reel.getId();
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    c64022vN.A06(id, userSession, c38321qM);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (reel.A0t()) {
                C41618Ib8 c41618Ib8 = c41181vS.A0E;
                c41618Ib8.getClass();
                H6O h6o = c41618Ib8.A03.A00;
                C64022vN c64022vN2 = this.A0C;
                User user = c41181vS.A0i;
                if (user != null) {
                    String str2 = h6o.A02;
                    if (str2 != null) {
                        if (h6o.A01 != null) {
                            C64022vN.A02(user, str2, "SUPERLATIVE", c64022vN2.A03, r0.intValue());
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            reel.A0S(userSession, c41181vS.A03());
            C38321qM c38321qM2 = c41181vS.A0b;
            if (c38321qM2 != null) {
                List singletonList = Collections.singletonList(c38321qM2.getId());
                C14360o3.A07(singletonList);
                reel.A0U(userSession, singletonList);
            }
            java.util.Set set = this.A0K;
            if (!set.contains(reel.getId())) {
                String id2 = reel.getId();
                C14360o3.A07(id2);
                set.add(id2);
                this.A07.A01(C81493kJ.A02, reel, A03);
            }
            this.A07.A01(C81493kJ.A02, c41181vS, A03);
        }
    }

    public final void A0B(C41181vS c41181vS, C41551w4 c41551w4, Integer num) {
        Long l;
        long j;
        String str;
        String str2;
        Long l2;
        Integer num2;
        Long l3;
        String str3;
        String str4;
        String str5;
        Integer num3;
        String str6;
        C145816he c145816he = this.A01;
        if (c145816he != null) {
            UserSession userSession = c145816he.A03;
            InterfaceC11380iw interfaceC11380iw = c145816he.A01;
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ad_pivots_carousel_banner_click");
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            Boolean bool = null;
            if (A07 != null) {
                l = AbstractC003100w.A0k(10, A07);
            } else {
                l = null;
            }
            if (A00.isSampled() && l != null) {
                A00.A9K("ad_id", l);
                InterfaceC101944i9 interfaceC101944i9 = c145816he.A00;
                if (interfaceC101944i9 != null) {
                    j = interfaceC101944i9.CNR(c41551w4);
                } else {
                    j = 0;
                }
                A00.A9K("chaining_position", Long.valueOf(j));
                C1M1 c1m1 = c145816he.A04;
                A00.AAP("chaining_session_id", c1m1.getSessionId());
                A00.AAP("client_session_id", c1m1.getSessionId());
                A00.AAP("contextual_ads_category", "");
                A00.AAk("position", AbstractC16960so.A1N(0L, Long.valueOf(c41551w4.A01)));
                Reel reel = c41551w4.A0H;
                IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                if (intentAwareAdsInfo != null) {
                    str = intentAwareAdsInfo.A09;
                } else {
                    str = null;
                }
                A00.AAP("trigger_type", str);
                switch (num.intValue()) {
                    case 0:
                        str2 = "CTA";
                        break;
                    case 1:
                        str2 = "PROFILE_NAME";
                        break;
                    default:
                        str2 = "PROFILE_IMAGE";
                        break;
                }
                A00.AAP("click_type", str2);
                IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                if (intentAwareAdsInfo2 != null && (str6 = intentAwareAdsInfo2.A07) != null) {
                    l2 = AbstractC003100w.A0k(10, str6);
                } else {
                    l2 = null;
                }
                A00.A9K("hscroll_seed_ad_id", l2);
                A00.AAP("container_module", interfaceC11380iw.getModuleName());
                IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                if (intentAwareAdsInfo3 != null) {
                    num2 = intentAwareAdsInfo3.A02;
                } else {
                    num2 = null;
                }
                A00.AAP("multi_ads_type", String.valueOf(num2));
                IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                if (intentAwareAdsInfo4 != null && (num3 = intentAwareAdsInfo4.A02) != null) {
                    l3 = Long.valueOf(num3.intValue());
                } else {
                    l3 = null;
                }
                A00.A9K("multi_ads_type_number", l3);
                IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                if (intentAwareAdsInfo5 != null) {
                    str3 = intentAwareAdsInfo5.A06;
                } else {
                    str3 = null;
                }
                A00.AAP("multi_ads_id", str3);
                IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                if (intentAwareAdsInfo6 != null) {
                    str4 = intentAwareAdsInfo6.A06;
                } else {
                    str4 = null;
                }
                A00.AAP("multi_ads_unit_id", str4);
                IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                if (intentAwareAdsInfo7 != null) {
                    str5 = intentAwareAdsInfo7.A04;
                } else {
                    str5 = null;
                }
                A00.AAP("insertion_mechanism", str5);
                IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                if (intentAwareAdsInfo8 != null) {
                    bool = intentAwareAdsInfo8.A01;
                }
                A00.A7v("is_seed_ad_multi_ads_eligible", bool);
                A00.AAP("tracking_token", c41181vS.BzL(userSession));
                A00.Cht();
            }
        }
    }

    public final void A0C(C41181vS c41181vS, C41551w4 c41551w4, Integer num) {
        Long l;
        long j;
        String str;
        String str2;
        Long l2;
        Integer num2;
        Long l3;
        String str3;
        String str4;
        String str5;
        Integer num3;
        String str6;
        C145816he c145816he = this.A01;
        if (c145816he != null) {
            UserSession userSession = c145816he.A03;
            InterfaceC11380iw interfaceC11380iw = c145816he.A01;
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ad_pivots_carousel_banner_tooltip_click");
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            Boolean bool = null;
            if (A07 != null) {
                l = AbstractC003100w.A0k(10, A07);
            } else {
                l = null;
            }
            if (A00.isSampled() && l != null) {
                A00.A9K("ad_id", l);
                InterfaceC101944i9 interfaceC101944i9 = c145816he.A00;
                if (interfaceC101944i9 != null) {
                    j = interfaceC101944i9.CNR(c41551w4);
                } else {
                    j = 0;
                }
                A00.A9K("chaining_position", Long.valueOf(j));
                C1M1 c1m1 = c145816he.A04;
                A00.AAP("chaining_session_id", c1m1.getSessionId());
                A00.AAP("client_session_id", c1m1.getSessionId());
                A00.AAP("contextual_ads_category", "");
                A00.AAk("position", AbstractC16960so.A1N(0L, Long.valueOf(c41551w4.A01)));
                Reel reel = c41551w4.A0H;
                IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                if (intentAwareAdsInfo != null) {
                    str = intentAwareAdsInfo.A09;
                } else {
                    str = null;
                }
                A00.AAP("trigger_type", str);
                switch (num.intValue()) {
                    case 0:
                        str2 = "CTA";
                        break;
                    case 1:
                        str2 = "PROFILE_NAME";
                        break;
                    default:
                        str2 = "PROFILE_IMAGE";
                        break;
                }
                A00.AAP("click_type", str2);
                IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                if (intentAwareAdsInfo2 != null && (str6 = intentAwareAdsInfo2.A07) != null) {
                    l2 = AbstractC003100w.A0k(10, str6);
                } else {
                    l2 = null;
                }
                A00.A9K("hscroll_seed_ad_id", l2);
                A00.AAP("container_module", interfaceC11380iw.getModuleName());
                IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                if (intentAwareAdsInfo3 != null) {
                    num2 = intentAwareAdsInfo3.A02;
                } else {
                    num2 = null;
                }
                A00.AAP("multi_ads_type", String.valueOf(num2));
                IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                if (intentAwareAdsInfo4 != null && (num3 = intentAwareAdsInfo4.A02) != null) {
                    l3 = Long.valueOf(num3.intValue());
                } else {
                    l3 = null;
                }
                A00.A9K("multi_ads_type_number", l3);
                IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                if (intentAwareAdsInfo5 != null) {
                    str3 = intentAwareAdsInfo5.A06;
                } else {
                    str3 = null;
                }
                A00.AAP("multi_ads_id", str3);
                IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                if (intentAwareAdsInfo6 != null) {
                    str4 = intentAwareAdsInfo6.A06;
                } else {
                    str4 = null;
                }
                A00.AAP("multi_ads_unit_id", str4);
                IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                if (intentAwareAdsInfo7 != null) {
                    str5 = intentAwareAdsInfo7.A04;
                } else {
                    str5 = null;
                }
                A00.AAP("insertion_mechanism", str5);
                IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                if (intentAwareAdsInfo8 != null) {
                    bool = intentAwareAdsInfo8.A01;
                }
                A00.A7v("is_seed_ad_multi_ads_eligible", bool);
                A00.AAP("tracking_token", c41181vS.BzL(userSession));
                A00.Cht();
            }
        }
    }

    public final void A0E(C41551w4 c41551w4, C84823qW c84823qW) {
        Long l;
        String str;
        String id;
        C41181vS A08 = c41551w4.A08(this.A06);
        C38321qM c38321qM = A08.A0b;
        if (c38321qM != null) {
            C37948Gmq c37948Gmq = (C37948Gmq) this.A0I.get(A08.CGe());
            if (c37948Gmq != null) {
                C18920wW c18920wW = this.A05;
                C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_organic_story_media_reshare"), 309);
                String str2 = null;
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    C141596ac c141596ac = c37948Gmq.A05;
                    double d = (c141596ac.A0A * c141596ac.A0B) / 1000.0d;
                    String id2 = c38321qM.getId();
                    if (id2 != null) {
                        c25531Mh.A0l(id2);
                        c25531Mh.A0Q("m_t", Long.valueOf(c38321qM.BRp().A00));
                        Reel reel = c41551w4.A0H;
                        String id3 = reel.getId();
                        C14360o3.A07(id3);
                        c25531Mh.A0R("reel_id", id3);
                        c25531Mh.A0R("tray_session_id", this.A0H);
                        c25531Mh.A0R("viewer_session_id", this.A0E.getSessionId());
                        C1NB c1nb = reel.A0W;
                        if (c1nb != null && (id = c1nb.getId()) != null) {
                            l = AbstractC003100w.A0k(10, id);
                        } else {
                            l = null;
                        }
                        c25531Mh.A0Q("a_pk", l);
                        ProductType productType = c84823qW.A0n;
                        if (productType != null) {
                            str2 = productType.A00;
                        }
                        c25531Mh.A0R("tapped_media_product_type", str2);
                        c25531Mh.A0R("tapped_media_id", c84823qW.A1b);
                        UpcomingEventImpl upcomingEventImpl = c84823qW.A1B;
                        if (upcomingEventImpl != null) {
                            str = upcomingEventImpl.A0B;
                        } else {
                            str = c84823qW.A1n;
                        }
                        c25531Mh.A0R("upcoming_event_id", str);
                        c25531Mh.A0Q("reel_position", Long.valueOf(c37948Gmq.A00()));
                        c25531Mh.A0Q("reel_size", Long.valueOf(c37948Gmq.A02.A0O(c37948Gmq.A01).size()));
                        c25531Mh.A0P("time_elapsed", Double.valueOf(d));
                        c25531Mh.A0Q("tray_position", Long.valueOf(c37948Gmq.A04.A0E));
                        c25531Mh.Cht();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            return;
        }
        String str3 = A08.A0j;
        String id4 = c41551w4.A0H.getId();
        C14360o3.A07(id4);
        C0w9.A03("ReelViewerLogger", AnonymousClass001.A0u("Missing media ID for reel item: ", str3, ", In reel: ", id4));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(X.C41551w4 r12, X.C84823qW r13, java.lang.Boolean r14, java.lang.String r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145826hf.A0G(X.1w4, X.3qW, java.lang.Boolean, java.lang.String, int, int):void");
    }

    public final void A0H(C41551w4 c41551w4, C84823qW c84823qW, Boolean bool, String str, String str2) {
        String str3;
        C38321qM c38321qM;
        C37948Gmq c37948Gmq;
        User A2E;
        String name;
        long j;
        String str4;
        int i;
        int i2;
        UserSession userSession = this.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        if (A08.CY4()) {
            C38321qM c38321qM2 = A08.A0b;
            if (c38321qM2 != null) {
                if (!c38321qM2.CdW() && "hashtag_attempt".equals(str)) {
                    C41181vS A082 = c41551w4.A08(userSession);
                    C1NB c1nb = c41551w4.A0H.A0W;
                    if (c1nb != null && (c38321qM = A082.A0b) != null && (c37948Gmq = (C37948Gmq) this.A0I.get(A082.CGe())) != null) {
                        C141596ac c141596ac = c37948Gmq.A05;
                        C18920wW c18920wW = this.A05;
                        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_organic_hashtag_attempt"), 302);
                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled() && (A2E = c38321qM.A2E(userSession)) != null && (name = A2E.B7L().name()) != null) {
                            String id = c1nb.getId();
                            C14360o3.A0B(id, 0);
                            Long A0k = AbstractC003100w.A0k(10, id);
                            long j2 = 0;
                            if (A0k != null) {
                                j = A0k.longValue();
                            } else {
                                j = 0;
                            }
                            c25531Mh.A0Q("a_pk", Long.valueOf(j));
                            c25531Mh.A0j("hashtag_attempt");
                            c25531Mh.A0P("elapsed_time_since_last_item", Double.valueOf(-1.0d));
                            c25531Mh.A0R("follow_status", name);
                            c25531Mh.A0R("from", c84823qW.A1g);
                            if (c84823qW.A1u) {
                                str4 = "hashtag_sticker";
                            } else {
                                str4 = "caption_hashtag";
                            }
                            c25531Mh.A0R("hashtag_type", str4);
                            c25531Mh.A0R("hashtag", str2);
                            c25531Mh.A0O("is_acp_delivered", false);
                            c25531Mh.A0O("is_video_to_carousel", Boolean.valueOf(c37948Gmq.A07));
                            c25531Mh.A0l(AbstractC128985sJ.A09(c38321qM));
                            c25531Mh.A0Q("m_t", Long.valueOf(c38321qM.BRp().A00));
                            long A1B = c38321qM.A1B();
                            if (Long.valueOf(A1B) != null) {
                                j2 = A1B;
                            }
                            c25531Mh.A0Q("m_ts", Long.valueOf(j2));
                            Reel reel = c37948Gmq.A02;
                            String id2 = reel.getId();
                            C14360o3.A07(id2);
                            c25531Mh.A0R("reel_id", id2);
                            c25531Mh.A0Q("reel_position", Long.valueOf(c37948Gmq.A00()));
                            UserSession userSession2 = c37948Gmq.A01;
                            c25531Mh.A0Q("reel_size", Long.valueOf(reel.A0O(userSession2).size()));
                            C41551w4 c41551w42 = c37948Gmq.A04;
                            if (c41551w42.A0L) {
                                i = 0;
                            } else {
                                i = c41551w42.A00;
                            }
                            c25531Mh.A0Q("reel_start_position", Long.valueOf(i));
                            String str5 = "";
                            c25531Mh.A0R("reel_type", reel.A0H(userSession2));
                            c25531Mh.A0Q("reel_viewer_position", Long.valueOf(c141596ac.A0I));
                            c25531Mh.A0Q("session_reel_counter", Long.valueOf(c37948Gmq.A00));
                            c25531Mh.A0R("source_of_action", A00(A082, this).getModuleName());
                            String str6 = this.A0G;
                            if (str6 == null) {
                                str6 = "";
                            }
                            c25531Mh.A0R("story_ranking_token", str6);
                            c25531Mh.A0P("time_elapsed", Double.valueOf((c141596ac.A0B * c141596ac.A0A) / 1000.0d));
                            String A33 = c38321qM.A33();
                            if (A33 != null) {
                                str5 = A33;
                            }
                            c25531Mh.A0R("tracking_token", str5);
                            Long valueOf = Long.valueOf(c41551w42.A0E);
                            c25531Mh.A0Q("tray_position", valueOf);
                            c25531Mh.A0R("tray_session_id", this.A0H);
                            c25531Mh.A0R("viewer_session_id", this.A0E.getSessionId());
                            if (reel.A17(userSession2)) {
                                i2 = reel.A00;
                            } else {
                                i2 = -1;
                            }
                            c25531Mh.A0Q("carousel_opt_in_position", Long.valueOf(i2));
                            if (c37948Gmq.A03.CdW()) {
                                c25531Mh.A0Q("ad_position_from_server", valueOf);
                            }
                            c25531Mh.Cht();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C82713mZ A02 = AbstractC37955Gmx.A02(userSession, A01(c41551w4.A0H, this), A08, str);
                A02.A5Z = str2;
                A02.A5R = c84823qW.A1g;
                if (c84823qW.A1u) {
                    str3 = "hashtag_sticker";
                } else {
                    str3 = "caption_hashtag";
                }
                A02.A5b = str3;
                if (bool != null) {
                    A02.A2F = Boolean.valueOf(bool.booleanValue());
                }
                A04(A02, (C37948Gmq) this.A0I.get(A08.CGe()), this);
                C32U.A0C(userSession, A02, c38321qM2, this.A0A, null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0J(C41551w4 c41551w4, C141596ac c141596ac, C130935vh c130935vh) {
        UserSession userSession = this.A06;
        C82713mZ A02 = AbstractC37955Gmx.A02(userSession, A01(c41551w4.A0H, this), c41551w4.A08(userSession), "gesture");
        A02.A12 = c130935vh;
        A02.A7T = "swipe_up";
        A03(A02, c41551w4, this, c141596ac);
    }

    public final void A0L(C41551w4 c41551w4, C141596ac c141596ac, String str, String str2) {
        C37948Gmq c37948Gmq;
        FollowStatus followStatus;
        if (c41551w4 != null && c141596ac != null) {
            UserSession userSession = this.A06;
            C41181vS A08 = c41551w4.A08(userSession);
            Long l = null;
            if (A08.CY4() && (c37948Gmq = (C37948Gmq) this.A0I.get(A08.CGe())) != null) {
                C38321qM c38321qM = A08.A0b;
                c38321qM.getClass();
                Reel reel = c41551w4.A0H;
                C1NB c1nb = reel.A0W;
                C145836hg c145836hg = this.A0A;
                c145836hg.A00 = reel;
                C18920wW A01 = AbstractC12220kQ.A01(c145836hg, userSession);
                C25531Mh c25531Mh = new C25531Mh(A01.A00(A01.A00, "ig_story_quick_reaction"), 243);
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    String id = c38321qM.getId();
                    if (id != null) {
                        c25531Mh.A0l(id);
                        c25531Mh.A0Q("m_t", Long.valueOf(c38321qM.BRp().A00));
                        c25531Mh.A0P("time_elapsed", Double.valueOf((c141596ac.A0B * c141596ac.A0A) / 1000.0d));
                        c25531Mh.A0P("time_remaining", Double.valueOf((Math.max(0.0f, 1.0f - c141596ac.A0B) * c141596ac.A0A) / 1000.0d));
                        c25531Mh.A0R("tray_session_id", this.A0H);
                        c25531Mh.A0R("viewer_session_id", this.A0E.getSessionId());
                        Reel reel2 = c37948Gmq.A02;
                        String id2 = reel2.getId();
                        C14360o3.A07(id2);
                        c25531Mh.A0R("reel_id", id2);
                        c25531Mh.A0j(str);
                        c25531Mh.A0R("quick_reaction_type", str2);
                        c25531Mh.A0R("reel_type", reel2.A0H(c37948Gmq.A01));
                        c25531Mh.A0R("inventory_source", c38321qM.A0C.BJN());
                        c25531Mh.A0Q("reel_size", Long.valueOf(reel2.A0O(r8).size()));
                        Parcelable.Creator creator = User.CREATOR;
                        User A2E = c38321qM.A2E(userSession);
                        if (A2E != null) {
                            followStatus = A2E.B7L();
                        } else {
                            followStatus = null;
                        }
                        c25531Mh.A0R("follow_status", AbstractC38851rI.A06(followStatus));
                        c25531Mh.A0O("first_view", Boolean.valueOf(c37948Gmq.A06));
                        c25531Mh.A0Q("tray_position", Long.valueOf(c37948Gmq.A04.A0E));
                        Hashtag B7K = c38321qM.A0C.B7K();
                        if (B7K != null) {
                            String id3 = B7K.getId();
                            if (id3 != null) {
                                l = AbstractC003100w.A0k(10, id3);
                            }
                            c25531Mh.A0Q("hashtag_id", l);
                        }
                        if (c1nb instanceof C1N9) {
                            c25531Mh.A0Q("a_pk", AbstractC003100w.A0k(10, ((C1N9) c1nb).getId()));
                        } else if (c1nb instanceof C6ZI) {
                            C6ZI c6zi = (C6ZI) c1nb;
                            String str3 = c6zi.A00.A07;
                            C14360o3.A0B(str3, 0);
                            c25531Mh.A0Q("o_pk", AbstractC003100w.A0k(10, str3));
                            c25531Mh.A0R("o_t", c6zi.A00());
                        }
                        c25531Mh.Cht();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    public final void A0O(C41551w4 c41551w4, String str) {
        UserSession userSession = this.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        if (A08.CY4()) {
            C38321qM c38321qM = A08.A0b;
            c38321qM.getClass();
            C145836hg A01 = A01(c41551w4.A0H, this);
            C18920wW A012 = AbstractC12220kQ.A01(A01, userSession);
            C25531Mh c25531Mh = new C25531Mh(A012.A00(A012.A00, "ig_story_entity_impression"), 241);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                c25531Mh.A0m(A01.getModuleName());
                c25531Mh.A0l(c38321qM.getId());
                c25531Mh.A0R("tapped_entity", str);
                c25531Mh.Cht();
            }
        }
    }

    public final void A0P(C41551w4 c41551w4, String str, float f, float f2, int i) {
        UserSession userSession = this.A06;
        Reel reel = c41551w4.A0H;
        C25531Mh A0C = C25531Mh.A0C(AbstractC12220kQ.A01(A01(reel, this), userSession));
        A0C.A0l("");
        A0C.A0Q("m_t", 0L);
        A0C.A0P("time_elapsed", Double.valueOf((f * f2) / 1000.0d));
        float f3 = 1.0f - f;
        float f4 = 0.0f;
        if (0.0f < f3) {
            f4 = f3;
        }
        A0C.A0P("time_remaining", Double.valueOf((f4 * f2) / 1000.0d));
        A0C.A0R("tray_session_id", this.A0H);
        A0C.A0R("viewer_session_id", this.A0E.getSessionId());
        A0C.A0R("reel_id", reel.getId());
        A0C.A0j("tap");
        A0C.A0Q("carousel_index", Long.valueOf(i));
        A0C.A0R("reel_type", String.valueOf(reel.A0P));
        A0C.A0R("tapped_entity", str);
        A0C.Cht();
    }

    public final void A0Q(C41551w4 c41551w4, String str, String str2, float f, float f2) {
        C37948Gmq c37948Gmq;
        UserSession userSession = this.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        Long l = null;
        if (A08.CY4() && (c37948Gmq = (C37948Gmq) this.A0I.get(A08.CGe())) != null) {
            C38321qM c38321qM = A08.A0b;
            c38321qM.getClass();
            C25531Mh A0C = C25531Mh.A0C(AbstractC12220kQ.A01(A01(c41551w4.A0H, this), userSession));
            if (((AbstractC02600Aj) A0C).A00.isSampled()) {
                String id = c38321qM.getId();
                if (id != null) {
                    A0C.A0l(id);
                    A0C.A0Q("m_t", Long.valueOf(c38321qM.BRp().A00));
                    A0C.A0P("time_elapsed", Double.valueOf((f * f2) / 1000.0d));
                    float f3 = 1.0f - f;
                    float f4 = 0.0f;
                    if (0.0f < f3) {
                        f4 = f3;
                    }
                    A0C.A0P("time_remaining", Double.valueOf((f4 * f2) / 1000.0d));
                    A0C.A0R("tray_session_id", this.A0H);
                    A0C.A0R("viewer_session_id", this.A0E.getSessionId());
                    Reel reel = c37948Gmq.A02;
                    String id2 = reel.getId();
                    C14360o3.A07(id2);
                    A0C.A0R("reel_id", id2);
                    if (str == null) {
                        str = "";
                    }
                    A0C.A0j(str);
                    UserSession userSession2 = c37948Gmq.A01;
                    A0C.A0Q("reel_size", Long.valueOf(reel.A0O(userSession2).size()));
                    A0C.A0Q("tray_position", Long.valueOf(c37948Gmq.A04.A0E));
                    A0C.A0R("reel_type", reel.A0H(userSession2));
                    User A2E = c38321qM.A2E(userSession);
                    if (A2E != null) {
                        l = AbstractC003100w.A0k(10, A2E.getId());
                    }
                    A0C.A0Q("a_pk", l);
                    A0C.A0R("tracking_token", c38321qM.A0C.getOrganicTrackingToken());
                    A0C.A0R("tapped_entity", str2);
                    A0C.Cht();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        this.A07.onCreate();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A07.onDestroy();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A07.onDestroyView();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A07.onPause();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A07.onResume();
    }

    public final void A06(Reel reel, C41181vS c41181vS, String str) {
        if (c41181vS.CY4()) {
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                UserSession userSession = this.A06;
                C145836hg c145836hg = this.A0A;
                c145836hg.A00 = reel;
                C82713mZ A04 = AbstractC82703mY.A04(c38321qM, c145836hg, "caption_dismiss");
                A04.A0G(userSession, c38321qM);
                A04.A5R = str;
                A04(A04, (C37948Gmq) this.A0I.get(c41181vS.CGe()), this);
                C32U.A0C(userSession, A04, c38321qM, c145836hg, null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A08(C41181vS c41181vS, float f) {
        C145836hg A00 = A00(c41181vS, this);
        UserSession userSession = this.A06;
        C82713mZ A02 = AbstractC37955Gmx.A02(userSession, A00, c41181vS, "opt_in_tap");
        A02.A04 = f;
        C37948Gmq c37948Gmq = (C37948Gmq) this.A0I.get(c41181vS.CGe());
        C32U.A0A(userSession, A02, c41181vS.A09());
        A04(A02, c37948Gmq, this);
        C32U.A0I(userSession, A02, this.A0A, C05F.A01);
    }
}
