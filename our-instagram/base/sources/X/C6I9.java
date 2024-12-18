package X;

/* renamed from: X.6I9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6I9 extends C58J implements InterfaceC113445Ag, InterfaceC1129458d {
    public final C5Y1 A00 = AbstractC118385Xa.A00(0.0f);
    public final C5Y4 A01 = new C5Y4(null, 1.0f, 1500.0f);
    public final C5XP A02;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        long A02;
        C14360o3.A0B(interfaceC1129057z, 0);
        interfaceC1129057z.AQf();
        float floatValue = ((Number) this.A00.A04.A05.getValue()).floatValue();
        if (floatValue > 0.0f) {
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r1 & 63)], C1132359l.A03(r1), C1132359l.A02(r1), C1132359l.A01(((C118045Vo) C5Zy.A00(C5W7.A00, this)).A0c), floatValue * 0.2f);
            interfaceC1129057z.AR1(null, C119815bf.A00, 1.0f, 3, A02, 0L, interfaceC1129057z.Bxc());
        }
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    public C6I9(C5XP c5xp) {
        this.A02 = c5xp;
    }
}
