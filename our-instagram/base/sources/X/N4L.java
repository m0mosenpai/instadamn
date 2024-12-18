package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;

/* loaded from: classes9.dex */
public final class N4L extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IgLiveSchedulingManagementFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_live_scheduling_management";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56342iS.A01(new Ok4(this, 59), AbstractC31176DnK.A0C(requireView(), R.id.action_bar_container)).A0X(new C70568Wd2(this, 4));
        OBE obe = new OBE(requireContext(), AbstractC166987dD.A0r(this.A00), new O66(this));
        View requireViewById = requireView().requireViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setAdapter(obe.A01);
        AbstractC31174DnI.A16(requireContext(), recyclerView, 1, false);
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        recyclerView.setItemAnimator(c70623Ez);
        C14360o3.A07(requireViewById);
        View requireViewById2 = requireView().requireViewById(R.id.empty_state);
        IgdsEmptyState igdsEmptyState = (IgdsEmptyState) requireViewById2;
        igdsEmptyState.setAction(requireContext().getString(2131965508), new Ok4(this, 61));
        C14360o3.A07(requireViewById2);
        InterfaceC09390do interfaceC09390do = this.A02;
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C50946MfF) interfaceC09390do.getValue()).A00, new C30184DRp(35, igdsEmptyState, obe, recyclerView), 36);
        JQ0.A11(this, C57167PZl.A01(this, null, 27), ((C50946MfF) interfaceC09390do.getValue()).A04);
        C50946MfF c50946MfF = (C50946MfF) interfaceC09390do.getValue();
        c50946MfF.A05.Egh(c50946MfF.A01.A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public N4L() {
        C57550PgO A01 = C57550PgO.A01(this, 12);
        InterfaceC09390do A00 = C57550PgO.A00(C57550PgO.A01(this, 9), EnumC09460dv.A02, 10);
        this.A02 = AbstractC25225BEi.A0a(C57550PgO.A01(A00, 11), A01, C57530Pg4.A00(null, A00, 27), AbstractC25225BEi.A1D(C50946MfF.class));
        this.A01 = AbstractC09440dt.A01(C57550PgO.A01(this, 8));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1272379596);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.live_scheduling_management_fragment, false);
        C0f9.A09(-1985520646, A02);
        return A0R;
    }
}
