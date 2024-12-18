package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes9.dex */
public final class N5A extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AggregatedWallFeedFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final String A02;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57168PZm(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 36), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public N5A() {
        DGU dgu = new DGU(this, 16);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGU(new DGU(this, 17), 18));
        this.A00 = AbstractC25225BEi.A0a(new DGU(A00, 19), dgu, new C29895DGj(25, null, A00), AbstractC25225BEi.A1D(C25882Bci.class));
        this.A01 = AbstractC60492pY.A02(this);
        this.A02 = "aggregated_wonder_wall_feed";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952539);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1166161333);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30482DbR(this, 31), 1010132504);
        C0f9.A09(1428844452, A02);
        return A00;
    }
}
