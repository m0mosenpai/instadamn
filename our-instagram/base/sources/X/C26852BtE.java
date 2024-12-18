package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.BtE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26852BtE extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DirectThreadExternalLinkBottomsheet";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A01 = "direct_thread_external_link_bottomsheet";
    public final boolean A02 = true;

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
    public final void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3DN A01 = C3DN.A00.A01(requireContext());
        View findViewById = view.findViewById(R.id.cross_bar_icon);
        if (findViewById != null) {
            ViewOnClickListenerC28667ClF.A01(findViewById, 65, A01);
        }
        String A0p = AbstractC166997dE.A0p(requireContext(), 2131960657);
        String A0f = AbstractC167007dF.A0f(requireContext(), A0p, 2131960659);
        C14360o3.A07(A0f);
        C46067KaO c46067KaO = new C46067KaO(this, AbstractC25233BEq.A04(this));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0f);
        AnonymousClass773.A03(A0H, c46067KaO, A0p);
        String A0p2 = AbstractC166997dE.A0p(requireContext(), 2131960658);
        String A0f2 = AbstractC167007dF.A0f(requireContext(), A0p2, 2131960660);
        C14360o3.A07(A0f2);
        C27281C2g c27281C2g = new C27281C2g(this, A01, AbstractC25233BEq.A04(this));
        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(A0f2);
        AnonymousClass773.A03(A0H2, c27281C2g, A0p2);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.external_link_title);
        if (A0e != null) {
            AbstractC166987dD.A1P(requireContext(), A0e, 2131960661);
        }
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.external_link_subtitle_1);
        if (A0e2 != null) {
            AbstractC25227BEk.A11(A0e2);
            A0e2.setText(A0H);
        }
        TextView A0e3 = AbstractC166987dD.A0e(view, R.id.external_link_subtitle_2);
        if (A0e3 != null) {
            AbstractC25227BEk.A11(A0e3);
            A0e3.setText(A0H2);
        }
        C23031Ai A0l = AbstractC25230BEn.A0l(this.A00);
        String A00 = AbstractC111324zv.A00(2335);
        A0l.A0z(A00, A0l.A01.getInt(A00, 0) + 1);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
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
        return this.A01;
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

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1791490576);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_thread_external_link, false);
        C0f9.A09(1458439337, A02);
        return A0R;
    }
}
