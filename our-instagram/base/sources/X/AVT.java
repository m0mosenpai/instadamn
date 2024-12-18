package X;

/* loaded from: classes4.dex */
public final class AVT implements InterfaceC176207sd {
    public final /* synthetic */ AGI A00;
    public final /* synthetic */ InterfaceC25203BDb A01;
    public final /* synthetic */ InterfaceC25159BBe A02;
    public final /* synthetic */ C176097sS A03;

    public AVT(AGI agi, InterfaceC25203BDb interfaceC25203BDb, InterfaceC25159BBe interfaceC25159BBe, C176097sS c176097sS) {
        this.A03 = c176097sS;
        this.A02 = interfaceC25159BBe;
        this.A00 = agi;
        this.A01 = interfaceC25203BDb;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        C176097sS c176097sS = this.A03;
        c176097sS.A0A = this.A01;
        c176097sS.A04(new C212409b9(th));
        this.A02.onFinished();
    }

    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        this.A03.A05(this.A00, this.A01, this.A02);
    }
}
