package com.google.common.util.concurrent;

import X.AbstractC25011Ke;
import X.AbstractC63327Shb;
import X.C00O;
import X.C1M8;
import X.C60786RSx;
import X.C73403Qr;
import X.C73413Qs;
import X.ExecutorC58470Pvv;
import X.ExecutorC64795TUj;
import X.ExecutorC64805TUt;
import X.InterfaceC216113n;
import X.InterfaceExecutorServiceC73393Qq;
import X.InterfaceScheduledExecutorServiceC73383Qp;
import X.RT0;
import X.RT1;
import X.RunnableC64655TOm;
import X.TQ9;
import X.TV8;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class MoreExecutors {
    public static Executor directExecutor() {
        return C1M8.A01;
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor executor) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        useDaemonThreadFactory(executor);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(executor);
        executor.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(executor);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TQ9(executor, 120L, timeUnit)));
        return unconfigurableExecutorService;
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        useDaemonThreadFactory(executor);
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(executor);
        executor.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(executor);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TQ9(executor, 120L, timeUnit)));
        return unconfigurableScheduledExecutorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:59:0x0031, B:7:0x0035, B:8:0x004b, B:11:0x0055, B:12:0x0085, B:54:0x00a3, B:55:0x00a8, B:15:0x006c, B:17:0x0076, B:19:0x008b, B:21:0x008d, B:32:0x0093, B:43:0x00bf, B:48:0x009d, B:50:0x007e), top: B:58:0x0031, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object invokeAnyImpl(X.InterfaceExecutorServiceC73393Qq r18, java.util.Collection r19, boolean r20, long r21, java.util.concurrent.TimeUnit r23) {
        /*
            r11 = r18
            r11.getClass()
            r2 = r23
            r2.getClass()
            int r5 = r19.size()
            r4 = 1
            r0 = 0
            if (r5 <= 0) goto L13
            r0 = 1
        L13:
            X.C18C.A0E(r0)
            java.lang.String r0 = "initialArraySize"
            X.AbstractC24841Jd.A00(r5, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r5)
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r0 = r21
            long r2 = r2.toNanos(r0)
            if (r20 == 0) goto L2e
            goto L31
        L2e:
            r17 = 0
            goto L35
        L31:
            long r17 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lc0
        L35:
            java.util.Iterator r16 = r19.iterator()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r0 = r16.next()     // Catch: java.lang.Throwable -> Lc0
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch: java.lang.Throwable -> Lc0
            com.google.common.util.concurrent.ListenableFuture r0 = submitAndAddQueueListener(r11, r0, r9)     // Catch: java.lang.Throwable -> Lc0
            r10.add(r0)     // Catch: java.lang.Throwable -> Lc0
            int r15 = r5 + (-1)
            r12 = 0
            r0 = r12
            r14 = 1
        L4b:
            java.lang.Object r13 = r9.poll()     // Catch: java.lang.Throwable -> Lc0
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> Lc0
            if (r13 != 0) goto L87
            if (r15 <= 0) goto L65
            int r15 = r15 + (-1)
            java.lang.Object r1 = r16.next()     // Catch: java.lang.Throwable -> Lc0
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch: java.lang.Throwable -> Lc0
            com.google.common.util.concurrent.ListenableFuture r1 = submitAndAddQueueListener(r11, r1, r9)     // Catch: java.lang.Throwable -> Lc0
            r10.add(r1)     // Catch: java.lang.Throwable -> Lc0
            goto L85
        L65:
            if (r14 != 0) goto L6a
            if (r0 != 0) goto La8
            goto La3
        L6a:
            if (r20 == 0) goto L7e
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r13 = r9.poll(r2, r1)     // Catch: java.lang.Throwable -> Lc0
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> Lc0
            if (r13 == 0) goto L9d
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lc0
            long r5 = r7 - r17
            long r2 = r2 - r5
            goto L89
        L7e:
            java.lang.Object r13 = r9.take()     // Catch: java.lang.Throwable -> Lc0
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> Lc0
            goto L87
        L85:
            int r14 = r14 + 1
        L87:
            r7 = r17
        L89:
            if (r13 == 0) goto L9a
            int r14 = r14 + (-1)
            java.lang.Object r2 = r13.get()     // Catch: java.lang.Exception -> L92 java.util.concurrent.ExecutionException -> L99 java.lang.InterruptedException -> Lbe java.lang.Throwable -> Lc0
            goto La9
        L92:
            r1 = move-exception
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lc0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            goto L9a
        L99:
            r0 = move-exception
        L9a:
            r17 = r7
            goto L4b
        L9d:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> Lc0
            r0.<init>()     // Catch: java.lang.Throwable -> Lc0
            goto La8
        La3:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lc0
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lc0
        La8:
            throw r0     // Catch: java.lang.Throwable -> Lc0
        La9:
            java.util.Iterator r1 = r10.iterator()
        Lad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r1.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            r0.cancel(r4)
            goto Lad
        Lbd:
            return r2
        Lbe:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r2 = move-exception
            java.util.Iterator r1 = r10.iterator()
        Lc5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld5
            java.lang.Object r0 = r1.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            r0.cancel(r4)
            goto Lc5
        Ld5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.MoreExecutors.invokeAnyImpl(X.3Qq, java.util.Collection, boolean, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public static boolean isAppEngineWithApiClasses() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) == null) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static InterfaceExecutorServiceC73393Qq listeningDecorator(ExecutorService delegate) {
        if (delegate instanceof InterfaceExecutorServiceC73393Qq) {
            return (InterfaceExecutorServiceC73393Qq) delegate;
        }
        if (delegate instanceof ScheduledExecutorService) {
            return new C73403Qr((ScheduledExecutorService) delegate);
        }
        return new C73413Qs(delegate);
    }

    public static InterfaceExecutorServiceC73393Qq newDirectExecutorService() {
        return new C60786RSx();
    }

    public static Executor newSequentialExecutor(Executor delegate) {
        return new ExecutorC64805TUt(delegate);
    }

    public static void addDelayedShutdownHook(ExecutorService service, long terminationTimeout, TimeUnit timeUnit) {
        service.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(service);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TQ9(service, terminationTimeout, timeUnit)));
    }

    public static Thread newThread(String name, Runnable runnable) {
        name.getClass();
        runnable.getClass();
        Thread newThread = platformThreadFactory().newThread(runnable);
        newThread.getClass();
        try {
            newThread.setName(name);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    public static ThreadFactory platformThreadFactory() {
        if (!isAppEngineWithApiClasses()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (InvocationTargetException e2) {
            AbstractC63327Shb.A02(e2.getCause());
            throw C00O.createAndThrow();
        }
    }

    public static Executor rejectionPropagatingExecutor(final Executor delegate, final AbstractC25011Ke future) {
        delegate.getClass();
        future.getClass();
        if (delegate == C1M8.A01) {
            return delegate;
        }
        return new ExecutorC58470Pvv(future, delegate);
    }

    public static Executor renamingDecorator(final Executor executor, final InterfaceC216113n nameSupplier) {
        executor.getClass();
        nameSupplier.getClass();
        return new ExecutorC64795TUj(nameSupplier, executor);
    }

    public static boolean shutdownAndAwaitTermination(ExecutorService service, long timeout, TimeUnit unit) {
        long nanos = unit.toNanos(timeout) / 2;
        service.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (!service.awaitTermination(nanos, timeUnit)) {
                service.shutdownNow();
                service.awaitTermination(nanos, timeUnit);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            service.shutdownNow();
        }
        return service.isTerminated();
    }

    public static ListenableFuture submitAndAddQueueListener(InterfaceExecutorServiceC73393Qq executorService, Callable task, final BlockingQueue queue) {
        ListenableFuture submit = executorService.submit(task);
        submit.addListener(new RunnableC64655TOm(submit, queue), C1M8.A01);
        return submit;
    }

    public static void useDaemonThreadFactory(ThreadPoolExecutor executor) {
        ThreadFactory threadFactory = executor.getThreadFactory();
        threadFactory.getClass();
        executor.setThreadFactory(new TV8(threadFactory));
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        useDaemonThreadFactory(executor);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(executor);
        executor.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(executor);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TQ9(executor, terminationTimeout, timeUnit)));
        return unconfigurableExecutorService;
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        useDaemonThreadFactory(executor);
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(executor);
        executor.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(executor);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TQ9(executor, terminationTimeout, timeUnit)));
        return unconfigurableScheduledExecutorService;
    }

    public static InterfaceScheduledExecutorServiceC73383Qp listeningDecorator(ScheduledExecutorService delegate) {
        if (delegate instanceof InterfaceScheduledExecutorServiceC73383Qp) {
            return (InterfaceScheduledExecutorServiceC73383Qp) delegate;
        }
        return new C73403Qr(delegate);
    }

    public static ExecutorService renamingDecorator(final ExecutorService service, final InterfaceC216113n nameSupplier) {
        service.getClass();
        nameSupplier.getClass();
        return new RT0(nameSupplier, service);
    }

    public static ScheduledExecutorService renamingDecorator(final ScheduledExecutorService service, final InterfaceC216113n nameSupplier) {
        service.getClass();
        nameSupplier.getClass();
        return new RT1(nameSupplier, service);
    }
}
