package X;

/* renamed from: X.7qZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174997qZ {
    public C69716VuB A00;
    public InterfaceC175497rP A01;
    public InterfaceC175497rP A02;
    public volatile float A03;
    public volatile float A04;
    public volatile float A05;
    public volatile float A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public final InterfaceC175497rP A00(boolean z) {
        if (z) {
            InterfaceC175497rP interfaceC175497rP = this.A01;
            if (interfaceC175497rP == null) {
                C176277sk c176277sk = new C176277sk(new C177077u3(), this, true);
                this.A01 = c176277sk;
                return c176277sk;
            }
            return interfaceC175497rP;
        }
        InterfaceC175497rP interfaceC175497rP2 = this.A02;
        if (interfaceC175497rP2 != null) {
            return interfaceC175497rP2;
        }
        C176277sk c176277sk2 = new C176277sk(new C23462AaZ(null), this, false);
        this.A02 = c176277sk2;
        return c176277sk2;
    }
}
