package X;

/* renamed from: X.10m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC209010m {
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(2:15|16)(1:18)))|30|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r1.A00 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.InterfaceC23621Ds r7, X.InterfaceC16620sF r8, X.InterfaceC19390xP r9) {
        /*
            boolean r0 = r7 instanceof X.C209810x
            if (r0 == 0) goto L26
            r6 = r7
            X.10x r6 = (X.C209810x) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.A00 = r2
        L12:
            java.lang.Object r5 = r6.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L30
            java.lang.Object r2 = r6.A03
            java.lang.Object r3 = r6.A02
            X.0ps r3 = (X.C15370ps) r3
            java.lang.Object r8 = r6.A01
            goto L2c
        L26:
            X.10x r6 = new X.10x
            r6.<init>(r7)
            goto L12
        L2c:
            X.AbstractC09560e7.A00(r5)     // Catch: X.C10C -> L58
            goto L5d
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L38:
            X.AbstractC09560e7.A00(r5)
            X.0ps r3 = new X.0ps
            r3.<init>()
            X.0zt r0 = X.AbstractC20780zy.A01
            r3.A00 = r0
            X.0qL r2 = new X.0qL
            r2.<init>(r8, r3)
            r6.A01 = r8     // Catch: X.C10C -> L58
            r6.A02 = r3     // Catch: X.C10C -> L58
            r6.A03 = r2     // Catch: X.C10C -> L58
            r6.A00 = r1     // Catch: X.C10C -> L58
            java.lang.Object r0 = r9.collect(r2, r6)     // Catch: X.C10C -> L58
            if (r0 != r4) goto L5d
            return r4
        L58:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 != r2) goto L79
        L5d:
            java.lang.Object r4 = r3.A00
            X.0zt r0 = X.AbstractC20780zy.A01
            if (r4 != r0) goto L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Expected at least one element matching the predicate "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
        L79:
            throw r1
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209010m.A00(X.1Ds, X.0sF, X.0xP):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r1.A00 != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.InterfaceC23621Ds r7, X.InterfaceC16620sF r8, X.InterfaceC19390xP r9) {
        /*
            boolean r0 = r7 instanceof X.C209610v
            if (r0 == 0) goto L24
            r6 = r7
            X.10v r6 = (X.C209610v) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.A00 = r2
        L12:
            java.lang.Object r5 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r1 = r6.A00
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L50
            java.lang.Object r2 = r6.A02
            java.lang.Object r3 = r6.A01
            X.0ps r3 = (X.C15370ps) r3
            goto L2a
        L24:
            X.10v r6 = new X.10v
            r6.<init>(r7)
            goto L12
        L2a:
            X.AbstractC09560e7.A00(r5)     // Catch: X.C10C -> L48
            goto L4d
        L2e:
            X.AbstractC09560e7.A00(r5)
            X.0ps r3 = new X.0ps
            r3.<init>()
            X.0qJ r2 = new X.0qJ
            r2.<init>(r8, r3)
            r6.A01 = r3     // Catch: X.C10C -> L48
            r6.A02 = r2     // Catch: X.C10C -> L48
            r6.A00 = r0     // Catch: X.C10C -> L48
            java.lang.Object r0 = r9.collect(r2, r6)     // Catch: X.C10C -> L48
            if (r0 != r4) goto L4d
            return r4
        L48:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 != r2) goto L57
        L4d:
            java.lang.Object r4 = r3.A00
            return r4
        L50:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L57:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209010m.A01(X.1Ds, X.0sF, X.0xP):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(2:15|16)(1:18)))|30|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r1.A00 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.InterfaceC23621Ds r7, X.InterfaceC19390xP r8) {
        /*
            boolean r0 = r7 instanceof X.C209910y
            if (r0 == 0) goto L24
            r6 = r7
            X.10y r6 = (X.C209910y) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.A00 = r2
        L12:
            java.lang.Object r5 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            java.lang.Object r2 = r6.A02
            java.lang.Object r3 = r6.A01
            X.0ps r3 = (X.C15370ps) r3
            goto L2a
        L24:
            X.10y r6 = new X.10y
            r6.<init>(r7)
            goto L12
        L2a:
            X.AbstractC09560e7.A00(r5)     // Catch: X.C10C -> L54
            goto L59
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L36:
            X.AbstractC09560e7.A00(r5)
            X.0ps r3 = new X.0ps
            r3.<init>()
            X.0zt r0 = X.AbstractC20780zy.A01
            r3.A00 = r0
            X.0qU r2 = new X.0qU
            r2.<init>()
            r6.A01 = r3     // Catch: X.C10C -> L54
            r6.A02 = r2     // Catch: X.C10C -> L54
            r6.A00 = r1     // Catch: X.C10C -> L54
            java.lang.Object r0 = r8.collect(r2, r6)     // Catch: X.C10C -> L54
            if (r0 != r4) goto L59
            return r4
        L54:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 != r2) goto L66
        L59:
            java.lang.Object r4 = r3.A00
            X.0zt r0 = X.AbstractC20780zy.A01
            if (r4 != r0) goto L67
            java.lang.String r0 = "Expected at least one element"
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
        L66:
            throw r1
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209010m.A02(X.1Ds, X.0xP):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r1.A00 != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.InterfaceC23621Ds r7, X.InterfaceC19390xP r8) {
        /*
            boolean r0 = r7 instanceof X.C209710w
            if (r0 == 0) goto L24
            r6 = r7
            X.10w r6 = (X.C209710w) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.A00 = r2
        L12:
            java.lang.Object r5 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r1 = r6.A00
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L50
            java.lang.Object r2 = r6.A02
            java.lang.Object r3 = r6.A01
            X.0ps r3 = (X.C15370ps) r3
            goto L2a
        L24:
            X.10w r6 = new X.10w
            r6.<init>(r7)
            goto L12
        L2a:
            X.AbstractC09560e7.A00(r5)     // Catch: X.C10C -> L48
            goto L4d
        L2e:
            X.AbstractC09560e7.A00(r5)
            X.0ps r3 = new X.0ps
            r3.<init>()
            X.0qK r2 = new X.0qK
            r2.<init>()
            r6.A01 = r3     // Catch: X.C10C -> L48
            r6.A02 = r2     // Catch: X.C10C -> L48
            r6.A00 = r0     // Catch: X.C10C -> L48
            java.lang.Object r0 = r8.collect(r2, r6)     // Catch: X.C10C -> L48
            if (r0 != r4) goto L4d
            return r4
        L48:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 != r2) goto L57
        L4d:
            java.lang.Object r4 = r3.A00
            return r4
        L50:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L57:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209010m.A03(X.1Ds, X.0xP):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(X.InterfaceC23621Ds r6, X.InterfaceC19390xP r7) {
        /*
            boolean r0 = r6 instanceof X.C10s
            if (r0 == 0) goto L4e
            r5 = r6
            X.10s r5 = (X.C10s) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.A00 = r2
        L12:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L55
            java.lang.Object r1 = r5.A01
            X.0ps r1 = (X.C15370ps) r1
            X.AbstractC09560e7.A00(r4)
        L24:
            java.lang.Object r3 = r1.A00
            X.0zt r0 = X.AbstractC20780zy.A01
            if (r3 != r0) goto L54
            java.lang.String r0 = "Expected at least one element"
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L32:
            X.AbstractC09560e7.A00(r4)
            X.0ps r1 = new X.0ps
            r1.<init>()
            X.0zt r0 = X.AbstractC20780zy.A01
            r1.A00 = r0
            X.0qI r0 = new X.0qI
            r0.<init>()
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r0 = r7.collect(r0, r5)
            if (r0 != r3) goto L24
            return r3
        L4e:
            X.10s r5 = new X.10s
            r5.<init>(r6)
            goto L12
        L54:
            return r3
        L55:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209010m.A04(X.1Ds, X.0xP):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(X.InterfaceC23621Ds r6, X.InterfaceC19390xP r7) {
        /*
            boolean r0 = r6 instanceof X.C10r
            if (r0 == 0) goto L3f
            r5 = r6
            X.10r r5 = (X.C10r) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.A00 = r2
        L12:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L45
            java.lang.Object r1 = r5.A01
            X.0ps r1 = (X.C15370ps) r1
            X.AbstractC09560e7.A00(r4)
        L24:
            java.lang.Object r3 = r1.A00
            return r3
        L27:
            X.AbstractC09560e7.A00(r4)
            X.0ps r1 = new X.0ps
            r1.<init>()
            X.0qH r0 = new X.0qH
            r0.<init>()
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r0 = r7.collect(r0, r5)
            if (r0 != r3) goto L24
            return r3
        L3f:
            X.10r r5 = new X.10r
            r5.<init>(r6)
            goto L12
        L45:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209010m.A05(X.1Ds, X.0xP):java.lang.Object");
    }
}
