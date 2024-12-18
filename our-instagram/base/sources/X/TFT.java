package X;

/* loaded from: classes10.dex */
public final class TFT implements InterfaceC65453TkP {
    public final InterfaceC65453TkP A00;

    @Override // X.InterfaceC65453TkP
    public final InterfaceC65528Tlx Enq(C1QW c1qw, C1QY c1qy, InterfaceC65592TnX interfaceC65592TnX, C18240vB c18240vB) {
        AbstractC167027dH.A12(c1qw, c1qy, interfaceC65592TnX);
        C14360o3.A0B(c18240vB, 3);
        InterfaceC65453TkP interfaceC65453TkP = this.A00;
        TFY tfy = new TFY(c1qw, c1qy, interfaceC65453TkP, interfaceC65592TnX, c18240vB);
        tfy.A01 = interfaceC65453TkP.Enq(c1qw, c1qy, tfy, c18240vB);
        return tfy;
    }

    public TFT(InterfaceC65453TkP interfaceC65453TkP) {
        this.A00 = interfaceC65453TkP;
    }
}
