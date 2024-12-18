package X;

/* loaded from: classes5.dex */
public final class D18 implements Runnable {
    public final /* synthetic */ CU6 A00;

    public D18(CU6 cu6) {
        this.A00 = cu6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CU6 cu6 = this.A00;
        cu6.A02.set(true);
        cu6.A01.run();
    }
}
