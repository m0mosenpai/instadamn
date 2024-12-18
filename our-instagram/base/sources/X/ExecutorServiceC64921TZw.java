package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.TZw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorServiceC64921TZw extends AbstractExecutorService implements ExecutorService, ScheduledExecutorService {
    public static final String A0A = AnonymousClass001.A0R(ExecutorServiceC64921TZw.class.getCanonicalName(), ".ACTION_ALARM.");
    public final Handler A00;
    public final String A01;
    public final AlarmManager A03;
    public final PendingIntent A04;
    public final BroadcastReceiver A05;
    public final Context A06;
    public final RealtimeSinceBootClock A07;
    public final C3UW A08;
    public final AtomicLong A09 = AbstractC58318PtA.A15(-1);
    public final PriorityQueue A02 = new PriorityQueue();

    public static void A01(ExecutorServiceC64921TZw executorServiceC64921TZw) {
        ArrayList A1E;
        synchronized (executorServiceC64921TZw) {
            A1E = AbstractC166987dD.A1E();
            while (true) {
                PriorityQueue priorityQueue = executorServiceC64921TZw.A02;
                if (priorityQueue.isEmpty() || ((C64525TIb) priorityQueue.peek()).A00 > SystemClock.elapsedRealtime()) {
                    break;
                } else {
                    A1E.add(((C64525TIb) priorityQueue.remove()).A01);
                }
            }
            A02(executorServiceC64921TZw);
        }
        A1E.size();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            ((R6v) it.next()).run();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        submit(null, runnable);
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
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        R6v r6v = new R6v(this, null, runnable);
        AbstractC58320PtC.A1I(r6v, this, timeUnit, j);
        return r6v;
    }

    public static void A02(ExecutorServiceC64921TZw executorServiceC64921TZw) {
        PendingIntent pendingIntent = executorServiceC64921TZw.A04;
        if (pendingIntent == null) {
            C0K8.A0D("WakingExecutorService", "Pending intent is null, not scheduling intent to run");
            return;
        }
        PriorityQueue priorityQueue = executorServiceC64921TZw.A02;
        if (priorityQueue.isEmpty()) {
            executorServiceC64921TZw.A08.A03(executorServiceC64921TZw.A03, pendingIntent);
            return;
        }
        long j = ((C64525TIb) priorityQueue.peek()).A00;
        AtomicLong atomicLong = executorServiceC64921TZw.A09;
        if (atomicLong.get() == j) {
            return;
        }
        SystemClock.elapsedRealtime();
        executorServiceC64921TZw.A08.A04(executorServiceC64921TZw.A06, executorServiceC64921TZw.A03, 2, j, pendingIntent);
        atomicLong.set(j);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final R6v submit(Object obj, Runnable runnable) {
        R6v r6v = new R6v(this, obj, runnable);
        A00(r6v, this, SystemClock.elapsedRealtime());
        this.A00.post(new RunnableC64584TKv(this));
        return r6v;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC60557R6u(this, obj, runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        PendingIntent pendingIntent = this.A04;
        if (pendingIntent != null) {
            this.A08.A03(this.A03, pendingIntent);
        }
        try {
            this.A06.unregisterReceiver(this.A05);
        } catch (IllegalArgumentException e) {
            C0K8.A0I("WakingExecutorService", "Failed to unregister broadcast receiver", e);
        }
    }

    public ExecutorServiceC64921TZw(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, C3UW c3uw, C62670SLh c62670SLh, String str) {
        PendingIntent pendingIntent;
        StringBuilder A0s = AbstractC58318PtA.A0s(A0A);
        AbstractC58323PtF.A11(context, str, A0s);
        String obj = A0s.toString();
        this.A01 = obj;
        this.A06 = context;
        this.A07 = realtimeSinceBootClock;
        AbstractC64515THi A00 = c62670SLh.A00(AlarmManager.class, "alarm");
        if (A00 instanceof C60546R6j) {
            throw AbstractC166987dD.A12("Cannot acquire Alarm service");
        }
        this.A03 = (AlarmManager) A00.A01();
        this.A00 = handler;
        this.A08 = c3uw;
        Intent A0B = AbstractC58320PtC.A0B(context, obj);
        try {
            C04750Mt c04750Mt = new C04750Mt();
            c04750Mt.A0A(A0B);
            c04750Mt.A09();
            pendingIntent = c04750Mt.A02(context, 0, 134217728);
        } catch (SecurityException e) {
            pendingIntent = null;
            C0K8.A0G("WakingExecutorService", "Failed to create pending intent", e);
        }
        this.A04 = pendingIntent;
        Q1k q1k = new Q1k(this, 6);
        this.A05 = q1k;
        this.A08.A07(q1k, this.A06, new IntentFilter(this.A01), handler, false);
    }

    public static void A00(R6v r6v, ExecutorServiceC64921TZw executorServiceC64921TZw, long j) {
        SystemClock.elapsedRealtime();
        synchronized (executorServiceC64921TZw) {
            executorServiceC64921TZw.A02.add(new C64525TIb(r6v, j));
            A02(executorServiceC64921TZw);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC60557R6u(this, callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        R6v r6v = new R6v(this, callable);
        AbstractC58320PtC.A1I(r6v, this, timeUnit, j);
        return r6v;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        R6v r6v = new R6v(this, callable);
        AbstractC58320PtC.A1I(r6v, this, timeUnit, 0L);
        this.A00.post(new RunnableC64583TKu(this));
        return r6v;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return submit(null, runnable);
    }
}
