package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class XMO extends AtomicReference implements InterfaceC42071wx {
    public final int A00;
    public final XMN A01;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A01.A02(this.A00, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r1 == r4.length) goto L12;
     */
    @Override // X.InterfaceC42071wx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComplete() {
        /*
            r6 = this;
            X.XMN r5 = r6.A01
            int r0 = r6.A00
            monitor-enter(r5)
            java.lang.Object[] r4 = r5.A02     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto Lb
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            return
        Lb:
            r0 = r4[r0]     // Catch: java.lang.Throwable -> L27
            r3 = 1
            r2 = 1
            if (r0 == 0) goto L1b
            r2 = 0
            int r0 = r5.A01     // Catch: java.lang.Throwable -> L27
            int r1 = r0 + 1
            r5.A01 = r1     // Catch: java.lang.Throwable -> L27
            int r0 = r4.length     // Catch: java.lang.Throwable -> L27
            if (r1 != r0) goto L1d
        L1b:
            r5.A09 = r3     // Catch: java.lang.Throwable -> L27
        L1d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L23
            r5.A00()
        L23:
            r5.A01()
            return
        L27:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XMO.onComplete():void");
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        XMN xmn = this.A01;
        if (Y4X.A02(th, xmn.A06)) {
            xmn.A00();
            xmn.A01();
        } else {
            AbstractC142886co.A02(th);
        }
    }

    public XMO(XMN xmn, int i) {
        this.A01 = xmn;
        this.A00 = i;
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A03(interfaceC41801wU, this);
    }
}
