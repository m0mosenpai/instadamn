package X;

/* renamed from: X.PJb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56809PJb implements InterfaceC171787l8 {
    public final /* synthetic */ C18920wW A00;
    public final /* synthetic */ OUU A01;

    @Override // X.InterfaceC171787l8
    public final void Ekt(EnumC168447fe enumC168447fe) {
        C51942MxP c51942MxP;
        C14360o3.A0B(enumC168447fe, 0);
        C51048Mh0 A00 = OUU.A00(this.A01);
        C18920wW c18920wW = this.A00;
        C14360o3.A0B(c18920wW, 1);
        if (enumC168447fe == EnumC168447fe.A0A) {
            Object value = A00.A0G.getValue();
            if ((value instanceof C51942MxP) && (c51942MxP = (C51942MxP) value) != null) {
                C05A c05a = A00.A0E;
                C56752PGu c56752PGu = C56752PGu.A00;
                InterfaceC57875Plf interfaceC57875Plf = c51942MxP.A00;
                String str = c51942MxP.A03;
                Integer num = c51942MxP.A02;
                boolean z = c51942MxP.A04;
                AbstractC167027dH.A12(interfaceC57875Plf, str, num);
                C14360o3.A0B(c56752PGu, 4);
                c05a.Egh(new C51942MxP(interfaceC57875Plf, c56752PGu, num, str, z));
                C1YH.A04(c18920wW, C05F.A01, false);
                A00.A01 = true;
            }
        }
    }

    public C56809PJb(C18920wW c18920wW, OUU ouu) {
        this.A01 = ouu;
        this.A00 = c18920wW;
    }

    @Override // X.InterfaceC171787l8
    public final void Czv() {
        C51048Mh0 A00 = OUU.A00(this.A01);
        A00.A01 = true;
        C51048Mh0.A03(A00);
    }

    @Override // X.InterfaceC171787l8
    public final void D0E() {
        OUU ouu = this.A01;
        ouu.A08.post(new POQ(ouu));
        C51048Mh0.A04(OUU.A00(ouu));
    }
}
