package X;

/* loaded from: classes5.dex */
public final class D25 implements Runnable {
    public final /* synthetic */ InterfaceC59242nQ A00;
    public final /* synthetic */ C2nP A01;
    public final /* synthetic */ String A02;

    public D25(InterfaceC59242nQ interfaceC59242nQ, C2nP c2nP, String str) {
        this.A00 = interfaceC59242nQ;
        this.A01 = c2nP;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1WN A00 = C59232nO.A00();
        InterfaceC59242nQ interfaceC59242nQ = this.A00;
        C2nP c2nP = this.A01;
        String str = this.A02;
        if (str == null) {
            str = "unknown";
        }
        A00.AUt(null, null, null, null, interfaceC59242nQ, c2nP, null, null, str);
    }
}
