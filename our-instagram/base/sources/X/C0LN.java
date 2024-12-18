package X;

/* renamed from: X.0LN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LN extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LN(C0o9 c0o9, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = 0;
        this.A02 = c0o9;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        switch (this.A03) {
            case 0:
                return new C0LN((C0o9) this.A02, interfaceC23621Ds);
            case 1:
                obj2 = this.A01;
                i = 1;
                C0LN c0ln = new C0LN(obj2, interfaceC23621Ds, i);
                c0ln.A02 = obj;
                return c0ln;
            default:
                obj2 = this.A01;
                i = 2;
                C0LN c0ln2 = new C0LN(obj2, interfaceC23621Ds, i);
                c0ln2.A02 = obj;
                return c0ln2;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0LN) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a8 -> B:18:0x0049). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A03
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L1e;
                default: goto L5;
            }
        L5:
            X.1JX r8 = X.C1JX.A02
            int r0 = r13.A00
            r2 = 1
            if (r0 != 0) goto Lab
            X.AbstractC09560e7.A00(r14)
            java.lang.Object r1 = r13.A02
            java.lang.Object r0 = r13.A01
            X.0yQ r0 = (X.InterfaceC19960yQ) r0
            r13.A00 = r2
            java.lang.Object r0 = r0.emit(r1, r13)
        L1b:
            if (r0 != r8) goto Lae
            return r8
        L1e:
            X.1JX r8 = X.C1JX.A02
            int r0 = r13.A00
            r4 = 1
            if (r0 != 0) goto Lab
            X.AbstractC09560e7.A00(r14)
            java.lang.Object r3 = r13.A02
            java.lang.Object r2 = r13.A01
            X.0xP r2 = (X.InterfaceC19390xP) r2
            r1 = 4
            X.0pD r0 = new X.0pD
            r0.<init>(r3, r1)
            r13.A00 = r4
            java.lang.Object r0 = r2.collect(r0, r13)
            goto L1b
        L3b:
            X.1JX r8 = X.C1JX.A02
            int r0 = r13.A00
            r7 = 1
            if (r0 == 0) goto L92
            java.lang.Object r6 = r13.A01
            X.12n r6 = (X.C213512n) r6
            X.AbstractC09560e7.A00(r14)
        L49:
            java.lang.Object r5 = r13.A02
            X.0o9 r5 = (X.C0o9) r5
            long r10 = android.os.SystemClock.uptimeMillis()
        L51:
            java.lang.Object r9 = r6.A01()
            X.0v8 r9 = (X.C0v8) r9
            if (r9 != 0) goto L84
            long r11 = android.os.SystemClock.uptimeMillis()
            r10 = 0
        L5e:
            X.12n r0 = r5.A05
            java.lang.Object r9 = r0.A01()
            X.0v8 r9 = (X.C0v8) r9
            if (r9 == 0) goto L9a
            long r0 = r9.A00
            long r3 = r11 - r0
            long r0 = r5.A00
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L76
            r9.A00()
            goto L5e
        L76:
            boolean r0 = r9.A04
            if (r0 != 0) goto L5e
            r6.A02(r9)
            int r10 = r10 + 1
            r0 = 16
            if (r10 >= r0) goto L9a
            goto L5e
        L84:
            long r0 = r9.A00
            long r3 = r10 - r0
            long r1 = r5.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L51
            r9.A00()
            goto L51
        L92:
            X.AbstractC09560e7.A00(r14)
            X.12n r6 = new X.12n
            r6.<init>(r7)
        L9a:
            java.lang.Object r0 = r13.A02
            X.0o9 r0 = (X.C0o9) r0
            long r0 = r0.A00
            r13.A01 = r6
            r13.A00 = r7
            java.lang.Object r0 = X.AbstractC89993zf.A01(r13, r0)
            if (r0 != r8) goto L49
            return r8
        Lab:
            X.AbstractC09560e7.A00(r14)
        Lae:
            X.0eB r8 = X.C0eB.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LN(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }
}
