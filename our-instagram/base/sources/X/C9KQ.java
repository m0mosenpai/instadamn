package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9KQ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9KQ {
    public static final C24164Ann A00(C9CO c9co) {
        C14360o3.A0B(c9co, 0);
        String str = c9co.A04;
        int hashCode = str.hashCode();
        return new C24164Ann((Integer) c9co.A01, c9co.A03, str, c9co.A06, hashCode);
    }

    public static final List A01(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00((C9CO) it.next()));
        }
        return arrayList;
    }
}
