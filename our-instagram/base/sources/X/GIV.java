package X;

import android.content.Context;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIV implements InterfaceC37203GaE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C31338Dq3 A02;
    public final /* synthetic */ C5HW A03;
    public final /* synthetic */ User A04;

    public GIV(Context context, C31338Dq3 c31338Dq3, C5HW c5hw, User user, int i) {
        this.A02 = c31338Dq3;
        this.A03 = c5hw;
        this.A00 = i;
        this.A04 = user;
        this.A01 = context;
    }

    @Override // X.InterfaceC37203GaE
    public final void D6t() {
        C31338Dq3.A04(this.A02, this.A03, "remove_follower_confirmed", this.A00);
    }

    @Override // X.InterfaceC37203GaE
    public final void DFf() {
        C31338Dq3 c31338Dq3 = this.A02;
        if (C31338Dq3.A05(c31338Dq3)) {
            C193328hC A0I = AbstractC31171DnF.A0I(this.A01);
            A0I.A09(2131974293);
            A0I.A04();
            AbstractC166987dD.A1W(A0I);
        }
        C31338Dq3.A04(c31338Dq3, this.A03, "remove_follower_failed", this.A00);
    }

    @Override // X.InterfaceC37203GaE
    public final void onCancel() {
        C31338Dq3.A04(this.A02, this.A03, "remove_follower_canceled", this.A00);
    }

    @Override // X.InterfaceC37203GaE
    public final void onSuccess() {
        C31338Dq3 c31338Dq3 = this.A02;
        C5HW c5hw = this.A03;
        C31338Dq3.A04(c31338Dq3, c5hw, "remove_follower_success", this.A00);
        this.A04.A10(false);
        C9GR.A08(this.A01, 2131968510, 1);
        if (c5hw.A00 == 101) {
            c31338Dq3.A06.EFq(c5hw, false);
        }
    }
}
