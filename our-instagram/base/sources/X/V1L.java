package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V1L extends AbstractC59962oe implements C51D, InterfaceC1119153d {
    public static final String __redex_internal_original_name = "PromoteSpecialRequirementsBottomSheetFragment";
    public UserSession A00;
    public View A01;
    public ScrollView A02;
    public PromoteData A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC1119153d
    public final void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_special_requirements_bottom_sheet";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ViewStub viewStub;
        C14360o3.A0B(view, 0);
        UserSession userSession = this.A00;
        if (userSession != null) {
            AbstractC65702TsY.A1M(C70399WUb.A00(userSession), VG4.A1L);
            if (this.A01 == null && (viewStub = (ViewStub) view.findViewById(R.id.main_container_stub_with_political_ads)) != null) {
                this.A01 = viewStub.inflate();
            }
            View view2 = this.A01;
            if (view2 != null) {
                this.A02 = (ScrollView) view2.findViewById(R.id.special_requirement_scroll_view);
                TextView textView = (TextView) view2.findViewById(R.id.special_requirement_header_text);
                if (textView != null) {
                    textView.setText(2131970957);
                }
                View findViewById = view2.findViewById(R.id.special_requirement_done_text);
                if (findViewById != null) {
                    WNO.A00(findViewById, 9, this);
                }
                TextView textView2 = (TextView) view2.findViewById(R.id.normal_flow_text_view);
                if (textView2 != null) {
                    Bundle bundle2 = this.mArguments;
                    int i = 0;
                    if (bundle2 != null && bundle2.getBoolean("should_show_boost_package_text", false)) {
                        Context context = textView2.getContext();
                        if (context != null) {
                            str = context.getString(2131954043);
                        } else {
                            str = null;
                        }
                        textView2.setText(str);
                    } else {
                        i = 8;
                    }
                    textView2.setVisibility(i);
                }
                AbstractC23641Du.A05(AnonymousClass191.A00, new MCK(view2, this, (InterfaceC23621Ds) null, 13), AbstractC25229BEm.A0a(this));
            }
            Context context2 = getContext();
            if (context2 != null) {
                UFN ufn = (UFN) this.A04.getValue();
                C05A c05a = ufn.A03;
                do {
                } while (!c05a.AIi(c05a.getValue(), new C38688GzT(UFN.A00(context2, SpecialRequirementCategory.A08, ufn), UFN.A00(context2, SpecialRequirementCategory.A06, ufn), UFN.A00(context2, SpecialRequirementCategory.A05, ufn), UFN.A00(context2, SpecialRequirementCategory.A04, ufn))));
            }
            super.onViewCreated(view, bundle);
            return;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
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
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
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
        ScrollView scrollView = this.A02;
        if (scrollView == null || scrollView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public V1L() {
        X2v x2v = new X2v(this, 18);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2v(new X2v(this, 15), 16));
        this.A04 = new C60842q8(new X2v(A00, 17), x2v, new C57253Pbb(33, null, A00), new C0YZ(UFN.class));
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
        InterfaceC72021XFj interfaceC72021XFj;
        int A02 = C0f9.A02(-1107351681);
        super.onCreate(bundle);
        C1UC activity = getActivity();
        if ((activity instanceof InterfaceC72021XFj) && (interfaceC72021XFj = (InterfaceC72021XFj) activity) != null) {
            PromoteData BiY = interfaceC72021XFj.BiY();
            this.A03 = BiY;
            this.A00 = BiY.A0y;
            C0f9.A09(1319603491, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1768014592, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-353574716);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_special_requirements_view, false);
        C0f9.A09(882184691, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1335595193);
        super.onDestroyView();
        UserSession userSession = this.A00;
        if (userSession != null) {
            C70399WUb A00 = C70399WUb.A00(userSession);
            PromoteData promoteData = this.A03;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                A00.A0C(VG4.A1L, promoteData);
                this.A01 = null;
                this.A02 = null;
                C0f9.A09(1986125452, A02);
                return;
            }
        } else {
            str = "session";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
