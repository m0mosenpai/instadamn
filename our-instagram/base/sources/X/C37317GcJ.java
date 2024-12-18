package X;

/* renamed from: X.GcJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37317GcJ implements InterfaceC86283sz {
    public final int A00;
    public final Object A01;

    public C37317GcJ(C75113Zb c75113Zb, int i) {
        this.A00 = i;
        this.A01 = c75113Zb;
    }

    @Override // X.InterfaceC86283sz
    public final void Ds1() {
        ((C75113Zb) this.A01).A0b(false);
    }

    @Override // X.InterfaceC86283sz
    public final void Ds2() {
        ((C75113Zb) this.A01).A0b(true);
    }

    @Override // X.InterfaceC86283sz
    public final void Ds3() {
        if (this.A00 == 0) {
            ((C75113Zb) this.A01).A0c(false);
        }
    }

    @Override // X.InterfaceC86283sz
    public final void Ds4() {
        if (this.A00 == 0) {
            ((C75113Zb) this.A01).A0c(true);
        }
    }
}
