package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.R;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;

/* loaded from: classes9.dex */
public final class N5C extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteLeadGenCustomerInfoFragment";
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131964931);
        AbstractC50523MSb.A1E(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_lead_gen_customer_info";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A00;
        C52590NOl c52590NOl = (C52590NOl) interfaceC09390do.getValue();
        AbstractC43592JPx.A1Q(c52590NOl.A00, c52590NOl.A04, "lead_gen_customer_info", "customer_info_screen_impression", "impression");
        ((AbstractC51032Mgg) interfaceC09390do.getValue()).A05();
        CompoundButton compoundButton = (CompoundButton) AbstractC166997dE.A0R(view, R.id.phone_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes = LeadGenInfoFieldTypes.A0P;
        compoundButton.setChecked(((AbstractC51032Mgg) interfaceC09390do.getValue()).A01.A01);
        C55518OlC.A00(compoundButton, leadGenInfoFieldTypes, this, 5);
        CompoundButton compoundButton2 = (CompoundButton) AbstractC166997dE.A0R(view, R.id.email_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes2 = LeadGenInfoFieldTypes.A0A;
        compoundButton2.setChecked(((AbstractC51032Mgg) interfaceC09390do.getValue()).A01.A00);
        C55518OlC.A00(compoundButton2, leadGenInfoFieldTypes2, this, 5);
        CompoundButton compoundButton3 = (CompoundButton) AbstractC166997dE.A0R(view, R.id.zip_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes3 = LeadGenInfoFieldTypes.A0a;
        compoundButton3.setChecked(((AbstractC51032Mgg) interfaceC09390do.getValue()).A01.A02);
        C55518OlC.A00(compoundButton3, leadGenInfoFieldTypes3, this, 5);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return ((AbstractC51032Mgg) this.A00.getValue()).A02();
    }

    public N5C() {
        X2v x2v = new X2v(this, 34);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2v(new X2v(this, 31), 32));
        this.A00 = AbstractC25225BEi.A0a(new X2v(A00, 33), x2v, new C57253Pbb(37, null, A00), AbstractC25225BEi.A1D(C52590NOl.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1323291882);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_create_form_checkbox_group, viewGroup, false);
        C0f9.A09(1219492229, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1508134917);
        super.onPause();
        ((AbstractC51032Mgg) this.A00.getValue()).A09(requireContext());
        C0f9.A09(1843346323, A02);
    }
}
