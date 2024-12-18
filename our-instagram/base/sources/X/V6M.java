package X;

/* loaded from: classes11.dex */
public final class V6M extends AbstractRunnableC14200nk {
    public final /* synthetic */ RunnableC71403Id A00;
    public final /* synthetic */ C1H7 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6M(RunnableC71403Id runnableC71403Id, C1H7 c1h7) {
        super(556, 2, false, false);
        this.A01 = c1h7;
        this.A00 = runnableC71403Id;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }
}
