package X;

/* loaded from: classes8.dex */
public final class KMC extends AbstractRunnableC14200nk {
    public final /* synthetic */ MPZ A00;
    public final /* synthetic */ LKn A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMC(MPZ mpz, LKn lKn, String str) {
        super(1741536505, 3, false, false);
        this.A01 = lKn;
        this.A02 = str;
        this.A00 = mpz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LKn.A00(this.A00, this.A01, this.A02);
    }
}
