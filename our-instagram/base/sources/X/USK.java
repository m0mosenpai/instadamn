package X;

/* loaded from: classes11.dex */
public final class USK extends AbstractRunnableC94874Os {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C69224Vjs A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USK(C69224Vjs c69224Vjs, long j, long j2) {
        super("notifyTransferred");
        this.A02 = c69224Vjs;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69224Vjs c69224Vjs = this.A02;
        c69224Vjs.A02.updateDataTaskDownloadProgress(c69224Vjs.A03, this.A01, this.A00, c69224Vjs.A01);
    }
}
