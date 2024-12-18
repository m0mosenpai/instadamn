package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.735, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass735 implements AnonymousClass736 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ MWW A05;
    public final /* synthetic */ InterfaceC678133v A06;
    public final /* synthetic */ C72q A07;
    public final /* synthetic */ User A08;
    public final /* synthetic */ boolean A09;

    @Override // X.C73B
    public final void Cw8(String str, boolean z, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 2);
        UserSession userSession = this.A04;
        C25531Mh A00 = C28484Chc.A00(new C28484Chc(userSession));
        if (((AbstractC02600Aj) A00).A00.isSampled()) {
            A00.A0k("ai_profile_banner_click");
            A00.A0w(AbstractC16850sd.A0M(new C09530e4("banner_position", String.valueOf(z ? 1 : 0))));
            A00.A0i(AbstractC003100w.A0k(10, str2));
            A00.Cht();
        }
        new AiAgentThreadLauncher(userSession).A08(this.A02.requireActivity(), this.A03, str, "profile_banner", null, null, true);
    }

    @Override // X.AnonymousClass737
    public final void DUC(MusicAssetModel musicAssetModel) {
        C14360o3.A0B(musicAssetModel, 0);
        C3DN A00 = C3DN.A00.A00(this.A01);
        if (A00 != null) {
            InterfaceC678133v interfaceC678133v = this.A06;
            Context context = this.A00;
            UserSession userSession = this.A04;
            ((C3DP) A00).A0H = new GHH(context, this.A02, this.A03, userSession, musicAssetModel, interfaceC678133v, this.A07, this.A08, this.A09);
            A00.A0B();
        }
        Context context2 = this.A00;
        UserSession userSession2 = this.A04;
        AbstractC59962oe abstractC59962oe = this.A02;
        User user = this.A08;
        boolean z = this.A09;
        InterfaceC678133v interfaceC678133v2 = this.A06;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        C72q c72q = this.A07;
        C1567972f.A02(context2, abstractC59962oe, interfaceC11380iw, userSession2, musicAssetModel, interfaceC678133v2, c72q, user, z);
        c72q.A06("tap_music_banner");
    }

    @Override // X.C73F
    public final void DeV(User user) {
        IgUserRelatedAccountTypeEnum AY7;
        User user2 = this.A08;
        if (user2.A03() == 1 && user2.A0B() != null) {
            C3DO c3do = C3DN.A00;
            FragmentActivity fragmentActivity = this.A01;
            C3DN A00 = c3do.A00(fragmentActivity);
            if (A00 != null) {
                A00.A0B();
            }
            Context context = this.A00;
            UserSession userSession = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A03;
            UserBannerInlineOtherProfileDict A0B = user2.A0B();
            if (A0B != null && (AY7 = A0B.AY7()) != null) {
                int ordinal = AY7.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, A0B.AY2(), "profile_bio_user_tag", interfaceC11380iw.getModuleName());
                        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
                        c140966Yy.A0F = true;
                        c140966Yy.A0D(AbstractC31364DqT.A03().A01.A02(userSession, A01.A03()));
                        c140966Yy.A04();
                    }
                } else {
                    boolean z = false;
                    if (AbstractC35190Ffi.A00(context.getPackageManager()) == null) {
                        z = true;
                    }
                    AbstractC35190Ffi.A02(context, interfaceC11380iw, userSession, "ig_profile_bio", AbstractC13670mt.A06("https://m.facebook.com/%s", A0B.AY2()), AbstractC13670mt.A06(S8X.A00, A0B.AY2()), null, null, z);
                }
            }
        } else {
            Context context2 = this.A00;
            UserSession userSession2 = this.A04;
            String fbidV2 = user.A03.getFbidV2();
            String A04 = C18U.A04(C06090Tz.A05, userSession2, 36885711715959459L);
            if (AbstractC001900j.A0T(A04) || A04.equals("None")) {
                A04 = "Other profiles";
            }
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession2);
            igBloksScreenConfig.A0l = false;
            igBloksScreenConfig.A0U = A04;
            igBloksScreenConfig.A0R = "com.bloks.www.nme.ig_bio.related_account_display";
            igBloksScreenConfig.A0i = true;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            new BitSet(0);
            hashMap.put("profile_owner_fbid", fbidV2);
            C66277U6x A02 = C66277U6x.A02("com.bloks.www.nme.ig_bio.related_account_display", AbstractC191768eY.A01(hashMap), hashMap2);
            A02.A00 = -1;
            A02.A05 = null;
            A02.A01 = 0L;
            A02.A06 = null;
            A02.A03 = null;
            A02.A02 = null;
            A02.A04 = null;
            A02.A08(hashMap3);
            A02.A05(context2, igBloksScreenConfig);
        }
        this.A07.A06("tap_related_accounts_banner");
    }

    @Override // X.AnonymousClass738
    public final void Df4() {
    }

    @Override // X.AnonymousClass739
    public final void Df5() {
    }

    public AnonymousClass735(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MWW mww, InterfaceC678133v interfaceC678133v, C72q c72q, User user, boolean z) {
        this.A05 = mww;
        this.A06 = interfaceC678133v;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A04 = userSession;
        this.A02 = abstractC59962oe;
        this.A08 = user;
        this.A09 = z;
        this.A03 = interfaceC11380iw;
        this.A07 = c72q;
    }

    @Override // X.AnonymousClass737
    public final MWW BVe() {
        return this.A05;
    }

    @Override // X.AnonymousClass737
    public final InterfaceC678133v BVi() {
        return this.A06;
    }

    @Override // X.C73A
    public final void CvZ() {
        this.A07.A06("tap_add_school_banner");
        UserSession userSession = this.A04;
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_ARGUMENT_ENTRYPOINT", "profile_bio");
        AbstractC59962oe abstractC59962oe = this.A02;
        C6XJ c6xj = new C6XJ(abstractC59962oe.getActivity(), bundle, userSession, ModalActivity.class, "school_add");
        c6xj.A08();
        c6xj.A0A(abstractC59962oe.getActivity(), 7002);
    }

    @Override // X.C73C
    public final void D2l(C44Q c44q, InterfaceC11380iw interfaceC11380iw, String str) {
        C3DN A00 = C3DN.A00.A00(this.A01);
        if (A00 != null) {
            A00.A0B();
        }
        C72q c72q = this.A07;
        c72q.A02().D2l(c44q, interfaceC11380iw, "user_profile_header");
        c72q.A06("tap_channel_banner");
    }

    @Override // X.C73D
    public final void DF8(JLK jlk, User user) {
        User user2;
        String Ap3;
        String str;
        Long l;
        List CEC;
        C3DN A00 = C3DN.A00.A00(this.A01);
        if (A00 != null) {
            A00.A0B();
        }
        C72q c72q = this.A07;
        C1572073z c1572073z = (C1572073z) c72q.A06.A0Z.getValue();
        ProductCollection AyL = jlk.AyL();
        if (AyL != null && (CEC = AyL.CEC()) != null) {
            user2 = (User) AbstractC001800i.A0J(CEC);
        } else {
            user2 = null;
        }
        ProductCollection AyL2 = jlk.AyL();
        if (AyL2 != null && (Ap3 = AyL2.Ap3()) != null && Ap3.length() > 0 && user2 != null) {
            user2.getUsername();
            if (AbstractC76433bn.A00(user2) != null) {
                UserSession userSession = c1572073z.A02;
                String moduleName = c1572073z.A04.getModuleName();
                InterfaceC60442pS interfaceC60442pS = c1572073z.A03;
                String A002 = AbstractC76433bn.A00(user2);
                ProductCollection AyL3 = jlk.AyL();
                String str2 = null;
                if (AyL3 != null) {
                    str = AyL3.Ap3();
                } else {
                    str = null;
                }
                C0Zx c0Zx = new C0Zx();
                if (str != null) {
                    l = AbstractC003100w.A0k(10, str);
                } else {
                    l = null;
                }
                c0Zx.A05("incentive_id", l);
                c0Zx.A06("product_collection_type", "discount");
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
                C25531Mh c25531Mh = new C25531Mh(A01.A00(A01.A00, "instagram_expiring_discount_tap"), 290);
                Long l2 = null;
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    String moduleName2 = interfaceC60442pS.getModuleName();
                    if (moduleName2 == null) {
                        moduleName2 = "";
                    }
                    c25531Mh.A0R("container_module", moduleName2);
                    c25531Mh.A0j("expiring_discount_tap");
                    c25531Mh.A0R("submodule", "profile_featured_events_header");
                    c25531Mh.A0R("prior_module", moduleName);
                    if (A002 != null) {
                        l2 = C4SX.A00(A002).A00;
                    }
                    c25531Mh.A0Q("merchant_id", l2);
                    c25531Mh.A0N(c0Zx, "collections_logging_info");
                    c25531Mh.Cht();
                }
                INF A0J = C1XJ.A00.A0J(c1572073z.A01, userSession, EnumC39622HeW.A07, c1572073z.A06, interfaceC60442pS.getModuleName());
                A0J.A0A = "profile_featured_events_header";
                ProductCollection AyL4 = jlk.AyL();
                if (AyL4 != null) {
                    str2 = AyL4.Ap3();
                }
                A0J.A04 = str2;
                A0J.A08 = AbstractC76433bn.A00(user2);
                A0J.A0D = user2.getUsername();
                A0J.A00();
            }
        }
        c72q.A06("tap_expiring_discount");
    }

    @Override // X.AnonymousClass738
    public final void DFZ(User user, boolean z) {
        String str;
        String A04 = C18U.A04(C06090Tz.A05, this.A04, 36883040245318122L);
        if (z) {
            str = "banner_bottom_sheet";
        } else {
            str = "banner";
        }
        C72q c72q = this.A07;
        c72q.A02().A0A(this.A03, user, str, A04);
        c72q.A06("tap_facebook_page_banner");
    }

    @Override // X.AnonymousClass739
    public final void DFa(boolean z) {
        String str;
        String A04 = C18U.A04(C06090Tz.A05, this.A04, 36883040245252585L);
        if (z) {
            str = "banner_bottom_sheet";
        } else {
            str = "banner";
        }
        C72q c72q = this.A07;
        c72q.A02().A0B(this.A03, str, A04);
        c72q.A06("tap_facebook_profile_banner");
    }

    @Override // X.C73E
    public final void DIk(String str, String str2, boolean z, String str3) {
        C14360o3.A0B(str, 0);
        C3DN A00 = C3DN.A00.A00(this.A01);
        if (A00 != null) {
            A00.A0B();
        }
        C72q c72q = this.A07;
        C1572073z c1572073z = (C1572073z) c72q.A06.A0Z.getValue();
        UserSession userSession = c1572073z.A02;
        UserDetailFragment userDetailFragment = c1572073z.A04;
        MUB mub = c1572073z.A05;
        String A02 = mub.A02();
        C18920wW A01 = AbstractC12220kQ.A01(userDetailFragment, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_cg_click_open_fundraiser");
        A002.AAP(MSV.A00(264), "USER_PROFILE");
        A002.A9K("fundraiser_id", Long.valueOf(Long.parseLong(str)));
        A002.A9K("source_owner_id", Long.valueOf(Long.parseLong(A02)));
        A002.Cht();
        AbstractC55224Oeq.A09(userDetailFragment.requireActivity(), userSession, str, "USER_PROFILE", mub.A02(), null);
        c72q.A06("tap_fundraiser_banner");
    }

    @Override // X.C73A
    public final void DiS() {
        this.A07.A06("tap_school_banner");
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_ARGUMENT_ENTRYPOINT", "profile_bio");
        EnumC39642HiX A00 = AbstractC40791I5t.A00(null, bundle.getString("BUNDLE_ARGUMENT_ENTRYPOINT"));
        C26823Bsl c26823Bsl = new C26823Bsl();
        c26823Bsl.A00 = A00;
        C140966Yy c140966Yy = new C140966Yy(this.A02.requireActivity(), this.A04);
        c140966Yy.A0B(null, c26823Bsl);
        c140966Yy.A0F = true;
        c140966Yy.A04();
    }

    @Override // X.C73G
    public final void Dst() {
        C35265Fh0 c35265Fh0 = C35265Fh0.A00;
        UserSession userSession = this.A04;
        FragmentActivity fragmentActivity = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        User user = this.A08;
        c35265Fh0.A08(fragmentActivity, interfaceC11380iw, userSession, user);
        if (C151366re.A06(userSession) && C18U.A06(C06090Tz.A05, userSession, 36318857639303796L)) {
            user.A04 = 0;
        }
    }

    @Override // X.C73H
    public final void Dwu(UpcomingEvent upcomingEvent, User user) {
        C3DN A00 = C3DN.A00.A00(this.A01);
        if (A00 != null) {
            ((C3DP) A00).A0H = new C24127AnC(this.A07, upcomingEvent, user);
            A00.A0B();
        }
        C72q c72q = this.A07;
        ((C1572073z) c72q.A06.A0Z.getValue()).A00(upcomingEvent, user);
        c72q.A06("tap_upcoming_event_banner");
    }
}
