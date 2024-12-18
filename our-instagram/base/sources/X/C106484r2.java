package X;

import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.common.hiddenapis2.ApiExemption;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4r2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106484r2 {
    public static C106484r2 A06;
    public C0f6 A00;
    public Thread A01;
    public C106524r6 A02;
    public final Object A03 = new Object();
    public final List A04;
    public final List A05;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.Object r8) {
        /*
            r7 = this;
            r1 = r8
            boolean r0 = r8 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r0 != 0) goto L43
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Field[] r6 = r0.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
        Lf:
            if (r4 >= r5) goto L66
            r3 = r6[r4]
            java.lang.Class<java.util.concurrent.ThreadPoolExecutor> r1 = java.util.concurrent.ThreadPoolExecutor.class
            java.lang.Class r0 = r3.getType()
            boolean r0 = r1.isAssignableFrom(r0)
            r2 = 1
            if (r0 == 0) goto L2a
            r3.setAccessible(r2)
            java.lang.Object r1 = r3.get(r8)     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1     // Catch: java.lang.Throwable -> L2a
            goto L45
        L2a:
            java.lang.Class<java.util.concurrent.Executor> r1 = java.util.concurrent.Executor.class
            java.lang.Class r0 = r3.getType()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L4b
            r3.setAccessible(r2)
            java.lang.Object r1 = r3.get(r8)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4b
            boolean r0 = r1 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r0 == 0) goto L4b
        L43:
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
        L45:
            if (r1 == 0) goto L66
            java.lang.Object r3 = r7.A03
            monitor-enter(r3)
            goto L4e
        L4b:
            int r4 = r4 + 1
            goto Lf
        L4e:
            boolean r0 = r8 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L60
            java.util.concurrent.ExecutorService r8 = (java.util.concurrent.ExecutorService) r8     // Catch: java.lang.Throwable -> L63
        L54:
            java.util.List r2 = r7.A04     // Catch: java.lang.Throwable -> L63
            X.TRn r0 = new X.TRn     // Catch: java.lang.Throwable -> L63
            r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> L63
            r2.add(r0)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            goto L62
        L60:
            r8 = r1
            goto L54
        L62:
            return
        L63:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r0
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106484r2.A04(java.lang.Object):void");
    }

    public static C106484r2 A00() {
        C106484r2 c106484r2 = A06;
        if (c106484r2 == null) {
            C106484r2 c106484r22 = new C106484r2();
            A06 = c106484r22;
            return c106484r22;
        }
        return c106484r2;
    }

    public final void A01(Handler handler) {
        synchronized (this.A03) {
            if (!RunnableC106494r3.A07.contains(handler.getLooper())) {
                this.A04.add(new RunnableC106494r3(handler));
            }
        }
    }

    public final void A02(Looper looper) {
        synchronized (this.A03) {
            if (!RunnableC106494r3.A07.contains(looper)) {
                this.A04.add(new RunnableC106494r3(new Handler(looper)));
            }
        }
    }

    public final void A03(InterfaceC106514r5 interfaceC106514r5) {
        synchronized (this.A03) {
            this.A02.A01.add(interfaceC106514r5);
        }
    }

    public final void A05(String str, Throwable th) {
        long j;
        C0f6 c0f6 = this.A00;
        if (c0f6 != null) {
            C0f5 AEq = c0f6.AEq(true, str, 157812016);
            AEq.ERI(th);
            AEq.ABX("app_in_foreground_v2", C0L6.A07());
            long uptimeMillis = SystemClock.uptimeMillis();
            if (C0L6.A04 == null) {
                j = 0;
            } else {
                j = C0L6.A04.A00;
            }
            AEq.ABV("time_since_app_start", uptimeMillis - j);
            AEq.ABW("asl_session_id", C0L6.A01());
            AEq.report();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.4r5] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.4r5] */
    public C106484r2() {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A05 = new ArrayList();
        ApiExemption.enableUnsafeExemption();
        ApiExemption.removeRestriction_DO_NOT_USE();
        HandlerThread handlerThread = new HandlerThread("watchdog.monitor", 0);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        java.util.Set set = RunnableC106494r3.A07;
        C106524r6 c106524r6 = new C106524r6(handlerThread.getLooper());
        this.A02 = c106524r6;
        arrayList.add(c106524r6);
        A02(Looper.getMainLooper());
        A03(new Object());
        A03(new InterfaceC106514r5() { // from class: X.4r8
            public Method A00;
            public boolean A01 = false;

            @Override // X.InterfaceC106514r5
            public final String getName() {
                return "BinderWatchdog";
            }

            @Override // X.InterfaceC106514r5
            public final void Cpp() {
                if (this.A00 == null && !this.A01) {
                    this.A01 = true;
                    try {
                        Method method = Binder.class.getMethod("blockUntilThreadAvailable", new Class[0]);
                        this.A00 = method;
                        method.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                }
                Method method2 = this.A00;
                if (method2 == null) {
                    return;
                }
                try {
                    method2.invoke(null, new Object[0]);
                } catch (Exception unused2) {
                }
            }
        });
        A03(new Object());
    }
}
