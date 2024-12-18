package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.api.schemas.FBBioLinkSocialContextType;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GBV implements C73C {
    public final FragmentActivity A00;
    public final InterfaceC08100bW A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final UserDetailFragment A04;
    public final C70C A05;
    public final UserDetailTabController A06;
    public final MUB A07;
    public final String A08;
    public final String A09;
    public final AnonymousClass708 A0A;
    public final String A0B;
    public final String A0C;

    public static final void A02(InterfaceC81873l7 interfaceC81873l7, Map map) {
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum;
        String Ayb;
        String str;
        String str2;
        FBBioLinkSocialContextType ByS;
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum2;
        if (interfaceC81873l7 != null) {
            igUserBioLinkTypeEnum = interfaceC81873l7.BNW();
        } else {
            igUserBioLinkTypeEnum = null;
        }
        if (igUserBioLinkTypeEnum != IgUserBioLinkTypeEnum.A05) {
            if (interfaceC81873l7 != null) {
                igUserBioLinkTypeEnum2 = interfaceC81873l7.BNW();
            } else {
                igUserBioLinkTypeEnum2 = null;
            }
            if (igUserBioLinkTypeEnum2 != IgUserBioLinkTypeEnum.A07) {
                return;
            }
        }
        InterfaceC110294y0 B4Y = interfaceC81873l7.B4Y();
        if (B4Y != null && (Ayb = B4Y.Ayb()) != null && Ayb.length() > 0) {
            if (map == null) {
                map = AbstractC166987dD.A1I();
            }
            if (interfaceC81873l7.BNW() == IgUserBioLinkTypeEnum.A07) {
                str = "page";
            } else {
                str = "profile";
            }
            String A0g = AnonymousClass001.A0g("social_context_fb_", str, "_type");
            String A0g2 = AnonymousClass001.A0g("social_context_fb_", str, "_value");
            InterfaceC110294y0 B4Y2 = interfaceC81873l7.B4Y();
            if (B4Y2 == null || (ByS = B4Y2.ByS()) == null || (str2 = ByS.A00) == null) {
                str2 = "";
            }
            map.put(A0g, str2);
            InterfaceC110294y0 B4Y3 = interfaceC81873l7.B4Y();
            map.put(A0g2, String.valueOf(B4Y3 != null ? Integer.valueOf(B4Y3.BPU()) : null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A08(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, EnumC33379EpC enumC33379EpC, Map map, boolean z) {
        LinkedHashMap linkedHashMap;
        InterfaceC81873l7 interfaceC81873l7;
        Object obj;
        UserSession userSession = this.A02;
        MUB mub = this.A07;
        String A02 = mub.A02();
        AnonymousClass708 anonymousClass708 = this.A0A;
        Bundle A0E = AbstractC31174DnI.A0E(A02, 1);
        EMH emh = new EMH();
        AbstractC31173DnH.A1C(A0E, userSession);
        A0E.putString("ProfileTabbedExplorerFragment.USER_ID", A02);
        A0E.putString(AbstractC111324zv.A00(666), enumC33379EpC.name());
        A0E.putBoolean("ProfileTabbedExplorerFragment.ONLY_SHOW_SELECTED_TAB", z);
        emh.setArguments(A0E);
        emh.A02 = anonymousClass708;
        emh.A00 = c38321qM;
        C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
        A0X.A03 = 0.5f;
        A0X.A1O = true;
        A0X.A00().A02(this.A00, emh);
        InterfaceC81873l7 interfaceC81873l72 = null;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = null;
        }
        User user = mub.A03;
        if (user != null) {
            List Ag2 = user.A03.Ag2();
            if (Ag2 != null) {
                Iterator it = Ag2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((InterfaceC81873l7) obj).BNW() == IgUserBioLinkTypeEnum.A05) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                interfaceC81873l7 = (InterfaceC81873l7) obj;
            } else {
                interfaceC81873l7 = null;
            }
            List Ag22 = user.A03.Ag2();
            if (Ag22 != null) {
                Iterator it2 = Ag22.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((InterfaceC81873l7) next).BNW() == IgUserBioLinkTypeEnum.A07) {
                        interfaceC81873l72 = next;
                        break;
                    }
                }
                interfaceC81873l72 = interfaceC81873l72;
            }
            A02(interfaceC81873l7, linkedHashMap);
            A02(interfaceC81873l72, linkedHashMap);
        }
        C151546s0.A00.A0D(interfaceC11380iw, userSession, false, mub.A02(), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.InterfaceC11380iw r22, com.instagram.user.model.User r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBV.A0A(X.0iw, com.instagram.user.model.User, java.lang.String, java.lang.String):void");
    }

    public GBV(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, AnonymousClass708 anonymousClass708, UserDetailFragment userDetailFragment, C70C c70c, UserDetailTabController userDetailTabController, MUB mub, String str, String str2, String str3, String str4) {
        AbstractC25229BEm.A1L(c70c, 10, str4);
        this.A02 = userSession;
        this.A04 = userDetailFragment;
        this.A06 = userDetailTabController;
        this.A00 = fragmentActivity;
        this.A08 = str;
        this.A09 = str2;
        this.A0C = str3;
        this.A0A = anonymousClass708;
        this.A03 = interfaceC60442pS;
        this.A05 = c70c;
        this.A07 = mub;
        this.A0B = str4;
        this.A01 = new C42106IlG(2);
    }

    public static final void A01(Context context, GBV gbv, User user, String str) {
        Boolean bool;
        UserSession userSession = gbv.A02;
        String str2 = gbv.A0B;
        String id = user.getId();
        String A06 = AbstractC38851rI.A06(user.B7L());
        MUB mub = gbv.A07;
        User user2 = mub.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1d());
        } else {
            bool = null;
        }
        FT3.A01(userSession, bool, str2, "get_directions", "business_profile", id, A06);
        Integer num = C05F.A0N;
        UserDetailFragment userDetailFragment = gbv.A04;
        String str3 = gbv.A08;
        String str4 = gbv.A09;
        AbstractC34022F0b.A00(userSession, userDetailFragment, user, num, str3, str4);
        C1571673v.A08(userDetailFragment, userSession, C1571673v.A00(userSession, mub.A03), "tap_directions", mub.A02(), str3, str4, str);
        AbstractC35180FfX.A03(context, user.A03.AZq(), user.A03.Ani(), user.A03.CIk());
    }

    public static void A03(UserSession userSession, UserDetailFragment userDetailFragment, MUB mub, Object obj) {
        C151546s0 c151546s0 = C151546s0.A00;
        if ("user_profile_link_bottom_sheet".equals(obj)) {
            c151546s0.A0C(userDetailFragment.getContext(), userDetailFragment, userSession, "external", mub.A02(), null);
        } else {
            if (!"user_profile_header".equals(obj)) {
                return;
            }
            c151546s0.A0B(userDetailFragment.getContext(), userDetailFragment, userSession, "external", mub.A02(), null);
        }
    }

    private final void A04(C38321qM c38321qM, User user, String str) {
        UserDetailFragment userDetailFragment = this.A04;
        C82713mZ c82713mZ = new C82713mZ(userDetailFragment, "bio_link_opened");
        c82713mZ.A7U = str;
        c82713mZ.A62 = this.A08;
        UserSession userSession = this.A02;
        c82713mZ.A4Q = userSession.userId;
        c82713mZ.A7K = user.getId();
        if (c38321qM != null && c38321qM.CdW() && !AbstractC41071vF.A0S(userSession, c38321qM)) {
            c82713mZ.A61 = c38321qM.getId();
            c82713mZ.A7Q = AbstractC41071vF.A0F(userSession, c38321qM);
        }
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            c82713mZ.A6C = A14;
        }
        C5I7.A00(userSession, c82713mZ, userDetailFragment, C05F.A00);
    }

    public static final void A05(GBV gbv, String str, String str2) {
        UserSession userSession = gbv.A02;
        UserDetailFragment userDetailFragment = gbv.A04;
        MUB mub = gbv.A07;
        C1571673v.A08(userDetailFragment, userSession, C1571673v.A00(userSession, mub.A03), AbstractC111324zv.A00(5460), mub.A02(), gbv.A08, gbv.A09, str2);
        FragmentActivity fragmentActivity = gbv.A00;
        Venue venue = new Venue();
        venue.A06(str);
        AbstractC68491VSw.A00(fragmentActivity, null, null, userSession, venue, null, "", null, false);
    }

    public final void A06() {
        UserSession userSession = this.A02;
        UserDetailFragment userDetailFragment = this.A04;
        MUB mub = this.A07;
        C1571673v.A08(userDetailFragment, userSession, C1571673v.A00(userSession, mub.A03), "tap_profile_bio_more", mub.A02(), this.A08, this.A09, "user_profile_header");
        C155666yv c155666yv = this.A06.A0O;
        if (!c155666yv.A0N) {
            c155666yv.A0N = true;
            c155666yv.A00();
        }
    }

    public final void A07(Context context, User user, String str) {
        String BIO = user.A03.BIO();
        if (BIO != null && BIO.length() != 0) {
            new FQH(this.A00, this.A04, this.A02).A00(new C36579GBd(context, this, user, str));
            return;
        }
        A01(context, this, user, str);
    }

    public final void A09(InterfaceC11380iw interfaceC11380iw, User user, String str) {
        String A04 = C18U.A04(C06090Tz.A05, this.A02, 36883040245318122L);
        if (!AbstractC25225BEi.A1Y(A04)) {
            A04 = "xav_ig_profile_page";
        }
        A0A(interfaceC11380iw, user, str, A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0B(InterfaceC11380iw interfaceC11380iw, String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        C43H BNc;
        String BiB;
        String A0R;
        MUB mub = this.A07;
        User user = mub.A03;
        if (user != null) {
            if (user.A03.BNa() != null) {
                UserSession userSession = this.A02;
                InterfaceC81833l1 A00 = AbstractC35784FrM.A00(userSession, user);
                if (A00 != null && (BNc = A00.BNc()) != null && (BiB = BNc.BiB()) != null) {
                    z3 = false;
                    UserDetailFragment userDetailFragment = this.A04;
                    if (AbstractC35190Ffi.A00(userDetailFragment.requireContext().getPackageManager()) == null && C18U.A06(C06090Tz.A05, userSession, 36325347331093518L)) {
                        FragmentActivity fragmentActivity = this.A00;
                        Integer num = C05F.A00;
                        String replace = BiB.replace("https://www.facebook.com/profile.php?id=", AbstractC35105Fe7.A00);
                        if (TextUtils.isEmpty(str2)) {
                            A0R = "";
                        } else {
                            A0R = AnonymousClass001.A0R("?ref=", str2);
                        }
                        AbstractC34210F7i.A00(fragmentActivity, num, AnonymousClass001.A0R(replace, A0R), new C57265Pbn(interfaceC11380iw, this, BiB, str2, 5));
                        z = true;
                        z2 = true;
                    } else {
                        AbstractC35105Fe7.A01(userDetailFragment.requireContext(), interfaceC11380iw, userSession, BiB, str2);
                        z = true;
                    }
                } else {
                    z3 = true;
                    z = false;
                }
                z2 = false;
            } else {
                z = false;
                z2 = false;
                z3 = true;
            }
            C151546s0 c151546s0 = C151546s0.A00;
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            boolean equals = "banner_bottom_sheet".equals(str);
            String str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            if (equals || "banner".equals(str)) {
                A1I.put("is_from_banners", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            Object obj = "0";
            if (z) {
                obj = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A1I.put("target_has_hardlink_info", obj);
            A1I.put("ref_id", str2);
            Object obj2 = "0";
            if (z2) {
                obj2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A1I.put("login_bypass_attempted", obj2);
            if (!z3) {
                str3 = "0";
            }
            A1I.put("is_fb_profile_url_null", str3);
            if (!"user_profile_link_bottom_sheet".equals(str) && !equals) {
                if ("user_profile_header".equals(str) || "banner".equals(str)) {
                    c151546s0.A0B(this.A04.getContext(), interfaceC11380iw, this.A02, "facebook", mub.A02(), A1I);
                    return;
                }
                return;
            }
            List Ag2 = user.A03.Ag2();
            InterfaceC81873l7 interfaceC81873l7 = null;
            if (Ag2 != null) {
                Iterator it = Ag2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((InterfaceC81873l7) next).BNW() == IgUserBioLinkTypeEnum.A05) {
                        interfaceC81873l7 = next;
                        break;
                    }
                }
                interfaceC81873l7 = interfaceC81873l7;
            }
            A02(interfaceC81873l7, A1I);
            c151546s0.A0C(this.A04.getContext(), interfaceC11380iw, this.A02, "facebook", mub.A02(), A1I);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.C38321qM r21, com.instagram.user.model.User r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBV.A0C(X.1qM, com.instagram.user.model.User, java.lang.String):void");
    }

    public final void A0D(C38321qM c38321qM, User user, String str, String str2, String str3, boolean z) {
        String str4 = str3;
        AbstractC167007dF.A1F(str2, 3, str4);
        UserSession userSession = this.A02;
        UserDetailFragment userDetailFragment = this.A04;
        MUB mub = this.A07;
        EnumC1571773w A00 = C1571673v.A00(userSession, mub.A03);
        String A02 = mub.A02();
        String str5 = this.A08;
        C1571673v.A09(userDetailFragment, userSession, A00, "tap_website", A02, str5, this.A09, this.A0C, str);
        android.net.Uri uri = null;
        try {
            uri = AbstractC08820cl.A01(this.A01, str2);
        } catch (IllegalArgumentException | SecurityException unused) {
            String name = GBV.class.getName();
            C14360o3.A07(name);
            AbstractC31173DnH.A1Z("Unable to parse URI from: ", str2, name);
        }
        if (AbstractC63325ShZ.A00(uri)) {
            FragmentActivity fragmentActivity = this.A00;
            if (AbstractC115215Is.A00(fragmentActivity, userSession, str2)) {
                AbstractC41776Ies.A03(fragmentActivity, str2);
                A04(c38321qM, user, str2);
                A03(userSession, userDetailFragment, mub, str);
            }
        }
        if ((AbstractC63325ShZ.A01(uri) || AbstractC31536DtL.A01(uri)) && C18U.A06(C06090Tz.A05, userSession, 36318054477010798L)) {
            AbstractC41776Ies.A03(this.A00, A00(str2));
        } else {
            if (AbstractC63325ShZ.A01(uri) || AbstractC31536DtL.A01(uri)) {
                str4 = A00(str4);
            }
            if (!z && userDetailFragment.getContext() != null) {
                AbstractC41776Ies.A03(userDetailFragment.requireContext(), str4);
            } else {
                Intent intent = null;
                try {
                    intent = new Intent("android.intent.action.VIEW", AbstractC08820cl.A01(this.A01, str4)).putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", true).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
                } catch (IllegalArgumentException | NullPointerException unused2) {
                    String name2 = GBV.class.getName();
                    C14360o3.A07(name2);
                    AbstractC31173DnH.A1Z("Unable to parse URI from: ", user.A03.getExternalUrl(), name2);
                }
                Context context = userDetailFragment.getContext();
                if (intent != null && context != null && AbstractC14490oL.A00(context, intent) == 0) {
                    intent.setPackage(userDetailFragment.requireContext().getPackageName());
                    C12260kU.A0H(intent, userDetailFragment);
                } else {
                    AnonymousClass189.A00(userSession).A01(user, true, false);
                    FragmentActivity fragmentActivity2 = this.A00;
                    C2Fb c2Fb = C2Fb.A32;
                    String moduleName = userDetailFragment.getModuleName();
                    String id = user.getId();
                    C14360o3.A0B(str4, 2);
                    AbstractC41776Ies.A0A(fragmentActivity2, userSession, c2Fb, str4, moduleName, str5, id);
                }
            }
        }
        A04(c38321qM, user, str2);
        A03(userSession, userDetailFragment, mub, str);
    }

    public final void A0E(User user, boolean z) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BitSet A0j = AbstractC31171DnF.A0j(1);
        A1I.put("entrypoint", "profile_badge");
        A0j.set(0);
        A1I.put("from_profile_igid", user.A03.getPkId());
        if (A0j.nextClearBit(0) >= 1) {
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.ig.creator_connections.BloksIGOpenToCollabSurfaceScreenQuery", null, null, AbstractC06930Yk.A0B(A1I), c16920sk, 719983200, 60L, true);
            WTY wty = new WTY(null, null, null, null);
            AnonymousClass637 A00 = VRA.A00(this.A02, false);
            if (z) {
                C14360o3.A0B(A00, 2);
                c63719SsZ.E5D(wty, A00, null, true);
                return;
            } else {
                Context requireContext = this.A04.requireContext();
                C14360o3.A0B(A00, 1);
                c63719SsZ.E2V(requireContext, wty, A00);
                return;
            }
        }
        throw AbstractC31172DnG.A0v();
    }

    public final void A0F(String str, InterfaceC11380iw interfaceC11380iw) {
        User user = this.A07.A03;
        if (user != null) {
            if (user.A03.BNa() != null) {
                UserSession userSession = this.A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                String A04 = C18U.A04(c06090Tz, userSession, 36876954275741820L);
                String A042 = C18U.A04(c06090Tz, userSession, 36883040245252585L);
                if (AbstractC25225BEi.A1Y(A042)) {
                    A04 = A042;
                }
                A0B(interfaceC11380iw, str, A04);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C73C
    public final void D2l(C44Q c44q, InterfaceC11380iw interfaceC11380iw, String str) {
        String valueOf;
        int i;
        FanClubInfoDict A0M;
        String fanClubId;
        C14360o3.A0B(c44q, 0);
        Integer C7h = c44q.C7h();
        if (C7h != null && C4GR.A02(C7h.intValue())) {
            User user = this.A07.A03;
            if (user != null && (A0M = AbstractC31172DnG.A0M(user)) != null && (fanClubId = A0M.getFanClubId()) != null) {
                C189448aO A0y = AbstractC25225BEi.A0y(this.A02);
                C189478aR A00 = A0y.A00();
                EN8 A02 = AbstractC35059FcW.A02(EnumC33373Ep6.A0H, new G3X(1, this, A00, A0y), c44q.C7K(), fanClubId, null);
                C3DO c3do = C3DN.A00;
                FragmentActivity fragmentActivity = this.A00;
                C3DN A002 = c3do.A00(fragmentActivity);
                if (A002 != null) {
                    C3DP c3dp = (C3DP) A002;
                    if (c3dp.A0h) {
                        c3dp.A0H = new GH9(6, A00, this, A02);
                        A002.A0B();
                        return;
                    }
                }
                A00.A02(fragmentActivity, A02);
                return;
            }
            AbstractC35234FgS.A01(this.A00);
            return;
        }
        Integer C7h2 = c44q.C7h();
        String str2 = null;
        if (C7h2 != null && C7h2.intValue() == 29) {
            User user2 = this.A07.A03;
            if (user2 != null) {
                str2 = user2.getId();
            }
            C44O Ast = c44q.Ast();
            if (Ast != null) {
                i = Ast.AdZ();
            } else {
                i = 1;
            }
            C28531Zo.A04.A03(this.A00, interfaceC11380iw, this.A02, c44q.C7K(), c44q.BJP(), str2, "user_profile_header", i);
            return;
        }
        if (c44q.BJP() == null) {
            C0w9.A03("UserDetailDelegate", "Invite link was not present on channel preview object.");
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c44q.C7h() == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(c44q.C7h());
        }
        User user3 = this.A07.A03;
        if (user3 != null) {
            str2 = user3.getId();
        }
        AbstractC31174DnI.A1T("s", "user_profile_header", A1E);
        AbstractC31174DnI.A1T("st", valueOf, A1E);
        AbstractC31174DnI.A1T("cid", str2, A1E);
        String BJP = c44q.BJP();
        if (BJP == null) {
            return;
        }
        AbstractC41776Ies.A0C(this.A00, this.A02, AbstractC35186Ffe.A02(BJP, A1E), "user_profile_header");
    }

    private final String A00(String str) {
        android.net.Uri uri = null;
        if (!AbstractC167007dF.A1N(str.length())) {
            try {
                uri = AbstractC08820cl.A03(str);
            } catch (IllegalArgumentException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        if (uri != null) {
            String A04 = C18U.A04(C06090Tz.A06, this.A02, 36881004431147376L);
            if (A04.length() > 0) {
                uri = AbstractC31174DnI.A0B(uri.buildUpon(), "ref", A04);
            }
            return AbstractC166987dD.A19(uri);
        }
        return str;
    }
}
