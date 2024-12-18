package X;

/* renamed from: X.HRj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39246HRj extends C17T implements InterfaceC43511JJx {
    public InterfaceC43529JKp A00;
    public JM8 A01;

    @Override // X.InterfaceC43511JJx
    public final InterfaceC43529JKp AmX() {
        InterfaceC43529JKp interfaceC43529JKp = this.A00;
        if (interfaceC43529JKp == null) {
            return (InterfaceC43529JKp) A05(50511102, HNT.class);
        }
        return interfaceC43529JKp;
    }

    @Override // X.InterfaceC43511JJx
    public final JM8 Be5() {
        JM8 jm8 = this.A01;
        if (jm8 == null) {
            return (JM8) A05(1879474642, HRh.class);
        }
        return jm8;
    }

    @Override // X.InterfaceC43511JJx
    public final InterfaceC43511JJx E9b(C1DY c1dy) {
        InterfaceC43529JKp AmX = AmX();
        JM8 jm8 = null;
        if (AmX != null) {
            AmX.E8o(c1dy);
        } else {
            AmX = null;
        }
        this.A00 = AmX;
        JM8 Be5 = Be5();
        if (Be5 != null) {
            Be5.E9Z(c1dy);
            jm8 = Be5;
        }
        this.A01 = jm8;
        return this;
    }
}
