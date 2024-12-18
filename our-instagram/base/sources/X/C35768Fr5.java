package X;

/* renamed from: X.Fr5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35768Fr5 implements InterfaceC018407e, C07N {
    public final C018307d A00;
    public final C52992bg A01;
    public final C55563Olx A02 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Olx] */
    public C35768Fr5(C018307d c018307d, C32072E6y c32072E6y) {
        this.A00 = c018307d;
        C52992bg c52992bg = new C52992bg(C52962bd.A00);
        c52992bg.A01(Fr6.A00, new C34490FIc());
        c52992bg.A01(C35769Fr7.A00, c32072E6y);
        this.A01 = c52992bg;
    }

    @Override // X.C07N
    public final AbstractC52972be getDefaultViewModelCreationExtras() {
        return this.A01;
    }

    @Override // X.C07N
    public final InterfaceC52932ba getDefaultViewModelProviderFactory() {
        return this.A02;
    }

    @Override // X.InterfaceC018407e
    public final C018307d getViewModelStore() {
        return this.A00;
    }
}
