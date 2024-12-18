package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1WC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WC implements C1WD {
    public final Executor A00;
    public final Executor A01;
    public final Executor A02;
    public final Executor A03;
    public final ScheduledExecutorService A04;

    public C1WC(int i) {
        final String str = "FrescoIoBoundExecutor";
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2, new ThreadFactory(str) { // from class: X.1WG
            public final String A00;
            public final AtomicInteger A01 = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                C14360o3.A0B(runnable, 0);
                return new Thread(new TNV(this, runnable), AnonymousClass001.A0G(this.A00, '-', this.A01.getAndIncrement()));
            }

            {
                this.A00 = str;
            }
        });
        C14360o3.A07(newFixedThreadPool);
        this.A01 = newFixedThreadPool;
        final String str2 = "FrescoDecodeExecutor";
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(i, new ThreadFactory(str2) { // from class: X.1WG
            public final String A00;
            public final AtomicInteger A01 = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                C14360o3.A0B(runnable, 0);
                return new Thread(new TNV(this, runnable), AnonymousClass001.A0G(this.A00, '-', this.A01.getAndIncrement()));
            }

            {
                this.A00 = str2;
            }
        });
        C14360o3.A07(newFixedThreadPool2);
        this.A00 = newFixedThreadPool2;
        final String str3 = "FrescoBackgroundExecutor";
        ExecutorService newFixedThreadPool3 = Executors.newFixedThreadPool(i, new ThreadFactory(str3) { // from class: X.1WG
            public final String A00;
            public final AtomicInteger A01 = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                C14360o3.A0B(runnable, 0);
                return new Thread(new TNV(this, runnable), AnonymousClass001.A0G(this.A00, '-', this.A01.getAndIncrement()));
            }

            {
                this.A00 = str3;
            }
        });
        C14360o3.A07(newFixedThreadPool3);
        this.A03 = newFixedThreadPool3;
        final String str4 = "FrescoLightWeightBackgroundExecutor";
        ExecutorService newFixedThreadPool4 = Executors.newFixedThreadPool(1, new ThreadFactory(str4) { // from class: X.1WG
            public final String A00;
            public final AtomicInteger A01 = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                C14360o3.A0B(runnable, 0);
                return new Thread(new TNV(this, runnable), AnonymousClass001.A0G(this.A00, '-', this.A01.getAndIncrement()));
            }

            {
                this.A00 = str4;
            }
        });
        C14360o3.A07(newFixedThreadPool4);
        this.A02 = newFixedThreadPool4;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i, new ThreadFactory(str3) { // from class: X.1WG
            public final String A00;
            public final AtomicInteger A01 = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                C14360o3.A0B(runnable, 0);
                return new Thread(new TNV(this, runnable), AnonymousClass001.A0G(this.A00, '-', this.A01.getAndIncrement()));
            }

            {
                this.A00 = str3;
            }
        });
        C14360o3.A07(newScheduledThreadPool);
        this.A04 = newScheduledThreadPool;
    }
}
