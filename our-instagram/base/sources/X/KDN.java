package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes8.dex */
public final class KDN extends AbstractC59962oe implements C51D, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MetaAiVoiceSettingsFragment";
    public C28729CmL A00;
    public final InterfaceC09390do A02;
    public final String A03 = __redex_internal_original_name;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31265Don.A00();
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131960623);
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
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
        C28729CmL c28729CmL = this.A00;
        if (c28729CmL == null || c28729CmL.A03.BIi() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public KDN() {
        C37052GUi c37052GUi = new C37052GUi(this, 38);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37052GUi(new C37052GUi(this, 35), 36));
        this.A02 = AbstractC25225BEi.A0a(new C37052GUi(A00, 37), c37052GUi, new C50170MDx(4, null, A00), AbstractC25225BEi.A1D(C44480Jlm.class));
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
        int A02 = C0f9.A02(-393596650);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02);
        AbstractC166987dD.A1Z(new GSS(A0Z, null, 28), AbstractC141776au.A00(A0Z));
        ComposeView A00 = AbstractC25319BIo.A00(this, new DSA(7, requireContext().getApplicationContext(), this), 1500950228);
        C0f9.A09(-744944549, A02);
        return A00;
    }
}
