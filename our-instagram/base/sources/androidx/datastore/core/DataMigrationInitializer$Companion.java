package androidx.datastore.core;

/* loaded from: classes5.dex */
public final class DataMigrationInitializer$Companion {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007a -> B:13:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007d -> B:13:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.datastore.core.DataMigrationInitializer$Companion r6, X.InterfaceC30919DiW r7, java.util.List r8, X.InterfaceC23621Ds r9) {
        /*
            r5 = 2
            boolean r0 = X.MAO.A02(r9, r5)
            if (r0 == 0) goto L2b
            r4 = r9
            X.MAO r4 = (X.MAO) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L4d
            if (r0 != r5) goto L8d
            java.lang.Object r2 = r4.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r4.A01
            X.0ps r3 = (X.C15370ps) r3
            goto L31
        L2b:
            X.MAO r4 = new X.MAO
            r4.<init>(r6, r9, r5)
            goto L15
        L31:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L75
            goto L5c
        L35:
            X.AbstractC09560e7.A00(r1)
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            r1 = 0
            X.MCR r0 = new X.MCR
            r0.<init>(r2, r8, r1, r5)
            r4.A01 = r2
            r4.A00 = r3
            java.lang.Object r0 = r7.FAf(r4, r0)
            if (r0 != r6) goto L54
            return r6
        L4d:
            java.lang.Object r2 = r4.A01
            java.util.List r2 = (java.util.List) r2
            X.AbstractC09560e7.A00(r1)
        L54:
            X.0ps r3 = X.AbstractC25225BEi.A1F()
            java.util.Iterator r2 = r2.iterator()
        L5c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r2.next()
            X.0sJ r0 = (X.InterfaceC16660sJ) r0
            r4.A01 = r3     // Catch: java.lang.Throwable -> L75
            r4.A02 = r2     // Catch: java.lang.Throwable -> L75
            r4.A00 = r5     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.invoke(r4)     // Catch: java.lang.Throwable -> L75
            if (r0 != r6) goto L5c
            goto L83
        L75:
            r1 = move-exception
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L7d
            r3.A00 = r1
            goto L5c
        L7d:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.C2Ql.A01(r0, r1)
            goto L5c
        L83:
            return r6
        L84:
            java.lang.Object r0 = r3.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L91
            X.0eB r6 = X.C0eB.A00
            return r6
        L8d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
        L91:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion.A00(androidx.datastore.core.DataMigrationInitializer$Companion, X.DiW, java.util.List, X.1Ds):java.lang.Object");
    }
}
