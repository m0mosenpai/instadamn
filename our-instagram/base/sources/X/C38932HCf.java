package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.HCf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38932HCf extends AbstractC59962oe implements InterfaceC60442pS, C51D, InterfaceC1119153d {
    public static final String __redex_internal_original_name = "DiscountsFragment";
    public C189478aR A00;
    public String A01;
    public boolean A02;
    public FragmentActivity A03;
    public final InterfaceC09390do A06 = C43206J8d.A00(this, 12);
    public final InterfaceC09390do A09 = C43206J8d.A00(this, 15);
    public final InterfaceC09390do A07 = C43206J8d.A00(this, 13);
    public final InterfaceC09390do A0C = C43206J8d.A00(this, 17);
    public final InterfaceC09390do A0A = C43206J8d.A00(this, 16);
    public final InterfaceC09390do A08 = C43206J8d.A00(this, 14);
    public final ID3 A04 = new ID3(this);
    public final InterfaceC09390do A05 = C43206J8d.A00(this, 11);
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_discounts_bottom_sheet";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        this.A03 = requireActivity();
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
        RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(view, R.id.recycler_view);
        AbstractC31177DnL.A0s(requireContext(), recyclerView);
        InterfaceC09390do interfaceC09390do = this.A05;
        AbstractC37304Gc5.A10(recyclerView, interfaceC09390do);
        HER her = (HER) interfaceC09390do.getValue();
        her.clear();
        Iterator it = her.A01.iterator();
        while (it.hasNext()) {
            her.addModel(it.next(), her.A00);
        }
        her.notifyDataSetChanged();
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        if (this.A02) {
            this.A02 = false;
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity fragmentActivity = this.A03;
            String str = null;
            if (fragmentActivity == null) {
                C14360o3.A0F("fragmentActivity");
                throw C00O.createAndThrow();
            }
            INF A0J = c1xj.A0J(fragmentActivity, AbstractC166987dD.A0r(this.A0B), EnumC39622HeW.A07, AbstractC25225BEi.A15(this.A0C), "instagram_shopping_discounts_bottom_sheet");
            InterfaceC09390do interfaceC09390do = this.A09;
            A0J.A0D = AbstractC37300Gc1.A0U((User) interfaceC09390do.getValue());
            A0J.A03 = (User) interfaceC09390do.getValue();
            User user = (User) interfaceC09390do.getValue();
            if (user != null) {
                str = AbstractC76433bn.A00(user);
            }
            A0J.A08 = str;
            A0J.A04 = this.A01;
            A0J.A0A = AbstractC25225BEi.A15(this.A0A);
            A0J.A00();
        }
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
        return AbstractC166987dD.A0n(this.A0B);
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
        int A02 = C0f9.A02(-1465230012);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C0f9.A09(1232440559, A02);
        return inflate;
    }
}
