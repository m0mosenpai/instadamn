package X;

/* renamed from: X.74g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC1572574g implements Runnable {
    public final /* synthetic */ InterfaceC1572474f A00;
    public final /* synthetic */ C7UR A01;

    public RunnableC1572574g(InterfaceC1572474f interfaceC1572474f, C7UR c7ur) {
        this.A01 = c7ur;
        this.A00 = interfaceC1572474f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7UR c7ur = this.A01;
        C7UR c7ur2 = C7UR.A0A;
        final C24261Gv c24261Gv = (C24261Gv) c7ur.A08.getValue();
        c7ur.A09 = true;
        final InterfaceC1572474f interfaceC1572474f = this.A00;
        C11T.A02(new Runnable() { // from class: X.74s
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC1572474f.DAg(c24261Gv);
            }
        });
    }
}
