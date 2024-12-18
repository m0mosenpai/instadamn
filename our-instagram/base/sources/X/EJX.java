package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.lang.ref.Reference;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EJX extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "GlobalBlocksFragment";
    public UserSession A00;
    public FQZ A01;
    public RecyclerView A02;
    public C66362zD A03;
    public final GX0 A07 = new C36746GHp(this);
    public final InterfaceC62612t0 A06 = new G7M(this, 9);
    public final View.OnClickListener A05 = ViewOnClickListenerC35682FpH.A00(this, 38);
    public final View.OnClickListener A04 = ViewOnClickListenerC35682FpH.A00(this, 37);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963152);
        if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A00, 36311672155144922L)) {
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A06 = R.drawable.instagram_add_pano_outline_24;
            A0B.A05 = 2131972993;
            AbstractC31176DnK.A1B(this.A04, A0B, interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "blocked_list";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = AbstractC31172DnG.A0G(view, R.id.global_blocks_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        RecyclerView recyclerView = this.A02;
        C14360o3.A0A(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.A02;
        C14360o3.A0A(recyclerView2);
        recyclerView2.setAdapter(this.A03);
        RecyclerView recyclerView3 = this.A02;
        C14360o3.A0A(recyclerView3);
        recyclerView3.A14(new C153156uj(linearLayoutManager, this.A06, C153146ui.A0A, false, false));
        FQZ fqz = this.A01;
        C14360o3.A0A(fqz);
        if (!fqz.A01) {
            C34946FaW c34946FaW = fqz.A07;
            c34946FaW.A00.clear();
            c34946FaW.A01.clear();
            fqz.A00();
            fqz.A01 = true;
        }
    }

    public final void A00(ViewModelListUpdate viewModelListUpdate) {
        if (isAdded()) {
            C66362zD c66362zD = this.A03;
            C14360o3.A0A(c66362zD);
            c66362zD.A05(viewModelListUpdate);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-903076197);
        super.onCreate(bundle);
        this.A00 = AbstractC31177DnL.A0R(this);
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A00;
        C14360o3.A0A(userSession);
        this.A01 = new FQZ(requireContext, requireActivity, userSession, this);
        Context requireContext2 = requireContext();
        UserSession userSession2 = this.A00;
        C14360o3.A0A(userSession2);
        FOI foi = new FOI(requireContext2, this, EnumC33486ErL.BLOCKED_ACCOUNTS, this, userSession2, null, "blocked_list_user_row", "blocked_accounts_list", "blocked_accounts_list");
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new EXV(requireContext(), this, foi));
        A0R.A01(new C52348NEm(this.A07));
        A0R.A01(new Object());
        A0R.A01(new EXE(this.A05));
        this.A03 = AbstractC31173DnH.A0R(A0R, new Object());
        C0f9.A09(-1437744829, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2007198768);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.global_blocks_fragment, viewGroup, false);
        C0f9.A09(1357587765, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(853577452);
        super.onDestroyView();
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(null);
            RecyclerView recyclerView2 = this.A02;
            C14360o3.A0A(recyclerView2);
            recyclerView2.setAdapter(null);
            RecyclerView recyclerView3 = this.A02;
            C14360o3.A0A(recyclerView3);
            recyclerView3.A0a();
            this.A02 = null;
        }
        C0f9.A09(-37825919, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(500071817);
        super.onPause();
        FQZ fqz = this.A01;
        C14360o3.A0A(fqz);
        C34946FaW c34946FaW = fqz.A07;
        C34482FHu c34482FHu = fqz.A05;
        Iterator it = c34946FaW.A02.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null || obj == c34482FHu) {
                it.remove();
            }
        }
        C0f9.A09(-812361161, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1786310552);
        super.onResume();
        FQZ fqz = this.A01;
        C14360o3.A0A(fqz);
        C34946FaW c34946FaW = fqz.A07;
        c34946FaW.A02.add(AbstractC25225BEi.A16(fqz.A05));
        FMW fmw = fqz.A04;
        if (!fmw.A02) {
            fqz.A08.A00(fqz.A06.A00(fmw, AbstractC31173DnH.A0L(c34946FaW.A00)));
        }
        C0f9.A09(1039913311, A02);
    }
}
