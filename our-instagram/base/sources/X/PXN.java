package X;

/* loaded from: classes9.dex */
public final class PXN extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXN(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(1, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        switch (this.A03) {
            case 0:
                obj3 = this.A02;
                obj = this.A04;
                obj2 = this.A01;
                i = 0;
                return new PXN(obj3, obj, obj2, interfaceC23621Ds, i);
            case 1:
                obj = this.A04;
                obj2 = this.A01;
                obj3 = this.A02;
                i = 1;
                return new PXN(obj3, obj, obj2, interfaceC23621Ds, i);
            case 2:
                return new PXN((C50950MfJ) this.A04, interfaceC23621Ds);
            case 3:
                obj = this.A04;
                obj2 = this.A01;
                obj3 = this.A02;
                i = 3;
                return new PXN(obj3, obj, obj2, interfaceC23621Ds, i);
            default:
                obj = this.A04;
                obj3 = this.A02;
                obj2 = this.A01;
                i = 4;
                return new PXN(obj3, obj, obj2, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((PXN) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0469 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXN(C50950MfJ c50950MfJ, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A03 = 2;
        this.A04 = c50950MfJ;
    }
}
