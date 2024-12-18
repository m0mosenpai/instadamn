package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EJG extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CampaignListFragment";
    public C66362zD A00;
    public InterfaceC16820sZ A01 = new C37013GSs(this, 36);
    public LE1 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "inbox_campaign_list_fragment";
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        LE1 le1 = new LE1(this, AbstractC166987dD.A0r(interfaceC09390do));
        this.A02 = le1;
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        LE1.A00(le1, "igd_campaign_list_impression", c16920sk);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.direct_inbox_campaign_recycler_view);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 1);
        A0R.A01(new C67989V5e(this, A0r, new LE1(this, A0r)));
        C66362zD A0R2 = AbstractC31173DnH.A0R(A0R, new Object());
        this.A00 = A0R2;
        recyclerView.setAdapter(A0R2);
        AbstractC31174DnI.A16(requireContext(), recyclerView, 1, false);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCI(viewLifecycleOwner, c07s, this, null, 20), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public EJG() {
        C37013GSs c37013GSs = new C37013GSs(this, 35);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37013GSs(new C37013GSs(this, 32), 33));
        this.A04 = AbstractC25225BEi.A0a(new C37013GSs(A00, 34), c37013GSs, new C50170MDx(19, null, A00), AbstractC25225BEi.A1D(C31806DyQ.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(requireContext().getString(2131964405));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1321374213);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A04);
        GSR.A02(A0Z, AbstractC141776au.A00(A0Z), 33);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_list_layout, false);
        C0f9.A09(-163552025, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2033126617);
        super.onResume();
        if (AbstractC72723Nt.A00(requireContext())) {
            AbstractC145016gM.A05(requireActivity(), AbstractC166987dD.A0r(this.A03), !AbstractC13440mV.A07());
        }
        C0f9.A09(1735285462, A02);
    }
}
