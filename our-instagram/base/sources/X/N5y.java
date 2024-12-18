package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* loaded from: classes9.dex */
public final class N5y extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenFormListFragmentV2";
    public RecyclerView A00;
    public AnonymousClass195 A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970583);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        C55089Oav.A01(C55089Oav.A00(this, interfaceC56362iU), this, 55);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_form_list_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C3F0 c3f0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A02;
        C51009MgG A0j = MSW.A0j(interfaceC09390do);
        OH3 oh3 = A0j.A08;
        String str = A0j.A0B;
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A03(oh3.A00, str, "lead_gen_form_list", "form_list_impression");
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A00 = A0F;
        C3F1 c3f1 = null;
        if (A0F != null) {
            c3f1 = A0F.A0C;
        }
        if ((c3f1 instanceof C3F0) && (c3f0 = (C3F0) c3f1) != null) {
            c3f0.A00 = false;
        }
        if (A0F != null) {
            A0F.setAdapter(new C51126MiV(new ViewOnClickListenerC55461OkG(this, 56), MSW.A0j(interfaceC09390do)));
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C51198Mji.A00(recyclerView, this, 8);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0j(this.A02).A07;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A02;
        if (MSW.A0j(interfaceC09390do).A04) {
            C51009MgG A0j = MSW.A0j(interfaceC09390do);
            OH3 oh3 = A0j.A08;
            String str = A0j.A0B;
            C14360o3.A0B(str, 0);
            InterfaceC58268PsC.A02(oh3.A00, str, "lead_gen_form_list", "cancel");
        }
        MSW.A0j(interfaceC09390do).A04 = true;
        return false;
    }

    public N5y() {
        C57552PgQ A01 = C57552PgQ.A01(this, 18);
        InterfaceC09390do A00 = C57552PgQ.A00(C57552PgQ.A01(this, 15), EnumC09460dv.A02, 16);
        this.A02 = AbstractC25225BEi.A0a(C57552PgQ.A01(A00, 17), A01, C57534Pg8.A00(A00, null, 38), AbstractC25225BEi.A1D(C51009MgG.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(959561629);
        super.onCreate(bundle);
        C51009MgG A0j = MSW.A0j(this.A02);
        A0j.A0D.clear();
        LeadGenBaseFormList leadGenBaseFormList = A0j.A09;
        A0j.A02 = leadGenBaseFormList.A02;
        A0j.A03 = leadGenBaseFormList.A05;
        A0j.A01 = leadGenBaseFormList.A01;
        C51009MgG.A00(A0j, leadGenBaseFormList.A04);
        C0f9.A09(-1724086998, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(338664860);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_form_list_fragment, viewGroup, false);
        C0f9.A09(-180254402, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-958155909);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(-2037145146, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(667204728);
        super.onStart();
        this.A01 = PZH.A01(this, MSW.A0j(this.A02).A0F, 43);
        C0f9.A09(1331647852, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(78624570);
        super.onStop();
        this.A01 = MSY.A0r(this.A01);
        C0f9.A09(1380823852, A02);
    }
}
