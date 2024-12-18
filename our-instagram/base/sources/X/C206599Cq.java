package X;

/* renamed from: X.9Cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206599Cq extends AbstractC23611Dp implements InterfaceC16610sE {
    public boolean A00;
    public boolean A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206599Cq(int i, InterfaceC23621Ds interfaceC23621Ds) {
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
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        C206599Cq c206599Cq = new C206599Cq(i, interfaceC23621Ds);
        c206599Cq.A00 = booleanValue;
        c206599Cq.A01 = booleanValue2;
        return c206599Cq.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r1 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r0 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r0 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
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
                case 0: goto L12;
                case 1: goto L1b;
                case 2: goto L22;
                default: goto L8;
            }
        L8:
            boolean r2 = r3.A00
            boolean r1 = r3.A01
            X.7DV r0 = new X.7DV
            r0.<init>(r2, r1)
            return r0
        L12:
            boolean r1 = r3.A00
            boolean r0 = r3.A01
            if (r1 != 0) goto L30
            if (r0 == 0) goto L30
            goto L2a
        L1b:
            boolean r0 = r3.A00
            boolean r1 = r3.A01
            if (r0 == 0) goto L30
            goto L28
        L22:
            boolean r0 = r3.A00
            boolean r1 = r3.A01
            if (r0 != 0) goto L30
        L28:
            if (r1 != 0) goto L30
        L2a:
            r0 = 1
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L30:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206599Cq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
