package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.user.model.Product;

/* renamed from: X.EMh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32335EMh extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ProductPickerItemUnavailableFragment";
    public Product A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A01(this);

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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "product_picker_learn_more_bottom_sheet";
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

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1983400262);
        super.onCreate(bundle);
        this.A00 = (Product) requireArguments().getParcelable("product");
        C0f9.A09(-1976283407, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(263567133);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.publishing_unavailable_reason_fragment, false);
        TextView A0e = AbstractC166987dD.A0e(A07, R.id.unavailable_learn_more_reason);
        Product product = this.A00;
        UntaggableReason untaggableReason = null;
        if (product != null) {
            untaggableReason = product.A06;
        }
        if (untaggableReason != null) {
            LinkWithText linkWithText = untaggableReason.A02;
            if (linkWithText != null) {
                String str = untaggableReason.A03;
                if (str != null) {
                    String str2 = linkWithText.A01;
                    if (str2 != null) {
                        C14360o3.A0A(A0e);
                        AnonymousClass773.A07(new C33265Elz(this, str2, AbstractC25233BEq.A04(this)), A0e, AbstractC25227BEk.A0v(this, 2131965052), str);
                        C0f9.A09(-837148429, A02);
                        return A07;
                    }
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 1465662341;
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 1447508378;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1614358001;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 658468719;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
