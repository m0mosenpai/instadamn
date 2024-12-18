package X;

/* renamed from: X.0XV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XV implements InterfaceC04560Ly {
    public static C0XV A03;
    public int A00 = -1;
    public InterfaceC04560Ly A01;
    public final C0Pe A02;

    public static void A00(int i) {
        C0XV c0xv = A03;
        if (c0xv != null) {
            c0xv.Db2(i);
        }
    }

    @Override // X.InterfaceC04560Ly
    public final void Db2(int i) {
        InterfaceC04560Ly interfaceC04560Ly = this.A01;
        if (interfaceC04560Ly != null) {
            interfaceC04560Ly.Db2(i);
        }
        this.A00 = i;
        C003801d c003801d = this.A02.A03;
        C02R.A03(c003801d, "Did you call SessionManager.init()?");
        c003801d.A06(i);
    }

    public C0XV(InterfaceC04560Ly interfaceC04560Ly, C0Pe c0Pe) {
        this.A02 = c0Pe;
        this.A01 = interfaceC04560Ly;
    }
}
