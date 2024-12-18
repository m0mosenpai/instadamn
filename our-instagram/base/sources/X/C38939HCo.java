package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBanner;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerBottomSheetContent;
import java.util.List;

/* renamed from: X.HCo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38939HCo extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "IncentiveDetailsFragment";
    public C189478aR A00;
    public final InterfaceC09390do A01 = C43206J8d.A00(this, 9);
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_funded_incentive_details";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SellerIncentiveBannerBottomSheetContent sellerIncentiveBannerBottomSheetContent;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        IgFundedIncentive igFundedIncentive = (IgFundedIncentive) requireArguments.getParcelable("igfunded_incentive");
        SellerIncentiveBanner sellerIncentiveBanner = (SellerIncentiveBanner) requireArguments.getParcelable(AbstractC111324zv.A00(5278));
        if (igFundedIncentive != null) {
            InterfaceC09390do interfaceC09390do = this.A01;
            ((IJG) interfaceC09390do.getValue()).A00.setText(2131964492);
            ((IJG) interfaceC09390do.getValue()).A03.setText(igFundedIncentive.A06);
            IgTextView igTextView = ((IJG) interfaceC09390do.getValue()).A02;
            List list = igFundedIncentive.A0B;
            if (list != null) {
                igTextView.setText(((IgFundedIncentiveDetail) list.get(0)).getDescription());
                if (igFundedIncentive.A0E) {
                    ((IJG) interfaceC09390do.getValue()).A04.setVisibility(0);
                    ((IJG) interfaceC09390do.getValue()).A04.setText(2131964491);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        if (sellerIncentiveBanner != null) {
            InterfaceC09390do interfaceC09390do2 = this.A01;
            ((IJG) interfaceC09390do2.getValue()).A03.setText(sellerIncentiveBanner.A00);
            List list2 = sellerIncentiveBanner.A01;
            if (list2 == null || (sellerIncentiveBannerBottomSheetContent = (SellerIncentiveBannerBottomSheetContent) AbstractC001800i.A0O(list2, 0)) == null) {
                return;
            }
            String str = sellerIncentiveBannerBottomSheetContent.A00;
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            IgTextView igTextView2 = ((IJG) interfaceC09390do2.getValue()).A00;
            if (i > 0) {
                igTextView2.setText(str);
            } else {
                igTextView2.setVisibility(8);
            }
            String str2 = sellerIncentiveBannerBottomSheetContent.A02;
            if (str2 != null && str2.length() > 0) {
                ((IJG) interfaceC09390do2.getValue()).A01.setText(str2);
            } else {
                ((IJG) interfaceC09390do2.getValue()).A01.setVisibility(8);
            }
            ((IJG) interfaceC09390do2.getValue()).A02.setText(sellerIncentiveBannerBottomSheetContent.A01);
            return;
        }
        throw AbstractC166987dD.A14("No incentive available");
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
        return AbstractC166987dD.A0n(this.A02);
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
    public final /* synthetic */ boolean isScrolledToTop() {
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(814790870);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.incentive_details, viewGroup, false);
        C0f9.A09(-787166340, A02);
        return inflate;
    }
}
