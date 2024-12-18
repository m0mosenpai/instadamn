package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BtN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26861BtN extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ClipsSpinsAddSpinTextBottomSheetFragment";
    public C189478aR A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(1029);
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
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new C57153PYx(this, null, 10), ((C26905Bu8) this.A02.getValue()).A06));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26861BtN() {
        C29888DGc A00 = C29888DGc.A00(this, 42);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C29888DGc.A00(C29888DGc.A00(this, 45), 46));
        this.A02 = AbstractC25225BEi.A0a(C29888DGc.A00(A002, 47), A00, new D8J(24, null, A002), AbstractC25225BEi.A1D(C26905Bu8.class));
        this.A03 = C1XM.A00(C29888DGc.A00(this, 43));
        this.A01 = C1XM.A00(C29851DEr.A00);
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
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-597767599);
        super.onCreate(bundle);
        AbstractC18560vj.A03(AbstractC25229BEm.A0a(this), new C15340po(new C57153PYx(this, null, 9), ((C26905Bu8) this.A02.getValue()).A04));
        C0f9.A09(-1365894994, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1653291596);
        ComposeView A00 = AbstractC25319BIo.A00(this, new DSY(this, requireArguments().getString("stripped_media_id"), 4, AbstractC167007dF.A1X(C17060sy.A01.A01(AbstractC166987dD.A0r(this.A04)).A0M(), C05F.A0C)), 102906694);
        C0f9.A09(-423958003, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1997258749);
        super.onDestroy();
        this.A00 = null;
        C0f9.A09(2015921414, A02);
    }
}
