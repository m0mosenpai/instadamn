package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KPl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45806KPl extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A02 = KCM.A0A(C45806KPl.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeEnterCodeIntroFragment";
    public final InterfaceC09390do A01 = C1XM.A00(new MHP(this, 27));
    public final KFH A00 = KCM.A02(this, 28);

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
        InterfaceC09390do interfaceC09390do = this.A01;
        KPU.A00((KPU) interfaceC09390do.getValue(), "NORMAL_RESTORE");
        AbstractC43592JPx.A0b(interfaceC09390do).A05("OTC_LANDING_NUX_IMPRESSION");
        AbstractC43592JPx.A0b(interfaceC09390do).A08("IS_OTC_V2", false);
        KCM.A07((C64P) AbstractC166997dE.A0R(requireView(), R.id.bottom_button), this, 54);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(requireView(), R.id.enter_code_intro_headline);
        igdsHeadline.setHeadline(2131961817);
        igdsHeadline.setBody(2131961816);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_lock_confirmation_refresh);
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
        int A022 = C0f9.A02(-1909475726);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_enter_code_intro_v2_fragment, viewGroup, false);
        KCM.A04(inflate, this);
        C0f9.A09(1253579093, A022);
        return inflate;
    }
}
