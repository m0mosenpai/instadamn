package X;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.SXi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62926SXi {
    public final Deque A00 = new ArrayDeque(16);

    public static final long A00(C62926SXi c62926SXi) {
        Deque deque = c62926SXi.A00;
        if (deque.isEmpty()) {
            return 0L;
        }
        return AbstractC166987dD.A0N(deque.peek());
    }

    public final void A01() {
        Deque deque = this.A00;
        if (deque.isEmpty()) {
        } else {
            throw MSW.A0y(String.format("data item not completed, stackSize: %s scope: %s", Integer.valueOf(deque.size()), Long.valueOf(A00(this))));
        }
    }
}
