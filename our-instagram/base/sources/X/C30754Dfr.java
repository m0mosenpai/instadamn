package X;

import java.util.List;

/* renamed from: X.Dfr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30754Dfr extends C0YY implements InterfaceC16590sC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30754Dfr(int i, Object obj, Object obj2) {
        super(5);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (this.A00 != 0) {
            AbstractC25225BEi.A1R(obj);
            int A0H = AbstractC166987dD.A0H(obj2);
            AbstractC25225BEi.A1R(obj3);
            AbstractC25225BEi.A1R(obj4);
            AbstractC25225BEi.A1R(obj5);
            C26064Bfs c26064Bfs = (C26064Bfs) this.A02;
            List list = (List) c26064Bfs.A06;
            int size = list.size();
            int i = c26064Bfs.A01;
            if (size < i && A0H * 5 > list.size() - 10) {
                AbstractC166987dD.A1Y(((C38688GzT) c26064Bfs.A03).A00);
            }
            boolean A1Q = AbstractC167007dF.A1Q(list.size(), i);
            C51762Yz c51762Yz = (C51762Yz) this.A01;
            if (A1Q != AbstractC25229BEm.A1W(c51762Yz)) {
                AbstractC25227BEk.A1L(c51762Yz, A1Q);
            }
            return C0eB.A00;
        }
        AbstractC25225BEi.A1R(obj2);
        AbstractC25225BEi.A1R(obj5);
        AbstractC167017dG.A1O(obj, null);
        throw C00O.createAndThrow();
    }
}
