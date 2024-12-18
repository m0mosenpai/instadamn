package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EUe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32528EUe extends C1P1 {
    public List A00;
    public List A01;
    public final /* synthetic */ ELQ A02;

    public C32528EUe(ELQ elq, List list, List list2) {
        this.A02 = elq;
        this.A01 = list;
        this.A00 = list2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(272370041);
        ELQ elq = this.A02;
        C9GR.A01(elq.getContext(), "UserListStatusCallback_request_error", 2131972429, 1);
        FLB A00 = FAS.A00(elq.A01);
        A00.A01.flowEndFail(A00.A00, "error", null);
        C0f9.A0A(1449780848, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1040892151);
        ELQ elq = this.A02;
        AbstractC25651Mw.A00(elq.A01).E4s(new C36091FwR(null));
        FLB A00 = FAS.A00(elq.A01);
        A00.A01.flowEndFail(A00.A00, "error", null);
        C0f9.A0A(2069096095, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-2004246492);
        super.onFinish();
        AbstractC31179DnN.A0u(this.A02);
        C0f9.A0A(151467355, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1889906404);
        int A032 = C0f9.A03(401982943);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AbstractC31174DnI.A0k(this.A02.A01, AbstractC166987dD.A1B(it)).A0w(true);
        }
        Iterator it2 = this.A00.iterator();
        while (it2.hasNext()) {
            AbstractC31174DnI.A0k(this.A02.A01, AbstractC166987dD.A1B(it2)).A0w(false);
        }
        ELQ elq = this.A02;
        elq.requireActivity().getFragmentManager().popBackStack();
        FLB A00 = FAS.A00(elq.A01);
        A00.A01.flowEndSuccess(A00.A00);
        C0f9.A0A(827159979, A032);
        C0f9.A0A(1993100191, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1717775121);
        int A032 = C0f9.A03(-542918053);
        ELQ elq = this.A02;
        C25671My A00 = AbstractC25651Mw.A00(elq.A01);
        EQ5 eq5 = elq.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = eq5.A05.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A1E, it);
        }
        A00.E4s(new C36091FwR(A1E));
        AbstractC25651Mw.A00(elq.A01).E4s(new Object());
        FLB A002 = FAS.A00(elq.A01);
        A002.A01.flowEndSuccess(A002.A00);
        C0f9.A0A(-472233782, A032);
        C0f9.A0A(-1504023614, A03);
    }
}
