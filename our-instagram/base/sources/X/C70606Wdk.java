package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Wdk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70606Wdk implements InterfaceC57923PmT {
    public int A00;
    public int A01;
    public C70605Wdj A02;
    public Integer A03;
    public String A04;
    public String A05;
    public Map A06;
    public final EnumC68134VCs A07;
    public final C70652WeY A08;
    public final InterfaceC11380iw A09;
    public final List A0A;
    public final Map A0B;
    public final C68723Vaz A0C;
    public final W4U A0D;
    public final W56 A0E;
    public final XDK A0F;
    public final XDK A0G;
    public final XDK A0H;
    public final UserSession A0I;

    public C70606Wdk(EnumC68134VCs enumC68134VCs, W4U w4u, C70652WeY c70652WeY, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        LinkedHashMap linkedHashMap;
        VD1 vd1;
        Object v2c;
        VD1 vd12;
        Object v29;
        C14360o3.A0B(userSession, 1);
        this.A0I = userSession;
        this.A09 = interfaceC11380iw;
        this.A07 = enumC68134VCs;
        this.A08 = c70652WeY;
        this.A0D = w4u;
        c70652WeY.A00 = this;
        this.A0A = new ArrayList();
        this.A0C = new C68723Vaz(userSession);
        this.A0E = new W56(userSession, null);
        this.A03 = C05F.A00;
        int ordinal = enumC68134VCs.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    linkedHashMap = new LinkedHashMap();
                    vd12 = VD1.A04;
                } else {
                    throw new IllegalStateException("MediaContentType should be either POST or STORY");
                }
            } else {
                linkedHashMap = new LinkedHashMap();
                String str = w4u.A03;
                if (AbstractC111324zv.A00(522).equals(str)) {
                    vd12 = VD1.A04;
                    v29 = new V2A();
                } else {
                    boolean equals = "highlights_hub_reels".equals(str);
                    vd12 = VD1.A04;
                    if (!equals) {
                        v29 = new V29();
                    }
                }
                linkedHashMap.put(vd12, v29);
                vd1 = VD1.A03;
                v2c = new V28();
            }
            v29 = new V2B();
            linkedHashMap.put(vd12, v29);
            vd1 = VD1.A03;
            v2c = new V28();
        } else {
            linkedHashMap = new LinkedHashMap();
            vd1 = VD1.A05;
            v2c = new V2C(userSession);
        }
        linkedHashMap.put(vd1, v2c);
        linkedHashMap.put(VD1.A02, new V27());
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C14360o3.A07(unmodifiableMap);
        this.A0B = unmodifiableMap;
        this.A0F = new C70782Wgv(this, 0);
        this.A0H = new C70782Wgv(this, 1);
        this.A0G = new C70782Wgv(this, 2);
    }

    @Override // X.InterfaceC57923PmT
    public final void destroy() {
        throw C00O.createAndThrow();
    }

    public static final int A00(C70606Wdk c70606Wdk, String str) {
        List<C70793Wh6> list = c70606Wdk.A0A;
        for (C70793Wh6 c70793Wh6 : list) {
            if (C14360o3.A0K(c70793Wh6.A03, str)) {
                return list.indexOf(c70793Wh6);
            }
        }
        throw new IllegalArgumentException("invalid media Id");
    }

    public static final void A01(C70606Wdk c70606Wdk) {
        W56 w56;
        String str;
        XDK xdk;
        String str2;
        String str3;
        boolean A06 = C18U.A06(C06090Tz.A05, c70606Wdk.A0I, 36321310061634875L);
        int ordinal = c70606Wdk.A07.ordinal();
        if (!A06) {
            if (ordinal != 1) {
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        C68723Vaz c68723Vaz = c70606Wdk.A0C;
                        String str4 = c70606Wdk.A04;
                        XDK xdk2 = c70606Wdk.A0G;
                        C14360o3.A0B(xdk2, 1);
                        W56 w562 = c68723Vaz.A00;
                        UserSession userSession = w562.A03;
                        String str5 = userSession.userId;
                        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, true, "include_feed_video");
                        C0CA.A00(A0T, str5, "target_user_id");
                        C0CA.A00(A0T, str4, "max_id");
                        C0CA.A00(A0T, "audience", "audience");
                        C0CA.A00(A0T, true, "is_request_from_viewer");
                        C2JM c2jm = new C2JM();
                        C2JM c2jm2 = new C2JM();
                        c2jm2.A01("use_defer");
                        c2jm2.A01("use_stream");
                        c2jm2.A03("initial_stream_count", 0);
                        c2jm2.A02("stream_use_customized_batch", true);
                        c2jm2.A01("enable_likers_in_full_media");
                        c2jm2.A01("enable_clips_metadata_in_light_media");
                        c2jm2.A01("enable_thumbnails_in_light_media");
                        c2jm2.A01("enable_video_versions_in_light_media");
                        c2jm2.A01("enable_audience_in_light_media");
                        c2jm2.A01("exclude_main_user_field");
                        c2jm2.A01("exclude_caption_user_field");
                        C1P3.A00(C1P2.A00(userSession), C207869Hs.A00, null, new C66081TzI(xdk2, 19), AnonymousClass963.A00(AbstractC40691uc.A01(userSession).A03(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, c2jm, "data"), "ClipsProfileQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), AnonymousClass756.class, false, null, 0, null, "xdt_user_clips_graphql", new ArrayList())).A01(new C56149OwF(w562, 1), 189753949, 3)), null, "clips/user/", 21600L, true, false);
                        return;
                    }
                    throw new RuntimeException();
                }
                C68723Vaz c68723Vaz2 = c70606Wdk.A0C;
                Map map = c70606Wdk.A06;
                if (map != null) {
                    String valueOf = String.valueOf(c70606Wdk.A00);
                    XDK xdk3 = c70606Wdk.A0F;
                    C14360o3.A0B(xdk3, 2);
                    Object obj = map.get(VD1.A04);
                    if (obj != null) {
                        String str6 = (String) obj;
                        Object obj2 = map.get(VD1.A03);
                        if (obj2 != null) {
                            String str7 = (String) obj2;
                            Object obj3 = map.get(VD1.A02);
                            if (obj3 != null) {
                                c68723Vaz2.A00.A01(xdk3, str6, str7, (String) obj3, valueOf);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            C68723Vaz c68723Vaz3 = c70606Wdk.A0C;
            Map map2 = c70606Wdk.A06;
            if (map2 != null) {
                String valueOf2 = String.valueOf(c70606Wdk.A00);
                XDK xdk4 = c70606Wdk.A0H;
                C14360o3.A0B(xdk4, 2);
                Object obj4 = map2.get(VD1.A05);
                if (obj4 != null) {
                    String str8 = (String) obj4;
                    Object obj5 = map2.get(VD1.A02);
                    if (obj5 != null) {
                        String str9 = (String) obj5;
                        W56 w563 = c68723Vaz3.A00;
                        C14360o3.A0B(str8, 0);
                        C14360o3.A0B(str9, 1);
                        C70611Wdp c70611Wdp = new C70611Wdp(xdk4, 1);
                        w563.A00 = c70611Wdp;
                        UserSession userSession2 = w563.A03;
                        Integer A00 = AbstractC69889VxG.A00(str8);
                        C14360o3.A0B(A00, 2);
                        W8e.A01(new C70088W2k(c70611Wdp, userSession2, A00, valueOf2, str9));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    w56 = c70606Wdk.A0E;
                    str = c70606Wdk.A04;
                    xdk = c70606Wdk.A0F;
                    str2 = "CLIPS";
                } else {
                    throw new RuntimeException();
                }
            } else {
                w56 = c70606Wdk.A0E;
                str = c70606Wdk.A04;
                xdk = c70606Wdk.A0F;
                str2 = "FEED";
            }
        } else {
            w56 = c70606Wdk.A0E;
            str = c70606Wdk.A04;
            xdk = c70606Wdk.A0F;
            str2 = "STORY";
        }
        C14360o3.A0B(xdk, 2);
        C0CA A0T2 = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "", "access_token");
        UserSession userSession3 = w56.A03;
        C0CA.A00(A0T2, userSession3.userId, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C2JM c2jm3 = new C2JM();
        AbstractC31173DnH.A1M(A0T2, c2jm3.A00, "query_params");
        c2jm3.A03("count", 15);
        if (str2.equals("STORY")) {
            str3 = "ONE_DAY";
        } else {
            str3 = "LIFETIME";
        }
        c2jm3.A04(AbstractC43591JPw.A00(481), str3);
        c2jm3.A04("metric", "MEDIA_ORGANIC_ACCOUNT_REACH_OR_PROMOTED_PEOPLE_BASED_REACH");
        c2jm3.A02("should_include_insights_data", true);
        c2jm3.A02("show_only_ig_boost_eligible_media", true);
        c2jm3.A04("media_product_type", str2);
        c2jm3.A04("cursor", str);
        c2jm3.A04("caller_id", "BOOST_MEDIA_PICKER");
        C907442n c907442n = new C907442n(c2jm3, UNV.class, "IGInsightsIntegratedMediaGridQuery", false);
        C195928le.A00(userSession3).ATV(new C70434WVm(xdk, 3), new WW3(2, w56, xdk), c907442n);
    }

    public static final void A02(C70606Wdk c70606Wdk, int i, boolean z) {
        List list = c70606Wdk.A0A;
        C70793Wh6 c70793Wh6 = (C70793Wh6) list.get(i);
        String str = c70793Wh6.A03;
        ImageUrl imageUrl = c70793Wh6.A02;
        list.set(i, new C70793Wh6(c70793Wh6.A01, imageUrl, str, c70793Wh6.A00, c70793Wh6.A04, z));
    }

    public static final void A03(C70606Wdk c70606Wdk, List list) {
        C70652WeY c70652WeY;
        int i;
        int i2;
        int i3;
        String str;
        if (c70606Wdk.A00 == 0) {
            if (!list.isEmpty()) {
                str = ((C69282Vkq) list.get(0)).A04;
            } else {
                str = null;
            }
            c70606Wdk.A05 = str;
            C70605Wdj c70605Wdj = c70606Wdk.A02;
            if (c70605Wdj != null) {
                c70605Wdj.A02(str, false);
            } else {
                throw new IllegalStateException("delegate could not be null when init media grid");
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C69282Vkq c69282Vkq = (C69282Vkq) it.next();
            String str2 = c69282Vkq.A04;
            ImageUrl imageUrl = c69282Vkq.A02;
            VDG vdg = c69282Vkq.A01;
            boolean A1N = AbstractC167007dF.A1N(c70606Wdk.A00);
            c70606Wdk.A0A.add(new C70793Wh6(vdg, imageUrl, str2, c69282Vkq.A00, AbstractC31177DnL.A1a(c69282Vkq.A03), A1N));
            c70606Wdk.A00++;
        }
        List list2 = c70606Wdk.A0A;
        if (list2.isEmpty()) {
            int ordinal = c70606Wdk.A07.ordinal();
            if (ordinal != 1) {
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        c70652WeY = c70606Wdk.A08;
                        i = 2131961749;
                        i2 = 2131961748;
                        i3 = 2131966138;
                    } else {
                        throw new IllegalStateException("MediaContentType should be either POST or STORY");
                    }
                } else {
                    c70652WeY = c70606Wdk.A08;
                    i = 2131961747;
                    i2 = 2131961746;
                    i3 = 2131966069;
                }
            } else {
                c70652WeY = c70606Wdk.A08;
                i = 2131961751;
                i2 = 2131961750;
                i3 = 2131966148;
            }
            c70652WeY.A03.setVisibility(8);
            c70652WeY.A07.setText(i);
            c70652WeY.A06.setText(i2);
            IgTextView igTextView = c70652WeY.A05;
            igTextView.setText(i3);
            igTextView.setVisibility(0);
            c70652WeY.A02.setVisibility(0);
            return;
        }
        C70652WeY c70652WeY2 = c70606Wdk.A08;
        c70652WeY2.A03.setVisibility(0);
        c70652WeY2.A02.setVisibility(8);
        C66362zD c66362zD = c70652WeY2.A04;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(list2);
        c66362zD.A05(viewModelListUpdate);
        c66362zD.notifyDataSetChanged();
    }

    public final boolean A04() {
        VD1 vd1 = VD1.A02;
        Map map = this.A06;
        if (map != null) {
            if (map.containsKey(vd1)) {
                Map map2 = this.A06;
                if (map2 != null) {
                    Object obj = map2.get(vd1);
                    if (obj != null) {
                        if (obj.equals("NOT_ELIGIBLE")) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
