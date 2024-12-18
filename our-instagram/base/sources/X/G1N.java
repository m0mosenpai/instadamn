package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class G1N implements InterfaceC30993Djs {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public G1N(FragmentActivity fragmentActivity, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC30993Djs
    public final void DFf() {
        AbstractC25227BEk.A1Q(this.A01, false);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC31172DnG.A1H(this.A00.getResources(), A0K, 2131952569);
        A0K.A05();
        A0K.A0H = "request_ai_agent_access_failure";
        AbstractC25233BEq.A1F(A0K);
    }

    @Override // X.InterfaceC30993Djs
    public final void DqO(Integer num) {
        AbstractC25227BEk.A1Q(this.A01, true);
    }
}
