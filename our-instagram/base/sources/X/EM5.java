package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes6.dex */
public final class EM5 extends AbstractC59962oe implements InterfaceC62612t0, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SaveSelectCollectionFragment";
    public C31878Dzk A00;
    public RecyclerView A01;
    public C153156uj A02;
    public GFJ A03;
    public final List A05 = AbstractC16960so.A1Q(EnumC33416Epn.A05, EnumC33416Epn.A0A);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "save_collection_picker_dropdown";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView A08 = AbstractC31180DnO.A08(view);
        C31878Dzk c31878Dzk = this.A00;
        if (c31878Dzk == null) {
            str = "adapter";
        } else {
            A08.setAdapter(c31878Dzk);
            A08.setLayoutManager(linearLayoutManager);
            A08.setItemAnimator(null);
            this.A01 = A08;
            C153156uj c153156uj = new C153156uj(linearLayoutManager, this, C153146ui.A0A, false, false);
            this.A02 = c153156uj;
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.A14(c153156uj);
            }
            GFJ gfj = this.A03;
            if (gfj == null) {
                str = "savedCollectionsFetcher";
            } else {
                gfj.A02(true, true);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        GFJ gfj = this.A03;
        if (gfj == null) {
            C14360o3.A0F("savedCollectionsFetcher");
            throw C00O.createAndThrow();
        }
        gfj.A01();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131972790);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2081717735);
        super.onCreate(bundle);
        GFI gfi = new GFI(this, 1);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A04;
        this.A03 = new GFJ(requireContext, AbstractC018607g.A00(this), this, AbstractC166987dD.A0r(interfaceC09390do), gfi, this.A05, AbstractC009903n.A0J(EnumC33380EpD.values()), null);
        this.A00 = new C31878Dzk(this, AbstractC166987dD.A0r(interfaceC09390do), this);
        C0f9.A09(1771371103, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-56212983);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_save_select_collection_list, false);
        C0f9.A09(1046441675, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView;
        int A02 = C0f9.A02(-273932552);
        super.onDestroyView();
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(null);
            recyclerView2.setLayoutManager(null);
        }
        C153156uj c153156uj = this.A02;
        if (c153156uj != null && (recyclerView = this.A01) != null) {
            recyclerView.A15(c153156uj);
        }
        this.A02 = null;
        this.A01 = null;
        C0f9.A09(-1019277215, A02);
    }
}
