package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N7C extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "QuickSnapPreviewAudienceListFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A06 = __redex_internal_original_name;
    public final InterfaceC09390do A05 = C57519Pft.A00(this, 42);

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
        InterfaceC09390do interfaceC09390do = this.A02;
        MSW.A0D(this.A01).setText(AbstractC167017dG.A0k(AbstractC166997dE.A0N(this), AbstractC31171DnF.A0n(interfaceC09390do).size(), R.plurals.quick_snap_preview_audience_count));
        InterfaceC09390do interfaceC09390do2 = this.A03;
        AbstractC31178DnM.A0z(this, (RecyclerView) interfaceC09390do2.getValue());
        RecyclerView recyclerView = (RecyclerView) interfaceC09390do2.getValue();
        InterfaceC09390do interfaceC09390do3 = this.A00;
        recyclerView.setAdapter((C2UU) AbstractC166987dD.A17(interfaceC09390do3));
        ((RecyclerView) interfaceC09390do2.getValue()).A0S = true;
        C66362zD c66362zD = (C66362zD) AbstractC166987dD.A17(interfaceC09390do3);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        List A0n = AbstractC31171DnF.A0n(interfaceC09390do);
        ArrayList A0q = AbstractC167017dG.A0q(A0n);
        Iterator it = A0n.iterator();
        while (it.hasNext()) {
            A0q.add(new C56095OvF(this, AbstractC25226BEj.A15(it)));
        }
        A0E.A01(A0q);
        c66362zD.A05(A0E);
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
        return this.A06;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
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
        return !AbstractC43592JPx.A1X(AbstractC166987dD.A0d(this.A03));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7C() {
        C57667PiI c57667PiI = C57667PiI.A00;
        this.A03 = AMo.A05(this, c57667PiI, R.id.recycler_view);
        this.A01 = AMo.A05(this, c57667PiI, R.id.audience_count);
        this.A02 = C57519Pft.A00(this, 41);
        this.A00 = C57519Pft.A00(this, 40);
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
        int A02 = C0f9.A02(895664156);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_quick_snap_preview_audience_list, false);
        C0f9.A09(802968093, A02);
        return A0R;
    }
}
