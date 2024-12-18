package X;

/* renamed from: X.Azo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24889Azo implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C22811A4e A05;
    public final /* synthetic */ AML A06;

    public RunnableC24889Azo(C22811A4e c22811A4e, AML aml, int i, int i2, int i3, int i4, int i5) {
        this.A06 = aml;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = c22811A4e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AML.A01(this.A05, this.A06, this.A01, this.A02, this.A00, this.A04, this.A03);
    }
}
