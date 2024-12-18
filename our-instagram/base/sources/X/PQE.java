package X;

/* loaded from: classes9.dex */
public final class PQE implements Runnable {
    public final /* synthetic */ C8CK A00;
    public final /* synthetic */ InterfaceC58036PoM A01;

    public PQE(C8CK c8ck, InterfaceC58036PoM interfaceC58036PoM) {
        this.A00 = c8ck;
        this.A01 = interfaceC58036PoM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8CK c8ck = this.A00;
        AbstractC12120kG.A0C("GreenScreenReviewController", "Could not transcode", c8ck);
        this.A01.Dv5(c8ck, false);
    }
}
