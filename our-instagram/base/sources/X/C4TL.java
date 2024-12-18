package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.4TL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TL {
    public final Queue A00 = new ArrayDeque();

    public static final synchronized void A00(C4TL c4tl, long j) {
        synchronized (c4tl) {
            while (true) {
                Queue queue = c4tl.A00;
                if (queue.isEmpty() || ((Number) queue.peek()).longValue() > j - 3600000) {
                    break;
                } else {
                    queue.poll();
                }
            }
        }
    }
}
