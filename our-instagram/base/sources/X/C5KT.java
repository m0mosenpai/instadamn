package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.5KT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KT {
    public Queue A00;
    public boolean A01;
    public final Object A02 = new Object();

    public final void A00(InterfaceC65425Tjw interfaceC65425Tjw) {
        synchronized (this.A02) {
            Queue queue = this.A00;
            if (queue == null) {
                queue = new ArrayDeque();
                this.A00 = queue;
            }
            queue.add(interfaceC65425Tjw);
        }
    }

    public final void A01(C5KS c5ks) {
        InterfaceC65425Tjw interfaceC65425Tjw;
        Object obj = this.A02;
        synchronized (obj) {
            if (this.A00 != null && !this.A01) {
                this.A01 = true;
                while (true) {
                    synchronized (obj) {
                        interfaceC65425Tjw = (InterfaceC65425Tjw) this.A00.poll();
                        if (interfaceC65425Tjw == null) {
                            this.A01 = false;
                            return;
                        }
                    }
                    interfaceC65425Tjw.FG8(c5ks);
                }
            }
        }
    }
}
