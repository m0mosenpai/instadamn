package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.N5t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52144N5t extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenCreateFormAdvancedSettingsFragmentV2";
    public AnonymousClass195 A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131964921);
        AbstractC50523MSb.A1E(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "organic_lead_gen_create_form_advanced_settings";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A01;
        C50932Mf1 c50932Mf1 = (C50932Mf1) interfaceC09390do.getValue();
        O3R o3r = c50932Mf1.A01;
        String str = c50932Mf1.A03;
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A03(o3r.A00, str, "lead_gen_advanced_setting", "advanced_setting_screen_impression");
        ViewOnClickListenerC55461OkG.A00(view.requireViewById(R.id.form_name_clickable_area), 42, this);
        AbstractC166997dE.A0T(view, R.id.form_name_text).setText(((C50932Mf1) interfaceC09390do.getValue()).A04);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return ((C50932Mf1) this.A01.getValue()).A00;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C50932Mf1 c50932Mf1 = (C50932Mf1) this.A01.getValue();
        O3R o3r = c50932Mf1.A01;
        String str = c50932Mf1.A03;
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A02(o3r.A00, str, "lead_gen_advanced_setting", "cancel");
        return false;
    }

    public C52144N5t() {
        C57544PgI A01 = C57544PgI.A01(this, 36);
        InterfaceC09390do A00 = C57544PgI.A00(C57544PgI.A01(this, 33), EnumC09460dv.A02, 34);
        this.A01 = AbstractC25225BEi.A0a(C57544PgI.A01(A00, 35), A01, C57534Pg8.A00(A00, null, 30), AbstractC25225BEi.A1D(C50932Mf1.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-678312465);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_advanced_settings, viewGroup, false);
        C0f9.A09(-1814502427, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1246408787);
        super.onStart();
        this.A00 = PZH.A01(this, ((C50932Mf1) this.A01.getValue()).A06, 39);
        C0f9.A09(1237995314, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-277202676);
        super.onStop();
        this.A00 = MSY.A0r(this.A00);
        C0f9.A09(-1965800881, A02);
    }
}
