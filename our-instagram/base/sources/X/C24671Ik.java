package X;

import android.os.MessageQueue;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1Ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24671Ik implements InterfaceC24681Il {
    public final C24651Ii A00;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final MessageQueue A02;

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
        this.A02.addIdleHandler(new C1KC() { // from class: X.1KB
            {
                super("CriticalPathMainThreadIdleQueue");
            }

            @Override // X.C1KC
            public final boolean onQueueIdle() {
                Queue queue = C24671Ik.this.A01;
                Runnable runnable = (Runnable) queue.poll();
                if (runnable != null) {
                    runnable.run();
                }
                if (!queue.isEmpty() && !(!r2.A00.A03.isEmpty())) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // X.InterfaceC24681Il
    public final void Ep7(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        this.A01.add(abstractRunnableC14200nk);
    }

    public C24671Ik(MessageQueue messageQueue, C24651Ii c24651Ii) {
        this.A00 = c24651Ii;
        this.A02 = messageQueue;
    }
}
