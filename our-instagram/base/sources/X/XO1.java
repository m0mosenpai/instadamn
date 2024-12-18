package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes12.dex */
public final class XO1 implements InterfaceC41801wU, InterfaceC41821wW {
    public List A00;
    public volatile boolean A01;

    @Override // X.InterfaceC41821wW
    public final boolean A7o(InterfaceC41801wU interfaceC41801wU) {
        AbstractC42141x4.A01(interfaceC41801wU, "d is null");
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    List list = this.A00;
                    if (list == null) {
                        list = new LinkedList();
                        this.A00 = list;
                    }
                    list.add(interfaceC41801wU);
                    return true;
                }
            }
        }
        interfaceC41801wU.dispose();
        return false;
    }

    @Override // X.InterfaceC41821wW
    public final boolean AOa(InterfaceC41801wU interfaceC41801wU) {
        List list;
        AbstractC42141x4.A01(interfaceC41801wU, "Disposable item is null");
        if (this.A01) {
            return false;
        }
        synchronized (this) {
            if (this.A01 || (list = this.A00) == null || !list.remove(interfaceC41801wU)) {
                return false;
            }
            return true;
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A01) {
            synchronized (this) {
                if (this.A01) {
                    return;
                }
                this.A01 = true;
                List list = this.A00;
                this.A00 = null;
                if (list != null) {
                    ArrayList arrayList = null;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC41801wU) it.next()).dispose();
                        } catch (Throwable th) {
                            AbstractC62281S5a.A00(th);
                            if (arrayList == null) {
                                arrayList = AbstractC166987dD.A1E();
                            }
                            arrayList.add(th);
                        }
                    }
                    if (arrayList != null) {
                        if (arrayList.size() == 1) {
                            throw Y4X.A00((Throwable) arrayList.get(0));
                        }
                        throw new C64866TXr(arrayList);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC41821wW
    public final boolean EEm(InterfaceC41801wU interfaceC41801wU) {
        if (AOa(interfaceC41801wU)) {
            interfaceC41801wU.dispose();
            return true;
        }
        return false;
    }
}
