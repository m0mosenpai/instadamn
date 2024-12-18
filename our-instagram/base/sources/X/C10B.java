package X;

/* renamed from: X.10B, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C10B {
    public int A00;
    public AnonymousClass109[] A01;
    public int A02;
    public C007702r A03;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:6:0x000a, B:7:0x000c, B:8:0x000e, B:10:0x0012, B:11:0x0018, B:14:0x001e, B:17:0x002a, B:25:0x0036, B:27:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AnonymousClass109 A08() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.109[] r0 = r4.A01     // Catch: java.lang.Throwable -> L4e
            r1 = 2
            if (r0 != 0) goto L36
            X.109[] r0 = r4.A0B(r1)     // Catch: java.lang.Throwable -> L4e
        La:
            r4.A01 = r0     // Catch: java.lang.Throwable -> L4e
        Lc:
            int r3 = r4.A02     // Catch: java.lang.Throwable -> L4e
        Le:
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L18
            X.109 r2 = r4.A0A()     // Catch: java.lang.Throwable -> L4e
            r0[r3] = r2     // Catch: java.lang.Throwable -> L4e
        L18:
            int r3 = r3 + 1
            int r1 = r0.length     // Catch: java.lang.Throwable -> L4e
            if (r3 < r1) goto L1e
            r3 = 0
        L1e:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            X.C14360o3.A0C(r2, r1)     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r2.A00(r4)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto Le
            r4.A02 = r3     // Catch: java.lang.Throwable -> L4e
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L4e
            r1 = 1
            int r0 = r0 + 1
            r4.A00 = r0     // Catch: java.lang.Throwable -> L4e
            X.02r r0 = r4.A03     // Catch: java.lang.Throwable -> L4e
            goto L47
        L36:
            int r2 = r4.A00     // Catch: java.lang.Throwable -> L4e
            int r1 = r0.length     // Catch: java.lang.Throwable -> L4e
            if (r2 < r1) goto Lc
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L4e
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> L4e
            X.109[] r0 = (X.AnonymousClass109[]) r0     // Catch: java.lang.Throwable -> L4e
            goto La
        L47:
            monitor-exit(r4)
            if (r0 == 0) goto L4d
            r0.A0D(r1)
        L4d:
            return r2
        L4e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10B.A08():X.109");
    }

    public final void A09(AnonymousClass109 anonymousClass109) {
        C007702r c007702r;
        int i;
        InterfaceC23621Ds[] A01;
        synchronized (this) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            c007702r = this.A03;
            if (i2 == 0) {
                this.A02 = 0;
            }
            C14360o3.A0C(anonymousClass109, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            A01 = anonymousClass109.A01(this);
        }
        for (InterfaceC23621Ds interfaceC23621Ds : A01) {
            if (interfaceC23621Ds != null) {
                interfaceC23621Ds.resumeWith(C0eB.A00);
            }
        }
        if (c007702r != null) {
            c007702r.A0D(-1);
        }
    }

    public abstract AnonymousClass109 A0A();

    public abstract AnonymousClass109[] A0B(int i);

    /* JADX WARN: Type inference failed for: r4v2, types: [X.057, X.02r] */
    public final C0UO C3V() {
        C007702r c007702r;
        synchronized (this) {
            C007702r c007702r2 = this.A03;
            c007702r = c007702r2;
            if (c007702r2 == null) {
                int i = this.A00;
                ?? anonymousClass057 = new AnonymousClass057(C05F.A01, 1, Integer.MAX_VALUE);
                anonymousClass057.F8m(Integer.valueOf(i));
                this.A03 = anonymousClass057;
                c007702r = anonymousClass057;
            }
        }
        return c007702r;
    }
}
