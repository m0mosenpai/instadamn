package X;

/* renamed from: X.Syx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64081Syx implements InterfaceC65488Tl8 {
    public final /* synthetic */ SLZ A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    @Override // X.InterfaceC65488Tl8
    public final void DG0(SBA sba) {
        C14360o3.A0B(sba, 0);
        SQb.A01(this.A01, this.A03, sba.A00);
    }

    @Override // X.InterfaceC65488Tl8
    public final void DqC(String str) {
        InterfaceC103384lE interfaceC103384lE;
        String str2;
        C14360o3.A0B(str, 0);
        C6FQ c6fq = this.A01;
        Boolean bool = (Boolean) C131845xK.A00(c6fq, AbstractC58320PtC.A0g(str), this.A02);
        if (bool != null) {
            if (!bool.booleanValue()) {
                interfaceC103384lE = this.A03;
                str2 = "coverage_not_available";
            } else {
                this.A00.A00();
                return;
            }
        } else {
            interfaceC103384lE = this.A03;
            str2 = "could_not_parse_coverage_response";
        }
        SQb.A01(c6fq, interfaceC103384lE, str2);
    }

    public C64081Syx(SLZ slz, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2) {
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE;
        this.A03 = interfaceC103384lE2;
        this.A00 = slz;
    }
}
