package X;

/* loaded from: classes10.dex */
public final class RcV extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1CD A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcV(C1CD c1cd, String str, String str2, int i) {
        super(719, 5, false, false);
        this.A01 = c1cd;
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A04.markerAnnotate(23396353, this.A00, this.A02, this.A03);
    }
}
