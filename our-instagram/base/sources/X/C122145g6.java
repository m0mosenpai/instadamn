package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5g6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122145g6 implements InterfaceC83703oF {
    public final List A00;

    public C122145g6(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C122145g6)) {
            return false;
        }
        List list = this.A00;
        List list2 = ((C122145g6) obj).A00;
        return list.containsAll(list2) && list2.containsAll(list);
    }

    public final int hashCode() {
        Iterator it = this.A00.iterator();
        int i = 0;
        while (it.hasNext()) {
            i ^= it.next().hashCode();
        }
        return i;
    }
}
