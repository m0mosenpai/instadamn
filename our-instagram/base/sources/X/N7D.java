package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes9.dex */
public final class N7D extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "StoryPartyFragment";
    public RecyclerView A00;
    public IgTextView A01;
    public final String A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

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
        IgTextView A0Y = AbstractC31172DnG.A0Y(requireView(), R.id.attribution_text);
        AbstractC25227BEk.A11(A0Y);
        this.A01 = A0Y;
        RecyclerView A0F = AbstractC31176DnK.A0F(requireView());
        AbstractC50523MSb.A0r(this, A0F);
        AbstractC37304Gc5.A10(A0F, this.A03);
        this.A00 = A0F;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57165PZj c57165PZj = new C57165PZj(c07s, this, viewLifecycleOwner, null, 42);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, c57165PZj, A00);
        AbstractC23641Du.A05(anonymousClass191, new C57165PZj(c07s, this, A0K, null, 41), C07Y.A00(A0K));
        InterfaceC09390do interfaceC09390do = this.A07;
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
        Resources A09 = AbstractC31177DnL.A09(this);
        InterfaceC09390do interfaceC09390do2 = this.A04;
        String A15 = AbstractC25225BEi.A15(interfaceC09390do2);
        AbstractC23641Du.A05(anonymousClass191, new PZQ(A09, A0Z, A15, null, 16), MSX.A0B(A0Z, A15, 1));
        AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(interfaceC09390do);
        String A152 = AbstractC25225BEi.A15(interfaceC09390do2);
        AbstractC23641Du.A05(anonymousClass191, new PZ1(A0Z2, A152, null, 25), MSX.A0B(A0Z2, A152, 0));
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
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
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
        if (recyclerView != null && AbstractC43592JPx.A1X(recyclerView)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7D() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = C57539PgD.A00(this, enumC09460dv, 12);
        this.A03 = AbstractC09440dt.A00(enumC09460dv, C57402Pe0.A00);
        this.A05 = C57539PgD.A00(this, enumC09460dv, 13);
        C57539PgD c57539PgD = new C57539PgD(this, 17);
        InterfaceC09390do A00 = C57539PgD.A00(new C57539PgD(this, 14), enumC09460dv, 15);
        this.A07 = AbstractC25225BEi.A0a(new C57539PgD(A00, 16), c57539PgD, new C57257Pbf(47, null, A00), AbstractC25225BEi.A1D(C50906Meb.class));
        this.A06 = AbstractC60492pY.A02(this);
        this.A02 = "context_sheet_story_party";
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
        int A02 = C0f9.A02(2115683010);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_story_party, false);
        C0f9.A09(1302033127, A02);
        return A0R;
    }
}
