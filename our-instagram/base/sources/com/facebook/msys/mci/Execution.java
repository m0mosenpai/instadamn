package com.facebook.msys.mci;

import X.AbstractC09780fb;
import X.AbstractRunnableC94874Os;
import X.AnonymousClass001;
import X.C0SX;
import X.C1EJ;
import X.C2NJ;
import android.os.Process;
import android.util.Pair;
import com.facebook.msys.mci.Execution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Execution {
    public static volatile boolean sInitialized;
    public static final Map sThreadIds;
    public static final ThreadLocal sThreadLocalExecutionContext;
    public static final AtomicInteger sThreadPriority;
    public static final ConcurrentHashMap sThreadPriorityMap;

    public static native void endFlowTracking(int i, int i2);

    public static void executeAfterWithPriority(AbstractRunnableC94874Os abstractRunnableC94874Os, AccountSession accountSession, int i, int i2, long j) {
        assertInitialized(abstractRunnableC94874Os.toString());
        if (nativeScheduleTask(abstractRunnableC94874Os, accountSession, i, 0, j / 1000.0d, abstractRunnableC94874Os.toString())) {
        } else {
            throw new RuntimeException(AnonymousClass001.A0O("UNKNOWN execution context ", i));
        }
    }

    public static void executeAsync(AbstractRunnableC94874Os abstractRunnableC94874Os, AccountSession accountSession, int i) {
        assertInitialized(abstractRunnableC94874Os.toString());
        executeAfterWithPriority(abstractRunnableC94874Os, accountSession, i, 0, 0L);
    }

    public static native int nativeGetExecutionContext();

    public static native Long nativeGetSessionedExecutionKey();

    public static native void nativeInitialize();

    public static native void nativeResetExecutorsTestingOnly();

    public static native boolean nativeScheduleTask(Runnable runnable, AccountSession accountSession, int i, int i2, double d, String str);

    public static native void nativeStartExecutor(long j);

    public static native void resetFlowTrackingInCurrentThread();

    public static native void setLoggingThresholds(double d, double d2);

    public static native void startFlowTracking(int i, int i2, String str);

    public static void assertInitialized(String str) {
        if (sInitialized) {
        } else {
            throw new RuntimeException(AnonymousClass001.A0g("Execution was called by ", str, " but was not initialized before being used"));
        }
    }

    public static int getExecutionContext() {
        Pair pair = (Pair) sThreadLocalExecutionContext.get();
        if (sInitialized && pair != null) {
            return ((Number) pair.first).intValue();
        }
        return 0;
    }

    public static Long getSessionedExecutionKey() {
        Pair pair = (Pair) sThreadLocalExecutionContext.get();
        if (sInitialized && pair != null) {
            return (Long) pair.second;
        }
        return null;
    }

    public static synchronized boolean initialize(Integer num, Executor executor) {
        boolean z;
        int i;
        synchronized (Execution.class) {
            AbstractC09780fb.A01("Execution.initialize", 1713876903);
            try {
                if (sInitialized) {
                    z = false;
                    i = -675244263;
                } else {
                    if (num != null) {
                        sThreadPriority.set(num.intValue());
                    }
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                    i = 554534967;
                }
                AbstractC09780fb.A00(i);
            } catch (Throwable th) {
                AbstractC09780fb.A00(-119872008);
                throw th;
            }
        }
        return z;
    }

    public static boolean isMCPEnabledForExecution() {
        synchronized (C1EJ.class) {
        }
        return false;
    }

    public static void setThreadPriorities(Integer num) {
        AtomicInteger atomicInteger = sThreadPriority;
        int intValue = num.intValue();
        atomicInteger.set(intValue);
        for (List list : sThreadIds.values()) {
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Process.setThreadPriority(((Integer) it.next()).intValue(), intValue);
                }
            }
        }
    }

    public static void startExecutorThread(final long j, final int i, String str) {
        new Thread(C0SX.A00(new Runnable() { // from class: X.4Ot
            @Override // java.lang.Runnable
            public final void run() {
                AtomicInteger atomicInteger = Execution.sThreadPriority;
                if (atomicInteger.get() != Integer.MIN_VALUE) {
                    Process.setThreadPriority(atomicInteger.get());
                }
                ConcurrentHashMap concurrentHashMap = Execution.sThreadPriorityMap;
                Integer valueOf = Integer.valueOf(i);
                if (concurrentHashMap.get(valueOf) != null) {
                    Process.setThreadPriority(((Number) concurrentHashMap.get(valueOf)).intValue());
                }
                Object obj = Execution.sThreadIds.get(valueOf);
                obj.getClass();
                ((List) obj).add(Integer.valueOf(Process.myTid()));
                Execution.nativeStartExecutor(j);
            }
        }, "MCIExecution", 0), AnonymousClass001.A0R(str, "Context")).start();
    }

    static {
        C2NJ.A00();
        sThreadPriority = new AtomicInteger(Integer.MIN_VALUE);
        sThreadIds = new HashMap<Integer, List<Integer>>() { // from class: X.2Ny
            {
                put(0, Collections.synchronizedList(new ArrayList(1)));
                put(1, Collections.synchronizedList(new ArrayList(1)));
                put(2, Collections.synchronizedList(new ArrayList(3)));
                put(3, Collections.synchronizedList(new ArrayList(1)));
                put(4, Collections.synchronizedList(new ArrayList(1)));
                put(5, Collections.synchronizedList(new ArrayList(1)));
                put(6, Collections.synchronizedList(new ArrayList(3)));
            }
        };
        sThreadPriorityMap = new ConcurrentHashMap();
        sThreadLocalExecutionContext = new ThreadLocal() { // from class: X.2O1
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Object initialValue() {
                return Pair.create(Integer.valueOf(Execution.nativeGetExecutionContext()), Execution.nativeGetSessionedExecutionKey());
            }
        };
    }

    public static void executePossiblySync(AbstractRunnableC94874Os abstractRunnableC94874Os, AccountSession accountSession, int i) {
        assertInitialized(abstractRunnableC94874Os.toString());
        if (getExecutionContext() == i) {
            abstractRunnableC94874Os.run();
        } else {
            executeAsync(abstractRunnableC94874Os, accountSession, i);
        }
    }

    public static synchronized boolean initialize() {
        boolean initialize;
        synchronized (Execution.class) {
            initialize = initialize(null, null);
        }
        return initialize;
    }
}
