package X;

/* renamed from: X.AYp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23391AYp implements InterfaceC176157sY {
    public final /* synthetic */ InterfaceC25159BBe A00;
    public final /* synthetic */ C176097sS A01;

    public C23391AYp(InterfaceC25159BBe interfaceC25159BBe, C176097sS c176097sS) {
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
        c176097sS.A00 = 2;
        c176097sS.A03.A04(new C23395AYu(3, c176097sS, this.A00));
    }
}
