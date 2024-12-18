package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ELQ extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, GZD, InterfaceC37294Gbv {
    public static final String __redex_internal_original_name = "ReelViewerSettingsFragment";
    public LinearLayoutManager A00;
    public UserSession A01;
    public IgdsInlineSearchBox A02;
    public EQ5 A03;
    public C65974TxR A04;
    public final C169487hO A06 = new C169487hO();
    public String A05 = "";

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(5199);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        EQ5 eq5 = this.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A15 = AbstractC166997dE.A15(eq5.A07);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (AbstractC166987dD.A1a(A1K.getValue())) {
                AbstractC31173DnH.A1X((User) A1K.getKey(), A1E);
            }
        }
        EQ5 eq52 = this.A03;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator A152 = AbstractC166997dE.A15(eq52.A07);
        while (A152.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
            if (!AbstractC166987dD.A1a(A1K2.getValue())) {
                AbstractC31173DnH.A1X((User) A1K2.getKey(), A1E2);
            }
        }
        C28151Xt c28151Xt = C28151Xt.A02;
        if (c28151Xt != null) {
            if (A1E.isEmpty() && A1E2.isEmpty()) {
                C25671My A00 = AbstractC25651Mw.A00(this.A01);
                EQ5 eq53 = this.A03;
                ArrayList A1E3 = AbstractC166987dD.A1E();
                Iterator it = eq53.A05.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1V(A1E3, it);
                }
                A00.E4s(new C36091FwR(A1E3));
                requireActivity().getFragmentManager().popBackStack();
                FLB A002 = FAS.A00(this.A01);
                A002.A01.flowEndCancel(A002.A00, AbstractC111324zv.A00(1360));
                return false;
            }
            try {
                UserSession userSession = this.A01;
                C14360o3.A0B(userSession, 0);
                JSONObject A0q = AbstractC31171DnF.A0q();
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    A0q.put(AbstractC166987dD.A1B(it2), "block");
                }
                Iterator it3 = A1E2.iterator();
                while (it3.hasNext()) {
                    A0q.put(AbstractC166987dD.A1B(it3), "unblock");
                }
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0B("friendships/set_reel_block_status/");
                A0c.A9s(CacheBehaviorLogger.SOURCE, "settings");
                A0c.A0P(null, C40781ul.class, C55702hA.class, false);
                A0c.AA6("user_block_statuses", A0q.toString());
                C1ON A0U = AbstractC31172DnG.A0U(A0c, true);
                A0U.A00 = new C32528EUe(this, A1E, A1E2);
                schedule(A0U);
                if (A1E.size() == 1) {
                    EQ5 eq54 = this.A03;
                    String str = (String) A1E.get(0);
                    Iterator A153 = AbstractC166997dE.A15(eq54.A07);
                    while (A153.hasNext()) {
                        Map.Entry A1K3 = AbstractC166987dD.A1K(A153);
                        if (str.equals(AbstractC31171DnF.A0g(A1K3.getKey()))) {
                            User user = (User) A1K3.getKey();
                            if (user != null && !user.isRestricted()) {
                                c28151Xt.A00();
                                UserSession userSession2 = this.A01;
                                C14360o3.A0B(userSession2, 0);
                                Context context = getContext();
                                if (context != null && C18U.A06(C06090Tz.A06, userSession2, 36321443205686729L)) {
                                    C18920wW A01 = AbstractC12220kQ.A01(this, userSession2);
                                    C146106i8 A0K = AbstractC31171DnF.A0K();
                                    A0K.A0D = context.getString(2131972538, user.getUsername());
                                    AbstractC31171DnF.A11(context, A0K, 2131972548);
                                    AbstractC31175DnJ.A0l(context, A0K, 2131972510);
                                    A0K.A0A(new G98(3, context, this, A01, userSession2, user));
                                    A0K.A0L = true;
                                    A0K.A01 = 10000;
                                    AbstractC25233BEq.A1F(A0K);
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    return false;
                }
                return false;
            } catch (JSONException unused) {
                C9GR.A01(getContext(), "updateBlocklist_request_error", 2131972429, 1);
                FLB A003 = FAS.A00(this.A01);
                A003.A01.flowEndFail(A003.A00, "error", null);
                return false;
            }
        }
        return false;
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        if (this.A05.equals(str)) {
            C9GR.A01(getContext(), "UserListResponse_request_error", 2131972429, 1);
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C168027ex c168027ex = (C168027ex) interfaceC40821up;
        if (this.A05.equals(str)) {
            EQ5 eq5 = this.A03;
            eq5.A06.addAll(c168027ex.getItems());
            eq5.A00 = false;
            EQ5.A00(eq5);
        }
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        this.A05 = str;
        EQ5 eq5 = this.A03;
        boolean isEmpty = str.isEmpty();
        if (eq5.A01 != isEmpty) {
            eq5.A01 = isEmpty;
            EQ5.A00(eq5);
        }
        C9JQ BjP = this.A06.BjP(this.A05);
        Integer num = BjP.A01;
        Integer num2 = C05F.A0C;
        EQ5 eq52 = this.A03;
        if (num == num2) {
            List list = BjP.A06;
            list.getClass();
            List list2 = eq52.A06;
            list2.clear();
            list2.addAll(list);
            eq52.A00 = false;
            EQ5.A00(eq52);
            return;
        }
        eq52.A06.clear();
        eq52.A00 = true;
        EQ5.A00(eq52);
        this.A04.A06(this.A05);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        String A06;
        if (!str.isEmpty() && AbstractC166987dD.A10(this.A01).A0M() != C05F.A0C) {
            A06 = "users/search/";
        } else {
            A06 = AbstractC13670mt.A06(MSV.A00(1194), this.A01.userId);
        }
        return AbstractC35238FgX.A04(this.A01, A06, str, "reel_viewer_settings_page", null);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131971831);
        interfaceC56362iU.EkS(true);
        if (AbstractC31178DnM.A1X(C06090Tz.A06, this.A01, 36321443205686729L)) {
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A0C = 2131961124;
            A0B.A0D = R.style.ActionBarTextButton;
            AbstractC31176DnK.A1B(new ViewOnClickListenerC35686FpL(this, 1), A0B, interfaceC56362iU);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1199773572);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A01 = A0S;
        Integer num = C05F.A0C;
        C169487hO c169487hO = this.A06;
        C14360o3.A0B(c169487hO, 0);
        this.A04 = AbstractC65980TxZ.A01(A0S, this, null, this, c169487hO, num, false);
        EQ5 eq5 = new EQ5(requireContext(), this, this);
        this.A03 = eq5;
        eq5.setHasStableIds(true);
        C31702Dw7.A00(this, FCP.A00(this.A01), 33);
        this.A04.A06(this.A05);
        FLB A00 = FAS.A00(this.A01);
        A00.A00 = A00.A01.flowStartForMarker(18943604, "viewer_settings_fragment", false);
        C0f9.A09(1095946313, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1136429731);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.story_viewer_settings);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) A0A.requireViewById(R.id.inline_search_box);
        this.A02 = igdsInlineSearchBox;
        igdsInlineSearchBox.A02 = this;
        igdsInlineSearchBox.A0E.setText(this.A05);
        this.A02.A00 = new LQ3(this, 8);
        RecyclerView A0F = AbstractC31176DnK.A0F(A0A);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.A00 = linearLayoutManager;
        A0F.setLayoutManager(linearLayoutManager);
        A0F.setAdapter(this.A03);
        E0L.A00(A0F, this, 20);
        C0f9.A09(-1302474560, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(193335332);
        super.onDestroy();
        this.A04.onDestroy();
        C0f9.A09(-211921828, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1267924042);
        super.onDestroyView();
        this.A04.onDestroyView();
        C0f9.A09(656904286, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-670006630);
        super.onPause();
        AbstractC31171DnF.A16(this);
        C0f9.A09(227259333, A02);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
