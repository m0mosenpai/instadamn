package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.KBe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45469KBe extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FanClubCreatorGuidanceFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C45469KBe() {
        C37049GUf c37049GUf = new C37049GUf(this, 19);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37049GUf(new C37049GUf(this, 16), 17));
        this.A01 = AbstractC25225BEi.A0a(new C37049GUf(A00, 18), c37049GUf, new C50171MDy(33, null, A00), AbstractC25225BEi.A1D(C44452JlK.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131962155);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1983484758);
        super.onCreate(bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
        MBp.A01(A0Z, AbstractC141776au.A00(A0Z), 8);
        C0f9.A09(-1750637859, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-321520092);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30495Dbe(this, 37), 1312493628);
        C0f9.A09(-1351480502, A02);
        return A00;
    }
}
