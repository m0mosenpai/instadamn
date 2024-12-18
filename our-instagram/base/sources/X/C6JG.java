package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6JG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JG extends AtomicReference implements InterfaceC42071wx {
    public final int A00;
    public final long A01;
    public final C6JF A02;
    public volatile InterfaceC136016Dg A03;
    public volatile boolean A04;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        long j = this.A01;
        C6JF c6jf = this.A02;
        if (j == c6jf.A06) {
            if (obj != null) {
                this.A03.offer(obj);
            }
            c6jf.A01();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        long j = this.A01;
        C6JF c6jf = this.A02;
        if (j == c6jf.A06) {
            this.A04 = true;
            c6jf.A01();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        C6JF c6jf = this.A02;
        if (this.A01 == c6jf.A06 && Y4X.A02(th, c6jf.A04)) {
            c6jf.A00.dispose();
            this.A04 = true;
            c6jf.A01();
            return;
        }
        AbstractC142886co.A02(th);
    }

    public C6JG(C6JF c6jf, int i, long j) {
        this.A02 = c6jf;
        this.A01 = j;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r1 == 2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42071wx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dpc(X.InterfaceC41801wU r3) {
        /*
            r2 = this;
            boolean r0 = X.C6KP.A03(r3, r2)
            if (r0 == 0) goto L1d
            boolean r0 = r3 instanceof X.InterfaceC135996De
            if (r0 == 0) goto L1e
            X.6Df r3 = (X.InterfaceC136006Df) r3
            r0 = 7
            int r1 = r3.EJ7(r0)
            r0 = 1
            if (r1 != r0) goto L26
            r2.A03 = r3
            r2.A04 = r0
            X.6JF r0 = r2.A02
            r0.A01()
        L1d:
            return
        L1e:
            int r0 = r2.A00
            X.6Km r3 = new X.6Km
            r3.<init>(r0)
            goto L29
        L26:
            r0 = 2
            if (r1 != r0) goto L1e
        L29:
            r2.A03 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6JG.Dpc(X.1wU):void");
    }
}
