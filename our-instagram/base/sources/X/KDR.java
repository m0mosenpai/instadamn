package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;

/* loaded from: classes8.dex */
public final class KDR extends AbstractC59962oe implements C51D, InterfaceC50495MQy, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectDailyPromptsPhotoSelectionFragment";
    public Medium A00;
    public EKZ A01;
    public C47958LGu A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC50495MQy
    public final /* synthetic */ void D2F() {
    }

    @Override // X.InterfaceC50495MQy
    public final boolean DIy(View view, GalleryItem galleryItem) {
        return false;
    }

    @Override // X.InterfaceC50495MQy
    public final /* synthetic */ void DKF(boolean z) {
    }

    @Override // X.InterfaceC50495MQy
    public final boolean DmO(Medium medium, String str) {
        if (C14360o3.A0K(this.A00, medium)) {
            medium = null;
        }
        this.A00 = medium;
        C56352iT.A0t.A04(this).ARk(0, AbstractC167007dF.A1W(this.A00));
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle("");
        C3LO c3lo = new C3LO();
        c3lo.A0C = 2131973219;
        AbstractC31176DnK.A1B(new ViewOnClickListenerC35666Fp0(this, 41), c3lo, interfaceC56362iU);
        interfaceC56362iU.ARk(0, AbstractC167007dF.A1W(this.A00));
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
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
        this.A02 = new C47958LGu(view, null, EnumC188968Ym.A04, AbstractC166987dD.A0r(this.A03), null, this, new L9H(1, null, null, null, null, "", null, 1.0f, 0, true, false, false, false, false, false, true, false), null, 4, 0, true, false, false);
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
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        return c47958LGu.A05();
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
        int A02 = C0f9.A02(492099182);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.daily_prompts_photo_selection_fragment, viewGroup, false);
        C0f9.A09(-1630485638, A02);
        return inflate;
    }
}
