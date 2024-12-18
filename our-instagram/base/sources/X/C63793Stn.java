package X;

/* renamed from: X.Stn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63793Stn implements InterfaceC65558Tme, InterfaceC65331TiC {
    public static final C02Q A04 = new C63591Spy(new C12550kz(20), new C63888SvM(0), S6C.A00);
    public InterfaceC65558Tme A00;
    public boolean A01;
    public boolean A02;
    public final SKF A03 = new Object();

    public final synchronized void A00() {
        this.A03.A00();
        if (this.A01) {
            this.A01 = false;
            if (this.A02) {
                recycle();
            }
        } else {
            throw AbstractC166987dD.A14("Already unlocked");
        }
    }

    @Override // X.InterfaceC65558Tme
    public final synchronized void recycle() {
        this.A03.A00();
        this.A02 = true;
        if (!this.A01) {
            this.A00.recycle();
            this.A00 = null;
            A04.EE6(this);
        }
    }

    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return this.A00.BoY();
    }

    @Override // X.InterfaceC65331TiC
    public final SKF CEo() {
        return this.A03;
    }

    @Override // X.InterfaceC65558Tme
    public final Object get() {
        return this.A00.get();
    }

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        return this.A00.getSize();
    }
}
