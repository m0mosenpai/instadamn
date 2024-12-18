package X;

/* renamed from: X.BxF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27090BxF extends AbstractRunnableC14200nk {
    public final /* synthetic */ C46912Df A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27090BxF(C46912Df c46912Df, String str) {
        super(299650754, 4, false, false);
        this.A00 = c46912Df;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C46912Df c46912Df = this.A00;
        Boolean hasDbCreatedFlag = c46912Df.hasDbCreatedFlag();
        if (hasDbCreatedFlag != null && !hasDbCreatedFlag.booleanValue()) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c46912Df.A00), "ig_direct_db_drop_detected");
            if (A0f.isSampled()) {
                A0f.AAP("db_name", this.A01);
                A0f.Cht();
            }
            C0K8.A0C("DatabaseDropDetectionCallback", "Database drop was detected.");
            c46912Df.saveConfigToDatabase();
        }
    }
}
