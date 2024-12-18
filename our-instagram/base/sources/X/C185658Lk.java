package X;

import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8Lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185658Lk implements InterfaceC185668Ll {
    public final java.util.Set A00;

    @Override // X.InterfaceC185668Ll
    public final void Dr6(Surface surface, int i, int i2) {
        C14360o3.A0B(surface, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC185668Ll) it.next()).Dr6(surface, i, i2);
        }
    }

    @Override // X.InterfaceC185668Ll
    public final void Dr3(int i, int i2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC185668Ll) it.next()).Dr3(i, i2);
        }
    }

    @Override // X.InterfaceC185668Ll
    public final void DrA() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC185668Ll) it.next()).DrA();
        }
    }

    public C185658Lk(C185658Lk c185658Lk) {
        this.A00 = new CopyOnWriteArraySet();
    }

    public C185658Lk() {
        this(null);
    }
}
