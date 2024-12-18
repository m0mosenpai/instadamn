package X;

/* renamed from: X.Wvw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71547Wvw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ X9P A01;
    public final /* synthetic */ WDD A02;

    public RunnableC71547Wvw(X9P x9p, WDD wdd, int i) {
        this.A02 = wdd;
        this.A00 = i;
        this.A01 = x9p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 != null) goto L9;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            X.WDD r2 = r3.A02
            int r1 = r3.A00
            r0 = -1
            if (r1 == r0) goto L19
            java.util.Map r2 = r2.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.get(r1)
            if (r0 != 0) goto L1e
        L19:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L1e:
            X.X9P r1 = r3.A01
            r1.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC71547Wvw.run():void");
    }
}
