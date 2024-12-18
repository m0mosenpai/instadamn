package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Map;

/* renamed from: X.Bte, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26877Bte extends C53Z implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "SelectAccountsFragment";
    public final String A03 = "creators_genai_select_accounts";
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(C29911DGz.A01(this, 49), new C29908DGw(this, 0), new C29894DGi(31, this, null), AbstractC25225BEi.A1D(C26906Bu9.class));
    public final InterfaceC09390do A00 = C29911DGz.A00(this, 47);
    public final InterfaceC09390do A01 = C29911DGz.A00(this, 48);

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
        return false;
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
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 27), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A02;
        C26893Btu c26893Btu = ((C26906Bu9) interfaceC09390do.getValue()).A02;
        if (AbstractC25225BEi.A1a(((Map) c26893Btu.A08.getValue()).keySet(), c26893Btu.A09.getValue())) {
            C26893Btu c26893Btu2 = ((C26906Bu9) interfaceC09390do.getValue()).A02;
            D53.A03(((Map) c26893Btu2.A08.getValue()).keySet(), c26893Btu2, c26893Btu2.A03(), 20);
            C189478aR c189478aR = (C189478aR) this.A00.getValue();
            if (c189478aR != null) {
                c189478aR.A0P(true);
            }
            return true;
        }
        return false;
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
        return this.A03;
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
        int A02 = C0f9.A02(-1656252625);
        super.onCreate(bundle);
        C26893Btu c26893Btu = ((C26906Bu9) this.A02.getValue()).A02;
        c26893Btu.A0B.Egh(C6R.A03);
        AbstractC166987dD.A1Z(D4z.A02(c26893Btu, null, 40), c26893Btu.A03());
        C0f9.A09(-60234473, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2054472286);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 39), -1005334295);
        C0f9.A09(-276181454, A02);
        return A00;
    }
}
