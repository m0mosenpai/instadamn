package X;

/* loaded from: classes6.dex */
public final class GJ5 implements InterfaceC37205GaG {
    public final /* synthetic */ C36006Fv4 A00;
    public final /* synthetic */ String A01;

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onFinish() {
    }

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onStart() {
    }

    public GJ5(C36006Fv4 c36006Fv4, String str) {
        this.A00 = c36006Fv4;
        this.A01 = str;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        C9GR.A0B(this.A00.A02, "unrestricted_user_failed");
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        C36006Fv4 c36006Fv4 = this.A00;
        C75R.A0E(c36006Fv4.A06, "impression", "unrestrict_success_toast", this.A01);
        C9GR.A07(c36006Fv4.A02, 2131952120);
    }
}
