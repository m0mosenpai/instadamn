package X;

import java.io.File;

/* renamed from: X.02B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C02B implements C0LR {
    public File A00;
    public final int A01;
    public final C10850hu A02;
    public final boolean A03;

    public C02B(File file) {
        this.A02 = C0LK.A6r;
        this.A00 = file;
        this.A01 = 200;
        this.A03 = true;
    }

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0J;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (r3 != null) goto L38;
     */
    @Override // X.C0LR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E4h(X.C024209q r8, X.C0M6 r9) {
        /*
            r7 = this;
            boolean r0 = r7.A03
            if (r0 != 0) goto L19
            java.io.File r0 = r7.A00
            if (r0 == 0) goto L16
            boolean r0 = r0.exists()
            if (r0 == 0) goto L16
            X.0LP r1 = X.C0LP.A0B
            java.io.File r0 = r7.A00
            r8.A04(r1, r9, r0)
            return
        L16:
            r0 = 0
            r7.A00 = r0
        L19:
            java.lang.String r5 = "LogcatCollector"
            r4 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.io.IOException -> Lad
            r2.<init>()     // Catch: java.io.IOException -> Lad
            java.lang.String r0 = "logcat"
            r2.add(r0)     // Catch: java.io.IOException -> Lad
            java.lang.String r0 = "-d"
            r2.add(r0)     // Catch: java.io.IOException -> Lad
            java.lang.String r0 = "-v"
            r2.add(r0)     // Catch: java.io.IOException -> Lad
            java.lang.String r0 = "year"
            r2.add(r0)     // Catch: java.io.IOException -> Lad
            java.io.File r1 = r7.A00     // Catch: java.io.IOException -> Lad
            if (r1 == 0) goto L47
            java.lang.String r0 = "-f"
            r2.add(r0)     // Catch: java.io.IOException -> Lad
            java.lang.String r0 = r1.getPath()     // Catch: java.io.IOException -> Lad
            r2.add(r0)     // Catch: java.io.IOException -> Lad
        L47:
            int r1 = r7.A01     // Catch: java.io.IOException -> Lad
            if (r1 <= 0) goto L57
            java.lang.String r0 = "-t"
            r2.add(r0)     // Catch: java.io.IOException -> Lad
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> Lad
            r2.add(r0)     // Catch: java.io.IOException -> Lad
        L57:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.io.IOException -> Lad
            int r0 = r2.size()     // Catch: java.io.IOException -> Lad
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.io.IOException -> Lad
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch: java.io.IOException -> Lad
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.io.IOException -> Lad
            java.lang.Process r0 = r1.exec(r0)     // Catch: java.io.IOException -> Lad
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.io.IOException -> Lad
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.io.IOException -> Lad
            r0.<init>(r1)     // Catch: java.io.IOException -> Lad
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> Lad
            r3.<init>(r0)     // Catch: java.io.IOException -> Lad
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.io.IOException -> Lad
            r6.<init>()     // Catch: java.io.IOException -> Lad
            r2 = 0
            r1 = 0
        L80:
            java.lang.String r0 = r3.readLine()     // Catch: java.io.IOException -> Lad
            if (r0 == 0) goto L91
            r6.add(r0)     // Catch: java.io.IOException -> Lad
            int r0 = r0.length()     // Catch: java.io.IOException -> Lad
            int r1 = r1 + r0
            int r1 = r1 + 1
            goto L80
        L91:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lad
            r3.<init>(r1)     // Catch: java.io.IOException -> Lad
        L96:
            int r0 = r6.size()     // Catch: java.io.IOException -> Lb0
            if (r2 >= r0) goto Ld4
            java.lang.Object r0 = r6.get(r2)     // Catch: java.io.IOException -> Lb0
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> Lb0
            r3.append(r0)     // Catch: java.io.IOException -> Lb0
            java.lang.String r0 = "\n"
            r3.append(r0)     // Catch: java.io.IOException -> Lb0
            int r2 = r2 + 1
            goto L96
        Lad:
            r2 = move-exception
            r3 = r4
            goto Lb1
        Lb0:
            r2 = move-exception
        Lb1:
            X.0P8 r1 = X.C0PC.A00()
            java.lang.Integer r0 = X.C05F.A0J
            java.lang.String r0 = X.C0LX.A00(r0)
            r1.DEh(r0, r2, r4)
            java.lang.String r0 = "LogCatCollector.collectLogcat could not retrieve data."
            android.util.Log.e(r5, r0, r2)
            if (r3 != 0) goto Ld4
        Lc5:
            java.io.File r1 = r7.A00
            if (r1 != 0) goto Ld9
            X.0hu r0 = r7.A02
            if (r4 != 0) goto Ld0
            java.lang.String r4 = "unknown"
        Ld0:
            r8.A03(r0, r4)
            return
        Ld4:
            java.lang.String r4 = r3.toString()
            goto Lc5
        Ld9:
            X.0LP r0 = X.C0LP.A0B
            r8.A04(r0, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02B.E4h(X.09q, X.0M6):void");
    }

    public C02B(File file, int i, boolean z) {
        this.A02 = C0LK.A6r;
        this.A00 = file;
        this.A01 = 200;
        this.A03 = false;
    }

    public C02B(int i) {
        this.A02 = C0LK.A6r;
        this.A00 = null;
        this.A01 = i;
        this.A03 = true;
    }

    public C02B() {
        this.A02 = C0LK.A6r;
        this.A00 = null;
        this.A01 = -1;
        this.A03 = true;
    }
}
