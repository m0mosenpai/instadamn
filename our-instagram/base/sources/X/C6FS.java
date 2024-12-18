package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6FS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FS implements C6FT {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    @Override // X.C6FT
    public final void Cw6(C6FW c6fw, InterfaceC103384lE interfaceC103384lE, Object obj, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C6FT) it.next()).Cw6(c6fw, interfaceC103384lE, obj, str);
            }
        }
    }

    @Override // X.C6FT
    public final void CzG(C6FW c6fw, InterfaceC103384lE interfaceC103384lE, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C6FT) it.next()).CzG(c6fw, interfaceC103384lE, str);
            }
        }
    }

    @Override // X.C6FT
    public final void Dij(C1338562t c1338562t, InterfaceC103384lE interfaceC103384lE) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C6FT) it.next()).Dij(c1338562t, interfaceC103384lE);
            }
        }
    }
}
