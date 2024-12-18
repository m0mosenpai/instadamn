package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* loaded from: classes9.dex */
public final class N67 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenManageFormsFragmentV2";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public IgdsBottomButtonLayout A04;
    public IgRadioGroup A05;
    public AnonymousClass195 A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public static final void A00(N67 n67, boolean z, boolean z2) {
        C6WQ A0i = AbstractC31174DnI.A0i(n67.requireContext());
        MSX.A0w(n67.requireContext(), A0i, 2131969964);
        A0i.setCancelable(false);
        C51011MgI A01 = n67.A01();
        A01.A09.A06(A01.A0B, AbstractC50523MSb.A0V(A01.A08), A01.A0C, z, z2);
        AbstractC31174DnI.A1E(n67.getViewLifecycleOwner(), ((C50876Me7) n67.A07.getValue()).A00, new C37487Gf5(n67, A0i, 3, z2, z), 51);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String string;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (A01().A0A == EnumC53251Ngp.A04) {
            string = "";
        } else {
            string = getString(2131964997);
            C14360o3.A0A(string);
        }
        interfaceC56362iU.setTitle(string);
        AbstractC50523MSb.A1E(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_manage_forms_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view.requireViewById(R.id.lead_form_list_loading_spinner);
        this.A00 = view.requireViewById(R.id.lead_gen_fragment_content);
        this.A05 = (IgRadioGroup) view.requireViewById(R.id.lead_form_radio_group);
        this.A03 = view.requireViewById(R.id.see_all_row);
        this.A04 = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), A01().A04, new C57743PjW(this, 42), 51);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), A01().A05, new C50362MLo(29, view, this), 51);
    }

    public final C51011MgI A01() {
        return (C51011MgI) this.A08.getValue();
    }

    public N67() {
        C57552PgQ A01 = C57552PgQ.A01(this, 34);
        C57552PgQ A012 = C57552PgQ.A01(this, 27);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57552PgQ.A00(A012, enumC09460dv, 28);
        this.A08 = AbstractC25225BEi.A0a(C57552PgQ.A01(A00, 29), A01, C57534Pg8.A00(A00, null, 41), AbstractC25225BEi.A1D(C51011MgI.class));
        C57552PgQ A013 = C57552PgQ.A01(this, 33);
        InterfaceC09390do A002 = C57552PgQ.A00(C57552PgQ.A01(this, 30), enumC09460dv, 31);
        this.A07 = AbstractC25225BEi.A0a(C57552PgQ.A01(A002, 32), A013, C57534Pg8.A00(A002, null, 42), AbstractC25225BEi.A1D(C50876Me7.class));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A01().A06;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C51011MgI A01 = A01();
        C55017OWq c55017OWq = A01.A07;
        String str = A01.A0C;
        InterfaceC58268PsC.A02(C55017OWq.A00(c55017OWq, str), str, "lead_gen_manage_lead_forms_and_cta", "cancel");
        return A01().A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1065172241);
        super.onCreate(bundle);
        C51011MgI A01 = A01();
        A01.A00 = A01.A08.A00;
        C51011MgI A012 = A01();
        FragmentActivity requireActivity = requireActivity();
        String str = A012.A02;
        if (str != null) {
            C51011MgI.A00(A012, str);
        } else {
            C70187WFq.A02(requireActivity, AbstractC018607g.A00(requireActivity), new C55871OrL(A012, 1), A012.A06, false);
        }
        C0f9.A09(-561481409, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1047160554);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_manage_forms_fragment, viewGroup, false);
        C0f9.A09(-322918151, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1206651932);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A03 = null;
        this.A01 = null;
        this.A04 = null;
        C0f9.A09(-1765566570, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1036343881);
        super.onStart();
        this.A06 = PZH.A01(this, A01().A0E, 44);
        C0f9.A09(910413885, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1519411921);
        super.onStop();
        this.A06 = MSY.A0r(this.A06);
        C0f9.A09(-1691309406, A02);
    }
}
