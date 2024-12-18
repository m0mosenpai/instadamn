package X;

/* loaded from: classes9.dex */
public final class NA4 extends C1P1 {
    public final /* synthetic */ AbstractC57542kT A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;

    public NA4(AbstractC57542kT abstractC57542kT, Integer num, Object obj, String str) {
        this.A00 = abstractC57542kT;
        this.A03 = str;
        this.A01 = num;
        this.A02 = obj;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1146028032);
        this.A00.A0G(this.A03);
        C0f9.A0A(1951337870, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if ((r6 instanceof X.C115115Ig) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1 != 3) goto L8;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r6) {
        /*
            r5 = this;
            r0 = -1267044871(0xffffffffb47a6df9, float:-2.3323072E-7)
            int r3 = X.C0f9.A03(r0)
            X.2kT r4 = r5.A00
            java.lang.String r2 = r5.A03
            r4.A0G(r2)
            java.lang.Integer r0 = r5.A01
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L3c
            r0 = 2
            if (r1 == r0) goto L24
            r0 = 3
            if (r1 == r0) goto L40
        L1d:
            r0 = 2053775685(0x7a6a2145, float:3.0391806E35)
        L20:
            X.C0f9.A0A(r0, r3)
            return
        L24:
            java.lang.Object r0 = r6.A00()
            X.1un r0 = (X.InterfaceC40801un) r0
            if (r0 == 0) goto L40
            int r1 = r0.getStatusCode()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L40
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L40
            r0 = 1947448045(0x7413b2ed, float:4.680766E31)
            goto L20
        L3c:
            boolean r0 = r6 instanceof X.C115115Ig
            if (r0 != 0) goto L1d
        L40:
            java.lang.Object r0 = r5.A02
            r4.A0H(r2, r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NA4.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1808484106);
        int A032 = C0f9.A03(1689205273);
        this.A00.A0G(this.A03);
        C0f9.A0A(1907779555, A032);
        C0f9.A0A(323480862, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1305430030);
        int A032 = C0f9.A03(958141155);
        this.A00.A0G(this.A03);
        C0f9.A0A(1473186715, A032);
        C0f9.A0A(-1672225608, A03);
    }
}
