package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.ENw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32370ENw extends C53Z implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ProfessionalAccountSelectionFragment";
    public Activity A00;
    public InterfaceC37222GaX A01;
    public C31803DyN A02;
    public String A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "professional_account_selection";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C31803DyN c31803DyN = this.A02;
        c31803DyN.A00.Cid(new Y7A("personal_or_professional_account_selection", c31803DyN.A01, null, null, null, null, null, null));
        ((BusinessConversionActivity) this.A01).EL3(null);
        return true;
    }

    private void A00(Drawable drawable, LayoutInflater layoutInflater, ViewGroup viewGroup, String str, String str2, boolean z) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.account_type_card);
        viewGroup.addView(A0A);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.card_title);
        TextView A0T2 = AbstractC166997dE.A0T(A0A, R.id.card_subtitle);
        ImageView A0I = AbstractC31173DnH.A0I(A0A, R.id.card_icon);
        TextView A0T3 = AbstractC166997dE.A0T(A0A, R.id.card_cta);
        A0T.setText(str);
        A0T2.setText(str2);
        A0I.setImageDrawable(drawable);
        C0fQ.A00(new ViewOnClickListenerC35669Fp4(1, this, z), A0A);
        StringBuilder A11 = AbstractC166997dE.A11(str);
        A11.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A11.append(str2);
        A11.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0A.setContentDescription(AbstractC166997dE.A0v(A0T3.getText(), A11));
        AbstractC56952jT.A01(A0A);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        InterfaceC37222GaX A01 = AbstractC35211Fg4.A01(this);
        A01.getClass();
        this.A01 = A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-676310747);
        super.onCreate(bundle);
        this.A00 = requireActivity();
        String A0b = AbstractC31180DnO.A0b(this);
        A0b.getClass();
        this.A03 = A0b;
        this.A02 = (C31803DyN) new C52942bb(new EWT(this.A01, getSession(), this.A03), this).A00(C31803DyN.class);
        C0f9.A09(-16143230, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2035307516);
        View inflate = layoutInflater.inflate(R.layout.account_type_selection_fragment, viewGroup, false);
        TextView A06 = AbstractC31180DnO.A06(inflate);
        A06.setText(2131955170);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A06.getLayoutParams();
        marginLayoutParams.bottomMargin = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        A06.setLayoutParams(marginLayoutParams);
        ViewGroup A0F = AbstractC31173DnH.A0F(inflate, R.id.cards_container);
        A00(requireContext().getDrawable(R.drawable.instagram_media_account_pano_outline_24), layoutInflater, A0F, getString(2131952115), getString(2131952114), true);
        A00(requireContext().getDrawable(R.drawable.instagram_user_pano_outline_24), layoutInflater, A0F, getString(2131952113), getString(2131952112), false);
        View requireViewById = inflate.requireViewById(R.id.cross_button);
        requireContext();
        ViewOnClickListenerC35690FpP.A01(requireViewById, 33, this);
        C0f9.A09(65905087, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C31803DyN c31803DyN = this.A02;
        c31803DyN.A00.Clo(new Y7A("personal_or_professional_account_selection", c31803DyN.A01, null, null, null, null, null, null));
    }
}
