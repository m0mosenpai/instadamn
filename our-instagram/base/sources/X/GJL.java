package X;

import android.content.Context;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GJL implements InterfaceC37142GYd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C31338Dq3 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public GJL(Context context, C31338Dq3 c31338Dq3, User user, String str) {
        this.A01 = c31338Dq3;
        this.A02 = user;
        this.A03 = str;
        this.A00 = context;
    }

    @Override // X.InterfaceC37142GYd
    public final void Dy6(String str) {
        this.A02.A1B(true);
        C31338Dq3 c31338Dq3 = this.A01;
        int i = C31338Dq3.A0A;
        C75R.A0D(c31338Dq3.A02, "impression", "restrict_success_toast", this.A03);
        C9GR.A08(this.A00, 2131952099, 1);
    }
}
