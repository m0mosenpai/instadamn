package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.KDt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45528KDt extends AbstractC68258VJv {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;

    public C45528KDt(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = interfaceC103384lE;
        this.A00 = c6fq;
    }

    @Override // X.AbstractC68258VJv
    public final void A00(List list) {
        InterfaceC103384lE interfaceC103384lE = this.A01;
        C6FQ c6fq = this.A00;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("accounts", list);
        C17280tP A0y = AbstractC166987dD.A0y();
        A1G.put("blocked_uid", AbstractC001800i.A0a(A0y.A09()));
        A1G.put("fetch_account_center_list", AbstractC001800i.A0a((Iterable) AbstractC31171DnF.A0Y(A0y, A0y.A04, C17280tP.A4G, 184)));
        AbstractC166987dD.A1Z(new MC7(c6fq, A1G, interfaceC103384lE, null, 13), AbstractC24771Iv.A00());
    }
}
