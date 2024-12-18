package X;

/* renamed from: X.7yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179907yg extends AbstractC179917yh {
    public C54655OCh A00;
    public InterfaceC175067qg A01;
    public C175007qa A02;
    public final BBR A03;
    public final InterfaceC174967qW A04;

    @Override // X.InterfaceC179927yi
    public final void A9f(C22810A4d c22810A4d) {
    }

    @Override // X.InterfaceC179927yi
    public final boolean CZI() {
        return false;
    }

    @Override // X.InterfaceC179927yi
    public final boolean CfL() {
        return false;
    }

    @Override // X.InterfaceC179927yi
    public final void ETP(boolean z) {
    }

    @Override // X.InterfaceC179927yi
    public final void EaF(boolean z) {
    }

    @Override // X.InterfaceC179927yi
    public final void Eal(int i) {
    }

    @Override // X.InterfaceC179927yi
    public final void Eam(boolean z) {
        this.A00.A03 = false;
    }

    @Override // X.InterfaceC179927yi
    public final void EbP(int i) {
    }

    @Override // X.InterfaceC179927yi
    public final void EeQ(boolean z) {
    }

    @Override // X.InterfaceC179927yi
    public final void Egx(int i) {
    }

    @Override // X.InterfaceC179927yi
    public final void Epu(InterfaceC196578mn interfaceC196578mn, C196548mk c196548mk) {
    }

    @Override // X.InterfaceC179927yi
    public final void enable(boolean z) {
    }

    @Override // X.InterfaceC179927yi
    public final InterfaceC175067qg Ak3() {
        return this.A01;
    }

    @Override // X.AbstractC178807ws, X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC179927yi.A00;
    }

    @Override // X.InterfaceC179927yi
    public final boolean Ce9() {
        return this.A01.Ce9();
    }

    @Override // X.InterfaceC179927yi
    public final void EeT(InterfaceC174637px interfaceC174637px) {
        this.A03.Alt().ERx(AbstractC174897qP.A02, interfaceC174637px);
    }

    @Override // X.InterfaceC179927yi
    public final void Epf() {
        this.A02.A0B(new AbstractC184688Hj() { // from class: X.9bU
        });
    }

    @Override // X.InterfaceC179927yi
    public final void setInitialCameraFacing(int i) {
        InterfaceC175067qg interfaceC175067qg = this.A01;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                throw new RuntimeException(AnonymousClass001.A0O("Could not convert camera facing to optic: ", i));
            }
        } else {
            i2 = 0;
        }
        if (interfaceC175067qg.CKn(i2)) {
            ((AbstractC179917yh) this).A00 = i;
            InterfaceC25218BDs Alt = this.A03.Alt();
            C177257uL c177257uL = AbstractC174897qP.A00;
            int i3 = 1;
            if (i == 0) {
                i3 = 0;
            }
            Alt.ERx(c177257uL, Integer.valueOf(i3));
        }
    }

    public C179907yg(BBR bbr, InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A04 = new C23469Aag(this);
        this.A03 = bbr;
    }
}
