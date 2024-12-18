package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.N5p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52140N5p extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AllowedAdPlacementsSettingsFragment";
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A00 = C57509Pfj.A00(this, 3);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131952939);
        interfaceC56362iU.EkT(new ViewOnClickListenerC31724DwT(this, 47), true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "allowed_ad_placements_settings";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0R = AbstractC166997dE.A0R(view, R.id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.recycler_view);
        EPV epv = new EPV(requireContext(), AbstractC166987dD.A0o(this.A01), this);
        AbstractC31178DnM.A0z(this, recyclerView);
        recyclerView.setAdapter(epv);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C51001Mg8) this.A02.getValue()).A00, new C30177DRh(16, this, epv, A0R, recyclerView), 67);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 6), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02);
        AbstractC166987dD.A1Z(new PZX(A0Z, null, 12), AbstractC141776au.A00(A0Z));
        return true;
    }

    public C52140N5p() {
        C57509Pfj c57509Pfj = new C57509Pfj(this, 7);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57509Pfj(new C57509Pfj(this, 4), 5));
        this.A02 = AbstractC25225BEi.A0a(new C57509Pfj(A00, 6), c57509Pfj, new C57255Pbd(23, null, A00), AbstractC25225BEi.A1D(C51001Mg8.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1452069730);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.allowed_ad_placements, false);
        C0f9.A09(-2020683034, A02);
        return A0R;
    }
}
