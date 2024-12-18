package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;

/* renamed from: X.N6y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52169N6y extends AbstractC59962oe implements InterfaceC60442pS, C51D {
    public static final String __redex_internal_original_name = "ProfileNotificationsSettingsFragment";
    public OC5 A00;
    public InterfaceC57971PnH A01;
    public ScrollView A02;
    public final C28271Yo A03;
    public final String A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
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

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (ScrollView) view.requireViewById(R.id.profile_follow_sheet_notifications_scroll_view);
        View A0S = AbstractC166997dE.A0S(view, R.id.profile_follow_sheet_notifications_list_container);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.findViewById(R.id.igtv_setting_row_stub), false, false);
        InterfaceC56392iX A0U = AbstractC31173DnH.A0U(view, R.id.clips_setting_row_stub);
        InterfaceC56392iX A0U2 = AbstractC31173DnH.A0U(view, R.id.live_settings_row_stub);
        InterfaceC56392iX A0D = AbstractC37301Gc2.A0D(view, R.id.subscriptions_content_row_stub);
        InterfaceC56392iX A0U3 = AbstractC31173DnH.A0U(view, R.id.broadcast_chat_settings_row_stub);
        InterfaceC56392iX A0U4 = AbstractC31173DnH.A0U(view, R.id.broadcast_chat_multi_options_settings_row_stub);
        EmptyStateView emptyStateView = (EmptyStateView) AbstractC166997dE.A0S(view, R.id.profile_follow_sheet_notifications_empty_state_view);
        emptyStateView.A0N(new ViewOnClickListenerC55456OkA(this, 53), EnumC153216up.A04);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C43168J6i(viewLifecycleOwner, c07s, this, A0S, emptyStateView, view, A01, A0U2, A0U, A0D, A0U3, A0U4, null, 0), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(InterfaceC56392iX interfaceC56392iX, C52169N6y c52169N6y, User user) {
        if (!C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(c52169N6y.A05), 36321855522482037L)) {
            IgdsListCell igdsListCell = (IgdsListCell) interfaceC56392iX.getView();
            igdsListCell.A06(2131976468);
            igdsListCell.setTextCellType(EnumC53237Nga.A08);
            igdsListCell.setChecked(user.A20());
            igdsListCell.A0E(new P3X(8, user, c52169N6y));
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
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
        ScrollView scrollView = this.A02;
        if (scrollView == null || scrollView.getScrollY() <= 0) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C52169N6y() {
        C57244PbS c57244PbS = new C57244PbS(this, 18);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57244PbS(new C57244PbS(this, 15), 16));
        this.A06 = AbstractC25225BEi.A0a(new C57244PbS(A00, 17), c57244PbS, new C57257Pbf(13, null, A00), AbstractC25225BEi.A1D(C50976Mfj.class));
        this.A05 = AbstractC60492pY.A02(this);
        this.A03 = C2OJ.A00();
        this.A04 = "media_notifications_sheet";
    }

    public static final void A01(InterfaceC56392iX interfaceC56392iX, C52169N6y c52169N6y, User user) {
        int i;
        IgdsListCell igdsListCell = (IgdsListCell) interfaceC56392iX.getView();
        igdsListCell.A06(2131962724);
        igdsListCell.A0C(new ViewOnClickListenerC55456OkA(c52169N6y, 52));
        int ordinal = user.A09().ordinal();
        if (ordinal != 1) {
            i = 2131976460;
            if (ordinal != 3) {
                i = 2131976455;
            }
        } else {
            i = 2131976449;
        }
        igdsListCell.A0K(AbstractC166997dE.A0q(igdsListCell.getResources(), i), false);
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
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-140950141);
        super.onCreate(bundle);
        ((C50976Mfj) this.A06.getValue()).A00();
        C0f9.A09(-1634427330, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1024731319);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_profile_follow_sheet_notifications, viewGroup, false);
        C0f9.A09(-124902505, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1675376519);
        super.onDestroyView();
        this.A02 = null;
        C0f9.A09(-1051380884, A02);
    }
}
