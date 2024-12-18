package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public final class C0M extends AbstractC26782Bs6 {
    public static final String __redex_internal_original_name = "OpalAudienceSelectorFragment";
    public boolean A00 = true;
    public final InterfaceC09390do A01;

    @Override // X.AbstractC26782Bs6, X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Ehk(getString(2131969011));
        super.configureActionBar(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "opal_audience_selector_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 3), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC26782Bs6
    public final void A08(boolean z) {
        C56352iT.A0t.A03(requireActivity()).A0Z(z);
        super.A08(z);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(super.A00);
    }

    public C0M() {
        C57510Pfk c57510Pfk = new C57510Pfk(this, 44);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57510Pfk(new C57510Pfk(this, 41), 42));
        this.A01 = AbstractC25225BEi.A0a(new C57510Pfk(A00, 43), c57510Pfk, new C57255Pbd(12, null, A00), AbstractC25225BEi.A1D(C25807BbO.class));
    }

    @Override // X.AbstractC26782Bs6, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-167646687);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 != null) {
            z = bundle2.getBoolean(AbstractC111324zv.A00(1941), true);
        }
        this.A00 = z;
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = super.A00;
        AbstractC34277F9x.A00(this, AbstractC166987dD.A0r(interfaceC09390do), "surface_appear", "empty", "edit_audience", AbstractC166987dD.A0r(interfaceC09390do).userId, null);
        C0f9.A09(1077649509, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1418854703);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A04(new C30496Dbf(this, 42), 1201722553, true), true, false);
        C0f9.A09(1082182010, A02);
        return A022;
    }

    @Override // X.AbstractC26782Bs6, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2060586521);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = super.A00;
        AbstractC34277F9x.A00(this, AbstractC166987dD.A0r(interfaceC09390do), "surface_disappear", "empty", "edit_audience", AbstractC166987dD.A0r(interfaceC09390do).userId, null);
        C0f9.A09(37379863, A02);
    }
}
