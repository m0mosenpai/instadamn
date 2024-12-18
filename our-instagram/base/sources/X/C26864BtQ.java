package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;

/* renamed from: X.BtQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26864BtQ extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "SpinsSelectionBottomSheetFragment";
    public C47Z A00;
    public String A01;
    public InterfaceC16820sZ A02;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A06 = "clips_enable_spins";
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(C29888DGc.A00(this, 28), C29848DEo.A00, new D8J(18, null, this), AbstractC25225BEi.A1D(C25862BcH.class));
    public final InterfaceC09390do A03 = C1XM.A00(C29888DGc.A00(this, 27));

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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
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

    public static final void A00(C211819a8 c211819a8, C26864BtQ c26864BtQ) {
        Object value;
        String str;
        String str2;
        C5Hb c5Hb;
        InterfaceC09390do interfaceC09390do = c26864BtQ.A05;
        C05A c05a = ((C25862BcH) interfaceC09390do.getValue()).A00;
        do {
            value = c05a.getValue();
            MUW muw = (MUW) value;
            str = muw.A02;
            str2 = muw.A03;
            c5Hb = (C5Hb) muw.A00;
            C14360o3.A0B(c5Hb, 3);
        } while (!c05a.AIi(value, new MUW(c211819a8, str, str2, c5Hb)));
        C47Z c47z = c26864BtQ.A00;
        String str3 = c26864BtQ.A01;
        if (c211819a8 != null && str3 != null && c211819a8.Bzo() > 0.0f && c47z != null) {
            ((OVl) c26864BtQ.A03.getValue()).A01(new C29237Cug(c26864BtQ), c47z, str3, AbstractC166997dE.A0N(c26864BtQ).getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge_plus), AbstractC166997dE.A0N(c26864BtQ).getDimensionPixelSize(R.dimen.before_and_after_media_card_width), c211819a8.Bzo() * 1000, true);
            return;
        }
        ((C25862BcH) interfaceC09390do.getValue()).A01(null);
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
        return this.A06;
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
        int A02 = C0f9.A02(-1510571375);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30506Dbp(this, 26), 987831620);
        C0f9.A09(-1770381930, A02);
        return A00;
    }
}
