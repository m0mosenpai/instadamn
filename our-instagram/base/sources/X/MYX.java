package X;

/* loaded from: classes9.dex */
public final class MYX extends AbstractRunnableC14200nk {
    public final /* synthetic */ MXF A00;
    public final /* synthetic */ Runnable A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MYX(MXF mxf, Runnable runnable) {
        super(55, 2, false, true);
        this.A00 = mxf;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.run();
    }
}
