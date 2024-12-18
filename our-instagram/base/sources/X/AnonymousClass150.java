package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.150, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass150 implements AnonymousClass151 {
    public static AnonymousClass150 A04;
    public final AnonymousClass152 A01;
    public final Queue A03 = new ConcurrentLinkedQueue();
    public boolean A00 = false;
    public final List A02 = new ArrayList();

    public static synchronized AnonymousClass150 A00() {
        AnonymousClass150 anonymousClass150;
        synchronized (AnonymousClass150.class) {
            anonymousClass150 = A04;
            if (anonymousClass150 == null) {
                anonymousClass150 = new AnonymousClass150(AnonymousClass152.A01);
                A04 = anonymousClass150;
            }
        }
        return anonymousClass150;
    }

    @Override // X.AnonymousClass151
    public final void CjC(C2050595u c2050595u) {
        if (this.A00) {
            java.util.Set set = C1K3.A00;
            boolean z = !set.isEmpty();
            Queue queue = this.A03;
            boolean z2 = false;
            if (queue.size() < 50) {
                z2 = true;
            }
            if (z && !z2) {
                A01(c2050595u, set);
                while (!queue.isEmpty()) {
                    C2050595u c2050595u2 = (C2050595u) queue.poll();
                    if (c2050595u2 != null) {
                        A01(c2050595u2, set);
                    }
                }
            } else {
                queue.add(c2050595u);
            }
            if (c2050595u.A03) {
                int i = c2050595u.A00;
                if (i == 2 || i == 4) {
                    A01(c2050595u, C1K3.A01);
                }
            }
        }
    }

    public AnonymousClass150(AnonymousClass152 anonymousClass152) {
        this.A01 = anonymousClass152;
    }

    public static void A01(C2050595u c2050595u, java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((AnonymousClass151) it.next()).CjC(c2050595u);
        }
    }
}
