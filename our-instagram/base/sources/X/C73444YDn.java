package X;

/* renamed from: X.YDn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73444YDn implements C2JL {
    public final /* synthetic */ Y3S A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        String str = this.A01;
        C0K8.A0G("MldwFederatedAnalyticsLogger", AnonymousClass001.A0g("Failed to register event ", str, " in MLDW"), th);
        Y3S.A00(this.A00, "event.federated.not_processed.register.failed.mldw", str, this.A02);
    }

    public C73444YDn(Y3S y3s, String str, String str2) {
        this.A01 = str;
        this.A00 = y3s;
        this.A02 = str2;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Y3S.A00(this.A00, "event.federated.registered.mldw", this.A01, this.A02);
    }
}
