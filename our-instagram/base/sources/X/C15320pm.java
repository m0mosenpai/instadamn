package X;

/* renamed from: X.0pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15320pm extends AbstractC004301i {
    public final int A00;

    public C15320pm(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    @Override // X.AbstractC004301i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A00() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L8;
                case 1: goto La5;
                default: goto L5;
            }
        L5:
            X.0Qp r0 = X.C05410Qp.A00
            return r0
        L8:
            java.lang.String r5 = "lacrima"
            r6 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.io.IOException -> L88
            r2.<init>()     // Catch: java.io.IOException -> L88
            java.lang.String r0 = "logcat"
            r2.add(r0)     // Catch: java.io.IOException -> L88
            java.lang.String r0 = "-d"
            r2.add(r0)     // Catch: java.io.IOException -> L88
            java.lang.String r0 = "-t"
            r2.add(r0)     // Catch: java.io.IOException -> L88
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L88
            r2.add(r0)     // Catch: java.io.IOException -> L88
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.io.IOException -> L88
            int r0 = r2.size()     // Catch: java.io.IOException -> L88
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.io.IOException -> L88
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch: java.io.IOException -> L88
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.io.IOException -> L88
            java.lang.Process r1 = r1.exec(r0)     // Catch: java.io.IOException -> L88
            if (r1 == 0) goto L9b
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L88
            if (r0 == 0) goto L9b
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.io.IOException -> L88
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L88
            r0.<init>(r1)     // Catch: java.io.IOException -> L88
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> L88
            r3.<init>(r0)     // Catch: java.io.IOException -> L88
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.io.IOException -> L88
            r4.<init>()     // Catch: java.io.IOException -> L88
            r2 = 0
            r1 = 0
        L5b:
            java.lang.String r0 = r3.readLine()     // Catch: java.io.IOException -> L88
            if (r0 == 0) goto L6c
            r4.add(r0)     // Catch: java.io.IOException -> L88
            int r0 = r0.length()     // Catch: java.io.IOException -> L88
            int r1 = r1 + r0
            int r1 = r1 + 1
            goto L5b
        L6c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L88
            r3.<init>(r1)     // Catch: java.io.IOException -> L88
        L71:
            int r0 = r4.size()     // Catch: java.io.IOException -> L8b
            if (r2 >= r0) goto L9a
            java.lang.Object r0 = r4.get(r2)     // Catch: java.io.IOException -> L8b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L8b
            r3.append(r0)     // Catch: java.io.IOException -> L8b
            java.lang.String r0 = "\n"
            r3.append(r0)     // Catch: java.io.IOException -> L8b
            int r2 = r2 + 1
            goto L71
        L88:
            r2 = move-exception
            r3 = r6
            goto L8c
        L8b:
            r2 = move-exception
        L8c:
            X.0P8 r1 = X.C0PC.A00()
            java.lang.String r0 = "DirectCollectLogcat"
            r1.DEh(r0, r2, r6)
            java.lang.String r0 = "ErrorReportingCheck.collectLogcat could not retrieve data."
            X.C0K8.A0F(r5, r0, r2)
        L9a:
            r6 = r3
        L9b:
            if (r6 != 0) goto La0
            java.lang.String r0 = ""
            return r0
        La0:
            java.lang.String r0 = r6.toString()
            return r0
        La5:
            int r1 = X.C0M4.A00
            r0 = 2
            if (r1 != r0) goto Lad
            java.util.concurrent.ExecutorService r0 = X.C04590Mb.A04
            return r0
        Lad:
            java.util.concurrent.ExecutorService r0 = X.C04590Mb.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320pm.A00():java.lang.Object");
    }
}
