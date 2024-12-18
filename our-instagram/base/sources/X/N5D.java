package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes9.dex */
public final class N5D extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PublisherControlBlockedCategoriesComposeFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(getString(2131963840));
        interfaceC56362iU.EkT(new ViewOnClickListenerC28666ClE(this, 14), true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "publisher_control_blocked_categories_compose_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 9), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public N5D() {
        C57509Pfj c57509Pfj = new C57509Pfj(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57509Pfj(new C57509Pfj(this, 30), 31));
        this.A02 = AbstractC25225BEi.A0a(new C57509Pfj(A00, 32), c57509Pfj, new C57255Pbd(27, null, A00), AbstractC25225BEi.A1D(C50975Mfi.class));
        this.A00 = C57509Pfj.A00(this, 29);
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2061257748);
        super.onCreate(bundle);
        ((MTJ) this.A00.getValue()).A00.A04();
        C0f9.A09(1504840963, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-367181447);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 5), 268779033);
        C0f9.A09(-1464080572, A02);
        return A00;
    }
}
