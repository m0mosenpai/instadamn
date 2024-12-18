package X;

/* renamed from: X.BmE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26431BmE extends AbstractC51572Yf {
    public final EnumC129475tC A00;
    public final EnumC72438Xdi A01;
    public final EnumC27424C8r A02;
    public final EnumC72394Xcg A03;
    public final InterfaceC30923Dia A04;

    public C26431BmE(EnumC72438Xdi enumC72438Xdi, EnumC27424C8r enumC27424C8r, EnumC72394Xcg enumC72394Xcg, InterfaceC30923Dia interfaceC30923Dia, EnumC129475tC enumC129475tC) {
        AbstractC167027dH.A0a(1, enumC72438Xdi, enumC27424C8r, enumC72394Xcg, enumC129475tC);
        this.A01 = enumC72438Xdi;
        this.A02 = enumC27424C8r;
        this.A03 = enumC72394Xcg;
        this.A00 = enumC129475tC;
        this.A04 = interfaceC30923Dia;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        int A01 = AbstractC28379Cfi.A01(EnumC72394Xcg.A0A, this.A04);
        Object A00 = AbstractC77183d4.A00(c76223bS, new BFI(A01, 38, this, c76223bS), AbstractC25228BEl.A1Z(this.A00, A01));
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A0L = AbstractC25234BEr.A0L(AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0o(num, A00)), num, 0, Double.doubleToRawLongBits(40.0d));
        return AbstractC25226BEj.A0l(new C26450BmX(this.A01, null, EnumC27423C8q.SIZE_24, this.A02, this.A03, null), AbstractC25232BEp.A12(c76223bS), c76223bS, A0L);
    }
}
