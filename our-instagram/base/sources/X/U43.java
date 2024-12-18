package X;

import java.util.List;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes11.dex */
public final class U43 implements Runnable {
    public final int A00;
    public final U4A A01;
    public final List A02;
    public final boolean A03;

    public static void A00(C136416Fu c136416Fu) {
        RunnableFuture runnableFuture;
        RunnableFuture runnableFuture2;
        synchronized (c136416Fu) {
            runnableFuture = ((AbstractC136346Fn) c136416Fu).A00;
        }
        if (runnableFuture != null && runnableFuture.isCancelled()) {
            return;
        }
        synchronized (c136416Fu) {
            runnableFuture2 = ((AbstractC136346Fn) c136416Fu).A00;
        }
        if (runnableFuture2 == null || runnableFuture2.isDone() || c136416Fu.A02.get() != -1) {
            return;
        }
        c136416Fu.A00();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A03) {
            List list = this.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0 && !this.A01.A00.get()) {
                    A00(((U48) list.get(size)).A00);
                } else {
                    return;
                }
            }
        } else {
            int i = 0;
            while (true) {
                List list2 = this.A02;
                if (i < list2.size() && !this.A01.A00.get()) {
                    A00(((U48) list2.get(i)).A00);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public U43(U4A u4a, List list, int i, boolean z) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = u4a;
        this.A03 = z;
    }
}
