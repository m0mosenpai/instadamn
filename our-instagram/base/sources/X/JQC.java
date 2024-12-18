package X;

/* loaded from: classes8.dex */
public abstract class JQC extends AbstractC52922bZ {
    public final InterfaceC24731Iq A00;
    public final InterfaceC19390xP A01;
    public final C0UO A02;
    public final C05A A03;

    public final void A0N(MNV mnv, long j) {
        if (j > 0) {
            AbstractC47032Kqp.A00(this, new MCG(mnv, this, (InterfaceC23621Ds) null, 34), j);
        } else {
            AbstractC166987dD.A1Z(new MCG(mnv, this, (InterfaceC23621Ds) null, 35), AbstractC141776au.A00(this));
        }
    }

    public final MNW A0L() {
        return (MNW) this.A03.getValue();
    }

    public final void A0M(MNV mnv) {
        A0N(mnv, 0L);
    }

    public final void A0O(InterfaceC16660sJ interfaceC16660sJ) {
        Object value;
        C05A c05a = this.A03;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, interfaceC16660sJ.invoke(value)));
    }

    public JQC(MNW mnw) {
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A00 = A12;
        this.A01 = AbstractC07080Za.A03(A12);
        C008002u A1H = AbstractC25225BEi.A1H(mnw);
        this.A03 = A1H;
        this.A02 = AbstractC208910l.A02(A1H);
    }
}
