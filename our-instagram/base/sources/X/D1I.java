package X;

/* loaded from: classes5.dex */
public final class D1I implements Runnable {
    public final /* synthetic */ C26832Bsu A00;

    public D1I(C26832Bsu c26832Bsu) {
        this.A00 = c26832Bsu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26832Bsu c26832Bsu = this.A00;
        C26829Bsr c26829Bsr = c26832Bsu.A03;
        String str = "headerFragment";
        if (c26829Bsr != null) {
            InterfaceC09390do interfaceC09390do = c26832Bsu.A07;
            c26829Bsr.A00(((C25838Bbt) interfaceC09390do.getValue()).A04);
            C26829Bsr c26829Bsr2 = c26832Bsu.A03;
            if (c26829Bsr2 != null) {
                c26829Bsr2.A00 = c26832Bsu;
                C26837Bsz c26837Bsz = c26832Bsu.A02;
                str = "gridFragment";
                if (c26837Bsz != null) {
                    c26837Bsz.A00(((C25838Bbt) interfaceC09390do.getValue()).A03);
                    C26837Bsz c26837Bsz2 = c26832Bsu.A02;
                    if (c26837Bsz2 != null) {
                        ((C25831Bbm) c26837Bsz2.A0D.getValue()).A00 = new C29112Csd(c26832Bsu);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
