package X;

/* loaded from: classes4.dex */
public final class AYq implements InterfaceC176157sY {
    public final /* synthetic */ InterfaceC25159BBe A00;
    public final /* synthetic */ C176097sS A01;

    public AYq(InterfaceC25159BBe interfaceC25159BBe, C176097sS c176097sS) {
        this.A01 = c176097sS;
        this.A00 = interfaceC25159BBe;
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        C176097sS c176097sS = this.A01;
        c176097sS.A04(abstractC223559ty);
        c176097sS.A06(this.A00);
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        C176097sS c176097sS = this.A01;
        C176097sS.A01(c176097sS, C05F.A0N);
        if (c176097sS.A07.CUZ(117)) {
            this.A00.onFinished();
        }
    }
}
