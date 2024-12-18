package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05840Sm {
    public final C06600Wq A01;
    public final ThreadLocal A00 = new ThreadLocal();
    public final AtomicInteger A02 = new AtomicInteger();

    public final void A01(C05620Rm c05620Rm) {
        ThreadLocal threadLocal = this.A00;
        C0XT c0xt = (C0XT) threadLocal.get();
        if (c0xt == null) {
            c0xt = new C0XT();
            threadLocal.set(c0xt);
        }
        Object[] objArr = c0xt.A01;
        int length = objArr.length;
        int i = c0xt.A00;
        if (i >= length) {
            int i2 = length >> 1;
            if (length < 64) {
                i2 = length;
            }
            int i3 = length + i2;
            if (i3 >= 0) {
                objArr = Arrays.copyOf(objArr, i3);
                c0xt.A01 = objArr;
            } else {
                throw new IllegalStateException(AnonymousClass001.A0c("Stack reached max capacity of ", "!", i));
            }
        }
        int i4 = c0xt.A00;
        c0xt.A00 = i4 + 1;
        objArr[i4] = c05620Rm;
        InterfaceC06270Us interfaceC06270Us = C06600Wq.A02;
        if (interfaceC06270Us != null) {
            interfaceC06270Us.Cus(c05620Rm);
        }
    }

    public C05840Sm(C06600Wq c06600Wq) {
        this.A01 = c06600Wq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0bB] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0bB] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0bB] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0bn] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C05620Rm A00(X.C05620Rm r15, java.lang.String r16, int r17, int r18) {
        /*
            r14 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r12 = r0.getId()
            r2 = r14
            java.util.concurrent.atomic.AtomicInteger r0 = r14.A02
            int r7 = r0.getAndIncrement()
            X.0Sb r1 = X.C06600Wq.A03
            r8 = r17
            r9 = r18
            if (r15 != 0) goto L4a
            if (r1 == 0) goto L47
            boolean r0 = r1.Eic(r8, r9)
            if (r0 == 0) goto L47
            X.0RJ r3 = new X.0RJ
            r3.<init>()
            r1.AVF(r3, r8, r9)
        L27:
            boolean r0 = r1.Eid(r15, r8, r9)
            if (r0 == 0) goto L4f
            X.0RH r4 = new X.0RH
            r4.<init>()
            r1.AVG(r4, r15, r8, r9)
        L35:
            if (r15 != 0) goto L42
            r10 = -1
            r6 = -1
        L3a:
            X.0Rm r1 = new X.0Rm
            r5 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r1
        L42:
            long r10 = r15.A04
            int r6 = r15.A00
            goto L3a
        L47:
            X.0bB r3 = X.C10370h3.A00
            goto L4c
        L4a:
            X.0bB r3 = r15.A07
        L4c:
            if (r1 == 0) goto L4f
            goto L27
        L4f:
            X.0bn r4 = X.C10340h0.A00
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05840Sm.A00(X.0Rm, java.lang.String, int, int):X.0Rm");
    }
}
