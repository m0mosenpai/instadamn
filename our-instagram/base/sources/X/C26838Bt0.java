package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bt0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26838Bt0 extends AbstractC59962oe implements InterfaceC60442pS, C51D {
    public static final String __redex_internal_original_name = "InviteContactFragment";
    public boolean A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

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
        return "invite_contact_module";
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26838Bt0() {
        C50164MDr c50164MDr = new C50164MDr(this, 25);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50164MDr(new C50164MDr(this, 22), 23));
        this.A02 = AbstractC25225BEi.A0a(new C50164MDr(A00, 24), c50164MDr, new C57251PbZ(48, null, A00), AbstractC25225BEi.A1D(C25805BbM.class));
        this.A00 = true;
        this.A01 = AbstractC60492pY.A02(this);
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

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC33510Erj enumC33510Erj;
        int A02 = C0f9.A02(-334828379);
        C14360o3.A0B(layoutInflater, 0);
        String string = requireArguments().getString("invite_location");
        if (string == null || (enumC33510Erj = EnumC33510Erj.valueOf(string)) == null) {
            enumC33510Erj = EnumC33510Erj.OTHER;
        }
        boolean z = requireArguments().getBoolean(AbstractC111324zv.A00(1267), true);
        boolean z2 = requireArguments().getBoolean("is_photo_enabled", false);
        Bundle requireArguments = requireArguments();
        String A00 = AbstractC111324zv.A00(1036);
        boolean z3 = requireArguments.getBoolean(A00, false);
        InterfaceC09390do interfaceC09390do = this.A02;
        ((C25805BbM) interfaceC09390do.getValue()).A0E(enumC33510Erj);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(((C25805BbM) interfaceC09390do.getValue()).A01), "contact_list_impression");
        if (A0f.isSampled()) {
            String A14 = AbstractC25225BEi.A14();
            if (A14 == null) {
                A14 = "";
            }
            AbstractC25225BEi.A1N(A0f, A14);
            A0f.A8R(enumC33510Erj, "invite_location");
            A0f.A7v(A00, Boolean.valueOf(z3));
            A0f.Cht();
        }
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(((C25805BbM) interfaceC09390do.getValue()).A01), "external_invite_app_tray_impression");
        if (A0f2.isSampled()) {
            String A142 = AbstractC25225BEi.A14();
            if (A142 == null) {
                A142 = "";
            }
            AbstractC25225BEi.A1N(A0f2, A142);
            A0f2.A8R(enumC33510Erj, "invite_location");
            A0f2.Cht();
        }
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A04(new C30208DSn(enumC33510Erj, this, z, z2, z3), 131540109, true), false, false);
        C0f9.A09(1474821504, A02);
        return A022;
    }
}
