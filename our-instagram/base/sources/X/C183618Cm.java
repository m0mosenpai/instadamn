package X;

/* renamed from: X.8Cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183618Cm implements InterfaceC018407e, C07N {
    public final C018307d A00;
    public final C52992bg A01;
    public final C183628Cn A02;
    public final InterfaceC61162qe A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.8Cn, java.lang.Object] */
    public C183618Cm(C018307d c018307d, InterfaceC61162qe interfaceC61162qe) {
        C14360o3.A0B(interfaceC61162qe, 2);
        this.A00 = c018307d;
        this.A03 = interfaceC61162qe;
        this.A02 = new Object();
        C52992bg c52992bg = new C52992bg(C52962bd.A00);
        c52992bg.A01(C183638Co.A00, interfaceC61162qe);
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
