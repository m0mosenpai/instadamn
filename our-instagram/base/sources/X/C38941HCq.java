package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.base.BoundedLinearLayout;
import java.util.ArrayList;

/* renamed from: X.HCq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38941HCq extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ValuePickerFragment";
    public AbstractC18680vv A00;
    public InterfaceC43425JGp A01;
    public boolean A02;
    public RecyclerView A03;
    public C38357Gtt A04;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_value_picker";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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
    public final AbstractC18680vv getSession() {
        return this.A00;
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
        return !this.A03.canScrollVertically(-1);
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
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1797256937);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC166987dD.A0n(AbstractC60492pY.A01(this));
        int i = requireArguments.getInt("arg_selected_index");
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("arg_values");
        boolean[] booleanArray = requireArguments.getBooleanArray("arg_enabled_indices");
        this.A02 = requireArguments.getBoolean("arg_is_modal");
        J15 j15 = new J15(this, 2);
        stringArrayList.getClass();
        this.A04 = new C38357Gtt(j15, stringArrayList, booleanArray, i);
        C0f9.A09(-770348417, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(913441896);
        BoundedLinearLayout boundedLinearLayout = (BoundedLinearLayout) layoutInflater.inflate(R.layout.layout_value_picker, viewGroup, false);
        int A09 = (int) (AbstractC13880nE.A09(requireContext()) * 0.4f);
        boundedLinearLayout.setMaxHeight(A09);
        this.A03 = AbstractC31176DnK.A0F(boundedLinearLayout);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        this.A03.setLayoutManager(linearLayoutManager);
        this.A03.setAdapter(this.A04);
        linearLayoutManager.A1p(requireArguments().getInt("arg_selected_index"), (A09 / 2) - ((AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.account_group_management_row_text_size) + (AbstractC167017dG.A0A(requireContext()) * 2)) / 2));
        C0f9.A09(-1767358030, A02);
        return boundedLinearLayout;
    }
}
