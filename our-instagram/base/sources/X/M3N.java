package X;

/* loaded from: classes8.dex */
public final class M3N implements Runnable {
    public final /* synthetic */ C8Y3 A00;
    public final /* synthetic */ Exception A01;

    public M3N(C8Y3 c8y3, Exception exc) {
        this.A00 = c8y3;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00(this.A01);
    }
}
