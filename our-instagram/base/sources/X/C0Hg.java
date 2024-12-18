package X;

/* renamed from: X.0Hg, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Hg extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Hg(InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP, C14830ox c14830ox, C13A c13a) {
        super(2, interfaceC23621Ds);
        this.A02 = 2;
        this.A04 = interfaceC19390xP;
        this.A03 = c14830ox;
        this.A01 = c13a;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                obj3 = this.A04;
                i = 0;
                break;
            case 1:
                obj2 = this.A03;
                obj3 = this.A04;
                i = 1;
                break;
            default:
                return new C0Hg(interfaceC23621Ds, (InterfaceC19390xP) this.A04, (C14830ox) this.A03, (C13A) this.A01);
        }
        C0Hg c0Hg = new C0Hg(obj3, obj2, interfaceC23621Ds, i);
        c0Hg.A01 = obj;
        return c0Hg;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0Hg) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005f: IF  (r0v6 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (r2 I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:8:0x006c (LINE:95), block:B:30:0x005f */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L35;
                case 1: goto L62;
                default: goto L5;
            }
        L5:
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L10
            X.AbstractC09560e7.A00(r9)     // Catch: java.lang.Throwable -> L2c
            goto L24
        L10:
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r1 = r8.A04     // Catch: java.lang.Throwable -> L2c
            X.0xP r1 = (X.InterfaceC19390xP) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r8.A03     // Catch: java.lang.Throwable -> L2c
            X.0ox r0 = (X.C14830ox) r0     // Catch: java.lang.Throwable -> L2c
            r8.A00 = r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r1.collect(r0, r8)     // Catch: java.lang.Throwable -> L2c
            if (r0 != r6) goto L24
            return r6
        L24:
            java.lang.Object r0 = r8.A01
            X.13A r0 = (X.C13A) r0
            r0.A02()
            goto L6c
        L2c:
            r1 = move-exception
            java.lang.Object r0 = r8.A01
            X.13A r0 = (X.C13A) r0
            r0.A02()
            throw r1
        L35:
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L42
            java.lang.Object r2 = r8.A01
            X.AbstractC09560e7.A00(r9)     // Catch: X.C10C -> L5c
            goto L6c
        L42:
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            X.0xP r3 = (X.InterfaceC19390xP) r3
            java.lang.Object r1 = r8.A04
            r0 = 2
            X.0pB r2 = new X.0pB
            r2.<init>(r0, r1, r4)
            r8.A01 = r2     // Catch: X.C10C -> L5c
            r8.A00 = r5     // Catch: X.C10C -> L5c
            java.lang.Object r0 = r3.collect(r2, r8)     // Catch: X.C10C -> L5c
            goto L8c
        L5c:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 == r2) goto L6c
            throw r1
        L62:
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r7 = 1
            if (r0 == 0) goto L6f
            X.AbstractC09560e7.A00(r9)
        L6c:
            X.0eB r6 = X.C0eB.A00
            return r6
        L6f:
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r5 = r8.A01
            X.0yQ r5 = (X.InterfaceC19960yQ) r5
            java.lang.Object r4 = r8.A03
            X.0xP[] r4 = (X.InterfaceC19390xP[]) r4
            X.05B r3 = X.C05B.A00
            r2 = 0
            java.lang.Object r1 = r8.A04
            X.0s9 r1 = (X.C0s9) r1
            X.0V5 r0 = new X.0V5
            r0.<init>(r2, r1)
            r8.A00 = r7
            java.lang.Object r0 = X.AnonymousClass104.A00(r8, r3, r0, r5, r4)
        L8c:
            if (r0 != r6) goto L6c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Hg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Hg(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj2;
        this.A04 = obj;
    }
}
