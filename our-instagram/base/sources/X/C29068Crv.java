package X;

/* renamed from: X.Crv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29068Crv implements InterfaceC139386St {
    public final /* synthetic */ InterfaceC139386St A00;
    public final /* synthetic */ C2N A01;

    public C29068Crv(InterfaceC139386St interfaceC139386St, C2N c2n) {
        this.A01 = c2n;
        this.A00 = interfaceC139386St;
    }

    @Override // X.InterfaceC139386St
    public final void onFailure(Throwable th) {
        this.A01.A05();
        InterfaceC139386St interfaceC139386St = this.A00;
        if (interfaceC139386St != null) {
            interfaceC139386St.onFailure(th);
        }
    }

    @Override // X.InterfaceC139386St
    public final void onSuccess() {
        this.A01.A04();
        InterfaceC139386St interfaceC139386St = this.A00;
        if (interfaceC139386St != null) {
            interfaceC139386St.onSuccess();
        }
    }
}
