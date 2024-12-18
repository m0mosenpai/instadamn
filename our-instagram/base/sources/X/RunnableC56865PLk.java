package X;

/* renamed from: X.PLk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56865PLk implements Runnable {
    public final /* synthetic */ P0A A00;

    public RunnableC56865PLk(P0A p0a) {
        this.A00 = p0a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C178577wV c178577wV;
        P0A p0a = this.A00;
        C197368o7 c197368o7 = p0a.A03;
        if (c197368o7 != null && (c178577wV = p0a.A0F.A00) != null) {
            p0a.A03 = null;
            InterfaceC180137z3 interfaceC180137z3 = (InterfaceC180137z3) c178577wV.A02(InterfaceC180137z3.A00);
            if (interfaceC180137z3 != null) {
                interfaceC180137z3.EEQ(c197368o7);
            }
            p0a.A0E.A02.remove(p0a);
        }
    }
}
