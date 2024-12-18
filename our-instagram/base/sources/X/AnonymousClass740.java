package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.profile.fragment.ProfileFollowRelationshipFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.740, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass740 implements AnonymousClass741 {
    public C31349DqE A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final InterfaceC11380iw A03;
    public final C18920wW A04;
    public final UserSession A05;
    public final AnonymousClass708 A06;
    public final UserDetailFragment A07;
    public final UserDetailTabController A08;
    public final MUB A09;
    public final String A0A;
    public final EnumC906041v A0B;
    public final C70C A0C;
    public final C64842wi A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        String str;
        C14360o3.A0B(user, 0);
        if (user.A0F() == FollowStatus.A05) {
            str = MSV.A00(1188);
        } else {
            str = "button_tray";
        }
        D3x(user, str, true);
    }

    @Override // X.AnonymousClass741
    public final void D3x(User user, String str, boolean z) {
        UserDetailFragment userDetailFragment;
        C229419w A02;
        View view;
        String str2;
        String str3;
        FollowStatus A0F = user.A0F();
        if (!user.CQf()) {
            UserSession userSession = this.A05;
            UserDetailFragment userDetailFragment2 = this.A07;
            if (A0F == FollowStatus.A05) {
                str3 = "unfollow";
            } else {
                str3 = "follow";
            }
            EnumC1571773w A01 = C1571673v.A01(A0F);
            MUB mub = this.A09;
            String A022 = mub.A02();
            String str4 = this.A0A;
            String str5 = this.A0F;
            UserDetailLaunchConfig userDetailLaunchConfig = mub.A0B;
            C1571673v.A0A(userDetailFragment2, userSession, A01, str3, A022, str4, str5, userDetailLaunchConfig.A0D, userDetailLaunchConfig.A0E, str);
        }
        FollowStatus followStatus = FollowStatus.A06;
        if (A0F == followStatus && z && !CoO()) {
            this.A08.A0L(EnumC155676yw.A04);
        }
        UserDetailLaunchConfig userDetailLaunchConfig2 = this.A09.A0B;
        String str6 = userDetailLaunchConfig2.A0G;
        if (str6 != null && !TextUtils.isEmpty(str6)) {
            UserSession userSession2 = this.A05;
            UserDetailFragment userDetailFragment3 = this.A07;
            String str7 = userDetailLaunchConfig2.A0D;
            String str8 = userDetailLaunchConfig2.A0E;
            FollowStatus B7L = user.B7L();
            FollowStatus followStatus2 = FollowStatus.A05;
            if (B7L == followStatus2 || user.B7L() == FollowStatus.A07) {
                C19280xC A00 = C19280xC.A00(userDetailFragment3, "search_follow_button_clicked");
                A00.A0C("rank_token", str6);
                A00.A0C(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId());
                A00.A09("inline", false);
                if (user.B7L() == followStatus2) {
                    str2 = "follow";
                } else {
                    str2 = "requested";
                }
                A00.A0C("follow_status", str2);
                if (str7 != null) {
                    A00.A0C("hashtag_id", str7);
                }
                if (str8 != null) {
                    A00.A0C("hashtag_name", str8);
                }
                AbstractC11060iN.A00(userSession2).EHW(A00);
            }
        }
        UserSession userSession3 = this.A05;
        if (C57582kX.A00(userSession3).A0N(user) == followStatus && user.A0M() == C05F.A0C) {
            C1OU.A04(userSession3).A0c(user.getId());
            C155666yv c155666yv = this.A08.A0O;
            if (c155666yv.A0E != null) {
                c155666yv.A0E = null;
                c155666yv.A00();
            }
        }
        if (A0F == FollowStatus.A05 && user.A27()) {
            C36511G8j c36511G8j = new C36511G8j(this);
            C146106i8 c146106i8 = new C146106i8();
            userDetailFragment = this.A07;
            c146106i8.A0D = userDetailFragment.requireContext().getString(2131972216, user.getUsername());
            c146106i8.A09 = user.Bhu();
            c146106i8.A0B(EnumC142006bJ.A03);
            c146106i8.A0L = true;
            c146106i8.A0A(c36511G8j);
            String string = userDetailFragment.requireContext().getString(2131972214);
            C14360o3.A07(string);
            c146106i8.A0G = string;
            c146106i8.A01 = 10000;
            c146106i8.A02 = userDetailFragment.requireContext().getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
            C31349DqE A002 = c146106i8.A00();
            this.A00 = A002;
            C41451vu.A01.E4s(new C3KD(A002));
        } else {
            C35266Fh1 c35266Fh1 = C35266Fh1.A00;
            InterfaceC11380iw interfaceC11380iw = this.A03;
            userDetailFragment = this.A07;
            Context requireContext = userDetailFragment.requireContext();
            FragmentActivity requireActivity = userDetailFragment.requireActivity();
            if (C17060sy.A01.A01(userSession3).A0M() == C05F.A0C && ((!C35266Fh1.A05(userSession3) || !C35266Fh1.A06(userSession3, c35266Fh1)) && user.A0F() == followStatus && !user.A27() && !user.A2I() && (A02 = C18U.A02(userSession3, 36328108994935984L)) != null && A02.AhE(C06090Tz.A04, 36328108994935984L) && C35266Fh1.A00(userSession3, c35266Fh1) < 3)) {
                if (C35266Fh1.A00(userSession3, c35266Fh1) == 0) {
                    C229419w A023 = C18U.A02(userSession3, 36891058948539286L);
                    String str9 = null;
                    if (A023 != null) {
                        C06090Tz A003 = C06090Tz.A00(new C06090Tz());
                        A003.A03 = true;
                        C06090Tz A004 = C06090Tz.A00(A003);
                        A004.A01 = true;
                        str9 = A023.C2x(A004, 36891058948539286L);
                    }
                    if (str9 != null && str9.equals("bottomsheet_and_toast")) {
                        List singletonList = Collections.singletonList(user);
                        C14360o3.A07(singletonList);
                        C35266Fh1.A01(requireActivity, requireContext, interfaceC11380iw, userSession3, new C36483G7h(), singletonList);
                        C35266Fh1.A04(userSession3, c35266Fh1);
                    }
                }
                C35266Fh1.A02(requireContext, interfaceC11380iw, userSession3, user, true);
            }
        }
        C70J c70j = userDetailFragment.A0l;
        if (c70j != null && (view = userDetailFragment.A03) != null && userDetailFragment.A19 != null) {
            User user2 = userDetailFragment.A10.A03;
            FragmentActivity requireActivity2 = userDetailFragment.requireActivity();
            AbstractC10360h2 parentFragmentManager = userDetailFragment.getParentFragmentManager();
            AbstractC018607g abstractC018607g = userDetailFragment.A08;
            UserSession userSession4 = userDetailFragment.A0I;
            C14360o3.A0B(abstractC018607g, 4);
            C14360o3.A0B(userSession4, 6);
            if (user2 != null) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileExpandedPictureBinder.Holder");
                C9JK c9jk = C9JK.A00;
                ViewGroup viewGroup = ((C70K) tag).A01;
                Context context = view.getContext();
                C14360o3.A07(context);
                c9jk.A01(viewGroup, C70J.A00(requireActivity2, context, parentFragmentManager, abstractC018607g, userDetailFragment, userSession4, userDetailFragment, c70j, userDetailFragment, user2));
            }
        }
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.AnonymousClass741
    public final void D4V(User user) {
        UserSession userSession = this.A05;
        UserDetailFragment userDetailFragment = this.A07;
        EnumC1571773w A00 = A00();
        MUB mub = this.A09;
        C1571673v.A08(userDetailFragment, userSession, A00, "share_profile_url", mub.A02(), this.A0A, this.A0F, "button_tray");
        if (AbstractC82073lT.A02(userSession)) {
            Bundle bundle = new Bundle();
            bundle.putString("displayed_user_id", user.getId());
            FAK.A00(this.A02, bundle, userSession, mub.A02(), false);
            return;
        }
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36314837548731227L);
        Bundle A002 = AbstractC177607uu.A00(null, EnumC33405Epc.A08, false);
        A002.putBoolean("NametagFragment.ARGUMENT_ENABLE_DOWNLOAD_QR", A06);
        FragmentActivity fragmentActivity = this.A02;
        C6XJ c6xj = new C6XJ(fragmentActivity, A002, userSession, TransparentModalActivity.class, "nametag");
        c6xj.A07();
        c6xj.A0C(fragmentActivity);
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
        C28151Xt c28151Xt;
        C35015Fbo A00;
        C14360o3.A0B(user, 0);
        C14360o3.A0B(enumC33402EpZ, 1);
        if (EnumC33402EpZ.A09 == enumC33402EpZ && (c28151Xt = C28151Xt.A02) != null && (A00 = c28151Xt.A00()) != null) {
            A00.A01(this.A07, this.A04, this.A05, user);
        }
    }

    @Override // X.AnonymousClass741
    public final boolean DQp(User user) {
        UserSession userSession = this.A05;
        if (!C18U.A06(C06090Tz.A05, userSession, 36330518471590799L)) {
            return false;
        }
        FragmentActivity fragmentActivity = this.A02;
        UserDetailFragment userDetailFragment = this.A07;
        AbstractC10360h2 abstractC10360h2 = userDetailFragment.mFragmentManager;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        AbstractC31510Dsu.A04(fragmentActivity, null, abstractC10360h2, AbstractC018607g.A00(userDetailFragment), interfaceC11380iw, userSession, user, null, AbstractC43591JPw.A00(1314), null, null, C02G.A01(userDetailFragment.requireContext()).getString(2131965783), false);
        return true;
    }

    @Override // X.AnonymousClass741
    public final void El6(View view) {
        UserDetailFragment userDetailFragment = this.A07;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(userDetailFragment.A0I);
            String id = user.getId();
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            java.util.Set C2v = interfaceC19630xq.C2v("long_press_follow_tooltip_shown_account_set");
            if (C2v.size() < 2 && !C2v.contains(id) && AbstractC152466tZ.A03(view)) {
                UserSession userSession = userDetailFragment.A0I;
                C14360o3.A0B(userSession, 0);
                if (C57582kX.A00(userSession).A0N(user) == FollowStatus.A06 && (!AbstractC35181FfY.A01(userSession, user).isEmpty())) {
                    C5SW c5sw = userDetailFragment.A0X;
                    if (c5sw == null) {
                        c5sw = AbstractC152466tZ.A00(userDetailFragment.requireActivity(), view, EnumC58132lV.A03, userDetailFragment.getString(2131965784));
                        userDetailFragment.A0X = c5sw;
                    }
                    if (!UserDetailFragment.A0i(userDetailFragment)) {
                        c5sw.A07(userDetailFragment.A0I);
                        java.util.Set A0j = AbstractC001800i.A0j(interfaceC19630xq.C2v("long_press_follow_tooltip_shown_account_set"));
                        A0j.add(id);
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.EEj("long_press_follow_tooltip_shown_account_set");
                        ARD.apply();
                        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                        ARD2.E7L("long_press_follow_tooltip_shown_account_set", A0j);
                        ARD2.apply();
                    }
                }
            }
        }
    }

    public AnonymousClass740(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, EnumC906041v enumC906041v, AnonymousClass708 anonymousClass708, UserDetailFragment userDetailFragment, C70C c70c, UserDetailTabController userDetailTabController, MUB mub, C64842wi c64842wi, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(c70c, 10);
        this.A05 = userSession;
        this.A07 = userDetailFragment;
        this.A02 = fragmentActivity;
        this.A08 = userDetailTabController;
        this.A09 = mub;
        this.A0A = str;
        this.A0F = str2;
        this.A0E = str3;
        this.A0B = enumC906041v;
        this.A0C = c70c;
        this.A06 = anonymousClass708;
        this.A04 = c18920wW;
        this.A0D = c64842wi;
        this.A03 = interfaceC11380iw;
        this.A0G = str4;
        this.A0H = str5;
        this.A0I = z;
    }

    private final EnumC1571773w A00() {
        User user = this.A08.A0O.A0J;
        if (user != null) {
            UserSession userSession = this.A05;
            if (C14360o3.A0K(userSession.userId, user.getId())) {
                return EnumC1571773w.A05;
            }
            if (C57582kX.A00(userSession).A0N(user) == FollowStatus.A05) {
                return EnumC1571773w.A03;
            }
        }
        return EnumC1571773w.A04;
    }

    public static final void A02(AnonymousClass740 anonymousClass740, String str) {
        User user = anonymousClass740.A08.A0O.A0J;
        if (user != null) {
            FragmentActivity fragmentActivity = anonymousClass740.A02;
            UserSession userSession = anonymousClass740.A05;
            AbstractC34829FWk.A00(fragmentActivity, anonymousClass740.A07, anonymousClass740.A03, userSession, user, str, anonymousClass740.A0A, anonymousClass740.A0I);
        }
    }

    @Override // X.AnonymousClass741
    public final boolean CoO() {
        C155666yv c155666yv;
        User user;
        Boolean BBJ;
        String str;
        UserDetailFragment userDetailFragment = this.A07;
        if ((!userDetailFragment.A30.A00.isEmpty()) || (user = (c155666yv = this.A08.A0O).A0J) == null || (BBJ = user.A03.BBJ()) == null || !BBJ.booleanValue()) {
            return false;
        }
        User user2 = c155666yv.A0J;
        if (user2 != null) {
            str = user2.getId();
        } else {
            str = null;
        }
        if (userDetailFragment.isVisible() && str != null) {
            UserSession userSession = this.A05;
            C1570473j c1570473j = new C1570473j(userSession, "non_self_profile_chaining", 31791406);
            c1570473j.A0Q(userDetailFragment.requireContext(), C55772hI.A00(userSession), userDetailFragment);
            ((MTJ) c1570473j).A00.A08(null);
            c1570473j.A0E("fetch_request_start");
            C1ON A00 = AbstractC31484DsT.A00(userSession, C05F.A00, str, null, false);
            A00.A00 = new C32515ETr(c1570473j, this);
            userDetailFragment.schedule(A00);
        }
        return true;
    }

    @Override // X.AnonymousClass741
    public final void D2g(String str) {
        EnumC53341Nir enumC53341Nir;
        UserSession userSession = this.A05;
        C35988Fum c35988Fum = new C35988Fum(this);
        C18920wW A01 = AbstractC12220kQ.A01(c35988Fum, userSession);
        C155666yv c155666yv = this.A08.A0O;
        EnumC155676yw enumC155676yw = c155666yv.A0A;
        EnumC155676yw enumC155676yw2 = EnumC155676yw.A02;
        String A02 = this.A09.A02();
        C14360o3.A0B(A02, 0);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "chaining_button_tapped");
        if (enumC155676yw == enumC155676yw2) {
            enumC53341Nir = EnumC53341Nir.OPEN;
        } else {
            enumC53341Nir = EnumC53341Nir.CLOSE;
        }
        A00.A8R(enumC53341Nir, "action");
        A00.AAP("target_user_id", A02);
        A00.AAP("module", c35988Fum.getModuleName());
        A00.Cht();
        if (this.A07.A12()) {
            if (!r1.A30.A00.isEmpty()) {
                CoO();
            } else {
                EJH();
                return;
            }
        } else if (CoO()) {
            return;
        }
        EnumC155676yw enumC155676yw3 = c155666yv.A0A;
        EnumC155676yw enumC155676yw4 = EnumC155676yw.A04;
        if (enumC155676yw3 == enumC155676yw4) {
            c155666yv.A0A = enumC155676yw2;
        } else if (enumC155676yw3 != enumC155676yw2) {
            return;
        } else {
            c155666yv.A0A = enumC155676yw4;
        }
        c155666yv.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.53S, java.lang.Object, X.FtG] */
    @Override // X.AnonymousClass741
    public final void D3n(String str) {
        UserSession userSession = this.A05;
        UserDetailFragment userDetailFragment = this.A07;
        EnumC1571773w enumC1571773w = EnumC1571773w.A05;
        MUB mub = this.A09;
        C1571673v.A08(userDetailFragment, userSession, enumC1571773w, "edit_profile", mub.A02(), this.A0A, this.A0F, "button_tray");
        C31721DwQ A04 = AbstractC31364DqT.A03().A01.A04("profile");
        C70C c70c = this.A0C;
        c70c.A03(A04, "edit_profile", false);
        c70c.A01();
        c70c.A02();
        String A02 = mub.A02();
        ?? obj = new Object();
        obj.A00 = A02;
        c70c.A04(obj);
        c70c.A00();
    }

    @Override // X.AnonymousClass741
    public final void D3w(C38321qM c38321qM, UserDetailEntryInfo userDetailEntryInfo, FollowButton followButton, String str, String str2, String str3, String str4) {
        C34943FaT c34943FaT;
        UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
        String str5 = str2;
        String str6 = str3;
        MUB mub = this.A09;
        User user = mub.A03;
        if (user != null) {
            UserSession userSession = this.A05;
            FollowStatus A0N = C57582kX.A00(userSession).A0N(user);
            if (user.CQf()) {
                FragmentActivity fragmentActivity = this.A02;
                if (str3 == null) {
                    str6 = "";
                }
                AbstractC35271Fh6.A02(fragmentActivity, userSession, followButton, this, user, str6);
                return;
            }
            FollowStatus followStatus = FollowStatus.A05;
            if (A0N == followStatus) {
                UserDetailFragment userDetailFragment = this.A07;
                EnumC1571773w A01 = C1571673v.A01(user.B7L());
                String A02 = mub.A02();
                String str7 = this.A0A;
                C1571673v.A08(userDetailFragment, userSession, A01, "tap_follow_sheet", A02, str7, this.A0F, str);
                if (C28151Xt.A02 != null) {
                    C75R.A0C(this.A04, "profile_following_sheet_entry_point", user.getId());
                }
                AbstractC31364DqT.A03();
                userDetailFragment.requireContext();
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                bundle.putString("ProfileFollowRelationshipFragment.ARG_DISPLAYED_USER_ID", user.getId());
                bundle.putString("ProfileFollowRelationShipFragment.ARG_SOURCE_COMMENT_ID", str4);
                bundle.putString("ProfileFollowRelationshipFragment.ARG_SOURCE_MEDIA_ID", str7);
                ProfileFollowRelationshipFragment profileFollowRelationshipFragment = new ProfileFollowRelationshipFragment();
                profileFollowRelationshipFragment.setArguments(bundle);
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0T = profileFollowRelationshipFragment;
                c189448aO.A0a = false;
                c189448aO.A03 = 0.7f;
                User user2 = mub.A03;
                if (user2 != null) {
                    c189448aO.A0d = user2.getUsername();
                    C189478aR A00 = c189448aO.A00();
                    User user3 = mub.A03;
                    if (user3 != null) {
                        Context requireContext = userDetailFragment.requireContext();
                        FragmentActivity fragmentActivity2 = this.A02;
                        UserDetailTabController userDetailTabController = this.A08;
                        if (str2 == null) {
                            str5 = "";
                        }
                        if (userDetailEntryInfo == null) {
                            userDetailEntryInfo2 = new UserDetailEntryInfo(null, null, null, null, null, null, null, null, null, null, null, null);
                        }
                        if (str3 == null) {
                            str6 = "";
                        }
                        AnonymousClass708 anonymousClass708 = this.A06;
                        profileFollowRelationshipFragment.A00 = new GIQ(fragmentActivity2, requireContext, userSession, c38321qM, A00, userDetailTabController, userDetailEntryInfo2, user3, anonymousClass708.BxR(), (C72q) anonymousClass708.A0d.getValue(), str5, str6);
                        A00.A03(userDetailFragment.requireContext(), profileFollowRelationshipFragment);
                        User user4 = userDetailFragment.A10.A03;
                        if (userDetailFragment.A12() || user4 == null) {
                            return;
                        }
                        user4.getId();
                        if (!user4.A2B() || user4.B7L() != followStatus) {
                            return;
                        }
                        User user5 = userDetailFragment.A10.A03;
                        if (userDetailFragment.A0u == null) {
                            FQ4 fq4 = userDetailFragment.A0v;
                            UserSession userSession2 = userDetailFragment.A0I;
                            if (user5 != null) {
                                c34943FaT = new C34943FaT();
                                String id = user5.getId();
                                C14360o3.A0B(userSession2, 0);
                                C25621Ms c25621Ms = new C25621Ms(userSession2, -2);
                                c25621Ms.A09(C05F.A0N);
                                c25621Ms.A0L("friendships/unfollow_chaining_count/%s/", id);
                                c25621Ms.A0P(null, EAO.class, C34749FSo.class, false);
                                C1ON A0N2 = c25621Ms.A0N();
                                A0N2.A00 = new ETK(userSession2, c34943FaT, fq4, user5);
                                C31361DqQ c31361DqQ = fq4.A02;
                                String id2 = user5.getId();
                                C18920wW c18920wW = c31361DqQ.A00;
                                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "unfollow_chaining_count_prefetch");
                                A002.AAP("target_id", id2);
                                A002.Cht();
                                C1GJ.A03(A0N2);
                            } else {
                                c34943FaT = null;
                            }
                            userDetailFragment.A0u = c34943FaT;
                            return;
                        }
                        if (user5 == null) {
                            return;
                        }
                        C31361DqQ c31361DqQ2 = userDetailFragment.A0v.A02;
                        String id3 = user5.getId();
                        C18920wW c18920wW2 = c31361DqQ2.A00;
                        InterfaceC02590Ai A003 = c18920wW2.A00(c18920wW2.A00, "unfollow_chaining_already_prefetched");
                        A003.AAP("target_id", id3);
                        A003.Cht();
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            FA7.A00(userSession).A02(EnumC33422Ept.A08, null);
            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
            C19260xA c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, this.A0G, "starting_clips_media_id");
            C19260xA.A00(c19260xA, this.A0H, "starting_clips_ranking_info_token");
            viewOnAttachStateChangeListenerC110564yT.A05(c19260xA, userSession, c38321qM, null, null, this, user, null, null, null);
            UserDetailFragment userDetailFragment2 = this.A07;
            User user6 = userDetailFragment2.A10.A03;
            if (user6 != null) {
                UserSession userSession3 = userDetailFragment2.A0I;
                C14360o3.A0B(userSession3, 0);
                if (C18U.A06(C06090Tz.A05, userSession3, 36322997983783775L) && userDetailFragment2.getActivity() != null) {
                    AbstractC59962oe abstractC59962oe = new AbstractC59962oe() { // from class: X.9f4
                        public static final String __redex_internal_original_name = "FollowRequestMessageBottomSheet";
                        public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

                        @Override // X.InterfaceC11380iw
                        public final String getModuleName() {
                            return "follow_request_message_bottom_sheet";
                        }

                        @Override // X.AbstractC59962oe
                        public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
                            return AbstractC166987dD.A0n(this.A00);
                        }

                        @Override // androidx.fragment.app.Fragment
                        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
                            int A022 = C0f9.A02(-1358423790);
                            C14360o3.A0B(layoutInflater, 0);
                            View inflate = layoutInflater.inflate(R.layout.layout_follow_request_message_bottom_sheet, viewGroup, false);
                            C14360o3.A07(inflate);
                            C0f9.A09(-1021328021, A022);
                            return inflate;
                        }
                    };
                    C189448aO c189448aO2 = new C189448aO(userDetailFragment2.A0I);
                    c189448aO2.A0d = userDetailFragment2.getString(2131970154, user6.getUsername());
                    c189448aO2.A00().A02(userDetailFragment2.getActivity(), abstractC59962oe);
                }
            }
            C64842wi c64842wi = this.A0D;
            EnumSet of = EnumSet.of(Trigger.A1d);
            C14360o3.A07(of);
            c64842wi.AVr(of);
        }
    }

    @Override // X.AnonymousClass741
    public final void D3z(String str, String str2) {
        C1571673v.A08(this.A07, this.A05, A00(), str, this.A09.A02(), this.A0A, this.A0F, "user_profile_header");
    }

    @Override // X.AnonymousClass741
    public final void DFO() {
        C193328hC c193328hC = new C193328hC((Activity) this.A02);
        c193328hC.A0m(this.A07, this.A05);
        c193328hC.A0A(2131962352);
        c193328hC.A09(2131962350);
        c193328hC.A0H(new DialogInterfaceOnClickListenerC63419Sjx(this), 2131962351);
        c193328hC.A0I(DialogInterfaceOnClickListenerC28559Cir.A00, android.R.string.cancel);
        c193328hC.A04();
        C0fJ.A00(c193328hC.A02());
    }

    @Override // X.AnonymousClass741
    public final void DQf(C38321qM c38321qM, UserDetailEntryInfo userDetailEntryInfo, String str, String str2, String str3) {
        User user = this.A09.A03;
        if (user != null) {
            UserSession userSession = this.A05;
            if (C57582kX.A00(userSession).A0N(user) == FollowStatus.A06 && (!AbstractC35181FfY.A01(userSession, user).isEmpty())) {
                EIW eiw = new EIW();
                eiw.A05 = user;
                eiw.A01 = c38321qM;
                eiw.A06 = str;
                eiw.A08 = str2;
                eiw.A07 = str3;
                eiw.A03 = userDetailEntryInfo;
                new C189448aO(userSession).A00().A02(this.A02, eiw);
            }
        }
    }

    @Override // X.AnonymousClass742
    public final void DSz(String str, boolean z) {
        User user;
        boolean z2;
        C155666yv c155666yv = this.A08.A0O;
        if (c155666yv.A0J != null) {
            C57582kX A00 = C57582kX.A00(this.A05);
            User user2 = c155666yv.A0J;
            if (user2 != null) {
                if (A00.A0Q(user2)) {
                    User user3 = c155666yv.A0J;
                    if (user3 != null) {
                        if (user3.A27()) {
                            User user4 = c155666yv.A0J;
                            if (user4 != null) {
                                if (!user4.A2I()) {
                                    User user5 = c155666yv.A0J;
                                    if (user5 != null) {
                                        user5.A1u();
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ENm(str);
        UserSession userSession = this.A05;
        User user6 = c155666yv.A0J;
        if (user6 != null && C4A4.A01(userSession) && AbstractC43959Jc8.A00(userSession) && user6.A1P()) {
            z2 = false;
        } else {
            if (C4A4.A03(userSession, 36316791756034709L) && (user = c155666yv.A0J) != null && C4A4.A01(userSession) && user.A1P()) {
                MonetizationRepository A002 = AbstractC63302u8.A00(userSession);
                UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.A07;
                if (!A002.A04(userMonetizationProductType) && A002.A05(userMonetizationProductType)) {
                    z2 = true;
                }
            }
            if (this.A0B == EnumC906041v.AD_DESTINATION_DIRECT_MESSAGE) {
                str = "message_button_ctd";
            }
            A02(this, str);
            return;
        }
        C50674MYs c50674MYs = new C50674MYs(this.A02, userSession);
        c50674MYs.A03(new ViewOnClickListenerC35559FnB(this, str), 2131959860);
        c50674MYs.A03(new ViewOnClickListenerC35575FnS(this, str, z2), 2131969369);
        HashMap hashMap = new HashMap();
        hashMap.put("show_brand_on_boarding_flow", String.valueOf(z2));
        hashMap.put("is_brand_onboarded", String.valueOf(AbstractC43959Jc8.A00(userSession)));
        UserDetailFragment userDetailFragment = this.A07;
        LL0.A05(userDetailFragment, userSession, C05F.A05, hashMap);
        new C31727DwY(c50674MYs).A07(userDetailFragment.requireContext());
    }

    @Override // X.AnonymousClass742
    public final void DT3(boolean z) {
        if (!this.A01 && z) {
            BP5 bp5 = new BP5(this.A05, null);
            String A02 = this.A09.A02();
            C14360o3.A0B(A02, 0);
            BP5.A00(bp5, AbstractC003100w.A0k(10, A02), "profile_stardust_message_icon_impression");
            this.A01 = true;
        }
    }

    @Override // X.AnonymousClass741
    public final void EJH() {
        UserDetailFragment userDetailFragment = this.A07;
        if (userDetailFragment.isVisible()) {
            UserSession userSession = this.A05;
            C1570473j c1570473j = new C1570473j(userSession, "self_profile_chaining", 31793260);
            c1570473j.A0Q(userDetailFragment.requireContext(), C55772hI.A00(userSession), userDetailFragment);
            ((MTJ) c1570473j).A00.A08(null);
            c1570473j.A0E("fetch_request_start");
            C1ON A00 = AbstractC31513Dsx.A00(userSession, null, userDetailFragment.getModuleName(), null, null, null, null, null, false, false);
            A00.A00 = new C31555Dtf(c1570473j, this);
            userDetailFragment.schedule(A00);
        }
    }

    @Override // X.AnonymousClass741
    public final void ENm(String str) {
        UserSession userSession = this.A05;
        C1571673v.A09(this.A07, userSession, A00(), AbstractC43591JPw.A00(922), this.A09.A02(), this.A0A, this.A0F, this.A0E, str);
    }

    public static final void A01(AnonymousClass740 anonymousClass740, int i) {
        C0f5 A00 = C18950wb.A00(anonymousClass740.getClass().getSimpleName(), i, true);
        A00.ABW("su_check_timeout_event", "Checking whether there is a cache timeout event.");
        A00.report();
    }
}
