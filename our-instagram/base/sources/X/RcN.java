package X;

/* loaded from: classes10.dex */
public final class RcN extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1CD A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcN(C1CD c1cd, int i, int i2) {
        super(719, 5, false, false);
        this.A02 = c1cd;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A04.markerAnnotate(23396353, this.A01, "NETWORK_RESPONSE_STATUS_CODE", this.A00);
    }
}