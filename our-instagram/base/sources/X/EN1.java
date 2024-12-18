package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes6.dex */
public final class EN1 extends AbstractC59962oe implements C51D, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LikesListComposeFragment";
    public boolean A00;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A04 = C37057GUn.A00(this, 48);
    public final InterfaceC09390do A01 = C37057GUn.A00(this, 45);
    public final InterfaceC09390do A06 = C1XM.A00(new C57246PbU(this, 4));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C38321qM BQN;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (AbstractC167007dF.A1Z(this.A02)) {
            interfaceC56362iU.EkF(false);
        }
        interfaceC56362iU.Efu(((C50861Mds) this.A07.getValue()).A0E(null));
        interfaceC56362iU.EkS(true);
        InterfaceC38371qR A04 = ((C51757Mtg) this.A01.getValue()).A04();
        if (A04 != null && (BQN = A04.BQN()) != null && BO2.A01(AbstractC166987dD.A0r(this.A05), BQN)) {
            BO2.A00(requireContext(), new ViewOnClickListenerC35670Fp5(19, BQN, this), interfaceC56362iU);
        }
    }

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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = true;
        C34538FJy c34538FJy = (C34538FJy) this.A06.getValue();
        C51757Mtg c51757Mtg = c34538FJy.A00;
        AbstractC33573Esl abstractC33573Esl = (AbstractC33573Esl) c51757Mtg.A01;
        QIv qIv = (QIv) c51757Mtg.A00;
        if (qIv.A01 && (abstractC33573Esl instanceof C33295Enq)) {
            FEN.A00.A00(AbstractC31171DnF.A0D(c51757Mtg.A02), c34538FJy.A01, ((C33295Enq) abstractC33573Esl).A02, qIv.A00);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return ((C51757Mtg) this.A01.getValue()).A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public EN1() {
        C57246PbU c57246PbU = new C57246PbU(this, 5);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57246PbU(new C57246PbU(this, 1), 2));
        this.A07 = AbstractC25225BEi.A0a(new C57246PbU(A00, 3), c57246PbU, new C57532Pg6(4, null, A00), AbstractC25225BEi.A1D(C50861Mds.class));
        this.A03 = C37057GUn.A00(this, 47);
        this.A02 = C37057GUn.A00(this, 46);
        this.A00 = true;
        this.A05 = AbstractC60492pY.A02(this);
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
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-4329445);
        super.onCreate(bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A07);
        AbstractC166987dD.A1Z(new PZE(A0Z, null, 22), AbstractC141776au.A00(A0Z));
        ((MTJ) this.A03.getValue()).A00.A04();
        C0f9.A09(450334097, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-356191613);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30482DbR(this, 19), -1202205501);
        C0f9.A09(1491791615, A02);
        return A00;
    }
}
