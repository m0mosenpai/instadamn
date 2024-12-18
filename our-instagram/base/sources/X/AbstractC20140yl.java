package X;

/* renamed from: X.0yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20140yl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.InterfaceC23621Ds r6, X.InterfaceC19390xP r7, X.InterfaceC19960yQ r8) {
        /*
            boolean r0 = r6 instanceof X.C11E
            if (r0 == 0) goto L22
            r5 = r6
            X.11E r5 = (X.C11E) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.A00 = r2
        L12:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L2c
            java.lang.Object r1 = r5.A01
            X.0ps r1 = (X.C15370ps) r1
            goto L28
        L22:
            X.11E r5 = new X.11E
            r5.<init>(r6)
            goto L12
        L28:
            X.AbstractC09560e7.A00(r4)     // Catch: java.lang.Throwable -> L4c
            goto L87
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L34:
            X.AbstractC09560e7.A00(r4)
            X.0ps r1 = new X.0ps
            r1.<init>()
            X.0rg r0 = new X.0rg     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> L4c
            r5.A01 = r1     // Catch: java.lang.Throwable -> L4c
            r5.A00 = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r7.collect(r0, r5)     // Catch: java.lang.Throwable -> L4c
            if (r0 != r3) goto L87
            return r3
        L4c:
            r3 = move-exception
            java.lang.Object r2 = r1.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L5a
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L5a
            throw r3
        L5a:
            X.12W r1 = r5.getContext()
            X.196 r0 = X.AnonymousClass195.A00
            X.12V r1 = r1.get(r0)
            X.195 r1 = (X.AnonymousClass195) r1
            if (r1 == 0) goto L79
            boolean r0 = r1.isCancelled()
            if (r0 == 0) goto L79
            java.util.concurrent.CancellationException r0 = r1.AlP()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L79
            throw r3
        L79:
            if (r2 == 0) goto L88
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L83
            X.C2Ql.A01(r2, r3)
            throw r2
        L83:
            X.C2Ql.A01(r3, r2)
            throw r3
        L87:
            r3 = 0
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20140yl.A00(X.1Ds, X.0xP, X.0yQ):java.lang.Object");
    }
}
