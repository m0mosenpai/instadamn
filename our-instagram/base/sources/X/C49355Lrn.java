package X;

/* renamed from: X.Lrn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49355Lrn implements MQ7 {
    public final /* synthetic */ C46052Ka7 A00;
    public final /* synthetic */ boolean A01;

    public C49355Lrn(C46052Ka7 c46052Ka7, boolean z) {
        this.A01 = z;
        this.A00 = c46052Ka7;
    }

    @Override // X.MQ7
    public final void onFailure() {
    }

    @Override // X.MQ7
    public final void onSuccess() {
        if (this.A01) {
            C19L c19l = LFw.A02;
            new LFw(AbstractC166987dD.A0r(this.A00.A02)).A00("igd_nudity_detection_model_loading_settings");
        }
        AbstractC25230BEn.A0l(this.A00.A02).A1e(false);
    }
}
