package X;

import android.os.ConditionVariable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0QO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QO {
    public static int A0G = -1;
    public static int A0H;
    public static boolean A0I;
    public static final C0DM A0J = new Object();
    public static volatile C0QO A0K;
    public final C0BH A02;
    public final String A03;
    public final ExecutorService A06;
    public final ThreadLocal A04 = new ThreadLocal();
    public final ReentrantLock A0C = new ReentrantLock();
    public final ReentrantLock A0B = new ReentrantLock();
    public final C005001p A01 = new C005001p(0);
    public final C012504o A00 = new C012504o(0);
    public final ArrayList A05 = new ArrayList();
    public final AtomicInteger A09 = new AtomicInteger();
    public final AtomicInteger A08 = new AtomicInteger();
    public final AtomicInteger A0F = new AtomicInteger();
    public final AtomicBoolean A07 = new AtomicBoolean();
    public final AtomicBoolean A0E = new AtomicBoolean();
    public final AtomicReference A0A = new AtomicReference();
    public final ConditionVariable A0D = new ConditionVariable(false);

    public static final synchronized void A00(C0QO c0qo) {
        synchronized (c0qo) {
            if (c0qo.A07.get() && A0K != null) {
                C0K8.A0D(c0qo.A03, "All work finished.");
                c0qo.A06.shutdown();
                c0qo.A0D.open();
                synchronized (C0DL.class) {
                    if (!C0DL.A01) {
                        C0DL.A01 = true;
                        C0DL.A00();
                    }
                }
                A0K = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(C0DR c0dr, String str, int[] iArr, int i) {
        C14360o3.A0B(c0dr, 0);
        Arrays.toString(iArr);
        boolean z = true;
        if (!this.A0E.getAndSet(true)) {
            this.A06.execute(new C0DS() { // from class: X.0QZ
                {
                    super(-1);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0QO c0qo = C0QO.this;
                    int i2 = 0;
                    while (true) {
                        if (!c0qo.A07.get() || c0qo.A09.get() != 0) {
                            C0BJ.A00("DeadlockMonitor.sleep");
                            try {
                                try {
                                    Thread.sleep(1000L);
                                    C0BI.A00();
                                    int i3 = i2 + 1;
                                    C0BJ.A00(AnonymousClass001.A0O("DeadlockMonitor.tick", i2));
                                    ReentrantLock reentrantLock = c0qo.A0B;
                                    reentrantLock.lock();
                                    try {
                                        C0QQ[] c0qqArr = (C0QQ[]) c0qo.A00.toArray(new C0QQ[0]);
                                        reentrantLock.unlock();
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        for (C0QQ c0qq : c0qqArr) {
                                            long j = uptimeMillis - c0qq.A04;
                                            if (j > 1000) {
                                                C0K8.A0P(c0qo.A03, "  Waiting on %s for %dms...", c0qq.A03, Long.valueOf(j));
                                            }
                                            if (!c0qq.A07 && j > 45000) {
                                                c0qq.A07 = true;
                                                String str2 = c0qo.A03;
                                                String str3 = c0qq.A03;
                                                C0K8.A0O(str2, "%s runtime has exceeded %dms.", str3, 45000);
                                                String valueOf = String.valueOf(c0qo.A0A.get());
                                                HashMap hashMap = new HashMap();
                                                hashMap.put("did_throw_in", valueOf);
                                                hashMap.put("task_thread_id", String.valueOf(c0qq.A05));
                                                Thread thread = c0qq.A06;
                                                if (thread != null) {
                                                    StringBuilder sb = new StringBuilder(1024);
                                                    StackTraceElement[] stackTrace = thread.getStackTrace();
                                                    C14360o3.A07(stackTrace);
                                                    for (StackTraceElement stackTraceElement : stackTrace) {
                                                        sb.append(stackTraceElement.toString());
                                                        sb.append("\n");
                                                    }
                                                    String obj = sb.toString();
                                                    C14360o3.A07(obj);
                                                    hashMap.put("task_thread_stack", obj);
                                                    hashMap.put("task_thread_is_interrupted", String.valueOf(thread.isInterrupted()));
                                                    hashMap.put("task_thread_state", thread.getState().toString());
                                                }
                                                String A0R = AnonymousClass001.A0R("init_anr_", str3);
                                                String A06 = AnonymousClass001.A06(45000, str3, " runtime has exceeded ", "ms.");
                                                HashMap hashMap2 = new HashMap();
                                                hashMap2.putAll(hashMap);
                                                C0MP.A03("0", "0", "0", "", hashMap2);
                                                C0MP.A04(A0R, hashMap2, A06);
                                                C0MP.A00().A05("android_large_soft_error", hashMap2);
                                            }
                                        }
                                        C0BI.A00();
                                        i2 = i3;
                                    } catch (Throwable th) {
                                        reentrantLock.unlock();
                                        throw th;
                                    }
                                } catch (InterruptedException e) {
                                    C0K8.A0F(c0qo.A03, "DeadlockMonitor interrupted", e);
                                    C0BI.A00();
                                    return;
                                }
                            } catch (Throwable th2) {
                                C0BI.A00();
                                throw th2;
                            }
                        } else {
                            return;
                        }
                    }
                }
            });
        }
        this.A09.getAndIncrement();
        C0QQ c0qq = new C0QQ(c0dr, this, str, i, this.A0F.getAndIncrement());
        ReentrantLock reentrantLock = this.A0C;
        reentrantLock.lock();
        if (iArr != null) {
            try {
                int length = iArr.length;
                if (length != 0) {
                    int i2 = 0;
                    do {
                        int i3 = iArr[i2];
                        C005001p c005001p = this.A01;
                        Integer valueOf = Integer.valueOf(i3);
                        C0DU c0du = (C0DU) c005001p.get(valueOf);
                        C0DU c0du2 = c0du;
                        if (c0du == null) {
                            Object obj = new Object();
                            c005001p.put(valueOf, obj);
                            c0du2 = obj;
                        }
                        if (!c0du2.A01) {
                            ArrayList arrayList = c0du2.A00;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c0du2.A00 = arrayList;
                            }
                            arrayList.add(c0qq);
                            c0qq.A00++;
                        }
                        i2++;
                    } while (i2 < length);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0qq.A00 != 0) {
            z = false;
        }
        if (z) {
            ExecutorService executorService = this.A06;
            int i4 = A0G;
            if (i4 == -1) {
                A0G = 0;
                i4 = 0;
            }
            executorService.execute(C0SX.A00(c0qq, str, i4));
        }
    }

    public final void A01() {
        if (!this.A07.getAndSet(true) && this.A09.get() == 0) {
            this.A06.execute(new C0DS() { // from class: X.0QP
                {
                    super(-1);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0QO.A00(C0QO.this);
                }
            });
        }
        this.A0D.block();
    }

    public C0QO(C0BH c0bh, ExecutorService executorService) {
        String str;
        String A0R;
        this.A06 = executorService;
        this.A02 = c0bh;
        C0JA A00 = C0JA.A00();
        C14360o3.A07(A00);
        if (A00.A04()) {
            A0R = "AppInitScheduler";
        } else {
            C0J9 c0j9 = A00.A00;
            if (c0j9 != null) {
                str = c0j9.A00;
            } else {
                str = null;
            }
            A0R = AnonymousClass001.A0R("AppInitScheduler/", str);
        }
        this.A03 = AnonymousClass001.A0R(A0R, "|Run");
    }
}
