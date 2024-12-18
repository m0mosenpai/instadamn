package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KPn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45808KPn extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A03 = KCM.A0A(C45808KPn.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeRestoreFragment";
    public final InterfaceC09390do A02 = C1XM.A00(new MHP(this, 31));
    public final InterfaceC09390do A01 = MHP.A00(this, EnumC09460dv.A02, 30);
    public final KFH A00 = KCM.A02(this, 32);

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
        InterfaceC09390do interfaceC09390do = this.A02;
        KPU.A00((KPU) interfaceC09390do.getValue(), "NORMAL_RESTORE");
        AbstractC43592JPx.A0b(interfaceC09390do).A05("OTC_LANDING_NUX_IMPRESSION");
        AbstractC43592JPx.A0b(interfaceC09390do).A08("IS_OTC_V2", true);
        C64P c64p = (C64P) AbstractC166997dE.A0R(requireView(), R.id.bottom_button);
        c64p.setPrimaryActionText(getString(2131961822));
        KCM.A07(c64p, this, 55);
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
        return KCM.A09(this.A00);
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
        int A02 = C0f9.A02(-1908526628);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_otc_restore_fragment, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        A0g.setHeadline(2131961827);
        A0g.setImageResource(R.drawable.ig_illustrations_illo_one_time_code_warning_refresh);
        C35228FgL A00 = C35228FgL.A00(requireContext(), AbstractC166997dE.A0b());
        A00.A04(null, getString(2131961820), R.drawable.instagram_eye_pano_outline_24);
        A00.A04(null, getString(2131961821), R.drawable.instagram_reshare_pano_outline_24);
        C35228FgL.A02(A00, A0g, null, getString(2131961819), R.drawable.instagram_phone_verified_pano_outline_24);
        LLQ.A05(AbstractC31176DnK.A0C(inflate, R.id.container), this, KCM.A00(this.A01));
        C0f9.A09(752355487, A02);
        return inflate;
    }
}
