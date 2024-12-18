package X;

/* renamed from: X.1O2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1O2 {
    public InterfaceC24281Gx A00;
    public InterfaceC24271Gw A01;
    public C24211Gq A02;
    public final C1O3 A03 = new C1O3();
    public final /* synthetic */ C25821No A04;

    public C1O2(C25821No c25821No, C24211Gq c24211Gq) {
        this.A04 = c25821No;
        this.A02 = c24211Gq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36327043842980107L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC24271Gw A00() {
        /*
            r17 = this;
            r10 = r17
            X.1Gw r0 = r10.A01
            if (r0 != 0) goto L9a
            monitor-enter(r10)
            X.1Gw r0 = r10.A01     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L95
            r9 = 0
            X.1No r8 = r10.A04     // Catch: java.lang.Throwable -> L8f
            android.content.Context r1 = r8.A0D     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "images.stash"
            java.io.File r12 = X.AbstractC25541Mj.A00(r1, r0, r9)     // Catch: java.lang.Throwable -> L8f
            r12.getClass()     // Catch: java.lang.Throwable -> L8f
            X.1M7 r11 = X.C1M7.A01()     // Catch: java.lang.Throwable -> L8f
            X.2oI r7 = new X.2oI     // Catch: java.lang.Throwable -> L8f
            r7.<init>()     // Catch: java.lang.Throwable -> L8f
            X.0ll r3 = r8.A03     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L35
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L8f
            r0 = 36327043842980107(0x810f410000390b, double:3.03670703134059E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 1
            if (r1 != 0) goto L36
        L35:
            r0 = 0
        L36:
            r7.A00 = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "IgImageInfra"
            r7.A05 = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "ig_images"
            r7.A06 = r0     // Catch: java.lang.Throwable -> L8f
            X.1B0 r0 = X.C1B0.A0B     // Catch: java.lang.Throwable -> L8f
            r7.A03 = r0     // Catch: java.lang.Throwable -> L8f
            X.1Gy r6 = new X.1Gy     // Catch: java.lang.Throwable -> L8f
            r6.<init>()     // Catch: java.lang.Throwable -> L8f
            long r2 = r8.A0C     // Catch: java.lang.Throwable -> L8f
            r0 = r2
            r13 = 0
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 > 0) goto L56
            r0 = 52428800(0x3200000, double:2.5903269E-316)
        L56:
            r6.A01 = r0     // Catch: java.lang.Throwable -> L8f
            double r4 = (double) r2     // Catch: java.lang.Throwable -> L8f
            double r2 = r8.A08     // Catch: java.lang.Throwable -> L8f
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 - r2
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r15 = r15 / r0
            double r13 = r2 + r15
            double r0 = r4 * r13
            long r0 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L8f
            r6.A02 = r0     // Catch: java.lang.Throwable -> L8f
            double r4 = r4 * r2
            long r0 = java.lang.Math.round(r4)     // Catch: java.lang.Throwable -> L8f
            r6.A03 = r0     // Catch: java.lang.Throwable -> L8f
            X.1FB r0 = r6.A00()     // Catch: java.lang.Throwable -> L8f
            r7.A01 = r0     // Catch: java.lang.Throwable -> L8f
            int r0 = r8.A0B     // Catch: java.lang.Throwable -> L8f
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L8f
            r2 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 * r2
            X.1FC r2 = new X.1FC     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r0, r9)     // Catch: java.lang.Throwable -> L8f
            r7.A02 = r2     // Catch: java.lang.Throwable -> L8f
            X.1MD r0 = r7.A00()     // Catch: java.lang.Throwable -> L8f
            X.2oS r0 = r11.A09(r0, r12)     // Catch: java.lang.Throwable -> L8f
            goto L91
        L8f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L97
        L91:
            r10.A01 = r0     // Catch: java.lang.Throwable -> L97
            r10.A00 = r0     // Catch: java.lang.Throwable -> L97
        L95:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L97
            goto L9a
        L97:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L97
            throw r0
        L9a:
            X.1Gw r0 = r10.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1O2.A00():X.1Gw");
    }
}
