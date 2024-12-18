package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214919fT extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "GalleryStickerPickerFragment";
    public InterfaceC186138Nh A00;
    public MQR A01;
    public C48595LeX A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A04 = "gallery_picker_sheet";

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
        MQR mqr;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC186138Nh interfaceC186138Nh = this.A00;
        if (interfaceC186138Nh != null && (mqr = this.A01) != null) {
            Context requireContext = requireContext();
            UserSession A0r = AbstractC166987dD.A0r(this.A03);
            C08790ch A00 = AbstractC018607g.A00(this);
            ViewGroup viewGroup = (ViewGroup) view;
            requireContext().getColor(R.color.clips_overlay_ads_end_background_color);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                i = bundle2.getInt("container_width");
            } else {
                i = 0;
            }
            C48595LeX c48595LeX = new C48595LeX(requireContext, viewGroup, A00, A0r, interfaceC186138Nh, mqr, i);
            this.A02 = c48595LeX;
            c48595LeX.E2K();
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
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
        C48595LeX c48595LeX = this.A02;
        if (c48595LeX != null) {
            return c48595LeX.isScrolledToTop();
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1923253330);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_gallery_picker, viewGroup, false);
        C0f9.A09(-2082327159, A02);
        return inflate;
    }
}
