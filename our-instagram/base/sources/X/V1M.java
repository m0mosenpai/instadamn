package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V1M extends AbstractC59962oe implements C51D, InterfaceC1119153d, InterfaceC71915X9z {
    public static final /* synthetic */ C0YR[] A0I = {new AnonymousClass013(V1M.class, "startTimeInSeconds", "getStartTimeInSeconds()J", 0)};
    public static final String __redex_internal_original_name = "AdsConsentGrowthBottomSheetFragment";
    public IgdsBottomButtonLayout A00;
    public View A01;
    public RecyclerView A02;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC16530ry A0H;
    public boolean A03 = true;
    public final InterfaceC09390do A09 = C1XM.A00(new X2w(this, 39));
    public final InterfaceC09390do A0A = C1XM.A00(new X2w(this, 40));
    public final InterfaceC09390do A07 = C1XM.A00(new X2w(this, 37));
    public final InterfaceC09390do A0B = C1XM.A00(new X2w(this, 41));
    public final InterfaceC09390do A0C = C1XM.A00(new X2w(this, 42));

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2176);
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
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C66394UFf) this.A0E.getValue()).A01, new DRW(this, 14), 37);
    }

    public static final void A00(Fragment fragment, V1M v1m, boolean z) {
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        v1m.A03 = z;
        Fragment fragment2 = fragment.mParentFragment;
        if ((fragment2 instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment2) != null && (c189478aR = bottomSheetFragment.A02) != null) {
            c189478aR.A07();
        }
    }

    public static final void A01(V1M v1m) {
        ((Map) v1m.A08.getValue()).put("dwell_time", String.valueOf(AbstractC31177DnL.A06() - ((Number) v1m.A0H.CES(v1m, A0I[0])).longValue()));
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        if (this.A03) {
            C685036n c685036n = new C685036n(this, (UserSession) this.A0D.getValue());
            A01(this);
            c685036n.A00("ig_cg_bottomsheet_dismiss", (Map) this.A08.getValue());
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0D.getValue();
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
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
    public final boolean isScrolledToTop() {
        if (this.A02 == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return !r1.canScrollVertically(-1);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, X.0ry] */
    public V1M() {
        X2w x2w = new X2w(this, 46);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2w(new X2w(this, 43), 44));
        this.A0E = new C60842q8(new X2w(A00, 45), x2w, new C29898DGm(3, null, A00), new C0YZ(C66394UFf.class));
        this.A08 = C1XM.A00(new X2w(this, 38));
        this.A04 = C1XM.A00(new X2w(this, 34));
        this.A06 = C1XM.A00(new X2w(this, 36));
        this.A05 = C1XM.A00(new X2w(this, 35));
        this.A0F = C1XM.A00(new X2w(this, 47));
        this.A0G = C1XM.A00(X4M.A00);
        this.A0H = new Object();
        this.A0D = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC71915X9z
    public final void DKz(String str) {
        String str2;
        A01(this);
        A00(this, this, false);
        W8y w8y = (W8y) this.A05.getValue();
        w8y.A00.A00("ig_cg_bottomsheet_learn_more_click", w8y.A02);
        if (C14360o3.A0K(str, "activity_feed_notification_3PD_content")) {
            str2 = "ig_activity_feed_notification";
        } else {
            str2 = "ig_3pd_trial_30_day_megaphone";
        }
        W8y.A00(w8y, str2);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1615376363);
        super.onCreate(bundle);
        ((C66394UFf) this.A0E.getValue()).A00 = this;
        C0f9.A09(-2018605993, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C5QE A00;
        int i;
        C5QE A002;
        int i2;
        int A02 = C0f9.A02(1255363179);
        C14360o3.A0B(layoutInflater, 0);
        this.A03 = true;
        View inflate = layoutInflater.inflate(R.layout.layout_ads_consent_growth_bottomsheet, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(2));
        AbstractC37301Gc2.A0v(inflate, (C57112jm) this.A0G.getValue(), this);
        long A06 = AbstractC31177DnL.A06();
        this.A0H.Egi(this, Long.valueOf(A06), A0I[0]);
        C68931VeV c68931VeV = (C68931VeV) this.A0F.getValue();
        Map map = (Map) this.A08.getValue();
        int A062 = AbstractC167007dF.A06(0, inflate, map);
        C57112jm c57112jm = c68931VeV.A01;
        C59072n8 A003 = C59062n7.A00(new C45127Jxw("ig_cg_bottomsheet_impression", map, 5), C0eB.A00, "ig_cg_bottomsheet_impression");
        A003.A00(c68931VeV.A00);
        c57112jm.A05(inflate, A003.A01());
        RecyclerView A08 = AbstractC31180DnO.A08(inflate);
        this.A02 = A08;
        if (A08 == null) {
            str = "recyclerView";
        } else {
            AbstractC31174DnI.A16(A08.getContext(), A08, 1, false);
            AbstractC37304Gc5.A10(A08, this.A04);
            A08.setItemAnimator(null);
            A08.setClipToPadding(false);
            View findViewById = inflate.findViewById(R.id.button_container);
            this.A01 = findViewById;
            if (findViewById == null) {
                str = "buttonContainer";
            } else {
                this.A00 = (IgdsBottomButtonLayout) findViewById.findViewById(R.id.bottom_button);
                String str2 = (String) this.A0B.getValue();
                str = "button";
                if (str2 != null) {
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    if (igdsBottomButtonLayout != null) {
                        Context requireContext = requireContext();
                        String str3 = ((C66394UFf) this.A0E.getValue()).A03;
                        if (C14360o3.A0K(str3, "3pd_trial_open_setting_screen")) {
                            i2 = 2131952497;
                        } else if (C14360o3.A0K(str3, "3pd_trial_inline_opt_in")) {
                            i2 = 2131952498;
                        } else if (C14360o3.A0K(str3, "3pd_trial_inline_opt_out")) {
                            i2 = 2131952496;
                        } else if (C14360o3.A0K(str3, "fewer_ads_test_group_cta")) {
                            i2 = 2131962548;
                        } else if (C14360o3.A0K(str3, "fewer_ads_control_group_cta")) {
                            i2 = 2131962541;
                        } else if (C14360o3.A0K(str3, "activity_feed_notification_3PD_inline_opt_in")) {
                            i2 = 2131952205;
                        } else {
                            A002 = MVZ.A00("");
                            igdsBottomButtonLayout.setPrimaryAction(BHX.A00(requireContext, A002), new WMS(str2, this, A062));
                        }
                        A002 = new BHS(new Object[0], i2);
                        igdsBottomButtonLayout.setPrimaryAction(BHX.A00(requireContext, A002), new WMS(str2, this, A062));
                    }
                }
                if (this.A0C.getValue() != null) {
                    IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                    if (igdsBottomButtonLayout2 != null) {
                        Context requireContext2 = requireContext();
                        String str4 = ((C66394UFf) this.A0E.getValue()).A04;
                        if (C14360o3.A0K(str4, "3pd_trial_not_now")) {
                            i = 2131952500;
                        } else if (C14360o3.A0K(str4, "3pd_trial_cancel")) {
                            i = 2131952499;
                        } else if (C14360o3.A0K(str4, "activity_feed_notification_not_now")) {
                            i = 2131952210;
                        } else {
                            A00 = MVZ.A00("");
                            igdsBottomButtonLayout2.setSecondaryAction(BHX.A00(requireContext2, A00), new WNN(this, 54));
                        }
                        A00 = new BHS(new Object[0], i);
                        igdsBottomButtonLayout2.setSecondaryAction(BHX.A00(requireContext2, A00), new WNN(this, 54));
                    }
                }
                C0f9.A09(-671069711, A02);
                return inflate;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-716663230);
        super.onDestroy();
        ((C66394UFf) this.A0E.getValue()).A00 = null;
        C0f9.A09(621993729, A02);
    }
}
