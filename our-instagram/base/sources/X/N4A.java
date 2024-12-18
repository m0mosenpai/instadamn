package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N4A extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LeadGenConfirmationBottomSheetFragment";
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_confirmation_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.confirmation_title);
        InterfaceC09390do interfaceC09390do = this.A00;
        A0T.setText(((C50892MeN) interfaceC09390do.getValue()).A02);
        AbstractC166997dE.A0T(view, R.id.confirmation_description).setText(((C50892MeN) interfaceC09390do.getValue()).A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return ((C50892MeN) this.A00.getValue()).A00;
    }

    public N4A() {
        C57554PgS A01 = C57554PgS.A01(this, 34);
        InterfaceC09390do A00 = C57554PgS.A00(C57554PgS.A01(this, 31), EnumC09460dv.A02, 32);
        this.A00 = AbstractC25225BEi.A0a(C57554PgS.A01(A00, 33), A01, C57534Pg8.A00(A00, null, 13), AbstractC25225BEi.A1D(C50892MeN.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-952092097);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_lead_gen_confirmation_bottom_sheet, false);
        C0f9.A09(-1721182772, A02);
        return A0R;
    }
}
