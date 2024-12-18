package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Ex, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Ex {
    public Map A00 = new HashMap();
    public final List A01 = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[Catch: all -> 0x007c, TryCatch #0 {, blocks: (B:4:0x0003, B:10:0x0019, B:11:0x002b, B:13:0x0031, B:21:0x0047, B:27:0x0051, B:28:0x0055, B:30:0x005b, B:24:0x0069, B:17:0x0076, B:35:0x000c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A01(java.lang.String r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 != 0) goto Lc
            java.util.Map r0 = r6.A00     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L19
            goto L7a
        Lc:
            java.util.Map r0 = r6.A00     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L19
            goto L7a
        L19:
            java.util.Map r1 = r6.A00     // Catch: java.lang.Throwable -> L7c
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7c
            r6.A00 = r0     // Catch: java.lang.Throwable -> L7c
            r0.put(r7, r8)     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = r6.A01     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L7c
        L2b:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L7c
            X.6FK r1 = (X.C6FK) r1     // Catch: java.lang.Throwable -> L7c
            java.lang.ref.WeakReference r0 = r1.A01     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L7c
            X.630 r4 = (X.AnonymousClass630) r4     // Catch: java.lang.Throwable -> L7c
            X.6FL r0 = r1.A00     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.A00     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L76
            if (r4 == 0) goto L76
            java.util.Map r0 = r1.A02     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L7c
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L69
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L7c
        L55:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L2b
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "gs"
            java.util.Map r0 = r6.A00     // Catch: java.lang.Throwable -> L7c
            r4.A0I(r0, r8, r1, r2)     // Catch: java.lang.Throwable -> L7c
            goto L55
        L69:
            java.lang.String r2 = "gs"
            java.util.Map r1 = r6.A00     // Catch: java.lang.Throwable -> L7c
            X.6DV r0 = new X.6DV     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L7c
            X.AnonymousClass630.A03(r0)     // Catch: java.lang.Throwable -> L7c
            goto L2b
        L76:
            r5.remove()     // Catch: java.lang.Throwable -> L7c
            goto L2b
        L7a:
            monitor-exit(r6)
            return
        L7c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6Ex.A01(java.lang.String, java.lang.Object):void");
    }

    public static C6FK A00(AnonymousClass630 anonymousClass630, C6Ex c6Ex) {
        List list = c6Ex.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6FK c6fk = (C6FK) it.next();
            Object obj = c6fk.A01.get();
            if (!c6fk.A00.A00 && obj != null) {
                if (obj == anonymousClass630) {
                    return c6fk;
                }
            } else {
                it.remove();
            }
        }
        C6FK c6fk2 = new C6FK(anonymousClass630);
        list.add(c6fk2);
        return c6fk2;
    }
}
