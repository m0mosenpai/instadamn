package X;

import java.util.List;

/* renamed from: X.LRr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48117LRr implements C8EF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48117LRr(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C8EF
    public final void D6b(Exception exc, List list) {
        int i = this.A00;
        C14360o3.A0B(list, 0);
        boolean A1b = AbstractC166987dD.A1b(list);
        if (i != 0) {
            if (A1b) {
                ((L0Z) this.A02).A00 = ((C184028Eq) list.get(0)).A01;
            } else {
                return;
            }
        } else {
            if (!A1b) {
                return;
            }
            ((L0Y) this.A02).A00 = ((C184028Eq) list.get(0)).A01;
        }
        AbstractC166987dD.A1Y(this.A01);
    }
}
