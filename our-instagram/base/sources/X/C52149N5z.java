package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.N5z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52149N5z extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenEditFormNameFragmentV2";
    public IgFormField A00;
    public boolean A01;
    public AnonymousClass195 A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131964944);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        C55089Oav.A01(C55089Oav.A00(this, interfaceC56362iU), this, 54);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "organic_lead_gen_edit_form_name";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgFormField A0k = AbstractC31172DnG.A0k(view, R.id.form_name);
        this.A00 = A0k;
        if (A0k != null) {
            A0k.setText(((C50933Mf2) this.A03.getValue()).A00);
            A0k.setRuleChecker(new G8K(1, A0k, this));
            A0k.setInputType(49152);
            C55346Oi6.A00(A0k, this, 20).setOnEditorActionListener(new C55536OlV(this, 1));
            A0k.getMEditText().setImeOptions(6);
            A0k.getMEditText().requestFocus();
        }
        C50933Mf2 c50933Mf2 = (C50933Mf2) this.A03.getValue();
        O3T o3t = c50933Mf2.A02;
        String str = c50933Mf2.A04;
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A03(o3t.A00, str, "lead_gen_edit_form_name", "edit_form_screen_impression");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return ((C50933Mf2) this.A03.getValue()).A01;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A01) {
            C50933Mf2 c50933Mf2 = (C50933Mf2) this.A03.getValue();
            O3T o3t = c50933Mf2.A02;
            String str = c50933Mf2.A04;
            C14360o3.A0B(str, 0);
            InterfaceC58268PsC.A02(o3t.A00, str, "lead_gen_edit_form_name", "cancel");
            return false;
        }
        return false;
    }

    public C52149N5z() {
        C57552PgQ A01 = C57552PgQ.A01(this, 10);
        InterfaceC09390do A00 = C57552PgQ.A00(C57552PgQ.A01(this, 7), EnumC09460dv.A02, 8);
        this.A03 = AbstractC25225BEi.A0a(C57552PgQ.A01(A00, 9), A01, C57534Pg8.A00(A00, null, 36), AbstractC25225BEi.A1D(C50933Mf2.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(102762454);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_edit_form_name, viewGroup, false);
        C0f9.A09(-2097138503, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(329322691);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = false;
        C0f9.A09(-1844220845, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-906926491);
        super.onResume();
        IgFormField igFormField = this.A00;
        if (igFormField != null) {
            igFormField.post(new PNH(this));
        }
        C0f9.A09(1222811718, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(316365697);
        super.onStart();
        this.A02 = PZH.A01(this, ((C50933Mf2) this.A03.getValue()).A06, 42);
        C0f9.A09(-889159901, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1879101994);
        super.onStop();
        this.A02 = MSY.A0r(this.A02);
        C0f9.A09(-2124256354, A02);
    }
}
