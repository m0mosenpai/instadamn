package X;

/* loaded from: classes9.dex */
public final class PQ4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ OyC A01;

    public PQ4(OyC oyC, int i) {
        this.A01 = oyC;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OyC oyC = this.A01;
        oyC.A0C.A03(this.A00);
        C2UY.A01.A05(3L);
    }
}
