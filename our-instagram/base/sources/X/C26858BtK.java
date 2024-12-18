package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.BtK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26858BtK extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "CreatorAILearnMoreNuxBottomSheet";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final String A03;

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
    public final /* synthetic */ boolean isScrolledToTop() {
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
        View findViewById = view.findViewById(R.id.creator_ai_fan_nux_loading_spinner);
        View findViewById2 = view.findViewById(R.id.creator_ai_fan_nux_content);
        View findViewById3 = view.findViewById(R.id.creator_ai_nux_headline);
        C14360o3.A0A(findViewById3);
        findViewById3.setVisibility(8);
        View findViewById4 = view.findViewById(R.id.creator_ai_nux_bullet_one);
        View findViewById5 = view.findViewById(R.id.creator_ai_nux_bullet_two);
        View findViewById6 = view.findViewById(R.id.creator_ai_nux_bullet_three);
        View findViewById7 = view.findViewById(R.id.creator_ai_terms_footer);
        C14360o3.A0A(findViewById7);
        findViewById7.setVisibility(8);
        View findViewById8 = view.findViewById(R.id.creator_ai_nux_bottom_button_layout);
        C14360o3.A0A(findViewById8);
        findViewById8.setVisibility(8);
        View findViewById9 = view.findViewById(R.id.creator_ai_beta_label);
        C14360o3.A0A(findViewById9);
        findViewById9.setVisibility(8);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new JWL(c07s, findViewById, this, findViewById4, viewLifecycleOwner, findViewById2, findViewById5, findViewById6, null, 8), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26858BtK() {
        C29911DGz A01 = C29911DGz.A01(this, 15);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C29911DGz.A01(C29911DGz.A01(this, 12), 13));
        this.A02 = AbstractC25225BEi.A0a(C29911DGz.A01(A00, 14), A01, new C29894DGi(17, A00, null), AbstractC25225BEi.A1D(C25822Bbd.class));
        this.A00 = C29911DGz.A00(this, 11);
        this.A03 = "creator_ai_learn_more_nux_bottom_sheet";
        this.A01 = AbstractC60492pY.A02(this);
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
        return this.A03;
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
        int A02 = C0f9.A02(-1235228753);
        super.onCreate(bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02);
        AbstractC166987dD.A1Z(D4z.A02(A0Z, null, 29), AbstractC141776au.A00(A0Z));
        C0f9.A09(-779380100, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1416750843);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_ai_in_thread_nux, false);
        C0f9.A09(-1360501720, A02);
        return A0R;
    }
}
