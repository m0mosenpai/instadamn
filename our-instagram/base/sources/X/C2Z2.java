package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Z2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Z2 implements InterfaceC224417g {
    public final AtomicReference A00;

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        InterfaceC224417g interfaceC224417g = (InterfaceC224417g) this.A00.getAndSet(null);
        if (interfaceC224417g != null) {
            return interfaceC224417g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public C2Z2(InterfaceC224417g interfaceC224417g) {
        this.A00 = new AtomicReference(interfaceC224417g);
    }
}
