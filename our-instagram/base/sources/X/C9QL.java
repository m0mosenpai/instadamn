package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9QL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9QL implements C3ZQ {
    public final List A00;

    public C9QL(C9BP c9bp) {
        C14360o3.A0B(c9bp, 1);
        List list = (List) c9bp.A03;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new C09530e4(new C3ZW(new C9BP(it.next(), c9bp.A02, c9bp.A01)), 0));
        }
        this.A00 = A0q;
    }

    @Override // X.C3ZQ
    public final Object Ava() {
        return null;
    }

    @Override // X.C3ZQ
    public final /* synthetic */ void DR7(Object obj) {
    }

    @Override // X.C3ZQ
    public final /* synthetic */ boolean DR6(Object obj) {
        return true;
    }

    @Override // X.C3ZQ
    public final Iterable BWV(C206209Bd c206209Bd, C3AW c3aw, int i) {
        return this.A00;
    }
}
