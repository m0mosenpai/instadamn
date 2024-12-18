package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class DI8 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI8(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A05 = obj;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            K3Y k3y = (K3Y) obj;
            C14360o3.A0B(k3y, 0);
            long j = this.A01;
            String valueOf = String.valueOf(j);
            List list = (List) this.A05;
            Object obj2 = this.A06;
            Object obj3 = this.A04;
            k3y.A00(new C48183LUh(1, j, this.A03, this.A02, obj2, obj3), null, valueOf, list, null, false);
        } else {
            C28223CcT c28223CcT = (C28223CcT) obj;
            C14360o3.A0B(c28223CcT, 0);
            InterfaceC16610sE interfaceC16610sE = CMI.A00;
            String A00 = AbstractC111324zv.A00(2178);
            c28223CcT.A01(A00, A00, A00, interfaceC16610sE);
            C5Hc c5Hc = (C5Hc) this.A03;
            c28223CcT.A02("comment_rows", DMQ.A00, DMR.A00, C5UA.A03(new C30755Dfs(0, this.A02, this.A05, this.A04, this.A06, c5Hc), 441326255), c5Hc);
            long j2 = this.A01;
            if (j2 != 9205357640488583168L) {
                c28223CcT.A01("constant_cta_comment_row_list_key", "constant_cta_comment_row_list_key", "constant_cta_comment_row_list_key", C5UA.A03(new C30516Dbz(j2, 0), -1835565412));
            }
        }
        return C0eB.A00;
    }
}
