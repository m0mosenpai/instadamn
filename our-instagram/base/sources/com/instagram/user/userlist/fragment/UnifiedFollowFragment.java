package com.instagram.user.userlist.fragment;

import X.AbstractC001800i;
import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC114965Hm;
import X.AbstractC13880nE;
import X.AbstractC154366wl;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.AbstractC53242c7;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC65852TvD;
import X.AbstractC905941u;
import X.C00O;
import X.C0eR;
import X.C0f9;
import X.C11520jB;
import X.C14360o3;
import X.C25601BTo;
import X.C2Fb;
import X.C2TN;
import X.C31537DtM;
import X.C31573Dtz;
import X.C32123E9w;
import X.C36105Fwf;
import X.C36155FxU;
import X.C37952Gmu;
import X.C37953Gmv;
import X.C37991Gnc;
import X.C37993Gne;
import X.C37994Gnf;
import X.C38321qM;
import X.C40971v4;
import X.C51D;
import X.C51E;
import X.C52182aJ;
import X.C53T;
import X.C5SE;
import X.C71313Hs;
import X.C71353Hw;
import X.C71L;
import X.C84963qk;
import X.E4D;
import X.EnumC1571773w;
import X.EnumC27385C6o;
import X.EnumC31556Dtg;
import X.EnumC71343Hv;
import X.EnumC906041v;
import X.GI2;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC11480j6;
import X.InterfaceC38371qR;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC56392iX;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC72503Mx;
import X.JZX;
import X.RunnableC31574Du0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.recommended.FollowListData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class UnifiedFollowFragment extends AbstractC59962oe implements InterfaceC60442pS, C51D, InterfaceC11480j6, InterfaceC60122ou, C53T, InterfaceC72503Mx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public SparseArray A04;
    public View A05;
    public AbstractC65852TvD A06;
    public InterfaceC38371qR A07;
    public C71L A08;
    public EnumC1571773w A09;
    public EnumC31556Dtg A0A;
    public EnumC31556Dtg A0B;
    public FollowListData A0C;
    public C31537DtM A0D;
    public C32123E9w A0E;
    public C32123E9w A0F;
    public C32123E9w A0G;
    public String A0H;
    public String A0I;
    public ArrayList A0J;
    public HashMap A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int A0R;
    public int A0S;
    public TabLayout tabLayout;
    public ViewPager2 viewPager;
    public final InterfaceC41501vz A0V = new C36155FxU(this, 28);
    public final InterfaceC09390do A0U = AbstractC60492pY.A02(this);
    public final Map A0T = AbstractC166987dD.A1I();
    public final boolean A0W = true;

    @Override // X.C53T
    public final void D3g(IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, int i, int i2, boolean z, boolean z2) {
        AbstractC167007dF.A1E(interfaceC38371qR, 0, igImageView);
        InterfaceC09390do interfaceC09390do = this.A0U;
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

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        Bundle bundle = this.mArguments;
        if (bundle != null && !bundle.getBoolean("UnifiedFollowFragment.EXTRA_SHOW_ACTION_BAR", true)) {
            return;
        }
        String str = this.A0I;
        if (str == null) {
            C14360o3.A0F("profileUserName");
            throw C00O.createAndThrow();
        }
        interfaceC56362iU.setTitle(str);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
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
        this.tabLayout = (TabLayout) view.requireViewById(R.id.unified_follow_list_tab_layout);
        this.viewPager = (ViewPager2) view.requireViewById(R.id.unified_follow_list_view_pager);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        C0eR c0eR = this.mLifecycleRegistry;
        C14360o3.A07(c0eR);
        C31537DtM c31537DtM = new C31537DtM(childFragmentManager, c0eR, this);
        this.A0D = c31537DtM;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter(c31537DtM);
        }
        ViewPager2 viewPager22 = this.viewPager;
        if (viewPager22 != null) {
            viewPager22.setOffscreenPageLimit(1);
        }
        E4D e4d = new E4D(1, this, this);
        this.A06 = e4d;
        ViewPager2 viewPager23 = this.viewPager;
        if (viewPager23 != null) {
            viewPager23.A05(e4d);
        }
        this.A0T.clear();
        TabLayout tabLayout = this.tabLayout;
        ViewPager2 viewPager24 = this.viewPager;
        if (tabLayout != null && viewPager24 != null) {
            new JZX(viewPager24, tabLayout, C31573Dtz.A00).A00();
        }
        TabLayout tabLayout2 = this.tabLayout;
        if (tabLayout2 != null) {
            AbstractC154366wl.A00(tabLayout2, new GI2(this, 1), AbstractC167017dG.A0E(requireContext()), AbstractC13880nE.A0A(AbstractC166997dE.A0L(tabLayout2)));
        }
        FollowListData followListData = this.A0C;
        if (followListData == null) {
            str = "initialFollowListData";
        } else {
            EnumC31556Dtg enumC31556Dtg = followListData.A00;
            this.A0A = enumC31556Dtg;
            List list = this.A0L;
            str = "tabs";
            if (list != null) {
                if (!AbstractC001800i.A0u(list, enumC31556Dtg)) {
                    List list2 = this.A0L;
                    if (list2 != null) {
                        this.A0A = (EnumC31556Dtg) list2.get(0);
                    }
                }
                ViewPager2 viewPager25 = this.viewPager;
                if (viewPager25 != null) {
                    List list3 = this.A0L;
                    if (list3 != null) {
                        viewPager25.A03(list3.indexOf(this.A0A), false);
                    }
                }
                ViewPager2 viewPager26 = this.viewPager;
                if (viewPager26 != null) {
                    viewPager26.post(new RunnableC31574Du0(this));
                }
                Bundle bundle2 = this.mArguments;
                if (bundle2 != null && bundle2.getBoolean("UnifiedFollowFragment.IS_BOTTOM_SHEET")) {
                    TabLayout tabLayout3 = this.tabLayout;
                    if (tabLayout3 != null) {
                        AbstractC31172DnG.A1B(requireContext(), tabLayout3, AbstractC53242c7.A02(getContext()));
                    }
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 != null && bundle3.getBoolean("UnifiedFollowFragment.EXTRA_SHOW_SECONDARY_CTA") && this.A08 != null && this.A07 != null) {
                        EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0b;
                        C71313Hs A00 = C71313Hs.A00(getSession());
                        C14360o3.A07(A00);
                        A00.A08(view, new C71353Hw(null, enumC71343Hv, null, null));
                        View view2 = this.A05;
                        if (view2 == null) {
                            C14360o3.A0F("followListContainer");
                            throw C00O.createAndThrow();
                        }
                        ViewGroup viewGroup = (ViewGroup) view2;
                        Context requireContext = requireContext();
                        InterfaceC09390do interfaceC09390do = this.A0U;
                        C37993Gne c37993Gne = new C37993Gne(requireContext, AbstractC166987dD.A0r(interfaceC09390do), this);
                        View A01 = C37993Gne.A04.A01(requireContext(), viewGroup, AbstractC166987dD.A0r(interfaceC09390do));
                        C25601BTo c25601BTo = new C25601BTo(AbstractC166987dD.A0r(interfaceC09390do), this, this);
                        C37994Gnf c37994Gnf = new C37994Gnf(-1, 0);
                        Object tag = A01.getTag();
                        if (tag != null) {
                            C37991Gnc c37991Gnc = (C37991Gnc) tag;
                            InterfaceC38371qR interfaceC38371qR = this.A07;
                            if (interfaceC38371qR != null) {
                                c37993Gne.A00(c25601BTo.A00(interfaceC38371qR, c37994Gnf), c37991Gnc);
                                viewGroup.addView(A01);
                                viewGroup.invalidate();
                                C71L c71l = this.A08;
                                if (c71l != null) {
                                    c71l.A02(A01);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        String str;
        C11520jB c11520jB = new C11520jB();
        if (this.A0Q) {
            str = AbstractC111324zv.A00(3211);
        } else {
            str = "swipe";
        }
        c11520jB.A0A("action", str);
        EnumC31556Dtg enumC31556Dtg = this.A0A;
        String str2 = null;
        if (enumC31556Dtg != null) {
            str2 = enumC31556Dtg.A00;
        }
        c11520jB.A0A("source_tab", str2);
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            List list = this.A0L;
            if (list == null) {
                C14360o3.A0F("tabs");
                throw C00O.createAndThrow();
            }
            c11520jB.A0A("dest_tab", ((EnumC31556Dtg) list.get(viewPager2.A00)).A00);
        }
        return c11520jB;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        UserSession userSession = (UserSession) this.A0U.getValue();
        String str = this.A0H;
        if (str == null) {
            C14360o3.A0F("profileUserId");
            throw C00O.createAndThrow();
        }
        if (C2TN.A05(userSession, str)) {
            return "self_unified_follow_lists";
        }
        return "unified_follow_lists";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0U);
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        int ordinal;
        C51E c51e;
        String str;
        EnumC31556Dtg enumC31556Dtg = this.A0A;
        InterfaceC08430c6 interfaceC08430c6 = null;
        if (enumC31556Dtg != null) {
            C31537DtM c31537DtM = this.A0D;
            if (c31537DtM == null) {
                str = "fragmentStateAdapter";
            } else {
                List list = this.A0L;
                if (list == null) {
                    str = "tabs";
                } else {
                    int indexOf = list.indexOf(enumC31556Dtg);
                    SparseArray sparseArray = c31537DtM.A00.A04;
                    if (sparseArray == null) {
                        str = "fragmentSparseArray";
                    } else {
                        interfaceC08430c6 = (Fragment) sparseArray.get(indexOf);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        EnumC31556Dtg enumC31556Dtg2 = this.A0A;
        if (enumC31556Dtg2 == null) {
            ordinal = -1;
        } else {
            ordinal = enumC31556Dtg2.ordinal();
        }
        if ((ordinal != 0 && ordinal != 1 && ordinal != 3) || !(interfaceC08430c6 instanceof C51D) || (c51e = (C51E) interfaceC08430c6) == null) {
            return false;
        }
        return c51e.isScrolledToBottom();
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        int ordinal;
        C51D c51d;
        String str;
        EnumC31556Dtg enumC31556Dtg = this.A0A;
        InterfaceC08430c6 interfaceC08430c6 = null;
        if (enumC31556Dtg != null) {
            C31537DtM c31537DtM = this.A0D;
            if (c31537DtM == null) {
                str = "fragmentStateAdapter";
            } else {
                List list = this.A0L;
                if (list == null) {
                    str = "tabs";
                } else {
                    int indexOf = list.indexOf(enumC31556Dtg);
                    SparseArray sparseArray = c31537DtM.A00.A04;
                    if (sparseArray == null) {
                        str = "fragmentSparseArray";
                    } else {
                        interfaceC08430c6 = (Fragment) sparseArray.get(indexOf);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        EnumC31556Dtg enumC31556Dtg2 = this.A0A;
        if (enumC31556Dtg2 == null) {
            ordinal = -1;
        } else {
            ordinal = enumC31556Dtg2.ordinal();
        }
        if ((ordinal != 0 && ordinal != 1 && ordinal != 3) || !(interfaceC08430c6 instanceof C51D) || (c51d = (C51D) interfaceC08430c6) == null) {
            return false;
        }
        return c51d.isScrolledToTop();
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C71L c71l = this.A08;
        if (c71l != null) {
            c71l.A01(i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public static final String A00(EnumC31556Dtg enumC31556Dtg, UnifiedFollowFragment unifiedFollowFragment) {
        int i;
        int i2;
        String A0W;
        int i3;
        String A0W2;
        int i4;
        int i5;
        Object[] objArr;
        int i6;
        Resources A09 = AbstractC31177DnL.A09(unifiedFollowFragment);
        switch (enumC31556Dtg.ordinal()) {
            case 0:
                Bundle bundle = unifiedFollowFragment.mArguments;
                if (bundle != null && bundle.getBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_FOLLOWERS", false)) {
                    i4 = 2131962754;
                    A0W2 = A09.getString(i4);
                    C14360o3.A0A(A0W2);
                    return A0W2;
                }
                int i7 = unifiedFollowFragment.A02;
                A0W2 = AbstractC31175DnJ.A0W(A09, C84963qk.A03(A09, Integer.valueOf(i7)), R.plurals.followers_with_count, i7);
                C14360o3.A0A(A0W2);
                return A0W2;
            case 1:
                Bundle bundle2 = unifiedFollowFragment.mArguments;
                if (bundle2 != null && bundle2.getBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_FOLLOWING", false)) {
                    i4 = 2131962780;
                    A0W2 = A09.getString(i4);
                    C14360o3.A0A(A0W2);
                    return A0W2;
                }
                i5 = 2131970261;
                objArr = new Object[1];
                i6 = unifiedFollowFragment.A0R;
                objArr[0] = C84963qk.A03(A09, Integer.valueOf(i6));
                A0W2 = A09.getString(i5, objArr);
                C14360o3.A0A(A0W2);
                return A0W2;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 14:
            case Process.SIGTERM /* 15 */:
            default:
                throw AbstractC166987dD.A12(AbstractC167017dG.A0n(enumC31556Dtg, "Unrecognized tab: ", AbstractC166987dD.A1C()));
            case 3:
                Bundle bundle3 = unifiedFollowFragment.mArguments;
                if (bundle3 != null && bundle3.getBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_MUTUAL", false)) {
                    i4 = 2131968105;
                    A0W2 = A09.getString(i4);
                    C14360o3.A0A(A0W2);
                    return A0W2;
                }
                i5 = 2131970262;
                objArr = new Object[1];
                i6 = unifiedFollowFragment.A03;
                objArr[0] = C84963qk.A03(A09, Integer.valueOf(i6));
                A0W2 = A09.getString(i5, objArr);
                C14360o3.A0A(A0W2);
                return A0W2;
            case 4:
                i3 = 2131974864;
                A0W = A09.getString(i3);
                C14360o3.A07(A0W);
                return A0W;
            case 10:
                i = R.plurals.profile_user_list_group_profile_members_with_count;
                i2 = unifiedFollowFragment.A02;
                A0W = AbstractC31175DnJ.A0W(A09, C84963qk.A03(A09, Integer.valueOf(i2)), i, i2);
                C14360o3.A07(A0W);
                return A0W;
            case 11:
                i = R.plurals.profile_user_list_group_profile_admins_with_count;
                i2 = unifiedFollowFragment.A00;
                A0W = AbstractC31175DnJ.A0W(A09, C84963qk.A03(A09, Integer.valueOf(i2)), i, i2);
                C14360o3.A07(A0W);
                return A0W;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = R.plurals.profile_user_list_group_profile_blocked_with_count;
                i2 = unifiedFollowFragment.A01;
                A0W = AbstractC31175DnJ.A0W(A09, C84963qk.A03(A09, Integer.valueOf(i2)), i, i2);
                C14360o3.A07(A0W);
                return A0W;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0W = AbstractC166997dE.A0r(A09, C84963qk.A03(A09, Integer.valueOf(unifiedFollowFragment.A0S)), 2131970263);
                C14360o3.A07(A0W);
                return A0W;
            case 16:
                i3 = 2131969891;
                A0W = A09.getString(i3);
                C14360o3.A07(A0W);
                return A0W;
        }
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

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return this.A0W;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.fragment.UnifiedFollowFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1546210224);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.cloneInContext(new C52182aJ(getContext(), R.style.Platform_MaterialComponents)).inflate(R.layout.unified_follow_fragment_layout, viewGroup, false);
        this.A05 = inflate.getRootView().requireViewById(R.id.unified_follow_list_view_pager_wrapper);
        C0f9.A09(-1277239527, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-2003615625);
        super.onDestroy();
        this.A08 = null;
        AbstractC31176DnK.A0Q(this.A0U).A02(this.A0V, C36105Fwf.class);
        C0f9.A09(1996667330, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1107636717);
        super.onDestroyView();
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter(null);
        }
        UnifiedFollowFragmentLifecycleUtil.cleanupReferences(this);
        this.A0T.clear();
        C0f9.A09(1889666818, A02);
    }
}
