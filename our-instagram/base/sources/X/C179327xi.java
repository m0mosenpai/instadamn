package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.7xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179327xi implements InterfaceC179337xj {
    public final InterfaceC179317xh A00;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();

    public final AXC A00() {
        AXC axc = (AXC) this.A01.poll();
        if (axc == null) {
            return new AXC(this, this.A00.AL7());
        }
        if (axc.A02.compareAndSet(0, 1)) {
            return axc;
        }
        throw new IllegalStateException("Can only reset a previously released reference.");
    }

    @Override // X.InterfaceC179337xj
    public final void DeY(AXC axc, Object obj) {
        this.A00.Dee(obj);
        this.A01.offer(axc);
    }

    public C179327xi(InterfaceC179317xh interfaceC179317xh) {
        this.A00 = interfaceC179317xh;
    }
}
