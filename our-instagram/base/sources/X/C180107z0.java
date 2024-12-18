package X;

/* renamed from: X.7z0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180107z0 extends AbstractC179807yU implements InterfaceC180117z1 {
    public InterfaceC177237uJ A00;
    public boolean A01;
    public final C80F A02;

    @Override // X.InterfaceC180117z1
    public final synchronized void EJx() {
        this.A01 = false;
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        ((InterfaceC178817wt) ((AbstractC179807yU) this).A00.Aq0(InterfaceC178817wt.A01)).Eca(this.A02);
        EJx();
    }

    @Override // X.InterfaceC179817yV
    public final C179837yX BKZ() {
        return InterfaceC180117z1.A01;
    }

    public C180107z0(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A02 = new C80F() { // from class: X.80E
            @Override // X.C80F
            public final void DRr(Long l) {
                final C180107z0 c180107z0 = C180107z0.this;
                synchronized (c180107z0) {
                    if (!c180107z0.A01) {
                        c180107z0.A01 = true;
                        InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) ((AbstractC179807yU) c180107z0).A00.Aq1(InterfaceC178297w3.A00);
                        ((C178267w0) interfaceC178297w3).A00.post(new Runnable() { // from class: X.8oa
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC177237uJ interfaceC177237uJ = C180107z0.this.A00;
                                if (interfaceC177237uJ != null) {
                                    interfaceC177237uJ.onFirstFrameRendered();
                                }
                            }
                        });
                    }
                }
            }
        };
    }
}
