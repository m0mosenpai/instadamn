package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ENY extends AbstractC60672pq implements InterfaceC60442pS, C51E, C51D, InterfaceC37297Gby, C38M, InterfaceC60122ou, C53T, C38O, GYO {
    public static final String __redex_internal_original_name = "SocialContextFollowListFragment";
    public View A00;
    public InterfaceC38371qR A01;
    public C71L A02;
    public C32411EPm A03;
    public SocialContextFollowListFragmentConfig A04;
    public boolean A05;
    public boolean A06;
    public C31253Dob A08;
    public C161887My A09;
    public final C61372qz A0A = new C61372qz();
    public final HashMap A0B = AbstractC166987dD.A1G();
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public boolean A07 = true;

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0n(this);
        return c193328hC;
    }

    @Override // X.C53T
    public final void D3g(IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, int i, int i2, boolean z, boolean z2) {
        AbstractC167007dF.A1E(interfaceC38371qR, 0, igImageView);
        InterfaceC09390do interfaceC09390do = this.A0C;
        C5SE c5se = new C5SE(AbstractC166987dD.A0r(interfaceC09390do), interfaceC38371qR);
        c5se.A00 = i2;
        c5se.A01 = i;
        C37952Gmu c37952Gmu = new C37952Gmu(this, AbstractC166987dD.A0r(interfaceC09390do), c5se, this, C2Fb.A3X);
        AbstractC31177DnL.A1K(interfaceC38371qR, c37952Gmu, i2, i);
        c37952Gmu.A00(igImageView, c5se, interfaceC38371qR.BQN());
        if (interfaceC38371qR instanceof C40971v4) {
            c37952Gmu.A0O = (C40971v4) interfaceC38371qR;
        }
        new C37953Gmv(c37952Gmu).A04();
        C38321qM BQN = interfaceC38371qR.BQN();
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        EnumC906041v enumC906041v = null;
        AndroidLink A02 = AbstractC905941u.A02(requireActivity, A0r, BQN, i2, false);
        EnumC906041v enumC906041v2 = null;
        if (A02 != null) {
            enumC906041v = AbstractC114965Hm.A01(A02);
        }
        if (enumC906041v != EnumC906041v.AD_DESTINATION_CANVAS) {
            if (A02 != null) {
                enumC906041v2 = AbstractC114965Hm.A01(A02);
            }
            if (enumC906041v2 != EnumC906041v.AD_DESTINATION_CLIPS_VIEWER) {
                return;
            }
        }
        AbstractC31179DnN.A0x(this);
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C14360o3.A0B(user, 0);
        FYD.A01(this, AbstractC166987dD.A0r(this.A0C), user, "mutual_list");
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
        C14360o3.A0B(user, 0);
        FYD.A00(this, AbstractC166987dD.A0r(this.A0C), user);
    }

    @Override // X.InterfaceC37297Gby
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    @Override // X.C38M
    public final void D4P(SparseArray sparseArray, Integer num) {
    }

    @Override // X.C38M
    public final void D4T(SparseArray sparseArray) {
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
    }

    @Override // X.InterfaceC37297Gby
    public final void DTn(View view, User user, boolean z) {
    }

    @Override // X.GYZ
    public final void Des(User user) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
        if (socialContextFollowListFragmentConfig == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        if (!socialContextFollowListFragmentConfig.A06) {
            AbstractC25229BEm.A1G(interfaceC56362iU, 2131962754);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_social_context";
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        return AbstractC167007dF.A1N(AbstractC31174DnI.A0G(this).canScrollVertically(1) ? 1 : 0);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return AbstractC167007dF.A1N(AbstractC31174DnI.A0G(this).canScrollVertically(-1) ? 1 : 0);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C61372qz c61372qz = this.A0A;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        InterfaceC09390do interfaceC09390do = this.A0C;
        c61372qz.A03(new C31552Dtc(AbstractC166987dD.A0r(interfaceC09390do), this));
        getScrollingViewProxy().AAJ(new Eg5(this, 1));
        C32411EPm c32411EPm = this.A03;
        if (c32411EPm == null) {
            str = "socialContextFollowListAdapter";
        } else {
            setAdapter(c32411EPm);
            if (this.A02 != null) {
                EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0b;
                C71313Hs A00 = C71313Hs.A00(AbstractC166987dD.A0o(interfaceC09390do));
                C14360o3.A07(A00);
                A00.A08(view, new C71353Hw(null, enumC71343Hv, null, null));
                View view2 = this.A00;
                if (view2 == null) {
                    str = "followContainer";
                } else {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    C37993Gne c37993Gne = new C37993Gne(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), this);
                    View A01 = C37993Gne.A04.A01(requireContext(), viewGroup, AbstractC166987dD.A0r(interfaceC09390do));
                    C25601BTo c25601BTo = new C25601BTo(AbstractC166987dD.A0r(interfaceC09390do), this, this);
                    C37994Gnf c37994Gnf = new C37994Gnf(-1, 0);
                    Object tag = A01.getTag();
                    if (tag != null) {
                        C37991Gnc c37991Gnc = (C37991Gnc) tag;
                        InterfaceC38371qR interfaceC38371qR = this.A01;
                        if (interfaceC38371qR != null) {
                            c37993Gne.A00(c25601BTo.A00(interfaceC38371qR, c37994Gnf), c37991Gnc);
                            viewGroup.addView(A01);
                            viewGroup.invalidate();
                            C71L c71l = this.A02;
                            if (c71l != null) {
                                c71l.A02(A01);
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            if (this.A05 && getScrollingViewProxy().CXX()) {
                AbstractC31174DnI.A0G(this).setBackground(null);
                return;
            }
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C38M
    public final void D4Q() {
        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A04;
        SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
        if (socialContextFollowListFragmentConfig == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        FollowListData A00 = AbstractC31565Dtq.A00(enumC31556Dtg, socialContextFollowListFragmentConfig.A08, null, true);
        FYE.A00(requireActivity(), AbstractC166987dD.A0r(this.A0C), A00, false).A04();
        AbstractC25233BEq.A14(this);
    }

    @Override // X.C38M
    public final void D4R() {
        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A0E;
        SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
        if (socialContextFollowListFragmentConfig == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        FollowListData A00 = AbstractC31565Dtq.A00(enumC31556Dtg, socialContextFollowListFragmentConfig.A08, null, true);
        FYE.A00(requireActivity(), AbstractC166987dD.A0r(this.A0C), A00, true).A04();
        AbstractC25233BEq.A14(this);
    }

    @Override // X.C38M
    public final void D4S() {
        if (AbstractC167007dF.A1W(C37001nx.A02)) {
            C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity(), this.A0C);
            A0c.A0B(null, AbstractC35067Fce.A00().A00().A01("social_context_follow_list", getString(2131960982)));
            A0c.A04();
            AbstractC25233BEq.A14(this);
        }
    }

    @Override // X.GYO
    public final void EHl(UserSession userSession, int i) {
        C32411EPm c32411EPm = this.A03;
        String str = "socialContextFollowListAdapter";
        if (c32411EPm != null) {
            if (i < c32411EPm.A05.size()) {
                C32411EPm c32411EPm2 = this.A03;
                if (c32411EPm2 != null) {
                    if (i < c32411EPm2.A04 - 1) {
                        User user = (User) c32411EPm2.A05.get(i);
                        HashMap hashMap = this.A0B;
                        if (!hashMap.containsKey(user.getId())) {
                            hashMap.put(user.getId(), Integer.valueOf(i));
                            UserSession A0r = AbstractC166987dD.A0r(this.A0C);
                            String id = user.getId();
                            SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
                            if (socialContextFollowListFragmentConfig == null) {
                                str = DexStore.CONFIG_FILENAME;
                            } else {
                                FY4.A00(A0r, socialContextFollowListFragmentConfig.A07, null, id, null, "profile_social_context", i);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C71L c71l = this.A02;
        if (c71l != null) {
            c71l.A01(i);
        }
    }

    @Override // X.InterfaceC37297Gby
    public final void onUserRowClick(User user) {
        Number number = (Number) AbstractC31174DnI.A0r(user, this.A0B);
        if (number != null) {
            UserSession A0r = AbstractC166987dD.A0r(this.A0C);
            SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = this.A04;
            if (socialContextFollowListFragmentConfig != null) {
                FollowListData followListData = socialContextFollowListFragmentConfig.A07;
                String id = user.getId();
                int intValue = number.intValue();
                SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig2 = this.A04;
                if (socialContextFollowListFragmentConfig2 != null) {
                    FY4.A01(A0r, followListData, id, "follow_list_user_tap", socialContextFollowListFragmentConfig2.A07.A02, "profile_social_context", intValue);
                }
            }
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        InterfaceC09390do interfaceC09390do = this.A0C;
        UserDetailLaunchConfig A03 = AbstractC31402Dr6.A03(AbstractC166987dD.A0r(interfaceC09390do), user.getId(), "social_context_follow_list", "profile_social_context");
        if (this.A05) {
            FYC.A00(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), A03);
            return;
        }
        C140966Yy A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
        A0j.A0F = true;
        A0j.A0D(AbstractC31364DqT.A02().A02(AbstractC166987dD.A0r(interfaceC09390do), A03));
        A0j.A04();
        AbstractC25233BEq.A14(this);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10, 36325600734164164L) == false) goto L20;
     */
    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENY.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(156961811);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        this.A00 = inflate.requireViewById(R.id.layout_listview_parent_container);
        C0f9.A09(591743807, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1264700878);
        C161887My c161887My = this.A09;
        if (c161887My == null) {
            C14360o3.A0F("followStatusUpdatedListener");
            throw C00O.createAndThrow();
        }
        c161887My.A01();
        this.A02 = null;
        super.onDestroy();
        C0f9.A09(168638293, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(153376878);
        super.onPause();
        this.A06 = false;
        C0f9.A09(-399605249, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1603283978);
        super.onResume();
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0C), 36324939309003362L)) {
            ((C32411EPm) getAdapter()).A0C();
        }
        this.A06 = true;
        C0f9.A09(-1173621446, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(521730998);
        super.onStart();
        AbstractC31557Dth.A01(this, this.A07);
        C0f9.A09(179233909, A02);
    }
}
