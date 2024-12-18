package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EUQ extends C1P1 {
    public final C32124E9x A00;
    public final C1570473j A01;
    public final /* synthetic */ C32353ENa A02;

    public EUQ(C32353ENa c32353ENa, C32124E9x c32124E9x, C1570473j c1570473j) {
        this.A02 = c32353ENa;
        this.A00 = c32124E9x;
        this.A01 = c1570473j;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1194847889);
        C32353ENa c32353ENa = this.A02;
        AbstractC31179DnN.A1U(c32353ENa, 16909819);
        C1570473j c1570473j = this.A01;
        c1570473j.A0E("fetch_request_fail");
        ((MTJ) c1570473j).A00.A01();
        c32353ENa.A09 = false;
        C9GR.A01(c32353ENa.getContext(), "tabbed_explore_people_fail", 2131975131, 0);
        ((MTJ) this.A00).A00.A01();
        C0f9.A0A(-277266383, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(976653673);
        C32353ENa c32353ENa = this.A02;
        c32353ENa.A0A = false;
        InterfaceC70513Em interfaceC70513Em = c32353ENa.A03;
        if (interfaceC70513Em == null) {
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        interfaceC70513Em.setIsLoading(false);
        AbstractC31557Dth.A01(c32353ENa, false);
        C0f9.A0A(-2108114577, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-73844127);
        ((MTJ) this.A00).A00.A04();
        C32353ENa c32353ENa = this.A02;
        c32353ENa.A0A = true;
        InterfaceC70513Em interfaceC70513Em = c32353ENa.A03;
        if (interfaceC70513Em == null) {
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        interfaceC70513Em.setIsLoading(!c32353ENa.A09);
        C0f9.A0A(578984264, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i;
        List A03;
        List list;
        List list2;
        Integer num;
        List list3;
        int A032 = C0f9.A03(1045354657);
        C31526DtB c31526DtB = (C31526DtB) obj;
        int A033 = C0f9.A03(-952825220);
        C14360o3.A0B(c31526DtB, 0);
        C32353ENa c32353ENa = this.A02;
        AbstractC31179DnN.A1U(c32353ENa, 16912446);
        C1570473j c1570473j = this.A01;
        c1570473j.A0E("fetch_request_end");
        ((MTJ) c1570473j).A00.A05();
        if (c32353ENa.A0D && c31526DtB.CR4()) {
            AbstractC35110FeC.A02(c32353ENa.requireContext(), c31526DtB.A00);
        }
        if (c32353ENa.getScrollingViewProxy().CXX()) {
            ViewGroup A0G = AbstractC31174DnI.A0G(c32353ENa);
            C14360o3.A0C(A0G, AbstractC43591JPw.A00(42));
            AdapterView adapterView = (AdapterView) A0G;
            if (c32353ENa.mView != null && adapterView.getEmptyView() == null) {
                View inflate = LayoutInflater.from(c32353ENa.getContext()).inflate(R.layout.recommended_user_empty, (ViewGroup) c32353ENa.mView, false);
                adapterView.setEmptyView(inflate);
                ViewGroup viewGroup = (ViewGroup) c32353ENa.mView;
                if (viewGroup != null) {
                    viewGroup.addView(inflate);
                }
            }
        } else if (c32353ENa.mView != null && c32353ENa.mEmptyView == null) {
            c32353ENa.setEmptyViewForRecyclerView(LayoutInflater.from(c32353ENa.getContext()).inflate(R.layout.recommended_user_empty, (ViewGroup) c32353ENa.mView, false));
        }
        c32353ENa.A07 = c31526DtB.A03;
        c32353ENa.A0C = c31526DtB.A07;
        C47K c47k = c31526DtB.A01;
        C14360o3.A07(c47k);
        C47K c47k2 = c31526DtB.A02;
        C14360o3.A07(c47k2);
        boolean z = true;
        if (c32353ENa.A0E && (list3 = c47k.A0P) != null && AbstractC166987dD.A1b(list3)) {
            String string = c32353ENa.requireContext().getString(2131968485);
            i = 0;
            C14360o3.A0B(string, 0);
            c47k.A0K = string;
            str = c32353ENa.requireContext().getString(2131952904);
        } else {
            str = "";
            i = 0;
            c47k.A0K = "";
        }
        C14360o3.A0B(str, 0);
        c47k2.A0K = str;
        ArrayList A1M = AbstractC16960so.A1M(c47k, c47k2);
        EQJ eqj = c32353ENa.A01;
        if (eqj == null) {
            C14360o3.A0F("explorePeopleAdapter");
            throw C00O.createAndThrow();
        }
        if (c31526DtB.A05 || (num = c32353ENa.A05) == C05F.A0j || num == C05F.A0N || num == C05F.A0C) {
            z = false;
        }
        eqj.A07 = z;
        if (c32353ENa.A09) {
            eqj.A06(A1M);
            c32353ENa.A09 = false;
            if (AbstractC111324zv.A00(1126).equals(c32353ENa.A06) && AbstractC25231BEo.A0I(c47k.A0M) + AbstractC25231BEo.A0I(c47k2.A0M) > 20) {
                c32353ENa.getScrollingViewProxy().EdY(20);
            }
        } else if (c32353ENa.A0D) {
            eqj.A06(A1M);
            c32353ENa.EMT();
            c32353ENa.A0D = false;
        } else {
            ArrayList arrayList = eqj.A0G;
            int size = arrayList.size();
            while (i < size) {
                C47K c47k3 = (C47K) A1M.get(i);
                C47K c47k4 = (C47K) AbstractC31173DnH.A0i(arrayList, i);
                if (!c47k4.A07() && !c47k3.A07()) {
                    List list4 = c47k3.A0M;
                    if (list4 != null && (list2 = c47k4.A0M) != null) {
                        list2.addAll(list4);
                    }
                    A03 = c47k4.A0M;
                } else {
                    if (!c47k4.A08() && !c47k3.A08()) {
                        List list5 = c47k3.A0P;
                        if (list5 != null && (list = c47k4.A0P) != null) {
                            list.addAll(list5);
                        }
                        A03 = c47k4.A03();
                    }
                    i++;
                }
                EQJ.A03(eqj, A03);
                i++;
            }
            eqj.A06 = true;
            EQJ.A01(eqj);
        }
        C32124E9x c32124E9x = this.A00;
        ((MTJ) c32124E9x).A00.A05();
        C32353ENa.A01(c32124E9x.A00, c32353ENa, c47k);
        C32353ENa.A01(c32124E9x.A01, c32353ENa, c47k2);
        C0f9.A0A(-28314865, A033);
        C0f9.A0A(1242244447, A032);
    }
}
