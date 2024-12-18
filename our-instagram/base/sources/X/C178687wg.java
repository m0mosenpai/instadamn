package X;

/* renamed from: X.7wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178687wg extends AbstractC178657wd implements InterfaceC178697wh {
    public final InterfaceC175477rN A00;
    public volatile int A01;
    public volatile int A02;
    public volatile int A03;
    public volatile InterfaceC179497xz A04;
    public volatile InterfaceC178817wt A05;
    public volatile InterfaceC178737wl A06;

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A05 = (InterfaceC178817wt) A0A(InterfaceC178817wt.A01);
        C178087vh c178087vh = InterfaceC179497xz.A01;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) this).A00;
        if (interfaceC178207vu.CRY(c178087vh)) {
            this.A04 = (InterfaceC179497xz) A0A(c178087vh);
        }
        C178087vh c178087vh2 = InterfaceC178737wl.A00;
        if (interfaceC178207vu.CRY(c178087vh2)) {
            InterfaceC178067vf A0A = A0A(c178087vh2);
            C14360o3.A07(A0A);
            InterfaceC178737wl interfaceC178737wl = (InterfaceC178737wl) A0A;
            interfaceC178737wl.AAS(this.A00);
            this.A06 = interfaceC178737wl;
        }
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        C178087vh c178087vh = InterfaceC178697wh.A00;
        C14360o3.A08(c178087vh);
        return c178087vh;
    }

    public C178687wg(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A00 = new InterfaceC175477rN() { // from class: X.7rM
            @Override // X.InterfaceC175477rN
            public final void DX9(int i, int i2, int i3, int i4, boolean z) {
                C178687wg c178687wg = C178687wg.this;
                c178687wg.A03 = i;
                c178687wg.A01 = i2;
                c178687wg.A02 = i4;
            }
        };
    }
}
