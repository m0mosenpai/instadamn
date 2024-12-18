package X;

/* loaded from: classes9.dex */
public final class PQA implements Runnable {
    public final /* synthetic */ C8CK A00;
    public final /* synthetic */ InterfaceC58036PoM A01;

    public PQA(C8CK c8ck, InterfaceC58036PoM interfaceC58036PoM) {
        this.A01 = interfaceC58036PoM;
        this.A00 = c8ck;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.Dv5(this.A00, false);
    }
}
