package X;

/* loaded from: classes5.dex */
public final class D5A extends AbstractC23611Dp implements InterfaceC16610sE {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5A(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        D5A d5a;
        switch (this.A02) {
            case 0:
                j = ((C119365at) obj2).A00;
                d5a = new D5A(this.A01, (InterfaceC23621Ds) obj3, 0);
                d5a.A00 = j;
                break;
            case 1:
                j = ((C5YC) obj2).A00;
                d5a = new D5A((InterfaceC23621Ds) obj3);
                d5a.A01 = obj;
                d5a.A00 = j;
                break;
            default:
                long j2 = ((C119365at) obj2).A00;
                d5a = new D5A(this.A01, (InterfaceC23621Ds) obj3, 2);
                d5a.A00 = j2;
                break;
        }
        return d5a.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A02) {
            case 0:
                AbstractC09560e7.A00(obj);
                AbstractC25227BEk.A18((InterfaceC74953Yl) this.A01, C119365at.A01(this.A00));
                return C0eB.A00;
            case 1:
                AbstractC09560e7.A00(obj);
                C114205Dh c114205Dh = (C114205Dh) this.A01;
                long j = this.A00;
                return new C114205Dh(c114205Dh.A01 / C5YC.A02(j), c114205Dh.A03 / C5YC.A00(j), c114205Dh.A02 / C5YC.A02(j), c114205Dh.A00 / C5YC.A00(j));
            default:
                AbstractC09560e7.A00(obj);
                ((InterfaceC16660sJ) this.A01).invoke(AbstractC25225BEi.A0R(this.A00));
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5A(InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = 1;
    }
}
