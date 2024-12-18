package X;

/* loaded from: classes8.dex */
public final class KLP extends AbstractRunnableC14200nk {
    public final /* synthetic */ C2IR A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLP(C2IR c2ir) {
        super(307, 3, false, false);
        this.A00 = c2ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2IR c2ir = this.A00;
        c2ir.A00 = new C4JH(c2ir.A04.E8Z(), "fetch_inbox_from_disk");
    }
}
