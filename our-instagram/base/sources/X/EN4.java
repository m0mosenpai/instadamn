package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EN4 extends AbstractC59962oe implements C51E, C51D {
    public static final String __redex_internal_original_name = "AudioFiltersPrivacyNuxFragment";
    public int A00;
    public FF7 A01;
    public C189478aR A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
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
    public final int getExtraDragSpace() {
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
    public final boolean isScrolledToBottom() {
        return false;
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
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.clips_audio_filters_privacy_nux_icon);
        AbstractC166997dE.A19(A0I.getContext(), A0I, R.drawable.ig_illustrations_qp_reels_refresh);
        ViewOnClickListenerC35679FpE.A01(view.requireViewById(R.id.clips_audio_filters_privacy_nux_button), 51, this);
        InterfaceC09390do interfaceC09390do = this.A04;
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36320347989942670L)) {
            View requireViewById = view.requireViewById(R.id.clips_audio_filters_privacy_nux_learn_more);
            C0fQ.A00(new ViewOnClickListenerC35683FpI(29, requireViewById, this), requireViewById);
            requireViewById.setVisibility(0);
        }
        C35038FcB A01 = FXY.A01(AbstractC166987dD.A0r(interfaceC09390do), this.A00);
        if (A01 != null) {
            A01.A00();
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1373812332);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audio_filters_privacy_nux, viewGroup, false);
        C0f9.A09(-1183547070, A02);
        return inflate;
    }
}
