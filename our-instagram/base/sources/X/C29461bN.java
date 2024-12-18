package X;

/* renamed from: X.1bN */
/* loaded from: classes.dex */
public final class C29461bN {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A00(X.C29461bN r6, java.util.Collection r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = 1
            boolean r0 = X.PXA.A03(r8, r5)
            if (r0 == 0) goto L5f
            r4 = r8
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            if (r0 == 0) goto L28
            if (r0 == r5) goto L3f
            if (r0 != r2) goto L65
            X.AbstractC09560e7.A00(r1)
        L25:
            X.0eB r3 = X.C0eB.A00
            return r3
        L28:
            X.AbstractC09560e7.A00(r1)
            r4.A01 = r6
            r4.A02 = r7
            r4.A00 = r5
            X.1YP r1 = r6.A01
            X.Jb4 r0 = new X.Jb4
            r0.<init>(r6)
            java.lang.Object r0 = X.C2Q9.A01(r1, r0, r4)
            if (r0 != r3) goto L4a
            return r3
        L3f:
            java.lang.Object r7 = r4.A02
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r6 = r4.A01
            X.1bN r6 = (X.C29461bN) r6
            X.AbstractC09560e7.A00(r1)
        L4a:
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r2
            X.1YP r1 = r6.A01
            X.Jb6 r0 = new X.Jb6
            r0.<init>(r6, r7)
            java.lang.Object r0 = X.C2Q9.A01(r1, r0, r4)
            if (r0 != r3) goto L25
            return r3
        L5f:
            X.PXA r4 = new X.PXA
            r4.<init>(r6, r8, r5)
            goto L15
        L65:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29461bN.A00(X.1bN, java.util.Collection, X.1Ds):java.lang.Object");
    }

    public C29461bN(C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new AbstractC29571bY(c1yp) { // from class: X.1bV
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `user_feed_items` (`id`,`ranking_weight`,`data`,`media_age`,`stored_age`,`item_type`) VALUES (?,?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C108104tt c108104tt = (C108104tt) obj;
                interfaceC37561ot.ADp(1, c108104tt.A04);
                if (c108104tt.A02 == null) {
                    interfaceC37561ot.ADj(2);
                } else {
                    interfaceC37561ot.ADg(2, r0.floatValue());
                }
                interfaceC37561ot.ADc(3, c108104tt.A05);
                Long l = c108104tt.A03;
                if (l == null) {
                    interfaceC37561ot.ADj(4);
                } else {
                    interfaceC37561ot.ADi(4, l.longValue());
                }
                interfaceC37561ot.ADi(5, c108104tt.A00);
                interfaceC37561ot.ADp(6, c108104tt.A01.toString());
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.1bh
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM user_feed_items";
            }
        };
    }

    public C29461bN() {
    }
}
