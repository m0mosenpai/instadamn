package X;

/* loaded from: classes7.dex */
public final class HJN extends AbstractRunnableC14200nk {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ C98974cH A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJN(C1P1 c1p1, C98974cH c98974cH, int i) {
        super(i, 3, false, false);
        this.A01 = c98974cH;
        this.A00 = c1p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC115105If abstractC115105If = this.A01.A01;
        if (abstractC115105If != null) {
            this.A00.onFailInBackground(abstractC115105If);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
