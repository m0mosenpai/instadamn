package X;

/* renamed from: X.OQv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54920OQv {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A00(com.instagram.zero.headers.IGZeroHeadersStorage r5, java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 40
            boolean r0 = X.C29631D3m.A03(r8, r3)
            if (r0 == 0) goto L81
            r4 = r8
            X.D3m r4 = (X.C29631D3m) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L73
            if (r1 != r0) goto L87
            java.lang.Object r7 = r4.A01
            X.AbstractC09560e7.A00(r3)
        L26:
            java.util.Map r3 = (java.util.Map) r3
            if (r7 == 0) goto L2f
            java.lang.Object r3 = r3.get(r7)
        L2e:
            return r3
        L2f:
            java.util.Iterator r5 = X.AbstractC166997dE.A15(r3)
            boolean r0 = r5.hasNext()
            r3 = 0
            if (r0 != 0) goto L44
            r4 = r3
        L3b:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L2e
            java.lang.Object r3 = r4.getValue()
            return r3
        L44:
            java.lang.Object r4 = r5.next()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3b
            r0 = r4
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            libraries.zero.headers.ZeroHeadersEntry r0 = (libraries.zero.headers.ZeroHeadersEntry) r0
            int r2 = r0.A00
        L59:
            java.lang.Object r1 = r5.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            libraries.zero.headers.ZeroHeadersEntry r0 = (libraries.zero.headers.ZeroHeadersEntry) r0
            int r0 = r0.A00
            if (r2 >= r0) goto L6c
            r4 = r1
            r2 = r0
        L6c:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L59
            goto L3b
        L73:
            X.AbstractC09560e7.A00(r3)
            r4.A01 = r7
            r4.A00 = r0
            java.lang.Object r3 = r5.A04(r6, r4)
            if (r3 != r2) goto L26
            return r2
        L81:
            X.D3m r4 = new X.D3m
            r4.<init>(r3, r8)
            goto L16
        L87:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54920OQv.A00(com.instagram.zero.headers.IGZeroHeadersStorage, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A01(com.instagram.zero.headers.IGZeroHeadersStorage r5, X.InterfaceC23621Ds r6) {
        /*
            r4 = 32
            boolean r0 = X.D3k.A02(r6, r4)
            if (r0 == 0) goto L3b
            r3 = r6
            X.D3k r3 = (X.D3k) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r4 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L54
            X.AbstractC09560e7.A00(r4)
        L24:
            java.util.Map r4 = (java.util.Map) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L41
            java.lang.String r2 = ""
            return r2
        L2f:
            X.AbstractC09560e7.A00(r4)
            r3.A00 = r0
            java.lang.Object r4 = r5.A05(r3)
            if (r4 != r2) goto L24
            return r2
        L3b:
            X.D3k r3 = new X.D3k
            r3.<init>(r4, r6)
            goto L16
        L41:
            X.3Sh r3 = X.AbstractC73763Sg.A03
            X.3RD r2 = X.C3RD.A01
            X.3RL r1 = new X.3RL
            r1.<init>(r2, r2)
            X.3RL r0 = new X.3RL
            r0.<init>(r2, r1)
            java.lang.String r2 = r3.A02(r4, r0)
            return r2
        L54:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54920OQv.A01(com.instagram.zero.headers.IGZeroHeadersStorage, X.1Ds):java.lang.Object");
    }
}
