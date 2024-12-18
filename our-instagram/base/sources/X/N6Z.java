package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.XDTTextPostAppAccountPrivacyOptions;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N6Z extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "NewUserActivationPrivacyFragment";
    public C50812Mci A00;
    public C50812Mci A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "new_user_activation_privacy";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static final EnumC53346Niw A00(N6Z n6z) {
        C50812Mci c50812Mci = n6z.A01;
        if (c50812Mci == null) {
            C14360o3.A0F("publicRadioButton");
            throw C00O.createAndThrow();
        }
        if (c50812Mci.isChecked()) {
            return EnumC53346Niw.PUBLIC;
        }
        return EnumC53346Niw.PRIVATE;
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

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A02;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String A0B = AbstractC50524MSc.A0B(interfaceC09390do);
        C55192Ody.A03(EnumC53361NjC.BACK, A00(this), EnumC53354Nj4.PRIVACY_SELECTION, A0r, A0B);
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        InterfaceC09390do interfaceC09390do = this.A02;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String A0B = AbstractC50524MSc.A0B(interfaceC09390do);
        C55192Ody.A03(EnumC53361NjC.EXIT, A00(this), EnumC53354Nj4.PRIVACY_SELECTION, A0r, A0B);
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
        int A02 = C0f9.A02(-2015504169);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.new_user_activation_privacy, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.next_button);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.footer_text);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.privacy_radio_group);
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A02;
        boolean A1X = AbstractC167007dF.A1X(AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A03.BGE(), XDTTextPostAppAccountPrivacyOptions.A04);
        C50812Mci c50812Mci = new C50812Mci(requireContext());
        this.A01 = c50812Mci;
        c50812Mci.setTitleText(2131975546);
        C50812Mci c50812Mci2 = this.A01;
        if (c50812Mci2 != null) {
            c50812Mci2.setSubTitleText(2131975545);
            C50812Mci c50812Mci3 = this.A01;
            if (c50812Mci3 != null) {
                c50812Mci3.setChecked(!A1X);
                C50812Mci c50812Mci4 = this.A01;
                if (c50812Mci4 != null) {
                    c50812Mci4.setTag("public");
                    C50812Mci c50812Mci5 = this.A01;
                    if (c50812Mci5 != null) {
                        c50812Mci5.setLeftIcon(R.drawable.instagram_globe_pano_outline_24);
                        C50812Mci c50812Mci6 = this.A01;
                        if (c50812Mci6 != null) {
                            viewGroup2.addView(c50812Mci6, 0);
                            C50812Mci c50812Mci7 = new C50812Mci(requireContext());
                            this.A00 = c50812Mci7;
                            c50812Mci7.setTitleText(2131975544);
                            C50812Mci c50812Mci8 = this.A00;
                            if (c50812Mci8 != null) {
                                c50812Mci8.setSubTitleText(2131975543);
                                C50812Mci c50812Mci9 = this.A00;
                                if (c50812Mci9 != null) {
                                    c50812Mci9.setChecked(A1X);
                                    C50812Mci c50812Mci10 = this.A00;
                                    if (c50812Mci10 != null) {
                                        c50812Mci10.setTag("private");
                                        C50812Mci c50812Mci11 = this.A00;
                                        if (c50812Mci11 != null) {
                                            c50812Mci11.setLeftIcon(R.drawable.instagram_lock_pano_outline_24);
                                            C50812Mci c50812Mci12 = this.A00;
                                            if (c50812Mci12 != null) {
                                                viewGroup2.addView(c50812Mci12, 1);
                                                C50812Mci c50812Mci13 = this.A01;
                                                if (c50812Mci13 != null) {
                                                    ViewOnClickListenerC55462OkH.A01(c50812Mci13, 3, this);
                                                    C50812Mci c50812Mci14 = this.A00;
                                                    if (c50812Mci14 != null) {
                                                        ViewOnClickListenerC55462OkH.A01(c50812Mci14, 4, this);
                                                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                                                        String A0B = AbstractC50524MSc.A0B(interfaceC09390do);
                                                        C55192Ody.A02(EnumC53337Nin.A02, A00(this), EnumC53354Nj4.PRIVACY_SELECTION, A0r, A0B);
                                                        AbstractC31176DnK.A1G(A0e, AbstractC53925Nsy.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), AbstractC166997dE.A0p(requireContext(), 2131975542), new OA5(AbstractC166997dE.A0p(requireContext(), 2131965057), "https://help.instagram.com/788669719351544", new C57242PbQ(this, 23))));
                                                        ViewOnClickListenerC55462OkH.A01(findViewById, 6, this);
                                                        C0f9.A09(-1070320502, A02);
                                                        return inflate;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F("privateRadioButton");
                            throw C00O.createAndThrow();
                        }
                    }
                }
            }
        }
        C14360o3.A0F("publicRadioButton");
        throw C00O.createAndThrow();
    }
}
