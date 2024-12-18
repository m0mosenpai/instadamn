package X;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/* renamed from: X.1N2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1N2 {
    public final Queue A00 = new ArrayDeque();

    public final synchronized void A00(ArrayList arrayList) {
        if (arrayList.size() <= 8) {
            Queue queue = this.A00;
            if (queue.size() < 32) {
                arrayList.clear();
                queue.add(arrayList);
            }
        }
    }
}
