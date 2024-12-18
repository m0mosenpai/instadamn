package X;

/* renamed from: X.Oqb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55825Oqb implements InterfaceC1819385d {
    public final /* synthetic */ C52692NTd A00;

    public C55825Oqb(C52692NTd c52692NTd) {
        this.A00 = c52692NTd;
    }

    @Override // X.InterfaceC1819385d
    public final void AJV(EnumC222919sW enumC222919sW) {
        C52692NTd c52692NTd = this.A00;
        InterfaceC09390do interfaceC09390do = c52692NTd.A0f;
        Integer num = ((C189698ao) interfaceC09390do.getValue()).A00;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 2) {
                if (intValue == 3) {
                    ((C189698ao) interfaceC09390do.getValue()).A00();
                    c52692NTd.A0H.A05(new PDW(((C189698ao) interfaceC09390do.getValue()).A04.A00(), true));
                }
            } else {
                c52692NTd.A0H.A03(C56707PEz.A00);
            }
        }
        C189698ao c189698ao = (C189698ao) interfaceC09390do.getValue();
        c189698ao.A02 = null;
        c189698ao.A00 = null;
        c189698ao.A01 = null;
    }
}
