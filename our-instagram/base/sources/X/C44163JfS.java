package X;

/* renamed from: X.JfS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44163JfS extends AbstractRunnableC14200nk {
    public final /* synthetic */ C44164JfT A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44163JfS(C44164JfT c44164JfT) {
        super(313, 3, false, false);
        this.A00 = c44164JfT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44164JfT c44164JfT = this.A00;
        C40945IBs c40945IBs = (C40945IBs) c44164JfT.A00.A02("direct_recent_stickers_file_key", false);
        if (c40945IBs != null) {
            c44164JfT.A01.addAll(AbstractC31172DnG.A19(c40945IBs.A00));
        }
    }
}
