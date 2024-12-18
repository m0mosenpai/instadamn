package X;

/* renamed from: X.MSg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50527MSg extends AbstractC23611Dp implements InterfaceC16610sE {
    public boolean A00;
    public boolean A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50527MSg(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A02;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        C50527MSg c50527MSg = new C50527MSg(i, interfaceC23621Ds);
        c50527MSg.A00 = booleanValue;
        c50527MSg.A01 = booleanValue2;
        return c50527MSg.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (r1 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == false) goto L8;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            X.AbstractC09560e7.A00(r4)
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L2b;
                default: goto L8;
            }
        L8:
            boolean r1 = r3.A00
            boolean r0 = r3.A01
            if (r1 == 0) goto L11
            r2 = 1
            if (r0 != 0) goto L12
        L11:
            r2 = 0
        L12:
            r1 = 14
            X.MsJ r0 = new X.MsJ
            r0.<init>(r2, r1)
            return r0
        L1a:
            boolean r1 = r3.A00
            boolean r0 = r3.A01
            if (r1 == 0) goto L23
            X.NIO r0 = X.NIO.A00
            return r0
        L23:
            if (r0 == 0) goto L28
            X.NIM r0 = X.NIM.A00
            return r0
        L28:
            X.NIN r0 = X.NIN.A00
            return r0
        L2b:
            boolean r0 = r3.A00
            boolean r1 = r3.A01
            if (r0 == 0) goto L34
            r0 = 1
            if (r1 == 0) goto L35
        L34:
            r0 = 0
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50527MSg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
