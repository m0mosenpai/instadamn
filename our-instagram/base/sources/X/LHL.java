package X;

/* loaded from: classes8.dex */
public abstract class LHL {
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:3)|32|(2:6|(4:8|9|10|(1:(3:13|14|15)(2:17|18))(3:19|(3:21|22|(1:24)(1:25))|26)))|31|9|10|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r2.A00 == r3.A00) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (((X.MAD) r8).A05 != 2) goto L6;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0060: IGET (r0 I:java.lang.Object) = (r3 I:X.0ps) (LINE:96) X.0ps.A00 java.lang.Object, block:B:28:0x005e */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.InterfaceC23621Ds r8, X.InterfaceC16620sF r9, long r10) {
        /*
            r2 = 2
            boolean r0 = r8 instanceof X.MAD
            if (r0 == 0) goto Ld
            r0 = r8
            X.MAD r0 = (X.MAD) r0
            int r1 = r0.A05
            r0 = 1
            if (r1 == r2) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2f
            r7 = r8
            X.MAD r7 = (X.MAD) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r7.A00 = r2
        L1e:
            java.lang.Object r0 = r7.A04
            X.1JX r6 = X.C1JX.A02
            int r1 = r7.A00
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 != r4) goto L65
            java.lang.Object r3 = r7.A03
            X.0ps r3 = (X.C15370ps) r3
            goto L35
        L2f:
            X.MAD r7 = new X.MAD
            r7.<init>(r8)
            goto L1e
        L35:
            X.AbstractC09560e7.A00(r0)     // Catch: X.C902540k -> L5d
            return r0
        L39:
            X.AbstractC09560e7.A00(r0)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L64
            X.0ps r3 = X.AbstractC25225BEi.A1F()
            r7.A02 = r9     // Catch: X.C902540k -> L5d
            r7.A03 = r3     // Catch: X.C902540k -> L5d
            r7.A01 = r10     // Catch: X.C902540k -> L5d
            r7.A00 = r4     // Catch: X.C902540k -> L5d
            X.MMg r0 = new X.MMg     // Catch: X.C902540k -> L5d
            r0.<init>(r7, r10)     // Catch: X.C902540k -> L5d
            r3.A00 = r0     // Catch: X.C902540k -> L5d
            java.lang.Object r0 = A02(r9, r0)     // Catch: X.C902540k -> L5d
            if (r0 != r6) goto L5c
            return r6
        L5c:
            return r0
        L5d:
            r2 = move-exception
            X.195 r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L69
        L64:
            return r5
        L65:
            java.lang.IllegalStateException r2 = X.AbstractC166987dD.A13()
        L69:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LHL.A01(X.1Ds, X.0sF, long):java.lang.Object");
    }

    public static final Object A00(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF, long j) {
        if (j > 0) {
            return A02(interfaceC16620sF, new RunnableC50379MMg(interfaceC23621Ds, j));
        }
        throw new C902540k("Timed out immediately", null);
    }

    public static final Object A02(InterfaceC16620sF interfaceC16620sF, RunnableC50379MMg runnableC50379MMg) {
        Object c1jw;
        Object A0D;
        runnableC50379MMg.CPD(new C50375MMc(AbstractC89993zf.A04(((C1UX) runnableC50379MMg).A00.getContext()).CPF(runnableC50379MMg, ((AbstractC23681Dy) runnableC50379MMg).A00, runnableC50379MMg.A00)));
        boolean z = false;
        try {
            if (!(interfaceC16620sF instanceof C1Dr)) {
                c1jw = C1E2.A00(runnableC50379MMg, runnableC50379MMg, interfaceC16620sF);
            } else {
                C15500q5.A06(interfaceC16620sF, 2);
                c1jw = interfaceC16620sF.invoke(runnableC50379MMg, runnableC50379MMg);
            }
        } catch (Throwable th) {
            c1jw = new C1JW(false, th);
        }
        C1JX c1jx = C1JX.A02;
        if (c1jw != c1jx && (A0D = runnableC50379MMg.A0D(c1jw)) != AnonymousClass199.A04) {
            if (A0D instanceof C1JW) {
                Throwable th2 = ((C1JW) A0D).A00;
                if (!(th2 instanceof C902540k) || ((C902540k) th2).A00 != runnableC50379MMg) {
                    z = true;
                }
                if (!z) {
                    if (c1jw instanceof C1JW) {
                        throw ((C1JW) c1jw).A00;
                    }
                    return c1jw;
                }
                throw th2;
            }
            return AnonymousClass199.A00(A0D);
        }
        return c1jx;
    }
}
