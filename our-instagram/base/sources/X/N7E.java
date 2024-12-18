package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N7E extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "InternalStickerBottomsheetFragment";
    public RecyclerView A00;
    public final O44 A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final String A07 = "internal_sticker_add_yours_sheet";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A06);
        C141796aw A00 = AbstractC141776au.A00(A0Z);
        PZB pzb = new PZB(A0Z, (InterfaceC23621Ds) null, 44);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pzb, A00);
        RecyclerView A0F = AbstractC31176DnK.A0F(requireView());
        AbstractC50523MSb.A0r(this, A0F);
        AbstractC37304Gc5.A10(A0F, this.A02);
        this.A00 = A0F;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, new C57165PZj(c07s, this, viewLifecycleOwner, null, 40), C07Y.A00(viewLifecycleOwner));
        AbstractC23641Du.A05(anonymousClass191, new C57165PZj(c07s, this, A0K, null, 39), C07Y.A00(A0K));
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
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
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !AbstractC43592JPx.A1X(recyclerView)) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7E() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new B8P(this, 44));
        C57539PgD c57539PgD = new C57539PgD(this, 0);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new B8P(new B8P(this, 47), 48));
        this.A06 = AbstractC25225BEi.A0a(new B8P(A00, 49), c57539PgD, new C57257Pbf(46, null, A00), AbstractC25225BEi.A1D(C50905Mea.class));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new B8P(this, 46));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new B8P(this, 45));
        this.A01 = new O44(this);
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
        int A02 = C0f9.A02(-1560683124);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.internal_sticker_viewer_fragment, false);
        C0f9.A09(599944036, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-838033336);
        super.onDestroyView();
        this.A00 = null;
        ((C38E) this.A04.getValue()).A05 = null;
        C0f9.A09(-11169702, A02);
    }
}
