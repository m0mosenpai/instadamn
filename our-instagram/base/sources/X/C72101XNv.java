package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XNv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72101XNv implements InterfaceC42061ww {
    public final AtomicReference A00;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC42061ww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EpF(X.InterfaceC42071wx r8) {
        /*
            r7 = this;
            X.XNw r5 = new X.XNw
            r5.<init>(r8)
            r8.Dpc(r5)
        L8:
            java.util.concurrent.atomic.AtomicReference r2 = r7.A00
            java.lang.Object r6 = r2.get()
            X.XMb r6 = (X.C72059XMb) r6
            if (r6 == 0) goto L1c
            java.util.concurrent.atomic.AtomicReference r0 = r6.A02
            java.lang.Object r1 = r0.get()
            X.XNw[] r0 = X.C72059XMb.A05
            if (r1 != r0) goto L28
        L1c:
            X.XMb r1 = new X.XMb
            r1.<init>(r2)
            boolean r0 = X.C1EM.A00(r6, r1, r2)
            if (r0 == 0) goto L8
            r6 = r1
        L28:
            java.util.concurrent.atomic.AtomicReference r4 = r6.A02
            java.lang.Object r3 = r4.get()
            X.XNw[] r3 = (X.C72102XNw[]) r3
            X.XNw[] r0 = X.C72059XMb.A05
            r2 = 0
            if (r3 == r0) goto L8
            int r1 = r3.length
            int r0 = r1 + 1
            X.XNw[] r0 = new X.C72102XNw[r0]
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            r0[r1] = r5
            boolean r0 = X.C1EM.A00(r3, r0, r4)
            if (r0 == 0) goto L28
            r0 = 0
            boolean r0 = r5.compareAndSet(r0, r6)
            if (r0 != 0) goto L4f
            r6.A00(r5)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72101XNv.EpF(X.1wx):void");
    }

    public C72101XNv(AtomicReference atomicReference) {
        this.A00 = atomicReference;
    }
}
