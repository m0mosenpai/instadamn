package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EOB extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ChannelXpostingSelectionFragment";
    public final InterfaceC09390do A01 = C1XM.A00(new C37014GSt(this, 8));
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(new C37014GSt(this, 7), new C37014GSt(this, 9), new C50172MDz(35, null, this), AbstractC25225BEi.A1D(C31817Dyb.class));
    public final FFM A03 = new FFM(this);
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A02;
        AbstractC31174DnI.A1E(this, ((C31817Dyb) interfaceC09390do.getValue()).A02, new GWH(this, 24), 17);
        C31817Dyb c31817Dyb = (C31817Dyb) interfaceC09390do.getValue();
        String A15 = AbstractC25225BEi.A15(this.A01);
        C14360o3.A0B(A15, 0);
        C05A c05a = c31817Dyb.A05;
        if (c05a.getValue() != EnumC33334EoT.A04) {
            c05a.Egh(EnumC33334EoT.A02);
            InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(c31817Dyb.A01);
            c31817Dyb.A01 = AbstractC25226BEj.A1L(new PYc(c31817Dyb, A15, A0s, 24), AbstractC141776au.A00(c31817Dyb));
        }
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new EXI(this, this.A03));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(GVS.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131959074);
    }
}
