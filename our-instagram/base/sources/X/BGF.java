package X;

/* loaded from: classes5.dex */
public final class BGF extends C58J implements InterfaceC113445Ag {
    public final C5Y1 A00 = AbstractC118385Xa.A00(0.0f);
    public final C5XP A01;
    public final long A02;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        long A02;
        C14360o3.A0B(interfaceC1129057z, 0);
        float floatValue = ((Number) this.A00.A04.getValue()).floatValue();
        if (floatValue > 0.0f) {
            long j = this.A02;
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), C1132359l.A00(j) * floatValue);
            interfaceC1129057z.AR1(null, C119815bf.A00, 1.0f, 3, A02, 0L, interfaceC1129057z.Bxc());
        }
        interfaceC1129057z.AQf();
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    public BGF(C5XP c5xp, long j) {
        this.A02 = j;
        this.A01 = c5xp;
    }

    @Override // X.C58J
    public final void A0A() {
        AbstractC166987dD.A1Z(new MCK(this, null, 34), A05());
    }
}
