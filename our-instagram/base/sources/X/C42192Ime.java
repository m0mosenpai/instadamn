package X;

import java.util.List;

/* renamed from: X.Ime, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42192Ime implements InterfaceC116905Qw {
    public final /* synthetic */ IKW A00;
    public final /* synthetic */ InterfaceC71543Iw A01;

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        C14360o3.A0B(c38971HDz, 0);
        AbstractC12430kl.A00("AudioPageRepository-5", new D8K(23, this.A01, c38971HDz));
    }

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C14360o3.A0B(c37752GjR, 0);
        AbstractC12430kl.A00("AudioPageRepository-3", new D8K(24, this.A01, c37752GjR));
    }

    @Override // X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C14360o3.A0B(c37818GkY, 0);
        IKW ikw = this.A00;
        InterfaceC09390do interfaceC09390do = ikw.A08;
        if (interfaceC09390do.getValue() == EnumC125615m7.A04 || interfaceC09390do.getValue() == EnumC125615m7.A02) {
            InterfaceC124295jj interfaceC124295jj = c37818GkY.A01;
            if (((C38959HDl) interfaceC124295jj).A0D) {
                ikw.A00 = C05F.A0C;
            } else {
                ikw.A00 = C05F.A00;
                C05A c05a = ikw.A01;
                if (AbstractC166987dD.A1a(c05a.getValue())) {
                    C05A c05a2 = ikw.A09;
                    AbstractC153666vb abstractC153666vb = (AbstractC153666vb) c05a2.getValue();
                    if (abstractC153666vb != null) {
                        abstractC153666vb.A02(((C124275jh) interfaceC124295jj).BbA());
                    }
                    Object value = c05a2.getValue();
                    if (value != null) {
                        ikw.A00 = C05F.A01;
                        AbstractC37302Gc3.A1N((AbstractC153666vb) value);
                        AbstractC166997dE.A1Y(c05a, false);
                    } else {
                        throw AbstractC166987dD.A14("Called fetch without initializing fetcher");
                    }
                }
            }
        }
        AbstractC12430kl.A00("AudioPageRepository-4", new D8K(25, this.A01, c37818GkY));
        C62832tM c62832tM = ikw.A06;
        String str = ikw.A07;
        List list = c37818GkY.A09;
        c62832tM.A03(((C124275jh) c37818GkY.A01).BbA(), (EnumC125615m7) interfaceC09390do.getValue(), str, list, c37818GkY.A0D, true);
    }

    public C42192Ime(IKW ikw, InterfaceC71543Iw interfaceC71543Iw) {
        this.A01 = interfaceC71543Iw;
        this.A00 = ikw;
    }
}
