package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KPm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45807KPm extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A02 = KCM.A0A(C45807KPm.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsPinSellWarnNuxV3Fragment";
    public final KFH A00;
    public final InterfaceC09390do A01;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "encrypted_backups_pin_sell_nux_v3_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        ((C44469Jlb) this.A01.getValue()).A00.A05("SOFT_BLOCK_PIN_LEADING_SCREEN_IMPRESSION");
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
        return KCM.A08(this.A00);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45807KPm() {
        MHT mht = new MHT(this, 27);
        InterfaceC09390do A00 = MHT.A00(new MHT(this, 24), EnumC09460dv.A02, 25);
        this.A01 = AbstractC25225BEi.A0a(new MHT(A00, 26), mht, new C50172MDz(16, null, A00), AbstractC25225BEi.A1D(C44469Jlb.class));
        this.A00 = KCM.A01(this, 23);
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
        int A022 = C0f9.A02(441758768);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_pin_sell_warn_nux_v3, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        C35228FgL A00 = C35228FgL.A00(requireContext(), AbstractC166997dE.A0b());
        KCM.A05(this, A00, 2131961275);
        C35228FgL.A02(A00, A0g, null, getString(2131961276), R.drawable.instagram_key_pano_outline_24);
        KCM.A04(inflate, this);
        C64P c64p = (C64P) AbstractC166997dE.A0R(inflate, R.id.bottom_buttons);
        KCM.A07(c64p, this, 66);
        KCM.A06(c64p, this, 67);
        C0f9.A09(67165886, A022);
        return inflate;
    }
}
