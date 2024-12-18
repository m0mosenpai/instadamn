package X;

/* renamed from: X.J5q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43153J5q implements Runnable {
    public final /* synthetic */ MOE A00;
    public final /* synthetic */ C38320GtF A01;
    public final /* synthetic */ C26837Bsz A02;
    public final /* synthetic */ C26829Bsr A03;

    public RunnableC43153J5q(MOE moe, C38320GtF c38320GtF, C26837Bsz c26837Bsz, C26829Bsr c26829Bsr) {
        this.A03 = c26829Bsr;
        this.A01 = c38320GtF;
        this.A00 = moe;
        this.A02 = c26837Bsz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26829Bsr c26829Bsr = this.A03;
        C38320GtF c38320GtF = this.A01;
        c26829Bsr.A00(c38320GtF.A0B);
        c26829Bsr.A00 = this.A00;
        C26837Bsz c26837Bsz = this.A02;
        c26837Bsz.A00(c38320GtF.A0A);
        ((C25831Bbm) c26837Bsz.A0D.getValue()).A00 = new C42197Imj(c38320GtF);
    }
}
