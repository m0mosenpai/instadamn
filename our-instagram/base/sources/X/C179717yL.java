package X;

/* renamed from: X.7yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179717yL extends AbstractC179687yI implements InterfaceC179727yM {
    public final InterfaceC178407wE A00;
    public final InterfaceC178297w3 A01;
    public volatile InterfaceC178697wh A02;
    public volatile InterfaceC178737wl A03;
    public volatile C175007qa A04;

    @Override // X.AbstractC178227vw
    public final void A09() {
        C178087vh c178087vh = InterfaceC178667we.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179687yI) this).A00;
        this.A04 = ((C178647wc) ((InterfaceC178667we) interfaceC178207vu.Aq0(c178087vh))).A02;
        C178087vh c178087vh2 = InterfaceC178697wh.A00;
        if (interfaceC178207vu.CRY(c178087vh2)) {
            this.A02 = (InterfaceC178697wh) interfaceC178207vu.Aq0(c178087vh2);
        }
        C178087vh c178087vh3 = InterfaceC178737wl.A00;
        if (interfaceC178207vu.CRY(c178087vh3)) {
            this.A03 = (InterfaceC178737wl) interfaceC178207vu.Aq0(c178087vh3);
        }
    }

    @Override // X.InterfaceC179607yA
    public final C175767rq BKU() {
        return InterfaceC179727yM.A00;
    }

    public C179717yL(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        C178307w4 c178307w4 = InterfaceC178407wE.A00;
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC179687yI) this).A00;
        this.A00 = (InterfaceC178407wE) interfaceC178207vu2.Aq1(c178307w4);
        this.A01 = (InterfaceC178297w3) interfaceC178207vu2.Aq1(InterfaceC178297w3.A00);
    }
}
