package X;

/* loaded from: classes8.dex */
public final class KMG extends AbstractRunnableC14200nk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2EC A01;
    public final /* synthetic */ C4L2 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMG(C2EC c2ec, C4L2 c4l2, long j) {
        super(345018030, 3, false, false);
        this.A02 = c4l2;
        this.A01 = c2ec;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC207749He.A00();
        JVE.A01(this.A02.A00).A0A(this.A01.C7O().longValue(), this.A00);
    }
}
