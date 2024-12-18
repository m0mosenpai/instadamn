package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EN5 extends AbstractC59962oe implements C51E, C51D {
    public static final String __redex_internal_original_name = "DownloadPrivacyNuxFragment";
    public int A00;
    public FF8 A01;
    public FKG A02;
    public C189478aR A03;
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
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.clips_download_privacy_nux_icon);
        AbstractC166997dE.A19(A0I.getContext(), A0I, R.drawable.ig_illustrations_illo_reels_download_refresh);
        ViewOnClickListenerC35679FpE.A01(view.requireViewById(R.id.clips_download_privacy_nux_button), 52, this);
        ViewOnClickListenerC35679FpE.A01(view.requireViewById(R.id.clips_download_privacy_nux_link), 53, this);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.clips_download_privacy_nux_description);
        String A0v = AbstractC25227BEk.A0v(this, 2131955436);
        String A0v2 = AbstractC25227BEk.A0v(this, 2131955437);
        AnonymousClass773.A07(new C33265Elz(this, A0v2, AbstractC25233BEq.A04(this)), A0N, A0v2, A0v);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A04;
        C55220Oej.A03(requireContext, AbstractC166987dD.A0r(interfaceC09390do), getModuleName(), true);
        FKG fkg = this.A02;
        if (fkg != null) {
            C47Z c47z = fkg.A02;
            UserSession userSession = fkg.A01;
            InterfaceC11380iw interfaceC11380iw = fkg.A00;
            c47z.A6E = true;
            AbstractC37670Gi3.A0g(interfaceC11380iw, userSession, true, true);
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String string = requireArguments().getString("module_name", __redex_internal_original_name);
        C14360o3.A07(string);
        return string;
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
        int A02 = C0f9.A02(-1823511804);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_download_privacy_nux, viewGroup, false);
        C0f9.A09(1696945585, A02);
        return inflate;
    }
}
