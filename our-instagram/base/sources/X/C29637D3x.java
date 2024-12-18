package X;

/* renamed from: X.D3x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29637D3x extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29637D3x(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(1, interfaceC23621Ds);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A00;
        Object obj = this.A01;
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
        return new C29637D3x(obj, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C29637D3x) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        AbstractC09560e7.A00(obj);
        switch (i) {
            case 0:
                C5Y1.A01((C5Y1) this.A01);
                return C0eB.A00;
            case 1:
                return AbstractC25226BEj.A1C(this.A01);
            default:
                C26827Bsp.A01((C26827Bsp) this.A01);
                return C0eB.A00;
        }
    }
}
