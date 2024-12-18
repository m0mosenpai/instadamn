package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GB7 implements GY7 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C15370ps A02;

    public GB7(FragmentActivity fragmentActivity, UserSession userSession, C15370ps c15370ps) {
        this.A01 = userSession;
        this.A02 = c15370ps;
        this.A00 = fragmentActivity;
    }

    @Override // X.GY7
    public final void onFinished() {
        UserSession userSession = this.A01;
        AbstractC34356FCy.A00(userSession, (EnumC33445EqI) this.A02.A00);
        AbstractC31525Dt9.A08(this.A00, AbstractC31171DnF.A0D("caa_registration"), userSession);
    }
}
