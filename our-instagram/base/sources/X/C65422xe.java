package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.2xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65422xe {
    public static final Executor A07 = new Executor() { // from class: X.2xf
        public final Handler A00 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.A00.post(runnable);
        }
    };
    public int A00;
    public List A01;
    public List A02;
    public Executor A03;
    public final C65472xj A04;
    public final InterfaceC65452xh A05;
    public final List A06;

    public final void A01(List list, Runnable runnable) {
        int i = this.A00 + 1;
        this.A00 = i;
        List list2 = this.A01;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.A02;
        if (list == null) {
            int size = list2.size();
            this.A01 = null;
            this.A02 = Collections.emptyList();
            this.A05.DfC(0, size);
        } else if (list2 == null) {
            this.A01 = list;
            this.A02 = Collections.unmodifiableList(list);
            this.A05.DMJ(0, list.size());
        } else {
            this.A04.A01.execute(new C3HE(this, runnable, list2, list, i));
            return;
        }
        A00(this, runnable, list3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65422xe(X.AbstractC65412xd r5, X.C2UU r6) {
        /*
            r4 = this;
            X.2xg r3 = new X.2xg
            r3.<init>(r6)
            r2 = 0
            java.lang.Object r1 = X.AbstractC65462xi.A01
            monitor-enter(r1)
            java.util.concurrent.Executor r0 = X.AbstractC65462xi.A00     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L14
            r0 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)     // Catch: java.lang.Throwable -> L20
            X.AbstractC65462xi.A00 = r0     // Catch: java.lang.Throwable -> L20
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.Executor r1 = X.AbstractC65462xi.A00
            X.2xj r0 = new X.2xj
            r0.<init>(r5, r2, r1)
            r4.<init>(r0, r3)
            return
        L20:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65422xe.<init>(X.2xd, X.2UU):void");
    }

    public static void A00(C65422xe c65422xe, Runnable runnable, List list) {
        Iterator it = c65422xe.A06.iterator();
        while (it.hasNext()) {
            ((InterfaceC155346yN) it.next()).D8w(list, c65422xe.A02);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public C65422xe(C65472xj c65472xj, InterfaceC65452xh interfaceC65452xh) {
        this.A06 = new CopyOnWriteArrayList();
        this.A02 = Collections.emptyList();
        this.A05 = interfaceC65452xh;
        this.A04 = c65472xj;
        Executor executor = c65472xj.A02;
        this.A03 = executor == null ? A07 : executor;
    }
}
