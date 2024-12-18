package X;

/* loaded from: classes9.dex */
public final class P01 implements InterfaceC58043PoT {
    public final /* synthetic */ OXA A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public P01(OXA oxa, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        this.A01 = interfaceC16820sZ;
        this.A00 = oxa;
        this.A03 = interfaceC16820sZ2;
        this.A02 = interfaceC16820sZ3;
    }

    @Override // X.InterfaceC58043PoT
    public final void AJN() {
        OXA.A00(this.A00, this.A03);
    }

    @Override // X.InterfaceC58043PoT
    public final void cancel() {
        OXA.A00(this.A00, this.A02);
    }
}
