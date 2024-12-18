package X;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1In, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24701In implements InterfaceC24681Il {
    public final C24651Ii A00;
    public final Queue A01 = new ConcurrentLinkedQueue();

    @Override // X.InterfaceC24681Il
    public final C1KA Bbe() {
        return C1KA.A03;
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
        Queue queue = this.A01;
        if (!queue.isEmpty()) {
            if (!C11T.A08()) {
                C11T.A02(new Runnable() { // from class: X.91o
                    @Override // java.lang.Runnable
                    public final void run() {
                        C24701In.this.ELG();
                    }
                });
                return;
            }
            Runnable runnable = (Runnable) queue.poll();
            if (runnable != null) {
                runnable.run();
            }
            if (queue.isEmpty() || (!this.A00.A03.isEmpty())) {
                return;
            }
            ELG();
        }
    }

    @Override // X.InterfaceC24681Il
    public final void Ep7(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        this.A01.add(abstractRunnableC14200nk);
    }

    public C24701In(C24651Ii c24651Ii) {
        this.A00 = c24651Ii;
    }
}
