package X;

/* renamed from: X.Gkk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37830Gkk extends AbstractRunnableC14200nk {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ C99074cU A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37830Gkk(C1P1 c1p1, C99074cU c99074cU) {
        super(738, 2, true, true);
        this.A00 = c1p1;
        this.A01 = c99074cU;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onSuccessInBackground(this.A01.A01);
    }
}
