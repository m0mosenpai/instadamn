package X;

/* renamed from: X.DcC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30529DcC extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ InterfaceC138146Ns A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30529DcC(InterfaceC138146Ns interfaceC138146Ns, int i, int i2, long j) {
        super(3);
        this.A03 = interfaceC138146Ns;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A0H = AbstractC166987dD.A0H(obj);
        int A0H2 = AbstractC166987dD.A0H(obj2);
        InterfaceC138146Ns interfaceC138146Ns = this.A03;
        long j = this.A02;
        return AbstractC25229BEm.A0Z(interfaceC138146Ns, (InterfaceC16660sJ) obj3, C5AU.A03(j, A0H + this.A00), C5AU.A02(j, A0H2 + this.A01));
    }
}
