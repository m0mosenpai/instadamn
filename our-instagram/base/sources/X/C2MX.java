package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2MX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2MX implements C2MZ {
    public static final String A0B = C48442Kl.A01("Processor");
    public Context A00;
    public WorkDatabase A02;
    public C2LC A03;
    public C2L2 A08;
    public Map A04 = new HashMap();
    public Map A05 = new HashMap();
    public java.util.Set A07 = new HashSet();
    public final List A0A = new ArrayList();
    public PowerManager.WakeLock A01 = null;
    public final Object A09 = new Object();
    public Map A06 = new HashMap();

    public static RunnableC52072a7 A00(C2MX c2mx, String str) {
        RunnableC52072a7 runnableC52072a7 = (RunnableC52072a7) c2mx.A05.remove(str);
        boolean z = true;
        if (runnableC52072a7 == null) {
            z = false;
            runnableC52072a7 = (RunnableC52072a7) c2mx.A04.remove(str);
        }
        c2mx.A06.remove(str);
        if (z) {
            synchronized (c2mx.A09) {
                if (!(!r2.isEmpty())) {
                    Context context = c2mx.A00;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (Throwable th) {
                        C48442Kl.A00();
                        android.util.Log.e(A0B, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = c2mx.A01;
                    if (wakeLock != null) {
                        AbstractC09820fg.A01(wakeLock);
                        c2mx.A01 = null;
                    }
                }
            }
            return runnableC52072a7;
        }
        return runnableC52072a7;
    }

    public static void A01(RunnableC52072a7 runnableC52072a7, int i) {
        if (runnableC52072a7 != null) {
            runnableC52072a7.A0H = i;
            RunnableC52072a7.A01(runnableC52072a7);
            C49182Nr c49182Nr = runnableC52072a7.A0F;
            c49182Nr.cancel(true);
            if (runnableC52072a7.A03 != null && c49182Nr.isCancelled()) {
                runnableC52072a7.A03.stop(i);
            } else {
                C48442Kl.A00();
            }
        }
        C48442Kl.A00();
    }

    public final void A02(InterfaceC48932Mm executionListener) {
        synchronized (this.A09) {
            this.A0A.add(executionListener);
        }
    }

    public final void A03(InterfaceC48932Mm executionListener) {
        synchronized (this.A09) {
            this.A0A.remove(executionListener);
        }
    }

    public final boolean A04(C1114150f startStopToken, C1113750b runtimeExtras) {
        final C2WP c2wp = runtimeExtras.A00;
        final String str = c2wp.A01;
        final ArrayList arrayList = new ArrayList();
        WorkDatabase workDatabase = this.A02;
        C48412Ki c48412Ki = (C48412Ki) workDatabase.runInTransaction(new Callable() { // from class: X.50e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2MX c2mx = C2MX.this;
                ArrayList arrayList2 = arrayList;
                String str2 = str;
                WorkDatabase workDatabase2 = c2mx.A02;
                arrayList2.addAll(workDatabase2.A06().C55(str2));
                return workDatabase2.A05().CHq(str2);
            }
        });
        if (c48412Ki == null) {
            C48442Kl.A00();
            String str2 = A0B;
            StringBuilder sb = new StringBuilder();
            sb.append("Didn't find WorkSpec for id ");
            sb.append(c2wp);
            android.util.Log.w(str2, sb.toString());
            ((C2LB) this.A03).A02.execute(new Runnable() { // from class: X.5IZ
                @Override // java.lang.Runnable
                public final void run() {
                    C2MX c2mx = C2MX.this;
                    C2WP c2wp2 = c2wp;
                    synchronized (c2mx.A09) {
                        Iterator it = c2mx.A0A.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC48932Mm) it.next()).DEk(c2wp2, false);
                        }
                    }
                }
            });
            return false;
        }
        synchronized (this.A09) {
            if (A05(str)) {
                java.util.Set set = (java.util.Set) this.A06.get(str);
                if (((C1113750b) set.iterator().next()).A00.A00 == c2wp.A00) {
                    set.add(runtimeExtras);
                    C48442Kl.A00();
                    return false;
                }
            } else if (c48412Ki.A0K == c2wp.A00) {
                Context context = this.A00;
                C2L2 c2l2 = this.A08;
                C2LC c2lc = this.A03;
                C1114150f c1114150f = new C1114150f();
                Context applicationContext = context.getApplicationContext();
                if (startStopToken != null) {
                    c1114150f = startStopToken;
                }
                final RunnableC52072a7 runnableC52072a7 = new RunnableC52072a7(applicationContext, c2l2, c1114150f, workDatabase, this, c48412Ki, c2lc, arrayList);
                final C49182Nr c49182Nr = runnableC52072a7.A0A;
                C2LB c2lb = (C2LB) c2lc;
                c49182Nr.addListener(new Runnable() { // from class: X.50k
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        C2MX c2mx = C2MX.this;
                        ListenableFuture listenableFuture = c49182Nr;
                        RunnableC52072a7 runnableC52072a72 = runnableC52072a7;
                        try {
                            z = ((Boolean) listenableFuture.get()).booleanValue();
                        } catch (InterruptedException | ExecutionException unused) {
                            z = true;
                        }
                        synchronized (c2mx.A09) {
                            C2WP A00 = C2WN.A00(runnableC52072a72.A08);
                            String str3 = A00.A01;
                            RunnableC52072a7 runnableC52072a73 = (RunnableC52072a7) c2mx.A05.get(str3);
                            if (runnableC52072a73 == null) {
                                runnableC52072a73 = (RunnableC52072a7) c2mx.A04.get(str3);
                            }
                            if (runnableC52072a73 == runnableC52072a72) {
                                C2MX.A00(c2mx, str3);
                            }
                            C48442Kl.A00();
                            Iterator it = c2mx.A0A.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC48932Mm) it.next()).DEk(A00, z);
                            }
                        }
                    }
                }, c2lb.A02);
                this.A04.put(str, runnableC52072a7);
                HashSet hashSet = new HashSet();
                hashSet.add(runtimeExtras);
                this.A06.put(str, hashSet);
                c2lb.A01.execute(runnableC52072a7);
                C48442Kl.A00();
                return true;
            }
            ((C2LB) this.A03).A02.execute(new Runnable() { // from class: X.5IZ
                @Override // java.lang.Runnable
                public final void run() {
                    C2MX c2mx = C2MX.this;
                    C2WP c2wp2 = c2wp;
                    synchronized (c2mx.A09) {
                        Iterator it = c2mx.A0A.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC48932Mm) it.next()).DEk(c2wp2, false);
                        }
                    }
                }
            });
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (((X.RunnableC52072a7) r3.A04.get(r4)) != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A09
            monitor-enter(r2)
            java.util.Map r0 = r3.A05     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1b
            X.2a7 r0 = (X.RunnableC52072a7) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L18
            java.util.Map r0 = r3.A04     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L1b
            X.2a7 r1 = (X.RunnableC52072a7) r1     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            if (r1 == 0) goto L19
        L18:
            r0 = 1
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2MX.A05(java.lang.String):boolean");
    }

    public C2MX(Context appContext, C2L2 configuration, WorkDatabase workTaskExecutor, C2LC workDatabase) {
        this.A00 = appContext;
        this.A08 = configuration;
        this.A03 = workDatabase;
        this.A02 = workTaskExecutor;
    }
}
