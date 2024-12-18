package X;

/* loaded from: classes5.dex */
public final class D5F extends AbstractC23611Dp implements InterfaceC16600sD {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5F(AbstractC51025MgY abstractC51025MgY, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A03 = 2;
        this.A01 = abstractC51025MgY;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        D5F d5f;
        boolean A1a2;
        boolean A1a3;
        InterfaceC23621Ds interfaceC23621Ds2;
        int i2;
        switch (this.A03) {
            case 0:
                A1a3 = AbstractC166987dD.A1a(obj2);
                interfaceC23621Ds2 = (InterfaceC23621Ds) obj4;
                i2 = 0;
                d5f = new D5F(i2, interfaceC23621Ds2);
                d5f.A00 = obj;
                d5f.A02 = A1a3;
                d5f.A01 = obj3;
                break;
            case 1:
                A1a3 = AbstractC166987dD.A1a(obj2);
                interfaceC23621Ds2 = (InterfaceC23621Ds) obj4;
                i2 = 1;
                d5f = new D5F(i2, interfaceC23621Ds2);
                d5f.A00 = obj;
                d5f.A02 = A1a3;
                d5f.A01 = obj3;
                break;
            case 2:
                A1a2 = AbstractC166987dD.A1a(obj3);
                d5f = new D5F((AbstractC51025MgY) this.A01, (InterfaceC23621Ds) obj4);
                d5f.A00 = obj2;
                d5f.A02 = A1a2;
                break;
            case 3:
                A1a = AbstractC166987dD.A1a(obj);
                interfaceC23621Ds = (InterfaceC23621Ds) obj4;
                i = 3;
                d5f = new D5F(i, interfaceC23621Ds);
                d5f.A02 = A1a;
                d5f.A00 = obj2;
                d5f.A01 = obj3;
                break;
            case 4:
                A1a = AbstractC166987dD.A1a(obj);
                interfaceC23621Ds = (InterfaceC23621Ds) obj4;
                i = 4;
                d5f = new D5F(i, interfaceC23621Ds);
                d5f.A02 = A1a;
                d5f.A00 = obj2;
                d5f.A01 = obj3;
                break;
            default:
                A1a2 = AbstractC166987dD.A1a(obj3);
                d5f = new D5F(5, (InterfaceC23621Ds) obj4);
                d5f.A00 = obj;
                d5f.A01 = obj2;
                d5f.A02 = A1a2;
                break;
        }
        return d5f.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.A04 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00af, code lost:
    
        if (r2.A0E != false) goto L60;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5F(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A03 = i;
    }
}
