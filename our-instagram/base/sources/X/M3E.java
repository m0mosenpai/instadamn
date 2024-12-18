package X;

/* loaded from: classes8.dex */
public final class M3E implements Runnable {
    public final /* synthetic */ C8OP A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public M3E(C8OP c8op, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = c8op;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (interfaceC16660sJ != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Invalid state, upload edit points: ");
            interfaceC16660sJ.invoke(new KN9(null, AbstractC166997dE.A0v(this.A00.A0I.getValue(), A1C)));
        }
    }
}
