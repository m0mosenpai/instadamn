package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.8Kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC185578Kz {
    public static final Object A00 = new Object();
    public static volatile ScheduledExecutorService A01;

    public static final ScheduledExecutorService A00() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = A01;
        if (scheduledExecutorService2 != null) {
            return scheduledExecutorService2;
        }
        synchronized (A00) {
            scheduledExecutorService = A01;
            if (scheduledExecutorService == null) {
                final C12T c12t = C12P.A00;
                scheduledExecutorService = new ScheduledExecutorService(c12t) { // from class: X.8L0
                    public final C12T A00;
                    public final C19L A01;

                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        C14360o3.A0B(runnable, 0);
                        C19L c19l = this.A01;
                        C206629Ct c206629Ct = new C206629Ct(runnable, null, 5);
                        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final List invokeAll(Collection collection) {
                        C14360o3.A0B(collection, 0);
                        return A01(collection, B90.A00);
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final Object invokeAny(Collection collection) {
                        C14360o3.A0B(collection, 0);
                        return A00(collection, B91.A00);
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final boolean isShutdown() {
                        return false;
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final boolean isTerminated() {
                        return false;
                    }

                    @Override // java.util.concurrent.ScheduledExecutorService
                    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
                        C14360o3.A0B(runnable, 0);
                        C14360o3.A0B(timeUnit, 2);
                        long millis = timeUnit.toMillis(j);
                        MA4 ma4 = new MA4(null, runnable, millis);
                        C19L c19l = this.A01;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new MBs(ma4, (InterfaceC23621Ds) null, 4, millis), c19l);
                        return ma4;
                    }

                    @Override // java.util.concurrent.ScheduledExecutorService
                    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
                        C14360o3.A0B(runnable, 0);
                        C14360o3.A0B(timeUnit, 3);
                        long millis = timeUnit.toMillis(j);
                        MA4 ma4 = new MA4(null, runnable, millis);
                        C19L c19l = this.A01;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new C50123MBx(ma4, timeUnit, null, 0, j2, millis), c19l);
                        return ma4;
                    }

                    @Override // java.util.concurrent.ScheduledExecutorService
                    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
                        C14360o3.A0B(runnable, 0);
                        C14360o3.A0B(timeUnit, 3);
                        long millis = timeUnit.toMillis(j);
                        MA4 ma4 = new MA4(null, runnable, millis);
                        C19L c19l = this.A01;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new C50123MBx(ma4, timeUnit, null, 1, j2, millis), c19l);
                        return ma4;
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final Future submit(Runnable runnable) {
                        C14360o3.A0B(runnable, 0);
                        MA4 ma4 = new MA4(null, runnable, 0L);
                        C19L c19l = this.A01;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new MW8(ma4, null, 38), c19l);
                        return ma4;
                    }

                    private final List A01(Collection collection, InterfaceC16660sJ interfaceC16660sJ) {
                        ArrayList<Future> arrayList = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(submit((Callable) it.next()));
                        }
                        for (Future future : arrayList) {
                            if (!future.isDone()) {
                                try {
                                    interfaceC16660sJ.invoke(future);
                                } catch (CancellationException | ExecutionException unused) {
                                } catch (TimeoutException unused2) {
                                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(Boolean.valueOf(((Future) it2.next()).cancel(false)));
                                    }
                                }
                            }
                        }
                        return arrayList;
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
                        throw new UnsupportedOperationException("Shutdown not supported");
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final void shutdown() {
                        throw new UnsupportedOperationException("Shutdown not supported");
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final List shutdownNow() {
                        throw new UnsupportedOperationException("Shutdown not supported");
                    }

                    {
                        this.A00 = c12t;
                        this.A01 = AnonymousClass194.A02(c12t);
                    }

                    private final Object A00(Collection collection, InterfaceC16660sJ interfaceC16660sJ) {
                        if (!collection.isEmpty()) {
                            ExecutionException e = null;
                            Iterator it = collection.iterator();
                            while (it.hasNext()) {
                                Future submit = submit((Callable) it.next());
                                try {
                                    return interfaceC16660sJ.invoke(submit);
                                } catch (RuntimeException e2) {
                                    e = new ExecutionException(e2);
                                } catch (ExecutionException e3) {
                                    e = e3;
                                } catch (TimeoutException e4) {
                                    submit.cancel(false);
                                    throw e4;
                                }
                            }
                            if (e == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw e;
                        }
                        throw new IllegalStateException("Check failed.");
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
                        C14360o3.A0B(collection, 0);
                        C14360o3.A0B(timeUnit, 2);
                        return A01(collection, new JXD(SystemClock.elapsedRealtime() + timeUnit.toMillis(j), 2));
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
                        C14360o3.A0B(collection, 0);
                        C14360o3.A0B(timeUnit, 2);
                        return A00(collection, new JXD(SystemClock.elapsedRealtime() + timeUnit.toMillis(j), 3));
                    }

                    @Override // java.util.concurrent.ScheduledExecutorService
                    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
                        C14360o3.A0B(callable, 0);
                        C14360o3.A0B(timeUnit, 2);
                        long millis = timeUnit.toMillis(j);
                        MA4 ma4 = new MA4(callable, millis);
                        C19L c19l = this.A01;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new MBs(ma4, (InterfaceC23621Ds) null, 5, millis), c19l);
                        return ma4;
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final Future submit(Runnable runnable, Object obj) {
                        C14360o3.A0B(runnable, 0);
                        MA4 ma4 = new MA4(obj, runnable, 0L);
                        C19L c19l = this.A01;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new MW8(ma4, null, 37), c19l);
                        return ma4;
                    }

                    @Override // java.util.concurrent.ExecutorService
                    public final Future submit(Callable callable) {
                        C14360o3.A0B(callable, 0);
                        MA4 ma4 = new MA4(callable, 0L);
                        C19L c19l = this.A01;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new MW8(ma4, null, 36), c19l);
                        return ma4;
                    }
                };
                A01 = scheduledExecutorService;
            }
        }
        return scheduledExecutorService;
    }
}
