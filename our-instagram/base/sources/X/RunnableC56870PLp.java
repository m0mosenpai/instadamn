package X;

/* renamed from: X.PLp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56870PLp implements Runnable {
    public final /* synthetic */ C56208OxH A00;

    public RunnableC56870PLp(C56208OxH c56208OxH) {
        this.A00 = c56208OxH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C178577wV c178577wV;
        C56208OxH c56208OxH = this.A00;
        C197368o7 c197368o7 = c56208OxH.A02;
        if (c197368o7 != null && (c178577wV = c56208OxH.A08.A00) != null) {
            c56208OxH.A02 = null;
            InterfaceC180137z3 interfaceC180137z3 = (InterfaceC180137z3) c178577wV.A02(InterfaceC180137z3.A00);
            if (interfaceC180137z3 != null) {
                interfaceC180137z3.EEQ(c197368o7);
            }
            c56208OxH.A07.A02.remove(c56208OxH);
        }
    }
}
