package X;

/* loaded from: classes4.dex */
public final class AVP implements InterfaceC176207sd {
    public final /* synthetic */ InterfaceC176207sd A00;
    public final /* synthetic */ C176097sS A01;

    public AVP(InterfaceC176207sd interfaceC176207sd, C176097sS c176097sS) {
        this.A01 = c176097sS;
        this.A00 = interfaceC176207sd;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        this.A01.A06(new C23423AZw(this.A00, th, 0));
    }

    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        C176097sS.A01(this.A01, C05F.A01);
        this.A00.onSuccess();
    }
}
