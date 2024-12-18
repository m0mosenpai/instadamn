package X;

/* renamed from: X.Spy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63591Spy implements C02Q {
    public final C02Q A00;
    public final InterfaceC65330TiB A01;
    public final InterfaceC65332TiD A02;

    @Override // X.C02Q
    public final Object A7H() {
        Object A7H = this.A00.A7H();
        if (A7H == null) {
            A7H = this.A01.ALN();
            android.util.Log.isLoggable("FactoryPools", 2);
        }
        if (A7H instanceof InterfaceC65331TiC) {
            ((InterfaceC65331TiC) A7H).CEo().A00 = false;
        }
        return A7H;
    }

    @Override // X.C02Q
    public final boolean EE6(Object obj) {
        if (obj instanceof InterfaceC65331TiC) {
            ((InterfaceC65331TiC) obj).CEo().A00 = true;
        }
        this.A02.EJZ(obj);
        return this.A00.EE6(obj);
    }

    public C63591Spy(C02Q c02q, InterfaceC65330TiB interfaceC65330TiB, InterfaceC65332TiD interfaceC65332TiD) {
        this.A00 = c02q;
        this.A01 = interfaceC65330TiB;
        this.A02 = interfaceC65332TiD;
    }
}
