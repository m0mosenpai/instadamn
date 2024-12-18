package X;

/* renamed from: X.BZg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25743BZg extends C58J implements InterfaceC113445Ag {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C5XP A03;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        long j;
        float f;
        long A02;
        interfaceC1129057z.AQf();
        if (this.A02) {
            j = C1132359l.A01;
            f = 0.3f;
        } else {
            if (!this.A01 && !this.A00) {
                return;
            }
            j = C1132359l.A01;
            f = 0.1f;
        }
        A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), f);
        interfaceC1129057z.AR1(null, C119815bf.A00, 1.0f, 3, A02, 0L, interfaceC1129057z.Bxc());
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    public C25743BZg(C5XP c5xp) {
        this.A03 = c5xp;
    }

    @Override // X.C58J
    public final void A0A() {
        AbstractC25231BEo.A1I(this, A05(), 0);
    }
}
