package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel;

/* renamed from: X.EMm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32340EMm extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "SupportInboxObBottomSheetFragment";
    public UserSession A00;
    public IgdsBottomButtonLayout A01;
    public SupportInboxDetailBottomSheetModel A02;
    public String A03;
    public String A04;
    public boolean A05;

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
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.oversight_board_bottom_sheet_title);
        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.oversight_board_bottom_sheet_body);
        C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.oversight_board_bottom_sheet_link);
        C14360o3.A0C(requireViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) requireViewById3;
        this.A01 = AbstractC31172DnG.A0j(view, R.id.ob_reference_id_button);
        SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel = this.A02;
        C14360o3.A0A(supportInboxDetailBottomSheetModel);
        if (supportInboxDetailBottomSheetModel.A03 != null) {
            SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel2 = this.A02;
            C14360o3.A0A(supportInboxDetailBottomSheetModel2);
            textView.setText(supportInboxDetailBottomSheetModel2.A03);
        }
        SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel3 = this.A02;
        C14360o3.A0A(supportInboxDetailBottomSheetModel3);
        if (supportInboxDetailBottomSheetModel3.A00 != null) {
            SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel4 = this.A02;
            C14360o3.A0A(supportInboxDetailBottomSheetModel4);
            textView2.setText(supportInboxDetailBottomSheetModel4.A00);
        }
        SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel5 = this.A02;
        C14360o3.A0A(supportInboxDetailBottomSheetModel5);
        if (supportInboxDetailBottomSheetModel5.A01 != null) {
            SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel6 = this.A02;
            C14360o3.A0A(supportInboxDetailBottomSheetModel6);
            if (supportInboxDetailBottomSheetModel6.A02 != null) {
                SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel7 = this.A02;
                C14360o3.A0A(supportInboxDetailBottomSheetModel7);
                String str = supportInboxDetailBottomSheetModel7.A01;
                C14360o3.A0A(str);
                SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel8 = this.A02;
                C14360o3.A0A(supportInboxDetailBottomSheetModel8);
                String str2 = supportInboxDetailBottomSheetModel8.A01;
                C14360o3.A0A(str2);
                AnonymousClass773.A07(new Em1(this, requireActivity().getColor(AbstractC53242c7.A06(getContext()))), textView3, str, str2);
            }
        }
        if (!this.A05) {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A01;
            C14360o3.A0A(igdsBottomButtonLayout);
            igdsBottomButtonLayout.setFooterText(AbstractC167007dF.A0f(requireContext(), this.A03, 2131974977));
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A01;
            C14360o3.A0A(igdsBottomButtonLayout2);
            igdsBottomButtonLayout2.setPrimaryAction(this.A04, new ViewOnClickListenerC35678FpD(this, 0));
            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A01;
            C14360o3.A0A(igdsBottomButtonLayout3);
            igdsBottomButtonLayout3.setVisibility(0);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A05) {
            return "ob_expired";
        }
        return "ob_appeal";
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A01;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setTranslationY((-i) - i2);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
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
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-952228348);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = (SupportInboxDetailBottomSheetModel) AbstractC153636vY.A00(requireArguments, SupportInboxDetailBottomSheetModel.class, "ARG_BOTTOM_SHEET_INFO");
        this.A04 = AbstractC153636vY.A01(requireArguments, "ARG_REFERENCE_ID");
        this.A05 = requireArguments.getBoolean("ARG_IS_EXPIRED");
        this.A03 = C23831Eq.A01(requireArguments.getLong("ARG_EXPIRATION_TIME"));
        this.A00 = AbstractC31171DnF.A0G(requireArguments);
        requireArguments.getString("ARG_CTRL_TYPE");
        requireArguments.getString("ARG_TICKET_TYPE");
        requireArguments.getString("ARG_REPORTED_CONTENT_ID");
        requireArguments.getString("ARG_CONTENT_TYPE");
        C0f9.A09(-1927261072, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1412617434);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.support_inbox_ob_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-1087362531, A02);
        return inflate;
    }
}
