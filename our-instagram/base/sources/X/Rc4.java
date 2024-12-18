package X;

/* loaded from: classes10.dex */
public final class Rc4 extends AbstractRunnableC14200nk {
    public final /* synthetic */ TFE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rc4(TFE tfe) {
        super(42, 3, true, false);
        this.A00 = tfe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01.disconnect();
    }
}
