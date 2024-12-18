package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N7H extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "HighlightsListFragment";
    public C54400O2g A00;
    public Boolean A01;
    public RecyclerView A02;
    public boolean A03;
    public final InterfaceC09390do A04 = C1XM.A00(new C57242PbQ(this, 15));
    public final InterfaceC09390do A06 = C1XM.A00(new C57242PbQ(this, 16));
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final String A07 = "highlights_list";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
        if (this.A03) {
            AbstractC31176DnK.A1D(view, R.id.action_bar);
        } else {
            ViewOnClickListenerC55460OkF.A00(view.requireViewById(R.id.back_button), 69, this);
        }
        RecyclerView A08 = AbstractC31180DnO.A08(view);
        this.A02 = A08;
        if (A08 != null) {
            A08.setAdapter((C2UU) AbstractC166987dD.A17(this.A04));
        }
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            AbstractC31174DnI.A16(getContext(), recyclerView, 1, false);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            C70623Ez c70623Ez = new C70623Ez();
            ((C3F0) c70623Ez).A00 = false;
            recyclerView2.setItemAnimator(c70623Ez);
        }
        InterfaceC09390do interfaceC09390do = this.A06;
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C50965MfY) interfaceC09390do.getValue()).A00, new C57744PjX(this, 31), 67);
        C50965MfY c50965MfY = (C50965MfY) interfaceC09390do.getValue();
        Context requireContext = requireContext();
        String A0t = AbstractC31173DnH.A0t(this.A05);
        C14360o3.A0B(A0t, 1);
        c50965MfY.A02.A00(requireContext, c50965MfY.A01, C52683NSo.A00, null, null, null, null, A0t, false);
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
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
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            return AbstractC110854yx.A05(recyclerView);
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
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
        int A02 = C0f9.A02(58829381);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31174DnI.A0n(requireArguments, "uses_creation_state_machine");
        this.A03 = requireArguments.getBoolean("open_as_bottom_sheet");
        C0f9.A09(-1239738234, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-718195069);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_highlights_list, false);
        C0f9.A09(1162613115, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-169977090);
        super.onDestroyView();
        this.A02 = null;
        C0f9.A09(-412764453, A02);
    }
}
