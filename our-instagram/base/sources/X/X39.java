package X;

/* loaded from: classes11.dex */
public final class X39 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X39(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A01 = j;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            ((InterfaceC16600sD) this.A04).invoke(Long.valueOf(this.A01), this.A02, this.A03, this.A05);
            return C0eB.A00;
        }
        C135276Ac c135276Ac = C135266Ab.A04;
        C135266Ab c135266Ab = (C135266Ab) this.A04;
        C78473fD c78473fD = (C78473fD) this.A02;
        Object obj = c78473fD.A05;
        return c135276Ac.A03(c135276Ac.A01(c78473fD.A04, c135266Ab, obj, AbstractC135256Aa.A00((C6FG) obj), c78473fD.A03), (C102884kP) this.A05, ((C103054kg) this.A03).A03, this.A01);
    }
}
