package X;

/* loaded from: classes12.dex */
public final class XZJ extends AbstractRunnableC14200nk {
    public final /* synthetic */ RunnableC73518YHi A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZJ(RunnableC73518YHi runnableC73518YHi) {
        super(279);
        this.A00 = runnableC73518YHi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C140286Wg c140286Wg = this.A00.A00;
        if (!c140286Wg.isDone()) {
            c140286Wg.cancel(true);
        }
    }
}
