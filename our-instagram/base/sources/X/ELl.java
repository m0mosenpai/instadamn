package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes6.dex */
public final class ELl extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "ReporterAppealEducationBottomSheetFragment";
    public int A00;
    public View A01;
    public UserSession A02;
    public IgdsBottomButtonLayout A03;
    public C189478aR A04;
    public ENO A05;
    public Long A06;
    public String A07;
    public String A08;
    public View A09;

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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reporter_appeal_education";
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

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        View view = this.A09;
        if (view != null && !view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        this.A03.setTranslationY((-i) - i2);
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
        return this.A02;
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
        int A02 = C0f9.A02(1475214655);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31176DnK.A0S(this);
        this.A00 = requireArguments.getInt("ARG_REPORTING_EDUCATION_TIP_NUMBER", 0);
        this.A08 = AbstractC31173DnH.A0j(requireArguments, "ARG_REPORTING_EDUCATION_TICKET_ID");
        this.A07 = AbstractC31173DnH.A0j(requireArguments, "ARG_REPORTING_EDUCATION_REPORT_TYPE");
        C18C.A0E(requireArguments.containsKey("ARG_REPORTING_EDUCATION_REPORTED_CONTENT_ID"));
        this.A06 = Long.valueOf(requireArguments.getLong("ARG_REPORTING_EDUCATION_REPORTED_CONTENT_ID"));
        requireArguments.getString("ARG_REPORTING_EDUCATION_REPORTED_CONTENT_TYPE");
        this.A04.getClass();
        C0f9.A09(-683195493, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-808511112);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reporting_education_bottom_sheet_fragment);
        C0f9.A09(-1802504051, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        String string;
        int i;
        super.onViewCreated(view, bundle);
        this.A09 = view.requireViewById(R.id.support_detail_reporting_education_scrollview);
        this.A01 = view.requireViewById(R.id.support_detail_reporting_education_body_container);
        this.A03 = AbstractC31172DnG.A0j(view, R.id.support_detail_reporting_education_bottom_button);
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.support_detail_reporting_education_icon);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.support_detail_reporting_education_title_row);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.support_detail_reporting_education_subtitle_row);
        int i2 = this.A00;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    A0I.setImageDrawable(AbstractC56412ia.A00(AbstractC166997dE.A0N(this), R.drawable.instagram_wellbeing_illustrations_reporting_flow_3));
                    AbstractC25227BEk.A12(A0T, this, 2131974985);
                    AbstractC25227BEk.A12(A0T2, this, 2131974984);
                    igdsBottomButtonLayout = this.A03;
                    string = getString(2131974981);
                    i = 63;
                } else {
                    return;
                }
            } else {
                A0I.setImageDrawable(AbstractC56412ia.A00(AbstractC166997dE.A0N(this), R.drawable.instagram_wellbeing_illustrations_reporting_flow_2));
                AbstractC25227BEk.A12(A0T, this, 2131974987);
                AbstractC25227BEk.A12(A0T2, this, 2131974986);
                this.A03.setPrimaryAction(getString(2131956794), ViewOnClickListenerC35682FpH.A00(this, 64));
                AbstractC13880nE.A0U(this.A01, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.bottom_button_layout_height_with_secondary));
                ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
                layoutParams.height = AbstractC31177DnL.A02(this, R.dimen.bottom_button_layout_height_with_secondary);
                this.A03.setLayoutParams(layoutParams);
                this.A03.setSecondaryAction(getString(2131975000), ViewOnClickListenerC35682FpH.A00(this, 65));
                return;
            }
        } else {
            A0I.setImageDrawable(AbstractC56412ia.A00(AbstractC166997dE.A0N(this), R.drawable.instagram_wellbeing_illustrations_reporting_flow_1));
            AbstractC25227BEk.A12(A0T, this, 2131974983);
            String string2 = getString(2131956545);
            SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, string2, 2131974982);
            AnonymousClass773.A05(A08, new C50761MbS(AbstractC08820cl.A03("https://help.instagram.com/477434105621119")), string2);
            AbstractC31176DnK.A1G(A0T2, A08);
            igdsBottomButtonLayout = this.A03;
            string = getString(2131956794);
            i = 64;
        }
        igdsBottomButtonLayout.setPrimaryAction(string, ViewOnClickListenerC35682FpH.A00(this, i));
    }
}
