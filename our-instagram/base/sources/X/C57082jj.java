package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57082jj implements InterfaceC57092jk {
    public final List A00 = new ArrayList();

    @Override // X.InterfaceC57092jk
    public final void A7i(InterfaceC57142jp interfaceC57142jp) {
        this.A00.add(interfaceC57142jp);
    }

    @Override // X.InterfaceC57092jk
    public final InterfaceC57142jp AXJ(int i) {
        return (InterfaceC57142jp) this.A00.get(i);
    }

    @Override // X.InterfaceC57092jk
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // X.InterfaceC57092jk
    public final int size() {
        return this.A00.size();
    }
}
