package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N5I extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenConsumerInitializationFragment";
    public AnonymousClass195 A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "organic_lead_gen_consumer_initialization";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return ((C50956MfP) this.A01.getValue()).A02;
    }

    public N5I() {
        C57544PgI A01 = C57544PgI.A01(this, 28);
        InterfaceC09390do A00 = C57544PgI.A00(C57544PgI.A01(this, 25), EnumC09460dv.A02, 26);
        this.A01 = AbstractC25225BEi.A0a(C57544PgI.A01(A00, 27), A01, C57534Pg8.A00(A00, null, 28), AbstractC25225BEi.A1D(C50956MfP.class));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1502182577);
        super.onCreate(bundle);
        EVO.A01(this);
        C50956MfP c50956MfP = (C50956MfP) this.A01.getValue();
        OMD omd = c50956MfP.A04;
        String str = c50956MfP.A06;
        String str2 = c50956MfP.A08;
        AbstractC167007dF.A1K(str, str2);
        C25621Ms A0c = AbstractC167017dG.A0c(omd.A00);
        A0c.A0B("lead_gen/get_lead_form_v2/");
        A0c.A9s("business_igid", str);
        A0c.A9s("entrypoint", str2);
        AbstractC25232BEp.A1J(c50956MfP, new PZM(c50956MfP, null, 13), PZS.A01(PZS.A00(AbstractC31172DnG.A0R(null, A0c, H9B.class, C41318IQo.class, false).A03(2079920282), 22), 23));
        C0f9.A09(-1041856321, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1329447045);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_consumer_initialization_view, viewGroup, false);
        C0f9.A09(-790884051, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(596728286);
        super.onStart();
        this.A00 = PZH.A01(this, ((C50956MfP) this.A01.getValue()).A0A, 38);
        C0f9.A09(-267229381, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1291840910);
        super.onStop();
        this.A00 = MSY.A0r(this.A00);
        C0f9.A09(1285364171, A02);
    }
}
