package X;

/* renamed from: X.WRm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70332WRm implements InterfaceC72026XFo {
    public final long A00;
    public final InterfaceC72026XFo A01;

    @Override // X.InterfaceC72026XFo
    public final void ASd() {
        this.A01.ASd();
    }

    @Override // X.InterfaceC72026XFo
    public final void EMe(InterfaceC71878X8l interfaceC71878X8l) {
        this.A01.EMe(new C66404UFp(interfaceC71878X8l, interfaceC71878X8l, this));
    }

    @Override // X.InterfaceC72026XFo
    public final XG2 F87(int i, int i2) {
        return this.A01.F87(i, i2);
    }

    public C70332WRm(InterfaceC72026XFo interfaceC72026XFo, long j) {
        this.A00 = j;
        this.A01 = interfaceC72026XFo;
    }
}
