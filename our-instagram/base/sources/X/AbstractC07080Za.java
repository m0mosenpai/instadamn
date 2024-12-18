package X;

/* renamed from: X.0Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC07080Za {
    public static final Object A00(InterfaceC23621Ds interfaceC23621Ds, InterfaceC24751Is interfaceC24751Is, InterfaceC19960yQ interfaceC19960yQ) {
        Object A01 = A01(interfaceC23621Ds, interfaceC24751Is, interfaceC19960yQ, true);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    public static final C05U A02(InterfaceC24751Is interfaceC24751Is) {
        return new C05U(C05F.A00, AnonymousClass191.A00, interfaceC24751Is, -3, true);
    }

    public static final C05U A03(InterfaceC24751Is interfaceC24751Is) {
        return new C05U(C05F.A00, AnonymousClass191.A00, interfaceC24751Is, -3, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:12:0x0035, B:13:0x005b, B:18:0x006f, B:20:0x0078, B:32:0x006c, B:35:0x0057), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008a -> B:13:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.InterfaceC23621Ds r7, X.InterfaceC24751Is r8, X.InterfaceC19960yQ r9, boolean r10) {
        /*
            boolean r0 = r7 instanceof X.C0L5
            if (r0 == 0) goto L2f
            r6 = r7
            X.0L5 r6 = (X.C0L5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r6.A00 = r2
        L12:
            java.lang.Object r0 = r6.A05
            X.1JX r5 = X.C1JX.A02
            int r1 = r6.A00
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L50
            if (r1 == r3) goto L41
            if (r1 != r4) goto L39
            boolean r10 = r6.A04
            java.lang.Object r2 = r6.A03
            X.1Jl r2 = (X.C24861Jl) r2
            java.lang.Object r8 = r6.A02
            X.1Is r8 = (X.InterfaceC24751Is) r8
            java.lang.Object r9 = r6.A01
            X.0yQ r9 = (X.InterfaceC19960yQ) r9
            goto L35
        L2f:
            X.0L5 r6 = new X.0L5
            r6.<init>(r7)
            goto L12
        L35:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L97
            goto L5b
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L41:
            boolean r10 = r6.A04
            java.lang.Object r2 = r6.A03
            X.1Jl r2 = (X.C24861Jl) r2
            java.lang.Object r8 = r6.A02
            X.1Is r8 = (X.InterfaceC24751Is) r8
            java.lang.Object r9 = r6.A01
            X.0yQ r9 = (X.InterfaceC19960yQ) r9
            goto L6c
        L50:
            X.AbstractC09560e7.A00(r0)
            boolean r0 = r9 instanceof X.C14970pC
            if (r0 != 0) goto La0
            X.1Jl r2 = r8.CgS()     // Catch: java.lang.Throwable -> L97
        L5b:
            r6.A01 = r9     // Catch: java.lang.Throwable -> L97
            r6.A02 = r8     // Catch: java.lang.Throwable -> L97
            r6.A03 = r2     // Catch: java.lang.Throwable -> L97
            r6.A04 = r10     // Catch: java.lang.Throwable -> L97
            r6.A00 = r3     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r2.A01(r6)     // Catch: java.lang.Throwable -> L97
            if (r0 != r5) goto L6f
            goto L8d
        L6c:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L97
        L6f:
            r1 = 0
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L97
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r2.A00()     // Catch: java.lang.Throwable -> L97
            r6.A01 = r9     // Catch: java.lang.Throwable -> L97
            r6.A02 = r8     // Catch: java.lang.Throwable -> L97
            r6.A03 = r2     // Catch: java.lang.Throwable -> L97
            r6.A04 = r10     // Catch: java.lang.Throwable -> L97
            r6.A00 = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r9.emit(r0, r6)     // Catch: java.lang.Throwable -> L97
            if (r0 != r5) goto L5b
            goto L8e
        L8d:
            return r5
        L8e:
            return r5
        L8f:
            if (r10 == 0) goto L94
            r8.AGH(r1)
        L94:
            X.0eB r5 = X.C0eB.A00
            return r5
        L97:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L99
        L99:
            r1 = move-exception
            if (r10 == 0) goto L9f
            X.C51P.A00(r0, r8)
        L9f:
            throw r1
        La0:
            X.0pC r9 = (X.C14970pC) r9
            java.lang.Throwable r1 = r9.A00
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC07080Za.A01(X.1Ds, X.1Is, X.0yQ, boolean):java.lang.Object");
    }
}
