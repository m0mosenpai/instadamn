package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;

/* renamed from: X.KDi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45517KDi extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ThreadCapabilityOverrideFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_dev_thread_capability_override_fragment";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A01;
        AbstractC43593JPy.A1E(this, AbstractC31172DnG.A0E(((C44519JmP) interfaceC09390do.getValue()).A02), new C50261MHq(this, 31), 40);
        ((C44519JmP) interfaceC09390do.getValue()).A00();
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new C45612KHb(this));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C50343MKv.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C45517KDi() {
        C37054GUk c37054GUk = new C37054GUk(this, 16);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37054GUk(new C37054GUk(this, 13), 14));
        this.A01 = AbstractC25225BEi.A0a(new C37054GUk(A00, 15), c37054GUk, new C50171MDy(13, null, A00), AbstractC25225BEi.A1D(C44519JmP.class));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131971464);
    }
}
