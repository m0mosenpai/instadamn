package X;

/* loaded from: classes6.dex */
public final class GJ4 implements InterfaceC37205GaG {
    public final /* synthetic */ C72q A00;
    public final /* synthetic */ String A01;

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onFinish() {
    }

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onStart() {
    }

    public GJ4(C72q c72q, String str) {
        this.A00 = c72q;
        this.A01 = str;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        C9GR.A0B(this.A00.A01, "unrestrict_user_failed");
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        C72q c72q = this.A00;
        C75R.A0E(c72q.A02, "impression", "unrestrict_success_toast", this.A01);
        C9GR.A07(c72q.A01, 2131952120);
    }
}
