package X;

/* renamed from: X.AxB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24727AxB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AML A02;

    public RunnableC24727AxB(AML aml, int i, int i2) {
        this.A02 = aml;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AML aml = this.A02;
        aml.A01 = this.A01;
        aml.A00 = this.A00;
    }
}
