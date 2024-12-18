package X;

/* renamed from: X.P1h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56372P1h implements InterfaceC1338062l {
    public final /* synthetic */ C62m A00;
    public final /* synthetic */ C131965xW A01;

    public C56372P1h(C62m c62m, C131965xW c131965xW) {
        this.A01 = c131965xW;
        this.A00 = c62m;
    }

    @Override // X.InterfaceC1338062l
    public final void DFf() {
        C62m c62m = this.A00;
        if (c62m != null) {
            c62m.DFf();
        }
        C131965xW c131965xW = this.A01;
        C131975xX c131975xX = C131965xW.A05;
        AbstractC130145uK.A00(c131965xW.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r5 != null) goto L6;
     */
    @Override // X.InterfaceC1338062l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dpt(X.C130135uJ r5) {
        /*
            r4 = this;
            X.5xW r3 = r4.A01
            X.5xX r0 = X.C131965xW.A05
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 0
            if (r5 == 0) goto L21
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L21
        Ld:
            boolean r0 = r5.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L13:
            X.AbstractC130145uK.A01(r2, r0, r1)
            r3.A0A(r5)
            X.62m r0 = r4.A00
            if (r0 == 0) goto L20
            r0.onSuccess()
        L20:
            return
        L21:
            r1 = r0
            if (r5 == 0) goto L13
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56372P1h.Dpt(X.5uJ):void");
    }
}
