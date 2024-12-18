package X;

/* renamed from: X.9Cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206589Cp extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206589Cp(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        switch (this.A01) {
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
        return new C206589Cp(i, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206589Cp) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A01;
        C1JX c1jx = C1JX.A02;
        int i2 = this.A00;
        switch (i) {
            case 0:
                if (i2 != 0) {
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                    InterfaceC15070pN interfaceC15070pN = (InterfaceC15070pN) C2ZK.A02.getValue();
                    C52062a6 c52062a6 = C52062a6.A00;
                    this.A00 = 1;
                    if (interfaceC15070pN.collect(c52062a6, this) == c1jx) {
                        return c1jx;
                    }
                }
                throw new RuntimeException();
            case 1:
                if (i2 != 0) {
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                    InterfaceC15070pN interfaceC15070pN2 = (InterfaceC15070pN) C52092a9.A01.getValue();
                    C52152aF c52152aF = C52152aF.A00;
                    this.A00 = 1;
                    if (interfaceC15070pN2.collect(c52152aF, this) == c1jx) {
                        return c1jx;
                    }
                }
                throw new RuntimeException();
            case 2:
                if (i2 != 0) {
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                    InterfaceC15070pN interfaceC15070pN3 = (InterfaceC15070pN) C1KM.A0B.getValue();
                    C917448w c917448w = C917448w.A00;
                    this.A00 = 1;
                    if (interfaceC15070pN3.collect(c917448w, this) == c1jx) {
                        return c1jx;
                    }
                }
                throw new RuntimeException();
            default:
                if (i2 != 0) {
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                    C917548x c917548x = new C917548x();
                    InterfaceC15070pN interfaceC15070pN4 = (InterfaceC15070pN) C2ZK.A02.getValue();
                    C9GJ c9gj = new C9GJ(c917548x, 47);
                    this.A00 = 1;
                    if (interfaceC15070pN4.collect(c9gj, this) == c1jx) {
                        return c1jx;
                    }
                }
                throw new RuntimeException();
        }
    }
}
