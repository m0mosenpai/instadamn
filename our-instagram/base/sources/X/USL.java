package X;

/* loaded from: classes11.dex */
public final class USL extends AbstractRunnableC94874Os {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C67635Utq A01;
    public final /* synthetic */ C55176Odf A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USL(C67635Utq c67635Utq, C55176Odf c55176Odf, String str, double d) {
        super("transcodeVideo");
        this.A01 = c67635Utq;
        this.A03 = str;
        this.A02 = c55176Odf;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A05.success(this.A03, r1.A01, r1.A00, r1.A03, r1.A02, 0.0d, this.A02.A0I, this.A00, 100.0d * (-1.0d));
    }
}
