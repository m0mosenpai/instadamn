package X;

/* renamed from: X.4GM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GM extends C19H {
    public final Object A00;
    public final C19F A01;
    public final C1Uf A02;
    public final AnonymousClass198 A03;

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r6.A0J(X.AnonymousClass198.A02(r4, r5, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000c, code lost:
    
        if (r3 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3.A00.CPE(new X.C4GM(r4, r3, r5, r6), false, false) != X.C19C.A00) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r3 = X.AnonymousClass198.A05(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // X.C19I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(java.lang.Throwable r8) {
        /*
            r7 = this;
            X.198 r6 = r7.A03
            X.1Uf r5 = r7.A02
            X.19F r0 = r7.A01
            java.lang.Object r4 = r7.A00
            X.19F r3 = X.AnonymousClass198.A05(r0)
            if (r3 == 0) goto L24
        Le:
            X.198 r2 = r3.A00
            r1 = 0
            X.4GM r0 = new X.4GM
            r0.<init>(r4, r3, r5, r6)
            X.19D r1 = r2.CPE(r0, r1, r1)
            X.19C r0 = X.C19C.A00
            if (r1 != r0) goto L2b
            X.19F r3 = X.AnonymousClass198.A05(r3)
            if (r3 != 0) goto Le
        L24:
            java.lang.Object r0 = X.AnonymousClass198.A02(r4, r5, r6)
            r6.A0J(r0)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GM.A05(java.lang.Throwable):void");
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C0eB.A00;
    }

    public C4GM(Object obj, C19F c19f, C1Uf c1Uf, AnonymousClass198 anonymousClass198) {
        this.A03 = anonymousClass198;
        this.A02 = c1Uf;
        this.A01 = c19f;
        this.A00 = obj;
    }
}
