package X;

/* loaded from: classes9.dex */
public final class PR9 implements Runnable {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ C123645id A01;

    public PR9(C1P1 c1p1, C123645id c123645id) {
        this.A00 = c1p1;
        this.A01 = c123645id;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onSuccess(this.A01);
    }
}
