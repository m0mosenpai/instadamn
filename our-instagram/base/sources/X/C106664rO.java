package X;

/* renamed from: X.4rO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106664rO implements InterfaceC46402Bc {
    public static C106664rO A04;
    public C106694rR A00;
    public C106674rP A01;
    public String A02;
    public boolean A03;

    @Override // X.InterfaceC46402Bc
    public final void DEJ(String str, String str2, int i, int i2) {
    }

    @Override // X.InterfaceC46412Bd
    public final void DnQ(C2QE c2qe, C49802Qq c49802Qq) {
    }

    @Override // X.InterfaceC46402Bc
    public final void Do1(C2QE c2qe, String str, long j, long j2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r0 > (-1)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C5J9 r20) {
        /*
            r19 = this;
            r2 = r19
            X.4rP r3 = r2.A01
            if (r3 == 0) goto L5b
            r7 = r20
            boolean r0 = r7.A08
            if (r0 != 0) goto L5b
            boolean r0 = r7.A09
            if (r0 == 0) goto L72
            int r1 = r7.A01
            if (r1 != 0) goto L62
            X.4rT r10 = X.EnumC106714rT.CACHE_HIT
        L16:
            boolean r0 = r2.A03
            if (r0 != 0) goto L5b
            X.4Bk r6 = r7.A0A
            java.lang.String r11 = r6.A03
            X.2Az r0 = r6.A00
            java.lang.String r12 = r0.name()
            java.lang.String r13 = r7.A07
            long r15 = r7.A03
            r8 = r15
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5f
            long r0 = r7.A02
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L5f
        L3a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5c
            long r0 = r7.A02
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L5c
        L4b:
            android.util.Pair r9 = r7.A06
            java.lang.String r14 = r6.A06
            X.4rU r8 = new X.4rU
            r17 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            java.util.List r0 = r3.A01
            r0.add(r8)
        L5b:
            return
        L5c:
            long r0 = r7.A04
            goto L4b
        L5f:
            long r15 = r7.A05
            goto L3a
        L62:
            int r0 = r7.A00
            if (r0 != 0) goto L6b
            if (r1 <= 0) goto L7d
            X.4rT r10 = X.EnumC106714rT.CACHE_PARTIAL_MISS
            goto L16
        L6b:
            if (r0 <= 0) goto L7d
            if (r1 <= 0) goto L7d
            X.4rT r10 = X.EnumC106714rT.CACHE_PARTIAL_HIT
            goto L16
        L72:
            int r0 = r7.A00
            if (r0 != 0) goto L7d
            int r0 = r7.A01
            if (r0 <= 0) goto L7d
            X.4rT r10 = X.EnumC106714rT.CACHE_MISS
            goto L16
        L7d:
            X.4rT r10 = X.EnumC106714rT.CACHE_UNKNOWN
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106664rO.A00(X.5J9):void");
    }

    @Override // X.InterfaceC46412Bd
    public final void DnP(C2QE c2qe, C49802Qq c49802Qq) {
        String str;
        C106704rS c106704rS;
        String str2;
        if (this.A01 != null && (str = c49802Qq.A06) != null) {
            String str3 = "UNKNOWN";
            C106694rR c106694rR = this.A00;
            synchronized (c106694rR) {
                c106704rS = (C106704rS) c106694rR.A00.get((C49802Qq) c106694rR.A01.floor(c49802Qq));
            }
            String str4 = "unknown";
            if (c106704rS == null) {
                str2 = "unknown";
            } else {
                C92304Bk c92304Bk = c106704rS.A00;
                str4 = c92304Bk.A03;
                str3 = c92304Bk.A00.name();
                str2 = c92304Bk.A06;
            }
            this.A01.A01.add(new C106724rU(EnumC106714rT.SPAN_ADDED, str4, str3, str, null, str2, c49802Qq.A04, c49802Qq.A03, 0L, 0L));
        }
    }

    @Override // X.InterfaceC46412Bd
    public final void DnR(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2) {
        DnS(c2qe, c49802Qq, c49802Qq2, C05F.A0C);
    }

    @Override // X.InterfaceC46412Bd
    public final void DnS(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2, Integer num) {
        C106674rP c106674rP = this.A01;
        if (c106674rP != null && c49802Qq != null && num != C05F.A0N) {
            c106674rP.A01.add(new C106724rU(EnumC106714rT.SPAN_TOUCHED, null, null, c49802Qq.A06, null, "unknown", c49802Qq.A04, c49802Qq.A03, c49802Qq2.A04, c49802Qq2.A03));
        }
    }
}
