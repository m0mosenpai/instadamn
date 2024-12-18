package X;

/* loaded from: classes10.dex */
public final class Q8J extends C58252li implements InterfaceC65392TjP {
    public C2GT A00;
    public InterfaceC65512Tlh A01;
    public final /* synthetic */ AbstractC63144Sdq A02;

    public Q8J(AbstractC63144Sdq abstractC63144Sdq) {
        this.A02 = abstractC63144Sdq;
    }

    @Override // X.InterfaceC65392TjP
    public final /* bridge */ /* synthetic */ void Dx0(Object obj) {
        C62678SLr c62678SLr = (C62678SLr) obj;
        new C63406Sjd(EnumC68120VCd.SUCCESS, null, null);
        C2GT c2gt = this.A00;
        if (c2gt != null) {
            A0D(c2gt);
        }
        this.A00 = null;
        this.A02.A02.A00.A02.execute(new TON(c62678SLr, this));
    }

    @Override // X.C58252li, X.C2GT
    public final void A03() {
        super.A03();
        InterfaceC65512Tlh interfaceC65512Tlh = this.A01;
        if (interfaceC65512Tlh != null) {
            interfaceC65512Tlh.A9a(this);
        }
    }

    @Override // X.C58252li, X.C2GT
    public final void A04() {
        super.A04();
        InterfaceC65512Tlh interfaceC65512Tlh = this.A01;
        if (interfaceC65512Tlh != null) {
            interfaceC65512Tlh.AOi(this);
        }
    }
}
