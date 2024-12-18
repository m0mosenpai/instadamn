package X;

/* renamed from: X.Kia, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46535Kia {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: Kem -> 0x0081, TryCatch #0 {Kem -> 0x0081, blocks: (B:3:0x000f, B:4:0x0013, B:5:0x0016, B:6:0x0023, B:8:0x0024, B:11:0x0047, B:13:0x004b, B:15:0x0072, B:18:0x003f, B:21:0x0032), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: Kem -> 0x0081, TryCatch #0 {Kem -> 0x0081, blocks: (B:3:0x000f, B:4:0x0013, B:5:0x0016, B:6:0x0023, B:8:0x0024, B:11:0x0047, B:13:0x004b, B:15:0x0072, B:18:0x003f, B:21:0x0032), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6FQ r9, X.C6FW r10) {
        /*
            r6 = 0
            X.4lE r5 = X.AbstractC31175DnJ.A0I(r10, r6)
            java.lang.Object r2 = r10.A02()
            X.AbstractC25225BEi.A1S(r2)
            java.lang.String r2 = (java.lang.String) r2
            r8 = 0
            int r0 = r2.hashCode()     // Catch: X.C46316Kem -> L81
            switch(r0) {
                case 3134569: goto L3d;
                case 3228747: goto L32;
                case 3354638: goto L2f;
                case 1646515095: goto L24;
                default: goto L16;
            }     // Catch: X.C46316Kem -> L81
        L16:
            java.lang.String r1 = "This app:"
            java.lang.String r0 = " is not supported"
            java.lang.String r1 = X.AnonymousClass001.A0g(r1, r2, r0)     // Catch: X.C46316Kem -> L81
            X.Kem r0 = new X.Kem     // Catch: X.C46316Kem -> L81
            r0.<init>(r1)     // Catch: X.C46316Kem -> L81
            throw r0     // Catch: X.C46316Kem -> L81
        L24:
            java.lang.String r0 = "fblite4a"
            boolean r0 = r2.equals(r0)     // Catch: X.C46316Kem -> L81
            if (r0 == 0) goto L16
            java.lang.String r7 = "37858054444-61gu2sctvhvn7tphd98vjuilkbq2aqvf.apps.googleusercontent.com"
            goto L47
        L2f:
            java.lang.String r0 = "mn4a"
            goto L3f
        L32:
            java.lang.String r0 = "ig4a"
            boolean r0 = r2.equals(r0)     // Catch: X.C46316Kem -> L81
            if (r0 == 0) goto L16
            java.lang.String r7 = "894032761246-7f5ii0dscmtvqu9lcs7bquii0vb6ddc8.apps.googleusercontent.com"
            goto L47
        L3d:
            java.lang.String r0 = "fb4a"
        L3f:
            boolean r0 = r2.equals(r0)     // Catch: X.C46316Kem -> L81
            if (r0 == 0) goto L16
            java.lang.String r7 = "15057814354-80cg059cn49j6kmhhkjam4b00on1gb2n.apps.googleusercontent.com"
        L47:
            X.6FG r0 = r9.A03     // Catch: X.C46316Kem -> L81
            if (r0 == 0) goto L72
            android.content.Context r4 = r0.A00     // Catch: X.C46316Kem -> L81
            X.Jgo r3 = new X.Jgo     // Catch: X.C46316Kem -> L81
            r3.<init>(r6, r9, r5)     // Catch: X.C46316Kem -> L81
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: X.C46316Kem -> L81
            X.3Qq r2 = com.google.common.util.concurrent.MoreExecutors.listeningDecorator(r0)     // Catch: X.C46316Kem -> L81
            r1 = 4
            X.TUH r0 = new X.TUH     // Catch: X.C46316Kem -> L81
            r0.<init>(r7, r4, r1)     // Catch: X.C46316Kem -> L81
            com.google.common.util.concurrent.ListenableFuture r1 = r2.submit(r0)     // Catch: X.C46316Kem -> L81
            r2.shutdown()     // Catch: X.C46316Kem -> L81
            X.C14360o3.A0A(r1)     // Catch: X.C46316Kem -> L81
            java.util.concurrent.Executor r0 = r4.getMainExecutor()     // Catch: X.C46316Kem -> L81
            X.C2OD.A03(r3, r1, r0)     // Catch: X.C46316Kem -> L81
            return r8
        L72:
            X.6FX r1 = X.AbstractC25225BEi.A0s()     // Catch: X.C46316Kem -> L81
            X.0sk r0 = X.AbstractC06930Yk.A0E()     // Catch: X.C46316Kem -> L81
            r1.A03(r0, r6)     // Catch: X.C46316Kem -> L81
            X.AbstractC25227BEk.A1M(r9, r1, r5)     // Catch: X.C46316Kem -> L81
            return r8
        L81:
            X.6FX r1 = X.AbstractC25225BEi.A0s()
            X.0sk r0 = X.AbstractC06930Yk.A0E()
            r1.A03(r0, r6)
            X.AbstractC25227BEk.A1M(r9, r1, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46535Kia.A00(X.6FQ, X.6FW):java.lang.Object");
    }
}
