package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FzH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36264FzH implements C6J5 {
    public final int A00;
    public final Object A01;

    public C36264FzH(C36462G6m c36462G6m) {
        this.A00 = 3;
        this.A01 = c36462G6m;
    }

    @Override // X.C6J5
    public final /* synthetic */ boolean test(Object obj) {
        if (3 - this.A00 != 0) {
            return AbstractC25231BEo.A1a(obj, (InterfaceC16660sJ) this.A01);
        }
        java.util.Set set = (java.util.Set) obj;
        C14360o3.A0A(set);
        List list = ((C36462G6m) this.A01).A00;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (list.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public C36264FzH(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }
}
