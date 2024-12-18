package X;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3aH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75503aH {
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();

    public final void A00(InterfaceC75483aF interfaceC75483aF) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null || obj.equals(interfaceC75483aF)) {
                it.remove();
            }
        }
    }
}
