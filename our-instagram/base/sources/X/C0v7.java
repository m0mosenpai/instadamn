package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0v7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0v7 {
    public static final int[][] A06 = {new int[]{3, 2, 1, 1, 1}, new int[]{9, 10, 11, 12, 19}};
    public final List A00;
    public final List A01;
    public final AtomicInteger A02;
    public final int[] A03;
    public final int A04;
    public final C07130Zk A05;

    public C0v7(C14130nd c14130nd, List list, int[] iArr, int[] iArr2) {
        C14360o3.A0B(iArr, 1);
        C14360o3.A0B(iArr2, 2);
        this.A03 = iArr;
        C01L A1I = C0eM.A1I();
        int i = 1;
        int i2 = 1;
        do {
            A1I.add(new ConcurrentLinkedQueue());
            i2++;
        } while (i2 < 6);
        this.A00 = C0eM.A1J(A1I);
        C01L A1I2 = C0eM.A1I();
        do {
            A1I2.add(new ConcurrentLinkedQueue());
            i++;
        } while (i < 6);
        this.A01 = C0eM.A1J(A1I2);
        this.A02 = new AtomicInteger(0);
        this.A05 = C07130Zk.A00;
        this.A04 = c14130nd.A02;
        C14400oC c14400oC = new C14400oC(c14130nd, this);
        c14400oC.start();
        boolean z = c14130nd.A0C;
        int i3 = 1;
        do {
            int i4 = i3 - 1;
            int i5 = this.A03[i4];
            int i6 = iArr2[i4];
            int i7 = 0;
            while (i7 < i5) {
                i7++;
                C0o6 c0o6 = new C0o6(this, AnonymousClass001.A0p("SWPool", "_t", "of", i3, i7, i5), list, i3, i6, z);
                this.A02.incrementAndGet();
                c0o6.start();
                c14400oC.A02.add(c0o6);
            }
            i3++;
        } while (i3 < 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractRunnableC14200nk A01(java.util.List r8, java.util.List r9, java.util.concurrent.atomic.AtomicInteger r10, int[] r11, int r12) {
        /*
            r7 = this;
            r6 = 1
            r0 = 4
            X.C14360o3.A0B(r10, r0)
            r3 = 0
            r4 = 1
        L7:
            java.lang.String r1 = X.C07130Zk.A00()
            java.lang.String r0 = "APP_START"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L1f
            int r0 = r7.A04
            if (r4 <= r0) goto L1f
            if (r0 <= 0) goto L1f
        L19:
            int r4 = r4 + 1
            r0 = 6
            if (r4 < r0) goto L7
            return r3
        L1f:
            if (r4 != r12) goto L61
            int r2 = r4 + (-1)
            r1 = r11[r2]
            int r0 = r10.get()
            int r0 = r0 - r6
            if (r1 <= r0) goto L61
            java.lang.Object r0 = r8.get(r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r3 = r0.poll()
            X.0nk r3 = (X.AbstractRunnableC14200nk) r3
            if (r3 != 0) goto L61
            goto L19
        L3b:
            java.lang.Object r0 = r8.get(r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r5 = r0.poll()
            X.0nk r5 = (X.AbstractRunnableC14200nk) r5
            if (r5 == 0) goto L90
            X.0nk r0 = r1.A07
            if (r0 == 0) goto L54
            java.lang.String r2 = "RUNNABLE_DIRTY"
            java.lang.String r0 = "Worker shouldn't execute a new task because it is still busy with another task."
            X.C0w9.A03(r2, r0)
        L54:
            r10.incrementAndGet()
            X.0vD r0 = new X.0vD
            r0.<init>(r5)
            r1.A07 = r0
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L61:
            r5 = -1
            if (r12 == r4) goto L8e
            if (r12 == r5) goto L8e
        L66:
            int r2 = r4 - r6
            r1 = r11[r2]
            int r0 = r10.get()
            int r0 = r0 + r5
            if (r1 <= r0) goto L19
            java.lang.Object r0 = r8.get(r2)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L19
            int r2 = r4 + (-1)
            java.lang.Object r0 = r9.get(r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r1 = r0.poll()
            X.0o6 r1 = (X.C0o6) r1
            if (r1 == 0) goto L19
            goto L3b
        L8e:
            r5 = 0
            goto L66
        L90:
            java.lang.Object r0 = r9.get(r2)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0v7.A01(java.util.List, java.util.List, java.util.concurrent.atomic.AtomicInteger, int[], int):X.0nk");
    }

    public final int A00() {
        List list = this.A01;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((AbstractCollection) it.next()).size()));
        }
        return AbstractC001800i.A02(arrayList);
    }
}
