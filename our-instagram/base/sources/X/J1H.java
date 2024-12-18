package X;

/* loaded from: classes7.dex */
public final class J1H implements InterfaceC62602sz, InterfaceC62612t0 {
    public final /* synthetic */ C38016Go3 A00;

    public J1H(C38016Go3 c38016Go3) {
        this.A00 = c38016Go3;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C38016Go3 c38016Go3 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        IMU imu = c38016Go3.A0I;
        if (imu.A07.A06()) {
            imu.A00(c38016Go3.A01());
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return AbstractC166987dD.A1b(((C42748Ivm) ((AbstractC65202xI) this.A00.A01()).A00).A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C38016Go3 c38016Go3 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        return c38016Go3.A0I.A07.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C38016Go3 c38016Go3 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        return AbstractC37303Gc4.A1b(c38016Go3.A0I.A07);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        C38016Go3 c38016Go3 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        c38016Go3.A0I.A00(c38016Go3.A01());
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C38016Go3 c38016Go3 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        return AbstractC37303Gc4.A1a(c38016Go3.A0I.A07);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (CUG() || !isLoading()) {
            return true;
        }
        C38016Go3 c38016Go3 = this.A00;
        if (AbstractC166987dD.A1b(((C42748Ivm) ((AbstractC65202xI) c38016Go3.A01()).A00).A01) || c38016Go3.A0R) {
            return true;
        }
        return false;
    }
}
