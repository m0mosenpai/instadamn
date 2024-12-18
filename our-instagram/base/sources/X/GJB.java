package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GJB implements InterfaceC37205GaG {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C18920wW A01;
    public final /* synthetic */ C6FQ A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ InterfaceC103384lE A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onFinish() {
    }

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onStart() {
    }

    public GJB(FragmentActivity fragmentActivity, C18920wW c18920wW, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, String str) {
        this.A01 = c18920wW;
        this.A05 = str;
        this.A00 = fragmentActivity;
        this.A02 = c6fq;
        this.A04 = interfaceC103384lE;
        this.A03 = interfaceC103384lE2;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        AbstractC31171DnF.A1K(this.A02, this.A03);
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        C75R.A05(this.A01, null, null, "restrict_account_button", null, this.A05, AbstractC166987dD.A1E());
        FragmentActivity fragmentActivity = this.A00;
        if (AbstractC31172DnG.A0D(fragmentActivity).A0L() <= 1) {
            fragmentActivity.finish();
        }
        AbstractC31171DnF.A1K(this.A02, this.A04);
    }
}
