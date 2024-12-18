package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes6.dex */
public final class ENS extends AbstractC60672pq implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CommentPollVotersListFragment";
    public EQM A00;
    public C31543DtT A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final C36772GIv A0A;
    public final C36755GIc A0B;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = getRecyclerView();
        C31543DtT c31543DtT = this.A01;
        if (c31543DtT == null) {
            C14360o3.A0F("paginationHelper");
            throw C00O.createAndThrow();
        }
        recyclerView.A14(c31543DtT);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 39), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(ENS ens) {
        EQM eqm = ens.A00;
        if (eqm == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        eqm.A0C = false;
        AbstractC31177DnL.A18(ens, C56352iT.A0t, false);
        AbstractC31557Dth.A01(ens, false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return ((InterfaceC11380iw) this.A03.getValue()).getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public ENS() {
        C37057GUn c37057GUn = new C37057GUn(this, 37);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37057GUn(new C37057GUn(this, 34), 35));
        this.A09 = AbstractC25225BEi.A0a(new C37057GUn(A00, 36), c37057GUn, new C57532Pg6(0, null, A00), AbstractC25225BEi.A1D(C31830Dyo.class));
        this.A03 = C37057GUn.A00(this, 30);
        this.A02 = C37057GUn.A00(this, 29);
        this.A04 = C37057GUn.A00(this, 31);
        this.A08 = C37057GUn.A00(this, 33);
        this.A05 = C1XM.A00(C37046GUc.A00);
        this.A06 = C37057GUn.A00(this, 32);
        this.A0B = new C36755GIc(this);
        this.A0A = new C36772GIv(this, 3);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1H(interfaceC56362iU);
        AbstractC31175DnJ.A1I(interfaceC56362iU, requireContext().getString(2131969737));
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1640182213);
        super.onCreate(bundle);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C36772GIv c36772GIv = this.A0A;
        InterfaceC09390do interfaceC09390do = this.A07;
        this.A01 = new C31543DtT(this, AbstractC166987dD.A0r(interfaceC09390do), c36772GIv);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A03.getValue();
        C36755GIc c36755GIc = this.A0B;
        AbstractC25233BEq.A0w(2, A0r, interfaceC11380iw, c36755GIc);
        C31543DtT c31543DtT = this.A01;
        if (c31543DtT != null) {
            EQM eqm = new EQM(requireContext, null, null, interfaceC11380iw, A0r, null, c31543DtT, null, c36755GIc, null, null, null, null, null, false, false, false, false, false, true, false, false, true);
            this.A00 = eqm;
            setAdapter(eqm);
            boolean A1Z = AbstractC167007dF.A1Z(this.A08);
            EQM eqm2 = this.A00;
            if (A1Z) {
                if (eqm2 != null) {
                    eqm2.A0C = false;
                    eqm2.A0D = true;
                    eqm2.A03();
                    C0f9.A09(-676828003, A02);
                    return;
                }
                C14360o3.A0F("adapter");
            } else {
                if (eqm2 != null) {
                    eqm2.A0C = true;
                    C31830Dyo c31830Dyo = (C31830Dyo) this.A09.getValue();
                    String A15 = AbstractC25225BEi.A15(this.A02);
                    String A152 = AbstractC25225BEi.A15(this.A04);
                    C31543DtT c31543DtT2 = this.A01;
                    if (c31543DtT2 != null) {
                        c31830Dyo.A00(c31543DtT2, A15, A152);
                        C0f9.A09(-676828003, A02);
                        return;
                    }
                }
                C14360o3.A0F("adapter");
            }
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("paginationHelper");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-307788651);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_recyclerview_with_progress, false);
        C0f9.A09(134983800, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1641439480);
        super.onDestroy();
        EQM eqm = this.A00;
        if (eqm == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        C161887My c161887My = eqm.A06;
        if (c161887My != null) {
            c161887My.A01();
        }
        C0f9.A09(1679029081, A02);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31179DnN.A12(recyclerView);
        recyclerView.A0S = true;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C3DN A00;
        Fragment A09;
        int A02 = C0f9.A02(534435885);
        super.onResume();
        C3DO c3do = C3DN.A00;
        C3DN A002 = c3do.A00(requireActivity());
        if (A002 != null && ((C3DP) A002).A0h && (A00 = c3do.A00(requireActivity())) != null && (A09 = A00.A09()) != null) {
            ((BottomSheetFragment) A09).A0T(0);
        }
        C0f9.A09(-393153900, A02);
    }
}
