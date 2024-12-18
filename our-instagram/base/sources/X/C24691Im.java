package X;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24691Im implements InterfaceC24681Il {
    public final C24651Ii A00;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final InterfaceC14020nS A03;

    @Override // X.InterfaceC24681Il
    public final C1KA Bbe() {
        return C1KA.A01;
    }

    @Override // X.InterfaceC24681Il
    public final void E37(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (((AbstractRunnableC14200nk) it.next()).runnableId == abstractRunnableC14200nk.runnableId) {
                it.remove();
            }
        }
        Ep7(abstractRunnableC14200nk);
    }

    @Override // X.InterfaceC24681Il
    public final void ELG() {
        if (!this.A01.isEmpty() && !this.A02.get()) {
            this.A03.ATO(new AbstractRunnableC14200nk() { // from class: X.1KD
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C24691Im c24691Im = C24691Im.this;
                        AtomicBoolean atomicBoolean = c24691Im.A02;
                        atomicBoolean.set(true);
                        while (!(!c24691Im.A00.A03.isEmpty())) {
                            Queue queue = c24691Im.A01;
                            if (queue.isEmpty()) {
                                break;
                            }
                            Runnable runnable = (Runnable) queue.poll();
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                        atomicBoolean.set(false);
                    } catch (Throwable th) {
                        C24691Im.this.A02.set(false);
                        throw th;
                    }
                }

                {
                    super(311);
                }
            });
        }
    }

    @Override // X.InterfaceC24681Il
    public final void Ep7(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        this.A01.add(abstractRunnableC14200nk);
    }

    public C24691Im(InterfaceC14020nS interfaceC14020nS, C24651Ii c24651Ii) {
        this.A00 = c24651Ii;
        this.A03 = interfaceC14020nS;
    }
}
