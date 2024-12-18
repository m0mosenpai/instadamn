package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8f5, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8f5 {
    public final C191978et A00;
    public final AbstractC191868ei A01;
    public final C8f3 A02;
    public final InterfaceC192058f1 A03;

    public static void A01(C8f5 c8f5) {
        int intValue;
        ArrayList arrayList;
        C9QU c9qu = C9QU.A03;
        String A01 = c8f5.A01.A01();
        synchronized (c9qu.A01) {
            intValue = ((Integer) c9qu.A00.getOrDefault(A01, 0)).intValue();
        }
        if (intValue <= 0) {
            List list = c8f5.A02.A01;
            if (list != null && !list.isEmpty()) {
                return;
            }
            C191978et c191978et = c8f5.A00;
            synchronized (c191978et) {
                arrayList = new ArrayList(c191978et.A01);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C8f5 c8f52 = (C8f5) it.next();
                if (c8f52 != null) {
                    C8f4 c8f4 = (C8f4) c8f52;
                    if (c8f4.A02.compareAndSet(true, false)) {
                        C8f2 c8f2 = c8f4.A01;
                        InterfaceC192058f1 interfaceC192058f1 = c8f2.A02;
                        if (!interfaceC192058f1.CZZ()) {
                            interfaceC192058f1.E4t(new RunnableC24286Apr(c8f2), "Emitter_onDetach");
                        }
                    }
                    C8f2 c8f22 = c8f4.A01;
                    InterfaceC192058f1 interfaceC192058f12 = c8f22.A02;
                    if (interfaceC192058f12.CZZ()) {
                        C8f2.A01(c8f4, c8f22);
                    } else {
                        interfaceC192058f12.E4t(new RunnableC24576AuX(c8f4, c8f22), "Emitter_unsubscribe");
                    }
                    C8f3 c8f3 = c8f4.A00;
                    synchronized (c8f3) {
                        c8f3.A00 = null;
                    }
                    InterfaceC192058f1 interfaceC192058f13 = c8f3.A02;
                    if (interfaceC192058f13.CZZ()) {
                        List list2 = c8f3.A01;
                        if (list2 != null) {
                            list2.clear();
                        }
                    } else {
                        interfaceC192058f13.E4t(new RunnableC24285Apq(c8f3), "DataSynchronizer_removeAllDataObserver");
                    }
                }
            }
        }
    }

    public final void A02() {
        InterfaceC192058f1 interfaceC192058f1 = this.A03;
        if (interfaceC192058f1.CZZ()) {
            A01(this);
        } else {
            interfaceC192058f1.E4t(new RunnableC24284App(this), "CleanupDelegateData_destroyData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0036, code lost:
    
        if (r6 == 3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r20) {
        /*
            r19 = this;
            r10 = r19
            X.8f4 r10 = (X.C8f4) r10
            r9 = 0
            r0 = 1
            r1 = r20
            if (r20 == 0) goto L93
            if (r1 == r0) goto L96
            r12 = 2
            if (r1 != r12) goto L96
            X.8f3 r8 = r10.A00
            monitor-enter(r8)
            java.lang.Object r11 = r8.A00     // Catch: java.lang.Throwable -> L90
            monitor-exit(r8)
            X.8f2 r7 = r10.A01
            X.8ex r3 = r7.A01
            boolean r0 = r3 instanceof X.C192008ew
            if (r0 == 0) goto L7a
            X.8ew r3 = (X.C192008ew) r3
            java.util.concurrent.atomic.AtomicReference r0 = r3.A06
            java.lang.Object r0 = r0.get()
            r6 = 1
            if (r0 != 0) goto L32
            X.8ev r1 = r3.A02
            X.0ll r0 = r1.A04
            if (r0 != 0) goto L3d
            java.lang.String r0 = r1.A05
            if (r0 != 0) goto L3d
        L32:
            r0 = 3
            if (r6 == r12) goto L38
            r1 = 0
            if (r6 != r0) goto L87
        L38:
            r1 = 1
            if (r6 != r0) goto L87
            monitor-enter(r8)
            goto L7c
        L3d:
            java.util.concurrent.atomic.AtomicReference r0 = r3.A05
            java.lang.Object r2 = r0.get()
            X.8fE r2 = (X.AbstractC192138fE) r2
            boolean r0 = r2 instanceof X.C193038gj
            if (r0 == 0) goto L78
            X.8gi r0 = r2.A00
            X.8gh r0 = r0.A01
            long r4 = r0.A03
            X.0JO r0 = r3.A01
            long r17 = r0.now()
            long r2 = r1.A03
            long r0 = r1.A02
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r14.toMillis(r0)
            long r15 = r4 + r0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r13 = 0
            if (r0 > 0) goto L67
            r13 = 1
        L67:
            long r0 = r14.toMillis(r2)
            long r4 = r4 + r0
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L72
            r0 = 1
        L72:
            if (r13 == 0) goto L78
            if (r0 == 0) goto L32
            r6 = 2
            goto L32
        L78:
            r6 = 3
            goto L32
        L7a:
            r6 = 1
            goto L32
        L7c:
            java.lang.Object r0 = r8.A00     // Catch: java.lang.Throwable -> L90
            if (r0 != r11) goto L86
            r0 = 0
            r8.A00 = r0     // Catch: java.lang.Throwable -> L84
            goto L86
        L84:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L90
        L86:
            monitor-exit(r8)
        L87:
            X.C8f4.A00(r10)
            if (r1 == 0) goto L9b
            r7.A03(r9)
            return
        L90:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L93:
            X.C8f4.A00(r10)
        L96:
            X.8f2 r0 = r10.A01
            r0.A03(r1)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8f5.A03(int):void");
    }

    public C8f5(C191978et c191978et, C8f3 c8f3, InterfaceC192058f1 interfaceC192058f1) {
        synchronized (c191978et) {
            c191978et.A01.add(this);
        }
        this.A00 = c191978et;
        this.A03 = interfaceC192058f1;
        this.A02 = c8f3;
        this.A01 = c191978et.A00;
    }
}
