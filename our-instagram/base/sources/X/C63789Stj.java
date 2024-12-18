package X;

/* renamed from: X.Stj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63789Stj implements InterfaceC65558Tme {
    public int A00;
    public boolean A01;
    public final InterfaceC65558Tme A02;
    public final boolean A03;
    public final InterfaceC65617To8 A04;
    public final C63182Seh A05;

    public final void A00() {
        boolean z;
        synchronized (this) {
            int i = this.A00;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.A00 = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw AbstractC166987dD.A14("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            C63182Seh c63182Seh = this.A05;
            InterfaceC65617To8 interfaceC65617To8 = this.A04;
            SM9 sm9 = c63182Seh.A00;
            synchronized (sm9) {
                C64881TYh c64881TYh = (C64881TYh) sm9.A02.remove(interfaceC65617To8);
                if (c64881TYh != null) {
                    c64881TYh.clear();
                }
            }
            if (this.A03) {
                c63182Seh.A06.A03(interfaceC65617To8, this);
                return;
            }
            SDE sde = c63182Seh.A05;
            synchronized (sde) {
                if (!sde.A00) {
                    sde.A00 = true;
                    recycle();
                    sde.A00 = false;
                } else {
                    AbstractC58318PtA.A1F(sde.A01, this, 1);
                }
            }
        }
    }

    public final synchronized void A01() {
        if (!this.A01) {
            this.A00++;
        } else {
            throw AbstractC166987dD.A14("Cannot acquire a recycled resource");
        }
    }

    @Override // X.InterfaceC65558Tme
    public final synchronized void recycle() {
        if (this.A00 <= 0) {
            if (!this.A01) {
                this.A01 = true;
                this.A02.recycle();
            }
        } else {
            throw AbstractC166987dD.A14("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized String toString() {
        StringBuilder A1C;
        A1C = AbstractC166987dD.A1C();
        A1C.append("EngineResource{isMemoryCacheable=");
        A1C.append(this.A03);
        A1C.append(", listener=");
        A1C.append(this.A05);
        A1C.append(", key=");
        A1C.append(this.A04);
        A1C.append(", acquired=");
        A1C.append(this.A00);
        A1C.append(", isRecycled=");
        A1C.append(this.A01);
        A1C.append(", resource=");
        return AbstractC58320PtC.A11(this.A02, A1C);
    }

    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return this.A02.BoY();
    }

    @Override // X.InterfaceC65558Tme
    public final Object get() {
        return this.A02.get();
    }

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        return this.A02.getSize();
    }

    public C63789Stj(InterfaceC65617To8 interfaceC65617To8, C63182Seh c63182Seh, InterfaceC65558Tme interfaceC65558Tme, boolean z) {
        Rs8.A00(interfaceC65558Tme);
        this.A02 = interfaceC65558Tme;
        this.A03 = z;
        this.A04 = interfaceC65617To8;
        Rs8.A00(c63182Seh);
        this.A05 = c63182Seh;
    }
}
