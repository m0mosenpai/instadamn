package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.LruCache;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8en, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191918en extends LruCache implements InterfaceC191828ee, InterfaceC13000lm, C6DR {
    public C191918en() {
        super(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    @Override // X.InterfaceC191828ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AUs(android.content.Context r17, X.AbstractC191868ei r18) {
        /*
            r16 = this;
            r7 = r18
            java.lang.String r0 = r7.A01()
            r1 = r16
            r1.put(r0, r7)
            X.8ep r6 = X.C191938ep.A04
            java.lang.String r1 = "IgBloksDataProps"
            java.lang.String r0 = "_parallelFetchData"
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            X.C1LV.A02(r0)
            r10 = 2
            r14 = -1
            r11 = 3
            r13 = 0
            r3 = 0
            r8 = r17
            X.8es r9 = r6.A01(r7)     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto L7a
            java.lang.String r0 = "_getData"
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Throwable -> L74
            X.C1LV.A02(r0)     // Catch: java.lang.Throwable -> L74
            X.8et r1 = new X.8et     // Catch: java.lang.Throwable -> L74
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L74
            r0 = r7
            X.8eh r0 = (X.C191858eh) r0     // Catch: java.lang.Throwable -> L74
            X.8f4 r12 = X.AbstractC191988eu.A00(r1, r0)     // Catch: java.lang.Throwable -> L74
            X.C1LV.A01()     // Catch: java.lang.Throwable -> L74
            X.8eq r5 = r6.A02     // Catch: java.lang.Throwable -> L74
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L74
            X.8es r9 = r6.A01(r7)     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L4d
            r12.A02()     // Catch: java.lang.Throwable -> L71
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L71
            goto L7a
        L4d:
            X.0yX r1 = r6.A01     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r7.A01()     // Catch: java.lang.Throwable -> L6f
            r1.remove(r0)     // Catch: java.lang.Throwable -> L6f
            X.8es r2 = new X.8es     // Catch: java.lang.Throwable -> L71
            r2.<init>(r12, r13, r3)     // Catch: java.lang.Throwable -> L71
            X.0yX r1 = r6.A00     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r7.A01()     // Catch: java.lang.Throwable -> L71
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L71
            r12.A03(r13)     // Catch: java.lang.Throwable -> L74
            r7.A00()
            r7.A00()
            goto L9a
        L6f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L71
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r5 = move-exception
            if (r9 == 0) goto La0
            long r1 = r9.A01
            goto La2
        L7a:
            long r0 = r9.A01
            r7.A00()
            r7.A00()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L8a
            int r2 = r9.A00
            if (r2 != r11) goto L8f
        L8a:
            X.8f5 r2 = r9.A02
            r2.A03(r10)
        L8f:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L9a
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L9a
            r6.A03(r8, r7, r0)
        L9a:
            X.C1LV.A01()
            return
        L9e:
            r5 = move-exception
            r9 = 0
        La0:
            r1 = 0
        La2:
            r7.A00()
            r7.A00()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lc6
            if (r9 == 0) goto Lb7
            int r0 = r9.A00
            if (r0 != r11) goto Lb7
        Lb2:
            X.8f5 r0 = r9.A02
            r0.A03(r10)
        Lb7:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Lc2
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto Lc2
            r6.A03(r8, r7, r1)
        Lc2:
            X.C1LV.A01()
            throw r5
        Lc6:
            if (r9 == 0) goto Lb7
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191918en.AUs(android.content.Context, X.8ei):void");
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        AbstractC191868ei abstractC191868ei = (AbstractC191868ei) obj2;
        if (z) {
            C191938ep.A04.A02(abstractC191868ei);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r6 == null) goto L9;
     */
    @Override // X.InterfaceC191828ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C8f5 Bo6(android.content.Context r13, X.AbstractC191868ei r14) {
        /*
            r12 = this;
            java.lang.String r0 = r14.A01()
            r12.put(r0, r14)
            X.8ep r5 = X.C191938ep.A04
            r10 = -1
            r8 = 0
            r3 = 0
            X.8es r6 = r5.A01(r14)     // Catch: java.lang.Throwable -> La1
            if (r6 == 0) goto L26
            long r0 = r6.A01     // Catch: java.lang.Throwable -> La1
            r14.A00()     // Catch: java.lang.Throwable -> La1
            r14.A00()     // Catch: java.lang.Throwable -> La1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L24
            X.8es r6 = r5.A02(r14)     // Catch: java.lang.Throwable -> La1
        L24:
            if (r6 != 0) goto L3e
        L26:
            X.8et r1 = new X.8et     // Catch: java.lang.Throwable -> La1
            r1.<init>(r13, r14)     // Catch: java.lang.Throwable -> La1
            r0 = r14
            X.8eh r0 = (X.C191858eh) r0     // Catch: java.lang.Throwable -> La1
            X.8f4 r0 = X.AbstractC191988eu.A00(r1, r0)     // Catch: java.lang.Throwable -> La1
            r14.A00()     // Catch: java.lang.Throwable -> La1
            r14.A00()     // Catch: java.lang.Throwable -> La1
            X.8es r6 = new X.8es     // Catch: java.lang.Throwable -> La1
            r6.<init>(r0, r8, r3)     // Catch: java.lang.Throwable -> La1
            r8 = 1
        L3e:
            int r9 = r6.A00     // Catch: java.lang.Throwable -> L79
            X.8f5 r7 = r6.A02     // Catch: java.lang.Throwable -> L79
            long r0 = r6.A01
            r14.A00()
            r14.A00()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L68
            if (r8 == 0) goto L61
            X.8eq r4 = r5.A02
            monitor-enter(r4)
            X.0yX r3 = r5.A00     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r14.A01()     // Catch: java.lang.Throwable -> L5e
            r3.put(r2, r6)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            throw r0
        L61:
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L68
            r5.A03(r13, r14, r0)
        L68:
            if (r8 == 0) goto L74
            if (r9 == 0) goto L6f
            r0 = 4
            if (r9 != r0) goto L74
        L6f:
            r0 = 0
        L70:
            r7.A03(r0)
        L73:
            return r7
        L74:
            r0 = 3
            if (r9 != r0) goto L73
            r0 = 2
            goto L70
        L79:
            r7 = move-exception
            long r1 = r6.A01
            r14.A00()
            r14.A00()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto La2
            if (r8 == 0) goto L99
            X.8eq r4 = r5.A02
            monitor-enter(r4)
            X.0yX r3 = r5.A00     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r14.A01()     // Catch: java.lang.Throwable -> L96
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L96
            goto L99
        L96:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L96
            throw r0
        L99:
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto La2
            r5.A03(r13, r14, r1)
            throw r7
        La1:
            r7 = move-exception
        La2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191918en.Bo6(android.content.Context, X.8ei):X.8f5");
    }

    @Override // X.InterfaceC191828ee
    public final C191968es COu(Context context, AbstractC191868ei abstractC191868ei) {
        remove(abstractC191868ei.A01());
        return C191938ep.A04.A02(abstractC191868ei);
    }

    @Override // X.C6DR
    public final void D8j() {
        evictAll();
    }

    @Override // X.InterfaceC191828ee
    public final C3AY E5C(Context context, AbstractC191868ei abstractC191868ei, long j) {
        C20030yX c20030yX;
        C3AY c3ay;
        put(abstractC191868ei.A01(), abstractC191868ei);
        C191938ep c191938ep = C191938ep.A04;
        C1LV.A02(AnonymousClass001.A0R("IgBloksDataProps", "_registerForPrefetch"));
        try {
            String A01 = abstractC191868ei.A01();
            C191948eq c191948eq = c191938ep.A02;
            synchronized (c191948eq) {
                try {
                    c20030yX = c191938ep.A01;
                    if (!c20030yX.containsKey(A01)) {
                        c20030yX.put(A01, Long.valueOf(SystemClock.uptimeMillis()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C1LV.A01();
            long millis = TimeUnit.SECONDS.toMillis(j);
            C1LV.A02(AnonymousClass001.A0R("IgBloksDataProps", "_prefetchData"));
            synchronized (c191948eq) {
                try {
                    if (((Long) c20030yX.remove(abstractC191868ei.A01())) == null) {
                        c3ay = new C3AY(null, false);
                    } else {
                        C191968es A012 = c191938ep.A01(abstractC191868ei);
                        if (A012 != null) {
                            C191968es c191968es = new C191968es(A012.A02, A012.A00, millis);
                            c191938ep.A00.put(abstractC191868ei.A01(), c191968es);
                            abstractC191868ei.A00();
                            c191938ep.A03(context, abstractC191868ei, millis);
                            c3ay = new C3AY(c191968es.A02, false);
                        } else {
                            C8f4 A00 = AbstractC191988eu.A00(new C191978et(context, abstractC191868ei), (C191858eh) abstractC191868ei);
                            C191968es c191968es2 = new C191968es(A00, 3, millis);
                            synchronized (c191948eq) {
                                try {
                                    c191938ep.A00.put(abstractC191868ei.A01(), c191968es2);
                                } finally {
                                }
                            }
                            A00.A03(3);
                            c191938ep.A03(context, abstractC191868ei, millis);
                            c3ay = new C3AY(A00, true);
                        }
                    }
                } finally {
                }
            }
            return c3ay;
        } finally {
            C1LV.A01();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C63W c63w;
        C102934kU c102934kU = C1LZ.A00().A07;
        if (c102934kU != null && (c63w = (C63W) c102934kU.A00()) != null) {
            c63w.A00.remove(this);
        }
        evictAll();
    }
}
