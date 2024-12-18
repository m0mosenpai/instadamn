package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class P02 implements InterfaceC58043PoT {
    public final InterfaceC58110PpZ A00;
    public final List A01;
    public final /* synthetic */ OXA A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    public P02(InterfaceC58110PpZ interfaceC58110PpZ, OXA oxa, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        this.A03 = interfaceC16820sZ;
        this.A02 = oxa;
        this.A05 = interfaceC16820sZ2;
        this.A04 = interfaceC16820sZ3;
        this.A01 = list;
        this.A00 = interfaceC58110PpZ;
    }

    @Override // X.InterfaceC58043PoT
    public final void AJN() {
        OXA.A00(this.A02, this.A05);
    }

    @Override // X.InterfaceC58043PoT
    public final void cancel() {
        OXA.A00(this.A02, this.A04);
    }
}
