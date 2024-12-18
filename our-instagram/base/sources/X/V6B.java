package X;

/* loaded from: classes11.dex */
public final class V6B extends AbstractRunnableC14200nk {
    public final /* synthetic */ C5S5 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6B(C5S5 c5s5) {
        super(178, 4, false, false);
        this.A00 = c5s5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5S5 c5s5 = this.A00;
        C5S7 c5s7 = new C5S7(c5s5.A01);
        C25301Lk c25301Lk = c5s5.A00;
        synchronized (c25301Lk) {
            c25301Lk.A06("state-v1", c5s7);
        }
    }
}
