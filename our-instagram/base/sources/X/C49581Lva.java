package X;

import java.util.List;

/* renamed from: X.Lva, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49581Lva implements InterfaceC71958XCk {
    public final int A00;
    public final Object A01;

    public C49581Lva(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71958XCk
    public final void D3E() {
    }

    @Override // X.InterfaceC71958XCk
    public final void Djl(Integer num) {
        C140966Yy A0r;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            N8H n8h = (N8H) obj;
            A0r = AbstractC25225BEi.A0r(n8h.requireActivity(), n8h.A05());
            FT2.A01();
            List list = n8h.A01;
            C14360o3.A0B(list, 0);
            C45519KDk c45519KDk = new C45519KDk();
            c45519KDk.A01 = list;
            c45519KDk.A00 = "request_approvals";
            A0r.A0D(c45519KDk);
        } else {
            N8I n8i = (N8I) obj;
            N8I.A00(n8i, "see_all", null);
            A0r = AbstractC25225BEi.A0r(n8i.requireActivity(), n8i.A05());
            FT2.A01();
            List list2 = n8i.A01;
            C14360o3.A0B(list2, 0);
            C45519KDk c45519KDk2 = new C45519KDk();
            c45519KDk2.A01 = list2;
            c45519KDk2.A00 = "approve_creators";
            A0r.A0B(null, c45519KDk2);
        }
        A0r.A08();
        A0r.A04();
    }
}
