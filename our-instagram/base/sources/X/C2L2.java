package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2L2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2L2 {
    public final C2L5 A00;
    public final C2L8 A01;
    public final C2LA A02;
    public final C2L7 A03;
    public final String A04;
    public final Executor A05;
    public final Executor A06;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.2L5, java.lang.Object] */
    public C2L2(String str) {
        final boolean z = true;
        final boolean z2 = false;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: X.2L3
            public final AtomicInteger A00 = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str2;
                C14360o3.A0B(runnable, 0);
                if (z2) {
                    str2 = "WM.task-";
                } else {
                    str2 = "androidx.work-";
                }
                return new Thread(runnable, AnonymousClass001.A0O(str2, this.A00.incrementAndGet()));
            }
        });
        C14360o3.A07(newFixedThreadPool);
        this.A05 = newFixedThreadPool;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: X.2L3
            public final AtomicInteger A00 = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str2;
                C14360o3.A0B(runnable, 0);
                if (z) {
                    str2 = "WM.task-";
                } else {
                    str2 = "androidx.work-";
                }
                return new Thread(runnable, AnonymousClass001.A0O(str2, this.A00.incrementAndGet()));
            }
        });
        C14360o3.A07(newFixedThreadPool2);
        this.A06 = newFixedThreadPool2;
        this.A00 = new Object();
        this.A03 = new C2L7() { // from class: X.2L6
        };
        this.A01 = C2L8.A00;
        this.A02 = new C2L9();
        this.A04 = str;
    }
}
