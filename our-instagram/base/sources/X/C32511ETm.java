package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ETm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32511ETm extends C1P1 {
    public final /* synthetic */ ENH A00;

    public C32511ETm(ENH enh) {
        this.A00 = enh;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-498184937);
        ENH enh = this.A00;
        C1570473j c1570473j = enh.A02;
        if (c1570473j != null) {
            c1570473j.A0E("fetch_request_fail");
            C1570473j c1570473j2 = enh.A02;
            if (c1570473j2 != null) {
                ((MTJ) c1570473j2).A00.A01();
                C0f5 A00 = C18950wb.A00(AbstractC31173DnH.A0q(enh), 16924191, true);
                A00.ABW("su_check_timeout_event", "Checking whether there is a cache timeout event.");
                A00.report();
                enh.A05 = true;
                enh.A07 = false;
                ENH.A02(enh);
                FragmentActivity activity = enh.getActivity();
                if (activity != null && !activity.isFinishing()) {
                    C9GR.A01(enh.getActivity(), "tabbed_explore_people_fail", 2131975131, 0);
                } else {
                    C0w9.A03(AbstractC111324zv.A00(590), AbstractC111324zv.A00(709));
                }
                C0f9.A0A(-1595678329, A03);
                return;
            }
        }
        C14360o3.A0F("latencyPerfLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1899301922);
        ENH enh = this.A00;
        enh.A07 = true;
        enh.A06 = false;
        ENH.A02(enh);
        C0f9.A0A(-301782162, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-2072413653);
        ECC ecc = (ECC) obj;
        int A032 = C0f9.A03(694023365);
        C14360o3.A0B(ecc, 0);
        ENH enh = this.A00;
        C1570473j c1570473j = enh.A02;
        if (c1570473j != null) {
            c1570473j.A0E("fetch_request_end");
            C1570473j c1570473j2 = enh.A02;
            if (c1570473j2 != null) {
                ((MTJ) c1570473j2).A00.A05();
                AbstractC31179DnN.A1U(enh, 16923641);
                enh.A05 = false;
                List list = ecc.A00;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C25821No.A00().A0O(AbstractC166987dD.A0o(enh.A0C), ((C47O) it.next()).A03.Bhu(), "see_all_suggested_user_fragment");
                    }
                    enh.A07 = false;
                    if (AbstractC166987dD.A1b(list)) {
                        enh.A0b().A0C(list);
                        C0fA.A00(enh.A0b(), 1665263086);
                    } else {
                        ENH.A02(enh);
                    }
                }
                C0f9.A0A(-1171343092, A032);
                C0f9.A0A(124200683, A03);
                return;
            }
        }
        C14360o3.A0F("latencyPerfLogger");
        throw C00O.createAndThrow();
    }
}
