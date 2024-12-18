package X;

import android.content.Context;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GJ9 implements InterfaceC37205GaG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C31338Dq3 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC37205GaG
    public final void onFinish() {
    }

    @Override // X.InterfaceC37205GaG
    public final void onStart() {
    }

    public GJ9(Context context, C31338Dq3 c31338Dq3, User user, String str) {
        this.A01 = c31338Dq3;
        this.A02 = user;
        this.A03 = str;
        this.A00 = context;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        if (C31338Dq3.A05(this.A01)) {
            C193328hC A0I = AbstractC31171DnF.A0I(this.A00);
            A0I.A09(2131974293);
            A0I.A04();
            AbstractC166987dD.A1W(A0I);
        }
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        this.A02.A1B(false);
        C31338Dq3 c31338Dq3 = this.A01;
        int i = C31338Dq3.A0A;
        C75R.A0D(c31338Dq3.A02, "impression", "unrestrict_success_toast", this.A03);
        C9GR.A08(this.A00, 2131952120, 1);
    }
}
