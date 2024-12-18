package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wpn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71198Wpn implements Iterable, InterfaceC15590qF {
    public final List A00 = new ArrayList();

    public final void A00(List list) {
        for (Object obj : list) {
            C14360o3.A0B(obj, 0);
            AbstractC43594JPz.A1Q(obj, this.A00);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A00.iterator();
    }
}
