package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ENz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32373ENz extends C53Z implements InterfaceC60072op, InterfaceC60122ou, GXA {
    public static final String __redex_internal_original_name = "AccountLinkingChildGroupManagementFragment";
    public C32407EPi A00;
    public FQ8 A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.setTitle(requireActivity().getString(2131952070));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_linking_child_group_management";
    }

    @Override // X.GXA
    public final void DXn(String str, String str2) {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            if (A15.getId().equals(str2)) {
                C9GR.A03(getContext(), getString(2131952065, AbstractC31176DnK.A0q(getSession()), A15.getUsername()), null, 1);
                getSession();
                Long.parseLong(A15.getId());
                UserSession session = getSession();
                String id = A15.getId();
                C25621Ms A0M = AbstractC31173DnH.A0M(session);
                A0M.A0B("multiple_accounts/unlink_from_main_accounts/");
                A0M.A0S(C40781ul.class, C55702hA.class);
                C1GJ.A04(AbstractC31172DnG.A0T(A0M, "main_account_ids", id), 245);
                C95P.A00(getSession(), "account_linking_child_group_management").A01();
                AbstractC25226BEj.A1P(this);
                return;
            }
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List list;
        int A02 = C0f9.A02(-1415752113);
        super.onCreate(bundle);
        this.A00 = new C32407EPi(requireContext(), this, this);
        AccountFamily A0H = AbstractC31176DnK.A0H(C2049995m.A01(getSession()), getSession());
        if (A0H != null) {
            list = A0H.A04;
        } else {
            list = null;
        }
        C32407EPi c32407EPi = this.A00;
        ArrayList arrayList = c32407EPi.A00;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        C32407EPi.A00(c32407EPi);
        this.A01 = new FQ8(getSession());
        C0f9.A09(432970682, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1332168234);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.account_linking_child_group_management_fragment);
        ((AbsListView) A0A.requireViewById(R.id.list_view)).setAdapter((ListAdapter) this.A00);
        C0f9.A09(2143795414, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1562959792);
        super.onDestroy();
        C95P.A00(getSession(), "account_linking_child_group_management").A01();
        C0f9.A09(1854044197, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-806016793);
        super.onStart();
        this.A01.A00(requireActivity(), false);
        C0f9.A09(2079227626, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List emptyList;
        super.onViewCreated(view, bundle);
        if (this.A00.isEmpty()) {
            AbstractC34728FRr.A00(requireContext(), DialogInterfaceOnClickListenerC35452Fk9.A00(this, 3));
        }
        AccountFamily A0H = AbstractC31176DnK.A0H(C2049995m.A01(getSession()), getSession());
        if (A0H != null) {
            emptyList = A0H.A04;
        } else {
            emptyList = Collections.emptyList();
        }
        UserSession session = getSession();
        HashSet hashSet = new HashSet(emptyList.size());
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC25226BEj.A15(it).getId(), hashSet);
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(session), "ig_my_main_account_impression");
        A0f.AAP("account_linking_session_id", String.valueOf(((C34387FEd) session.A01(C34387FEd.class, GTC.A00)).A00));
        A0f.AAL("array_current_main_account_ids", hashSet);
        A0f.Cht();
    }
}
