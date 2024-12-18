package X;

/* renamed from: X.7mY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172637mY extends C12T {
    public final C172647mZ A00 = new C172647mZ();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r1.A01 == false) goto L8;
     */
    @Override // X.C12T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(X.C12W r3) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.12T r0 = X.C12P.A00
            X.137 r0 = X.AnonymousClass131.A00
            X.137 r0 = r0.A06()
            boolean r1 = r0.A02(r3)
            r0 = 1
            if (r1 != 0) goto L21
            X.7mZ r1 = r2.A00
            boolean r0 = r1.A00
            if (r0 != 0) goto L1e
            boolean r1 = r1.A01
            r0 = 0
            if (r1 != 0) goto L1f
        L1e:
            r0 = 1
        L1f:
            r0 = r0 ^ 1
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172637mY.A02(X.12W):boolean");
    }

    @Override // X.C12T
    public final void A05(final Runnable runnable, C12W c12w) {
        C14360o3.A0B(c12w, 0);
        C14360o3.A0B(runnable, 1);
        final C172647mZ c172647mZ = this.A00;
        C12T c12t = C12P.A00;
        AnonymousClass137 A06 = AnonymousClass131.A00.A06();
        if (!A06.A02(c12w) && !c172647mZ.A00 && c172647mZ.A01) {
            if (c172647mZ.A03.offer(runnable)) {
                c172647mZ.A00();
                return;
            }
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        A06.A05(new Runnable() { // from class: X.7me
            @Override // java.lang.Runnable
            public final void run() {
                C172647mZ c172647mZ2 = C172647mZ.this;
                Runnable runnable2 = runnable;
                C14360o3.A0B(c172647mZ2, 0);
                if (c172647mZ2.A03.offer(runnable2)) {
                    c172647mZ2.A00();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
        }, c12w);
    }
}
