package X;

/* renamed from: X.Ayk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24824Ayk implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C22811A4e A02;
    public final /* synthetic */ AML A03;

    public RunnableC24824Ayk(C22811A4e c22811A4e, AML aml, int i, int i2) {
        this.A03 = aml;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c22811A4e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AML.A00(this.A02, this.A03, this.A01, this.A00);
    }
}
