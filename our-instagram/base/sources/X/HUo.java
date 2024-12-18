package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUo extends C17T implements JK1 {
    public List A00;

    @Override // X.JK1
    public final List C3x() {
        List list = this.A00;
        if (list == null) {
            return A08(-1525319953, HWP.class);
        }
        return list;
    }

    @Override // X.JK1
    public final JK1 EAw(C1DY c1dy) {
        ArrayList arrayList;
        List<C47N> C3x = C3x();
        if (C3x != null) {
            arrayList = AbstractC167017dG.A0q(C3x);
            for (C47N c47n : C3x) {
                c47n.EBf(c1dy);
                arrayList.add(c47n);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.JK1
    public final C38236Grf F2a(C1DY c1dy) {
        ArrayList arrayList;
        List C3x = C3x();
        if (C3x != null) {
            arrayList = AbstractC167017dG.A0q(C3x);
            Iterator it = C3x.iterator();
            while (it.hasNext()) {
                arrayList.add(((C47N) it.next()).F5V(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C38236Grf(arrayList);
    }
}
