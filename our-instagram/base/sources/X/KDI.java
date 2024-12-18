package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class KDI extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "PendingThreadsSortAndFilterCustomizationFragment";
    public IgdsListCell A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public IgdsListCell A04;
    public IgdsListCell A05;
    public IgdsListCell A06;
    public final InterfaceC09390do A08 = AbstractC25225BEi.A0a(new C50159MDm(this, 18), new C50159MDm(this, 19), new C50171MDy(18, null, this), AbstractC25225BEi.A1D(C45527KDs.class));
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
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
        this.A03 = AbstractC31173DnH.A0Y(view, R.id.pending_threads_recent_sort_option);
        this.A05 = AbstractC31173DnH.A0Y(view, R.id.pending_threads_top_sort_option);
        IgdsListCell igdsListCell = this.A03;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(EnumC53237Nga.A07);
        }
        IgdsListCell igdsListCell2 = this.A03;
        if (igdsListCell2 != null) {
            igdsListCell2.A06(2131960081);
        }
        IgdsListCell igdsListCell3 = this.A05;
        if (igdsListCell3 != null) {
            igdsListCell3.setTextCellType(EnumC53237Nga.A07);
        }
        IgdsListCell igdsListCell4 = this.A05;
        if (igdsListCell4 != null) {
            igdsListCell4.A06(2131960082);
        }
        this.A06 = AbstractC31173DnH.A0Y(view, R.id.pending_threads_verified_filter);
        this.A00 = AbstractC31173DnH.A0Y(view, R.id.pending_threads_business_filter);
        this.A02 = AbstractC31173DnH.A0Y(view, R.id.pending_threads_creator_filter);
        this.A04 = AbstractC31173DnH.A0Y(view, R.id.pending_threads_subscriber_filter);
        this.A01 = AbstractC31173DnH.A0Y(view, R.id.pending_threads_creator_ai_filter);
        IgdsListCell igdsListCell5 = this.A06;
        if (igdsListCell5 != null) {
            A00(EnumC46248KdP.A0C, igdsListCell5, C50345MKx.A00);
        }
        IgdsListCell igdsListCell6 = this.A00;
        if (igdsListCell6 != null) {
            A00(EnumC46248KdP.A06, igdsListCell6, C50345MKx.A00);
        }
        IgdsListCell igdsListCell7 = this.A02;
        if (igdsListCell7 != null) {
            A00(EnumC46248KdP.A07, igdsListCell7, C50345MKx.A00);
        }
        IgdsListCell igdsListCell8 = this.A04;
        if (igdsListCell8 != null) {
            A00(EnumC46248KdP.A0B, igdsListCell8, C50345MKx.A00);
        }
        InterfaceC09390do interfaceC09390do = this.A07;
        User A02 = AbstractC31176DnK.A0h(interfaceC09390do).A02(AbstractC31173DnH.A0t(interfaceC09390do));
        if (A02 == null) {
            A02 = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
        }
        boolean A2L = A02.A2L();
        IgdsListCell igdsListCell9 = this.A01;
        if (A2L) {
            if (igdsListCell9 != null) {
                igdsListCell9.setVisibility(0);
                new BP5(AbstractC166987dD.A0r(interfaceC09390do), null).A03(C8p.A0O);
                A00(EnumC46248KdP.A08, igdsListCell9, new C50261MHq(this, 45));
            }
        } else {
            AbstractC167007dF.A0x(igdsListCell9);
        }
        AbstractC18560vj.A03(AbstractC25229BEm.A0a(this), new C15340po(new MC4(this, null, 5), ((C45527KDs) this.A08.getValue()).A06));
        IgdsListCell igdsListCell10 = this.A03;
        if (igdsListCell10 != null) {
            igdsListCell10.A0D(new LRE(this, 13));
        }
        IgdsListCell igdsListCell11 = this.A05;
        if (igdsListCell11 != null) {
            igdsListCell11.A0D(new LRE(this, 14));
        }
    }

    private final void A00(EnumC46248KdP enumC46248KdP, IgdsListCell igdsListCell, InterfaceC16660sJ interfaceC16660sJ) {
        igdsListCell.setTextCellType(EnumC53237Nga.A03);
        igdsListCell.setChecked(((java.util.Set) ((C45527KDs) this.A08.getValue()).A04.getValue()).contains(enumC46248KdP));
        igdsListCell.A0D(new C55516Ol9(2, interfaceC16660sJ, enumC46248KdP, this));
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
        return AbstractC166987dD.A0n(this.A07);
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
        int A02 = C0f9.A02(-1017791066);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_sort_and_filter_bottom_sheet, false);
        C0f9.A09(-1059440894, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1619116886);
        super.onDestroyView();
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A00 = null;
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
        C0f9.A09(-1873949623, A02);
    }
}
