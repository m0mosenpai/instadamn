package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class U4Q implements InterfaceC57092jk {
    public final ArrayList A00 = new ArrayList();

    @Override // X.InterfaceC57092jk
    public final void A7i(InterfaceC57142jp interfaceC57142jp) {
        C14360o3.A0B(interfaceC57142jp, 0);
        this.A00.add(interfaceC57142jp);
    }

    @Override // X.InterfaceC57092jk
    public final InterfaceC57142jp AXJ(int i) {
        return (InterfaceC57142jp) AbstractC31173DnH.A0i(this.A00, i);
    }

    @Override // X.InterfaceC57092jk
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC166997dE.A13(this.A00);
    }

    @Override // X.InterfaceC57092jk
    public final int size() {
        return this.A00.size();
    }
}