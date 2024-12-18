package X;

/* renamed from: X.UwL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67694UwL extends AbstractC70120W4v {
    public final C67688UwF A00;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r6.A00.A00.size() != ((X.C67694UwL) r7).A00.A00.size()) goto L9;
     */
    @Override // X.AbstractC70120W4v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(X.AbstractC70120W4v r7) {
        /*
            r6 = this;
            boolean r1 = r7 instanceof X.C67694UwL
            r0 = 0
            if (r1 != 0) goto L6
            return r0
        L6:
            boolean r0 = super.A02(r7)
            if (r0 == 0) goto L22
            X.UwF r0 = r6.A00
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            r0 = r7
            X.UwL r0 = (X.C67694UwL) r0
            X.UwF r0 = r0.A00
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            r5 = 1
            if (r1 == r0) goto L23
        L22:
            r5 = 0
        L23:
            X.UwF r0 = r6.A00
            java.util.List r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L42
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L42:
            X.W4v r2 = (X.AbstractC70120W4v) r2
            if (r5 == 0) goto L5a
            r0 = r7
            X.UwL r0 = (X.C67694UwL) r0
            X.UwF r0 = r0.A00
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r3)
            X.W4v r0 = (X.AbstractC70120W4v) r0
            boolean r0 = r2.A02(r0)
            r5 = 1
            if (r0 != 0) goto L5b
        L5a:
            r5 = 0
        L5b:
            r3 = r1
            goto L2c
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67694UwL.A02(X.W4v):boolean");
    }

    public C67694UwL(C67688UwF c67688UwF) {
        super(c67688UwF);
        this.A00 = c67688UwF;
    }
}
