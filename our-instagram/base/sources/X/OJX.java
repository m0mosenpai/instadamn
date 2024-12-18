package X;

/* loaded from: classes9.dex */
public final class OJX {
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final Runnable A04;
    public final /* synthetic */ PJG A05;

    public OJX(PJG pjg) {
        this.A05 = pjg;
        this.A04 = new RunnableC57025PRq(this, pjg);
    }

    public final void A00() {
        this.A05.A0B.removeCallbacks(this.A04);
        this.A02 = false;
    }
}
