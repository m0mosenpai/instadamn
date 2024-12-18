package X;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class N6X extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "NewUserActivationDisclosureFragment";
    public IgdsButton A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A02 = C56035Ou7.A00(this, 32);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "new_user_activation_disclosure";
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String A0B = AbstractC50524MSc.A0B(interfaceC09390do);
        C55192Ody.A03(EnumC53361NjC.BACK, null, EnumC53354Nj4.HOW_IT_WORKS, A0r, A0B);
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        InterfaceC09390do interfaceC09390do = this.A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String A0B = AbstractC50524MSc.A0B(interfaceC09390do);
        C55192Ody.A03(EnumC53361NjC.EXIT, null, EnumC53354Nj4.HOW_IT_WORKS, A0r, A0B);
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
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1199100325);
        super.onCreate(bundle);
        AbstractC31176DnK.A0Q(this.A01).A01(this.A02, C55984OtH.class);
        C0f9.A09(-184769546, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Boolean A00;
        int A02 = C0f9.A02(82257324);
        C14360o3.A0B(layoutInflater, 0);
        InterfaceC09390do interfaceC09390do = this.A01;
        C55192Ody.A02(EnumC53337Nin.A02, null, EnumC53354Nj4.HOW_IT_WORKS, AbstractC166987dD.A0r(interfaceC09390do), AbstractC50524MSc.A0B(interfaceC09390do));
        boolean z = false;
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.new_user_activation_disclosure, false);
        SpannableString A002 = AbstractC53925Nsy.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), AbstractC166997dE.A0p(requireContext(), 2131975527), new OA5(AbstractC166997dE.A0p(requireContext(), 2131965057), "https://help.instagram.com/788669719351544", new C57242PbQ(this, 17)));
        SpannableString A003 = AbstractC53925Nsy.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), AbstractC166997dE.A0p(requireContext(), 2131975528), new OA5(AbstractC166997dE.A0p(requireContext(), 2131965057), "https://help.instagram.com/169559812696339", new C57242PbQ(this, 18)));
        SpannableString A004 = AbstractC53925Nsy.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), AbstractC166997dE.A0p(requireContext(), 2131975529), new OA5(AbstractC166997dE.A0p(requireContext(), 2131966615), "https://help.instagram.com/581066165581870", new C57242PbQ(this, 19)), new OA5(AbstractC166997dE.A0p(requireContext(), 2131975558), "https://help.instagram.com/769983657850450", new C57242PbQ(this, 20)), new OA5(AbstractC166997dE.A0p(requireContext(), 2131966613), AbstractC50635MWw.A02(0, 42, 14), new C57242PbQ(this, 21)), new OA5(AbstractC166997dE.A0p(requireContext(), 2131975557), "https://help.instagram.com/515230437301944", new C57242PbQ(this, 22)));
        ((IgdsBulletCell) A0C.requireViewById(R.id.bullet1)).setText(requireContext().getString(2131975533), A002);
        ((IgdsBulletCell) A0C.requireViewById(R.id.bullet1)).setMovementMethod(null, LinkMovementMethod.getInstance());
        ((IgdsBulletCell) A0C.requireViewById(R.id.bullet2)).setText(requireContext().getString(2131975534), A003);
        boolean A06 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36324037366984540L);
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) AbstractC166997dE.A0R(A0C, R.id.bullet_content_visibility);
        if (A06) {
            igdsBulletCell.setText(requireContext().getString(2131975536), requireContext().getString(2131975530));
            igdsBulletCell.setVisibility(0);
        } else {
            igdsBulletCell.setVisibility(8);
        }
        ((IgdsBulletCell) A0C.requireViewById(R.id.bullet2)).setMovementMethod(null, LinkMovementMethod.getInstance());
        ((IgdsBulletCell) A0C.requireViewById(R.id.bullet3)).setText(requireContext().getString(2131975535), A004);
        ((IgdsBulletCell) A0C.requireViewById(R.id.bullet3)).setMovementMethod(null, LinkMovementMethod.getInstance());
        this.A00 = (IgdsButton) A0C.findViewById(R.id.next_button);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (A00 = AbstractC147226jy.A00(bundle2, "is_private")) != null) {
            z = A00.booleanValue();
        }
        IgdsButton igdsButton = this.A00;
        if (igdsButton == null) {
            C14360o3.A0F("nextButton");
            throw C00O.createAndThrow();
        }
        C0fQ.A00(new Ok5(3, this, z), igdsButton);
        C0f9.A09(-1267695840, A02);
        return A0C;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1485576700);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A01).A02(this.A02, C55984OtH.class);
        C0f9.A09(395229865, A02);
    }
}
