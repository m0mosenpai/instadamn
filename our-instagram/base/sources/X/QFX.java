package X;

/* loaded from: classes10.dex */
public final class QFX extends AbstractC04410Lh {
    public final /* synthetic */ C1TI A00;

    public QFX(C1TI c1ti) {
        this.A00 = c1ti;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r3[5] == android.content.IntentFilter.class) goto L28;
     */
    @Override // X.AbstractC04410Lh, X.C0HV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0HW Ajg(final X.C0HX r7, java.lang.String r8, final java.lang.reflect.Method r9, final java.lang.Object[] r10) {
        /*
            r6 = this;
            int r1 = android.os.Process.myPid()
            int r0 = android.os.Process.myTid()
            r5 = 0
            if (r1 == r0) goto Lc
            return r5
        Lc:
            X.1TI r4 = r6.A00
            android.content.IntentFilter r0 = X.C1TI.A03
            java.util.List r0 = r4.A01
            java.util.Iterator r2 = r0.iterator()
        L16:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r9.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            java.lang.Class r1 = r9.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            android.os.Handler r1 = r4.A00
            X.TPo r0 = new X.TPo
            r0.<init>()
        L3d:
            r1.post(r0)
            X.0HW r0 = new X.0HW
            r0.<init>(r5)
            return r0
        L46:
            boolean r0 = r4.A02
            if (r0 == 0) goto La2
            java.lang.String r1 = r9.getName()
            java.lang.String r0 = "registerReceiver"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto La2
            if (r10 == 0) goto La2
            java.lang.Class[] r3 = r9.getParameterTypes()
            int r1 = r3.length
            r0 = 6
            if (r1 < r0) goto L95
            r2 = 3
            r0 = r3[r2]
            java.lang.Class<android.content.IntentFilter> r1 = android.content.IntentFilter.class
            if (r0 == r1) goto L71
            r2 = 4
            r0 = r3[r2]
            if (r0 == r1) goto L71
            r2 = 5
            r0 = r3[r2]
            if (r0 != r1) goto L95
        L71:
            r3 = r10[r2]
            android.content.IntentFilter r3 = (android.content.IntentFilter) r3
            if (r3 == 0) goto L95
            r2 = 0
        L78:
            int r0 = r3.countActions()
            if (r2 >= r0) goto L8d
            java.lang.String r1 = r3.getAction(r2)
            android.content.IntentFilter r0 = X.C1TI.A03
            boolean r0 = r0.hasAction(r1)
            if (r0 != 0) goto La2
            int r2 = r2 + 1
            goto L78
        L8d:
            android.os.Handler r1 = r4.A00
            X.TQb r0 = new X.TQb
            r0.<init>()
            goto L3d
        L95:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Fail to find IntentFilter, method="
            java.lang.String r0 = X.AbstractC167017dG.A0n(r9, r0, r1)
            r4.A0A(r0)
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QFX.Ajg(X.0HX, java.lang.String, java.lang.reflect.Method, java.lang.Object[]):X.0HW");
    }
}
