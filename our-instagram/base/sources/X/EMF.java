package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EMF extends AbstractC59962oe implements InterfaceC60442pS, C51D {
    public static final String __redex_internal_original_name = "TrendTransparencySheetFragment";
    public C18920wW A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A01 = "trend_transparency_sheet";

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

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
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
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.disclaimer_headline);
        Context A0L = AbstractC166997dE.A0L(igdsHeadline);
        Resources resources = A0L.getResources();
        C35228FgL A00 = C35228FgL.A00(A0L, AbstractC166997dE.A0b());
        igdsHeadline.setHeadline(2131975736);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_qp_reels_refresh);
        A00.A04(null, resources.getString(2131975729), R.drawable.instagram_arrow_up_right_pano_outline_24);
        C35228FgL.A02(A00, igdsHeadline, null, resources.getString(2131975730), R.drawable.instagram_shield_star_pano_outline_24);
        View findViewById = view.findViewById(R.id.igds_headline_bullet_list_container);
        C14360o3.A0A(findViewById);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, AbstractC166997dE.A05(resources), 0, 0);
            findViewById.setLayoutParams(marginLayoutParams);
            C18920wW c18920wW = this.A00;
            if (c18920wW == null) {
                C14360o3.A0F("typedLogger");
                throw C00O.createAndThrow();
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_clips_trends_transparency_sheet_impression");
            AbstractC31171DnF.A1D(A0f, this.A01);
            A0f.Cht();
            return;
        }
        throw AbstractC166987dD.A15(AbstractC111324zv.A00(0));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1832064488);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0M(this, this.A02);
        requireArguments().getSerializable(AbstractC43591JPw.A00(53));
        C0f9.A09(128237109, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1496791303);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_trends_transparency_fragment, false);
        C0f9.A09(-1066601153, A02);
        return A0R;
    }
}
