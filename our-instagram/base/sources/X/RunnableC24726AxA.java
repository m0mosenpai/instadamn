package X;

/* renamed from: X.AxA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24726AxA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AZX A02;

    public RunnableC24726AxA(AZX azx, int i, int i2) {
        this.A02 = azx;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C179977yn c179977yn = this.A02.A00;
        AML aml = c179977yn.A00;
        if (aml.A0C.isEmpty() && aml.A0D.isEmpty()) {
            c179977yn.EaO(this.A01, this.A00);
        }
        int i = this.A01;
        int i2 = this.A00;
        C22811A4e c22811A4e = c179977yn.A08;
        if (AML.A03(aml)) {
            AML.A00(c22811A4e, aml, i, i2);
        } else {
            aml.A06.post(new RunnableC24824Ayk(c22811A4e, aml, i, i2));
        }
    }
}
