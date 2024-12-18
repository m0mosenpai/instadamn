package X;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Q7t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58764Q7t extends Fragment {
    public C60611RDg A00;
    public Q8Z A01;

    private void A00(View.OnClickListener onClickListener, View view, CompoundButton compoundButton, C2GT c2gt) {
        AbstractC010103p.A0B(compoundButton, new UEP(this, 1));
        c2gt.A06(this, new C63626SqY(11, this, compoundButton, new C63534Sp1(onClickListener, compoundButton, c2gt, this)));
        ViewOnClickListenerC63509Soc.A00(view, 16, onClickListener, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1289893173);
        super.onCreate(bundle);
        this.A00 = (C60611RDg) C2FP.A03().A03(getActivity(), C60611RDg.class);
        Q8Z q8z = (Q8Z) new C52942bb(C2FP.A03().A00(), this).A00(Q8Z.class);
        this.A01 = q8z;
        Bundle requireArguments = requireArguments();
        q8z.A00 = requireArguments;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("PAYMENT_TYPE", Q8Z.A00(q8z));
        A0b.putParcelable("logger_data", requireArguments.getParcelable("logger_data"));
        C2FP.A03().A04(A0b);
        C0f9.A09(-66663034, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1165451118);
        C60611RDg c60611RDg = this.A00;
        InterfaceC65381TjE interfaceC65381TjE = c60611RDg.A01;
        View A0A = AbstractC31172DnG.A0A(((T34) interfaceC65381TjE).A00, viewGroup, c60611RDg.A00);
        C14360o3.A07(A0A);
        C0f9.A09(1154918035, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        TextView A0T = AbstractC166997dE.A0T(view, R.id.setting_section_title);
        A0T.setText(getString(2131962335));
        if (A0T.getVisibility() == 0 && requireArguments().getBoolean("should_hide_title")) {
            A0T.setVisibility(8);
        }
        Q8Z q8z = this.A01;
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.setting_pin_switch_title);
        A0T2.setText(2131962295);
        UserSession A0T3 = AbstractC58318PtA.A0T();
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, A0T3, 36320459658109446L)) {
            A0T2.setText(C18U.A04(c06090Tz, AbstractC58318PtA.A0T(), 36883409611588106L));
        }
        TextView A0T4 = AbstractC166997dE.A0T(view, R.id.pin_subtitle);
        if (C18U.A06(c06090Tz, AbstractC58318PtA.A0T(), 36320459658109446L)) {
            A0T4.setText(C18U.A04(c06090Tz, AbstractC58318PtA.A0T(), 36883409611653643L));
        } else {
            A0T4.setText(2131962294);
        }
        View findViewById = view.findViewById(R.id.pin_locked_error);
        C2GT c2gt = q8z.A01;
        C63627SqZ.A01(this, c2gt, new C63625SqX(12, findViewById, this), 45);
        CompoundButton compoundButton = (CompoundButton) view.requireViewById(R.id.setting_pin_switch);
        A00(new ViewOnClickListenerC63509Soc(17, compoundButton, this), view.findViewById(R.id.setting_pin_row), compoundButton, TW3.A00(c2gt, this, 11));
        Q8Z q8z2 = this.A01;
        View findViewById2 = view.findViewById(R.id.setting_bio_row);
        CompoundButton compoundButton2 = (CompoundButton) view.requireViewById(R.id.setting_bio_switch);
        TextView A0T5 = AbstractC166997dE.A0T(view, R.id.setting_bio_switch_title);
        A0T5.setText(2131962292);
        TextView A0T6 = AbstractC166997dE.A0T(view, R.id.bio_subtitle);
        int i2 = 2131962291;
        if (AbstractC58319PtB.A1O()) {
            i2 = 2131966639;
        }
        C60611RDg c60611RDg = this.A00;
        TypedValue typedValue = new TypedValue();
        if (c60611RDg.getContext().getTheme().resolveAttribute(R.attr.pinBioSettingOtherAppsName, typedValue, true) && (i = typedValue.resourceId) != 0) {
            str = c60611RDg.getContext().getResources().getString(i);
        } else {
            str = "";
        }
        A0T6.setText(getString(i2, str));
        C2GT c2gt2 = q8z2.A06.A02;
        c2gt2.A06(this, new C70309WQp(1, findViewById2, compoundButton2, A0T5, A0T6, this));
        q8z2.A01.A06(this, new C63625SqX(13, view.findViewById(R.id.bio_pin_locked_error), this));
        A00(new ViewOnClickListenerC63509Soc(15, compoundButton2, this), view.findViewById(R.id.setting_bio_row), compoundButton2, TW3.A00(c2gt2, this, 10));
        Q8Z q8z3 = this.A01;
        View requireViewById = view.requireViewById(R.id.change_reset_pin);
        C63627SqZ.A01(this, q8z3.A01, new C63617SqP(2, view.findViewById(R.id.change_pin_divider_top), requireViewById, this, view.findViewById(R.id.change_pin_divider_bottom)), 45);
        ViewOnClickListenerC63508Sob.A01(requireViewById, 37, this);
        C2FP.A03().A01.Chz("fbpay_security_page_display", SSA.A01(requireArguments()));
        View requireViewById2 = view.requireViewById(R.id.progress_bar_layout);
        C63627SqZ.A01(this, this.A01.A04, C63628Sqa.A00(this, 58), 44);
        C63627SqZ.A01(this, this.A01.A06.A05, C63628Sqa.A00(this, 59), 44);
        this.A01.A02.A06(this, new C63625SqX(11, requireViewById2, this));
        C63627SqZ.A01(this, this.A01.A05, C63628Sqa.A00(this, 60), 44);
        Bundle requireArguments = requireArguments();
        if (bundle == null && requireArguments.getBoolean("should_log_view_load_success")) {
            LinkedHashMap A08 = AbstractC58442PvL.A08(AbstractC58319PtB.A0W(requireArguments));
            C63307ShD.A02("view_name", "security_settings", A08).Chz("client_load_view_success", A08);
        }
    }
}
