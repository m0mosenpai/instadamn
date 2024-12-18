package com.instagram.profile.fragment;

import X.AbstractC018607g;
import X.AbstractC110854yx;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C193328hC;
import X.C31335Dq0;
import X.C32423EPy;
import X.C38O;
import X.C3DN;
import X.C3DP;
import X.C51D;
import X.C684436h;
import X.EnumC27385C6o;
import X.GHK;
import X.GIQ;
import X.GMG;
import X.GYQ;
import X.InterfaceC09390do;
import X.InterfaceC56392iX;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ProfileFollowRelationshipFragment extends AbstractC59962oe implements C51D, C38O, GYQ {
    public GIQ A00;
    public C684436h A01;
    public User A02;
    public String A03;
    public boolean A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final String A06 = "following_sheet";
    public RecyclerView recyclerView;

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0m(this, AbstractC166987dD.A0o(this.A05));
        return c193328hC;
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

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.profile_follow_rv);
        C14360o3.A0B(A0G, 0);
        this.recyclerView = A0G;
        AbstractC31177DnL.A17(this, A0G);
        User user = this.A02;
        if (this.A00 != null && user != null) {
            Context requireContext = requireContext();
            GIQ giq = this.A00;
            String str = "delegate";
            if (giq != null) {
                C684436h c684436h = this.A01;
                if (c684436h == null) {
                    str = "closeFriendsController";
                } else {
                    C32423EPy c32423EPy = new C32423EPy(requireContext, AbstractC018607g.A00(this), c684436h, this, AbstractC166987dD.A0r(this.A05), giq, this, giq, user, this.A03, this.A04);
                    RecyclerView recyclerView = this.recyclerView;
                    if (recyclerView != null) {
                        recyclerView.setAdapter(c32423EPy);
                        c32423EPy.clear();
                        c32423EPy.addModel(c32423EPy.A01, null, c32423EPy.A00);
                        c32423EPy.notifyDataSetChanged();
                        return;
                    }
                    str = "recyclerView";
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
        C3DN A0r;
        GMG gmg = new GMG(this);
        FragmentActivity activity = getActivity();
        if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null) {
            ((C3DP) A0r).A0H = new GHK(6, gmg, A0r);
            A0r.A0B();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return AbstractC110854yx.A05(recyclerView);
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1819302910);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AbstractC111324zv.A00(1720));
        this.A04 = requireArguments.getBoolean("ProfileFollowRelationShipFragment.ARG_IS_IGTV_PROFILE");
        this.A03 = requireArguments.getString(AbstractC111324zv.A00(1719));
        InterfaceC09390do interfaceC09390do = this.A05;
        this.A02 = AbstractC31176DnK.A0h(interfaceC09390do).A02(string);
        this.A01 = new C684436h(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
        C0f9.A09(-1595881722, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1236451583);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_profile_follow_relationship_fragment, viewGroup, false);
        C0f9.A09(1381386518, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1117873501);
        super.onDestroyView();
        this.recyclerView = null;
        C0f9.A09(1212011419, A02);
    }
}
