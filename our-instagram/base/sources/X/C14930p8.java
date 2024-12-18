package X;

/* renamed from: X.0p8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14930p8 implements InterfaceC19960yQ {
    public final /* synthetic */ AnonymousClass195 A00;
    public final /* synthetic */ InterfaceC71543Iw A01;
    public final /* synthetic */ C14830ox A02;
    public final /* synthetic */ C13A A03;

    public C14930p8(AnonymousClass195 anonymousClass195, InterfaceC71543Iw interfaceC71543Iw, C14830ox c14830ox, C13A c13a) {
        this.A00 = anonymousClass195;
        this.A03 = c13a;
        this.A01 = interfaceC71543Iw;
        this.A02 = c14830ox;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // X.InterfaceC19960yQ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(X.InterfaceC23621Ds r7, X.InterfaceC19390xP r8) {
        /*
            r6 = this;
            r3 = 3
            boolean r0 = r7 instanceof X.C0MW
            if (r0 == 0) goto L83
            r5 = r7
            X.0MW r5 = (X.C0MW) r5
            int r0 = r5.A04
            if (r0 != r3) goto L83
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 != r3) goto L89
            java.lang.Object r8 = r5.A02
            X.0xP r8 = (X.InterfaceC19390xP) r8
            java.lang.Object r0 = r5.A01
            X.0p8 r0 = (X.C14930p8) r0
            X.AbstractC09560e7.A00(r1)
        L2d:
            X.3Iw r4 = r0.A01
            r3 = 0
            X.0ox r1 = r0.A02
            X.13A r0 = r0.A03
            X.0Hg r2 = new X.0Hg
            r2.<init>(r3, r8, r1, r0)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r1, r2, r4)
            X.0eB r0 = X.C0eB.A00
            return r0
        L43:
            X.AbstractC09560e7.A00(r1)
            X.195 r1 = r6.A00
            if (r1 == 0) goto L55
            boolean r0 = r1.isActive()
            if (r0 != 0) goto L55
            java.util.concurrent.CancellationException r0 = r1.AlP()
            throw r0
        L55:
            X.13A r2 = r6.A03
            r5.A01 = r6
            r5.A02 = r8
            r5.A00 = r3
        L5d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C13A.A02
            int r1 = r0.getAndDecrement(r2)
            int r0 = r2.A00
            if (r1 > r0) goto L5d
            if (r1 > 0) goto L81
            X.1Ds r0 = X.C1E2.A02(r5)
            X.1Jo r1 = X.AbstractC24881Jn.A00(r0)
            boolean r0 = X.C13A.A01(r1, r2)     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L7a
            r2.A03(r1)     // Catch: java.lang.Throwable -> L91
        L7a:
            java.lang.Object r0 = r1.A0E()
            if (r0 != r4) goto L81
            return r4
        L81:
            r0 = r6
            goto L2d
        L83:
            X.0MW r5 = new X.0MW
            r5.<init>(r6, r7, r3)
            goto L17
        L89:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L91:
            r0 = move-exception
            r1.A0J()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14930p8.emit(X.1Ds, X.0xP):java.lang.Object");
    }
}
