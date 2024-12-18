package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;

/* renamed from: X.N5d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52129N5d extends AbstractC59962oe implements InterfaceC11380iw, C51D {
    public static final String __redex_internal_original_name = "ProfileMenuFragment";
    public C56765PHi A00;
    public final InterfaceC74953Yl A03 = AbstractC25230BEn.A0U(C16930sl.A00);
    public final InterfaceC74953Yl A02 = AbstractC25229BEm.A0R(AbstractC25227BEk.A0p());
    public boolean A01 = true;
    public final InterfaceC09390do A06 = C1XM.A00(new C57244PbS(this, 25));
    public final InterfaceC09390do A07 = C1XM.A00(new C57244PbS(this, 26));
    public final InterfaceC09390do A04 = C1XM.A00(new C57244PbS(this, 24));
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    /* JADX WARN: Type inference failed for: r2v0, types: [X.PHi, java.lang.Object, X.53d] */
    public final /* synthetic */ void A00(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        ?? obj = new Object();
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = obj;
        A0y.A0T = this;
        C189478aR A00 = A0y.A00();
        obj.A00 = A00;
        A00.A02(activity, this);
        C55772hI.A00(userSession).A0D("unknown", this);
        this.A00 = obj;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "bottom_sheet_profile";
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
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
        return this.A01;
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
        int A02 = C0f9.A02(-83267318);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 21), -722855712);
        C0f9.A09(1793452021, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1366271164);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A05;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36324462567829685L)) {
            OY7.A02(AbstractC166987dD.A0r(interfaceC09390do), requireActivity());
        }
        Context requireContext = requireContext();
        AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do);
        C14360o3.A0B(A0o2, 1);
        if (C18U.A06(c06090Tz, A0o2, 36317749533939209L)) {
            long A01 = C18U.A01(c06090Tz, A0o2, 36599224510516701L);
            AbstractC191798eb.A04(requireContext, new C191778eZ(A0o2), AbstractC111324zv.A00(371), AbstractC166987dD.A1G(), A01);
        }
        C0f9.A09(-131438596, A02);
    }
}
