package X;

import java.util.PriorityQueue;

/* renamed from: X.5ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123185ht {
    public final PriorityQueue A00 = new PriorityQueue(10, W2Q.A03);

    public final synchronized W2Q A00(long j) {
        PriorityQueue priorityQueue;
        W2Q w2q;
        while (true) {
            priorityQueue = this.A00;
            if (!priorityQueue.isEmpty()) {
                W2Q w2q2 = (W2Q) priorityQueue.peek();
                if (w2q2.A01.A07[w2q2.A00].A00 >= j - 100000) {
                    break;
                }
                priorityQueue.poll();
            } else {
                break;
            }
        }
        if (!priorityQueue.isEmpty()) {
            W2Q w2q3 = (W2Q) priorityQueue.peek();
            if (Math.abs(w2q3.A01.A07[w2q3.A00].A00 - j) <= 100000) {
                w2q = (W2Q) priorityQueue.poll();
            }
        }
        w2q = null;
        return w2q;
    }

    public final synchronized void A01(W2Q w2q) {
        PriorityQueue priorityQueue = this.A00;
        if (priorityQueue.size() < 200) {
            priorityQueue.add(w2q);
        }
    }
}
