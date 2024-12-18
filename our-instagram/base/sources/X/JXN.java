package X;

/* loaded from: classes8.dex */
public final class JXN implements C7XU {
    public AbstractC12990ll A00;
    public final /* synthetic */ C189478aR A01;

    public JXN(C189478aR c189478aR) {
        this.A01 = c189478aR;
    }

    @Override // X.C7XU
    public final void DAy() {
        C189448aO c189448aO = this.A01.A02;
        InterfaceC1119153d interfaceC1119153d = c189448aO.A0U;
        if (interfaceC1119153d != null) {
            interfaceC1119153d.Czx();
        }
        if (this.A00 != null) {
            c189448aO.A0T = null;
            c189448aO.A0U = null;
            c189448aO.A0X = null;
            c189448aO.A0K = null;
            c189448aO.A0L = null;
        }
    }

    @Override // X.C7XU
    public final void DB3() {
        C189478aR c189478aR = this.A01;
        this.A00 = c189478aR.A03.getSession();
        InterfaceC1119153d interfaceC1119153d = c189478aR.A02.A0U;
        if (interfaceC1119153d != null) {
            interfaceC1119153d.D00();
        }
    }
}
