package X;

/* loaded from: classes9.dex */
public final class PWM extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWM(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        if (i != 0) {
            return ((C55171Oda) this.A04).A05(null, this);
        }
        return C51046Mgy.A02((C51046Mgy) this.A04, this);
    }
}
